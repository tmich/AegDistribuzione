package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class apiclient_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim m_job As HttpJob";
apiclient._m_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");__ref.setField("_m_job",apiclient._m_job);
 //BA.debugLineNum = 3;BA.debugLine="Dim m_successo As Boolean";
apiclient._m_successo = RemoteObject.createImmutable(false);__ref.setField("_m_successo",apiclient._m_successo);
 //BA.debugLineNum = 4;BA.debugLine="Dim m_url As String";
apiclient._m_url = RemoteObject.createImmutable("");__ref.setField("_m_url",apiclient._m_url);
 //BA.debugLineNum = 5;BA.debugLine="Dim m_errore As String";
apiclient._m_errore = RemoteObject.createImmutable("");__ref.setField("_m_errore",apiclient._m_errore);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _geterrore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getErrore (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("geterrore")) { return __ref.runUserSub(false, "apiclient","geterrore", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Public Sub getErrore As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Return m_errore";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(true,"_m_errore");
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
public static RemoteObject  _getsuccesso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSuccesso (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("getsuccesso")) { return __ref.runUserSub(false, "apiclient","getsuccesso", __ref);}
 BA.debugLineNum = 20;BA.debugLine="Public Sub getSuccesso As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Return m_successo";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(true,"_m_successo");
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "apiclient","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="m_job.Initialize(\"\", Me)";
Debug.ShouldStop(512);
__ref.getField(false,"_m_job").runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 12;BA.debugLine="m_url = \"http://80.211.227.37:5002/api/v2\"";
Debug.ShouldStop(2048);
__ref.setField ("_m_url",BA.ObjectToString("http://80.211.227.37:5002/api/v2"));
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _invia(RemoteObject __ref,RemoteObject _ord) throws Exception{
try {
		Debug.PushSubsStack("Invia (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("invia")) { return __ref.runUserSub(false, "apiclient","invia", __ref, _ord);}
ResumableSub_Invia rsub = new ResumableSub_Invia(null,__ref,_ord);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Invia extends BA.ResumableSub {
public ResumableSub_Invia(app.aegdistribuzione.apiclient parent,RemoteObject __ref,RemoteObject _ord) {
this.parent = parent;
this.__ref = __ref;
this._ord = _ord;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.apiclient parent;
RemoteObject _ord;
RemoteObject _ordn = RemoteObject.declareNull("app.aegdistribuzione.ordine");
RemoteObject _form = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Invia (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,316);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ord", _ord);
 BA.debugLineNum = 317;BA.debugLine="m_successo = False";
Debug.ShouldStop(268435456);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 318;BA.debugLine="Dim ordn As Ordine";
Debug.ShouldStop(536870912);
_ordn = RemoteObject.createNew ("app.aegdistribuzione.ordine");Debug.locals.put("ordn", _ordn);
 BA.debugLineNum = 319;BA.debugLine="Dim form As Map";
Debug.ShouldStop(1073741824);
_form = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("form", _form);
 BA.debugLineNum = 321;BA.debugLine="ordn.Initialize(0,0,0,\"\",\"\")";
Debug.ShouldStop(1);
_ordn.runClassMethod (app.aegdistribuzione.ordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 322;BA.debugLine="form.Initialize";
Debug.ShouldStop(2);
_form.runVoidMethod ("Initialize");
 BA.debugLineNum = 323;BA.debugLine="form.Put(\"id_cliente\", ord.IdCliente)";
Debug.ShouldStop(4);
_form.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id_cliente"))),(Object)((_ord.getField(true,"_idcliente"))));
 BA.debugLineNum = 324;BA.debugLine="form.Put(\"id_utente\", Starter.User.Id)";
Debug.ShouldStop(8);
_form.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id_utente"))),(Object)((parent._starter._user.getField(true,"_id"))));
 BA.debugLineNum = 325;BA.debugLine="form.Put(\"data\", ord.ToJson)";
Debug.ShouldStop(16);
_form.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_ord.runClassMethod (app.aegdistribuzione.ordine.class, "_tojson"))));
 BA.debugLineNum = 326;BA.debugLine="m_job.PostMultipart(m_url & \"/ordine\", form, Null";
Debug.ShouldStop(32);
__ref.getField(false,"_m_job").runVoidMethod ("_postmultipart",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/ordine"))),(Object)(_form),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 327;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
 BA.debugLineNum = 329;BA.debugLine="Try";
Debug.ShouldStop(256);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 330;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 331;BA.debugLine="m_successo = True";
Debug.ShouldStop(1024);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 332;BA.debugLine="ordn.FromJson(m_job.GetString)";
Debug.ShouldStop(2048);
_ordn.runClassMethod (app.aegdistribuzione.ordine.class, "_fromjson",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 333;BA.debugLine="Return ordn";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ordn));return;};
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 335;BA.debugLine="m_errore = m_job.ErrorMessage";
Debug.ShouldStop(16384);
__ref.setField ("_m_errore",__ref.getField(false,"_m_job").getField(true,"_errormessage"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 338;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 BA.debugLineNum = 339;BA.debugLine="m_errore = \"Errore di connessione\"";
Debug.ShouldStop(262144);
__ref.setField ("_m_errore",BA.ObjectToString("Errore di connessione"));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 342;BA.debugLine="Return Null";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _jobdone(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _login(RemoteObject __ref,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("Login (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,345);
if (RapidSub.canDelegate("login")) { return __ref.runUserSub(false, "apiclient","login", __ref, _username, _password);}
ResumableSub_Login rsub = new ResumableSub_Login(null,__ref,_username,_password);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Login extends BA.ResumableSub {
public ResumableSub_Login(app.aegdistribuzione.apiclient parent,RemoteObject __ref,RemoteObject _username,RemoteObject _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.apiclient parent;
RemoteObject _username;
RemoteObject _password;
RemoteObject _user = RemoteObject.declareNull("app.aegdistribuzione.utente");
RemoteObject _form = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Login (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,345);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 346;BA.debugLine="m_successo = False";
Debug.ShouldStop(33554432);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 347;BA.debugLine="Dim user As Utente";
Debug.ShouldStop(67108864);
_user = RemoteObject.createNew ("app.aegdistribuzione.utente");Debug.locals.put("user", _user);
 BA.debugLineNum = 348;BA.debugLine="Dim form As Map";
Debug.ShouldStop(134217728);
_form = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("form", _form);
 BA.debugLineNum = 349;BA.debugLine="form.Initialize";
Debug.ShouldStop(268435456);
_form.runVoidMethod ("Initialize");
 BA.debugLineNum = 350;BA.debugLine="form.Put(\"username\", username)";
Debug.ShouldStop(536870912);
_form.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_username)));
 BA.debugLineNum = 351;BA.debugLine="form.Put(\"password\", password)";
Debug.ShouldStop(1073741824);
_form.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("password"))),(Object)((_password)));
 BA.debugLineNum = 352;BA.debugLine="m_job.PostMultipart(m_url & \"/login\", form, Null)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_m_job").runVoidMethod ("_postmultipart",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/login"))),(Object)(_form),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 353;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
 BA.debugLineNum = 355;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
 BA.debugLineNum = 356;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 11;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 6;
}else 
{ BA.debugLineNum = 367;BA.debugLine="Else If m_job.Response.StatusCode == 404 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_m_job").getField(false,"_response").runMethod(true,"getStatusCode"),BA.numberCast(double.class, 404))) { 
this.state = 8;
}else {
this.state = 10;
}}
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 357;BA.debugLine="m_successo = True";
Debug.ShouldStop(16);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 358;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 359;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 360;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(128);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 361;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(256);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 363;BA.debugLine="Dim m As Map = objects.Get(0)";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_objects.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);
 BA.debugLineNum = 364;BA.debugLine="user.Initialize(m.Get(\"id\"), m.Get(\"username\"),";
Debug.ShouldStop(2048);
_user.runClassMethod (app.aegdistribuzione.utente.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))))),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ultimo_accesso")))))));
 BA.debugLineNum = 366;BA.debugLine="Return user";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_user));return;};
 if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 368;BA.debugLine="m_errore = \"Nome utente o password errata\"";
