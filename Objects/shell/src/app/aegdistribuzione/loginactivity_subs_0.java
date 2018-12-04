package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (loginactivity) ","loginactivity",5,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return app.aegdistribuzione.loginactivity.remoteMe.runUserSub(false, "loginactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"loginlayout\")";
Debug.ShouldStop(2097152);
loginactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("loginlayout")),loginactivity.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Pause (loginactivity) ","loginactivity",5,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) { return app.aegdistribuzione.loginactivity.remoteMe.runUserSub(false, "loginactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (loginactivity) ","loginactivity",5,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,26);
if (RapidSub.canDelegate("activity_resume")) { return app.aegdistribuzione.loginactivity.remoteMe.runUserSub(false, "loginactivity","activity_resume");}
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
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
public static void  _btlogin_click() throws Exception{
try {
		Debug.PushSubsStack("btLogin_Click (loginactivity) ","loginactivity",5,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,35);
if (RapidSub.canDelegate("btlogin_click")) { app.aegdistribuzione.loginactivity.remoteMe.runUserSub(false, "loginactivity","btlogin_click"); return;}
ResumableSub_btLogin_Click rsub = new ResumableSub_btLogin_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btLogin_Click extends BA.ResumableSub {
public ResumableSub_btLogin_Click(app.aegdistribuzione.loginactivity parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
app.aegdistribuzione.loginactivity parent;
RemoteObject _username = RemoteObject.createImmutable("");
RemoteObject _password = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("app.aegdistribuzione.utente");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btLogin_Click (loginactivity) ","loginactivity",5,loginactivity.mostCurrent.activityBA,loginactivity.mostCurrent,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 36;BA.debugLine="Dim username As String = txNome.Text";
Debug.ShouldStop(8);
_username = parent.mostCurrent._txnome.runMethod(true,"getText");Debug.locals.put("username", _username);Debug.locals.put("username", _username);
 BA.debugLineNum = 37;BA.debugLine="Dim password As String = txPassword.Text";
Debug.ShouldStop(16);
_password = parent.mostCurrent._txpassword.runMethod(true,"getText");Debug.locals.put("password", _password);Debug.locals.put("password", _password);
 BA.debugLineNum = 39;BA.debugLine="ProgressDialogShow2(\"Accesso in corso\", False)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",loginactivity.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Accesso in corso")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 41;BA.debugLine="Wait For (Starter.client.Login(username, password";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", loginactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_login",(Object)(_username),(Object)(_password)));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 43;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 44;BA.debugLine="Starter.User = Result";
Debug.ShouldStop(2048);
parent.mostCurrent._starter._user = _result;
 BA.debugLineNum = 45;BA.debugLine="Starter.db.SalvaUtente(Result)";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvautente",(Object)(_result));
 BA.debugLineNum = 46;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",loginactivity.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 47;BA.debugLine="Activity.Finish()";
Debug.ShouldStop(16384);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 49;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 50;BA.debugLine="Msgbox(\"Nome utente o password errata\", \"Accesso";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Nome utente o password errata")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Accesso"))),loginactivity.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private txNome As EditText";
loginactivity.mostCurrent._txnome = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txPassword As EditText";
loginactivity.mostCurrent._txpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}