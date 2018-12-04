B4A=true
Group=Classes
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
Sub Class_Globals
	Dim Sql1 As SQL
	Dim MAX_RESULTS As Int=100
End Sub

Public Sub Initialize
	Sql1.Initialize(File.DirInternal, "aegd.db", True)
	If TablesExist = False Then
		CreateTables
	End If
	'FillSimpleData
End Sub

Private Sub TablesExist As Boolean
	Try
		Sql1.ExecQuery("SELECT id FROM cliente LIMIT 1;")
		Return True
	Catch
		Log(LastException)
		Return False
	End Try
End Sub

Public Sub Close
	If Sql1.IsInitialized Then
		Sql1.Close
	End If
End Sub

Sub CreateTables
	' Cliente
	Sql1.ExecNonQuery("DROP TABLE IF EXISTS cliente;")
	Sql1.ExecNonQuery("CREATE TABLE cliente (id INTEGER PRIMARY KEY, codice TEXT, denominazione TEXT, indirizzo TEXT, piva TEXT, data_ultima_modifica TEXT);")
	
	' Articolo
	Sql1.ExecNonQuery("DROP TABLE IF EXISTS articolo;")
	Sql1.ExecNonQuery("CREATE TABLE articolo (id INTEGER PRIMARY KEY, codice TEXT, descrizione TEXT, prezzo FLOAT, data_ultima_modifica TEXT);")
	
	' Ordini in corso
	Sql1.ExecNonQuery("DROP TABLE IF EXISTS ordine_in_corso;")
	Sql1.ExecNonQuery("CREATE TABLE ordine_in_corso (id INTEGER PRIMARY KEY, id_cliente INTEGER, note TEXT);")
	
	' Voci ordini in corso
	Sql1.ExecNonQuery("DROP TABLE IF EXISTS voce_ordine_in_corso;")
	Sql1.ExecNonQuery("CREATE TABLE voce_ordine_in_corso (id INTEGER PRIMARY KEY, cod_art TEXT, desc_art TEXT, " & _
					  "id_ordine INTEGER, qta INTEGER, prezzo FLOAT, note TEXT);")
	
	' Ordine
	Sql1.ExecNonQuery("DROP TABLE IF EXISTS ordine;")
	Sql1.ExecNonQuery("CREATE TABLE ordine (id INTEGER PRIMARY KEY, data_invio TEXT, id_cliente INTEGER, id_utente INTEGER, note TEXT);")
	
	' VoceOrdine
	Sql1.ExecNonQuery("DROP TABLE IF EXISTS voce_ordine;")
	Sql1.ExecNonQuery("CREATE TABLE voce_ordine (id INTEGER PRIMARY KEY, cod_art TEXT, desc_art TEXT, " & _
					  "id_ordine INTEGER, qta INTEGER, prezzo FLOAT, note TEXT);")
					  
	' Preferiti
	Sql1.ExecNonQuery("DROP TABLE IF EXISTS preferiti;")
	Sql1.ExecNonQuery("CREATE TABLE preferiti (id_cliente INTEGER, cod_art TEXT, desc_art TEXT, " & _
					  "id_art INTEGER, occorrenze INTEGER);")
					  
	' Utente
	Sql1.ExecNonQuery("DROP TABLE IF EXISTS utente;")
	Sql1.ExecNonQuery("CREATE TABLE utente (id INTEGER PRIMARY KEY, username TEXT, ultimo_accesso TEXT);")
	
End Sub

'Sub FillSimpleData
'	Dim qry As String = "INSERT INTO cliente (codice,denominazione,indirizzo,piva) VALUES(?, ?, ?, ?)"
'	Sql1.BeginTransaction
'	For i=0 To MAX_RESULTS
'		Sql1.ExecNonQuery2(qry, Array As Object("ID_" & i, "Cliente #" & i, "via prova " & i, "1000000000" & i))
'	Next
'	Sql1.TransactionSuccessful
'	Sql1.EndTransaction
'End Sub

