package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class database_subs_0 {


public static RemoteObject  _aggiornavoce(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("AggiornaVoce (database) ","database",2,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("aggiornavoce")) { return __ref.runUserSub(false, "database","aggiornavoce", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 471;BA.debugLine="Public Sub AggiornaVoce(v As VoceOrdine)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 472;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 473;BA.debugLine="Sql1.ExecNonQuery2(\"UPDATE voce_ordine_in_corso S";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE voce_ordine_in_corso SET cod_art = ?, desc_art = ?, qta = ?, prezzo = ?, note = ? WHERE id = ?")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_v.getField(true,"_codart")),(_v.getField(true,"_descart")),(_v.getField(true,"_qta")),(_v.getField(true,"_prezzo")),(_v.getField(true,"_note")),(_v.getField(true,"_id"))})))));
 BA.debugLineNum = 475;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 476;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _caricavoci(RemoteObject __ref,RemoteObject _idordine) throws Exception{
try {
		Debug.PushSubsStack("CaricaVoci (database) ","database",2,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("caricavoci")) { return __ref.runUserSub(false, "database","caricavoci", __ref, _idordine);}
RemoteObject _voci = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _vo = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _prezzo = RemoteObject.createImmutable(0f);
Debug.locals.put("IdOrdine", _idordine);
 BA.debugLineNum = 189;BA.debugLine="Private Sub CaricaVoci(IdOrdine As Int) As List";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="Dim voci As List";
Debug.ShouldStop(536870912);
_voci = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("voci", _voci);
 BA.debugLineNum = 191;BA.debugLine="voci.Initialize";
Debug.ShouldStop(1073741824);
_voci.runVoidMethod ("Initialize");
 BA.debugLineNum = 192;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(-2147483648);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 193;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, cod_art, de";
Debug.ShouldStop(1);
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT id, cod_art, desc_art, qta, prezzo, note FROM voce_ordine WHERE id_ordine = ?;")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idordine)}))));
 BA.debugLineNum = 195;BA.debugLine="For i = 0 To Cursor1.RowCount - 1";
Debug.ShouldStop(4);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 196;BA.debugLine="Cursor1.Position = i";
Debug.ShouldStop(8);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 197;BA.debugLine="Dim vo As VoceOrdine";
Debug.ShouldStop(16);
_vo = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("vo", _vo);
 BA.debugLineNum = 198;BA.debugLine="Dim prezzo As Float = Cursor1.GetString(\"prezzo\"";
Debug.ShouldStop(32);
_prezzo = BA.numberCast(float.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("prezzo"))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 199;BA.debugLine="vo.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetS";
Debug.ShouldStop(64);
_vo.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cod_art")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("desc_art")))),(Object)(_idordine),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("note")))),(Object)(_prezzo),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("qta")))));
 BA.debugLineNum = 201;BA.debugLine="voci.Add(vo)";
Debug.ShouldStop(256);
_voci.runVoidMethod ("Add",(Object)((_vo)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 203;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(1024);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 204;BA.debugLine="Return voci";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return _voci;
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _caricavociordineincorso(RemoteObject __ref,RemoteObject _idordineincorso) throws Exception{
try {
		Debug.PushSubsStack("CaricaVociOrdineInCorso (database) ","database",2,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("caricavociordineincorso")) { return __ref.runUserSub(false, "database","caricavociordineincorso", __ref, _idordineincorso);}
RemoteObject _voci = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _vo = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _prezzo = RemoteObject.createImmutable(0f);
Debug.locals.put("IdOrdineInCorso", _idordineincorso);
 BA.debugLineNum = 225;BA.debugLine="Private Sub CaricaVociOrdineInCorso(IdOrdineInCors";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="Dim voci As List";
Debug.ShouldStop(2);
_voci = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("voci", _voci);
 BA.debugLineNum = 227;BA.debugLine="voci.Initialize";
Debug.ShouldStop(4);
_voci.runVoidMethod ("Initialize");
 BA.debugLineNum = 228;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(8);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 229;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, cod_art, de";
Debug.ShouldStop(16);
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT id, cod_art, desc_art, qta, prezzo, note FROM voce_ordine_in_corso WHERE id_ordine = ?;")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idordineincorso)}))));
 BA.debugLineNum = 231;BA.debugLine="For i = 0 To Cursor1.RowCount - 1";
Debug.ShouldStop(64);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 232;BA.debugLine="Cursor1.Position = i";
Debug.ShouldStop(128);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 233;BA.debugLine="Dim vo As VoceOrdine";
Debug.ShouldStop(256);
_vo = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("vo", _vo);
 BA.debugLineNum = 234;BA.debugLine="Dim prezzo As Float = Cursor1.GetString(\"prezzo\"";
Debug.ShouldStop(512);
_prezzo = BA.numberCast(float.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("prezzo"))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 235;BA.debugLine="vo.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetS";
Debug.ShouldStop(1024);
_vo.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cod_art")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("desc_art")))),(Object)(_idordineincorso),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("note")))),(Object)(_prezzo),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("qta")))));
 BA.debugLineNum = 237;BA.debugLine="voci.Add(vo)";
Debug.ShouldStop(4096);
_voci.runVoidMethod ("Add",(Object)((_vo)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 239;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(16384);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 240;BA.debugLine="Return voci";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return _voci;
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cercaarticolipernome(RemoteObject __ref,RemoteObject _denom) throws Exception{
try {
		Debug.PushSubsStack("CercaArticoliPerNome (database) ","database",2,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("cercaarticolipernome")) { return __ref.runUserSub(false, "database","cercaarticolipernome", __ref, _denom);}
RemoteObject _articoli = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("app.aegdistribuzione.articolo");
RemoteObject _prezzo = RemoteObject.createImmutable(0f);
Debug.locals.put("denom", _denom);
 BA.debugLineNum = 96;BA.debugLine="Public Sub CercaArticoliPerNome(denom As String) A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim Articoli As List";
Debug.ShouldStop(1);
_articoli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Articoli", _articoli);
 BA.debugLineNum = 98;BA.debugLine="Articoli.Initialize";
Debug.ShouldStop(2);
_articoli.runVoidMethod ("Initialize");
 BA.debugLineNum = 99;BA.debugLine="Dim Cursor1 As Cursor = Sql1.ExecQuery2(\"SELECT i";
Debug.ShouldStop(4);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT id, codice, descrizione, prezzo, data_ultima_modifica FROM articolo "),RemoteObject.createImmutable("WHERE descrizione LIKE ? ORDER BY descrizione LIMIT ?;"))),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {RemoteObject.concat(RemoteObject.createImmutable("%"),_denom,RemoteObject.createImmutable("%")),BA.NumberToString(__ref.getField(true,"_max_results"))}))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 101;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
Debug.ShouldStop(16);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 102;BA.debugLine="Cursor1.Position=i";
Debug.ShouldStop(32);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 103;BA.debugLine="Dim a As Articolo";
Debug.ShouldStop(64);
_a = RemoteObject.createNew ("app.aegdistribuzione.articolo");Debug.locals.put("a", _a);
 BA.debugLineNum = 104;BA.debugLine="Dim prezzo As Float = Cursor1.GetString(\"prezzo\"";
Debug.ShouldStop(128);
_prezzo = BA.numberCast(float.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("prezzo"))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 105;BA.debugLine="a.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
Debug.ShouldStop(256);
_a.runClassMethod (app.aegdistribuzione.articolo.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("codice")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("descrizione")))),(Object)(_prezzo),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_ultima_modifica")))));
 BA.debugLineNum = 107;BA.debugLine="Articoli.Add(a)";
Debug.ShouldStop(1024);
_articoli.runVoidMethod ("Add",(Object)((_a)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 109;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(4096);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 110;BA.debugLine="Return Articoli";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) return _articoli;
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cercaclientipernome(RemoteObject __ref,RemoteObject _denom) throws Exception{
try {
		Debug.PushSubsStack("CercaClientiPerNome (database) ","database",2,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("cercaclientipernome")) { return __ref.runUserSub(false, "database","cercaclientipernome", __ref, _denom);}
RemoteObject _clienti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _c = RemoteObject.declareNull("app.aegdistribuzione.cliente");
Debug.locals.put("denom", _denom);
 BA.debugLineNum = 78;BA.debugLine="Public Sub CercaClientiPerNome(denom As String) As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Dim clienti As List";
Debug.ShouldStop(16384);
_clienti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("clienti", _clienti);
 BA.debugLineNum = 80;BA.debugLine="clienti.Initialize";
Debug.ShouldStop(32768);
_clienti.runVoidMethod ("Initialize");
 BA.debugLineNum = 81;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(65536);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 82;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, codice, den";
Debug.ShouldStop(131072);
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT id, codice, denominazione, indirizzo, piva, data_ultima_modifica "),RemoteObject.createImmutable(" FROM cliente WHERE denominazione like ? ORDER BY denominazione LIMIT ?;"))),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {RemoteObject.concat(RemoteObject.createImmutable("%"),_denom,RemoteObject.createImmutable("%")),BA.NumberToString(__ref.getField(true,"_max_results"))}))));
 BA.debugLineNum = 85;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="Dim c As Cliente";
Debug.ShouldStop(2097152);
_c = RemoteObject.createNew ("app.aegdistribuzione.cliente");Debug.locals.put("c", _c);
 BA.debugLineNum = 87;BA.debugLine="Cursor1.Position=i";
Debug.ShouldStop(4194304);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 88;BA.debugLine="c.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
Debug.ShouldStop(8388608);
_c.runClassMethod (app.aegdistribuzione.cliente.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("codice")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denominazione")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("indirizzo")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("piva")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_ultima_modifica")))));
 BA.debugLineNum = 90;BA.debugLine="clienti.Add(c)";
Debug.ShouldStop(33554432);
_clienti.runVoidMethod ("Add",(Object)((_c)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 92;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(134217728);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 93;BA.debugLine="Return clienti";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return _clienti;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim Sql1 As SQL";
database._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql1",database._sql1);
 //BA.debugLineNum = 3;BA.debugLine="Dim MAX_RESULTS As Int=100";
database._max_results = BA.numberCast(int.class, 100);__ref.setField("_max_results",database._max_results);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _close(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Close (database) ","database",2,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("close")) { return __ref.runUserSub(false, "database","close", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Public Sub Close";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="If Sql1.IsInitialized Then";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_sql1").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 26;BA.debugLine="Sql1.Close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sql1").runVoidMethod ("Close");
 };
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtables(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateTables (database) ","database",2,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("createtables")) { return __ref.runUserSub(false, "database","createtables", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Sub CreateTables";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS cliente;\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS cliente;")));
 BA.debugLineNum = 33;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE cliente (id INTEG";
Debug.ShouldStop(1);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE cliente (id INTEGER PRIMARY KEY, codice TEXT, denominazione TEXT, indirizzo TEXT, piva TEXT, data_ultima_modifica TEXT);")));
 BA.debugLineNum = 36;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS articolo;";
Debug.ShouldStop(8);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS articolo;")));
 BA.debugLineNum = 37;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE articolo (id INTE";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE articolo (id INTEGER PRIMARY KEY, codice TEXT, descrizione TEXT, prezzo FLOAT, data_ultima_modifica TEXT);")));
 BA.debugLineNum = 40;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS ordine_in";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS ordine_in_corso;")));
 BA.debugLineNum = 41;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE ordine_in_corso (";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE ordine_in_corso (id INTEGER PRIMARY KEY, id_cliente INTEGER, note TEXT);")));
 BA.debugLineNum = 44;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS voce_ordi";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS voce_ordine_in_corso;")));
 BA.debugLineNum = 45;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE voce_ordine_in_co";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE voce_ordine_in_corso (id INTEGER PRIMARY KEY, cod_art TEXT, desc_art TEXT, "),RemoteObject.createImmutable("id_ordine INTEGER, qta INTEGER, prezzo FLOAT, note TEXT);"))));
 BA.debugLineNum = 49;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS ordine;\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS ordine;")));
 BA.debugLineNum = 50;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE ordine (id INTEGE";
Debug.ShouldStop(131072);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE ordine (id INTEGER PRIMARY KEY, data_invio TEXT, id_cliente INTEGER, id_utente INTEGER, note TEXT);")));
 BA.debugLineNum = 53;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS voce_ordi";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS voce_ordine;")));
 BA.debugLineNum = 54;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE voce_ordine (id I";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE voce_ordine (id INTEGER PRIMARY KEY, cod_art TEXT, desc_art TEXT, "),RemoteObject.createImmutable("id_ordine INTEGER, qta INTEGER, prezzo FLOAT, note TEXT);"))));
 BA.debugLineNum = 58;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS preferiti";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS preferiti;")));
 BA.debugLineNum = 59;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE preferiti (id_cli";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE preferiti (id_cliente INTEGER, cod_art TEXT, desc_art TEXT, "),RemoteObject.createImmutable("id_art INTEGER, occorrenze INTEGER);"))));
 BA.debugLineNum = 63;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS utente;\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE IF EXISTS utente;")));
 BA.debugLineNum = 64;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE utente (id INTEGE";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE utente (id INTEGER PRIMARY KEY, username TEXT, ultimo_accesso TEXT);")));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eliminaordineincorso(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("EliminaOrdineInCorso (database) ","database",2,__ref.getField(false, "ba"),__ref,380);
if (RapidSub.canDelegate("eliminaordineincorso")) { return __ref.runUserSub(false, "database","eliminaordineincorso", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 380;BA.debugLine="Public Sub EliminaOrdineInCorso(id As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 381;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 382;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM voce_ordine_in_co";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM voce_ordine_in_corso WHERE id_ordine = ?;")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 BA.debugLineNum = 383;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM ordine_in_corso W";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM ordine_in_corso WHERE id = ?;")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 BA.debugLineNum = 384;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 385;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(1);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eliminavoce(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("EliminaVoce (database) ","database",2,__ref.getField(false, "ba"),__ref,449);
if (RapidSub.canDelegate("eliminavoce")) { return __ref.runUserSub(false, "database","eliminavoce", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 449;BA.debugLine="Public Sub EliminaVoce(id As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 450;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(2);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 451;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM voce_ordine_in_co";
Debug.ShouldStop(4);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM voce_ordine_in_corso WHERE id = ?")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 BA.debugLineNum = 452;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(8);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 453;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 454;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getarticoli(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetArticoli (database) ","database",2,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("getarticoli")) { return __ref.runUserSub(false, "database","getarticoli", __ref);}
RemoteObject _articoli = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("app.aegdistribuzione.articolo");
RemoteObject _prezzo = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 113;BA.debugLine="public Sub GetArticoli() As List";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim Articoli As List";
Debug.ShouldStop(131072);
_articoli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Articoli", _articoli);
 BA.debugLineNum = 115;BA.debugLine="Articoli.Initialize";
Debug.ShouldStop(262144);
_articoli.runVoidMethod ("Initialize");
 BA.debugLineNum = 116;BA.debugLine="Dim Cursor1 As Cursor = Sql1.ExecQuery2(\"SELECT i";
Debug.ShouldStop(524288);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT id, codice, descrizione, prezzo, data_ultima_modifica FROM articolo LIMIT ?;")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(true,"_max_results"))}))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 118;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
Debug.ShouldStop(2097152);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 119;BA.debugLine="Cursor1.Position=i";
Debug.ShouldStop(4194304);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 120;BA.debugLine="Dim a As Articolo";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("app.aegdistribuzione.articolo");Debug.locals.put("a", _a);
 BA.debugLineNum = 121;BA.debugLine="Dim prezzo As Float = Cursor1.GetString(\"prezzo\"";
Debug.ShouldStop(16777216);
_prezzo = BA.numberCast(float.class, _cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("prezzo"))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 122;BA.debugLine="a.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
Debug.ShouldStop(33554432);
_a.runClassMethod (app.aegdistribuzione.articolo.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("codice")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("descrizione")))),(Object)(_prezzo),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_ultima_modifica")))));
 BA.debugLineNum = 124;BA.debugLine="Articoli.Add(a)";
Debug.ShouldStop(134217728);
_articoli.runVoidMethod ("Add",(Object)((_a)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 126;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(536870912);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 127;BA.debugLine="Return Articoli";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return _articoli;
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcliente(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetCliente (database) ","database",2,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("getcliente")) { return __ref.runUserSub(false, "database","getcliente", __ref, _id);}
RemoteObject _c = RemoteObject.declareNull("app.aegdistribuzione.cliente");
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
Debug.locals.put("id", _id);
 BA.debugLineNum = 265;BA.debugLine="Public Sub GetCliente(id As Int) As Cliente";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="Dim c As Cliente";
Debug.ShouldStop(512);
_c = RemoteObject.createNew ("app.aegdistribuzione.cliente");Debug.locals.put("c", _c);
 BA.debugLineNum = 267;BA.debugLine="Dim qry As String = \"SELECT id, codice,denominazi";
Debug.ShouldStop(1024);
_qry = BA.ObjectToString("SELECT id, codice,denominazione,indirizzo,piva,data_ultima_modifica from CLIENTE where id = ?;");Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 268;BA.debugLine="Dim Cursor1 As Cursor = Sql1.ExecQuery2(qry, Arra";
Debug.ShouldStop(2048);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(_qry),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_id)}))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 269;BA.debugLine="For i = 0 To Cursor1.RowCount - 1";
Debug.ShouldStop(4096);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 270;BA.debugLine="Cursor1.Position = i";
Debug.ShouldStop(8192);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 271;BA.debugLine="c.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
Debug.ShouldStop(16384);
_c.runClassMethod (app.aegdistribuzione.cliente.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("codice")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denominazione")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("indirizzo")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("piva")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_ultima_modifica")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 274;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(131072);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 275;BA.debugLine="Return c";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return _c;
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getclienti(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetClienti (database) ","database",2,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("getclienti")) { return __ref.runUserSub(false, "database","getclienti", __ref);}
RemoteObject _clienti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _c = RemoteObject.declareNull("app.aegdistribuzione.cliente");
 BA.debugLineNum = 130;BA.debugLine="Public Sub GetClienti() As List";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Dim Clienti As List";
Debug.ShouldStop(4);
_clienti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Clienti", _clienti);
 BA.debugLineNum = 132;BA.debugLine="Clienti.Initialize";
Debug.ShouldStop(8);
_clienti.runVoidMethod ("Initialize");
 BA.debugLineNum = 133;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(16);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 134;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, codice, den";
Debug.ShouldStop(32);
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT id, codice, denominazione, indirizzo, piva, data_ultima_modifica "),RemoteObject.createImmutable(" FROM cliente ORDER BY denominazione LIMIT ?;"))),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(true,"_max_results"))}))));
 BA.debugLineNum = 137;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 138;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
Debug.ShouldStop(512);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 139;BA.debugLine="Dim c As Cliente";
Debug.ShouldStop(1024);
_c = RemoteObject.createNew ("app.aegdistribuzione.cliente");Debug.locals.put("c", _c);
 BA.debugLineNum = 140;BA.debugLine="Cursor1.Position=i";
Debug.ShouldStop(2048);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 141;BA.debugLine="c.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
Debug.ShouldStop(4096);
_c.runClassMethod (app.aegdistribuzione.cliente.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("codice")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("denominazione")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("indirizzo")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("piva")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_ultima_modifica")))));
 BA.debugLineNum = 143;BA.debugLine="Clienti.Add(c)";
Debug.ShouldStop(16384);
_clienti.runVoidMethod ("Add",(Object)((_c)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 145;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 146;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(131072);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 147;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(262144);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 148;BA.debugLine="Return Clienti";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return _clienti;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getordineincorso(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetOrdineInCorso (database) ","database",2,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("getordineincorso")) { return __ref.runUserSub(false, "database","getordineincorso", __ref, _id);}
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
RemoteObject _crs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _crs2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _prezzo = RemoteObject.createImmutable(0f);
Debug.locals.put("id", _id);
 BA.debugLineNum = 388;BA.debugLine="Public Sub GetOrdineInCorso(id As Int) As Ordine";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="Dim o As Ordine";
Debug.ShouldStop(16);
_o = RemoteObject.createNew ("app.aegdistribuzione.ordine");Debug.locals.put("o", _o);
 BA.debugLineNum = 390;BA.debugLine="Dim crs As Cursor = Sql1.ExecQuery2(\"SELECT id, i";
Debug.ShouldStop(32);
_crs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_crs.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT id, id_cliente, note FROM ordine_in_corso WHERE id = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_id)}))));Debug.locals.put("crs", _crs);
 BA.debugLineNum = 391;BA.debugLine="If crs.RowCount > 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_crs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 392;BA.debugLine="crs.Position = 0";
