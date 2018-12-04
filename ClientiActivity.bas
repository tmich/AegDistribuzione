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
	Dim lvClienti As ListView
	Dim txCerca As EditText
	Dim btnCerca As Button
	Dim btnAnnulla As Button
	Dim Label1 As Label
	Dim oIme As IME
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
	Dim cli As Cliente = Value
	CallSubDelayed2(SchedaClienteActivity, "VisualizzaScheda", cli)
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