Public Sub CercaClientiPerNome(denom As String) As List
	Dim clienti As List
	clienti.Initialize
	Dim Cursor1 As Cursor
	Cursor1 = Sql1.ExecQuery2("SELECT id, codice, denominazione, indirizzo, piva, data_ultima_modifica " & _ 
							  " FROM cliente WHERE denominazione like ? ORDER BY denominazione LIMIT ?;", _
							  Array As String("%" & denom & "%", MAX_RESULTS))
	For i=0 To Cursor1.RowCount - 1
		Dim c As Cliente
		Cursor1.Position=i
		c.Initialize(Cursor1.GetInt("id"), Cursor1.GetString("codice"), Cursor1.GetString("denominazione"), _
					 Cursor1.GetString("indirizzo"), Cursor1.GetString("piva"), Cursor1.GetString("data_ultima_modifica"))
		clienti.Add(c)
	Next
	Cursor1.Close
	Return clienti
End Sub

Public Sub CercaArticoliPerNome(denom As String) As List
	Dim Articoli As List
	Articoli.Initialize
	Dim Cursor1 As Cursor = Sql1.ExecQuery2("SELECT id, codice, descrizione, prezzo, data_ultima_modifica FROM articolo " & _
							"WHERE descrizione LIKE ? ORDER BY descrizione LIMIT ?;", Array As String("%" & denom & "%", MAX_RESULTS))
	For i=0 To Cursor1.RowCount - 1
		Cursor1.Position=i
		Dim a As Articolo
		Dim prezzo As Float = Cursor1.GetString("prezzo")
		a.Initialize(Cursor1.GetInt("id"), Cursor1.GetString("codice"), Cursor1.GetString("descrizione"), _
					 prezzo, Cursor1.GetString("data_ultima_modifica"))
		Articoli.Add(a)
	Next
	Cursor1.Close
	Return Articoli
End Sub

public Sub GetArticoli() As List
	Dim Articoli As List
	Articoli.Initialize
	Dim Cursor1 As Cursor = Sql1.ExecQuery2("SELECT id, codice, descrizione, prezzo, data_ultima_modifica FROM articolo LIMIT ?;", _
					Array As String(MAX_RESULTS))
	For i=0 To Cursor1.RowCount - 1
		Cursor1.Position=i
		Dim a As Articolo
		Dim prezzo As Float = Cursor1.GetString("prezzo")
		a.Initialize(Cursor1.GetInt("id"), Cursor1.GetString("codice"), Cursor1.GetString("descrizione"), _
					 prezzo, Cursor1.GetString("data_ultima_modifica"))
		Articoli.Add(a)
	Next
	Cursor1.Close
	Return Articoli
End Sub

Public Sub GetClienti() As List
	Dim Clienti As List
	Clienti.Initialize
	Dim Cursor1 As Cursor
	Cursor1 = Sql1.ExecQuery2("SELECT id, codice, denominazione, indirizzo, piva, data_ultima_modifica " & _
							  " FROM cliente ORDER BY denominazione LIMIT ?;", _
							  Array As String(MAX_RESULTS))
	Sql1.BeginTransaction
	For i=0 To Cursor1.RowCount - 1
		Dim c As Cliente
		Cursor1.Position=i
		c.Initialize(Cursor1.GetInt("id"), Cursor1.GetString("codice"), Cursor1.GetString("denominazione"), _
					 Cursor1.GetString("indirizzo"), Cursor1.GetString("piva"), Cursor1.GetString("data_ultima_modifica"))
		Clienti.Add(c)
	Next
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
	Cursor1.Close
	Return Clienti
End Sub

Public Sub GetUtente() As Utente
	Dim Cursor1 As Cursor
	Cursor1 = Sql1.ExecQuery("SELECT id, username, ultimo_accesso FROM utente LIMIT 1;")
	If Cursor1.RowCount = 0 Then
		Return Null
	End If
	
	Cursor1.Position = 0
	Dim u As Utente
	u.Initialize(Cursor1.GetInt("id"), Cursor1.GetString("username"), Cursor1.GetString("ultimo_accesso"))
	Return u
