package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class preferito_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public IdArt As Int";
preferito._idart = RemoteObject.createImmutable(0);__ref.setField("_idart",preferito._idart);
 //BA.debugLineNum = 3;BA.debugLine="Public Codice As String";
preferito._codice = RemoteObject.createImmutable("");__ref.setField("_codice",preferito._codice);
 //BA.debugLineNum = 4;BA.debugLine="Public Descrizione As String";
preferito._descrizione = RemoteObject.createImmutable("");__ref.setField("_descrizione",preferito._descrizione);
 //BA.debugLineNum = 5;BA.debugLine="Public IdCliente As Int";
preferito._idcliente = RemoteObject.createImmutable(0);__ref.setField("_idcliente",preferito._idcliente);
 //BA.debugLineNum = 6;BA.debugLine="Public Occorrenze As Int";
preferito._occorrenze = RemoteObject.createImmutable(0);__ref.setField("_occorrenze",preferito._occorrenze);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _aid,RemoteObject _cod,RemoteObject _descr,RemoteObject _cid,RemoteObject _occ) throws Exception{
try {
		Debug.PushSubsStack("Initialize (preferito) ","preferito",16,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "preferito","initialize", __ref, _ba, _aid, _cod, _descr, _cid, _occ);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("aId", _aid);
Debug.locals.put("cod", _cod);
Debug.locals.put("descr", _descr);
Debug.locals.put("cid", _cid);
Debug.locals.put("occ", _occ);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(aId As Int, cod As String, d";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="IdArt = aId";
Debug.ShouldStop(1024);
__ref.setField ("_idart",_aid);
 BA.debugLineNum = 12;BA.debugLine="Codice = cod";
Debug.ShouldStop(2048);
__ref.setField ("_codice",_cod);
 BA.debugLineNum = 13;BA.debugLine="Descrizione = descr";
Debug.ShouldStop(4096);
__ref.setField ("_descrizione",_descr);
 BA.debugLineNum = 14;BA.debugLine="IdCliente = cid";
Debug.ShouldStop(8192);
__ref.setField ("_idcliente",_cid);
 BA.debugLineNum = 15;BA.debugLine="Occorrenze = occ";
Debug.ShouldStop(16384);
__ref.setField ("_occorrenze",_occ);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}