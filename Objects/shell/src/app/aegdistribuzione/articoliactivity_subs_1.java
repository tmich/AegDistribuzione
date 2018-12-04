package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class articoliactivity_subs_1 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"ArticoliLayout\")";
Debug.ShouldStop(1);
articoliactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ArticoliLayout")),articoliactivity.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="forResult = False";
Debug.ShouldStop(2);
articoliactivity._forresult = articoliactivity.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 35;BA.debugLine="oIme.Initialize(\"Keyboard\")";
Debug.ShouldStop(4);
articoliactivity.mostCurrent._oime.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Keyboard")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Resume (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","activity_resume");}
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="AggiornaLista(Starter.db.GetArticoli())";
Debug.ShouldStop(64);
_aggiornalista(articoliactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getarticoli"));
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
public static RemoteObject  _aggiornalista(RemoteObject _articoli) throws Exception{
try {
		Debug.PushSubsStack("AggiornaLista (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,46);
if (RapidSub.canDelegate("aggiornalista")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","aggiornalista", _articoli);}
RemoteObject _a = RemoteObject.declareNull("app.aegdistribuzione.articolo");
Debug.locals.put("articoli", _articoli);
 BA.debugLineNum = 46;BA.debugLine="Sub AggiornaLista(articoli As List)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="lvArticoli.Clear";
Debug.ShouldStop(16384);
articoliactivity.mostCurrent._lvarticoli.runVoidMethod ("Clear");
 BA.debugLineNum = 48;BA.debugLine="lvArticoli.TwoLinesLayout.ItemHeight = 70";
Debug.ShouldStop(32768);
articoliactivity.mostCurrent._lvarticoli.runMethod(false,"getTwoLinesLayout").runMethod(true,"setItemHeight",BA.numberCast(int.class, 70));
 BA.debugLineNum = 49;BA.debugLine="lvArticoli.TwoLinesLayout.Label.TextColor = Color";
Debug.ShouldStop(65536);
articoliactivity.mostCurrent._lvarticoli.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",articoliactivity.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 50;BA.debugLine="lvArticoli.TwoLinesLayout.Label.TextSize = 22";
Debug.ShouldStop(131072);
articoliactivity.mostCurrent._lvarticoli.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 51;BA.debugLine="lvArticoli.TwoLinesLayout.SecondLabel.TextSize =";
Debug.ShouldStop(262144);
articoliactivity.mostCurrent._lvarticoli.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 52;BA.debugLine="For Each a As Articolo In articoli";
Debug.ShouldStop(524288);
{
final RemoteObject group6 = _articoli;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_a = (group6.runMethod(false,"Get",index6));Debug.locals.put("a", _a);
Debug.locals.put("a", _a);
 BA.debugLineNum = 53;BA.debugLine="lvArticoli.AddTwoLines2(a.Descrizione, NumberFor";
Debug.ShouldStop(1048576);
articoliactivity.mostCurrent._lvarticoli.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_a.getField(true,"_descrizione"))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(articoliactivity.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _a.getField(true,"_prezzo"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(articoliactivity.mostCurrent.__c.getField(true,"False"))),RemoteObject.createImmutable(" €")))),(Object)((_a)));
 }
}Debug.locals.put("a", _a);
;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("btnAggiorna_Click (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,57);
if (RapidSub.canDelegate("btnaggiorna_click")) { app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","btnaggiorna_click"); return;}
ResumableSub_btnAggiorna_Click rsub = new ResumableSub_btnAggiorna_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnAggiorna_Click extends BA.ResumableSub {
public ResumableSub_btnAggiorna_Click(app.aegdistribuzione.articoliactivity parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
app.aegdistribuzione.articoliactivity parent;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAggiorna_Click (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,57);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 58;BA.debugLine="ProgressDialogShow2(\"Aggiornamento in corso\", Fal";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",articoliactivity.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Aggiornamento in corso")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 59;BA.debugLine="Wait For (Starter.client.ScaricaArticoli) Complet";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", articoliactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_scaricaarticoli"));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 60;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 61;BA.debugLine="If Result.Size > 0 Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 62;BA.debugLine="Starter.db.SalvaArticoli(Result)";
Debug.ShouldStop(536870912);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvaarticoli",(Object)(_result));
 BA.debugLineNum = 63;BA.debugLine="AggiornaLista(Starter.db.GetArticoli())";
Debug.ShouldStop(1073741824);
_aggiornalista(parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getarticoli"));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 66;BA.debugLine="ProgressDialogHide()";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static RemoteObject  _btnannulla_click() throws Exception{
try {
		Debug.PushSubsStack("btnAnnulla_Click (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,81);
if (RapidSub.canDelegate("btnannulla_click")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","btnannulla_click");}
 BA.debugLineNum = 81;BA.debugLine="Sub btnAnnulla_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="txCerca.Visible = False";
Debug.ShouldStop(131072);
articoliactivity.mostCurrent._txcerca.runMethod(true,"setVisible",articoliactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="btnCerca.Visible = True";
Debug.ShouldStop(262144);
articoliactivity.mostCurrent._btncerca.runMethod(true,"setVisible",articoliactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 84;BA.debugLine="btnAnnulla.Visible = False";
Debug.ShouldStop(524288);
articoliactivity.mostCurrent._btnannulla.runMethod(true,"setVisible",articoliactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="txCerca.Text = \"\"";
Debug.ShouldStop(1048576);
articoliactivity.mostCurrent._txcerca.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 86;BA.debugLine="oIme.HideKeyboard";
Debug.ShouldStop(2097152);
articoliactivity.mostCurrent._oime.runVoidMethod ("HideKeyboard",articoliactivity.mostCurrent.activityBA);
 BA.debugLineNum = 87;BA.debugLine="Label1.Visible = True";
Debug.ShouldStop(4194304);
articoliactivity.mostCurrent._label1.runMethod(true,"setVisible",articoliactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 88;BA.debugLine="AggiornaLista(Starter.db.GetArticoli())";
Debug.ShouldStop(8388608);
_aggiornalista(articoliactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getarticoli"));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncerca_click() throws Exception{
try {
		Debug.PushSubsStack("btnCerca_Click (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,73);
if (RapidSub.canDelegate("btncerca_click")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","btncerca_click");}
 BA.debugLineNum = 73;BA.debugLine="Sub btnCerca_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Label1.Visible = False";
Debug.ShouldStop(512);
articoliactivity.mostCurrent._label1.runMethod(true,"setVisible",articoliactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="txCerca.Visible = True";
Debug.ShouldStop(1024);
articoliactivity.mostCurrent._txcerca.runMethod(true,"setVisible",articoliactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="oIme.ShowKeyboard(txCerca)";
Debug.ShouldStop(2048);
articoliactivity.mostCurrent._oime.runVoidMethod ("ShowKeyboard",(Object)((articoliactivity.mostCurrent._txcerca.getObject())));
 BA.debugLineNum = 77;BA.debugLine="btnCerca.Visible = False";
Debug.ShouldStop(4096);
articoliactivity.mostCurrent._btncerca.runMethod(true,"setVisible",articoliactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="btnAnnulla.Visible = True";
Debug.ShouldStop(8192);
articoliactivity.mostCurrent._btnannulla.runMethod(true,"setVisible",articoliactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim lvArticoli As ListView";
articoliactivity.mostCurrent._lvarticoli = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim txCerca As EditText";
articoliactivity.mostCurrent._txcerca = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim btnCerca As Button";
articoliactivity.mostCurrent._btncerca = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim btnAnnulla As Button";
articoliactivity.mostCurrent._btnannulla = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim Label1 As Label";
articoliactivity.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim oIme As IME";
articoliactivity.mostCurrent._oime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 21;BA.debugLine="Dim forResult As Boolean";
articoliactivity._forresult = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lvarticoli_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lvArticoli_ItemClick (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,91);
if (RapidSub.canDelegate("lvarticoli_itemclick")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","lvarticoli_itemclick", _position, _value);}
RemoteObject _art = RemoteObject.declareNull("app.aegdistribuzione.articolo");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 91;BA.debugLine="Sub lvArticoli_ItemClick (Position As Int, Value A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Dim art As Articolo = Value";
Debug.ShouldStop(134217728);
_art = (_value);Debug.locals.put("art", _art);Debug.locals.put("art", _art);
 BA.debugLineNum = 93;BA.debugLine="oIme.HideKeyboard";
Debug.ShouldStop(268435456);
articoliactivity.mostCurrent._oime.runVoidMethod ("HideKeyboard",articoliactivity.mostCurrent.activityBA);
 BA.debugLineNum = 94;BA.debugLine="If forResult Then";
Debug.ShouldStop(536870912);
if (articoliactivity._forresult.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 95;BA.debugLine="forResult = False";
Debug.ShouldStop(1073741824);
articoliactivity._forresult = articoliactivity.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 96;BA.debugLine="CallSubDelayed2(OrdineActivity, \"GetResult\", art";
Debug.ShouldStop(-2147483648);
articoliactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",articoliactivity.processBA,(Object)((articoliactivity.mostCurrent._ordineactivity.getObject())),(Object)(BA.ObjectToString("GetResult")),(Object)((_art)));
 BA.debugLineNum = 97;BA.debugLine="Activity.Finish()";
Debug.ShouldStop(1);
articoliactivity.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 99;BA.debugLine="Msgbox(art.Descrizione, \"Articolo\")";
Debug.ShouldStop(4);
articoliactivity.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_art.getField(true,"_descrizione"))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Articolo"))),articoliactivity.mostCurrent.activityBA);
 };
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scegliarticoloperordine() throws Exception{
try {
		Debug.PushSubsStack("ScegliArticoloPerOrdine (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,24);
if (RapidSub.canDelegate("scegliarticoloperordine")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","scegliarticoloperordine");}
 BA.debugLineNum = 24;BA.debugLine="Public Sub ScegliArticoloPerOrdine()";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="forResult = True";
Debug.ShouldStop(16777216);
articoliactivity._forresult = articoliactivity.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 26;BA.debugLine="If lvArticoli.Size == 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",articoliactivity.mostCurrent._lvarticoli.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 27;BA.debugLine="AggiornaLista(Starter.db.GetArticoli())";
Debug.ShouldStop(67108864);
_aggiornalista(articoliactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getarticoli"));
 };
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txcerca_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txCerca_TextChanged (articoliactivity) ","articoliactivity",14,articoliactivity.mostCurrent.activityBA,articoliactivity.mostCurrent,69);
if (RapidSub.canDelegate("txcerca_textchanged")) { return app.aegdistribuzione.articoliactivity.remoteMe.runUserSub(false, "articoliactivity","txcerca_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 69;BA.debugLine="Sub txCerca_TextChanged (Old As String, New As Str";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="AggiornaLista(Starter.db.CercaArticoliPerNome(New";
Debug.ShouldStop(32);
_aggiornalista(articoliactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_cercaarticolipernome",(Object)(_new)));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}