Debug.ShouldStop(32768);
__ref.setField ("_m_errore",BA.ObjectToString("Nome utente o password errata"));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 370;BA.debugLine="m_errore = m_job.ErrorMessage";
Debug.ShouldStop(131072);
__ref.setField ("_m_errore",__ref.getField(false,"_m_job").getField(true,"_errormessage"));
 if (true) break;

case 11:
//C
this.state = 14;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 373;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 BA.debugLineNum = 374;BA.debugLine="m_errore = \"Errore di connessione\"";
Debug.ShouldStop(2097152);
__ref.setField ("_m_errore",BA.ObjectToString("Errore di connessione"));
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 377;BA.debugLine="Return Null";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _scaricaarticoli(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScaricaArticoli (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("scaricaarticoli")) { return __ref.runUserSub(false, "apiclient","scaricaarticoli", __ref);}
ResumableSub_ScaricaArticoli rsub = new ResumableSub_ScaricaArticoli(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ScaricaArticoli extends BA.ResumableSub {
public ResumableSub_ScaricaArticoli(app.aegdistribuzione.apiclient parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.apiclient parent;
RemoteObject _m_articoli = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ob = RemoteObject.declareNull("Object");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cod = RemoteObject.createImmutable("");
RemoteObject _dtum = RemoteObject.createImmutable("");
RemoteObject _descr = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _prz = RemoteObject.createImmutable(0f);
RemoteObject _a = RemoteObject.declareNull("app.aegdistribuzione.articolo");
RemoteObject group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ScaricaArticoli (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,98);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 99;BA.debugLine="m_successo = False";
Debug.ShouldStop(4);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 100;BA.debugLine="Dim m_articoli As List";
Debug.ShouldStop(8);
_m_articoli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_articoli", _m_articoli);
 BA.debugLineNum = 101;BA.debugLine="m_articoli.Initialize";
Debug.ShouldStop(16);
_m_articoli.runVoidMethod ("Initialize");
 BA.debugLineNum = 102;BA.debugLine="m_job.Download(m_url & \"/articoli\")";
Debug.ShouldStop(32);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/articoli"))));
 BA.debugLineNum = 103;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 105;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 8;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 106;BA.debugLine="m_successo = True";
Debug.ShouldStop(512);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 107;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 108;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 109;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4096);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 110;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(8192);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 112;BA.debugLine="For Each ob In objects";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//for
this.state = 7;
group12 = _objects;
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("ob", _ob);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_ob = group12.runMethod(false,"Get",index12);Debug.locals.put("ob", _ob);}
if (true) break;

case 11:
//C
this.state = 10;
index12++;
Debug.locals.put("ob", _ob);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 113;BA.debugLine="Dim m As Map = ob";
Debug.ShouldStop(65536);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_ob);Debug.locals.put("m", _m);
 BA.debugLineNum = 114;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
Debug.ShouldStop(131072);
_cod = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codice")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 115;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
Debug.ShouldStop(262144);
_dtum = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_ultima_modifica")))));Debug.locals.put("dtum", _dtum);Debug.locals.put("dtum", _dtum);
 BA.debugLineNum = 116;BA.debugLine="Dim descr As String = m.Get(\"descrizione\")";
Debug.ShouldStop(524288);
_descr = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descrizione")))));Debug.locals.put("descr", _descr);Debug.locals.put("descr", _descr);
 BA.debugLineNum = 117;BA.debugLine="Dim id As Int = m.Get(\"id\")";
Debug.ShouldStop(1048576);
_id = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 118;BA.debugLine="Dim prz As Float = m.Get(\"prezzo\")";
Debug.ShouldStop(2097152);
_prz = BA.numberCast(float.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prezzo")))));Debug.locals.put("prz", _prz);Debug.locals.put("prz", _prz);
 BA.debugLineNum = 119;BA.debugLine="Dim a As Articolo";
Debug.ShouldStop(4194304);
_a = RemoteObject.createNew ("app.aegdistribuzione.articolo");Debug.locals.put("a", _a);
 BA.debugLineNum = 120;BA.debugLine="a.Initialize(id,cod,descr,prz,dtum)";
Debug.ShouldStop(8388608);
_a.runClassMethod (app.aegdistribuzione.articolo.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_descr),(Object)(_prz),(Object)(_dtum));
 BA.debugLineNum = 121;BA.debugLine="m_articoli.Add(a)";
Debug.ShouldStop(16777216);
_m_articoli.runVoidMethod ("Add",(Object)((_a)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("ob", _ob);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 125;BA.debugLine="Return m_articoli";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_articoli));return;};
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _scaricaclienti(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScaricaClienti (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("scaricaclienti")) { return __ref.runUserSub(false, "apiclient","scaricaclienti", __ref);}
ResumableSub_ScaricaClienti rsub = new ResumableSub_ScaricaClienti(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ScaricaClienti extends BA.ResumableSub {
public ResumableSub_ScaricaClienti(app.aegdistribuzione.apiclient parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.apiclient parent;
RemoteObject _m_clienti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ob = RemoteObject.declareNull("Object");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cod = RemoteObject.createImmutable("");
RemoteObject _denom = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _indir = RemoteObject.createImmutable("");
RemoteObject _piva = RemoteObject.createImmutable("");
RemoteObject _dtum = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.declareNull("app.aegdistribuzione.cliente");
RemoteObject group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ScaricaClienti (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,128);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 129;BA.debugLine="m_successo = False";
Debug.ShouldStop(1);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 130;BA.debugLine="Dim m_clienti As List";
Debug.ShouldStop(2);
_m_clienti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_clienti", _m_clienti);
 BA.debugLineNum = 131;BA.debugLine="m_clienti.Initialize";
Debug.ShouldStop(4);
_m_clienti.runVoidMethod ("Initialize");
 BA.debugLineNum = 132;BA.debugLine="m_job.Download(m_url & \"/clienti\")";
Debug.ShouldStop(8);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/clienti"))));
 BA.debugLineNum = 133;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 135;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 8;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 136;BA.debugLine="m_successo = True";
Debug.ShouldStop(128);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 137;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 138;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 139;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1024);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 140;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(2048);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 143;BA.debugLine="For Each ob In objects";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//for
this.state = 7;
group12 = _objects;
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("ob", _ob);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_ob = group12.runMethod(false,"Get",index12);Debug.locals.put("ob", _ob);}
if (true) break;

case 11:
//C
this.state = 10;
index12++;
Debug.locals.put("ob", _ob);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 144;BA.debugLine="Dim m As Map = ob";
Debug.ShouldStop(32768);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_ob);Debug.locals.put("m", _m);
 BA.debugLineNum = 145;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
Debug.ShouldStop(65536);
_cod = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codice")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 146;BA.debugLine="Dim denom As String = m.Get(\"denominazione\")";
Debug.ShouldStop(131072);
_denom = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("denominazione")))));Debug.locals.put("denom", _denom);Debug.locals.put("denom", _denom);
 BA.debugLineNum = 147;BA.debugLine="Dim id As Int = m.Get(\"id\")";
