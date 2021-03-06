﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Dim m_job As HttpJob
	Dim m_successo As Boolean
	Dim m_url As String
	Dim m_errore As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	m_job.Initialize("", Me)
	#if DEBUG
	m_url = "http://80.211.227.37/apiv2"
	#End If
	
	#if RELEASE
		m_url = "http://80.211.2.91/apiv2"
	#End If
End Sub

Public Sub getSuccesso As Boolean
	Return m_successo
End Sub

Public Sub getErrore As String
	Return m_errore
End Sub

'Public Sub ScaricaUltimiOrdini() As ResumableSub
'	m_successo = False
'	Dim m_ordini As List
'	m_ordini.Initialize
'	m_job.Download(m_url & "/ultimi_ordini")
'	Wait For (m_job) JobDone
'	
'	If m_job.Success Then
'		m_successo = True
'			
'		Dim parser As JSONParser
'		parser.Initialize(m_job.GetString)
'		Dim root As Map = parser.NextObject
'		Dim objects As List = root.Get("data")
'		'Log(objects)
'					
'		For Each ob In objects
'			Dim m As Map = ob
'			Dim dt_inv As String = m.Get("data_invio")
'			Dim oid As Int = m.Get("id")
'			Dim cId As Int = m.Get("id_cliente")
'			Dim uId As Int = m.Get("id_utente")
'			Dim nt As String = m.Get("note")
'			Dim ordn As Ordine
'			ordn.Initialize(oid,cId,uId,dt_inv,nt)
'			m_ordini.Add(ordn)
'		Next
'	End If
'	
'	Return m_ordini
'End Sub

'public Sub ScaricaVociUltimiOrdini() As ResumableSub
'	m_successo = False
'	Dim m_voci As List
'	m_voci.Initialize
'	m_job.Download(m_url & "/ultime_righe")
'	Wait For (m_job) JobDone
'	
'	If m_job.Success Then
'		m_successo = True
'			
'		Dim parser As JSONParser
'		parser.Initialize(m_job.GetString)
'		Dim root As Map = parser.NextObject
'		Dim objects As List = root.Get("data")
'		'Log(objects)
'					
'		For Each ob In objects
'			Try
'				Dim v As VoceOrdine
'				Dim m As Map = ob
'				Dim id As Int = m.Get("id")
'				Dim oid As Int = m.Get("id_ordine")
'				Dim cod As String = m.Get("cod_art")
'				Dim desc As String = m.Get("desc_art")
'				Dim note As String = m.Get("note")
'				Dim prezzo As Float = m.Get("prez_art")
'				Dim qta As Int = m.Get("qta")
'				v.Initialize(id, cod, desc, oid, note, prezzo, qta)
'				m_voci.Add(v)
'			Catch
'				Log(LastException)
'			End Try
'		Next
'	End If
'	
'	Return m_voci
'End Sub

Public Sub ScaricaArticoli As ResumableSub
	m_successo = False
	Dim m_articoli As List
	m_articoli.Initialize
	m_job.Download(m_url & "/articoli")
	Wait For (m_job) JobDone
	
	If m_job.Success Then
		m_successo = True
		Dim parser As JSONParser
		parser.Initialize(m_job.GetString)
		Dim root As Map = parser.NextObject
		Dim objects As List = root.Get("data")
		
		For Each ob In objects
			Dim m As Map = ob
			Dim cod As String = m.Get("codice")
			Dim dtum As String = m.Get("data_ultima_modifica")
			Dim descr As String = m.Get("descrizione")
			Dim id As Int = m.Get("id")
			Dim prz As Float = m.Get("prezzo")
			Dim a As Articolo
			a.Initialize(id,cod,descr,prz,dtum)
			m_articoli.Add(a)
		Next
	End If
	
	Return m_articoli
End Sub

Public Sub ScaricaOrdiniDaId(id As Int) As ResumableSub
	m_successo = False
	Dim m_ordini As List
	m_ordini.Initialize
	m_job.Download(m_url & "/ordini/" & id)
	Wait For (m_job) JobDone
	
	If m_job.Success Then
		m_successo = True
		Dim parser As JSONParser
		parser.Initialize(m_job.GetString)
		Dim root As Map = parser.NextObject
		Dim objects As List = root.Get("data")
		
		For Each m As Map In objects
			Dim dt_inv As String = m.Get("data_invio")
			Dim oid As Int = m.Get("id")
			Dim cId As Int = m.Get("id_cliente")
			Dim uId As Int = m.Get("id_utente")
			Dim nt As String = m.Get("note")
			Dim den As String = m.Get("denominazione")
			Dim codcli As String = m.Get("cod_cliente")
			Dim indir As String = m.Get("indirizzo")
			Dim iva As String = m.Get("part_iva")
			Dim usr As String = m.Get("utente")
			Dim ordn As OrdineConCliente
			ordn.Initialize(oid,cId,uId,dt_inv,nt,codcli,den,indir,iva,usr)
			
			Dim righe As List = m.Get("righe")
			For Each r As Map In righe
				Try
					Dim v As VoceOrdine
					Dim id As Int = r.Get("id")
					Dim oid As Int = ordn.Id
					Dim cod As String = r.Get("cod_art")
					Dim desc As String = r.Get("desc_art")
					Dim note As String = r.Get("note")
					Dim prezzo As Float = r.Get("prez_art")
					Dim qta As Int = r.Get("qta")
					v.Initialize(id, cod, desc, oid, note, prezzo, qta)
					ordn.Voci.Add(v)
				Catch
					Log(LastException)
				End Try
			Next
			
			m_ordini.Add(ordn)
		Next
	End If
	
	Return m_ordini
