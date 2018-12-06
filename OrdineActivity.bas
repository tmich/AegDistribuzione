B4A=true
Group=Activities
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim m_ordine As Ordine
	Dim m_cliente As Cliente
	Dim Label1 As B4XView
	Dim Label2 As B4XView
	Dim Label3 As B4XView
	Dim lblCliente As Label
	Dim lblIndirizzo As Label
	Private clv2 As CustomListView
	Private Spinner1 As Spinner
	Private Button1 As B4XView
	Private lblOrdine As Label
	Private lblTotale As Label
	Private btnInvia As Button
	Dim BD As BetterDialogs
	Dim btnNotaOrdine As Button
End Sub

Sub CreateListItem(Text As String, Qta As Int, Prezzo As Float, Note As String, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayout(0, 0, Width, Height)
	p.LoadLayout("CellItem")
	Label1.Text = Text
	Label2.Text = NumberFormat2(Prezzo, 1, 2, 2, False) & " €"
	Label3.Text = Note
	For i = 1 To 30
		Spinner1.Add(i)
		If i == Qta - 1 Then
			Spinner1.SelectedIndex = i
		End If
	Next
	Return p
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("OrdineLayout")
End Sub

Sub Activity_Resume
	'Aggiorna
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Public Sub Carica(ord As Ordine)
	m_ordine = ord
	m_cliente = Starter.db.GetCliente(m_ordine.IdCliente)
	Aggiorna
End Sub

Private Sub CaricaVoci()
	clv2.Clear
	For Each v As VoceOrdine In m_ordine.Voci
		clv2.Add(CreateListItem(v.DescArt, v.Qta, v.Prezzo, v.Note, clv2.AsView.Width, 70dip), v)
	Next
End Sub

Sub clv2_ItemClick(Index As Int, Value As Object)
	clv2.AsView.BringToFront
	Dim v As VoceOrdine = Value
	'Input box
	Dim IP As BD_InputBoxParams
	IP.Initialize
	IP.Question = "<I>Note</I>"
	IP.QuestionTextSize = 18
	IP.SpaceBetween = 4dip
	IP.InputTextSize = 24
	IP.InputType = IP.INPUT_TYPE_TEXT_WITH_CAPS
	IP.Default = v.Note
	IP.Gravity = Gravity.CENTER_VERTICAL + Gravity.CENTER_HORIZONTAL
	'IP.ValidationCallback = "Input_Validation"
	'IP.WithSuggestions = True
	Dim DR As Int = BD.InputBox(v.DescArt, IP, "Salva", "Annulla", "", Null)
	If DR = DialogResponse.POSITIVE Then
		v.Note = IP.Answer
		Starter.db.SalvaVoceOrdineInCorso(v)
		Aggiorna
		ToastMessageShow("Nota salvata", False)
	End If
	
End Sub

Sub Aggiorna
	m_ordine = Starter.db.GetOrdineInCorso(m_ordine.Id)
	lblCliente.Text = m_cliente.Denominazione
	lblIndirizzo.Text = m_cliente.Indirizzo
	lblOrdine.Text = "Ordine n° " & m_ordine.Id
	CaricaVoci
	btnInvia.Enabled = (m_ordine.Voci.Size > 0)
	lblTotale.Text = NumberFormat2(m_ordine.Totale, 1, 2, 2, False) & " €"
	If m_ordine.Note <> Null Then
		If m_ordine.Note.Trim.Length > 0 Then
			btnNotaOrdine.TextColor = Colors.Red
		Else
			btnNotaOrdine.TextColor = Colors.Black
		End If
	End If
End Sub

Sub btnAggiungi_Click
	CallSubDelayed(ArticoliActivity, "ScegliArticoloPerOrdine")
End Sub

Sub GetResult(Result As Articolo)
	'Dim v As VoceOrdine = Starter.db.NuovaVoce(m_ordine, Result.Codice, Result.Descrizione, 1, Result.Prezzo, "")
	'm_ordine.Voci.Add(v)
	If m_ordine.Aggiungi(Result, 1, "") == False Then
		ToastMessageShow("Articolo già presente", False)
		Return
	End If
	Aggiorna
End Sub

Sub Spinner1_ItemClick (Position As Int, Value As Object)
	Dim index As Int = clv2.GetItemFromView(Sender)
	Dim v As VoceOrdine = clv2.GetValue(index)
	v.Qta = Value
	Starter.db.AggiornaVoce(v)
	Aggiorna
End Sub

Sub btnInvia_LongClick
	Msgbox2Async("Inviare l'ordine?", "Invio", "Invia", "Annulla", "", Null, True)
	Wait For MsgBox_Result (iResult As Int)
	
	If iResult == DialogResponse.POSITIVE Then
		ProgressDialogShow2("Invio in corso", False)
		Wait For (Starter.client.Invia(m_ordine)) Complete (Result As Ordine)
		If Starter.client.Successo Then
			If Result <> Null Then
				Starter.db.SalvaOrdine(Result)
				Starter.db.EliminaOrdineInCorso(m_ordine.Id)
				
				wait for (Starter.client.StoricoOrdiniPerCliente(m_cliente.Id)) Complete (Storico As List)
				If Starter.client.Successo Then
					Starter.db.SalvaStoricoOrdiniPerCliente(Storico, m_cliente.Id)
				End If
				
				Wait For (Starter.client.ScaricaPreferitiPerCliente(m_cliente.Id)) Complete (Preferiti As List)
				If Starter.client.Successo Then
					Starter.db.SalvaPreferitiPerCliente(Preferiti, m_cliente.Id)
				End If
								
				ProgressDialogHide()
				ToastMessageShow("Ordine inviato correttamente", True)
				Activity.Finish
			Else
				Msgbox("C'è stato un problema con l'invio dell'ordine: " & Starter.client.Errore, "Attenzione")
			End If
		Else
			Msgbox("C'è stato un problema con l'invio dell'ordine: " & Starter.client.Errore, "Attenzione")
		End If
	End If
End Sub

Sub btnPrezzo_Click
	clv2.AsView.BringToFront
	Dim index As Int = clv2.GetItemFromView(Sender)
	Dim v As VoceOrdine = clv2.GetValue(index)
	'Input box
	Dim IP As BD_InputBoxParams
	IP.Initialize
	IP.Question = "<I>Prezzo</I>"
	IP.QuestionTextSize = 18
	IP.SpaceBetween = 4dip
	IP.InputTextSize = 24
	IP.InputType = IP.INPUT_TYPE_DECIMAL_NUMBERS
	IP.Default = NumberFormat2(v.Prezzo, 1, 2, 2, False)
	IP.Gravity = Gravity.CENTER_VERTICAL + Gravity.CENTER_HORIZONTAL
	'IP.ValidationCallback = "Input_Validation"
	'IP.WithSuggestions = True
	Dim DR As Int = BD.InputBox(v.DescArt, IP, "Salva", "Annulla", "Originale", Null)
	If DR = DialogResponse.POSITIVE Then
		' Prezzo modificato
		If IP.Answer.Trim = "" Then Return
		v.Prezzo = IP.Answer
		ToastMessageShow("Prezzo salvato", False)
	Else If DR = DialogResponse.NEGATIVE Then
		' Originale
		Dim art As Articolo = Starter.db.GetArticoloPerCodice(v.CodArt)
		If art <> Null Then
			Dim przOrig As Float = art.Prezzo
			v.Prezzo = przOrig
		End If
	Else	' Annulla
		Return
	End If
	
	Starter.db.SalvaVoceOrdineInCorso(v)
	Aggiorna
End Sub

Sub btnElimina_Click
	Dim index As Int = clv2.GetItemFromView(Sender)
	Dim v As VoceOrdine = clv2.GetValue(index)
	
	Msgbox2Async("Eliminare " & v.DescArt & "?", "Elimina", "Elimina", "Annulla", "", Null, True)
	Wait For MsgBox_Result (iResult As Int)
	
	If iResult == DialogResponse.POSITIVE Then
		Starter.db.EliminaVoce(v.Id)
		m_ordine = Starter.db.GetOrdineInCorso(m_ordine.Id)
		Aggiorna
	End If
End Sub

Sub btnNotaOrdine_Click
	Dim IP As BD_InputBoxParams
	IP.Initialize
	IP.Question = "<I>Note</I>"
	IP.QuestionTextSize = 18
	IP.SpaceBetween = 4dip
	IP.InputTextSize = 24
	IP.InputType = IP.INPUT_TYPE_TEXT_WITH_CAPS
	If m_ordine.Note <> Null Then IP.Default = m_ordine.Note
	IP.Gravity = Gravity.CENTER_VERTICAL + Gravity.CENTER_HORIZONTAL
	'IP.ValidationCallback = "Input_Validation"
	'IP.WithSuggestions = True
	Dim DR As Int = BD.InputBox("Ordine n° " & m_ordine.Id, IP, "Salva", "Annulla", "", Null)
	If DR = DialogResponse.POSITIVE Then
		m_ordine.Note = IP.Answer.Trim
		Starter.db.SalvaOrdineInCorso(m_ordine)
		Aggiorna
		ToastMessageShow("Nota salvata", False)
	End If
End Sub