Debug.ShouldStop(128);
_crs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 393;BA.debugLine="o.Initialize(crs.GetInt2(0), crs.GetInt2(1), Sta";
Debug.ShouldStop(256);
_o.runClassMethod (app.aegdistribuzione.ordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_crs.runMethod(true,"GetInt2",(Object)(BA.numberCast(int.class, 0)))),(Object)(_crs.runMethod(true,"GetInt2",(Object)(BA.numberCast(int.class, 1)))),(Object)(database._starter._user.getField(true,"_id")),(Object)(BA.ObjectToString("")),(Object)(_crs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 2)))));
 }else {
 BA.debugLineNum = 395;BA.debugLine="Return Null";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) return (database.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 397;BA.debugLine="crs.Close";
Debug.ShouldStop(4096);
_crs.runVoidMethod ("Close");
 BA.debugLineNum = 398;BA.debugLine="Dim crs2 As Cursor = Sql1.ExecQuery2(\"SELECT id,c";
Debug.ShouldStop(8192);
_crs2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_crs2.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT id,cod_art,desc_art,id_ordine,qta,prezzo,note FROM voce_ordine_in_corso "),RemoteObject.createImmutable("WHERE id_ordine = ?;"))),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_id)}))));Debug.locals.put("crs2", _crs2);
 BA.debugLineNum = 400;BA.debugLine="For i=0 To crs2.RowCount - 1";
Debug.ShouldStop(32768);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_crs2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 401;BA.debugLine="crs2.Position = i";
Debug.ShouldStop(65536);
_crs2.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 402;BA.debugLine="Dim v As VoceOrdine";
Debug.ShouldStop(131072);
_v = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("v", _v);
 BA.debugLineNum = 403;BA.debugLine="Dim prezzo As Float = crs2.GetString(\"prezzo\")";
Debug.ShouldStop(262144);
_prezzo = BA.numberCast(float.class, _crs2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("prezzo"))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 404;BA.debugLine="v.Initialize(crs2.GetInt2(0), crs2.GetString2(1)";
Debug.ShouldStop(524288);
_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_crs2.runMethod(true,"GetInt2",(Object)(BA.numberCast(int.class, 0)))),(Object)(_crs2.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 1)))),(Object)(_crs2.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 2)))),(Object)(_id),(Object)(_crs2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("note")))),(Object)(_prezzo),(Object)(_crs2.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("qta")))));
 BA.debugLineNum = 406;BA.debugLine="o.Voci.Add(v)";