Debug.ShouldStop(262144);
_id = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 148;BA.debugLine="Dim indir As String = m.Get(\"indirizzo\")";
Debug.ShouldStop(524288);
_indir = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("indirizzo")))));Debug.locals.put("indir", _indir);Debug.locals.put("indir", _indir);
 BA.debugLineNum = 149;BA.debugLine="Dim piva As String = m.Get(\"part_iva\")";
Debug.ShouldStop(1048576);
_piva = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("part_iva")))));Debug.locals.put("piva", _piva);Debug.locals.put("piva", _piva);
 BA.debugLineNum = 150;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
Debug.ShouldStop(2097152);
_dtum = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_ultima_modifica")))));Debug.locals.put("dtum", _dtum);Debug.locals.put("dtum", _dtum);
 BA.debugLineNum = 151;BA.debugLine="Dim c As Cliente";
Debug.ShouldStop(4194304);
_c = RemoteObject.createNew ("app.aegdistribuzione.cliente");Debug.locals.put("c", _c);
 BA.debugLineNum = 152;BA.debugLine="c.Initialize(id,cod,denom,indir,piva,dtum)";
Debug.ShouldStop(8388608);
_c.runClassMethod (app.aegdistribuzione.cliente.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_denom),(Object)(_indir),(Object)(_piva),(Object)(_dtum));
 BA.debugLineNum = 153;BA.debugLine="m_clienti.Add(c)";