End Sub

'Public Sub SalvaVociOrdine(o As Ordine)
'	Dim qry As String = "INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?)"
'	For Each v As VoceOrdine In o.Voci
'		Sql1.ExecNonQuery2(qry, Array As Object(v.Id, v.CodArt, v.DescArt, v.IdOrdine, v.Qta, v.Prezzo, v.Note))
'	Next
'End Sub

Public Sub OrdiniPerCliente(IdCliente As Int) As List
	Dim Ordini As List
	Ordini.Initialize
	Dim Cursor1 As Cursor
	Cursor1 = Sql1.ExecQuery2("SELECT id, data_invio,id_cliente,id_utente,note FROM ordine WHERE id_cliente = ? ORDER BY id DESC;", _
								 Array As String(IdCliente))
	For i=0 To Cursor1.RowCount - 1
		Cursor1.Position = i
		Dim o As Ordine
		o.Initialize(Cursor1.GetInt("id"), Cursor1.GetInt("id_cliente"), Cursor1.GetInt("id_utente"), _
					 Cursor1.GetString("data_invio"), Cursor1.GetString("note"))
		o.Voci.AddAll(CaricaVoci(o.Id))
		Ordini.Add(o)					 
	Next
	Cursor1.Close
	Return Ordini
End Sub

Private Sub CaricaVoci(IdOrdine As Int) As List
	Dim voci As List
	voci.Initialize
	Dim Cursor1 As Cursor
	Cursor1 = Sql1.ExecQuery2("SELECT id, cod_art, desc_art, qta, prezzo, note FROM voce_ordine WHERE id_ordine = ?;", _
							  Array As String(IdOrdine))
	For i = 0 To Cursor1.RowCount - 1
		Cursor1.Position = i
		Dim vo As VoceOrdine
		Dim prezzo As Float = Cursor1.GetString("prezzo")
		vo.Initialize(Cursor1.GetInt("id"), Cursor1.GetString("cod_art"), Cursor1.GetString("desc_art"), IdOrdine, _
				  Cursor1.GetString("note"), prezzo, Cursor1.GetInt("qta"))
		voci.Add(vo)
	Next
	Cursor1.Close
	Return voci
End Sub

Public Sub OrdiniInCorsoPerCliente(IdCliente As Int) As List
	Dim Ordini As List
	Ordini.Initialize
	Dim Cursor1 As Cursor
	Cursor1 = Sql1.ExecQuery2("SELECT id,id_cliente,note FROM ordine_in_corso WHERE id_cliente = ? ORDER BY id DESC;", _
							  Array As String(IdCliente))
	For i=0 To Cursor1.RowCount - 1
		Cursor1.Position = i
		Dim o As Ordine
		o.Initialize(Cursor1.GetInt("id"), Cursor1.GetInt("id_cliente"), Starter.User.Id, _
					 "", Cursor1.GetString("note"))
		o.Voci.AddAll(CaricaVociOrdineInCorso(o.Id))
		Ordini.Add(o)					 
	Next
	Cursor1.Close
	Return Ordini
End Sub

Private Sub CaricaVociOrdineInCorso(IdOrdineInCorso As Int) As List
	Dim voci As List
	voci.Initialize
	Dim Cursor1 As Cursor
	Cursor1 = Sql1.ExecQuery2("SELECT id, cod_art, desc_art, qta, prezzo, note FROM voce_ordine_in_corso WHERE id_ordine = ?;", _
							  Array As String(IdOrdineInCorso))
	For i = 0 To Cursor1.RowCount - 1
		Cursor1.Position = i
		Dim vo As VoceOrdine
		Dim prezzo As Float = Cursor1.GetString("prezzo")
		vo.Initialize(Cursor1.GetInt("id"), Cursor1.GetString("cod_art"), Cursor1.GetString("desc_art"), IdOrdineInCorso, _
				  Cursor1.GetString("note"), prezzo, Cursor1.GetInt("qta"))
		voci.Add(vo)
	Next
	Cursor1.Close
	Return voci
