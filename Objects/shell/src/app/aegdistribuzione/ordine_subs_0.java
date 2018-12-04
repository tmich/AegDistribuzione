package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ordine_subs_0 {


public static RemoteObject  _aggiungi(RemoteObject __ref,RemoteObject _art,RemoteObject _qta,RemoteObject _nt) throws Exception{
try {
		Debug.PushSubsStack("Aggiungi (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("aggiungi")) { return __ref.runUserSub(false, "ordine","aggiungi", __ref, _art, _qta, _nt);}
RemoteObject _cnt = RemoteObject.createImmutable(false);
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("art", _art);
Debug.locals.put("qta", _qta);
Debug.locals.put("nt", _nt);
 BA.debugLineNum = 47;BA.debugLine="Public Sub Aggiungi(art As Articolo, qta As Int, n";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Dim cnt As Boolean = Contiene(art)";
Debug.ShouldStop(32768);
_cnt = __ref.runClassMethod (app.aegdistribuzione.ordine.class, "_contiene",(Object)(_art));Debug.locals.put("cnt", _cnt);Debug.locals.put("cnt", _cnt);
 BA.debugLineNum = 49;BA.debugLine="If Not(cnt) Then";
Debug.ShouldStop(65536);
if (ordine.__c.runMethod(true,"Not",(Object)(_cnt)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="Dim v As VoceOrdine = Starter.db.NuovaVoce(Me, a";
Debug.ShouldStop(131072);
_v = ordine._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_nuovavoce",(Object)((__ref)),(Object)(_art.getField(true,"_codice")),(Object)(_art.getField(true,"_descrizione")),(Object)(_qta),(Object)(_art.getField(true,"_prezzo")),(Object)(_nt));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 51;BA.debugLine="Voci.Add(v)";
Debug.ShouldStop(262144);
__ref.getField(false,"_voci").runVoidMethod ("Add",(Object)((_v)));
 };
 BA.debugLineNum = 54;BA.debugLine="Return Not(cnt)";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return ordine.__c.runMethod(true,"Not",(Object)(_cnt));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
ordine._id = RemoteObject.createImmutable(0);__ref.setField("_id",ordine._id);
 //BA.debugLineNum = 3;BA.debugLine="Public IdCliente As Int";
ordine._idcliente = RemoteObject.createImmutable(0);__ref.setField("_idcliente",ordine._idcliente);
 //BA.debugLineNum = 4;BA.debugLine="Public IdUtente As Int";
ordine._idutente = RemoteObject.createImmutable(0);__ref.setField("_idutente",ordine._idutente);
 //BA.debugLineNum = 5;BA.debugLine="Public DataInvio As String";
ordine._datainvio = RemoteObject.createImmutable("");__ref.setField("_datainvio",ordine._datainvio);
 //BA.debugLineNum = 6;BA.debugLine="Public Note As String";
ordine._note = RemoteObject.createImmutable("");__ref.setField("_note",ordine._note);
 //BA.debugLineNum = 7;BA.debugLine="Public Voci As List";
ordine._voci = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_voci",ordine._voci);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _contiene(RemoteObject __ref,RemoteObject _art) throws Exception{
try {
		Debug.PushSubsStack("Contiene (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("contiene")) { return __ref.runUserSub(false, "ordine","contiene", __ref, _art);}
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("art", _art);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Contiene(art As Articolo) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="For Each v As VoceOrdine In Voci";
Debug.ShouldStop(32);
{
final RemoteObject group1 = __ref.getField(false,"_voci");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = (group1.runMethod(false,"Get",index1));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 39;BA.debugLine="If v.CodArt == art.Codice Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_v.getField(true,"_codart"),_art.getField(true,"_codice"))) { 
 BA.debugLineNum = 40;BA.debugLine="Return True";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return ordine.__c.getField(true,"True");
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 44;BA.debugLine="Return False";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return ordine.__c.getField(true,"False");
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fromjson(RemoteObject __ref,RemoteObject _jsonstring) throws Exception{
try {
		Debug.PushSubsStack("FromJson (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("fromjson")) { return __ref.runUserSub(false, "ordine","fromjson", __ref, _jsonstring);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _righe = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _vid = RemoteObject.createImmutable(0);
RemoteObject _cod = RemoteObject.createImmutable("");
RemoteObject _desc = RemoteObject.createImmutable("");
RemoteObject _vnote = RemoteObject.createImmutable("");
RemoteObject _prezzo = RemoteObject.createImmutable(0f);
RemoteObject _qta = RemoteObject.createImmutable(0);
Debug.locals.put("jsonString", _jsonstring);
 BA.debugLineNum = 57;BA.debugLine="Public Sub FromJson(jsonString As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 59;BA.debugLine="parser.Initialize(jsonString)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstring));
 BA.debugLineNum = 60;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(134217728);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 61;BA.debugLine="Dim m As Map = root.Get(\"data\")";
Debug.ShouldStop(268435456);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("m", _m);
 BA.debugLineNum = 63;BA.debugLine="Id = m.Get(\"id\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_id",BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 64;BA.debugLine="IdCliente = m.Get(\"id_cliente\")";
Debug.ShouldStop(-2147483648);
__ref.setField ("_idcliente",BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_cliente"))))));
 BA.debugLineNum = 65;BA.debugLine="IdUtente = m.Get(\"id_utente\")";
Debug.ShouldStop(1);
__ref.setField ("_idutente",BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_utente"))))));
 BA.debugLineNum = 66;BA.debugLine="DataInvio = m.Get(\"data_invio\")";
Debug.ShouldStop(2);
__ref.setField ("_datainvio",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_invio"))))));
 BA.debugLineNum = 67;BA.debugLine="Note = m.Get(\"note\")";
Debug.ShouldStop(4);
__ref.setField ("_note",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("note"))))));
 BA.debugLineNum = 70;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
Debug.ShouldStop(32);
_righe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_righe.setObject(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("righe")))));Debug.locals.put("righe", _righe);
 BA.debugLineNum = 71;BA.debugLine="For Each r As Map In righe";
Debug.ShouldStop(64);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group11 = _righe;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_r.setObject(group11.runMethod(false,"Get",index11));
Debug.locals.put("r", _r);
 BA.debugLineNum = 72;BA.debugLine="Dim v As VoceOrdine";
Debug.ShouldStop(128);
_v = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("v", _v);
 BA.debugLineNum = 73;BA.debugLine="Dim vId As Int = r.Get(\"id\")";
Debug.ShouldStop(256);
_vid = BA.numberCast(int.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("vId", _vid);Debug.locals.put("vId", _vid);
 BA.debugLineNum = 74;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
Debug.ShouldStop(512);
_cod = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cod_art")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 75;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
Debug.ShouldStop(1024);
_desc = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("desc_art")))));Debug.locals.put("desc", _desc);Debug.locals.put("desc", _desc);
 BA.debugLineNum = 76;BA.debugLine="Dim vNote As String = r.Get(\"note\")";
Debug.ShouldStop(2048);
_vnote = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("note")))));Debug.locals.put("vNote", _vnote);Debug.locals.put("vNote", _vnote);
 BA.debugLineNum = 77;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
