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
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getsuccesso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSuccesso (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("getsuccesso")) { return __ref.runUserSub(false, "apiclient","getsuccesso", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Public Sub getSuccesso As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Return m_successo";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_m_successo");
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Initialize (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "apiclient","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="m_job.Initialize(\"\", Me)";
Debug.ShouldStop(256);
__ref.getField(false,"_m_job").runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 11;BA.debugLine="m_url = \"http://80.211.227.37:5002/api/v2\"";
Debug.ShouldStop(1024);
__ref.setField ("_m_url",BA.ObjectToString("http://80.211.227.37:5002/api/v2"));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _login(RemoteObject __ref,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("Login (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,233);
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
		Debug.PushSubsStack("Login (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,233);
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
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 234;BA.debugLine="m_successo = False";
Debug.ShouldStop(512);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 235;BA.debugLine="Dim user As Utente";
Debug.ShouldStop(1024);
_user = RemoteObject.createNew ("app.aegdistribuzione.utente");Debug.locals.put("user", _user);
 BA.debugLineNum = 236;BA.debugLine="Dim form As Map";
Debug.ShouldStop(2048);
_form = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("form", _form);
 BA.debugLineNum = 237;BA.debugLine="form.Initialize";
Debug.ShouldStop(4096);
_form.runVoidMethod ("Initialize");
 BA.debugLineNum = 238;BA.debugLine="form.Put(\"username\", username)";
Debug.ShouldStop(8192);
_form.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((_username)));
 BA.debugLineNum = 239;BA.debugLine="form.Put(\"password\", password)";
Debug.ShouldStop(16384);
_form.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("password"))),(Object)((_password)));
 BA.debugLineNum = 240;BA.debugLine="m_job.PostMultipart(m_url & \"/login\", form, Null)";
Debug.ShouldStop(32768);
__ref.getField(false,"_m_job").runVoidMethod ("_postmultipart",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/login"))),(Object)(_form),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 241;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 243;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(false,"_m_job").getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 244;BA.debugLine="m_successo = True";
Debug.ShouldStop(524288);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 245;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 246;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 247;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4194304);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 248;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(8388608);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 250;BA.debugLine="Dim m As Map = objects.Get(0)";
Debug.ShouldStop(33554432);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_objects.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);
 BA.debugLineNum = 251;BA.debugLine="user.Initialize(m.Get(\"id\"), m.Get(\"username\"),";
Debug.ShouldStop(67108864);
_user.runClassMethod (app.aegdistribuzione.utente.class, "_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))))),(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ultimo_accesso")))))));
 BA.debugLineNum = 253;BA.debugLine="Return user";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_user));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 256;BA.debugLine="Return Null";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static void  _jobdone(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _scaricaarticoli(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScaricaArticoli (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,93);
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
		Debug.PushSubsStack("ScaricaArticoli (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,93);
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
 BA.debugLineNum = 94;BA.debugLine="m_successo = False";
Debug.ShouldStop(536870912);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 95;BA.debugLine="Dim m_articoli As List";
Debug.ShouldStop(1073741824);
_m_articoli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_articoli", _m_articoli);
 BA.debugLineNum = 96;BA.debugLine="m_articoli.Initialize";
Debug.ShouldStop(-2147483648);
_m_articoli.runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="m_job.Download(m_url & \"/articoli\")";
Debug.ShouldStop(1);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/articoli"))));
 BA.debugLineNum = 98;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 100;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 101;BA.debugLine="m_successo = True";
Debug.ShouldStop(16);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 103;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 104;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(128);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 105;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(256);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 107;BA.debugLine="For Each ob In objects";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 108;BA.debugLine="Dim m As Map = ob";
Debug.ShouldStop(2048);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_ob);Debug.locals.put("m", _m);
 BA.debugLineNum = 109;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
Debug.ShouldStop(4096);
_cod = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codice")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 110;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
Debug.ShouldStop(8192);
_dtum = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_ultima_modifica")))));Debug.locals.put("dtum", _dtum);Debug.locals.put("dtum", _dtum);
 BA.debugLineNum = 111;BA.debugLine="Dim descr As String = m.Get(\"descrizione\")";
Debug.ShouldStop(16384);
_descr = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("descrizione")))));Debug.locals.put("descr", _descr);Debug.locals.put("descr", _descr);
 BA.debugLineNum = 112;BA.debugLine="Dim id As Int = m.Get(\"id\")";
