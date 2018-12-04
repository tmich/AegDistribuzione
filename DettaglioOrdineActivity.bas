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

	Private Label1 As Label
	Private ListView1 As ListView
	Private Label2 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DettaglioOrdineLayout")
End Sub

Sub AggiornaLista(o As Ordine)
	Dim c As Cliente = Starter.db.GetCliente(o.IdCliente)
	Activity.Title = "Ordine n " & o.Id & " per " & c.Denominazione
	Label1.Text = "Ordine n " & o.Id & " del " & o.DataFormattata
	Label2.Text = "Totale: " & NumberFormat2(o.Totale, 0, 2, 2, False)
	For Each v As VoceOrdine In o.Voci
		ListView1.FastScrollEnabled=True
		ListView1.SingleLineLayout.Label.TextColor = Colors.Black
		ListView1.SingleLineLayout.Label.TextSize = 18
		ListView1.AddSingleLine(v.Qta & "x "  & v.DescArt & " (" & NumberFormat2(v.Prezzo, 0, 2, 2, False) & ")")
	Next
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
