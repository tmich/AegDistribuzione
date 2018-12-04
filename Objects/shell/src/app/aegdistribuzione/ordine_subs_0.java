package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ordine_subs_0 {


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
public static RemoteObject  _getdataformattata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDataFormattata (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("getdataformattata")) { return __ref.runUserSub(false, "ordine","getdataformattata", __ref);}
 BA.debugLineNum = 20;BA.debugLine="Public Sub getDataFormattata As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Return DataInvio";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(true,"_datainvio");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("getDataInvioTicks (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("getdatainvioticks")) { return __ref.runUserSub(false, "ordine","getdatainvioticks", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub getDataInvioTicks As Long";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy HH:mm:ss\"";
Debug.ShouldStop(1);
ordine.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy HH:mm:ss"));
 BA.debugLineNum = 35;BA.debugLine="Return DateTime.DateParse(DataInvio)";
Debug.ShouldStop(4);
if (true) return ordine.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(true,"_datainvio")));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("NumVoci (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("numvoci")) { return __ref.runUserSub(false, "ordine","numvoci", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub NumVoci As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Return Voci.Size";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_voci").runMethod(true,"getSize");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _totale(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Totale (ordine) ","ordine",9,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("totale")) { return __ref.runUserSub(false, "ordine","totale", __ref);}
RemoteObject _tot = RemoteObject.createImmutable(0f);
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
 BA.debugLineNum = 38;BA.debugLine="Public Sub Totale As Float";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Dim tot As Float = 0.0F";
Debug.ShouldStop(64);
_tot = BA.numberCast(float.class, 0.0f);Debug.locals.put("tot", _tot);Debug.locals.put("tot", _tot);
 BA.debugLineNum = 40;BA.debugLine="For Each v As VoceOrdine In Voci";
Debug.ShouldStop(128);
{
final RemoteObject group2 = __ref.getField(false,"_voci");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (group2.runMethod(false,"Get",index2));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 41;BA.debugLine="tot = tot + v.Totale";
Debug.ShouldStop(256);
_tot = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_tot,_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_totale")}, "+",1, 0));Debug.locals.put("tot", _tot);
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 44;BA.debugLine="Return tot";
Debug.ShouldStop(2048);
if (true) return _tot;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}