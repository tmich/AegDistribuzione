B4A=true
Group=Classes
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Public Id As Int
	Public Nome As String
	Public UltimoAccesso As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(uid As Int, nom As String, uac As String)
	Id=uid
	Nome=nom
	UltimoAccesso=uac	
End Sub