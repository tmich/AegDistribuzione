package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class articolo_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
articolo._id = RemoteObject.createImmutable(0);__ref.setField("_id",articolo._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Codice As String";
articolo._codice = RemoteObject.createImmutable("");__ref.setField("_codice",articolo._codice);
 //BA.debugLineNum = 4;BA.debugLine="Public Descrizione As String";
articolo._descrizione = RemoteObject.createImmutable("");__ref.setField("_descrizione",articolo._descrizione);
 //BA.debugLineNum = 5;BA.debugLine="Public Prezzo As Float";
articolo._prezzo = RemoteObject.createImmutable(0f);__ref.setField("_prezzo",articolo._prezzo);
 //BA.debugLineNum = 6;BA.debugLine="Public DataUltimaModifica As String";
articolo._dataultimamodifica = RemoteObject.createImmutable("");__ref.setField("_dataultimamodifica",articolo._dataultimamodifica);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _aid,RemoteObject _cod,RemoteObject _descr,RemoteObject _prz,RemoteObject _dum) throws Exception{
try {
		Debug.PushSubsStack("Initialize (articolo) ","articolo",15,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "articolo","initialize", __ref, _ba, _aid, _cod, _descr, _prz, _dum);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("aId", _aid);
Debug.locals.put("cod", _cod);
Debug.locals.put("descr", _descr);
Debug.locals.put("prz", _prz);
Debug.locals.put("dum", _dum);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(aId As Int, cod As String, d";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Id=aId";
Debug.ShouldStop(1024);
__ref.setField ("_id",_aid);
 BA.debugLineNum = 12;BA.debugLine="Codice=cod";
Debug.ShouldStop(2048);
__ref.setField ("_codice",_cod);
 BA.debugLineNum = 13;BA.debugLine="Descrizione=descr";
Debug.ShouldStop(4096);
__ref.setField ("_descrizione",_descr);
 BA.debugLineNum = 14;BA.debugLine="Prezzo=prz";
Debug.ShouldStop(8192);
__ref.setField ("_prezzo",_prz);
 BA.debugLineNum = 15;BA.debugLine="DataUltimaModifica=dum";
Debug.ShouldStop(16384);
__ref.setField ("_dataultimamodifica",_dum);
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