Debug.ShouldStop(16777216);
_m_clienti.runVoidMethod ("Add",(Object)((_c)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("ob", _ob);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 157;BA.debugLine="Return m_clienti";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_clienti));return;};
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _scaricapreferiti(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScaricaPreferiti (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("scaricapreferiti")) { return __ref.runUserSub(false, "apiclient","scaricapreferiti", __ref);}
ResumableSub_ScaricaPreferiti rsub = new ResumableSub_ScaricaPreferiti(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ScaricaPreferiti extends BA.ResumableSub {
public ResumableSub_ScaricaPreferiti(app.aegdistribuzione.apiclient parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.apiclient parent;
RemoteObject _m_preferiti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cod = RemoteObject.createImmutable("");
RemoteObject _desc = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _cid = RemoteObject.createImmutable("");
RemoteObject _occ = RemoteObject.createImmutable("");
RemoteObject _pr = RemoteObject.declareNull("app.aegdistribuzione.preferito");
RemoteObject group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ScaricaPreferiti (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,256);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 257;BA.debugLine="m_successo = False";
Debug.ShouldStop(1);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 258;BA.debugLine="Dim m_preferiti As List";
Debug.ShouldStop(2);
_m_preferiti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_preferiti", _m_preferiti);
 BA.debugLineNum = 259;BA.debugLine="m_preferiti.Initialize";
Debug.ShouldStop(4);
_m_preferiti.runVoidMethod ("Initialize");
 BA.debugLineNum = 260;BA.debugLine="m_job.Download(m_url & \"/preferiti\")";
Debug.ShouldStop(8);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/preferiti"))));
 BA.debugLineNum = 261;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 263;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 8;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 264;BA.debugLine="m_successo = True";
Debug.ShouldStop(128);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 265;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 266;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 267;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1024);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 268;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(2048);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 270;BA.debugLine="For Each m As Map In objects";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//for
this.state = 7;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group12 = _objects;
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_m.setObject(group12.runMethod(false,"Get",index12));}
if (true) break;

case 11:
//C
this.state = 10;
index12++;
Debug.locals.put("m", _m);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 271;BA.debugLine="Dim cod As String = m.Get(\"cod_art\")";
Debug.ShouldStop(16384);
_cod = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cod_art")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 272;BA.debugLine="Dim desc As String = m.Get(\"desc_art\")";
Debug.ShouldStop(32768);
_desc = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("desc_art")))));Debug.locals.put("desc", _desc);Debug.locals.put("desc", _desc);
 BA.debugLineNum = 273;BA.debugLine="Dim id As Int = m.Get(\"id_art\")";
Debug.ShouldStop(65536);
_id = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_art")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 274;BA.debugLine="Dim cid As String = m.Get(\"id_cliente\")";
Debug.ShouldStop(131072);
_cid = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_cliente")))));Debug.locals.put("cid", _cid);Debug.locals.put("cid", _cid);
 BA.debugLineNum = 275;BA.debugLine="Dim occ As String = m.Get(\"occorrenze\")";
Debug.ShouldStop(262144);
_occ = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("occorrenze")))));Debug.locals.put("occ", _occ);Debug.locals.put("occ", _occ);
 BA.debugLineNum = 277;BA.debugLine="Dim pr As Preferito";
Debug.ShouldStop(1048576);
_pr = RemoteObject.createNew ("app.aegdistribuzione.preferito");Debug.locals.put("pr", _pr);
 BA.debugLineNum = 278;BA.debugLine="pr.Initialize(id, cod, desc, cid, occ)";
Debug.ShouldStop(2097152);
_pr.runClassMethod (app.aegdistribuzione.preferito.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_desc),(Object)(BA.numberCast(int.class, _cid)),(Object)(BA.numberCast(int.class, _occ)));
 BA.debugLineNum = 279;BA.debugLine="m_preferiti.Add(pr)";
