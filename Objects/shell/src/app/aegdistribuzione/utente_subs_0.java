package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class utente_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
utente._id = RemoteObject.createImmutable(0);__ref.setField("_id",utente._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Nome As String";
utente._nome = RemoteObject.createImmutable("");__ref.setField("_nome",utente._nome);
 //BA.debugLineNum = 4;BA.debugLine="Public UltimoAccesso As String";
utente._ultimoaccesso = RemoteObject.createImmutable("");__ref.setField("_ultimoaccesso",utente._ultimoaccesso);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _uid,RemoteObject _nom,RemoteObject _uac) throws Exception{
try {
		Debug.PushSubsStack("Initialize (utente) ","utente",7,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "utente","initialize", __ref, _ba, _uid, _nom, _uac);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("uid", _uid);
Debug.locals.put("nom", _nom);
Debug.locals.put("uac", _uac);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(uid As Int, nom As String, u";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="Id=uid";
Debug.ShouldStop(256);
__ref.setField ("_id",_uid);
 BA.debugLineNum = 10;BA.debugLine="Nome=nom";
Debug.ShouldStop(512);
__ref.setField ("_nome",_nom);
 BA.debugLineNum = 11;BA.debugLine="UltimoAccesso=uac";
Debug.ShouldStop(1024);
__ref.setField ("_ultimoaccesso",_uac);
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
}