Debug.ShouldStop(2097152);
_o.getField(false,"_voci").runVoidMethod ("Add",(Object)((_v)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 408;BA.debugLine="crs2.Close";
Debug.ShouldStop(8388608);
_crs2.runVoidMethod ("Close");
 BA.debugLineNum = 409;BA.debugLine="Return o";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return _o;
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpreferiticliente(RemoteObject __ref,RemoteObject _cid) throws Exception{
try {
		Debug.PushSubsStack("GetPreferitiCliente (database) ","database",2,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("getpreferiticliente")) { return __ref.runUserSub(false, "database","getpreferiticliente", __ref, _cid);}
RemoteObject _preferiti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("app.aegdistribuzione.preferito");
Debug.locals.put("cid", _cid);
 BA.debugLineNum = 278;BA.debugLine="Public Sub GetPreferitiCliente(cid As Int) As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="Dim preferiti As List";
Debug.ShouldStop(4194304);
_preferiti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("preferiti", _preferiti);
 BA.debugLineNum = 280;BA.debugLine="Dim qry As String = \"SELECT id_cliente,cod_art,de";
Debug.ShouldStop(8388608);
_qry = BA.ObjectToString("SELECT id_cliente,cod_art,desc_art,id_art,occorrenze FROM preferiti WHERE id_cliente = ? ORDER BY occorrenze DESC;");Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 281;BA.debugLine="Dim Cursor1 As Cursor = Sql1.ExecQuery2(qry, Arra";
Debug.ShouldStop(16777216);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(_qry),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_cid)}))));Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 282;BA.debugLine="preferiti.Initialize";
Debug.ShouldStop(33554432);
_preferiti.runVoidMethod ("Initialize");
 BA.debugLineNum = 284;BA.debugLine="For i = 0 To Cursor1.RowCount - 1";
