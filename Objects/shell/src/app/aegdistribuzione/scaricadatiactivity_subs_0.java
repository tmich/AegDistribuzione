package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class scaricadatiactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (scaricadatiactivity) ","scaricadatiactivity",8,scaricadatiactivity.mostCurrent.activityBA,scaricadatiactivity.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return app.aegdistribuzione.scaricadatiactivity.remoteMe.runUserSub(false, "scaricadatiactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"ScaricaDatiLayout\")";
Debug.ShouldStop(1048576);
scaricadatiactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ScaricaDatiLayout")),scaricadatiactivity.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Pause (scaricadatiactivity) ","scaricadatiactivity",8,scaricadatiactivity.mostCurrent.activityBA,scaricadatiactivity.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return app.aegdistribuzione.scaricadatiactivity.remoteMe.runUserSub(false, "scaricadatiactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (scaricadatiactivity) ","scaricadatiactivity",8,scaricadatiactivity.mostCurrent.activityBA,scaricadatiactivity.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return app.aegdistribuzione.scaricadatiactivity.remoteMe.runUserSub(false, "scaricadatiactivity","activity_resume");}
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnaggiorna_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAggiorna_Click (scaricadatiactivity) ","scaricadatiactivity",8,scaricadatiactivity.mostCurrent.activityBA,scaricadatiactivity.mostCurrent,33);
if (RapidSub.canDelegate("btnaggiorna_click")) { app.aegdistribuzione.scaricadatiactivity.remoteMe.runUserSub(false, "scaricadatiactivity","btnaggiorna_click"); return;}
ResumableSub_BtnAggiorna_Click rsub = new ResumableSub_BtnAggiorna_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BtnAggiorna_Click extends BA.ResumableSub {
public ResumableSub_BtnAggiorna_Click(app.aegdistribuzione.scaricadatiactivity parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
app.aegdistribuzione.scaricadatiactivity parent;
RemoteObject _error = RemoteObject.createImmutable(false);
RemoteObject _msg = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BtnAggiorna_Click (scaricadatiactivity) ","scaricadatiactivity",8,scaricadatiactivity.mostCurrent.activityBA,scaricadatiactivity.mostCurrent,33);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 34;BA.debugLine="BtnAggiorna.Enabled = False";
Debug.ShouldStop(2);
parent.mostCurrent._btnaggiorna.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 35;BA.debugLine="Dim error As Boolean = False";
Debug.ShouldStop(4);
_error = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("error", _error);Debug.locals.put("error", _error);
 BA.debugLineNum = 36;BA.debugLine="Dim msg As String = \"\"";
Debug.ShouldStop(8);
_msg = BA.ObjectToString("");Debug.locals.put("msg", _msg);Debug.locals.put("msg", _msg);
 BA.debugLineNum = 38;BA.debugLine="ProgressDialogShow2(\"Aggiornamento in corso\", Fal";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",scaricadatiactivity.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Aggiornamento in corso")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 41;BA.debugLine="Wait For (Starter.client.ScaricaClienti) Complete";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", scaricadatiactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_scaricaclienti"));
this.state = 56;
return;
case 56:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 42;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 10;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 43;BA.debugLine="ProgressBar1.Progress = 25";
Debug.ShouldStop(1024);
parent.mostCurrent._progressbar1.runMethod(true,"setProgress",BA.numberCast(int.class, 25));
 BA.debugLineNum = 44;BA.debugLine="If Result.Size > 0 Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(">",_result.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 45;BA.debugLine="Starter.db.SalvaClienti(Result)";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvaclienti",(Object)(_result));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 48;BA.debugLine="error = True";
Debug.ShouldStop(32768);
_error = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("error", _error);
 BA.debugLineNum = 49;BA.debugLine="msg = \"Errore durante l'aggiornamento dei client";
Debug.ShouldStop(65536);
_msg = BA.ObjectToString("Errore durante l'aggiornamento dei clienti");Debug.locals.put("msg", _msg);
 if (true) break;
;
 BA.debugLineNum = 53;BA.debugLine="If error = False Then";
Debug.ShouldStop(1048576);

case 10:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_error,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 54;BA.debugLine="Wait For (Starter.client.ScaricaArticoli) Comple";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", scaricadatiactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_scaricaarticoli"));
this.state = 57;
return;
case 57:
//C
this.state = 13;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 55;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(4194304);
if (true) break;

case 13:
//if
this.state = 22;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 56;BA.debugLine="ProgressBar1.Progress = 40";
Debug.ShouldStop(8388608);
parent.mostCurrent._progressbar1.runMethod(true,"setProgress",BA.numberCast(int.class, 40));
 BA.debugLineNum = 57;BA.debugLine="If Result.Size > 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",_result.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 58;BA.debugLine="Starter.db.SalvaArticoli(Result)";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvaarticoli",(Object)(_result));
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 61;BA.debugLine="error = True";
Debug.ShouldStop(268435456);
_error = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("error", _error);
 BA.debugLineNum = 62;BA.debugLine="msg = \"Errore durante l'aggiornamento degli art";