Debug.ShouldStop(4194304);
_m_preferiti.runVoidMethod ("Add",(Object)((_pr)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("m", _m);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 283;BA.debugLine="Return m_preferiti";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_preferiti));return;};
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static RemoteObject  _scaricapreferitipercliente(RemoteObject __ref,RemoteObject _id_cliente) throws Exception{
try {
		Debug.PushSubsStack("ScaricaPreferitiPerCliente (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("scaricapreferitipercliente")) { return __ref.runUserSub(false, "apiclient","scaricapreferitipercliente", __ref, _id_cliente);}
ResumableSub_ScaricaPreferitiPerCliente rsub = new ResumableSub_ScaricaPreferitiPerCliente(null,__ref,_id_cliente);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ScaricaPreferitiPerCliente extends BA.ResumableSub {
public ResumableSub_ScaricaPreferitiPerCliente(app.aegdistribuzione.apiclient parent,RemoteObject __ref,RemoteObject _id_cliente) {
this.parent = parent;
this.__ref = __ref;
this._id_cliente = _id_cliente;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.apiclient parent;
RemoteObject _id_cliente;
RemoteObject _m_preferiti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cod = RemoteObject.createImmutable("");
RemoteObject _desc = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _cid = RemoteObject.createImmutable("");
RemoteObject _occ = RemoteObject.createImmutable("");
RemoteObject _pr = RemoteObject.declareNull("app.aegdistribuzione.preferito");
RemoteObject group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ScaricaPreferitiPerCliente (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,286);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id_cliente", _id_cliente);
 BA.debugLineNum = 287;BA.debugLine="m_successo = False";
Debug.ShouldStop(1073741824);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 288;BA.debugLine="Dim m_preferiti As List";
Debug.ShouldStop(-2147483648);
_m_preferiti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_preferiti", _m_preferiti);
 BA.debugLineNum = 289;BA.debugLine="m_preferiti.Initialize";
Debug.ShouldStop(1);
_m_preferiti.runVoidMethod ("Initialize");
 BA.debugLineNum = 290;BA.debugLine="m_job.Download(m_url & \"/preferiti/\" & id_cliente";
Debug.ShouldStop(2);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/preferiti/"),_id_cliente)));
 BA.debugLineNum = 291;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 293;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 8;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 294;BA.debugLine="m_successo = True";
Debug.ShouldStop(32);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 295;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 296;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 297;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(256);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 298;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(512);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 300;BA.debugLine="For Each m As Map In objects";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//for
this.state = 7;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group12 = _objects;
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_m.setObject(group12.runMethod(false,"Get",index12));}
if (true) break;

case 11:
//C
this.state = 10;
index12++;
Debug.locals.put("m", _m);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 301;BA.debugLine="Dim cod As String = m.Get(\"cod_art\")";
Debug.ShouldStop(4096);
_cod = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cod_art")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 302;BA.debugLine="Dim desc As String = m.Get(\"desc_art\")";
Debug.ShouldStop(8192);
_desc = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("desc_art")))));Debug.locals.put("desc", _desc);Debug.locals.put("desc", _desc);
 BA.debugLineNum = 303;BA.debugLine="Dim id As Int = m.Get(\"id_art\")";
Debug.ShouldStop(16384);
_id = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_art")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 304;BA.debugLine="Dim cid As String = m.Get(\"id_cliente\")";
Debug.ShouldStop(32768);
_cid = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_cliente")))));Debug.locals.put("cid", _cid);Debug.locals.put("cid", _cid);
 BA.debugLineNum = 305;BA.debugLine="Dim occ As String = m.Get(\"occorrenze\")";
Debug.ShouldStop(65536);
_occ = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("occorrenze")))));Debug.locals.put("occ", _occ);Debug.locals.put("occ", _occ);
 BA.debugLineNum = 307;BA.debugLine="Dim pr As Preferito";
Debug.ShouldStop(262144);
_pr = RemoteObject.createNew ("app.aegdistribuzione.preferito");Debug.locals.put("pr", _pr);
 BA.debugLineNum = 308;BA.debugLine="pr.Initialize(id, cod, desc, cid, occ)";
Debug.ShouldStop(524288);
_pr.runClassMethod (app.aegdistribuzione.preferito.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_desc),(Object)(BA.numberCast(int.class, _cid)),(Object)(BA.numberCast(int.class, _occ)));
 BA.debugLineNum = 309;BA.debugLine="m_preferiti.Add(pr)";
