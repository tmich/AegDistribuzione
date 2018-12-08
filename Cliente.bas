B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Public Id As Int
	Public Codice As String
	Public Denominazione As String
	Public Indirizzo As String
	Public PartitaIVA As String
	Public DataUltimaModifica As String
	Public Ordini As List
	Public Fittizio As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(cId As Int, Cod As String, Denom As String, Indir As String, Iva As String, dtum As String)
	Id = cId
	Codice = Cod
	Denominazione = Denom
	Indirizzo = Indir
	PartitaIVA = Iva
	DataUltimaModifica = dtum
	Fittizio = False
	Ordini.Initialize
	If Cod.StartsWith("$FITTIZIO$") Then Fittizio = True
End Sub