Debug.ShouldStop(32768);
_id = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 113;BA.debugLine="Dim prz As Float = m.Get(\"prezzo\")";
Debug.ShouldStop(65536);
_prz = BA.numberCast(float.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prezzo")))));Debug.locals.put("prz", _prz);Debug.locals.put("prz", _prz);
 BA.debugLineNum = 114;BA.debugLine="Dim a As Articolo";
Debug.ShouldStop(131072);
_a = RemoteObject.createNew ("app.aegdistribuzione.articolo");Debug.locals.put("a", _a);
 BA.debugLineNum = 115;BA.debugLine="a.Initialize(id,cod,descr,prz,dtum)";
Debug.ShouldStop(262144);
_a.runClassMethod (app.aegdistribuzione.articolo.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_descr),(Object)(_prz),(Object)(_dtum));
 BA.debugLineNum = 116;BA.debugLine="m_articoli.Add(a)";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 120;BA.debugLine="Return m_articoli";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_articoli));return;};
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ScaricaClienti (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,123);
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
		Debug.PushSubsStack("ScaricaClienti (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,123);
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
 BA.debugLineNum = 124;BA.debugLine="m_successo = False";
Debug.ShouldStop(134217728);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 125;BA.debugLine="Dim m_clienti As List";
Debug.ShouldStop(268435456);
_m_clienti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_clienti", _m_clienti);
 BA.debugLineNum = 126;BA.debugLine="m_clienti.Initialize";
Debug.ShouldStop(536870912);
_m_clienti.runVoidMethod ("Initialize");
 BA.debugLineNum = 127;BA.debugLine="m_job.Download(m_url & \"/clienti\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/clienti"))));
 BA.debugLineNum = 128;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 130;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 131;BA.debugLine="m_successo = True";
Debug.ShouldStop(4);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 132;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 133;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(16);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 134;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 135;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(64);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 138;BA.debugLine="For Each ob In objects";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 139;BA.debugLine="Dim m As Map = ob";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_ob);Debug.locals.put("m", _m);
 BA.debugLineNum = 140;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
Debug.ShouldStop(2048);
_cod = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codice")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 141;BA.debugLine="Dim denom As String = m.Get(\"denominazione\")";
Debug.ShouldStop(4096);
_denom = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("denominazione")))));Debug.locals.put("denom", _denom);Debug.locals.put("denom", _denom);
 BA.debugLineNum = 142;BA.debugLine="Dim id As Int = m.Get(\"id\")";
Debug.ShouldStop(8192);
_id = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 143;BA.debugLine="Dim indir As String = m.Get(\"indirizzo\")";
Debug.ShouldStop(16384);
_indir = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("indirizzo")))));Debug.locals.put("indir", _indir);Debug.locals.put("indir", _indir);
 BA.debugLineNum = 144;BA.debugLine="Dim piva As String = m.Get(\"part_iva\")";
Debug.ShouldStop(32768);
_piva = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("part_iva")))));Debug.locals.put("piva", _piva);Debug.locals.put("piva", _piva);
 BA.debugLineNum = 145;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
Debug.ShouldStop(65536);
_dtum = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_ultima_modifica")))));Debug.locals.put("dtum", _dtum);Debug.locals.put("dtum", _dtum);
 BA.debugLineNum = 146;BA.debugLine="Dim c As Cliente";
Debug.ShouldStop(131072);
_c = RemoteObject.createNew ("app.aegdistribuzione.cliente");Debug.locals.put("c", _c);
 BA.debugLineNum = 147;BA.debugLine="c.Initialize(id,cod,denom,indir,piva,dtum)";
Debug.ShouldStop(262144);
_c.runClassMethod (app.aegdistribuzione.cliente.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_denom),(Object)(_indir),(Object)(_piva),(Object)(_dtum));
 BA.debugLineNum = 148;BA.debugLine="m_clienti.Add(c)";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 152;BA.debugLine="Return m_clienti";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_clienti));return;};
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ScaricaPreferiti (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,203);
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
		Debug.PushSubsStack("ScaricaPreferiti (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,203);
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
 BA.debugLineNum = 204;BA.debugLine="m_successo = False";
Debug.ShouldStop(2048);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 205;BA.debugLine="Dim m_preferiti As List";
Debug.ShouldStop(4096);
_m_preferiti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_preferiti", _m_preferiti);
 BA.debugLineNum = 206;BA.debugLine="m_preferiti.Initialize";
Debug.ShouldStop(8192);
_m_preferiti.runVoidMethod ("Initialize");
 BA.debugLineNum = 207;BA.debugLine="m_job.Download(m_url & \"/preferiti\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/preferiti"))));
 BA.debugLineNum = 208;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 210;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 211;BA.debugLine="m_successo = True";
