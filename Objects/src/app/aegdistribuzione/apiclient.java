package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class apiclient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.apiclient");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.apiclient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.samples.httputils2.httpjob _m_job = null;
public boolean _m_successo = false;
public String _m_url = "";
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public app.aegdistribuzione.main _main = null;
public app.aegdistribuzione.ordineactivity _ordineactivity = null;
public app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public String  _initialize(app.aegdistribuzione.apiclient __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="m_job.Initialize(\"\", Me)";
__ref._m_job._initialize(ba,"",this);
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="m_url = \"http://80.211.227.37:5002/api/v2\"";
__ref._m_url = "http://80.211.227.37:5002/api/v2";
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _login(app.aegdistribuzione.apiclient __ref,String _username,String _password) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "login"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "login", new Object[] {_username,_password}));}
ResumableSub_Login rsub = new ResumableSub_Login(this,__ref,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Login extends BA.ResumableSub {
public ResumableSub_Login(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref,String _username,String _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
String _username;
String _password;
app.aegdistribuzione.utente _user = null;
anywheresoftware.b4a.objects.collections.Map _form = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _objects = null;
anywheresoftware.b4a.objects.collections.Map _m = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="apiclient";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Dim user As Utente";
_user = new app.aegdistribuzione.utente();
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="Dim form As Map";
_form = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="form.Initialize";
_form.Initialize();
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="form.Put(\"username\", username)";
_form.Put((Object)("username"),(Object)(_username));
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="form.Put(\"password\", password)";
_form.Put((Object)("password"),(Object)(_password));
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="m_job.PostMultipart(m_url & \"/login\", form, Null)";
__ref._m_job._postmultipart(__ref._m_url+"/login",_form,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "login"), (Object)(__ref._m_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="If m_job.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._m_job._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="Dim m As Map = objects.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_objects.Get((int) (0))));
RDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="user.Initialize(m.Get(\"id\"), m.Get(\"username\"),";
_user._initialize(null,ba,(int)(BA.ObjectToNumber(_m.Get((Object)("id")))),BA.ObjectToString(_m.Get((Object)("username"))),BA.ObjectToString(_m.Get((Object)("ultimo_accesso"))));
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Return user";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_user));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=5177367;
 //BA.debugLineNum = 5177367;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _getsuccesso(app.aegdistribuzione.apiclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "getsuccesso"))
	 {return ((Boolean) Debug.delegate(ba, "getsuccesso", null));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub getSuccesso As Boolean";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return m_successo";
if (true) return __ref._m_successo;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(app.aegdistribuzione.apiclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="apiclient";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim m_job As HttpJob";
_m_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim m_successo As Boolean";
_m_successo = false;
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Dim m_url As String";
_m_url = "";
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _scaricaarticoli(app.aegdistribuzione.apiclient __ref) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "scaricaarticoli"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "scaricaarticoli", null));}
ResumableSub_ScaricaArticoli rsub = new ResumableSub_ScaricaArticoli(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ScaricaArticoli extends BA.ResumableSub {
public ResumableSub_ScaricaArticoli(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
anywheresoftware.b4a.objects.collections.List _m_articoli = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _objects = null;
Object _ob = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _cod = "";
String _dtum = "";
String _descr = "";
int _id = 0;
float _prz = 0f;
app.aegdistribuzione.articolo _a = null;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="apiclient";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim m_articoli As List";
_m_articoli = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="m_articoli.Initialize";
_m_articoli.Initialize();
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="m_job.Download(m_url & \"/articoli\")";
__ref._m_job._download(__ref._m_url+"/articoli");
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricaarticoli"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="If m_job.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (__ref._m_job._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="For Each ob In objects";
if (true) break;

case 4:
//for
this.state = 7;
group12 = _objects;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_ob = group12.Get(index12);}
if (true) break;

case 11:
//C
this.state = 10;
index12++;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="Dim m As Map = ob";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ob));
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
_cod = BA.ObjectToString(_m.Get((Object)("codice")));
RDebugUtils.currentLine=4915217;
 //BA.debugLineNum = 4915217;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
_dtum = BA.ObjectToString(_m.Get((Object)("data_ultima_modifica")));
RDebugUtils.currentLine=4915218;
 //BA.debugLineNum = 4915218;BA.debugLine="Dim descr As String = m.Get(\"descrizione\")";
_descr = BA.ObjectToString(_m.Get((Object)("descrizione")));
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="Dim id As Int = m.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=4915220;
 //BA.debugLineNum = 4915220;BA.debugLine="Dim prz As Float = m.Get(\"prezzo\")";
_prz = (float)(BA.ObjectToNumber(_m.Get((Object)("prezzo"))));
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="Dim a As Articolo";
_a = new app.aegdistribuzione.articolo();
RDebugUtils.currentLine=4915222;
 //BA.debugLineNum = 4915222;BA.debugLine="a.Initialize(id,cod,descr,prz,dtum)";
_a._initialize(null,ba,_id,_cod,_descr,_prz,_dtum);
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="m_articoli.Add(a)";
_m_articoli.Add((Object)(_a));
 if (true) break;
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
RDebugUtils.currentLine=4915227;
 //BA.debugLineNum = 4915227;BA.debugLine="Return m_articoli";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_articoli));return;};
RDebugUtils.currentLine=4915228;
 //BA.debugLineNum = 4915228;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _scaricaclienti(app.aegdistribuzione.apiclient __ref) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "scaricaclienti"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "scaricaclienti", null));}
ResumableSub_ScaricaClienti rsub = new ResumableSub_ScaricaClienti(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ScaricaClienti extends BA.ResumableSub {
public ResumableSub_ScaricaClienti(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
anywheresoftware.b4a.objects.collections.List _m_clienti = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _objects = null;
Object _ob = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _cod = "";
String _denom = "";
int _id = 0;
String _indir = "";
String _piva = "";
String _dtum = "";
app.aegdistribuzione.cliente _c = null;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="apiclient";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim m_clienti As List";
_m_clienti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="m_clienti.Initialize";
_m_clienti.Initialize();
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="m_job.Download(m_url & \"/clienti\")";
__ref._m_job._download(__ref._m_url+"/clienti");
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricaclienti"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="If m_job.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (__ref._m_job._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="For Each ob In objects";
if (true) break;

case 4:
//for
this.state = 7;
group12 = _objects;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_ob = group12.Get(index12);}
if (true) break;

case 11:
//C
this.state = 10;
index12++;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="Dim m As Map = ob";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ob));
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
_cod = BA.ObjectToString(_m.Get((Object)("codice")));
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="Dim denom As String = m.Get(\"denominazione\")";
_denom = BA.ObjectToString(_m.Get((Object)("denominazione")));
RDebugUtils.currentLine=4980755;
 //BA.debugLineNum = 4980755;BA.debugLine="Dim id As Int = m.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=4980756;
 //BA.debugLineNum = 4980756;BA.debugLine="Dim indir As String = m.Get(\"indirizzo\")";
_indir = BA.ObjectToString(_m.Get((Object)("indirizzo")));
RDebugUtils.currentLine=4980757;
 //BA.debugLineNum = 4980757;BA.debugLine="Dim piva As String = m.Get(\"part_iva\")";
_piva = BA.ObjectToString(_m.Get((Object)("part_iva")));
RDebugUtils.currentLine=4980758;
 //BA.debugLineNum = 4980758;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
_dtum = BA.ObjectToString(_m.Get((Object)("data_ultima_modifica")));
RDebugUtils.currentLine=4980759;
 //BA.debugLineNum = 4980759;BA.debugLine="Dim c As Cliente";
_c = new app.aegdistribuzione.cliente();
RDebugUtils.currentLine=4980760;
 //BA.debugLineNum = 4980760;BA.debugLine="c.Initialize(id,cod,denom,indir,piva,dtum)";
_c._initialize(null,ba,_id,_cod,_denom,_indir,_piva,_dtum);
RDebugUtils.currentLine=4980761;
 //BA.debugLineNum = 4980761;BA.debugLine="m_clienti.Add(c)";
_m_clienti.Add((Object)(_c));
 if (true) break;
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
RDebugUtils.currentLine=4980765;
 //BA.debugLineNum = 4980765;BA.debugLine="Return m_clienti";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_clienti));return;};
RDebugUtils.currentLine=4980766;
 //BA.debugLineNum = 4980766;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _scaricapreferiti(app.aegdistribuzione.apiclient __ref) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "scaricapreferiti"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "scaricapreferiti", null));}
ResumableSub_ScaricaPreferiti rsub = new ResumableSub_ScaricaPreferiti(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ScaricaPreferiti extends BA.ResumableSub {
public ResumableSub_ScaricaPreferiti(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
anywheresoftware.b4a.objects.collections.List _m_preferiti = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _objects = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _cod = "";
String _desc = "";
int _id = 0;
String _cid = "";
String _occ = "";
app.aegdistribuzione.preferito _pr = null;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="apiclient";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Dim m_preferiti As List";
_m_preferiti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="m_preferiti.Initialize";
_m_preferiti.Initialize();
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="m_job.Download(m_url & \"/preferiti\")";
__ref._m_job._download(__ref._m_url+"/preferiti");
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricapreferiti"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="If m_job.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (__ref._m_job._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="For Each m As Map In objects";
if (true) break;

case 4:
//for
this.state = 7;
_m = new anywheresoftware.b4a.objects.collections.Map();
group12 = _objects;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group12.Get(index12)));}
if (true) break;

case 11:
//C
this.state = 10;
index12++;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="Dim cod As String = m.Get(\"cod_art\")";
_cod = BA.ObjectToString(_m.Get((Object)("cod_art")));
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="Dim desc As String = m.Get(\"desc_art\")";
_desc = BA.ObjectToString(_m.Get((Object)("desc_art")));
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="Dim id As Int = m.Get(\"id_art\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id_art"))));
RDebugUtils.currentLine=5111826;
 //BA.debugLineNum = 5111826;BA.debugLine="Dim cid As String = m.Get(\"id_cliente\")";