Debug.ShouldStop(1048576);
_m_preferiti.runVoidMethod ("Add",(Object)((_pr)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("m", _m);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 313;BA.debugLine="Return m_preferiti";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_preferiti));return;};
 BA.debugLineNum = 314;BA.debugLine="End Sub";
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
public static RemoteObject  _storicoordini(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StoricoOrdini (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("storicoordini")) { return __ref.runUserSub(false, "apiclient","storicoordini", __ref);}
ResumableSub_StoricoOrdini rsub = new ResumableSub_StoricoOrdini(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StoricoOrdini extends BA.ResumableSub {
public ResumableSub_StoricoOrdini(app.aegdistribuzione.apiclient parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.apiclient parent;
RemoteObject _m_ordini = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dt_inv = RemoteObject.createImmutable("");
RemoteObject _oid = RemoteObject.createImmutable(0);
RemoteObject _cid = RemoteObject.createImmutable(0);
RemoteObject _uid = RemoteObject.createImmutable(0);
RemoteObject _nt = RemoteObject.createImmutable("");
RemoteObject _ordn = RemoteObject.declareNull("app.aegdistribuzione.ordine");
RemoteObject _righe = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _cod = RemoteObject.createImmutable("");
RemoteObject _desc = RemoteObject.createImmutable("");
RemoteObject _note = RemoteObject.createImmutable("");
RemoteObject _prezzo = RemoteObject.createImmutable(0f);
RemoteObject _qta = RemoteObject.createImmutable(0);
RemoteObject group12;
int index12;
int groupLen12;
RemoteObject group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StoricoOrdini (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,208);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 209;BA.debugLine="m_successo = False";
Debug.ShouldStop(65536);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 210;BA.debugLine="Dim m_ordini As List";
Debug.ShouldStop(131072);
_m_ordini = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_ordini", _m_ordini);
 BA.debugLineNum = 211;BA.debugLine="m_ordini.Initialize";
Debug.ShouldStop(262144);
_m_ordini.runVoidMethod ("Initialize");
 BA.debugLineNum = 212;BA.debugLine="m_job.Download(m_url & \"/storico_ordini\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/storico_ordini"))));
 BA.debugLineNum = 213;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
 BA.debugLineNum = 215;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 18;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 216;BA.debugLine="m_successo = True";
Debug.ShouldStop(8388608);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 217;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16777216);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 218;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(33554432);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 219;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(67108864);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 220;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(134217728);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 222;BA.debugLine="For Each m As Map In objects";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//for
this.state = 17;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group12 = _objects;
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 20;
if (true) break;

case 20:
//C
this.state = 17;
if (index12 < groupLen12) {
this.state = 6;
_m.setObject(group12.runMethod(false,"Get",index12));}
if (true) break;

case 21:
//C
this.state = 20;
index12++;
Debug.locals.put("m", _m);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 223;BA.debugLine="Dim dt_inv As String = m.Get(\"data_invio\")";
Debug.ShouldStop(1073741824);
_dt_inv = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_invio")))));Debug.locals.put("dt_inv", _dt_inv);Debug.locals.put("dt_inv", _dt_inv);
 BA.debugLineNum = 224;BA.debugLine="Dim oid As Int = m.Get(\"id\")";
Debug.ShouldStop(-2147483648);
_oid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("oid", _oid);Debug.locals.put("oid", _oid);
 BA.debugLineNum = 225;BA.debugLine="Dim cId As Int = m.Get(\"id_cliente\")";
Debug.ShouldStop(1);
_cid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_cliente")))));Debug.locals.put("cId", _cid);Debug.locals.put("cId", _cid);
 BA.debugLineNum = 226;BA.debugLine="Dim uId As Int = m.Get(\"id_utente\")";
Debug.ShouldStop(2);
_uid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_utente")))));Debug.locals.put("uId", _uid);Debug.locals.put("uId", _uid);
 BA.debugLineNum = 227;BA.debugLine="Dim nt As String = m.Get(\"note\")";
Debug.ShouldStop(4);
_nt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("note")))));Debug.locals.put("nt", _nt);Debug.locals.put("nt", _nt);
 BA.debugLineNum = 228;BA.debugLine="Dim ordn As Ordine";
Debug.ShouldStop(8);
_ordn = RemoteObject.createNew ("app.aegdistribuzione.ordine");Debug.locals.put("ordn", _ordn);
 BA.debugLineNum = 229;BA.debugLine="ordn.Initialize(oid,cId,uId,dt_inv,nt)";
Debug.ShouldStop(16);
_ordn.runClassMethod (app.aegdistribuzione.ordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_oid),(Object)(_cid),(Object)(_uid),(Object)(_dt_inv),(Object)(_nt));
 BA.debugLineNum = 231;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
Debug.ShouldStop(64);
_righe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_righe.setObject(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("righe")))));Debug.locals.put("righe", _righe);
 BA.debugLineNum = 232;BA.debugLine="For Each r As Map In righe";
Debug.ShouldStop(128);
if (true) break;

case 7:
//for
this.state = 16;
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _righe;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("r", _r);
this.state = 22;
if (true) break;

case 22:
//C
this.state = 16;
if (index21 < groupLen21) {
this.state = 9;
_r.setObject(group21.runMethod(false,"Get",index21));}
if (true) break;

case 23:
//C
this.state = 22;
index21++;
Debug.locals.put("r", _r);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 233;BA.debugLine="Try";
Debug.ShouldStop(256);
if (true) break;

case 10:
//try
this.state = 15;
this.catchState = 14;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 14;
 BA.debugLineNum = 234;BA.debugLine="Dim v As VoceOrdine";
Debug.ShouldStop(512);
_v = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("v", _v);
 BA.debugLineNum = 235;BA.debugLine="Dim id As Int = r.Get(\"id\")";