Debug.ShouldStop(134217728);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 285;BA.debugLine="Cursor1.Position = i";
Debug.ShouldStop(268435456);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 286;BA.debugLine="Dim p As Preferito";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("app.aegdistribuzione.preferito");Debug.locals.put("p", _p);
 BA.debugLineNum = 287;BA.debugLine="p.Initialize(Cursor1.GetInt(\"id_art\"), Cursor1.G";
Debug.ShouldStop(1073741824);
_p.runClassMethod (app.aegdistribuzione.preferito.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id_art")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cod_art")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("desc_art")))),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id_cliente")))),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("occorrenze")))));
 BA.debugLineNum = 289;BA.debugLine="preferiti.Add(p)";
Debug.ShouldStop(1);
_preferiti.runVoidMethod ("Add",(Object)((_p)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 292;BA.debugLine="Return preferiti";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return _preferiti;
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getutente(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetUtente (database) ","database",2,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("getutente")) { return __ref.runUserSub(false, "database","getutente", __ref);}
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _u = RemoteObject.declareNull("app.aegdistribuzione.utente");
 BA.debugLineNum = 151;BA.debugLine="Public Sub GetUtente() As Utente";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(8388608);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 153;BA.debugLine="Cursor1 = Sql1.ExecQuery(\"SELECT id, username, ul";
Debug.ShouldStop(16777216);
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT id, username, ultimo_accesso FROM utente LIMIT 1;"))));
 BA.debugLineNum = 154;BA.debugLine="If Cursor1.RowCount = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 155;BA.debugLine="Return Null";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return (database.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 158;BA.debugLine="Cursor1.Position = 0";
Debug.ShouldStop(536870912);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 159;BA.debugLine="Dim u As Utente";
Debug.ShouldStop(1073741824);
_u = RemoteObject.createNew ("app.aegdistribuzione.utente");Debug.locals.put("u", _u);
 BA.debugLineNum = 160;BA.debugLine="u.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetStr";
Debug.ShouldStop(-2147483648);
_u.runClassMethod (app.aegdistribuzione.utente.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("username")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("ultimo_accesso")))));
 BA.debugLineNum = 161;BA.debugLine="Return u";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return _u;
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvoce(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetVoce (database) ","database",2,__ref.getField(false, "ba"),__ref,456);
if (RapidSub.canDelegate("getvoce")) { return __ref.runUserSub(false, "database","getvoce", __ref, _id);}
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _crs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("id", _id);
 BA.debugLineNum = 456;BA.debugLine="Public Sub GetVoce(id As Int) As VoceOrdine";
Debug.ShouldStop(128);
 BA.debugLineNum = 457;BA.debugLine="Dim v As VoceOrdine";
Debug.ShouldStop(256);
_v = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("v", _v);
 BA.debugLineNum = 458;BA.debugLine="Dim crs As Cursor = Sql1.ExecQuery2(\"SELECT id,co";
Debug.ShouldStop(512);
_crs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_crs.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT id,cod_art, desc_art, id_ordine, qta, prezzo, note FROM voce_ordine_in_corso WHERE id=?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_id)}))));Debug.locals.put("crs", _crs);
 BA.debugLineNum = 460;BA.debugLine="If crs.RowCount == 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_crs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 461;BA.debugLine="Return Null";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return (database.__c.getField(false,"Null"));
 }else {
 BA.debugLineNum = 463;BA.debugLine="crs.Position = 0";
Debug.ShouldStop(16384);
_crs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 465;BA.debugLine="v.Initialize(crs.GetInt(\"id\"), crs.GetString(\"co";
Debug.ShouldStop(65536);
_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_crs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_crs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("cod_art")))),(Object)(_crs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("desc_art")))),(Object)(_crs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id_ordine")))),(Object)(_crs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("note")))),(Object)(BA.numberCast(float.class, _crs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("prezzo"))))),(Object)(_crs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("qta")))));
 BA.debugLineNum = 467;BA.debugLine="Return v";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return _v;
 };
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (database) ","database",2,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "database","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="Sql1.Initialize(File.DirInternal, \"aegd.db\", True";
Debug.ShouldStop(64);
__ref.getField(false,"_sql1").runVoidMethod ("Initialize",(Object)(database.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("aegd.db")),(Object)(database.__c.getField(true,"True")));
 BA.debugLineNum = 8;BA.debugLine="If TablesExist = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (app.aegdistribuzione.database.class, "_tablesexist"),database.__c.getField(true,"False"))) { 
 BA.debugLineNum = 9;BA.debugLine="CreateTables";
