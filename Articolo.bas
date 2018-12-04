B4A=true
Group=Classes
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Public Id As Int
	Public Codice As String
	Public Descrizione As String
	Public Prezzo As Float
	Public DataUltimaModifica As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(aId As Int, cod As String, descr As String, prz As Float, dum As String)
	Id=aId
	Codice=cod
	Descrizione=descr
	Prezzo=prz
	DataUltimaModifica=dum	
End Sub