Debug.ShouldStop(1024);
_id = BA.numberCast(int.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 236;BA.debugLine="Dim oid As Int = ordn.Id";
Debug.ShouldStop(2048);
_oid = _ordn.getField(true,"_id");Debug.locals.put("oid", _oid);Debug.locals.put("oid", _oid);
 BA.debugLineNum = 237;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
Debug.ShouldStop(4096);
_cod = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cod_art")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 238;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
Debug.ShouldStop(8192);
_desc = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("desc_art")))));Debug.locals.put("desc", _desc);Debug.locals.put("desc", _desc);
 BA.debugLineNum = 239;BA.debugLine="Dim note As String = r.Get(\"note\")";
Debug.ShouldStop(16384);
_note = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("note")))));Debug.locals.put("note", _note);Debug.locals.put("note", _note);
 BA.debugLineNum = 240;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
Debug.ShouldStop(32768);
_prezzo = BA.numberCast(float.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prez_art")))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 241;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
Debug.ShouldStop(65536);
_qta = BA.numberCast(int.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qta")))));Debug.locals.put("qta", _qta);Debug.locals.put("qta", _qta);
 BA.debugLineNum = 242;BA.debugLine="v.Initialize(id, cod, desc, oid, note, prezzo";
Debug.ShouldStop(131072);
_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_desc),(Object)(_oid),(Object)(_note),(Object)(_prezzo),(Object)(_qta));
 BA.debugLineNum = 243;BA.debugLine="ordn.Voci.Add(v)";
Debug.ShouldStop(262144);
_ordn.getField(false,"_voci").runVoidMethod ("Add",(Object)((_v)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 245;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 23;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 16:
//C
this.state = 21;
Debug.locals.put("r", _r);
;
 BA.debugLineNum = 249;BA.debugLine="m_ordini.Add(ordn)";
Debug.ShouldStop(16777216);
_m_ordini.runVoidMethod ("Add",(Object)((_ordn)));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
Debug.locals.put("m", _m);
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 253;BA.debugLine="Return m_ordini";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_ordini));return;};
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _storicoordinipercliente(RemoteObject __ref,RemoteObject _id_cliente) throws Exception{
try {
		Debug.PushSubsStack("StoricoOrdiniPerCliente (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("storicoordinipercliente")) { return __ref.runUserSub(false, "apiclient","storicoordinipercliente", __ref, _id_cliente);}
ResumableSub_StoricoOrdiniPerCliente rsub = new ResumableSub_StoricoOrdiniPerCliente(null,__ref,_id_cliente);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StoricoOrdiniPerCliente extends BA.ResumableSub {
public ResumableSub_StoricoOrdiniPerCliente(app.aegdistribuzione.apiclient parent,RemoteObject __ref,RemoteObject _id_cliente) {
this.parent = parent;
this.__ref = __ref;
this._id_cliente = _id_cliente;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.apiclient parent;
RemoteObject _id_cliente;
RemoteObject _m_ordini = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objects = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dt_inv = RemoteObject.createImmutable("");
RemoteObject _oid = RemoteObject.createImmutable(0);
RemoteObject _cid = RemoteObject.createImmutable(0);
RemoteObject _uid = RemoteObject.createImmutable(0);
RemoteObject _nt = RemoteObject.createImmutable("");
RemoteObject _ordn = RemoteObject.declareNull("app.aegdistribuzione.ordine");
RemoteObject _righe = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _v = RemoteObject.declareNull("app.aegdistribuzione.voceordine");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _cod = RemoteObject.createImmutable("");
RemoteObject _desc = RemoteObject.createImmutable("");
RemoteObject _note = RemoteObject.createImmutable("");
RemoteObject _prezzo = RemoteObject.createImmutable(0f);
RemoteObject _qta = RemoteObject.createImmutable(0);
RemoteObject group12;
int index12;
int groupLen12;
RemoteObject group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StoricoOrdiniPerCliente (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,160);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id_cliente", _id_cliente);
 BA.debugLineNum = 161;BA.debugLine="m_successo = False";
Debug.ShouldStop(1);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 162;BA.debugLine="Dim m_ordini As List";
Debug.ShouldStop(2);
_m_ordini = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_ordini", _m_ordini);
 BA.debugLineNum = 163;BA.debugLine="m_ordini.Initialize";
Debug.ShouldStop(4);
_m_ordini.runVoidMethod ("Initialize");
 BA.debugLineNum = 164;BA.debugLine="m_job.Download(m_url & \"/storico_ordini/\" & id_cl";
Debug.ShouldStop(8);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/storico_ordini/"),_id_cliente)));
 BA.debugLineNum = 165;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
 BA.debugLineNum = 167;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 18;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 168;BA.debugLine="m_successo = True";
Debug.ShouldStop(128);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 169;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 170;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 171;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1024);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 172;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(2048);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 174;BA.debugLine="For Each m As Map In objects";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//for
this.state = 17;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group12 = _objects;
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 20;
if (true) break;

case 20:
//C
this.state = 17;
if (index12 < groupLen12) {
this.state = 6;
_m.setObject(group12.runMethod(false,"Get",index12));}
if (true) break;

case 21:
//C
this.state = 20;
index12++;
Debug.locals.put("m", _m);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 175;BA.debugLine="Dim dt_inv As String = m.Get(\"data_invio\")";
Debug.ShouldStop(16384);
_dt_inv = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_invio")))));Debug.locals.put("dt_inv", _dt_inv);Debug.locals.put("dt_inv", _dt_inv);
 BA.debugLineNum = 176;BA.debugLine="Dim oid As Int = m.Get(\"id\")";
Debug.ShouldStop(32768);
_oid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("oid", _oid);Debug.locals.put("oid", _oid);
 BA.debugLineNum = 177;BA.debugLine="Dim cId As Int = m.Get(\"id_cliente\")";
Debug.ShouldStop(65536);
_cid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_cliente")))));Debug.locals.put("cId", _cid);Debug.locals.put("cId", _cid);
 BA.debugLineNum = 178;BA.debugLine="Dim uId As Int = m.Get(\"id_utente\")";
Debug.ShouldStop(131072);
_uid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_utente")))));Debug.locals.put("uId", _uid);Debug.locals.put("uId", _uid);
 BA.debugLineNum = 179;BA.debugLine="Dim nt As String = m.Get(\"note\")";
Debug.ShouldStop(262144);
_nt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("note")))));Debug.locals.put("nt", _nt);Debug.locals.put("nt", _nt);
 BA.debugLineNum = 180;BA.debugLine="Dim ordn As Ordine";
