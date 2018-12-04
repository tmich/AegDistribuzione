B4A=true
Group=Classes
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

'Public Sub CreateNew
'	Id=0
'	IdCliente = 0
'	IdUtente = 0
'	DataInvio = ""
'	Note = ""
'	Voci.Initialize
'End Sub

'Public Sub Initialize2
'	Id=0
'	IdCliente = 0
'	IdUtente = 0
'	DataInvio = ""
'	Note = ""
'End Sub

Public Sub Contiene(art As Articolo) As Boolean
	For Each v As VoceOrdine In Voci
		If v.CodArt == art.Codice Then
			Return True
		End If
	Next
	
	Return False
End Sub

Public Sub Aggiungi(art As Articolo, qta As Int, nt As String) As Boolean
	Dim cnt As Boolean = Contiene(art)
	If Not(cnt) Then
		Dim v As VoceOrdine = Starter.db.NuovaVoce(Me, art.Codice, art.Descrizione, qta, art.Prezzo, nt)
		Voci.Add(v)
	End If
	
	Return Not(cnt)
End Sub

Public Sub FromJson(jsonString As String)
	Dim parser As JSONParser
	parser.Initialize(jsonString)
	Dim root As Map = parser.NextObject
	Dim m As Map = root.Get("data")

	Id = m.Get("id")
	IdCliente = m.Get("id_cliente")
	IdUtente = m.Get("id_utente")
	DataInvio = m.Get("data_invio")
	Note = m.Get("note")
	'Voci.Initialize
	
	Dim righe As List = m.Get("righe")
	For Each r As Map In righe
		Dim v As VoceOrdine
		Dim vId As Int = r.Get("id")
		Dim cod As String = r.Get("cod_art")
		Dim desc As String = r.Get("desc_art")
		Dim vNote As String = r.Get("note")
		Dim prezzo As Float = r.Get("prez_art")
		Dim qta As Int = r.Get("qta")
		v.Initialize(vId, cod, desc, Id, vNote, prezzo, qta)
		Voci.Add(v)
	Next
End Sub

Public Sub getDataFormattata As String
	Return DataInvio
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

Public Sub ToJson As String
	Dim m As Map
	Dim js As JSONGenerator
	Dim righe As List
	righe.Initialize
	m.Initialize
	
	For Each v As VoceOrdine In Voci
		Dim mv As Map = v.ToMap
		mv.Remove("id")
		righe.Add(mv)
	Next
		
	m.Put("righe", righe)
	js.Initialize(m)
	Log(js.ToPrettyString(4))
	Return js.ToString()
End Sub