Debug.ShouldStop(256);
__ref.runClassMethod (app.aegdistribuzione.database.class, "_createtables");
 };
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nuovavoce(RemoteObject __ref,RemoteObject _o,RemoteObject _cod,RemoteObject _desc,RemoteObject _q,RemoteObject _prz,RemoteObject _nt) throws Exception{
try {
		Debug.PushSubsStack("NuovaVoce (database) ","database",2,__ref.getField(false, "ba"),__ref,427);
if (RapidSub.canDelegate("nuovavoce")) { return __ref.runUserSub(false, "database","nuovavoce", __ref, _o, _cod, _desc, _q, _prz, _nt);}
RemoteObject _crs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("o", _o);
Debug.locals.put("cod", _cod);
Debug.locals.put("desc", _desc);
Debug.locals.put("q", _q);
Debug.locals.put("prz", _prz);
Debug.locals.put("nt", _nt);
 BA.debugLineNum = 427;BA.debugLine="Public Sub NuovaVoce(o As Ordine, cod As String, d";
Debug.ShouldStop(1024);
 BA.debugLineNum = 428;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 429;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO voce_ordine_in_co";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO voce_ordine_in_corso (cod_art, desc_art, id_ordine, qta, prezzo, note) "),RemoteObject.createImmutable("VALUES(?,?,?,?,?,?);"))),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_cod),(_desc),(_o.getField(true,"_id")),(_q),(_prz),(_nt)})))));
 BA.debugLineNum = 431;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 432;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(32768);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 433;BA.debugLine="Dim crs As Cursor = Sql1.ExecQuery(\"SELECT last_i";
Debug.ShouldStop(65536);
_crs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_crs.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT last_insert_rowid();"))));Debug.locals.put("crs", _crs);
 BA.debugLineNum = 434;BA.debugLine="crs.Position = 0";
Debug.ShouldStop(131072);
_crs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 435;BA.debugLine="Dim id As Int = crs.GetInt2(0)";
Debug.ShouldStop(262144);
_id = _crs.runMethod(true,"GetInt2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 436;BA.debugLine="crs.Close";
Debug.ShouldStop(524288);
_crs.runVoidMethod ("Close");
 BA.debugLineNum = 437;BA.debugLine="Dim v As VoceOrdine";
Debug.ShouldStop(1048576);
_v = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("v", _v);
 BA.debugLineNum = 438;BA.debugLine="v.Initialize(id, cod, desc, o.Id, nt, prz, q)";
Debug.ShouldStop(2097152);
_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_desc),(Object)(_o.getField(true,"_id")),(Object)(_nt),(Object)(_prz),(Object)(_q));
 BA.debugLineNum = 439;BA.debugLine="Return v";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return _v;
 BA.debugLineNum = 440;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nuovoordine(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("NuovoOrdine (database) ","database",2,__ref.getField(false, "ba"),__ref,412);
if (RapidSub.canDelegate("nuovoordine")) { return __ref.runUserSub(false, "database","nuovoordine", __ref, _c);}
RemoteObject _crs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
Debug.locals.put("c", _c);
 BA.debugLineNum = 412;BA.debugLine="Public Sub NuovoOrdine(c As Cliente) As Ordine";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 413;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 414;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO ordine_in_corso (";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO ordine_in_corso (id_cliente) VALUES(?);")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_c.getField(true,"_id"))})))));
 BA.debugLineNum = 415;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 416;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 418;BA.debugLine="Dim crs As Cursor = Sql1.ExecQuery(\"SELECT last_i";
Debug.ShouldStop(2);
_crs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_crs.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT last_insert_rowid();"))));Debug.locals.put("crs", _crs);
 BA.debugLineNum = 419;BA.debugLine="crs.Position = 0";