End Sub

Public Sub SalvaClienti(clienti As List)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery("DELETE FROM cliente")
	Dim qry As String = "INSERT INTO cliente (id, codice,denominazione,indirizzo,piva,data_ultima_modifica) VALUES(?,?,?,?,?,?);"
	For Each c As Cliente In clienti
		Sql1.ExecNonQuery2(qry, Array As Object(c.Id, c.Codice, c.Denominazione, c.Indirizzo, c.PartitaIVA, c.DataUltimaModifica))
	Next
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub SalvaArticoli(articoli As List)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery("DELETE FROM articolo")
	Dim qry As String = "INSERT INTO articolo (id, codice, descrizione, prezzo, data_ultima_modifica) VALUES(?,?,?,?,?);"
	For Each a As Articolo In articoli
		Sql1.ExecNonQuery2(qry, Array As Object(a.Id, a.Codice, a.Descrizione, a.Prezzo, a.DataUltimaModifica))
	Next
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub GetCliente(id As Int) As Cliente
	Dim c As Cliente
	Dim qry As String = "SELECT id, codice,denominazione,indirizzo,piva,data_ultima_modifica from CLIENTE where id = ?;"
	Dim Cursor1 As Cursor = Sql1.ExecQuery2(qry, Array As String(id))
	For i = 0 To Cursor1.RowCount - 1
		Cursor1.Position = i
		c.Initialize(Cursor1.GetInt("id"), Cursor1.GetString("codice"), Cursor1.GetString("denominazione"), _
				 	 Cursor1.GetString("indirizzo"), Cursor1.GetString("piva"), Cursor1.GetString("data_ultima_modifica"))
	Next
	Cursor1.Close
	Return c
End Sub

Public Sub GetPreferitiCliente(cid As Int) As List
	Dim preferiti As List
	Dim qry As String = "SELECT id_cliente,cod_art,desc_art,id_art,occorrenze FROM preferiti WHERE id_cliente = ? ORDER BY occorrenze DESC;"
	Dim Cursor1 As Cursor = Sql1.ExecQuery2(qry, Array As String(cid))
	preferiti.Initialize
	
	For i = 0 To Cursor1.RowCount - 1
		Cursor1.Position = i
		Dim p As Preferito
		p.Initialize(Cursor1.GetInt("id_art"), Cursor1.GetString("cod_art"), Cursor1.GetString("desc_art"), _
					 Cursor1.GetInt("id_cliente"), Cursor1.GetInt("occorrenze"))
		preferiti.Add(p)
	Next
	
	Return preferiti
End Sub