_cid = BA.ObjectToString(_m.Get((Object)("id_cliente")));
RDebugUtils.currentLine=5111827;
 //BA.debugLineNum = 5111827;BA.debugLine="Dim occ As String = m.Get(\"occorrenze\")";
_occ = BA.ObjectToString(_m.Get((Object)("occorrenze")));
RDebugUtils.currentLine=5111829;
 //BA.debugLineNum = 5111829;BA.debugLine="Dim pr As Preferito";
_pr = new app.aegdistribuzione.preferito();
RDebugUtils.currentLine=5111830;
 //BA.debugLineNum = 5111830;BA.debugLine="pr.Initialize(id, cod, desc, cid, occ)";
_pr._initialize(null,ba,_id,_cod,_desc,(int)(Double.parseDouble(_cid)),(int)(Double.parseDouble(_occ)));
RDebugUtils.currentLine=5111831;
 //BA.debugLineNum = 5111831;BA.debugLine="m_preferiti.Add(pr)";
_m_preferiti.Add((Object)(_pr));
 if (true) break;
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
RDebugUtils.currentLine=5111835;
 //BA.debugLineNum = 5111835;BA.debugLine="Return m_preferiti";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_preferiti));return;};
RDebugUtils.currentLine=5111836;
 //BA.debugLineNum = 5111836;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _storicoordini(app.aegdistribuzione.apiclient __ref) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "storicoordini"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "storicoordini", null));}
