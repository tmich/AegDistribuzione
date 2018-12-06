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

	Private lvOrdiniInCorso As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("OrdiniInCorsoLayout")
End Sub

Sub Activity_Resume
	Aggiorna
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Aggiorna
	Dim ordini As List = Starter.db.OrdiniInCorso
	lvOrdiniInCorso.Clear
	lvOrdiniInCorso.TwoLinesAndBitmap.ItemHeight = 60dip
	lvOrdiniInCorso.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	lvOrdiniInCorso.TwoLinesAndBitmap.Label.TextSize = 22
	Dim bmp As Bitmap = LoadBitmap(File.DirAssets, "clessidra.png")
	For Each o As Ordine In ordini
		Dim cli As Cliente = Starter.db.GetCliente(o.IdCliente)
		lvOrdiniInCorso.AddTwoLinesAndBitmap2(cli.Denominazione & ": ordine n. " & o.Id, _
				o.Voci.Size & " pezzi " & TAB & NumberFormat2(o.Totale, 1, 2, 2, False) & " €", _
				bmp, o)
	Next
	
	If lvOrdiniInCorso.Size = 0 Then
		lvOrdiniInCorso.AddSingleLine("Nessun ordine in attesa")
	End If
End Sub

Sub lvOrdiniInCorso_ItemClick (Position As Int, Value As Object)
	Dim o As Ordine = Value
	CallSubDelayed2(OrdineActivity, "Carica", o)
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
				Aggiorna
				ToastMessageShow("Ordine eliminato", False)
			Catch
				ToastMessageShow("Si è verificato un errore: " & LastException.Message, False)
				Log(LastException)
			End Try
		End If
	End If
End Sub

Sub btnAggiorna_Click
	ProgressDialogShow2("Aggiornamento in corso", False)
	Aggiorna
	ProgressDialogHide
End Sub