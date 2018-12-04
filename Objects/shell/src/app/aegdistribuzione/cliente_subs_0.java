package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cliente_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
cliente._id = RemoteObject.createImmutable(0);__ref.setField("_id",cliente._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Codice As String";
cliente._codice = RemoteObject.createImmutable("");__ref.setField("_codice",cliente._codice);
 //BA.debugLineNum = 4;BA.debugLine="Public Denominazione As String";
cliente._denominazione = RemoteObject.createImmutable("");__ref.setField("_denominazione",cliente._denominazione);
 //BA.debugLineNum = 5;BA.debugLine="Public Indirizzo As String";
cliente._indirizzo = RemoteObject.createImmutable("");__ref.setField("_indirizzo",cliente._indirizzo);
 //BA.debugLineNum = 6;BA.debugLine="Public PartitaIVA As String";
cliente._partitaiva = RemoteObject.createImmutable("");__ref.setField("_partitaiva",cliente._partitaiva);
 //BA.debugLineNum = 7;BA.debugLine="Public DataUltimaModifica As String";
cliente._dataultimamodifica = RemoteObject.createImmutable("");__ref.setField("_dataultimamodifica",cliente._dataultimamodifica);
 //BA.debugLineNum = 8;BA.debugLine="Public Ordini As List";
cliente._ordini = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_ordini",cliente._ordini);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _cid,RemoteObject _cod,RemoteObject _denom,RemoteObject _indir,RemoteObject _iva,RemoteObject _dtum) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cliente) ","cliente",12,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cliente","initialize", __ref, _ba, _cid, _cod, _denom, _indir, _iva, _dtum);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("cId", _cid);
Debug.locals.put("Cod", _cod);
Debug.locals.put("Denom", _denom);
Debug.locals.put("Indir", _indir);
Debug.locals.put("Iva", _iva);
Debug.locals.put("dtum", _dtum);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(cId As Int, Cod As String, D";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Id = cId";
Debug.ShouldStop(4096);
__ref.setField ("_id",_cid);
 BA.debugLineNum = 14;BA.debugLine="Codice = Cod";
Debug.ShouldStop(8192);
__ref.setField ("_codice",_cod);
 BA.debugLineNum = 15;BA.debugLine="Denominazione = Denom";
Debug.ShouldStop(16384);
__ref.setField ("_denominazione",_denom);
 BA.debugLineNum = 16;BA.debugLine="Indirizzo = Indir";
Debug.ShouldStop(32768);
__ref.setField ("_indirizzo",_indir);
 BA.debugLineNum = 17;BA.debugLine="PartitaIVA = Iva";
Debug.ShouldStop(65536);
__ref.setField ("_partitaiva",_iva);
 BA.debugLineNum = 18;BA.debugLine="DataUltimaModifica = dtum";
Debug.ShouldStop(131072);
__ref.setField ("_dataultimamodifica",_dtum);
 BA.debugLineNum = 19;BA.debugLine="Ordini.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_ordini").runVoidMethod ("Initialize");
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
}