ResumableSub_StoricoOrdini rsub = new ResumableSub_StoricoOrdini(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StoricoOrdini extends BA.ResumableSub {
public ResumableSub_StoricoOrdini(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
anywheresoftware.b4a.objects.collections.List _m_ordini = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _objects = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _dt_inv = "";
int _oid = 0;
int _cid = 0;
int _uid = 0;
String _nt = "";
app.aegdistribuzione.ordine _ordn = null;
anywheresoftware.b4a.objects.collections.List _righe = null;
anywheresoftware.b4a.objects.collections.Map _r = null;
app.aegdistribuzione.voceordine _v = null;
int _id = 0;
String _cod = "";
String _desc = "";
String _note = "";
float _prezzo = 0f;
int _qta = 0;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="apiclient";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Dim m_ordini As List";
_m_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="m_ordini.Initialize";
_m_ordini.Initialize();
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="m_job.Download(m_url & \"/storico_ordini\")";
__ref._m_job._download(__ref._m_url+"/storico_ordini");
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "storicoordini"), (Object)(__ref._m_job));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="If m_job.Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (__ref._m_job._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="For Each m As Map In objects";
if (true) break;

case 4:
//for
this.state = 17;
_m = new anywheresoftware.b4a.objects.collections.Map();
group12 = _objects;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 17;
if (index12 < groupLen12) {
this.state = 6;
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group12.Get(index12)));}
if (true) break;