Public Sub SalvaOrdine(o As Ordine)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("DELETE FROM voce_ordine where id_ordine = ?;", Array As Object(o.Id))
	Sql1.ExecNonQuery2("DELETE FROM ordine where id = ?", Array As Object(o.Id))
	Sql1.ExecNonQuery2("INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);", _
						Array As Object(o.Id,o.DataInvio,o.IdCliente,o.IdUtente,o.Note))
		
	For Each v As VoceOrdine In o.Voci
		Sql1.ExecNonQuery2("INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);", _
							Array As Object(v.Id,v.CodArt,v.DescArt,v.IdOrdine,v.Qta,v.Prezzo,v.Note))
	Next
	
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub SalvaStoricoOrdini(ordini As List)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery("DELETE FROM voce_ordine;")
	Sql1.ExecNonQuery("DELETE FROM ordine;")
	
	Dim qry1 As String = "INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);"
	Dim qry2 As String = "INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);"
	For Each o As Ordine In ordini
		Sql1.ExecNonQuery2(qry1, Array As Object(o.Id,o.DataInvio,o.IdCliente,o.IdUtente,o.Note))
		
		For Each v As VoceOrdine In o.Voci
			Sql1.ExecNonQuery2(qry2, Array As Object(v.Id,v.CodArt,v.DescArt,v.IdOrdine,v.Qta,v.Prezzo,v.Note))
		Next
	Next
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub SalvaStoricoOrdiniPerCliente(ordini As List, id_cliente As Int)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("DELETE FROM voce_ordine WHERE id_ordine IN (SELECT id FROM ordine WHERE id_cliente = ?);", Array As Object(id_cliente))
	Sql1.ExecNonQuery2("DELETE FROM ordine WHERE id_cliente = ?;", Array As Object(id_cliente))
	
	Dim qry1 As String = "INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);"
	Dim qry2 As String = "INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);"
	For Each o As Ordine In ordini
		Sql1.ExecNonQuery2(qry1, Array As Object(o.Id,o.DataInvio,o.IdCliente,o.IdUtente,o.Note))
		
		For Each v As VoceOrdine In o.Voci
			Sql1.ExecNonQuery2(qry2, Array As Object(v.Id,v.CodArt,v.DescArt,v.IdOrdine,v.Qta,v.Prezzo,v.Note))
		Next
	Next
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub SalvaPreferiti(preferiti As List)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery("DELETE FROM preferiti;")
	Dim ins As String = "INSERT INTO preferiti (id_cliente, cod_art, desc_art, id_art, occorrenze) VALUES(?,?,?,?,?);"
	For Each p As Preferito In preferiti
		Sql1.ExecNonQuery2(ins, Array As Object(p.IdCliente, p.Codice, p.Descrizione, p.IdArt, p.Occorrenze))
	Next
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub SalvaPreferitiPerCliente(preferiti As List, id_cliente As Int)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("DELETE FROM preferiti WHERE id_cliente = ?;", Array As Object(id_cliente))
	Dim ins As String = "INSERT INTO preferiti (id_cliente, cod_art, desc_art, id_art, occorrenze) VALUES(?,?,?,?,?);"
	For Each p As Preferito In preferiti
		Sql1.ExecNonQuery2(ins, Array As Object(p.IdCliente, p.Codice, p.Descrizione, p.IdArt, p.Occorrenze))
	Next
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub SalvaOrdineInCorso(o As Ordine)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("INSERT INTO ordine_in_corso (id_cliente, note) VALUES(?,?);", Array As Object(o.IdCliente, o.Note))
	For Each v As VoceOrdine In o.Voci
		Sql1.ExecNonQuery2("INSERT INTO voce_ordine_in_corso (cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?);", _
							Array As Object(v.CodArt,v.DescArt,v.IdOrdine,v.Qta,v.Prezzo,v.Note))
	Next
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub EliminaOrdineInCorso(id As Int)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("DELETE FROM voce_ordine_in_corso WHERE id_ordine = ?;", Array As Object(id))
	Sql1.ExecNonQuery2("DELETE FROM ordine_in_corso WHERE id = ?;", Array As Object(id))
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub GetOrdineInCorso(id As Int) As Ordine
	Dim o As Ordine
	Dim crs As Cursor = Sql1.ExecQuery2("SELECT id, id_cliente, note FROM ordine_in_corso WHERE id = ?", Array As String(id))
	If crs.RowCount > 0 Then
		crs.Position = 0
		o.Initialize(crs.GetInt2(0), crs.GetInt2(1), Starter.User.Id, "", crs.GetString2(2))
	Else
		Return Null
	End If
	crs.Close
	Dim crs2 As Cursor = Sql1.ExecQuery2("SELECT id,cod_art,desc_art,id_ordine,qta,prezzo,note FROM voce_ordine_in_corso " & _
										 "WHERE id_ordine = ?;", Array As String(id))
	For i=0 To crs2.RowCount - 1
		crs2.Position = i
		Dim v As VoceOrdine
		Dim prezzo As Float = crs2.GetString("prezzo")
		v.Initialize(crs2.GetInt2(0), crs2.GetString2(1), crs2.GetString2(2), id, crs2.GetString("note"), _
					 prezzo, crs2.GetInt("qta"))
		o.Voci.Add(v)
	Next
	crs2.Close
	Return o