Debug.ShouldStop(262144);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 212;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(524288);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 213;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(1048576);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 214;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2097152);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 215;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(4194304);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 217;BA.debugLine="For Each m As Map In objects";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 218;BA.debugLine="Dim cod As String = m.Get(\"cod_art\")";
Debug.ShouldStop(33554432);
_cod = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cod_art")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 219;BA.debugLine="Dim desc As String = m.Get(\"desc_art\")";
Debug.ShouldStop(67108864);
_desc = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("desc_art")))));Debug.locals.put("desc", _desc);Debug.locals.put("desc", _desc);
 BA.debugLineNum = 220;BA.debugLine="Dim id As Int = m.Get(\"id_art\")";
Debug.ShouldStop(134217728);
_id = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_art")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 221;BA.debugLine="Dim cid As String = m.Get(\"id_cliente\")";
Debug.ShouldStop(268435456);
_cid = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_cliente")))));Debug.locals.put("cid", _cid);Debug.locals.put("cid", _cid);
 BA.debugLineNum = 222;BA.debugLine="Dim occ As String = m.Get(\"occorrenze\")";
Debug.ShouldStop(536870912);
_occ = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("occorrenze")))));Debug.locals.put("occ", _occ);Debug.locals.put("occ", _occ);
 BA.debugLineNum = 224;BA.debugLine="Dim pr As Preferito";
Debug.ShouldStop(-2147483648);
_pr = RemoteObject.createNew ("app.aegdistribuzione.preferito");Debug.locals.put("pr", _pr);
 BA.debugLineNum = 225;BA.debugLine="pr.Initialize(id, cod, desc, cid, occ)";
Debug.ShouldStop(1);
_pr.runClassMethod (app.aegdistribuzione.preferito.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_desc),(Object)(BA.numberCast(int.class, _cid)),(Object)(BA.numberCast(int.class, _occ)));
 BA.debugLineNum = 226;BA.debugLine="m_preferiti.Add(pr)";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 230;BA.debugLine="Return m_preferiti";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_preferiti));return;};
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("StoricoOrdini (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,155);
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
		Debug.PushSubsStack("StoricoOrdini (apiclient) ","apiclient",6,__ref.getField(false, "ba"),__ref,155);
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
 BA.debugLineNum = 156;BA.debugLine="m_successo = False";
Debug.ShouldStop(134217728);
__ref.setField ("_m_successo",parent.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="Dim m_ordini As List";
Debug.ShouldStop(268435456);
_m_ordini = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("m_ordini", _m_ordini);
 BA.debugLineNum = 158;BA.debugLine="m_ordini.Initialize";
Debug.ShouldStop(536870912);
_m_ordini.runVoidMethod ("Initialize");
 BA.debugLineNum = 159;BA.debugLine="m_job.Download(m_url & \"/storico_ordini\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_m_job").runVoidMethod ("_download",(Object)(RemoteObject.concat(__ref.getField(true,"_m_url"),RemoteObject.createImmutable("/storico_ordini"))));
 BA.debugLineNum = 160;BA.debugLine="Wait For (m_job) JobDone";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_m_job")));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
 BA.debugLineNum = 162;BA.debugLine="If m_job.Success Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 163;BA.debugLine="m_successo = True";
Debug.ShouldStop(4);
__ref.setField ("_m_successo",parent.__c.getField(true,"True"));
 BA.debugLineNum = 164;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 165;BA.debugLine="parser.Initialize(m_job.GetString)";
Debug.ShouldStop(16);
_parser.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_m_job").runMethod(true,"_getstring")));
 BA.debugLineNum = 166;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 167;BA.debugLine="Dim objects As List = root.Get(\"data\")";
Debug.ShouldStop(64);
_objects = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_objects.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("objects", _objects);
 BA.debugLineNum = 169;BA.debugLine="For Each m As Map In objects";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 170;BA.debugLine="Dim dt_inv As String = m.Get(\"data_invio\")";
Debug.ShouldStop(512);
_dt_inv = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_invio")))));Debug.locals.put("dt_inv", _dt_inv);Debug.locals.put("dt_inv", _dt_inv);
 BA.debugLineNum = 171;BA.debugLine="Dim oid As Int = m.Get(\"id\")";
Debug.ShouldStop(1024);
_oid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("oid", _oid);Debug.locals.put("oid", _oid);
 BA.debugLineNum = 172;BA.debugLine="Dim cId As Int = m.Get(\"id_cliente\")";
Debug.ShouldStop(2048);
_cid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_cliente")))));Debug.locals.put("cId", _cid);Debug.locals.put("cId", _cid);
 BA.debugLineNum = 173;BA.debugLine="Dim uId As Int = m.Get(\"id_utente\")";
Debug.ShouldStop(4096);
_uid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_utente")))));Debug.locals.put("uId", _uid);Debug.locals.put("uId", _uid);
 BA.debugLineNum = 174;BA.debugLine="Dim nt As String = m.Get(\"note\")";
Debug.ShouldStop(8192);
_nt = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("note")))));Debug.locals.put("nt", _nt);Debug.locals.put("nt", _nt);
 BA.debugLineNum = 175;BA.debugLine="Dim ordn As Ordine";
