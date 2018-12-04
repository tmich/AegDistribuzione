package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dettaglioordineactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (dettaglioordineactivity) ","dettaglioordineactivity",13,dettaglioordineactivity.mostCurrent.activityBA,dettaglioordineactivity.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return app.aegdistribuzione.dettaglioordineactivity.remoteMe.runUserSub(false, "dettaglioordineactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"DettaglioOrdineLayout\")";
Debug.ShouldStop(4194304);
dettaglioordineactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DettaglioOrdineLayout")),dettaglioordineactivity.mostCurrent.activityBA);
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
		Debug.PushSubsStack("Activity_Pause (dettaglioordineactivity) ","dettaglioordineactivity",13,dettaglioordineactivity.mostCurrent.activityBA,dettaglioordineactivity.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return app.aegdistribuzione.dettaglioordineactivity.remoteMe.runUserSub(false, "dettaglioordineactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (dettaglioordineactivity) ","dettaglioordineactivity",13,dettaglioordineactivity.mostCurrent.activityBA,dettaglioordineactivity.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return app.aegdistribuzione.dettaglioordineactivity.remoteMe.runUserSub(false, "dettaglioordineactivity","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _aggiornalista(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("AggiornaLista (dettaglioordineactivity) ","dettaglioordineactivity",13,dettaglioordineactivity.mostCurrent.activityBA,dettaglioordineactivity.mostCurrent,26);
if (RapidSub.canDelegate("aggiornalista")) { return app.aegdistribuzione.dettaglioordineactivity.remoteMe.runUserSub(false, "dettaglioordineactivity","aggiornalista", _o);}
RemoteObject _c = RemoteObject.declareNull("app.aegdistribuzione.cliente");
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("o", _o);
 BA.debugLineNum = 26;BA.debugLine="Sub AggiornaLista(o As Ordine)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Dim c As Cliente = Starter.db.GetCliente(o.IdClie";
Debug.ShouldStop(67108864);
_c = dettaglioordineactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getcliente",(Object)(_o.getField(true,"_idcliente")));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 28;BA.debugLine="Activity.Title = \"Ordine n \" & o.Id & \" per \" & c";
Debug.ShouldStop(134217728);
dettaglioordineactivity.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ordine n "),_o.getField(true,"_id"),RemoteObject.createImmutable(" per "),_c.getField(true,"_denominazione"))));
 BA.debugLineNum = 29;BA.debugLine="Label1.Text = \"Ordine n \" & o.Id & \" del \" & o.Da";
Debug.ShouldStop(268435456);
dettaglioordineactivity.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ordine n "),_o.getField(true,"_id"),RemoteObject.createImmutable(" del "),_o.runClassMethod (app.aegdistribuzione.ordine.class, "_getdataformattata"))));
 BA.debugLineNum = 30;BA.debugLine="Label2.Text = \"Totale: \" & NumberFormat2(o.Totale";
Debug.ShouldStop(536870912);
dettaglioordineactivity.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Totale: "),dettaglioordineactivity.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _o.runClassMethod (app.aegdistribuzione.ordine.class, "_totale"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(dettaglioordineactivity.mostCurrent.__c.getField(true,"False"))))));
 BA.debugLineNum = 31;BA.debugLine="For Each v As VoceOrdine In o.Voci";
Debug.ShouldStop(1073741824);
{
final RemoteObject group5 = _o.getField(false,"_voci");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (group5.runMethod(false,"Get",index5));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 32;BA.debugLine="ListView1.FastScrollEnabled=True";
Debug.ShouldStop(-2147483648);
dettaglioordineactivity.mostCurrent._listview1.runMethod(true,"setFastScrollEnabled",dettaglioordineactivity.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 33;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor = Col";
Debug.ShouldStop(1);
dettaglioordineactivity.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",dettaglioordineactivity.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 34;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize = 18";
Debug.ShouldStop(2);
dettaglioordineactivity.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 35;BA.debugLine="ListView1.AddSingleLine(v.Qta & \"x \"  & v.DescAr";
Debug.ShouldStop(4);
dettaglioordineactivity.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_v.getField(true,"_qta"),RemoteObject.createImmutable("x "),_v.getField(true,"_descart"),RemoteObject.createImmutable(" ("),dettaglioordineactivity.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _v.getField(true,"_prezzo"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(dettaglioordineactivity.mostCurrent.__c.getField(true,"False"))),RemoteObject.createImmutable(")")))));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
 //BA.debugLineNum = 16;BA.debugLine="Private Label1 As Label";
dettaglioordineactivity.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ListView1 As ListView";
dettaglioordineactivity.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label2 As Label";
dettaglioordineactivity.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}