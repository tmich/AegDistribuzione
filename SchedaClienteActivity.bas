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
	Dim BD As BetterDialogs
	Private lblNessunOrdine As Label
	Dim clessidra, cloud, stella As Bitmap
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SchedaClienteLayout")
	TabHost1.AddTab("Scheda", "ListaPreferitiLayout")
	'TabHost1.AddTab("Ordini in corso", "ordinincorsolayout")
	TabHost1.AddTab("Storico Ordini", "StoricoOrdiniLayout")
	
	clessidra = LoadBitmap(File.DirAssets, "clessidra.png")
	stella = LoadBitmap(File.DirAssets, "stella.png")
	cloud = LoadBitmap(File.DirAssets, "cloud_ok.png")
	'Dim bmp As BitmapDrawable
	'bmp.Initialize(LoadBitmap(File.DirAssets, "done_all_gr.png"))
	'lblNessunOrdine.Background = bmp
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

Private Sub CaricaPreferiti
	Dim preferiti As List = Starter.db.GetPreferitiCliente(cli.Id)
	ListView1.Clear
	ListView1.TwoLinesAndBitmap.ItemHeight = 60dip
	ListView1.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	ListView1.TwoLinesAndBitmap.Label.TextSize = 22
	ListView1.TwoLinesAndBitmap.SecondLabel.TextSize = 16
	For Each p As Preferito In preferiti
		ListView1.AddTwoLinesAndBitmap2(p.Descrizione, p.Occorrenze & " volt" & Utils.SingPlur(p.Occorrenze), stella, p)
	Next
End Sub

Private Sub CaricaStoricoOrdini
	Dim ordini As List = Starter.db.OrdiniPerCliente(cli.Id)
	ListView2.Clear
	ListView2.TwoLinesAndBitmap.Label.Gravity = Gravity.TOP
	ListView2.SingleLineLayout.ItemHeight = 60
	ListView2.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	ListView2.TwoLinesAndBitmap.Label.TextSize = 22
	'Dim bmp As Bitmap = LoadBitmap(File.DirAssets, "cloud_ok.png")
	For Each o As Ordine In ordini
		ListView2.AddTwoLinesAndBitmap2("Ordine n. " & o.Id & " inviato il " & o.DataFormattata, _
				o.Voci.Size & " pezz" & Utils.SingPlurM(o.Voci.Size) & TAB & NumberFormat2(o.Totale, 1, 2, 2, False) & " €", _
				cloud, o)
	Next
End Sub

Private Sub CaricaOrdiniInCorso
	Dim ordini As List = Starter.db.OrdiniInCorsoPerCliente(cli.Id)
	'Dim height As Int = 60dip
	lvOrdiniInCorso.Clear
	lvOrdiniInCorso.Enabled = True
	'lvOrdiniInCorso.Height = height
	'TabHost1.Height = 844dip
	'lvOrdiniInCorso.SingleLineLayout.Label.Gravity = Gravity.TOP
	
	If ordini.Size = 0 Then
		NessunOrdineInCorso
		Return
	End If
	
	Sleep(100)
	lblNessunOrdine.Visible = False
	lvOrdiniInCorso.TwoLinesAndBitmap.ItemHeight = 60dip
	lvOrdiniInCorso.TwoLinesAndBitmap.Label.TextSize = 22
	lvOrdiniInCorso.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	'Dim bmp As Bitmap = LoadBitmap(File.DirAssets, "clessidra.png")
	For Each o As Ordine In ordini
		Dim riga2 As String = o.Voci.Size & " pezzi " & TAB & NumberFormat2(o.Totale, 1, 2, 2, False) & " €"
		If o.Note <> Null Then
			riga2 = riga2 & TAB & TAB & "Note: " & o.Note
		End If
		lvOrdiniInCorso.AddTwoLinesAndBitmap2("Ordine n. " & o.Id, riga2 , clessidra, o)
	Next
End Sub

Private Sub NessunOrdineInCorso
	lblNessunOrdine.Visible = True
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

' Preferiti
Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim p As Preferito = Value
	Dim a As Articolo = Starter.db.GetArticolo(p.IdArt)
	Dim o As Ordine
	Dim in_corso As List
		
	Dim dlgp As BD_CustomDlgParams
	Dim spQta As Spinner
	spQta.Initialize("Spqta")
	For q = 1 To 30
		spQta.Add(q)
	Next
	dlgp.Initialize
	dlgp.Title = "<b>Quantità</b>"
	dlgp.BodyHeight = 80dip
	dlgp.TitleHeight = 30dip
	dlgp.TitleWidth = 120dip
	dlgp.BodyWidth = 300dip
	dlgp.DialogBody = spQta
	dlgp.PositiveButton = "Ok"
	dlgp.CancelButton = "Annulla"
	Dim i As Int = BD.CustomDialog(dlgp, "")
	
	If i = DialogResponse.POSITIVE Then
		
		in_corso = Starter.db.OrdiniInCorsoPerCliente(cli.Id)
		If in_corso.Size = 0 Then
			o = Starter.db.NuovoOrdine(cli)
		Else If in_corso.Size = 1 Then
			'o = lvOrdiniInCorso.GetItem(0)
			o = in_corso.Get(0)
		Else
			' Più di un ordine aperto, non decido ed esco
			Return
		End If
		
		Dim qta As Int = spQta.SelectedItem
		If Not(o.Contiene(a)) Then
			Dim v As VoceOrdine = Starter.db.NuovaVoce(o, a.Codice, a.Descrizione, qta, a.Prezzo, "")
			o.Aggiungi(v)
			lvOrdiniInCorso.SetColorAnimated(1000, Colors.White, Colors.Green)
			lvOrdiniInCorso.SetColorAnimated(1000, Colors.Green, Colors.White)
			CaricaOrdiniInCorso
		Else
			ToastMessageShow("Articolo già presente", False)
		End If
	End If
End Sub