Debug.ShouldStop(4);
_crs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 420;BA.debugLine="Dim id As Int = crs.GetInt2(0)";
Debug.ShouldStop(8);
_id = _crs.runMethod(true,"GetInt2",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 421;BA.debugLine="crs.Close";
Debug.ShouldStop(16);
_crs.runVoidMethod ("Close");
 BA.debugLineNum = 422;BA.debugLine="Dim o As Ordine";
Debug.ShouldStop(32);
_o = RemoteObject.createNew ("app.aegdistribuzione.ordine");Debug.locals.put("o", _o);
 BA.debugLineNum = 423;BA.debugLine="o.Initialize(id, c.Id, Starter.User.Id, \"\", \"\")";
Debug.ShouldStop(64);
_o.runClassMethod (app.aegdistribuzione.ordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_c.getField(true,"_id")),(Object)(database._starter._user.getField(true,"_id")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 424;BA.debugLine="Return o";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return _o;
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ordiniincorsopercliente(RemoteObject __ref,RemoteObject _idcliente) throws Exception{
try {
		Debug.PushSubsStack("OrdiniInCorsoPerCliente (database) ","database",2,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("ordiniincorsopercliente")) { return __ref.runUserSub(false, "database","ordiniincorsopercliente", __ref, _idcliente);}
RemoteObject _ordini = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
Debug.locals.put("IdCliente", _idcliente);
 BA.debugLineNum = 207;BA.debugLine="Public Sub OrdiniInCorsoPerCliente(IdCliente As In";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="Dim Ordini As List";
Debug.ShouldStop(32768);
_ordini = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ordini", _ordini);
 BA.debugLineNum = 209;BA.debugLine="Ordini.Initialize";
Debug.ShouldStop(65536);
_ordini.runVoidMethod ("Initialize");
 BA.debugLineNum = 210;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(131072);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 211;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id,id_cliente,n";
Debug.ShouldStop(262144);
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT id,id_cliente,note FROM ordine_in_corso WHERE id_cliente = ? ORDER BY id DESC;")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idcliente)}))));
 BA.debugLineNum = 213;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 214;BA.debugLine="Cursor1.Position = i";
Debug.ShouldStop(2097152);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 215;BA.debugLine="Dim o As Ordine";
Debug.ShouldStop(4194304);
_o = RemoteObject.createNew ("app.aegdistribuzione.ordine");Debug.locals.put("o", _o);
 BA.debugLineNum = 216;BA.debugLine="o.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetIn";
Debug.ShouldStop(8388608);
_o.runClassMethod (app.aegdistribuzione.ordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id_cliente")))),(Object)(database._starter._user.getField(true,"_id")),(Object)(BA.ObjectToString("")),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("note")))));
 BA.debugLineNum = 218;BA.debugLine="o.Voci.AddAll(CaricaVociOrdineInCorso(o.Id))";
Debug.ShouldStop(33554432);
_o.getField(false,"_voci").runVoidMethod ("AddAll",(Object)(__ref.runClassMethod (app.aegdistribuzione.database.class, "_caricavociordineincorso",(Object)(_o.getField(true,"_id")))));
 BA.debugLineNum = 219;BA.debugLine="Ordini.Add(o)";
Debug.ShouldStop(67108864);
_ordini.runVoidMethod ("Add",(Object)((_o)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 221;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(268435456);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 222;BA.debugLine="Return Ordini";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) return _ordini;
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ordinipercliente(RemoteObject __ref,RemoteObject _idcliente) throws Exception{
try {
		Debug.PushSubsStack("OrdiniPerCliente (database) ","database",2,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("ordinipercliente")) { return __ref.runUserSub(false, "database","ordinipercliente", __ref, _idcliente);}
RemoteObject _ordini = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
Debug.locals.put("IdCliente", _idcliente);
 BA.debugLineNum = 171;BA.debugLine="Public Sub OrdiniPerCliente(IdCliente As Int) As L";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="Dim Ordini As List";
Debug.ShouldStop(2048);
_ordini = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Ordini", _ordini);
 BA.debugLineNum = 173;BA.debugLine="Ordini.Initialize";
Debug.ShouldStop(4096);
_ordini.runVoidMethod ("Initialize");
 BA.debugLineNum = 174;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(8192);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 175;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, data_invio,";
Debug.ShouldStop(16384);
_cursor1.setObject(__ref.getField(false,"_sql1").runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT id, data_invio,id_cliente,id_utente,note FROM ordine WHERE id_cliente = ? ORDER BY id DESC;")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idcliente)}))));
 BA.debugLineNum = 177;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
Debug.ShouldStop(65536);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 178;BA.debugLine="Cursor1.Position = i";
Debug.ShouldStop(131072);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 179;BA.debugLine="Dim o As Ordine";
Debug.ShouldStop(262144);
_o = RemoteObject.createNew ("app.aegdistribuzione.ordine");Debug.locals.put("o", _o);
 BA.debugLineNum = 180;BA.debugLine="o.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetIn";
Debug.ShouldStop(524288);
_o.runClassMethod (app.aegdistribuzione.ordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")))),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id_cliente")))),(Object)(_cursor1.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id_utente")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data_invio")))),(Object)(_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("note")))));
 BA.debugLineNum = 182;BA.debugLine="o.Voci.AddAll(CaricaVoci(o.Id))";
Debug.ShouldStop(2097152);
_o.getField(false,"_voci").runVoidMethod ("AddAll",(Object)(__ref.runClassMethod (app.aegdistribuzione.database.class, "_caricavoci",(Object)(_o.getField(true,"_id")))));
 BA.debugLineNum = 183;BA.debugLine="Ordini.Add(o)";
Debug.ShouldStop(4194304);
_ordini.runVoidMethod ("Add",(Object)((_o)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 185;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(16777216);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 186;BA.debugLine="Return Ordini";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) return _ordini;
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvaarticoli(RemoteObject __ref,RemoteObject _articoli) throws Exception{
try {
		Debug.PushSubsStack("SalvaArticoli (database) ","database",2,__ref.getField(false, "ba"),__ref,254);
if (RapidSub.canDelegate("salvaarticoli")) { return __ref.runUserSub(false, "database","salvaarticoli", __ref, _articoli);}
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _a = RemoteObject.declareNull("app.aegdistribuzione.articolo");
Debug.locals.put("articoli", _articoli);
 BA.debugLineNum = 254;BA.debugLine="Public Sub SalvaArticoli(articoli As List)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 255;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 256;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM articolo\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE FROM articolo")));
 BA.debugLineNum = 257;BA.debugLine="Dim qry As String = \"INSERT INTO articolo (id, co";
Debug.ShouldStop(1);
_qry = BA.ObjectToString("INSERT INTO articolo (id, codice, descrizione, prezzo, data_ultima_modifica) VALUES(?,?,?,?,?);");Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 258;BA.debugLine="For Each a As Articolo In articoli";
Debug.ShouldStop(2);
{
final RemoteObject group4 = _articoli;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_a = (group4.runMethod(false,"Get",index4));Debug.locals.put("a", _a);
Debug.locals.put("a", _a);
 BA.debugLineNum = 259;BA.debugLine="Sql1.ExecNonQuery2(qry, Array As Object(a.Id, a.";
Debug.ShouldStop(4);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(_qry),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_a.getField(true,"_id")),(_a.getField(true,"_codice")),(_a.getField(true,"_descrizione")),(_a.getField(true,"_prezzo")),(_a.getField(true,"_dataultimamodifica"))})))));
 }
}Debug.locals.put("a", _a);
;
 BA.debugLineNum = 261;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 262;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(32);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvaclienti(RemoteObject __ref,RemoteObject _clienti) throws Exception{
try {
		Debug.PushSubsStack("SalvaClienti (database) ","database",2,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("salvaclienti")) { return __ref.runUserSub(false, "database","salvaclienti", __ref, _clienti);}
RemoteObject _qry = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.declareNull("app.aegdistribuzione.cliente");
Debug.locals.put("clienti", _clienti);
 BA.debugLineNum = 243;BA.debugLine="Public Sub SalvaClienti(clienti As List)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(524288);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 245;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM cliente\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE FROM cliente")));
 BA.debugLineNum = 246;BA.debugLine="Dim qry As String = \"INSERT INTO cliente (id, cod";