Debug.ShouldStop(524288);
_ordn = RemoteObject.createNew ("app.aegdistribuzione.ordine");Debug.locals.put("ordn", _ordn);
 BA.debugLineNum = 181;BA.debugLine="ordn.Initialize(oid,cId,uId,dt_inv,nt)";
Debug.ShouldStop(1048576);
_ordn.runClassMethod (app.aegdistribuzione.ordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_oid),(Object)(_cid),(Object)(_uid),(Object)(_dt_inv),(Object)(_nt));
 BA.debugLineNum = 183;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
Debug.ShouldStop(4194304);
_righe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_righe.setObject(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("righe")))));Debug.locals.put("righe", _righe);
 BA.debugLineNum = 184;BA.debugLine="For Each r As Map In righe";
Debug.ShouldStop(8388608);
if (true) break;

case 7:
//for
this.state = 16;
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group21 = _righe;
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("r", _r);
this.state = 22;
if (true) break;

case 22:
//C
this.state = 16;
if (index21 < groupLen21) {
this.state = 9;
_r.setObject(group21.runMethod(false,"Get",index21));}
if (true) break;

case 23:
//C
this.state = 22;
index21++;
Debug.locals.put("r", _r);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 185;BA.debugLine="Try";
Debug.ShouldStop(16777216);
if (true) break;

case 10:
//try
this.state = 15;
this.catchState = 14;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 14;
 BA.debugLineNum = 186;BA.debugLine="Dim v As VoceOrdine";
Debug.ShouldStop(33554432);
_v = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("v", _v);
 BA.debugLineNum = 187;BA.debugLine="Dim id As Int = r.Get(\"id\")";
Debug.ShouldStop(67108864);
_id = BA.numberCast(int.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 188;BA.debugLine="Dim oid As Int = ordn.Id";
Debug.ShouldStop(134217728);
_oid = _ordn.getField(true,"_id");Debug.locals.put("oid", _oid);Debug.locals.put("oid", _oid);
 BA.debugLineNum = 189;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
Debug.ShouldStop(268435456);
_cod = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cod_art")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 190;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
Debug.ShouldStop(536870912);
_desc = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("desc_art")))));Debug.locals.put("desc", _desc);Debug.locals.put("desc", _desc);
 BA.debugLineNum = 191;BA.debugLine="Dim note As String = r.Get(\"note\")";
Debug.ShouldStop(1073741824);
_note = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("note")))));Debug.locals.put("note", _note);Debug.locals.put("note", _note);
 BA.debugLineNum = 192;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
Debug.ShouldStop(-2147483648);
_prezzo = BA.numberCast(float.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prez_art")))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 193;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
Debug.ShouldStop(1);
_qta = BA.numberCast(int.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qta")))));Debug.locals.put("qta", _qta);Debug.locals.put("qta", _qta);
 BA.debugLineNum = 194;BA.debugLine="v.Initialize(id, cod, desc, oid, note, prezzo";
Debug.ShouldStop(2);
_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_desc),(Object)(_oid),(Object)(_note),(Object)(_prezzo),(Object)(_qta));
 BA.debugLineNum = 195;BA.debugLine="ordn.Voci.Add(v)";
Debug.ShouldStop(4);
_ordn.getField(false,"_voci").runVoidMethod ("Add",(Object)((_v)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 197;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")))));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 23;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 16:
//C
this.state = 21;
Debug.locals.put("r", _r);
;
 BA.debugLineNum = 201;BA.debugLine="m_ordini.Add(ordn)";
Debug.ShouldStop(256);
_m_ordini.runVoidMethod ("Add",(Object)((_ordn)));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
Debug.locals.put("m", _m);
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 205;BA.debugLine="Return m_ordini";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_ordini));return;};
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
}