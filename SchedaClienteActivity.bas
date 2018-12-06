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
	Dim cli As Cliente
	Dim TabHost1 As TabHost
	Dim ListView1, ListView2, lvOrdiniInCorso As ListView
	Private pnlOrdiniInCorso As Panel
	Private Label1, Label2 As Label
	'Dim apertoOrdine As Boolean
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SchedaClienteLayout")
	TabHost1.AddTab("Scheda", "ListaPreferitiLayout")
	'TabHost1.AddTab("Ordini in corso", "ordinincorsolayout")
	TabHost1.AddTab("Storico Ordini", "StoricoOrdiniLayout")
End Sub

Sub VisualizzaScheda(c As Cliente)
	cli = c
	Label1.Text  = cli.Denominazione
	Label2.Text  = cli.Indirizzo
	CaricaPreferiti
	CaricaOrdiniInCorso
	CaricaStoricoOrdini
End Sub

Sub Activity_Resume
	CaricaOrdiniInCorso
	CaricaPreferiti
	CaricaStoricoOrdini
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
	'Dim height As Int = 60dip
	lvOrdiniInCorso.Clear
	'lvOrdiniInCorso.Height = height
	'TabHost1.Height = 844dip
	'lvOrdiniInCorso.SingleLineLayout.Label.Gravity = Gravity.TOP
	lvOrdiniInCorso.TwoLinesAndBitmap.ItemHeight = 60dip
	lvOrdiniInCorso.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	lvOrdiniInCorso.TwoLinesAndBitmap.Label.TextSize = 22
	Dim bmp As Bitmap = LoadBitmap(File.DirAssets, "clessidra.png")
	For Each o As Ordine In ordini
		'lvOrdiniInCorso.Height = lvOrdiniInCorso.Height + 60dip
		'TabHost1.Height = TabHost1.Height - height
		lvOrdiniInCorso.AddTwoLinesAndBitmap2("Ordine n. " & o.Id, _
				o.Voci.Size & " pezzi " & TAB & NumberFormat2(o.Totale, 1, 2, 2, False) & " €", _
				bmp, o)
	Next
	
	pnlOrdiniInCorso.Visible = (lvOrdiniInCorso.Size > 0)
	
	'If lvOrdiniInCorso.Size = 0 Then
	'	lvOrdiniInCorso.AddSingleLine("Nessun ordine in attesa")
	'End If
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

Sub AggiornaSchedaCliente
	ProgressDialogShow2("Aggiornamento in corso", False)
	
	' Scheda cliente
	Wait For (Starter.client.ScaricaPreferitiPerCliente(cli.Id)) Complete (Result As List)
	If Starter.client.Successo Then
		If Result.Size > 0 Then
			Starter.db.SalvaPreferitiPerCliente(Result, cli.Id)
			CaricaPreferiti
		End If
	End If
	
	' Storico ordini
	Wait For (Starter.client.StoricoOrdiniPerCliente(cli.Id)) Complete (Result As List)
	If Starter.client.Successo Then
		If Result.Size > 0 Then
			Starter.db.SalvaStoricoOrdiniPerCliente(Result, cli.Id)
			CaricaStoricoOrdini
		End If
	End If
	
	ProgressDialogHide()
End Sub

Sub btnAggiorna_Click
	AggiornaSchedaCliente
End Sub

Sub lvOrdiniInCorso_ItemLongClick (Position As Int, Value As Object)
	Dim o As Ordine = Value
	Dim popupMenu As id
	Dim voci As List
	voci.Initialize
	voci.AddAll(Array As String("Elimina"))
	Dim m As Int = popupMenu.InputList1(voci, "Ordine n. " & o.Id)
	If m = 0 Then
		Msgbox2Async("Eliminare l'ordine n° " & o.Id & "?", "Attenzione", "Elimina ordine", "Annulla", "", Null, True)
		
		Wait For Msgbox_Result (Result As Int)
		If Result = DialogResponse.POSITIVE Then
			Try
				Starter.db.EliminaOrdineInCorso(o.Id)
				CaricaOrdiniInCorso
				ToastMessageShow("Ordine eliminato", False)
			Catch
				ToastMessageShow("Si è verificato un errore: " & LastException.Message, False)
				Log(LastException)
			End Try
		End If
	End If
End Sub

Sub lvOrdiniInCorso_ItemClick (Position As Int, Value As Object)
	Dim ord As Ordine = Value
	'apertoOrdine = True
	CallSubDelayed2(OrdineActivity, "Carica", ord)
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim p As Preferito = Value
	Dim a As Articolo = Starter.db.GetArticolo(p.IdArt)
	Dim o As Ordine
	If lvOrdiniInCorso.Size = 0 Then
		o = Starter.db.NuovoOrdine(cli)
	Else If lvOrdiniInCorso.Size = 1 Then
		o = lvOrdiniInCorso.GetItem(0)
	Else
		Return
	End If
	
	If o.Aggiungi(a, 1, "") Then
		' ToastMessageShow("Articolo aggiunto all'ordine " & o.Id, False)
		lvOrdiniInCorso.SetColorAnimated(1000, Colors.White, Colors.Green)
		lvOrdiniInCorso.SetColorAnimated(1000, Colors.Green, Colors.White)
		CaricaOrdiniInCorso
	Else
		ToastMessageShow("Articolo già presente", False)
	End If
End Sub