End Sub

Public Sub ScaricaClienti() As ResumableSub
	m_successo = False
	Dim m_clienti As List
	m_clienti.Initialize
	m_job.Download(m_url & "/clienti")
	Wait For (m_job) JobDone
	
	If m_job.Success Then
		m_successo = True
		Dim parser As JSONParser
		parser.Initialize(m_job.GetString)
		Dim root As Map = parser.NextObject
		Dim objects As List = root.Get("data")
		'Log(objects)
				
		For Each ob In objects
			Dim m As Map = ob
			Dim cod As String = m.Get("codice")
			Dim denom As String = m.Get("denominazione")
			Dim id As Int = m.Get("id")
			Dim indir As String = m.Get("indirizzo")
			Dim piva As String = m.Get("part_iva")
			Dim dtum As String = m.Get("data_ultima_modifica")
			Dim c As Cliente
			c.Initialize(id,cod,denom,indir,piva,dtum)
			If cod.CompareTo("$FITTIZIO$") = 0 Then 
				c.Fittizio = True
			End If
			m_clienti.Add(c)
		Next
	End If
	
	Return m_clienti
End Sub

Public Sub StoricoOrdiniPerCliente(id_cliente As Int) As ResumableSub
	m_successo = False
	Dim m_ordini As List
	m_ordini.Initialize
	m_job.Download(m_url & "/storico_ordini/" & id_cliente)
	Wait For (m_job) JobDone
	
	If m_job.Success Then
		m_successo = True
		Dim parser As JSONParser
		parser.Initialize(m_job.GetString)
		Dim root As Map = parser.NextObject
		Dim objects As List = root.Get("data")
		
		For Each m As Map In objects
			Dim dt_inv As String = m.Get("data_invio")
			Dim oid As Int = m.Get("id")
			Dim cId As Int = m.Get("id_cliente")
			Dim uId As Int = m.Get("id_utente")
			Dim nt As String = m.Get("note")
			Dim ordn As Ordine
			ordn.Initialize(oid,cId,uId,dt_inv,nt)
			
			Dim righe As List = m.Get("righe")
			For Each r As Map In righe
				Try
					Dim v As VoceOrdine
					Dim id As Int = r.Get("id")
					Dim oid As Int = ordn.Id
					Dim cod As String = r.Get("cod_art")
					Dim desc As String = r.Get("desc_art")
					Dim note As String = r.Get("note")
					Dim prezzo As Float = r.Get("prez_art")
					Dim qta As Int = r.Get("qta")
					v.Initialize(id, cod, desc, oid, note, prezzo, qta)
					ordn.Voci.Add(v)
				Catch
					Log(LastException)
				End Try
			Next
			
			m_ordini.Add(ordn)
		Next
	End If
	
	Return m_ordini
End Sub

Public Sub StoricoOrdini() As ResumableSub
	m_successo = False
	Dim m_ordini As List
	m_ordini.Initialize
	m_job.Download(m_url & "/storico_ordini")
	Wait For (m_job) JobDone
	
	If m_job.Success Then
		m_successo = True
		Dim parser As JSONParser
		parser.Initialize(m_job.GetString)
		Dim root As Map = parser.NextObject
		Dim objects As List = root.Get("data")
		
		For Each m As Map In objects
			Dim dt_inv As String = m.Get("data_invio")
			Dim oid As Int = m.Get("id")
			Dim cId As Int = m.Get("id_cliente")
			Dim uId As Int = m.Get("id_utente")
			Dim nt As String = m.Get("note")
			Dim ordn As Ordine
			ordn.Initialize(oid,cId,uId,dt_inv,nt)
			
			Dim righe As List = m.Get("righe")
			For Each r As Map In righe
				Try
					Dim v As VoceOrdine
					Dim id As Int = r.Get("id")
					Dim oid As Int = ordn.Id
					Dim cod As String = r.Get("cod_art")
					Dim desc As String = r.Get("desc_art")
					Dim note As String = r.Get("note")
					Dim prezzo As Float = r.Get("prez_art")
					Dim qta As Int = r.Get("qta")
					v.Initialize(id, cod, desc, oid, note, prezzo, qta)
					ordn.Voci.Add(v)
				Catch
					Log(LastException)
				End Try
			Next
			
			m_ordini.Add(ordn)
		Next
	End If
	
	Return m_ordini
End Sub

