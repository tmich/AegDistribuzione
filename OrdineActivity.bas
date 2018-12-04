B4A=true
Group=Default Group
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
	Dim lblCliente As Label
	Dim lblIndirizzo As Label
	Private clv2 As CustomListView
	Private Spinner1 As Spinner
	Private Button1 As B4XView
	Private lblOrdine As Label
	Private lblTotale As Label
	Private btnInvia As Button
End Sub

Sub CreateListItem(Text As String, Qta As Int, Prezzo As Float, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayout(0, 0, Width, Height)
	p.LoadLayout("CellItem")
	Label1.Text = Text
	Label2.Text = NumberFormat2(Prezzo, 0, 2, 2, False) & " €"
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

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Public Sub Carica(ord As Ordine)
	m_ordine = ord
	m_cliente = Starter.db.GetCliente(m_ordine.IdCliente)
	lblCliente.Text = m_cliente.Denominazione
	lblIndirizzo.Text = m_cliente.Indirizzo
	lblOrdine.Text = "Ordine n° " & m_ordine.Id
	lblTotale.Text = NumberFormat2(m_ordine.Totale, 0, 2, 2, False) & " €"
	CaricaVoci
End Sub

Private Sub CaricaVoci()
	clv2.Clear
	For Each v As VoceOrdine In m_ordine.Voci
		clv2.Add(CreateListItem(v.DescArt, v.Qta, v.Prezzo, clv2.AsView.Width, 100dip), v.Id)
	Next
End Sub

Sub clv2_ItemClick(Index As Int, Value As Object)
	clv2.AsView.BringToFront
	Log(Index & " = " & Value)
	
	'clv2.InsertAt(Index, CreateListItem($"Item !!!"$, clv2.AsView.Width, 60dip), $"Item !!!"$)
End Sub

Sub Button1_Click
	Dim index As Int = clv2.GetItemFromView(Sender)
	Dim id_voce As Int = clv2.GetValue(index)
	Dim v As VoceOrdine = Starter.db.GetVoce(id_voce)
	' Msgbox("Item value: " & clv2.GetValue(index), "Clicked")
	
	Msgbox2Async("Eliminare " & v.DescArt & "?", "Elimina", "Elimina", "Annulla", "", Null, True) 
	Wait For MsgBox_Result (iResult As Int)
	
	If iResult == DialogResponse.POSITIVE Then
		Starter.db.EliminaVoce(id_voce)
		m_ordine = Starter.db.GetOrdineInCorso(m_ordine.Id)
		Aggiorna
	End If
End Sub

Sub Aggiorna
	m_ordine = Starter.db.GetOrdineInCorso(m_ordine.Id)
	CaricaVoci
	btnInvia.Enabled = (m_ordine.Voci.Size > 0)
	lblTotale.Text = NumberFormat2(m_ordine.Totale, 0, 2, 2, False) & " €"
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
	Dim id_voce As Int = clv2.GetValue(index)
	Dim v As VoceOrdine = Starter.db.GetVoce(id_voce)
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