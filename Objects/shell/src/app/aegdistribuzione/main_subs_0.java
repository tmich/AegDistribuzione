package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return app.aegdistribuzione.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"MainLayout\")";
Debug.ShouldStop(268435456);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainLayout")),main.mostCurrent.activityBA);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return app.aegdistribuzione.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) { return app.aegdistribuzione.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="If Starter.User == Null Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("n",main.mostCurrent._starter._user)) { 
 BA.debugLineNum = 34;BA.debugLine="StartActivity(LoginActivity)";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._loginactivity.getObject())));
 };
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnarticoli_click() throws Exception{
try {
		Debug.PushSubsStack("btnArticoli_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("btnarticoli_click")) { return app.aegdistribuzione.main.remoteMe.runUserSub(false, "main","btnarticoli_click");}
 BA.debugLineNum = 51;BA.debugLine="Sub btnArticoli_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="StartActivity(ArticoliActivity)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._articoliactivity.getObject())));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclienti_click() throws Exception{
try {
		Debug.PushSubsStack("btnClienti_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,47);
if (RapidSub.canDelegate("btnclienti_click")) { return app.aegdistribuzione.main.remoteMe.runUserSub(false, "main","btnclienti_click");}
 BA.debugLineNum = 47;BA.debugLine="Sub btnClienti_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="StartActivity(ClientiActivity)";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._clientiactivity.getObject())));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview3_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView3_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("imageview3_click")) { return app.aegdistribuzione.main.remoteMe.runUserSub(false, "main","imageview3_click");}
 BA.debugLineNum = 43;BA.debugLine="Sub ImageView3_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="StartActivity(ScaricaDatiActivity)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._scaricadatiactivity.getObject())));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
ordineactivity_subs_0._process_globals();
schedaclienteactivity_subs_0._process_globals();
starter_subs_0._process_globals();
loginactivity_subs_0._process_globals();
scaricadatiactivity_subs_0._process_globals();
dettaglioordineactivity_subs_0._process_globals();
clientiactivity_subs_0._process_globals();
articoliactivity_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("app.aegdistribuzione.main");
ordineactivity.myClass = BA.getDeviceClass ("app.aegdistribuzione.ordineactivity");
database.myClass = BA.getDeviceClass ("app.aegdistribuzione.database");
schedaclienteactivity.myClass = BA.getDeviceClass ("app.aegdistribuzione.schedaclienteactivity");
starter.myClass = BA.getDeviceClass ("app.aegdistribuzione.starter");
loginactivity.myClass = BA.getDeviceClass ("app.aegdistribuzione.loginactivity");
apiclient.myClass = BA.getDeviceClass ("app.aegdistribuzione.apiclient");
utente.myClass = BA.getDeviceClass ("app.aegdistribuzione.utente");
scaricadatiactivity.myClass = BA.getDeviceClass ("app.aegdistribuzione.scaricadatiactivity");
ordine.myClass = BA.getDeviceClass ("app.aegdistribuzione.ordine");
cliente.myClass = BA.getDeviceClass ("app.aegdistribuzione.cliente");
dettaglioordineactivity.myClass = BA.getDeviceClass ("app.aegdistribuzione.dettaglioordineactivity");
voceordine.myClass = BA.getDeviceClass ("app.aegdistribuzione.voceordine");
clientiactivity.myClass = BA.getDeviceClass ("app.aegdistribuzione.clientiactivity");
articoliactivity.myClass = BA.getDeviceClass ("app.aegdistribuzione.articoliactivity");
articolo.myClass = BA.getDeviceClass ("app.aegdistribuzione.articolo");
preferito.myClass = BA.getDeviceClass ("app.aegdistribuzione.preferito");
customlistview.myClass = BA.getDeviceClass ("app.aegdistribuzione.customlistview");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}