Public Sub ScaricaPreferiti() As ResumableSub
	m_successo = False
	Dim m_preferiti As List
	m_preferiti.Initialize
	m_job.Download(m_url & "/preferiti")
	Wait For (m_job) JobDone
	
	If m_job.Success Then
		m_successo = True
		Dim parser As JSONParser
		parser.Initialize(m_job.GetString)
		Dim root As Map = parser.NextObject
		Dim objects As List = root.Get("data")
		
		For Each m As Map In objects
			Dim cod As String = m.Get("cod_art")
			Dim desc As String = m.Get("desc_art")
			Dim id As Int = m.Get("id_art")
			Dim cid As String = m.Get("id_cliente")
			Dim occ As String = m.Get("occorrenze")
			
			Dim pr As Preferito
			pr.Initialize(id, cod, desc, cid, occ)
			m_preferiti.Add(pr)
		Next
	End If
	
	Return m_preferiti
End Sub

Public Sub ScaricaPreferitiPerCliente(id_cliente As Int) As ResumableSub
	m_successo = False
	Dim m_preferiti As List
	m_preferiti.Initialize
	m_job.Download(m_url & "/preferiti/" & id_cliente)
	Wait For (m_job) JobDone
	
	If m_job.Success Then
		m_successo = True
		Dim parser As JSONParser
		parser.Initialize(m_job.GetString)
		Dim root As Map = parser.NextObject
		Dim objects As List = root.Get("data")
		
		For Each m As Map In objects
			Dim cod As String = m.Get("cod_art")
			Dim desc As String = m.Get("desc_art")
			Dim id As Int = m.Get("id_art")
			Dim cid As String = m.Get("id_cliente")
			Dim occ As String = m.Get("occorrenze")
			
			Dim pr As Preferito
			pr.Initialize(id, cod, desc, cid, occ)
			m_preferiti.Add(pr)
		Next
	End If
	
	Return m_preferiti
End Sub

Public Sub Invia(ord As Ordine, utn As Utente) As ResumableSub
	m_successo = False
	Dim ordn As Ordine
	Dim form As Map
	'ordn.CreateNew()
	ordn.Initialize(0,0,0,"","")
	form.Initialize
	form.Put("id_cliente", ord.IdCliente)
	form.Put("id_utente", utn.Id)
	form.Put("data", ord.ToJson)
	m_job.PostMultipart(m_url & "/ordine", form, Null)
	Wait For (m_job) JobDone
	
	Try
		If m_job.Success Then
			m_successo = True
			ordn.FromJson(m_job.GetString)
			Return ordn
		Else
			m_errore = m_job.ErrorMessage
		End If
	Catch
		Log(LastException)
		m_errore = "Errore di connessione"
	End Try
	
	Return Null
End Sub

Public Sub CreaCliente(cli As Cliente) As ResumableSub
	m_successo = False
	Dim fitt As Int = 0
	If cli.Fittizio Then fitt = 1
	Dim form As Map
	form.Initialize
	form.Put("codice", cli.Codice)
	form.Put("denominazione", cli.Denominazione)
	form.Put("indirizzo", cli.Indirizzo)
	form.Put("part_iva", cli.PartitaIVA)
	form.Put("fittizio", fitt)
	m_job.PostMultipart(m_url & "/clienti", form, Null)
	Wait For (m_job) JobDone
	
	If m_job.Success Then
		m_successo = True
		Dim parser As JSONParser
		parser.Initialize(m_job.GetString)
		Dim root As Map = parser.NextObject
		Dim objects As List = root.Get("data")
		for	Each m As Map In objects
			Dim cod As String = m.Get("codice")
			Dim Denom As String = m.Get("denominazione")
			Dim id As Int = m.Get("id")
			Dim indir As String = m.Get("indirizzo")
			Dim piva As String = m.Get("part_iva")
			Dim dtum As String = m.Get("data_ultima_modifica")
		Next
		Dim c As Cliente
		c.Initialize(id,cod,Denom,indir,piva,dtum)
		Return c
	End If
	
	Return Null
End Sub

Public Sub Login(username As String, password As String) As ResumableSub
	m_successo = False
	Dim user As Utente
	Dim form As Map
	form.Initialize
	form.Put("username", username)
	form.Put("password", password)
	m_job.PostMultipart(m_url & "/login", form, Null)
	Wait For (m_job) JobDone
	
	Try
		If m_job.Success Then
			m_successo = True
			Dim parser As JSONParser
			parser.Initialize(m_job.GetString)
			Dim root As Map = parser.NextObject
			Dim objects As List = root.Get("data")
		
			Dim m As Map = objects.Get(0)
			user.Initialize(m.Get("id"), m.Get("username"), m.Get("ultimo_accesso"))
		
			Return user
		Else If m_job.Response.StatusCode == 404 Then
			m_errore = "Nome utente o password errata"
		Else
			m_errore = m_job.ErrorMessage
		End If
	Catch
		Log(LastException)
		m_errore = "Errore di connessione"
	End Try

	Return Null
End Sub