Debug.ShouldStop(536870912);
_msg = BA.ObjectToString("Errore durante l'aggiornamento degli articoli");Debug.locals.put("msg", _msg);
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;
;
 BA.debugLineNum = 67;BA.debugLine="If error = False Then";
Debug.ShouldStop(4);

case 23:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_error,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 68;BA.debugLine="Wait For (Starter.client.StoricoOrdini) Complete";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", scaricadatiactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_storicoordini"));
this.state = 58;
return;
case 58:
//C
this.state = 26;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 69;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(16);
if (true) break;

case 26:
//if
this.state = 35;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 28;
}else {
this.state = 34;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 70;BA.debugLine="ProgressBar1.Progress = 70";
Debug.ShouldStop(32);
parent.mostCurrent._progressbar1.runMethod(true,"setProgress",BA.numberCast(int.class, 70));
 BA.debugLineNum = 71;BA.debugLine="If Result.Size > 0 Then";
Debug.ShouldStop(64);
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean(">",_result.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 72;BA.debugLine="Starter.db.SalvaStoricoOrdini(Result)";
Debug.ShouldStop(128);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvastoricoordini",(Object)(_result));
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 75;BA.debugLine="error = True";
Debug.ShouldStop(1024);
_error = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("error", _error);
 BA.debugLineNum = 76;BA.debugLine="msg = \"Errore durante l'aggiornamento dello sto";
Debug.ShouldStop(2048);
_msg = BA.ObjectToString("Errore durante l'aggiornamento dello storico ordini");Debug.locals.put("msg", _msg);
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;
;
 BA.debugLineNum = 81;BA.debugLine="If error = False Then";
Debug.ShouldStop(65536);

case 36:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",_error,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 82;BA.debugLine="Wait For (Starter.client.ScaricaPreferiti) Compl";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", scaricadatiactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_scaricapreferiti"));
this.state = 59;
return;
case 59:
//C
this.state = 39;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 83;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(262144);
if (true) break;

case 39:
//if
this.state = 48;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 41;
}else {
this.state = 47;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 84;BA.debugLine="ProgressBar1.Progress = 90";
Debug.ShouldStop(524288);
parent.mostCurrent._progressbar1.runMethod(true,"setProgress",BA.numberCast(int.class, 90));
 BA.debugLineNum = 85;BA.debugLine="If Result.Size > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean(">",_result.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 86;BA.debugLine="Starter.db.SalvaPreferiti(Result)";
Debug.ShouldStop(2097152);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvapreferiti",(Object)(_result));
 if (true) break;

case 45:
//C
this.state = 48;
;
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 89;BA.debugLine="error = True";
Debug.ShouldStop(16777216);
_error = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("error", _error);
 BA.debugLineNum = 90;BA.debugLine="msg = \"Errore durante l'aggiornamento degli art";
Debug.ShouldStop(33554432);
_msg = BA.ObjectToString("Errore durante l'aggiornamento degli articoli preferiti");Debug.locals.put("msg", _msg);
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 112;BA.debugLine="BtnAggiorna.Enabled = True";
Debug.ShouldStop(32768);
parent.mostCurrent._btnaggiorna.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 113;BA.debugLine="ProgressDialogHide()";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 115;BA.debugLine="If error Then";
Debug.ShouldStop(262144);
if (true) break;

case 50:
//if
this.state = 55;
if (_error.<Boolean>get().booleanValue()) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 55;
 BA.debugLineNum = 116;BA.debugLine="Msgbox(msg, \"Errore\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_msg)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Errore"))),scaricadatiactivity.mostCurrent.activityBA);
 BA.debugLineNum = 117;BA.debugLine="ProgressBar1.Progress = 0";
Debug.ShouldStop(1048576);
parent.mostCurrent._progressbar1.runMethod(true,"setProgress",BA.numberCast(int.class, 0));
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 119;BA.debugLine="ToastMessageShow(\"Aggiornamento completato\", Fal";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Aggiornamento completato")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 120;BA.debugLine="Activity.Finish()";
Debug.ShouldStop(8388608);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 55:
//C
this.state = -1;
;
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
 //BA.debugLineNum = 15;BA.debugLine="Dim ProgressBar1 As ProgressBar";
scaricadatiactivity.mostCurrent._progressbar1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim BtnAggiorna As Button";
scaricadatiactivity.mostCurrent._btnaggiorna = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}