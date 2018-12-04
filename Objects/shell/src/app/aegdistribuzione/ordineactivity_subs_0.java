package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ordineactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,45);
if (RapidSub.canDelegate("activity_create")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="Activity.LoadLayout(\"OrdineLayout\")";
Debug.ShouldStop(16384);
ordineactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("OrdineLayout")),ordineactivity.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,54);
if (RapidSub.canDelegate("activity_pause")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _aggiorna() throws Exception{
try {
		Debug.PushSubsStack("Aggiorna (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,98);
if (RapidSub.canDelegate("aggiorna")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","aggiorna");}
 BA.debugLineNum = 98;BA.debugLine="Sub Aggiorna";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="m_ordine = Starter.db.GetOrdineInCorso(m_ordine.I";
Debug.ShouldStop(4);
ordineactivity.mostCurrent._m_ordine = ordineactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getordineincorso",(Object)(ordineactivity.mostCurrent._m_ordine.getField(true,"_id")));
 BA.debugLineNum = 100;BA.debugLine="CaricaVoci";
Debug.ShouldStop(8);
_caricavoci();
 BA.debugLineNum = 101;BA.debugLine="btnInvia.Enabled = (m_ordine.Voci.Size > 0)";
Debug.ShouldStop(16);
ordineactivity.mostCurrent._btninvia.runMethod(true,"setEnabled",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",ordineactivity.mostCurrent._m_ordine.getField(false,"_voci").runMethod(true,"getSize"),BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 102;BA.debugLine="lblTotale.Text = NumberFormat2(m_ordine.Totale, 0";
Debug.ShouldStop(32);
ordineactivity.mostCurrent._lbltotale.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(ordineactivity.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, ordineactivity.mostCurrent._m_ordine.runClassMethod (app.aegdistribuzione.ordine.class, "_totale"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(ordineactivity.mostCurrent.__c.getField(true,"False"))),RemoteObject.createImmutable(" €"))));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaggiungi_click() throws Exception{
try {
		Debug.PushSubsStack("btnAggiungi_Click (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,105);
if (RapidSub.canDelegate("btnaggiungi_click")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","btnaggiungi_click");}
 BA.debugLineNum = 105;BA.debugLine="Sub btnAggiungi_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="CallSubDelayed(ArticoliActivity, \"ScegliArticoloP";
Debug.ShouldStop(512);
ordineactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed",ordineactivity.processBA,(Object)((ordineactivity.mostCurrent._articoliactivity.getObject())),(Object)(RemoteObject.createImmutable("ScegliArticoloPerOrdine")));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btninvia_longclick() throws Exception{
try {
		Debug.PushSubsStack("btnInvia_LongClick (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,128);
if (RapidSub.canDelegate("btninvia_longclick")) { app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","btninvia_longclick"); return;}
ResumableSub_btnInvia_LongClick rsub = new ResumableSub_btnInvia_LongClick(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInvia_LongClick extends BA.ResumableSub {
public ResumableSub_btnInvia_LongClick(app.aegdistribuzione.ordineactivity parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
app.aegdistribuzione.ordineactivity parent;
RemoteObject _iresult = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.declareNull("app.aegdistribuzione.ordine");
RemoteObject _storico = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _preferiti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInvia_LongClick (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,128);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 129;BA.debugLine="Msgbox2Async(\"Inviare l'ordine?\", \"Invio\", \"Invia";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("Inviare l'ordine?")),(Object)(BA.ObjectToCharSequence("Invio")),(Object)(BA.ObjectToString("Invia")),(Object)(BA.ObjectToString("Annulla")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),ordineactivity.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 130;BA.debugLine="Wait For MsgBox_Result (iResult As Int)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", ordineactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 25;
return;
case 25:
//C
this.state = 1;
_iresult = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("iResult", _iresult);
;
 BA.debugLineNum = 132;BA.debugLine="If iResult == DialogResponse.POSITIVE Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_iresult,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 133;BA.debugLine="ProgressDialogShow2(\"Invio in corso\", False)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",ordineactivity.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Invio in corso")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 134;BA.debugLine="Wait For (Starter.client.Invia(m_ordine)) Comple";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", ordineactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_invia",(Object)(parent.mostCurrent._m_ordine)));
this.state = 26;
return;
case 26:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 135;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(64);
if (true) break;

case 4:
//if
this.state = 23;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 22;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 136;BA.debugLine="If Result <> Null Then";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 20;
if (RemoteObject.solveBoolean("N",_result)) { 
this.state = 9;
}else {
this.state = 19;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 137;BA.debugLine="Starter.db.SalvaOrdine(Result)";
Debug.ShouldStop(256);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvaordine",(Object)(_result));
 BA.debugLineNum = 138;BA.debugLine="Starter.db.EliminaOrdineInCorso(m_ordine.Id)";
Debug.ShouldStop(512);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_eliminaordineincorso",(Object)(parent.mostCurrent._m_ordine.getField(true,"_id")));
 BA.debugLineNum = 140;BA.debugLine="wait for (Starter.client.StoricoOrdiniPerClien";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", ordineactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_storicoordinipercliente",(Object)(parent.mostCurrent._m_cliente.getField(true,"_id"))));
this.state = 27;
return;
case 27:
//C
this.state = 10;
_storico = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Storico", _storico);
;
 BA.debugLineNum = 141;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(4096);
if (true) break;

case 10:
//if
this.state = 13;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 142;BA.debugLine="Starter.db.SalvaStoricoOrdiniPerCliente(Stori";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvastoricoordinipercliente",(Object)(_storico),(Object)(parent.mostCurrent._m_cliente.getField(true,"_id")));
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 145;BA.debugLine="Wait For (Starter.client.ScaricaPreferitiPerCl";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", ordineactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_scaricapreferitipercliente",(Object)(parent.mostCurrent._m_cliente.getField(true,"_id"))));
this.state = 28;
return;
case 28:
//C
this.state = 14;
_preferiti = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Preferiti", _preferiti);
;
 BA.debugLineNum = 146;BA.debugLine="If Starter.client.Successo Then";
Debug.ShouldStop(131072);
if (true) break;

case 14:
//if
this.state = 17;
if (parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_getsuccesso").<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 147;BA.debugLine="Starter.db.SalvaPreferitiPerCliente(Preferiti";
Debug.ShouldStop(262144);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_salvapreferitipercliente",(Object)(_preferiti),(Object)(parent.mostCurrent._m_cliente.getField(true,"_id")));
 if (true) break;

case 17:
//C
this.state = 20;
;
 BA.debugLineNum = 150;BA.debugLine="ProgressDialogHide()";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 151;BA.debugLine="ToastMessageShow(\"Ordine inviato correttamente";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Ordine inviato correttamente")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 152;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 154;BA.debugLine="Msgbox(\"C'è stato un problema con l'invio dell";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("C'è stato un problema con l'invio dell'ordine: "),parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_geterrore")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Attenzione"))),ordineactivity.mostCurrent.activityBA);
 if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 157;BA.debugLine="Msgbox(\"C'è stato un problema con l'invio dell'";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("C'è stato un problema con l'invio dell'ordine: "),parent.mostCurrent._starter._client.runClassMethod (app.aegdistribuzione.apiclient.class, "_geterrore")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Attenzione"))),ordineactivity.mostCurrent.activityBA);
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static void  _msgbox_result(RemoteObject _iresult) throws Exception{
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,82);
if (RapidSub.canDelegate("button1_click")) { app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","button1_click"); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(app.aegdistribuzione.ordineactivity parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
app.aegdistribuzione.ordineactivity parent;
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _id_voce = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _iresult = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,82);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 83;BA.debugLine="Dim index As Int = clv2.GetItemFromView(Sender)";
Debug.ShouldStop(262144);
_index = parent.mostCurrent._clv2.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent.__c.runMethod(false,"Sender",ordineactivity.mostCurrent.activityBA)));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 84;BA.debugLine="Dim id_voce As Int = clv2.GetValue(index)";
Debug.ShouldStop(524288);
_id_voce = BA.numberCast(int.class, parent.mostCurrent._clv2.runClassMethod (app.aegdistribuzione.customlistview.class, "_getvalue",(Object)(_index)));Debug.locals.put("id_voce", _id_voce);Debug.locals.put("id_voce", _id_voce);
 BA.debugLineNum = 85;BA.debugLine="Dim v As VoceOrdine = Starter.db.GetVoce(id_voce)";
Debug.ShouldStop(1048576);
_v = parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getvoce",(Object)(_id_voce));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 88;BA.debugLine="Msgbox2Async(\"Eliminare \" & v.DescArt & \"?\", \"Eli";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Eliminare "),_v.getField(true,"_descart"),RemoteObject.createImmutable("?")))),(Object)(BA.ObjectToCharSequence("Elimina")),(Object)(BA.ObjectToString("Elimina")),(Object)(BA.ObjectToString("Annulla")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),ordineactivity.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 89;BA.debugLine="Wait For MsgBox_Result (iResult As Int)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", ordineactivity.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_iresult = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("iResult", _iresult);
;
 BA.debugLineNum = 91;BA.debugLine="If iResult == DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_iresult,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 92;BA.debugLine="Starter.db.EliminaVoce(id_voce)";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_eliminavoce",(Object)(_id_voce));
 BA.debugLineNum = 93;BA.debugLine="m_ordine = Starter.db.GetOrdineInCorso(m_ordine.";
Debug.ShouldStop(268435456);
parent.mostCurrent._m_ordine = parent.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getordineincorso",(Object)(parent.mostCurrent._m_ordine.getField(true,"_id")));
 BA.debugLineNum = 94;BA.debugLine="Aggiorna";
Debug.ShouldStop(536870912);
_aggiorna();
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _carica(RemoteObject _ord) throws Exception{
try {
		Debug.PushSubsStack("Carica (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,58);
if (RapidSub.canDelegate("carica")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","carica", _ord);}
Debug.locals.put("ord", _ord);
 BA.debugLineNum = 58;BA.debugLine="Public Sub Carica(ord As Ordine)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="m_ordine = ord";
Debug.ShouldStop(67108864);
ordineactivity.mostCurrent._m_ordine = _ord;
 BA.debugLineNum = 60;BA.debugLine="m_cliente = Starter.db.GetCliente(m_ordine.IdClie";
Debug.ShouldStop(134217728);
ordineactivity.mostCurrent._m_cliente = ordineactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getcliente",(Object)(ordineactivity.mostCurrent._m_ordine.getField(true,"_idcliente")));
 BA.debugLineNum = 61;BA.debugLine="lblCliente.Text = m_cliente.Denominazione";
Debug.ShouldStop(268435456);
ordineactivity.mostCurrent._lblcliente.runMethod(true,"setText",BA.ObjectToCharSequence(ordineactivity.mostCurrent._m_cliente.getField(true,"_denominazione")));
 BA.debugLineNum = 62;BA.debugLine="lblIndirizzo.Text = m_cliente.Indirizzo";
Debug.ShouldStop(536870912);
ordineactivity.mostCurrent._lblindirizzo.runMethod(true,"setText",BA.ObjectToCharSequence(ordineactivity.mostCurrent._m_cliente.getField(true,"_indirizzo")));
 BA.debugLineNum = 63;BA.debugLine="lblOrdine.Text = \"Ordine n° \" & m_ordine.Id";
Debug.ShouldStop(1073741824);
ordineactivity.mostCurrent._lblordine.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ordine n° "),ordineactivity.mostCurrent._m_ordine.getField(true,"_id"))));
 BA.debugLineNum = 64;BA.debugLine="lblTotale.Text = NumberFormat2(m_ordine.Totale, 0";
Debug.ShouldStop(-2147483648);
ordineactivity.mostCurrent._lbltotale.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(ordineactivity.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, ordineactivity.mostCurrent._m_ordine.runClassMethod (app.aegdistribuzione.ordine.class, "_totale"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(ordineactivity.mostCurrent.__c.getField(true,"False"))),RemoteObject.createImmutable(" €"))));
 BA.debugLineNum = 65;BA.debugLine="CaricaVoci";
Debug.ShouldStop(1);
_caricavoci();
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _caricavoci() throws Exception{
try {
		Debug.PushSubsStack("CaricaVoci (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,68);
if (RapidSub.canDelegate("caricavoci")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","caricavoci");}
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
 BA.debugLineNum = 68;BA.debugLine="Private Sub CaricaVoci()";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="clv2.Clear";
Debug.ShouldStop(16);
ordineactivity.mostCurrent._clv2.runClassMethod (app.aegdistribuzione.customlistview.class, "_clear");
 BA.debugLineNum = 70;BA.debugLine="For Each v As VoceOrdine In m_ordine.Voci";
Debug.ShouldStop(32);
{
final RemoteObject group2 = ordineactivity.mostCurrent._m_ordine.getField(false,"_voci");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (group2.runMethod(false,"Get",index2));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 71;BA.debugLine="clv2.Add(CreateListItem(v.DescArt, v.Qta, v.Prez";
Debug.ShouldStop(64);
ordineactivity.mostCurrent._clv2.runClassMethod (app.aegdistribuzione.customlistview.class, "_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistitem(_v.getField(true,"_descart"),_v.getField(true,"_qta"),_v.getField(true,"_prezzo"),ordineactivity.mostCurrent._clv2.runClassMethod (app.aegdistribuzione.customlistview.class, "_asview").runMethod(true,"getWidth"),ordineactivity.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))).getObject()),(Object)((_v.getField(true,"_id"))));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv2_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clv2_ItemClick (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,75);
if (RapidSub.canDelegate("clv2_itemclick")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","clv2_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 75;BA.debugLine="Sub clv2_ItemClick(Index As Int, Value As Object)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="clv2.AsView.BringToFront";
Debug.ShouldStop(2048);
ordineactivity.mostCurrent._clv2.runClassMethod (app.aegdistribuzione.customlistview.class, "_asview").runVoidMethod ("BringToFront");
 BA.debugLineNum = 77;BA.debugLine="Log(Index & \" = \" & Value)";
Debug.ShouldStop(4096);
ordineactivity.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_index,RemoteObject.createImmutable(" = "),_value)));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _text,RemoteObject _qta,RemoteObject _prezzo,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,29);
if (RapidSub.canDelegate("createlistitem")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","createlistitem", _text, _qta, _prezzo, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Text", _text);
Debug.locals.put("Qta", _qta);
Debug.locals.put("Prezzo", _prezzo);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 29;BA.debugLine="Sub CreateListItem(Text As String, Qta As Int, Pre";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 31;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("Initialize",ordineactivity.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="p.SetLayout(0, 0, Width, Height)";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 33;BA.debugLine="p.LoadLayout(\"CellItem\")";
Debug.ShouldStop(1);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CellItem")),ordineactivity.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="Label1.Text = Text";
Debug.ShouldStop(2);
ordineactivity.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 35;BA.debugLine="Label2.Text = NumberFormat2(Prezzo, 0, 2, 2, Fals";
Debug.ShouldStop(4);
ordineactivity.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(ordineactivity.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _prezzo)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(ordineactivity.mostCurrent.__c.getField(true,"False"))),RemoteObject.createImmutable(" €"))));
 BA.debugLineNum = 36;BA.debugLine="For i = 1 To 30";
Debug.ShouldStop(8);
{
final int step7 = 1;
final int limit7 = 30;
_i = 1 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="Spinner1.Add(i)";
Debug.ShouldStop(16);
ordineactivity.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(BA.NumberToString(_i)));
 BA.debugLineNum = 38;BA.debugLine="If i == Qta - 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_qta,RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 39;BA.debugLine="Spinner1.SelectedIndex = i";
Debug.ShouldStop(64);
ordineactivity.mostCurrent._spinner1.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, _i));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 42;BA.debugLine="Return p";
Debug.ShouldStop(512);
if (true) return _p;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getresult(RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("GetResult (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,109);
if (RapidSub.canDelegate("getresult")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","getresult", _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 109;BA.debugLine="Sub GetResult(Result As Articolo)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 112;BA.debugLine="If m_ordine.Aggiungi(Result, 1, \"\") == False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",ordineactivity.mostCurrent._m_ordine.runClassMethod (app.aegdistribuzione.ordine.class, "_aggiungi",(Object)(_result),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable(""))),ordineactivity.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 113;BA.debugLine="ToastMessageShow(\"Articolo già presente\", False)";
Debug.ShouldStop(65536);
ordineactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Articolo già presente")),(Object)(ordineactivity.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 114;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 116;BA.debugLine="Aggiorna";
Debug.ShouldStop(524288);
_aggiorna();
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 15;BA.debugLine="Dim m_ordine As Ordine";
ordineactivity.mostCurrent._m_ordine = RemoteObject.createNew ("app.aegdistribuzione.ordine");
 //BA.debugLineNum = 16;BA.debugLine="Dim m_cliente As Cliente";
ordineactivity.mostCurrent._m_cliente = RemoteObject.createNew ("app.aegdistribuzione.cliente");
 //BA.debugLineNum = 17;BA.debugLine="Dim Label1 As B4XView";
ordineactivity.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim Label2 As B4XView";
ordineactivity.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim lblCliente As Label";
ordineactivity.mostCurrent._lblcliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim lblIndirizzo As Label";
ordineactivity.mostCurrent._lblindirizzo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private clv2 As CustomListView";
ordineactivity.mostCurrent._clv2 = RemoteObject.createNew ("app.aegdistribuzione.customlistview");
 //BA.debugLineNum = 22;BA.debugLine="Private Spinner1 As Spinner";
ordineactivity.mostCurrent._spinner1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Button1 As B4XView";
ordineactivity.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblOrdine As Label";
ordineactivity.mostCurrent._lblordine = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblTotale As Label";
ordineactivity.mostCurrent._lbltotale = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnInvia As Button";
ordineactivity.mostCurrent._btninvia = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinner1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner1_ItemClick (ordineactivity) ","ordineactivity",1,ordineactivity.mostCurrent.activityBA,ordineactivity.mostCurrent,119);
if (RapidSub.canDelegate("spinner1_itemclick")) { return app.aegdistribuzione.ordineactivity.remoteMe.runUserSub(false, "ordineactivity","spinner1_itemclick", _position, _value);}
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _id_voce = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 119;BA.debugLine="Sub Spinner1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim index As Int = clv2.GetItemFromView(Sender)";
Debug.ShouldStop(8388608);
_index = ordineactivity.mostCurrent._clv2.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), ordineactivity.mostCurrent.__c.runMethod(false,"Sender",ordineactivity.mostCurrent.activityBA)));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 121;BA.debugLine="Dim id_voce As Int = clv2.GetValue(index)";
Debug.ShouldStop(16777216);
_id_voce = BA.numberCast(int.class, ordineactivity.mostCurrent._clv2.runClassMethod (app.aegdistribuzione.customlistview.class, "_getvalue",(Object)(_index)));Debug.locals.put("id_voce", _id_voce);Debug.locals.put("id_voce", _id_voce);
 BA.debugLineNum = 122;BA.debugLine="Dim v As VoceOrdine = Starter.db.GetVoce(id_voce)";
Debug.ShouldStop(33554432);
_v = ordineactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_getvoce",(Object)(_id_voce));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 123;BA.debugLine="v.Qta = Value";
Debug.ShouldStop(67108864);
_v.setField ("_qta",BA.numberCast(int.class, _value));
 BA.debugLineNum = 124;BA.debugLine="Starter.db.AggiornaVoce(v)";
Debug.ShouldStop(134217728);
ordineactivity.mostCurrent._starter._db.runClassMethod (app.aegdistribuzione.database.class, "_aggiornavoce",(Object)(_v));
 BA.debugLineNum = 125;BA.debugLine="Aggiorna";
Debug.ShouldStop(268435456);
_aggiorna();
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}