B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Public IdArt As Int
	Public Codice As String
	Public Descrizione As String
	Public IdCliente As Int
	Public Occorrenze As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(aId As Int, cod As String, descr As String, cid As Int, occ As Int)
	IdArt = aId
	Codice = cod
	Descrizione = descr
	IdCliente = cid
	Occorrenze = occ
End Sub