End Sub

Public Sub NuovoOrdine(c As Cliente) As Ordine
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("INSERT INTO ordine_in_corso (id_cliente) VALUES(?);", Array As Object(c.Id))
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
	
	Dim crs As Cursor = Sql1.ExecQuery("SELECT last_insert_rowid();")
	crs.Position = 0
	Dim id As Int = crs.GetInt2(0)
	crs.Close
	Dim o As Ordine
	o.Initialize(id, c.Id, Starter.User.Id, "", "")
	Return o
End Sub

Public Sub NuovaVoce(o As Ordine, cod As String, desc As String, q As Int, prz As Float, nt As String) As VoceOrdine
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("INSERT INTO voce_ordine_in_corso (cod_art, desc_art, id_ordine, qta, prezzo, note) " & _
					   "VALUES(?,?,?,?,?,?);", Array As Object(cod, desc, o.Id, q, prz, nt))
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
	Dim crs As Cursor = Sql1.ExecQuery("SELECT last_insert_rowid();")
	crs.Position = 0
	Dim id As Int = crs.GetInt2(0)
	crs.Close
	Dim v As VoceOrdine
	v.Initialize(id, cod, desc, o.Id, nt, prz, q)
	Return v
End Sub

Public Sub SalvaUtente(usr As Utente)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("INSERT INTO utente (id, username, ultimo_accesso) VALUES(?, ?, ?);", Array As Object(usr.Id, usr.Nome, usr.UltimoAccesso))
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub EliminaVoce(id As Int)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("DELETE FROM voce_ordine_in_corso WHERE id = ?", Array As Object(id))
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

Public Sub GetVoce(id As Int) As VoceOrdine
	Dim v As VoceOrdine
	Dim crs As Cursor = Sql1.ExecQuery2("SELECT id,cod_art, desc_art, id_ordine, qta, prezzo, note FROM voce_ordine_in_corso WHERE id=?", _
					Array As String(id))
	If crs.RowCount == 0 Then
		Return Null
	Else
		crs.Position = 0
		
		v.Initialize(crs.GetInt("id"), crs.GetString("cod_art"), crs.GetString("desc_art"), crs.GetInt("id_ordine"), _
					 crs.GetString("note"), crs.GetString("prezzo"), crs.GetInt("qta"))
		Return v
	End If
End Sub

Public Sub AggiornaVoce(v As VoceOrdine)
	Sql1.BeginTransaction
	Sql1.ExecNonQuery2("UPDATE voce_ordine_in_corso SET cod_art = ?, desc_art = ?, qta = ?, prezzo = ?, note = ? WHERE id = ?", _
					   Array As Object(v.CodArt, v.DescArt, v.Qta, v.Prezzo, v.Note, v.Id))
	Sql1.TransactionSuccessful
	Sql1.EndTransaction
End Sub

'Public Sub SalvaTuttiGliOrdini(ordini As List)
'	Dim qry2 As String = "INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?)"
'	Sql1.BeginTransaction
'	Sql1.ExecNonQuery("DELETE FROM voce_ordine")
'	Sql1.ExecNonQuery("DELETE FROM ordine")
'	For Each o As Ordine In ordini
'		Sql1.ExecNonQuery2(qry2, Array As Object(o.Id,o.DataInvio,o.IdCliente,o.IdUtente,o.Note))
'	Next
'	Sql1.TransactionSuccessful
'	Sql1.EndTransaction
'End Sub
'
'Public Sub SalvaTutteLeVociOrdini(voci As List)
'	Dim qry2 As String = "INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?)"
'	Sql1.BeginTransaction
'	Sql1.ExecNonQuery("DELETE FROM voce_ordine")
'	For Each v As VoceOrdine In voci
'		Sql1.ExecNonQuery2(qry2, Array As Object(v.Id,v.CodArt,v.DescArt,v.IdOrdine,v.Qta,v.Prezzo,v.Note))
'	Next
'	Sql1.TransactionSuccessful
'	Sql1.EndTransaction
'End Sub