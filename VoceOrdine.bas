B4A=true
Group=Classes
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Public Id As Int
	Public CodArt As String
	Public DescArt As String
	Public IdOrdine As Int
	Public Note As String
	Public Prezzo As Float
	Public Qta As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(vid As Int, vcod As String, vdesc As String, oid As Int, nt As String, prz As Float, q As Int)
	Id = vid
	CodArt = vcod
	DescArt = vdesc
	IdOrdine = oid
	Note = nt
	Prezzo = prz
	Qta = q
End Sub

Public Sub ToMap As Map
	Dim mv As Map
	mv.Initialize
	mv.Put("id", Id)
	mv.Put("codice", CodArt)
	mv.Put("desc_art", DescArt)
	mv.Put("prez_art", Prezzo)
	mv.Put("qta", Qta)
	mv.Put("note", Note)
	
	Return mv
End Sub

Public Sub Totale As Float
	Return Prezzo * Qta
End Sub