Debug.ShouldStop(16384);
_ordn = RemoteObject.createNew ("app.aegdistribuzione.ordine");Debug.locals.put("ordn", _ordn);
 BA.debugLineNum = 176;BA.debugLine="ordn.Initialize(oid,cId,uId,dt_inv,nt)";
Debug.ShouldStop(32768);
_ordn.runClassMethod (app.aegdistribuzione.ordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_oid),(Object)(_cid),(Object)(_uid),(Object)(_dt_inv),(Object)(_nt));
 BA.debugLineNum = 178;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
Debug.ShouldStop(131072);
_righe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_righe.setObject(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("righe")))));Debug.locals.put("righe", _righe);
 BA.debugLineNum = 179;BA.debugLine="For Each r As Map In righe";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 180;BA.debugLine="Try";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 181;BA.debugLine="Dim v As VoceOrdine";
Debug.ShouldStop(1048576);
_v = RemoteObject.createNew ("app.aegdistribuzione.voceordine");Debug.locals.put("v", _v);
 BA.debugLineNum = 182;BA.debugLine="Dim id As Int = r.Get(\"id\")";
Debug.ShouldStop(2097152);
_id = BA.numberCast(int.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 183;BA.debugLine="Dim oid As Int = ordn.Id";
Debug.ShouldStop(4194304);
_oid = _ordn.getField(true,"_id");Debug.locals.put("oid", _oid);Debug.locals.put("oid", _oid);
 BA.debugLineNum = 184;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
Debug.ShouldStop(8388608);
_cod = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cod_art")))));Debug.locals.put("cod", _cod);Debug.locals.put("cod", _cod);
 BA.debugLineNum = 185;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
Debug.ShouldStop(16777216);
_desc = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("desc_art")))));Debug.locals.put("desc", _desc);Debug.locals.put("desc", _desc);
 BA.debugLineNum = 186;BA.debugLine="Dim note As String = r.Get(\"note\")";
Debug.ShouldStop(33554432);
_note = BA.ObjectToString(_r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("note")))));Debug.locals.put("note", _note);Debug.locals.put("note", _note);
 BA.debugLineNum = 187;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
Debug.ShouldStop(67108864);
_prezzo = BA.numberCast(float.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("prez_art")))));Debug.locals.put("prezzo", _prezzo);Debug.locals.put("prezzo", _prezzo);
 BA.debugLineNum = 188;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
Debug.ShouldStop(134217728);
_qta = BA.numberCast(int.class, _r.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qta")))));Debug.locals.put("qta", _qta);Debug.locals.put("qta", _qta);
 BA.debugLineNum = 189;BA.debugLine="v.Initialize(id, cod, desc, oid, note, prezzo";
Debug.ShouldStop(268435456);
_v.runClassMethod (app.aegdistribuzione.voceordine.class, "_initialize",__ref.getField(false, "ba"),(Object)(_id),(Object)(_cod),(Object)(_desc),(Object)(_oid),(Object)(_note),(Object)(_prezzo),(Object)(_qta));
 BA.debugLineNum = 190;BA.debugLine="ordn.Voci.Add(v)";
Debug.ShouldStop(536870912);
_ordn.getField(false,"_voci").runVoidMethod ("Add",(Object)((_v)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 192;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 196;BA.debugLine="m_ordini.Add(ordn)";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 200;BA.debugLine="Return m_ordini";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m_ordini));return;};
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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