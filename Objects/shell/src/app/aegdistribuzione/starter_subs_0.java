package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",4,starter.processBA,starter.mostCurrent,35);
if (RapidSub.canDelegate("application_error")) { return app.aegdistribuzione.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 35;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return True";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public db As Database";
starter._db = RemoteObject.createNew ("app.aegdistribuzione.database");
 //BA.debugLineNum = 10;BA.debugLine="Public client As ApiClient";
starter._client = RemoteObject.createNew ("app.aegdistribuzione.apiclient");
 //BA.debugLineNum = 11;BA.debugLine="Dim User As Utente";
starter._user = RemoteObject.createNew ("app.aegdistribuzione.utente");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",4,starter.processBA,starter.mostCurrent,14);
if (RapidSub.canDelegate("service_create")) { return app.aegdistribuzione.starter.remoteMe.runUserSub(false, "starter","service_create");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8192);
 BA.debugLineNum = 17;BA.debugLine="db.Initialize";
Debug.ShouldStop(65536);
starter._db.runClassMethod (app.aegdistribuzione.database.class, "_initialize",starter.processBA);
 BA.debugLineNum = 18;BA.debugLine="client.Initialize";
Debug.ShouldStop(131072);
starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_initialize",starter.processBA);
 BA.debugLineNum = 19;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 20;BA.debugLine="jo.InitializeStatic(\"java.util.Locale\").RunMethod";
Debug.ShouldStop(524288);
_jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("java.util.Locale"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDefault")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("US")))})));
 BA.debugLineNum = 22;BA.debugLine="User = db.GetUtente()";
Debug.ShouldStop(2097152);
starter._user = starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getutente");
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",4,starter.processBA,starter.mostCurrent,39);
if (RapidSub.canDelegate("service_destroy")) { return app.aegdistribuzione.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 39;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",4,starter.processBA,starter.mostCurrent,25);
if (RapidSub.canDelegate("service_start")) { return app.aegdistribuzione.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 25;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",4,starter.processBA,starter.mostCurrent,30);
if (RapidSub.canDelegate("service_taskremoved")) { return app.aegdistribuzione.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 30;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}