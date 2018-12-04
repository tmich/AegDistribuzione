package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class schedaclienteactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"SchedaClienteLayout\")";
Debug.ShouldStop(2097152);
schedaclienteactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SchedaClienteLayout")),schedaclienteactivity.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="TabHost1.AddTab(\"Scheda\", \"ListaPreferitiLayout\")";
Debug.ShouldStop(4194304);
schedaclienteactivity.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",schedaclienteactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("Scheda")),(Object)(RemoteObject.createImmutable("ListaPreferitiLayout")));
 BA.debugLineNum = 24;BA.debugLine="TabHost1.AddTab(\"Ordini in corso\", \"ordinincorsol";
Debug.ShouldStop(8388608);
schedaclienteactivity.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",schedaclienteactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("Ordini in corso")),(Object)(RemoteObject.createImmutable("ordinincorsolayout")));
 BA.debugLineNum = 25;BA.debugLine="TabHost1.AddTab(\"Storico Ordini\", \"StoricoOrdiniL";
Debug.ShouldStop(16777216);
schedaclienteactivity.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",schedaclienteactivity.mostCurrent.activityBA,(Object)(BA.ObjectToString("Storico Ordini")),(Object)(RemoteObject.createImmutable("StoricoOrdiniLayout")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,48);
if (RapidSub.canDelegate("activity_pause")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(schedaclienteactivity.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 38;BA.debugLine="CaricaPreferiti";
Debug.ShouldStop(32);
_caricapreferiti();
 break; }
case 1: {
 BA.debugLineNum = 40;BA.debugLine="CaricaOrdiniInCorso";
Debug.ShouldStop(128);
_caricaordiniincorso();
 break; }
case 2: {
 BA.debugLineNum = 42;BA.debugLine="CaricaStoricoOrdini";
Debug.ShouldStop(512);
_caricastoricoordini();
 break; }
default: {
 BA.debugLineNum = 44;BA.debugLine="Log(\"Boh?\")";
Debug.ShouldStop(2048);
schedaclienteactivity.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Boh?")));
 break; }
}
;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnuovo_click() throws Exception{
try {
		Debug.PushSubsStack("BtnNuovo_Click (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,121);
if (RapidSub.canDelegate("btnnuovo_click")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","btnnuovo_click");}
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
 BA.debugLineNum = 121;BA.debugLine="Sub BtnNuovo_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Dim o As Ordine = Starter.db.NuovoOrdine(cli)";
Debug.ShouldStop(33554432);
_o = schedaclienteactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_nuovoordine",(Object)(schedaclienteactivity.mostCurrent._cli));Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 123;BA.debugLine="CallSubDelayed2(OrdineActivity, \"Carica\", o)";
Debug.ShouldStop(67108864);
schedaclienteactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",schedaclienteactivity.processBA,(Object)((schedaclienteactivity.mostCurrent._ordineactivity.getObject())),(Object)(BA.ObjectToString("Carica")),(Object)((_o)));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _caricaordiniincorso() throws Exception{
try {
		Debug.PushSubsStack("CaricaOrdiniInCorso (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,90);
if (RapidSub.canDelegate("caricaordiniincorso")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","caricaordiniincorso");}
RemoteObject _ordini = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
 BA.debugLineNum = 90;BA.debugLine="Private Sub CaricaOrdiniInCorso";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Dim ordini As List = Starter.db.OrdiniInCorsoPerC";
Debug.ShouldStop(67108864);
_ordini = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ordini = schedaclienteactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_ordiniincorsopercliente",(Object)(schedaclienteactivity.mostCurrent._cli.getField(true,"_id")));Debug.locals.put("ordini", _ordini);Debug.locals.put("ordini", _ordini);
 BA.debugLineNum = 92;BA.debugLine="ListView3.Clear";
Debug.ShouldStop(134217728);
schedaclienteactivity.mostCurrent._listview3.runVoidMethod ("Clear");
 BA.debugLineNum = 93;BA.debugLine="ListView3.SingleLineLayout.Label.Gravity = Gravit";
Debug.ShouldStop(268435456);
schedaclienteactivity.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setGravity",schedaclienteactivity.mostCurrent.__c.getField(false,"Gravity").getField(true,"TOP"));
 BA.debugLineNum = 94;BA.debugLine="ListView3.SingleLineLayout.ItemHeight = 60";
Debug.ShouldStop(536870912);
schedaclienteactivity.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",BA.numberCast(int.class, 60));
 BA.debugLineNum = 95;BA.debugLine="ListView3.SingleLineLayout.Label.TextColor = Colo";
Debug.ShouldStop(1073741824);
schedaclienteactivity.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",schedaclienteactivity.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 96;BA.debugLine="ListView3.SingleLineLayout.Label.TextSize = 22";
Debug.ShouldStop(-2147483648);
schedaclienteactivity.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 97;BA.debugLine="For Each o As Ordine In ordini";
Debug.ShouldStop(1);
{
final RemoteObject group7 = _ordini;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_o = (group7.runMethod(false,"Get",index7));Debug.locals.put("o", _o);
Debug.locals.put("o", _o);
 BA.debugLineNum = 98;BA.debugLine="ListView3.AddSingleLine2(\"Ordine n. \" & o.Id, o)";
Debug.ShouldStop(2);
schedaclienteactivity.mostCurrent._listview3.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ordine n. "),_o.getField(true,"_id")))),(Object)((_o)));
 }
}Debug.locals.put("o", _o);
;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _caricapreferiti() throws Exception{
try {
		Debug.PushSubsStack("CaricaPreferiti (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,60);
if (RapidSub.canDelegate("caricapreferiti")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","caricapreferiti");}
RemoteObject _preferiti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _p = RemoteObject.declareNull("app.aegdistribuzione.preferito");
 BA.debugLineNum = 60;BA.debugLine="Private Sub CaricaPreferiti";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim preferiti As List = Starter.db.GetPreferitiCl";
Debug.ShouldStop(268435456);
_preferiti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_preferiti = schedaclienteactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getpreferiticliente",(Object)(schedaclienteactivity.mostCurrent._cli.getField(true,"_id")));Debug.locals.put("preferiti", _preferiti);Debug.locals.put("preferiti", _preferiti);
 BA.debugLineNum = 62;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(536870912);
schedaclienteactivity.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 68;BA.debugLine="ListView1.TwoLinesAndBitmap.ItemHeight = 60dip";
Debug.ShouldStop(8);
schedaclienteactivity.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",schedaclienteactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 69;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.TextColor = Col";
Debug.ShouldStop(16);
schedaclienteactivity.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",schedaclienteactivity.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 70;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.TextSize = 22";
Debug.ShouldStop(32);
schedaclienteactivity.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 71;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
Debug.ShouldStop(64);
schedaclienteactivity.mostCurrent._listview1.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 72;BA.debugLine="For Each p As Preferito In preferiti";
Debug.ShouldStop(128);
{
final RemoteObject group7 = _preferiti;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_p = (group7.runMethod(false,"Get",index7));Debug.locals.put("p", _p);
Debug.locals.put("p", _p);
 BA.debugLineNum = 74;BA.debugLine="ListView1.AddTwoLinesAndBitmap2(p.Descrizione, p";
Debug.ShouldStop(512);
schedaclienteactivity.mostCurrent._listview1.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_p.getField(true,"_descrizione"))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_p.getField(true,"_occorrenze"),RemoteObject.createImmutable(" volt"),_singplur(_p.getField(true,"_occorrenze"))))),(Object)((schedaclienteactivity.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(schedaclienteactivity.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("stella.png"))).getObject())),(Object)((_p)));
 }
}Debug.locals.put("p", _p);
;
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
public static RemoteObject  _caricastoricoordini() throws Exception{
try {
		Debug.PushSubsStack("CaricaStoricoOrdini (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,78);
if (RapidSub.canDelegate("caricastoricoordini")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","caricastoricoordini");}
RemoteObject _ordini = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
 BA.debugLineNum = 78;BA.debugLine="Private Sub CaricaStoricoOrdini";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Dim ordini As List = Starter.db.OrdiniPerCliente(";
Debug.ShouldStop(16384);
_ordini = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ordini = schedaclienteactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_ordinipercliente",(Object)(schedaclienteactivity.mostCurrent._cli.getField(true,"_id")));Debug.locals.put("ordini", _ordini);Debug.locals.put("ordini", _ordini);
 BA.debugLineNum = 80;BA.debugLine="ListView2.Clear";
Debug.ShouldStop(32768);
schedaclienteactivity.mostCurrent._listview2.runVoidMethod ("Clear");
 BA.debugLineNum = 81;BA.debugLine="ListView2.SingleLineLayout.Label.Gravity = Gravit";
Debug.ShouldStop(65536);
schedaclienteactivity.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setGravity",schedaclienteactivity.mostCurrent.__c.getField(false,"Gravity").getField(true,"TOP"));
 BA.debugLineNum = 82;BA.debugLine="ListView2.SingleLineLayout.ItemHeight = 60";
Debug.ShouldStop(131072);
schedaclienteactivity.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",BA.numberCast(int.class, 60));
 BA.debugLineNum = 83;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor = Colo";
Debug.ShouldStop(262144);
schedaclienteactivity.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",schedaclienteactivity.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 84;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize = 22";
Debug.ShouldStop(524288);
schedaclienteactivity.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 85;BA.debugLine="For Each o As Ordine In ordini";
Debug.ShouldStop(1048576);
{
final RemoteObject group7 = _ordini;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_o = (group7.runMethod(false,"Get",index7));Debug.locals.put("o", _o);
Debug.locals.put("o", _o);
 BA.debugLineNum = 86;BA.debugLine="ListView2.AddSingleLine2(\"Ordine del \" & o.DataF";
Debug.ShouldStop(2097152);
schedaclienteactivity.mostCurrent._listview2.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ordine del "),_o.runClassMethod (app.aegdistribuzione.ordine.class, "_getdataformattata")))),(Object)((_o)));
 }
}Debug.locals.put("o", _o);
;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
 //BA.debugLineNum = 15;BA.debugLine="Dim cli As Cliente";
schedaclienteactivity.mostCurrent._cli = RemoteObject.createNew ("app.aegdistribuzione.cliente");
 //BA.debugLineNum = 16;BA.debugLine="Dim TabHost1 As TabHost";
schedaclienteactivity.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim ListView1, ListView2, ListView3 As ListView";
schedaclienteactivity.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
schedaclienteactivity.mostCurrent._listview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
schedaclienteactivity.mostCurrent._listview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _listview2_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView2_ItemClick (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,115);
if (RapidSub.canDelegate("listview2_itemclick")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","listview2_itemclick", _position, _value);}
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 115;BA.debugLine="Sub ListView2_ItemClick (Position As Int, Value As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="Dim o As Ordine = Value";
Debug.ShouldStop(524288);
_o = (_value);Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 118;BA.debugLine="CallSubDelayed2(DettaglioOrdineActivity, \"Aggiorn";
Debug.ShouldStop(2097152);
schedaclienteactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",schedaclienteactivity.processBA,(Object)((schedaclienteactivity.mostCurrent._dettaglioordineactivity.getObject())),(Object)(BA.ObjectToString("AggiornaLista")),(Object)((_o)));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview3_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView3_ItemClick (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,126);
if (RapidSub.canDelegate("listview3_itemclick")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","listview3_itemclick", _position, _value);}
RemoteObject _o = RemoteObject.declareNull("app.aegdistribuzione.ordine");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 126;BA.debugLine="Sub ListView3_ItemClick (Position As Int, Value As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="Dim o As Ordine = Value";
Debug.ShouldStop(1073741824);
_o = (_value);Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 128;BA.debugLine="CallSubDelayed2(OrdineActivity, \"Carica\", o)";
Debug.ShouldStop(-2147483648);
schedaclienteactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",schedaclienteactivity.processBA,(Object)((schedaclienteactivity.mostCurrent._ordineactivity.getObject())),(Object)(BA.ObjectToString("Carica")),(Object)((_o)));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _singplur(RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SingPlur (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,52);
if (RapidSub.canDelegate("singplur")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","singplur", _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 52;BA.debugLine="Sub SingPlur(v As Int) As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If v == 1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_v,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 54;BA.debugLine="Return \"a\"";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString("a");
 }else {
 BA.debugLineNum = 56;BA.debugLine="Return \"e\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString("e");
 };
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
public static RemoteObject  _tabhost1_tabchanged() throws Exception{
try {
		Debug.PushSubsStack("TabHost1_TabChanged (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,102);
if (RapidSub.canDelegate("tabhost1_tabchanged")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","tabhost1_tabchanged");}
 BA.debugLineNum = 102;BA.debugLine="Sub TabHost1_TabChanged";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Select TabHost1.CurrentTab";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(schedaclienteactivity.mostCurrent._tabhost1.runMethod(true,"getCurrentTab"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 105;BA.debugLine="CaricaPreferiti";
Debug.ShouldStop(256);
_caricapreferiti();
 break; }
case 1: {
 BA.debugLineNum = 107;BA.debugLine="CaricaOrdiniInCorso";
Debug.ShouldStop(1024);
_caricaordiniincorso();
 break; }
case 2: {
 BA.debugLineNum = 109;BA.debugLine="CaricaStoricoOrdini";
Debug.ShouldStop(4096);
_caricastoricoordini();
 break; }
default: {
 BA.debugLineNum = 111;BA.debugLine="Log(\"Boh?\")";
Debug.ShouldStop(16384);
schedaclienteactivity.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Boh?")));
 break; }
}
;
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visualizzascheda(RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("VisualizzaScheda (schedaclienteactivity) ","schedaclienteactivity",4,schedaclienteactivity.mostCurrent.activityBA,schedaclienteactivity.mostCurrent,28);
if (RapidSub.canDelegate("visualizzascheda")) { return app.aegdistribuzione.schedaclienteactivity.remoteMe.runUserSub(false, "schedaclienteactivity","visualizzascheda", _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 28;BA.debugLine="Sub VisualizzaScheda(c As Cliente)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="cli = c";
Debug.ShouldStop(268435456);
schedaclienteactivity.mostCurrent._cli = _c;
 BA.debugLineNum = 30;BA.debugLine="Activity.Title = cli.Denominazione & \" \" & cli.In";
Debug.ShouldStop(536870912);
schedaclienteactivity.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence(RemoteObject.concat(schedaclienteactivity.mostCurrent._cli.getField(true,"_denominazione"),RemoteObject.createImmutable(" "),schedaclienteactivity.mostCurrent._cli.getField(true,"_indirizzo"))));
 BA.debugLineNum = 32;BA.debugLine="CaricaPreferiti";
Debug.ShouldStop(-2147483648);
_caricapreferiti();
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}