Debug.ShouldStop(2097152);
_qry = BA.ObjectToString("INSERT INTO cliente (id, codice,denominazione,indirizzo,piva,data_ultima_modifica) VALUES(?,?,?,?,?,?);");Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 247;BA.debugLine="For Each c As Cliente In clienti";
Debug.ShouldStop(4194304);
{
final RemoteObject group4 = _clienti;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_c = (group4.runMethod(false,"Get",index4));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 248;BA.debugLine="Sql1.ExecNonQuery2(qry, Array As Object(c.Id, c.";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(_qry),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_c.getField(true,"_id")),(_c.getField(true,"_codice")),(_c.getField(true,"_denominazione")),(_c.getField(true,"_indirizzo")),(_c.getField(true,"_partitaiva")),(_c.getField(true,"_dataultimamodifica"))})))));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 250;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 251;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvaordine(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("SalvaOrdine (database) ","database",2,__ref.getField(false, "ba"),__ref,295);
if (RapidSub.canDelegate("salvaordine")) { return __ref.runUserSub(false, "database","salvaordine", __ref, _o);}
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("o", _o);
 BA.debugLineNum = 295;BA.debugLine="Public Sub SalvaOrdine(o As Ordine)";
Debug.ShouldStop(64);
 BA.debugLineNum = 296;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 297;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM voce_ordine where";
Debug.ShouldStop(256);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM voce_ordine where id_ordine = ?;")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_o.getField(true,"_id"))})))));
 BA.debugLineNum = 298;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM ordine where id =";
Debug.ShouldStop(512);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM ordine where id = ?")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_o.getField(true,"_id"))})))));
 BA.debugLineNum = 299;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO ordine (id, data_";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_o.getField(true,"_id")),(_o.getField(true,"_datainvio")),(_o.getField(true,"_idcliente")),(_o.getField(true,"_idutente")),(_o.getField(true,"_note"))})))));
 BA.debugLineNum = 302;BA.debugLine="For Each v As VoceOrdine In o.Voci";
Debug.ShouldStop(8192);
{
final RemoteObject group5 = _o.getField(false,"_voci");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (group5.runMethod(false,"Get",index5));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 303;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO voce_ordine (id,";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_v.getField(true,"_id")),(_v.getField(true,"_codart")),(_v.getField(true,"_descart")),(_v.getField(true,"_idordine")),(_v.getField(true,"_qta")),(_v.getField(true,"_prezzo")),(_v.getField(true,"_note"))})))));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 307;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(262144);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 308;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(524288);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvaordineincorso(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("SalvaOrdineInCorso (database) ","database",2,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("salvaordineincorso")) { return __ref.runUserSub(false, "database","salvaordineincorso", __ref, _o);}
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("o", _o);
 BA.debugLineNum = 369;BA.debugLine="Public Sub SalvaOrdineInCorso(o As Ordine)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 370;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(131072);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 371;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO ordine_in_corso (";
Debug.ShouldStop(262144);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO ordine_in_corso (id_cliente, note) VALUES(?,?);")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_o.getField(true,"_idcliente")),(_o.getField(true,"_note"))})))));
 BA.debugLineNum = 372;BA.debugLine="For Each v As VoceOrdine In o.Voci";
Debug.ShouldStop(524288);
{
final RemoteObject group3 = _o.getField(false,"_voci");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (group3.runMethod(false,"Get",index3));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 373;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO voce_ordine_in_c";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO voce_ordine_in_corso (cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?);")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_v.getField(true,"_codart")),(_v.getField(true,"_descart")),(_v.getField(true,"_idordine")),(_v.getField(true,"_qta")),(_v.getField(true,"_prezzo")),(_v.getField(true,"_note"))})))));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 376;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 377;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvapreferiti(RemoteObject __ref,RemoteObject _preferiti) throws Exception{
try {
		Debug.PushSubsStack("SalvaPreferiti (database) ","database",2,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("salvapreferiti")) { return __ref.runUserSub(false, "database","salvapreferiti", __ref, _preferiti);}
RemoteObject _ins = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("app.aegdistribuzione.preferito");
Debug.locals.put("preferiti", _preferiti);
 BA.debugLineNum = 347;BA.debugLine="Public Sub SalvaPreferiti(preferiti As List)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 348;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 349;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM preferiti;\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE FROM preferiti;")));
 BA.debugLineNum = 350;BA.debugLine="Dim ins As String = \"INSERT INTO preferiti (id_cl";
Debug.ShouldStop(536870912);
_ins = BA.ObjectToString("INSERT INTO preferiti (id_cliente, cod_art, desc_art, id_art, occorrenze) VALUES(?,?,?,?,?);");Debug.locals.put("ins", _ins);Debug.locals.put("ins", _ins);
 BA.debugLineNum = 351;BA.debugLine="For Each p As Preferito In preferiti";
Debug.ShouldStop(1073741824);
{
final RemoteObject group4 = _preferiti;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_p = (group4.runMethod(false,"Get",index4));Debug.locals.put("p", _p);
Debug.locals.put("p", _p);
 BA.debugLineNum = 352;BA.debugLine="Sql1.ExecNonQuery2(ins, Array As Object(p.IdClie";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(_ins),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_p.getField(true,"_idcliente")),(_p.getField(true,"_codice")),(_p.getField(true,"_descrizione")),(_p.getField(true,"_idart")),(_p.getField(true,"_occorrenze"))})))));
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 354;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(2);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 355;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(4);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 356;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvapreferitipercliente(RemoteObject __ref,RemoteObject _preferiti,RemoteObject _id_cliente) throws Exception{
try {
		Debug.PushSubsStack("SalvaPreferitiPerCliente (database) ","database",2,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("salvapreferitipercliente")) { return __ref.runUserSub(false, "database","salvapreferitipercliente", __ref, _preferiti, _id_cliente);}
RemoteObject _ins = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("app.aegdistribuzione.preferito");
Debug.locals.put("preferiti", _preferiti);
Debug.locals.put("id_cliente", _id_cliente);
 BA.debugLineNum = 358;BA.debugLine="Public Sub SalvaPreferitiPerCliente(preferiti As L";
Debug.ShouldStop(32);
 BA.debugLineNum = 359;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(64);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 360;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM preferiti WHERE i";
Debug.ShouldStop(128);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM preferiti WHERE id_cliente = ?;")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id_cliente)})))));
 BA.debugLineNum = 361;BA.debugLine="Dim ins As String = \"INSERT INTO preferiti (id_cl";
Debug.ShouldStop(256);
_ins = BA.ObjectToString("INSERT INTO preferiti (id_cliente, cod_art, desc_art, id_art, occorrenze) VALUES(?,?,?,?,?);");Debug.locals.put("ins", _ins);Debug.locals.put("ins", _ins);
 BA.debugLineNum = 362;BA.debugLine="For Each p As Preferito In preferiti";
Debug.ShouldStop(512);
{
final RemoteObject group4 = _preferiti;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_p = (group4.runMethod(false,"Get",index4));Debug.locals.put("p", _p);
Debug.locals.put("p", _p);
 BA.debugLineNum = 363;BA.debugLine="Sql1.ExecNonQuery2(ins, Array As Object(p.IdClie";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(_ins),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_p.getField(true,"_idcliente")),(_p.getField(true,"_codice")),(_p.getField(true,"_descrizione")),(_p.getField(true,"_idart")),(_p.getField(true,"_occorrenze"))})))));
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 365;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 366;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(8192);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvastoricoordini(RemoteObject __ref,RemoteObject _ordini) throws Exception{
try {
		Debug.PushSubsStack("SalvaStoricoOrdini (database) ","database",2,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("salvastoricoordini")) { return __ref.runUserSub(false, "database","salvastoricoordini", __ref, _ordini);}
RemoteObject _qry1 = RemoteObject.createImmutable("");
RemoteObject _qry2 = RemoteObject.createImmutable("");
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("ordini", _ordini);
 BA.debugLineNum = 311;BA.debugLine="Public Sub SalvaStoricoOrdini(ordini As List)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 313;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM voce_ordine;\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE FROM voce_ordine;")));
 BA.debugLineNum = 314;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM ordine;\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE FROM ordine;")));
 BA.debugLineNum = 316;BA.debugLine="Dim qry1 As String = \"INSERT INTO ordine (id, dat";