Debug.ShouldStop(4096);
_prezzo = BA.numberCast(float.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prez_art")))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 78;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
Debug.ShouldStop(8192);
_qta = BA.numberCast(int.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qta")))));Debug.locals.put("qta", _qta);Debug.locals.put("qta", _qta);
 BA.debugLineNum = 79;BA.debugLine="v.Initialize(vId, cod, desc, Id, vNote, prezzo,";
Debug.ShouldStop(16384);
_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_vid),(Object)(_cod),(Object)(_desc),(Object)(__ref.getField(true,"_id")),(Object)(_vnote),(Object)(_prezzo),(Object)(_qta));
 BA.debugLineNum = 80;BA.debugLine="Voci.Add(v)";
Debug.ShouldStop(32768);
__ref.getField(false,"_voci").runVoidMethod ("Add",(Object)((_v)));
 }
}Debug.locals.put("r", _r);
;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdataformattata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDataFormattata (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("getdataformattata")) { return __ref.runUserSub(false, "ordine","getdataformattata", __ref);}
 BA.debugLineNum = 84;BA.debugLine="Public Sub getDataFormattata As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Return DataInvio";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(true,"_datainvio");
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdatainvioticks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDataInvioTicks (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("getdatainvioticks")) { return __ref.runUserSub(false, "ordine","getdatainvioticks", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Public Sub getDataInvioTicks As Long";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy HH:mm:ss\"";
Debug.ShouldStop(16777216);
ordine.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy HH:mm:ss"));
 BA.debugLineNum = 91;BA.debugLine="Return DateTime.DateParse(DataInvio)";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return ordine.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(true,"_datainvio")));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _oid,RemoteObject _cid,RemoteObject _uid,RemoteObject _dtinv,RemoteObject _nt) throws Exception{
try {
		Debug.PushSubsStack("Initialize (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "ordine","initialize", __ref, _ba, _oid, _cid, _uid, _dtinv, _nt);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("oid", _oid);
Debug.locals.put("cid", _cid);
Debug.locals.put("uid", _uid);
Debug.locals.put("dtinv", _dtinv);
Debug.locals.put("nt", _nt);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(oid As Int, cid As Int, uid";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Id=oid";
Debug.ShouldStop(2048);
__ref.setField ("_id",_oid);
 BA.debugLineNum = 13;BA.debugLine="IdCliente = cid";
Debug.ShouldStop(4096);
__ref.setField ("_idcliente",_cid);
 BA.debugLineNum = 14;BA.debugLine="IdUtente = uid";
Debug.ShouldStop(8192);
__ref.setField ("_idutente",_uid);
 BA.debugLineNum = 15;BA.debugLine="DataInvio = dtinv";
Debug.ShouldStop(16384);
__ref.setField ("_datainvio",_dtinv);
 BA.debugLineNum = 16;BA.debugLine="Note = nt";
Debug.ShouldStop(32768);
__ref.setField ("_note",_nt);
 BA.debugLineNum = 17;BA.debugLine="Voci.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_voci").runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _numvoci(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NumVoci (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("numvoci")) { return __ref.runUserSub(false, "ordine","numvoci", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Public Sub NumVoci As Int";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Return Voci.Size";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_voci").runMethod(true,"getSize");
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tojson(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToJson (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("tojson")) { return __ref.runUserSub(false, "ordine","tojson", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _js = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _righe = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _mv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 107;BA.debugLine="Public Sub ToJson As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Dim m As Map";
Debug.ShouldStop(2048);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 109;BA.debugLine="Dim js As JSONGenerator";
Debug.ShouldStop(4096);
_js = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("js", _js);
 BA.debugLineNum = 110;BA.debugLine="Dim righe As List";
Debug.ShouldStop(8192);
_righe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("righe", _righe);
 BA.debugLineNum = 111;BA.debugLine="righe.Initialize";
Debug.ShouldStop(16384);
_righe.runVoidMethod ("Initialize");
 BA.debugLineNum = 112;BA.debugLine="m.Initialize";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 114;BA.debugLine="For Each v As VoceOrdine In Voci";
Debug.ShouldStop(131072);
{
final RemoteObject group6 = __ref.getField(false,"_voci");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (group6.runMethod(false,"Get",index6));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 115;BA.debugLine="Dim mv As Map = v.ToMap";
Debug.ShouldStop(262144);
_mv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mv = _v.runClassMethod (app.aegdistribuzione.voceordine.class, "_tomap");Debug.locals.put("mv", _mv);Debug.locals.put("mv", _mv);
 BA.debugLineNum = 116;BA.debugLine="mv.Remove(\"id\")";
Debug.ShouldStop(524288);
_mv.runVoidMethod ("Remove",(Object)((RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 117;BA.debugLine="righe.Add(mv)";
Debug.ShouldStop(1048576);
_righe.runVoidMethod ("Add",(Object)((_mv.getObject())));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 120;BA.debugLine="m.Put(\"righe\", righe)";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("righe"))),(Object)((_righe.getObject())));
 BA.debugLineNum = 121;BA.debugLine="js.Initialize(m)";
Debug.ShouldStop(16777216);
_js.runVoidMethod ("Initialize",(Object)(_m));
 BA.debugLineNum = 122;BA.debugLine="Log(js.ToPrettyString(4))";
Debug.ShouldStop(33554432);
ordine.__c.runVoidMethod ("Log",(Object)(_js.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 4)))));
 BA.debugLineNum = 123;BA.debugLine="Return js.ToString()";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return _js.runMethod(true,"ToString");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _totale(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Totale (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("totale")) { return __ref.runUserSub(false, "ordine","totale", __ref);}
RemoteObject _tot = RemoteObject.createImmutable(0f);
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
 BA.debugLineNum = 94;BA.debugLine="Public Sub Totale As Float";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="Dim tot As Float = 0.0F";
Debug.ShouldStop(1073741824);
_tot = BA.numberCast(float.class, 0.0f);Debug.locals.put("tot", _tot);Debug.locals.put("tot", _tot);
 BA.debugLineNum = 96;BA.debugLine="For Each v As VoceOrdine In Voci";
Debug.ShouldStop(-2147483648);
{
final RemoteObject group2 = __ref.getField(false,"_voci");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (group2.runMethod(false,"Get",index2));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 97;BA.debugLine="tot = tot + v.Totale";
Debug.ShouldStop(1);
_tot = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tot,_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_totale")}, "+",1, 0));Debug.locals.put("tot", _tot);
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 100;BA.debugLine="Return tot";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return _tot;
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}