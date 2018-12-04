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
	Dim lvClienti As ListView
	Dim txCerca As EditText
	Dim btnCerca As Button
	Dim btnAnnulla As Button
	Dim Label1 As Label
	Dim oIme As IME
	Dim BD As BetterDialogs
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ClientiLayout")
	oIme.Initialize("Keyboard")
End Sub

Sub AggiornaLista(clienti As List)
	lvClienti.Clear
	lvClienti.TwoLinesAndBitmap.ItemHeight = 60dip
	lvClienti.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	lvClienti.TwoLinesAndBitmap.Label.TextSize = 22
	lvClienti.TwoLinesAndBitmap.SecondLabel.TextSize = 16
	
	' Aggiunta cliente fittizio
	lvClienti.AddTwoLinesAndBitmap2("Crea cliente fittizio", "", LoadBitmap(File.DirAssets, "persona_piu.png"), 0)
	
	For Each c As Cliente In clienti
		lvClienti.AddTwoLinesAndBitmap2(c.Denominazione, c.Indirizzo, LoadBitmap(File.DirAssets, "persona.png"), c)
	Next
End Sub

Sub Activity_Resume
	If txCerca.Visible Then
		AggiornaLista(Starter.db.CercaClientiPerNome(txCerca.Text))
	Else
		AggiornaLista(Starter.db.GetClienti())		
	End If
	
	If lvClienti.Size == 0 Then
		lvClienti.SingleLineLayout.ItemHeight = 90
		lvClienti.SingleLineLayout.Label.TextColor = Colors.DarkGray
		lvClienti.SingleLineLayout.Label.Typeface = Typeface.CreateNew(Typeface.DEFAULT, Typeface.STYLE_BOLD_ITALIC)
		lvClienti.AddSingleLine("Nessun cliente in lista. Aggiornare i clienti.")
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub


Sub lvClienti_ItemClick (Position As Int, Value As Object)
	If Value == 0 Then
		'Input box
		Dim IP As BD_InputBoxParams
		IP.Initialize
		IP.Question = "<I>Nome</I>"
		IP.QuestionTextSize = 18
		IP.SpaceBetween = 4dip
		IP.InputTextSize = 24
		IP.InputType = IP.INPUT_TYPE_TEXT_WITH_CAPS
		IP.Gravity = Gravity.CENTER_VERTICAL + Gravity.CENTER_HORIZONTAL
		IP.ValidationCallback = "Input_Validation"
		IP.WithSuggestions = True
		
		Dim DR As Int = BD.InputBox("Cliente fittizio", IP, "Salva", "Annulla", Null, Null)
		If DR = DialogResponse.POSITIVE Then
			Log(IP.Answer)
			Log(IP.CompactAnswer)
			Dim c As Cliente
			c.Initialize(0, "", IP.Answer, "VIA", 00000, Null)
			Starter.client.CreaCliente(c, 1)
		End If
	Else
		Dim cli As Cliente = Value
		CallSubDelayed2(SchedaClienteActivity, "VisualizzaScheda", cli)
	End If
End Sub

Sub txCerca_TextChanged (Old As String, New As String)
	AggiornaLista(Starter.db.CercaClientiPerNome(New))
End Sub

Sub btnCerca_Click
	Label1.Visible = False
	txCerca.Visible = True
	oIme.ShowKeyboard(txCerca)
	btnCerca.Visible = False
	btnAnnulla.Visible = True
End Sub

Sub btnAnnulla_Click
	txCerca.Visible = False
	btnCerca.Visible = True
	btnAnnulla.Visible = False
	txCerca.Text = ""
	oIme.HideKeyboard
	Label1.Visible = True
	AggiornaLista(Starter.db.GetClienti())
End Sub

Sub btnAggiorna_Click
	ProgressDialogShow2("Aggiornamento in corso", False)
	Wait For (Starter.client.ScaricaClienti) Complete (Result As List)
	If Starter.client.Successo Then
		If Result.Size > 0 Then
			Starter.db.SalvaClienti(Result)
			AggiornaLista(Starter.db.GetClienti())
		End If
	End If
	ProgressDialogHide()
End Sub