Debug.ShouldStop(134217728);
_qry1 = BA.ObjectToString("INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);");Debug.locals.put("qry1", _qry1);Debug.locals.put("qry1", _qry1);
 BA.debugLineNum = 317;BA.debugLine="Dim qry2 As String = \"INSERT INTO voce_ordine (id";
Debug.ShouldStop(268435456);
_qry2 = BA.ObjectToString("INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);");Debug.locals.put("qry2", _qry2);Debug.locals.put("qry2", _qry2);
 BA.debugLineNum = 318;BA.debugLine="For Each o As Ordine In ordini";
Debug.ShouldStop(536870912);
{
final RemoteObject group6 = _ordini;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_o = (group6.runMethod(false,"Get",index6));Debug.locals.put("o", _o);
Debug.locals.put("o", _o);
 BA.debugLineNum = 319;BA.debugLine="Sql1.ExecNonQuery2(qry1, Array As Object(o.Id,o.";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(_qry1),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_o.getField(true,"_id")),(_o.getField(true,"_datainvio")),(_o.getField(true,"_idcliente")),(_o.getField(true,"_idutente")),(_o.getField(true,"_note"))})))));
 BA.debugLineNum = 321;BA.debugLine="For Each v As VoceOrdine In o.Voci";
Debug.ShouldStop(1);
{
final RemoteObject group8 = _o.getField(false,"_voci");
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_v = (group8.runMethod(false,"Get",index8));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 322;BA.debugLine="Sql1.ExecNonQuery2(qry2, Array As Object(v.Id,v";
Debug.ShouldStop(2);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(_qry2),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_v.getField(true,"_id")),(_v.getField(true,"_codart")),(_v.getField(true,"_descart")),(_v.getField(true,"_idordine")),(_v.getField(true,"_qta")),(_v.getField(true,"_prezzo")),(_v.getField(true,"_note"))})))));
 }
}Debug.locals.put("v", _v);
;
 }
}Debug.locals.put("o", _o);
;
 BA.debugLineNum = 325;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(16);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 326;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(32);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvastoricoordinipercliente(RemoteObject __ref,RemoteObject _ordini,RemoteObject _id_cliente) throws Exception{
try {
		Debug.PushSubsStack("SalvaStoricoOrdiniPerCliente (database) ","database",2,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("salvastoricoordinipercliente")) { return __ref.runUserSub(false, "database","salvastoricoordinipercliente", __ref, _ordini, _id_cliente);}
RemoteObject _qry1 = RemoteObject.createImmutable("");
RemoteObject _qry2 = RemoteObject.createImmutable("");
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("ordini", _ordini);
Debug.locals.put("id_cliente", _id_cliente);
 BA.debugLineNum = 329;BA.debugLine="Public Sub SalvaStoricoOrdiniPerCliente(ordini As";
Debug.ShouldStop(256);
 BA.debugLineNum = 330;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(512);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 331;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM voce_ordine WHERE";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM voce_ordine WHERE id_ordine IN (SELECT id FROM ordine WHERE id_cliente = ?);")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id_cliente)})))));
 BA.debugLineNum = 332;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM ordine WHERE id_c";
Debug.ShouldStop(2048);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM ordine WHERE id_cliente = ?;")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id_cliente)})))));
 BA.debugLineNum = 334;BA.debugLine="Dim qry1 As String = \"INSERT INTO ordine (id, dat";
Debug.ShouldStop(8192);
_qry1 = BA.ObjectToString("INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);");Debug.locals.put("qry1", _qry1);Debug.locals.put("qry1", _qry1);
 BA.debugLineNum = 335;BA.debugLine="Dim qry2 As String = \"INSERT INTO voce_ordine (id";
Debug.ShouldStop(16384);
_qry2 = BA.ObjectToString("INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);");Debug.locals.put("qry2", _qry2);Debug.locals.put("qry2", _qry2);
 BA.debugLineNum = 336;BA.debugLine="For Each o As Ordine In ordini";
Debug.ShouldStop(32768);
{
final RemoteObject group6 = _ordini;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_o = (group6.runMethod(false,"Get",index6));Debug.locals.put("o", _o);
Debug.locals.put("o", _o);
 BA.debugLineNum = 337;BA.debugLine="Sql1.ExecNonQuery2(qry1, Array As Object(o.Id,o.";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(_qry1),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_o.getField(true,"_id")),(_o.getField(true,"_datainvio")),(_o.getField(true,"_idcliente")),(_o.getField(true,"_idutente")),(_o.getField(true,"_note"))})))));
 BA.debugLineNum = 339;BA.debugLine="For Each v As VoceOrdine In o.Voci";
Debug.ShouldStop(262144);
{
final RemoteObject group8 = _o.getField(false,"_voci");
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_v = (group8.runMethod(false,"Get",index8));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 340;BA.debugLine="Sql1.ExecNonQuery2(qry2, Array As Object(v.Id,v";
Debug.ShouldStop(524288);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(_qry2),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_v.getField(true,"_id")),(_v.getField(true,"_codart")),(_v.getField(true,"_descart")),(_v.getField(true,"_idordine")),(_v.getField(true,"_qta")),(_v.getField(true,"_prezzo")),(_v.getField(true,"_note"))})))));
 }
}Debug.locals.put("v", _v);
;
 }
}Debug.locals.put("o", _o);
;
 BA.debugLineNum = 343;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 344;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvautente(RemoteObject __ref,RemoteObject _usr) throws Exception{
try {
		Debug.PushSubsStack("SalvaUtente (database) ","database",2,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("salvautente")) { return __ref.runUserSub(false, "database","salvautente", __ref, _usr);}
Debug.locals.put("usr", _usr);
 BA.debugLineNum = 442;BA.debugLine="Public Sub SalvaUtente(usr As Utente)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 443;BA.debugLine="Sql1.BeginTransaction";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sql1").runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 444;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO utente (id, usern";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sql1").runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO utente (id, username, ultimo_accesso) VALUES(?, ?, ?);")),(Object)(database.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_usr.getField(true,"_id")),(_usr.getField(true,"_nome")),(_usr.getField(true,"_ultimoaccesso"))})))));
 BA.debugLineNum = 445;BA.debugLine="Sql1.TransactionSuccessful";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sql1").runVoidMethod ("TransactionSuccessful");
 BA.debugLineNum = 446;BA.debugLine="Sql1.EndTransaction";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sql1").runVoidMethod ("EndTransaction");
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tablesexist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TablesExist (database) ","database",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("tablesexist")) { return __ref.runUserSub(false, "database","tablesexist", __ref);}
 BA.debugLineNum = 14;BA.debugLine="Private Sub TablesExist As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 16;BA.debugLine="Sql1.ExecQuery(\"SELECT id FROM cliente LIMIT 1;\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_sql1").runVoidMethod ("ExecQuery",(Object)(RemoteObject.createImmutable("SELECT id FROM cliente LIMIT 1;")));
 BA.debugLineNum = 17;BA.debugLine="Return True";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return database.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 19;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
database.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(database.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 BA.debugLineNum = 20;BA.debugLine="Return False";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return database.__c.getField(true,"False");
 };
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}