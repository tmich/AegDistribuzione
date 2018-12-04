B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Public Id As Int
	Public IdCliente As Int
	Public IdUtente As Int
	Public DataInvio As String
	Public Note As String
	Public Voci As List
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(oid As Int, cid As Int, uid As Int, dtinv As String, nt As String)
	Id=oid
	IdCliente = cid
	IdUtente = uid
	DataInvio = dtinv
	Note = nt
	Voci.Initialize
End Sub

Public Sub getDataFormattata As String
	Return DataInvio
	
'	Dim ticks As Long = getDataInvioTicks
'	Dim strDate As StringBuilder
'	strDate.Initialize
'	strDate.Append(DateTime.GetDayOfMonth(ticks)).Append("-").Append(DateTime.GetMonth(ticks)).Append("-")
'	strDate.Append(DateTime.GetYear(ticks)).Append(" ").Append(DateTime.GetHour(ticks)).Append(":")
'	strDate.Append(DateTime.GetMinute(ticks))
'	Return strDate.ToString
End Sub

Public Sub getDataInvioTicks As Long
	DateTime.DateFormat="dd/MM/yyyy HH:mm:ss"
	'03/12/2018 02:29:14
	Return DateTime.DateParse(DataInvio)
End Sub

Public Sub Totale As Float
	Dim tot As Float = 0.0F
	For Each v As VoceOrdine In Voci
		tot = tot + v.Totale
	Next
	
	Return tot
End Sub

Public Sub NumVoci As Int
	Return Voci.Size
End Sub