package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class voceordine_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
voceordine._id = RemoteObject.createImmutable(0);__ref.setField("_id",voceordine._id);
 //BA.debugLineNum = 3;BA.debugLine="Public CodArt As String";
voceordine._codart = RemoteObject.createImmutable("");__ref.setField("_codart",voceordine._codart);
 //BA.debugLineNum = 4;BA.debugLine="Public DescArt As String";
voceordine._descart = RemoteObject.createImmutable("");__ref.setField("_descart",voceordine._descart);
 //BA.debugLineNum = 5;BA.debugLine="Public IdOrdine As Int";
voceordine._idordine = RemoteObject.createImmutable(0);__ref.setField("_idordine",voceordine._idordine);
 //BA.debugLineNum = 6;BA.debugLine="Public Note As String";
voceordine._note = RemoteObject.createImmutable("");__ref.setField("_note",voceordine._note);
 //BA.debugLineNum = 7;BA.debugLine="Public Prezzo As Float";
voceordine._prezzo = RemoteObject.createImmutable(0f);__ref.setField("_prezzo",voceordine._prezzo);
 //BA.debugLineNum = 8;BA.debugLine="Public Qta As Int";
voceordine._qta = RemoteObject.createImmutable(0);__ref.setField("_qta",voceordine._qta);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vid,RemoteObject _vcod,RemoteObject _vdesc,RemoteObject _oid,RemoteObject _nt,RemoteObject _prz,RemoteObject _q) throws Exception{
try {
		Debug.PushSubsStack("Initialize (voceordine) ","voceordine",12,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "voceordine","initialize", __ref, _ba, _vid, _vcod, _vdesc, _oid, _nt, _prz, _q);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vid", _vid);
Debug.locals.put("vcod", _vcod);
Debug.locals.put("vdesc", _vdesc);
Debug.locals.put("oid", _oid);
Debug.locals.put("nt", _nt);
Debug.locals.put("prz", _prz);
Debug.locals.put("q", _q);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(vid As Int, vcod As String,";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Id = vid";
Debug.ShouldStop(4096);
__ref.setField ("_id",_vid);
 BA.debugLineNum = 14;BA.debugLine="CodArt = vcod";
Debug.ShouldStop(8192);
__ref.setField ("_codart",_vcod);
 BA.debugLineNum = 15;BA.debugLine="DescArt = vdesc";
Debug.ShouldStop(16384);
__ref.setField ("_descart",_vdesc);
 BA.debugLineNum = 16;BA.debugLine="IdOrdine = oid";
Debug.ShouldStop(32768);
__ref.setField ("_idordine",_oid);
 BA.debugLineNum = 17;BA.debugLine="Note = nt";
Debug.ShouldStop(65536);
__ref.setField ("_note",_nt);
 BA.debugLineNum = 18;BA.debugLine="Prezzo = prz";
Debug.ShouldStop(131072);
__ref.setField ("_prezzo",_prz);
 BA.debugLineNum = 19;BA.debugLine="Qta = q";
Debug.ShouldStop(262144);
__ref.setField ("_qta",_q);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Totale (voceordine) ","voceordine",12,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("totale")) { return __ref.runUserSub(false, "voceordine","totale", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub Totale As Float";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Return Prezzo * Qta";
Debug.ShouldStop(4194304);
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_prezzo"),__ref.getField(true,"_qta")}, "*",0, 0));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}