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
	Dim lvArticoli As ListView
	Dim txCerca As EditText
	Dim btnCerca As Button
	Dim btnAnnulla As Button
	Dim Label1 As Label
	Dim oIme As IME
	Dim forResult As Boolean
End Sub

Public Sub ScegliArticoloPerOrdine()
	forResult = True
	If lvArticoli.Size == 0 Then
		AggiornaLista(Starter.db.GetArticoli())
	End If
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ArticoliLayout")
	forResult = False
	oIme.Initialize("Keyboard")
End Sub

Sub Activity_Resume
	AggiornaLista(Starter.db.GetArticoli())
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub AggiornaLista(articoli As List)
	lvArticoli.Clear
	lvArticoli.TwoLinesLayout.ItemHeight = 70
	lvArticoli.TwoLinesLayout.Label.TextColor = Colors.Black
	lvArticoli.TwoLinesLayout.Label.TextSize = 22
	lvArticoli.TwoLinesLayout.SecondLabel.TextSize = 16
	For Each a As Articolo In articoli
		lvArticoli.AddTwoLines2(a.Descrizione, NumberFormat2(a.Prezzo, 0, 2, 2, False) & " €", a)
	Next
End Sub

Sub btnAggiorna_Click
	ProgressDialogShow2("Aggiornamento in corso", False)
	Wait For (Starter.client.ScaricaArticoli) Complete (Result As List)
	If Starter.client.Successo Then
		If Result.Size > 0 Then
			Starter.db.SalvaArticoli(Result)
			AggiornaLista(Starter.db.GetArticoli())
		End If
	End If
	ProgressDialogHide()
End Sub

Sub txCerca_TextChanged (Old As String, New As String)
	AggiornaLista(Starter.db.CercaArticoliPerNome(New))
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
	AggiornaLista(Starter.db.GetArticoli())
End Sub

Sub lvArticoli_ItemClick (Position As Int, Value As Object)
	Dim art As Articolo = Value
	oIme.HideKeyboard
	If forResult Then
		forResult = False
		CallSubDelayed2(OrdineActivity, "GetResult", art)
		Activity.Finish()
	Else
		Msgbox(art.Descrizione, "Articolo")
	End If
End Sub