package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clientiactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"ClientiLayout\")";
Debug.ShouldStop(16777216);
clientiactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ClientiLayout")),clientiactivity.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="oIme.Initialize(\"Keyboard\")";
Debug.ShouldStop(33554432);
clientiactivity.mostCurrent._oime.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("Keyboard")));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,56);
if (RapidSub.canDelegate("activity_pause")) { return app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Resume (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) { return app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","activity_resume");}
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="If txCerca.Visible Then";
Debug.ShouldStop(512);
if (clientiactivity.mostCurrent._txcerca.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="AggiornaLista(Starter.db.CercaClientiPerNome(txC";
Debug.ShouldStop(1024);
_aggiornalista(clientiactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_cercaclientipernome",(Object)(clientiactivity.mostCurrent._txcerca.runMethod(true,"getText"))));
 }else {
 BA.debugLineNum = 45;BA.debugLine="AggiornaLista(Starter.db.GetClienti())";
Debug.ShouldStop(4096);
_aggiornalista(clientiactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getclienti"));
 };
 BA.debugLineNum = 48;BA.debugLine="If lvClienti.Size == 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",clientiactivity.mostCurrent._lvclienti.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 49;BA.debugLine="lvClienti.SingleLineLayout.ItemHeight = 90";
Debug.ShouldStop(65536);
clientiactivity.mostCurrent._lvclienti.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",BA.numberCast(int.class, 90));
 BA.debugLineNum = 50;BA.debugLine="lvClienti.SingleLineLayout.Label.TextColor = Col";
Debug.ShouldStop(131072);
clientiactivity.mostCurrent._lvclienti.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",clientiactivity.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 51;BA.debugLine="lvClienti.SingleLineLayout.Label.Typeface = Type";
Debug.ShouldStop(262144);
clientiactivity.mostCurrent._lvclienti.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(false,"setTypeface",clientiactivity.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"CreateNew",(Object)(clientiactivity.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(clientiactivity.mostCurrent.__c.getField(false,"Typeface").getField(true,"STYLE_BOLD_ITALIC"))));
 BA.debugLineNum = 52;BA.debugLine="lvClienti.AddSingleLine(\"Nessun cliente in lista";
Debug.ShouldStop(524288);
clientiactivity.mostCurrent._lvclienti.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Nessun cliente in lista. Aggiornare i clienti."))));
 };
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _aggiornalista(RemoteObject _clienti) throws Exception{
try {
		Debug.PushSubsStack("AggiornaLista (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,29);
if (RapidSub.canDelegate("aggiornalista")) { return app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","aggiornalista", _clienti);}
RemoteObject _c = RemoteObject.declareNull("app.aegdistribuzione.cliente");
Debug.locals.put("clienti", _clienti);
 BA.debugLineNum = 29;BA.debugLine="Sub AggiornaLista(clienti As List)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="lvClienti.Clear";
Debug.ShouldStop(536870912);
clientiactivity.mostCurrent._lvclienti.runVoidMethod ("Clear");
 BA.debugLineNum = 31;BA.debugLine="lvClienti.TwoLinesAndBitmap.ItemHeight = 60dip";
Debug.ShouldStop(1073741824);
clientiactivity.mostCurrent._lvclienti.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",clientiactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 32;BA.debugLine="lvClienti.TwoLinesAndBitmap.Label.TextColor = Col";
Debug.ShouldStop(-2147483648);
clientiactivity.mostCurrent._lvclienti.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",clientiactivity.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 33;BA.debugLine="lvClienti.TwoLinesAndBitmap.Label.TextSize = 22";
Debug.ShouldStop(1);
clientiactivity.mostCurrent._lvclienti.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 34;BA.debugLine="lvClienti.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(2);
clientiactivity.mostCurrent._lvclienti.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 36;BA.debugLine="For Each c As Cliente In clienti";
Debug.ShouldStop(8);
{
final RemoteObject group6 = _clienti;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_c = (group6.runMethod(false,"Get",index6));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 37;BA.debugLine="lvClienti.AddTwoLinesAndBitmap2(c.Denominazione,";
Debug.ShouldStop(16);
clientiactivity.mostCurrent._lvclienti.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_c.getField(true,"_denominazione"))),(Object)(BA.ObjectToCharSequence(_c.getField(true,"_indirizzo"))),(Object)((clientiactivity.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(clientiactivity.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("persona.png"))).getObject())),(Object)((_c)));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("btnAggiorna_Click (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,88);
if (RapidSub.canDelegate("btnaggiorna_click")) { app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","btnaggiorna_click"); return;}
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
public ResumableSub_btnAggiorna_Click(app.aegdistribuzione.clientiactivity parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
app.aegdistribuzione.clientiactivity parent;
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAggiorna_Click (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,88);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 89;BA.debugLine="ProgressDialogShow2(\"Aggiornamento in corso\", Fal";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",clientiactivity.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Aggiornamento in corso")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 90;BA.debugLine="Wait For (Starter.client.ScaricaClienti) Complete";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", clientiactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_scaricaclienti"));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 91;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 92;BA.debugLine="If Result.Size > 0 Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 93;BA.debugLine="Starter.db.SalvaClienti(Result)";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvaclienti",(Object)(_result));
 BA.debugLineNum = 94;BA.debugLine="AggiornaLista(Starter.db.GetClienti())";
Debug.ShouldStop(536870912);
_aggiornalista(parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getclienti"));
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
 BA.debugLineNum = 97;BA.debugLine="ProgressDialogHide()";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("btnAnnulla_Click (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,78);
if (RapidSub.canDelegate("btnannulla_click")) { return app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","btnannulla_click");}
 BA.debugLineNum = 78;BA.debugLine="Sub btnAnnulla_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="txCerca.Visible = False";
Debug.ShouldStop(16384);
clientiactivity.mostCurrent._txcerca.runMethod(true,"setVisible",clientiactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="btnCerca.Visible = True";
Debug.ShouldStop(32768);
clientiactivity.mostCurrent._btncerca.runMethod(true,"setVisible",clientiactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="btnAnnulla.Visible = False";
Debug.ShouldStop(65536);
clientiactivity.mostCurrent._btnannulla.runMethod(true,"setVisible",clientiactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 82;BA.debugLine="txCerca.Text = \"\"";
Debug.ShouldStop(131072);
clientiactivity.mostCurrent._txcerca.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 83;BA.debugLine="oIme.HideKeyboard";
Debug.ShouldStop(262144);
clientiactivity.mostCurrent._oime.runVoidMethod ("HideKeyboard",clientiactivity.mostCurrent.activityBA);
 BA.debugLineNum = 84;BA.debugLine="Label1.Visible = True";
Debug.ShouldStop(524288);
clientiactivity.mostCurrent._label1.runMethod(true,"setVisible",clientiactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 85;BA.debugLine="AggiornaLista(Starter.db.GetClienti())";
Debug.ShouldStop(1048576);
_aggiornalista(clientiactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getclienti"));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btnCerca_Click (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,70);
if (RapidSub.canDelegate("btncerca_click")) { return app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","btncerca_click");}
 BA.debugLineNum = 70;BA.debugLine="Sub btnCerca_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Label1.Visible = False";
Debug.ShouldStop(64);
clientiactivity.mostCurrent._label1.runMethod(true,"setVisible",clientiactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 72;BA.debugLine="txCerca.Visible = True";
Debug.ShouldStop(128);
clientiactivity.mostCurrent._txcerca.runMethod(true,"setVisible",clientiactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 73;BA.debugLine="oIme.ShowKeyboard(txCerca)";
Debug.ShouldStop(256);
clientiactivity.mostCurrent._oime.runVoidMethod ("ShowKeyboard",(Object)((clientiactivity.mostCurrent._txcerca.getObject())));
 BA.debugLineNum = 74;BA.debugLine="btnCerca.Visible = False";
Debug.ShouldStop(512);
clientiactivity.mostCurrent._btncerca.runMethod(true,"setVisible",clientiactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="btnAnnulla.Visible = True";
Debug.ShouldStop(1024);
clientiactivity.mostCurrent._btnannulla.runMethod(true,"setVisible",clientiactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 15;BA.debugLine="Dim lvClienti As ListView";
clientiactivity.mostCurrent._lvclienti = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim txCerca As EditText";
clientiactivity.mostCurrent._txcerca = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim btnCerca As Button";
clientiactivity.mostCurrent._btncerca = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim btnAnnulla As Button";
clientiactivity.mostCurrent._btnannulla = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim Label1 As Label";
clientiactivity.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim oIme As IME";
clientiactivity.mostCurrent._oime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lvclienti_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lvClienti_ItemClick (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,61);
if (RapidSub.canDelegate("lvclienti_itemclick")) { return app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","lvclienti_itemclick", _position, _value);}
RemoteObject _cli = RemoteObject.declareNull("app.aegdistribuzione.cliente");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 61;BA.debugLine="Sub lvClienti_ItemClick (Position As Int, Value As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim cli As Cliente = Value";
Debug.ShouldStop(536870912);
_cli = (_value);Debug.locals.put("cli", _cli);Debug.locals.put("cli", _cli);
 BA.debugLineNum = 63;BA.debugLine="CallSubDelayed2(SchedaClienteActivity, \"Visualizz";
Debug.ShouldStop(1073741824);
clientiactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",clientiactivity.processBA,(Object)((clientiactivity.mostCurrent._schedaclienteactivity.getObject())),(Object)(BA.ObjectToString("VisualizzaScheda")),(Object)((_cli)));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _txcerca_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txCerca_TextChanged (clientiactivity) ","clientiactivity",13,clientiactivity.mostCurrent.activityBA,clientiactivity.mostCurrent,66);
if (RapidSub.canDelegate("txcerca_textchanged")) { return app.aegdistribuzione.clientiactivity.remoteMe.runUserSub(false, "clientiactivity","txcerca_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 66;BA.debugLine="Sub txCerca_TextChanged (Old As String, New As Str";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="AggiornaLista(Starter.db.CercaClientiPerNome(New)";
Debug.ShouldStop(4);
_aggiornalista(clientiactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_cercaclientipernome",(Object)(_new)));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}