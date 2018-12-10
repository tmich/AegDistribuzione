B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Private m_id As Int
	Private m_idCliente As Int
	Private m_idUtente As Int
	Private m_dataInvio As String
	Private m_note As String
	Private m_voci As List
	Private m_codcliente As String
	Private m_denom As String
	Private m_indir As String
	Private m_iva As String
	Private m_utente As String
	Private m_voci As List
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(oid As Int, cid As Int, uid As Int, dtinv As String, nt As String, cod_cliente As String, denominazione As String, indirizzo As String, part_iva As String, username As String)
	' o As Ordine, cod_cliente As String, denominazione As String, indirizzo As String, part_iva As String, username As String
	m_id = oid
	m_idCliente = cid
	m_idUtente = uid
	m_dataInvio = dtinv
	m_note = nt
	m_codcliente = cod_cliente
	m_denom = denominazione
	m_indir = indirizzo
	m_iva = part_iva
	m_utente = username
	m_voci.Initialize
End Sub

Public Sub ToString As String
	Return m_id & " - " & m_denom & TAB & m_dataInvio
End Sub

Public Sub Totale As Float
	Dim tot As Float = 0.0F
	For Each v As VoceOrdine In m_voci
		tot = tot + v.Totale
	Next
	
	Return tot
End Sub

'Public Sub FromJson(jsonString As String)
'	Dim parser As JSONParser
'	parser.Initialize(jsonString)
'	Dim root As Map = parser.NextObject
'	Dim m As Map = root.Get("data")
'
'	m_id = m.Get("id")
'	m_idCliente = m.Get("id_cliente")
'	m_idUtente = m.Get("id_utente")
'	m_dataInvio = m.Get("data_invio")
'	m_note = m.Get("note")
'	m_denom = m.Get("denominazione")
'	m_codcliente = m.Get("cod_cliente")
'	m_indir = m.Get("indirizzo")
'	m_iva = m.Get("part_iva")
'	
'	Dim righe As List = m.Get("righe")
'	For Each r As Map In righe
'		Dim v As VoceOrdine
'		Dim vId As Int = r.Get("id")
'		Dim cod As String = r.Get("cod_art")
'		Dim desc As String = r.Get("desc_art")
'		Dim vNote As String = r.Get("note")
'		Dim prezzo As Float = r.Get("prez_art")
'		Dim qta As Int = r.Get("qta")
'		v.Initialize(vId, cod, desc, m_id, vNote, prezzo, qta)
'		m_voci.Add(v)
'	Next
'End Sub

Public Sub getId As Int
	Return m_id
End Sub

Public Sub getIdCliente As Int
	Return m_idCliente
End Sub

Public Sub getIdUtente As Int
	Return m_idUtente
End Sub

Public Sub getDataInvio As String
	Return m_dataInvio
End Sub

Public Sub getNote As String
	Return m_note
End Sub
	
Public Sub getVoci As List
	Return m_voci
End Sub

Public Sub getCodCliente As String
	Return m_codcliente
End Sub

Public Sub getDenominazione As String
	Return m_denom
End Sub

Public Sub getIndirizzo As String
	Return m_indir
End Sub

Public Sub getPartitaIva As String
	Return m_iva
End Sub

Public Sub getUtente As String
	Return m_utente
End Sub