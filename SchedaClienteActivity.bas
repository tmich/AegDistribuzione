B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim cli As Cliente
	Dim TabHost1 As TabHost
	Dim ListView1, ListView2, ListView3 As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SchedaClienteLayout")
	TabHost1.AddTab("Scheda", "ListaPreferitiLayout")
	TabHost1.AddTab("Ordini in corso", "ordinincorsolayout")
	TabHost1.AddTab("Storico Ordini", "StoricoOrdiniLayout")
End Sub

Sub VisualizzaScheda(c As Cliente)
	cli = c
	Activity.Title = cli.Denominazione & " " & cli.Indirizzo
	'Label1.Text = cli.Indirizzo
	CaricaPreferiti
End Sub

Sub Activity_Resume
	Select TabHost1.CurrentTab
		Case 0
			CaricaPreferiti
		Case 1
			CaricaOrdiniInCorso
		Case 2
			CaricaStoricoOrdini
		Case Else
			Log("Boh?")
	End Select
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub SingPlur(v As Int) As String
	If v == 1 Then
		Return "a"
	Else
		Return "e"
	End If
End Sub

Private Sub CaricaPreferiti
	Dim preferiti As List = Starter.db.GetPreferitiCliente(cli.Id)
	ListView1.Clear
	
'	ListView1.SingleLineLayout.Label.Gravity = Gravity.TOP
'	ListView1.SingleLineLayout.ItemHeight = 60
'	ListView1.SingleLineLayout.Label.TextColor = Colors.Black
'	ListView1.SingleLineLayout.Label.TextSize = 22
	ListView1.TwoLinesAndBitmap.ItemHeight = 60dip
	ListView1.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	ListView1.TwoLinesAndBitmap.Label.TextSize = 22
	ListView1.TwoLinesAndBitmap.SecondLabel.TextSize = 16
	For Each p As Preferito In preferiti
'		ListView1.AddSingleLine2(p.Descrizione, p)
		ListView1.AddTwoLinesAndBitmap2(p.Descrizione, p.Occorrenze & " volt" & SingPlur(p.Occorrenze), LoadBitmap(File.DirAssets, "stella.png"), p)
	Next
End Sub

Private Sub CaricaStoricoOrdini
	Dim ordini As List = Starter.db.OrdiniPerCliente(cli.Id)
	ListView2.Clear
	ListView2.SingleLineLayout.Label.Gravity = Gravity.TOP
	ListView2.SingleLineLayout.ItemHeight = 60
	ListView2.SingleLineLayout.Label.TextColor = Colors.Black
	ListView2.SingleLineLayout.Label.TextSize = 22
	For Each o As Ordine In ordini
		ListView2.AddSingleLine2("Ordine del " & o.DataFormattata, o)
	Next
End Sub

Private Sub CaricaOrdiniInCorso
	Dim ordini As List = Starter.db.OrdiniInCorsoPerCliente(cli.Id)
	ListView3.Clear
	ListView3.SingleLineLayout.Label.Gravity = Gravity.TOP
	ListView3.SingleLineLayout.ItemHeight = 60
	ListView3.SingleLineLayout.Label.TextColor = Colors.Black
	ListView3.SingleLineLayout.Label.TextSize = 22
	For Each o As Ordine In ordini
		ListView3.AddSingleLine2("Ordine n. " & o.Id, o)
	Next
End Sub

Sub TabHost1_TabChanged
	Select TabHost1.CurrentTab
		Case 0
			CaricaPreferiti
		Case 1
			CaricaOrdiniInCorso	
		Case 2
			CaricaStoricoOrdini
		Case Else
			Log("Boh?")	
	End Select
End Sub

Sub ListView2_ItemClick (Position As Int, Value As Object)
	Dim o As Ordine = Value
	'Msgbox("Ordine n. " & o.Id, "Ordine")
	CallSubDelayed2(DettaglioOrdineActivity, "AggiornaLista", o)
End Sub

Sub BtnNuovo_Click
	Dim o As Ordine = Starter.db.NuovoOrdine(cli)
	CallSubDelayed2(OrdineActivity, "Carica", o)
End Sub

Sub ListView3_ItemClick (Position As Int, Value As Object)
	Dim o As Ordine = Value
	CallSubDelayed2(OrdineActivity, "Carica", o)
End Sub