case 21:
//C
this.state = 20;
index12++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="Dim dt_inv As String = m.Get(\"data_invio\")";
_dt_inv = BA.ObjectToString(_m.Get((Object)("data_invio")));
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="Dim oid As Int = m.Get(\"id\")";
_oid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="Dim cId As Int = m.Get(\"id_cliente\")";
_cid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_cliente"))));
RDebugUtils.currentLine=5046290;
 //BA.debugLineNum = 5046290;BA.debugLine="Dim uId As Int = m.Get(\"id_utente\")";
_uid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_utente"))));
RDebugUtils.currentLine=5046291;
 //BA.debugLineNum = 5046291;BA.debugLine="Dim nt As String = m.Get(\"note\")";
_nt = BA.ObjectToString(_m.Get((Object)("note")));
RDebugUtils.currentLine=5046292;
 //BA.debugLineNum = 5046292;BA.debugLine="Dim ordn As Ordine";
_ordn = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=5046293;
 //BA.debugLineNum = 5046293;BA.debugLine="ordn.Initialize(oid,cId,uId,dt_inv,nt)";
_ordn._initialize(null,ba,_oid,_cid,_uid,_dt_inv,_nt);
RDebugUtils.currentLine=5046295;
 //BA.debugLineNum = 5046295;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
_righe = new anywheresoftware.b4a.objects.collections.List();
_righe.setObject((java.util.List)(_m.Get((Object)("righe"))));
RDebugUtils.currentLine=5046296;
 //BA.debugLineNum = 5046296;BA.debugLine="For Each r As Map In righe";
if (true) break;

case 7:
//for
this.state = 16;
_r = new anywheresoftware.b4a.objects.collections.Map();
group21 = _righe;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 16;
if (index21 < groupLen21) {
this.state = 9;
_r.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group21.Get(index21)));}
if (true) break;

case 23:
//C
this.state = 22;
index21++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=5046297;
 //BA.debugLineNum = 5046297;BA.debugLine="Try";
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
RDebugUtils.currentLine=5046298;
 //BA.debugLineNum = 5046298;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=5046299;
 //BA.debugLineNum = 5046299;BA.debugLine="Dim id As Int = r.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_r.Get((Object)("id"))));
RDebugUtils.currentLine=5046300;
 //BA.debugLineNum = 5046300;BA.debugLine="Dim oid As Int = ordn.Id";
_oid = _ordn._id;
RDebugUtils.currentLine=5046301;
 //BA.debugLineNum = 5046301;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
_cod = BA.ObjectToString(_r.Get((Object)("cod_art")));
RDebugUtils.currentLine=5046302;
 //BA.debugLineNum = 5046302;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
_desc = BA.ObjectToString(_r.Get((Object)("desc_art")));
RDebugUtils.currentLine=5046303;
 //BA.debugLineNum = 5046303;BA.debugLine="Dim note As String = r.Get(\"note\")";
_note = BA.ObjectToString(_r.Get((Object)("note")));
RDebugUtils.currentLine=5046304;
 //BA.debugLineNum = 5046304;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
_prezzo = (float)(BA.ObjectToNumber(_r.Get((Object)("prez_art"))));
RDebugUtils.currentLine=5046305;
 //BA.debugLineNum = 5046305;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
_qta = (int)(BA.ObjectToNumber(_r.Get((Object)("qta"))));
RDebugUtils.currentLine=5046306;
 //BA.debugLineNum = 5046306;BA.debugLine="v.Initialize(id, cod, desc, oid, note, prezzo";
_v._initialize(null,ba,_id,_cod,_desc,_oid,_note,_prezzo,_qta);
RDebugUtils.currentLine=5046307;
 //BA.debugLineNum = 5046307;BA.debugLine="ordn.Voci.Add(v)";
_ordn._voci.Add((Object)(_v));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=5046309;
 //BA.debugLineNum = 5046309;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
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
;
RDebugUtils.currentLine=5046313;
 //BA.debugLineNum = 5046313;BA.debugLine="m_ordini.Add(ordn)";
_m_ordini.Add((Object)(_ordn));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=5046317;
 //BA.debugLineNum = 5046317;BA.debugLine="Return m_ordini";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_ordini));return;};
RDebugUtils.currentLine=5046318;
 //BA.debugLineNum = 5046318;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
}