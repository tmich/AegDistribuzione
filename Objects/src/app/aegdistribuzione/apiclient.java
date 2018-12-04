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
public String _m_errore = "";
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public app.aegdistribuzione.main _main = null;
public app.aegdistribuzione.ordineactivity _ordineactivity = null;
public app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _invia(app.aegdistribuzione.apiclient __ref,app.aegdistribuzione.ordine _ord) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "invia"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "invia", new Object[] {_ord}));}
ResumableSub_Invia rsub = new ResumableSub_Invia(this,__ref,_ord);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Invia extends BA.ResumableSub {
public ResumableSub_Invia(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref,app.aegdistribuzione.ordine _ord) {
this.parent = parent;
this.__ref = __ref;
this._ord = _ord;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
app.aegdistribuzione.ordine _ord;
app.aegdistribuzione.ordine _ordn = null;
anywheresoftware.b4a.objects.collections.Map _form = null;

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
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim ordn As Ordine";
_ordn = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Dim form As Map";
_form = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="ordn.Initialize(0,0,0,\"\",\"\")";
_ordn._initialize(null,ba,(int) (0),(int) (0),(int) (0),"","");
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="form.Initialize";
_form.Initialize();
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="form.Put(\"id_cliente\", ord.IdCliente)";
_form.Put((Object)("id_cliente"),(Object)(_ord._idcliente));
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="form.Put(\"id_utente\", Starter.User.Id)";
_form.Put((Object)("id_utente"),(Object)(parent._starter._user._id));
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="form.Put(\"data\", ord.ToJson)";
_form.Put((Object)("data"),(Object)(_ord._tojson(null)));
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="m_job.PostMultipart(m_url & \"/ordine\", form, Null";
__ref._m_job._postmultipart(__ref._m_url+"/ordine",_form,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "invia"), (Object)(__ref._m_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="Try";
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
RDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="If m_job.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._m_job._success) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="ordn.FromJson(m_job.GetString)";
_ordn._fromjson(null,__ref._m_job._getstring());
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="Return ordn";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ordn));return;};
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=4259859;
 //BA.debugLineNum = 4259859;BA.debugLine="m_errore = m_job.ErrorMessage";
__ref._m_errore = __ref._m_job._errormessage;
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=4259862;
 //BA.debugLineNum = 4259862;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
RDebugUtils.currentLine=4259863;
 //BA.debugLineNum = 4259863;BA.debugLine="m_errore = \"Errore di connessione\"";
__ref._m_errore = "Errore di connessione";
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=4259866;
 //BA.debugLineNum = 4259866;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=4259867;
 //BA.debugLineNum = 4259867;BA.debugLine="End Sub";
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
public boolean  _getsuccesso(app.aegdistribuzione.apiclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "getsuccesso"))
	 {return ((Boolean) Debug.delegate(ba, "getsuccesso", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub getSuccesso As Boolean";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Return m_successo";
if (true) return __ref._m_successo;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _storicoordinipercliente(app.aegdistribuzione.apiclient __ref,int _id_cliente) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "storicoordinipercliente"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "storicoordinipercliente", new Object[] {_id_cliente}));}
ResumableSub_StoricoOrdiniPerCliente rsub = new ResumableSub_StoricoOrdiniPerCliente(this,__ref,_id_cliente);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_StoricoOrdiniPerCliente extends BA.ResumableSub {
public ResumableSub_StoricoOrdiniPerCliente(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref,int _id_cliente) {
this.parent = parent;
this.__ref = __ref;
this._id_cliente = _id_cliente;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
int _id_cliente;
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
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim m_ordini As List";
_m_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="m_ordini.Initialize";
_m_ordini.Initialize();
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="m_job.Download(m_url & \"/storico_ordini/\" & id_cl";
__ref._m_job._download(__ref._m_url+"/storico_ordini/"+BA.NumberToString(_id_cliente));
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "storicoordinipercliente"), (Object)(__ref._m_job));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="For Each m As Map In objects";
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
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="Dim dt_inv As String = m.Get(\"data_invio\")";
_dt_inv = BA.ObjectToString(_m.Get((Object)("data_invio")));
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="Dim oid As Int = m.Get(\"id\")";
_oid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=3997713;
 //BA.debugLineNum = 3997713;BA.debugLine="Dim cId As Int = m.Get(\"id_cliente\")";
_cid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_cliente"))));
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="Dim uId As Int = m.Get(\"id_utente\")";
_uid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_utente"))));
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="Dim nt As String = m.Get(\"note\")";
_nt = BA.ObjectToString(_m.Get((Object)("note")));
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="Dim ordn As Ordine";
_ordn = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="ordn.Initialize(oid,cId,uId,dt_inv,nt)";
_ordn._initialize(null,ba,_oid,_cid,_uid,_dt_inv,_nt);
RDebugUtils.currentLine=3997719;
 //BA.debugLineNum = 3997719;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
_righe = new anywheresoftware.b4a.objects.collections.List();
_righe.setObject((java.util.List)(_m.Get((Object)("righe"))));
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="For Each r As Map In righe";
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
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="Try";
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
RDebugUtils.currentLine=3997722;
 //BA.debugLineNum = 3997722;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="Dim id As Int = r.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_r.Get((Object)("id"))));
RDebugUtils.currentLine=3997724;
 //BA.debugLineNum = 3997724;BA.debugLine="Dim oid As Int = ordn.Id";
_oid = _ordn._id;
RDebugUtils.currentLine=3997725;
 //BA.debugLineNum = 3997725;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
_cod = BA.ObjectToString(_r.Get((Object)("cod_art")));
RDebugUtils.currentLine=3997726;
 //BA.debugLineNum = 3997726;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
_desc = BA.ObjectToString(_r.Get((Object)("desc_art")));
RDebugUtils.currentLine=3997727;
 //BA.debugLineNum = 3997727;BA.debugLine="Dim note As String = r.Get(\"note\")";
_note = BA.ObjectToString(_r.Get((Object)("note")));
RDebugUtils.currentLine=3997728;
 //BA.debugLineNum = 3997728;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
_prezzo = (float)(BA.ObjectToNumber(_r.Get((Object)("prez_art"))));
RDebugUtils.currentLine=3997729;
 //BA.debugLineNum = 3997729;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
_qta = (int)(BA.ObjectToNumber(_r.Get((Object)("qta"))));
RDebugUtils.currentLine=3997730;
 //BA.debugLineNum = 3997730;BA.debugLine="v.Initialize(id, cod, desc, oid, note, prezzo";
_v._initialize(null,ba,_id,_cod,_desc,_oid,_note,_prezzo,_qta);
RDebugUtils.currentLine=3997731;
 //BA.debugLineNum = 3997731;BA.debugLine="ordn.Voci.Add(v)";
_ordn._voci.Add((Object)(_v));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=3997733;
 //BA.debugLineNum = 3997733;BA.debugLine="Log(LastException)";
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
RDebugUtils.currentLine=3997737;
 //BA.debugLineNum = 3997737;BA.debugLine="m_ordini.Add(ordn)";
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
RDebugUtils.currentLine=3997741;
 //BA.debugLineNum = 3997741;BA.debugLine="Return m_ordini";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_ordini));return;};
RDebugUtils.currentLine=3997742;
 //BA.debugLineNum = 3997742;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _scaricapreferitipercliente(app.aegdistribuzione.apiclient __ref,int _id_cliente) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "scaricapreferitipercliente"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "scaricapreferitipercliente", new Object[] {_id_cliente}));}
ResumableSub_ScaricaPreferitiPerCliente rsub = new ResumableSub_ScaricaPreferitiPerCliente(this,__ref,_id_cliente);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ScaricaPreferitiPerCliente extends BA.ResumableSub {
public ResumableSub_ScaricaPreferitiPerCliente(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref,int _id_cliente) {
this.parent = parent;
this.__ref = __ref;
this._id_cliente = _id_cliente;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
int _id_cliente;
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
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim m_preferiti As List";
_m_preferiti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="m_preferiti.Initialize";
_m_preferiti.Initialize();
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="m_job.Download(m_url & \"/preferiti/\" & id_cliente";
__ref._m_job._download(__ref._m_url+"/preferiti/"+BA.NumberToString(_id_cliente));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricapreferitipercliente"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="For Each m As Map In objects";
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
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="Dim cod As String = m.Get(\"cod_art\")";
_cod = BA.ObjectToString(_m.Get((Object)("cod_art")));
RDebugUtils.currentLine=4194320;
 //BA.debugLineNum = 4194320;BA.debugLine="Dim desc As String = m.Get(\"desc_art\")";
_desc = BA.ObjectToString(_m.Get((Object)("desc_art")));
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="Dim id As Int = m.Get(\"id_art\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id_art"))));
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="Dim cid As String = m.Get(\"id_cliente\")";
_cid = BA.ObjectToString(_m.Get((Object)("id_cliente")));
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="Dim occ As String = m.Get(\"occorrenze\")";
_occ = BA.ObjectToString(_m.Get((Object)("occorrenze")));
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="Dim pr As Preferito";
_pr = new app.aegdistribuzione.preferito();
RDebugUtils.currentLine=4194326;
 //BA.debugLineNum = 4194326;BA.debugLine="pr.Initialize(id, cod, desc, cid, occ)";
_pr._initialize(null,ba,_id,_cod,_desc,(int)(Double.parseDouble(_cid)),(int)(Double.parseDouble(_occ)));
RDebugUtils.currentLine=4194327;
 //BA.debugLineNum = 4194327;BA.debugLine="m_preferiti.Add(pr)";
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
RDebugUtils.currentLine=4194331;
 //BA.debugLineNum = 4194331;BA.debugLine="Return m_preferiti";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_preferiti));return;};
RDebugUtils.currentLine=4194332;
 //BA.debugLineNum = 4194332;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _geterrore(app.aegdistribuzione.apiclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "geterrore"))
	 {return ((String) Debug.delegate(ba, "geterrore", null));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub getErrore As String";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Return m_errore";
if (true) return __ref._m_errore;
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.apiclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="apiclient";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim m_job As HttpJob";
_m_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Dim m_successo As Boolean";
_m_successo = false;
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim m_url As String";
_m_url = "";
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="Dim m_errore As String";
_m_errore = "";
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _creacliente(app.aegdistribuzione.apiclient __ref,app.aegdistribuzione.cliente _cli,int _fittizio) throws Exception{
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "creacliente"))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "creacliente", new Object[] {_cli,_fittizio}));}
ResumableSub_CreaCliente rsub = new ResumableSub_CreaCliente(this,__ref,_cli,_fittizio);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreaCliente extends BA.ResumableSub {
public ResumableSub_CreaCliente(app.aegdistribuzione.apiclient parent,app.aegdistribuzione.apiclient __ref,app.aegdistribuzione.cliente _cli,int _fittizio) {
this.parent = parent;
this.__ref = __ref;
this._cli = _cli;
this._fittizio = _fittizio;
this.__ref = parent;
}
app.aegdistribuzione.apiclient __ref;
app.aegdistribuzione.apiclient parent;
app.aegdistribuzione.cliente _cli;
int _fittizio;
anywheresoftware.b4a.objects.collections.Map _form = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _objects = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _cod = "";
String _denom = "";
int _id = 0;
String _indir = "";
String _piva = "";
String _dtum = "";
app.aegdistribuzione.cliente _c = null;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;

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
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Dim form As Map";
_form = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="form.Initialize";
_form.Initialize();
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="form.Put(\"codice\", cli.Codice)";
_form.Put((Object)("codice"),(Object)(_cli._codice));
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="form.Put(\"denominazione\", cli.Denominazione)";
_form.Put((Object)("denominazione"),(Object)(_cli._denominazione));
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="form.Put(\"indirizzo\", cli.Indirizzo)";
_form.Put((Object)("indirizzo"),(Object)(_cli._indirizzo));
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="form.Put(\"part_iva\", cli.PartitaIVA)";
_form.Put((Object)("part_iva"),(Object)(_cli._partitaiva));
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="form.Put(\"fittizio\", fittizio)";
_form.Put((Object)("fittizio"),(Object)(_fittizio));
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="m_job.PostMultipart(m_url & \"/clienti\", form, Nul";
__ref._m_job._postmultipart(__ref._m_url+"/clienti",_form,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "creacliente"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=13369356;
 //BA.debugLineNum = 13369356;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=13369357;
 //BA.debugLineNum = 13369357;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13369358;
 //BA.debugLineNum = 13369358;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=13369359;
 //BA.debugLineNum = 13369359;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=13369360;
 //BA.debugLineNum = 13369360;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=13369361;
 //BA.debugLineNum = 13369361;BA.debugLine="for	Each m As Map In objects";
if (true) break;

case 4:
//for
this.state = 7;
_m = new anywheresoftware.b4a.objects.collections.Map();
group16 = _objects;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if (index16 < groupLen16) {
this.state = 6;
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group16.Get(index16)));}
if (true) break;

case 11:
//C
this.state = 10;
index16++;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=13369362;
 //BA.debugLineNum = 13369362;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
_cod = BA.ObjectToString(_m.Get((Object)("codice")));
RDebugUtils.currentLine=13369363;
 //BA.debugLineNum = 13369363;BA.debugLine="Dim Denom As String = m.Get(\"denominazione\")";
_denom = BA.ObjectToString(_m.Get((Object)("denominazione")));
RDebugUtils.currentLine=13369364;
 //BA.debugLineNum = 13369364;BA.debugLine="Dim id As Int = m.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=13369365;
 //BA.debugLineNum = 13369365;BA.debugLine="Dim indir As String = m.Get(\"indirizzo\")";
_indir = BA.ObjectToString(_m.Get((Object)("indirizzo")));
RDebugUtils.currentLine=13369366;
 //BA.debugLineNum = 13369366;BA.debugLine="Dim piva As String = m.Get(\"part_iva\")";
_piva = BA.ObjectToString(_m.Get((Object)("part_iva")));
RDebugUtils.currentLine=13369367;
 //BA.debugLineNum = 13369367;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
_dtum = BA.ObjectToString(_m.Get((Object)("data_ultima_modifica")));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=13369369;
 //BA.debugLineNum = 13369369;BA.debugLine="Dim c As Cliente";
_c = new app.aegdistribuzione.cliente();
RDebugUtils.currentLine=13369370;
 //BA.debugLineNum = 13369370;BA.debugLine="c.Initialize(id,cod,Denom,indir,piva,dtum)";
_c._initialize(null,ba,_id,_cod,_denom,_indir,_piva,_dtum);
RDebugUtils.currentLine=13369371;
 //BA.debugLineNum = 13369371;BA.debugLine="Return c";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_c));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=13369373;
 //BA.debugLineNum = 13369373;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(app.aegdistribuzione.apiclient __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="m_job.Initialize(\"\", Me)";
__ref._m_job._initialize(ba,"",this);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="m_url = \"http://80.211.227.37:5002/api/v2\"";
__ref._m_url = "http://80.211.227.37:5002/api/v2";
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="End Sub";
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
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim user As Utente";
_user = new app.aegdistribuzione.utente();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Dim form As Map";
_form = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="form.Initialize";
_form.Initialize();
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="form.Put(\"username\", username)";
_form.Put((Object)("username"),(Object)(_username));
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="form.Put(\"password\", password)";
_form.Put((Object)("password"),(Object)(_password));
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="m_job.PostMultipart(m_url & \"/login\", form, Null)";
__ref._m_job._postmultipart(__ref._m_url+"/login",_form,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "login"), (Object)(__ref._m_job));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="Try";
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
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="If m_job.Success Then";
if (true) break;

case 4:
//if
this.state = 11;
if (__ref._m_job._success) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=4325398;
 //BA.debugLineNum = 4325398;BA.debugLine="Else If m_job.Response.StatusCode == 404 Then";
if (__ref._m_job._response.getStatusCode()==404) { 
this.state = 8;
}else {
this.state = 10;
}}
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4325390;
 //BA.debugLineNum = 4325390;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="Dim m As Map = objects.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_objects.Get((int) (0))));
RDebugUtils.currentLine=4325395;
 //BA.debugLineNum = 4325395;BA.debugLine="user.Initialize(m.Get(\"id\"), m.Get(\"username\"),";
_user._initialize(null,ba,(int)(BA.ObjectToNumber(_m.Get((Object)("id")))),BA.ObjectToString(_m.Get((Object)("username"))),BA.ObjectToString(_m.Get((Object)("ultimo_accesso"))));
RDebugUtils.currentLine=4325397;
 //BA.debugLineNum = 4325397;BA.debugLine="Return user";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_user));return;};
 if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=4325399;
 //BA.debugLineNum = 4325399;BA.debugLine="m_errore = \"Nome utente o password errata\"";
__ref._m_errore = "Nome utente o password errata";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=4325401;
 //BA.debugLineNum = 4325401;BA.debugLine="m_errore = m_job.ErrorMessage";
__ref._m_errore = __ref._m_job._errormessage;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=4325404;
 //BA.debugLineNum = 4325404;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
RDebugUtils.currentLine=4325405;
 //BA.debugLineNum = 4325405;BA.debugLine="m_errore = \"Errore di connessione\"";
__ref._m_errore = "Errore di connessione";
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=4325408;
 //BA.debugLineNum = 4325408;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=4325409;
 //BA.debugLineNum = 4325409;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim m_articoli As List";
_m_articoli = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="m_articoli.Initialize";
_m_articoli.Initialize();
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="m_job.Download(m_url & \"/articoli\")";
__ref._m_job._download(__ref._m_url+"/articoli");
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricaarticoli"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="For Each ob In objects";
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
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="Dim m As Map = ob";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ob));
RDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
_cod = BA.ObjectToString(_m.Get((Object)("codice")));
RDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
_dtum = BA.ObjectToString(_m.Get((Object)("data_ultima_modifica")));
RDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="Dim descr As String = m.Get(\"descrizione\")";
_descr = BA.ObjectToString(_m.Get((Object)("descrizione")));
RDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="Dim id As Int = m.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=3866644;
 //BA.debugLineNum = 3866644;BA.debugLine="Dim prz As Float = m.Get(\"prezzo\")";
_prz = (float)(BA.ObjectToNumber(_m.Get((Object)("prezzo"))));
RDebugUtils.currentLine=3866645;
 //BA.debugLineNum = 3866645;BA.debugLine="Dim a As Articolo";
_a = new app.aegdistribuzione.articolo();
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="a.Initialize(id,cod,descr,prz,dtum)";
_a._initialize(null,ba,_id,_cod,_descr,_prz,_dtum);
RDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="m_articoli.Add(a)";
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
RDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="Return m_articoli";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_articoli));return;};
RDebugUtils.currentLine=3866652;
 //BA.debugLineNum = 3866652;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim m_clienti As List";
_m_clienti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="m_clienti.Initialize";
_m_clienti.Initialize();
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="m_job.Download(m_url & \"/clienti\")";
__ref._m_job._download(__ref._m_url+"/clienti");
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricaclienti"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="For Each ob In objects";
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
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="Dim m As Map = ob";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ob));
RDebugUtils.currentLine=3932177;
 //BA.debugLineNum = 3932177;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
_cod = BA.ObjectToString(_m.Get((Object)("codice")));
RDebugUtils.currentLine=3932178;
 //BA.debugLineNum = 3932178;BA.debugLine="Dim denom As String = m.Get(\"denominazione\")";
_denom = BA.ObjectToString(_m.Get((Object)("denominazione")));
RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="Dim id As Int = m.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="Dim indir As String = m.Get(\"indirizzo\")";
_indir = BA.ObjectToString(_m.Get((Object)("indirizzo")));
RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="Dim piva As String = m.Get(\"part_iva\")";
_piva = BA.ObjectToString(_m.Get((Object)("part_iva")));
RDebugUtils.currentLine=3932182;
 //BA.debugLineNum = 3932182;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
_dtum = BA.ObjectToString(_m.Get((Object)("data_ultima_modifica")));
RDebugUtils.currentLine=3932183;
 //BA.debugLineNum = 3932183;BA.debugLine="Dim c As Cliente";
_c = new app.aegdistribuzione.cliente();
RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="c.Initialize(id,cod,denom,indir,piva,dtum)";
_c._initialize(null,ba,_id,_cod,_denom,_indir,_piva,_dtum);
RDebugUtils.currentLine=3932185;
 //BA.debugLineNum = 3932185;BA.debugLine="m_clienti.Add(c)";
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
RDebugUtils.currentLine=3932189;
 //BA.debugLineNum = 3932189;BA.debugLine="Return m_clienti";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_clienti));return;};
RDebugUtils.currentLine=3932190;
 //BA.debugLineNum = 3932190;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim m_preferiti As List";
_m_preferiti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="m_preferiti.Initialize";
_m_preferiti.Initialize();
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="m_job.Download(m_url & \"/preferiti\")";
__ref._m_job._download(__ref._m_url+"/preferiti");
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricapreferiti"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="For Each m As Map In objects";
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
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="Dim cod As String = m.Get(\"cod_art\")";
_cod = BA.ObjectToString(_m.Get((Object)("cod_art")));
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="Dim desc As String = m.Get(\"desc_art\")";
_desc = BA.ObjectToString(_m.Get((Object)("desc_art")));
RDebugUtils.currentLine=4128785;
 //BA.debugLineNum = 4128785;BA.debugLine="Dim id As Int = m.Get(\"id_art\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id_art"))));
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="Dim cid As String = m.Get(\"id_cliente\")";
_cid = BA.ObjectToString(_m.Get((Object)("id_cliente")));
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="Dim occ As String = m.Get(\"occorrenze\")";
_occ = BA.ObjectToString(_m.Get((Object)("occorrenze")));
RDebugUtils.currentLine=4128789;
 //BA.debugLineNum = 4128789;BA.debugLine="Dim pr As Preferito";
_pr = new app.aegdistribuzione.preferito();
RDebugUtils.currentLine=4128790;
 //BA.debugLineNum = 4128790;BA.debugLine="pr.Initialize(id, cod, desc, cid, occ)";
_pr._initialize(null,ba,_id,_cod,_desc,(int)(Double.parseDouble(_cid)),(int)(Double.parseDouble(_occ)));
RDebugUtils.currentLine=4128791;
 //BA.debugLineNum = 4128791;BA.debugLine="m_preferiti.Add(pr)";
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
RDebugUtils.currentLine=4128795;
 //BA.debugLineNum = 4128795;BA.debugLine="Return m_preferiti";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_preferiti));return;};
RDebugUtils.currentLine=4128796;
 //BA.debugLineNum = 4128796;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Dim m_ordini As List";
_m_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="m_ordini.Initialize";
_m_ordini.Initialize();
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="m_job.Download(m_url & \"/storico_ordini\")";
__ref._m_job._download(__ref._m_url+"/storico_ordini");
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "storicoordini"), (Object)(__ref._m_job));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="For Each m As Map In objects";
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
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="Dim dt_inv As String = m.Get(\"data_invio\")";
_dt_inv = BA.ObjectToString(_m.Get((Object)("data_invio")));
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Dim oid As Int = m.Get(\"id\")";
_oid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="Dim cId As Int = m.Get(\"id_cliente\")";
_cid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_cliente"))));
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="Dim uId As Int = m.Get(\"id_utente\")";
_uid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_utente"))));
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="Dim nt As String = m.Get(\"note\")";
_nt = BA.ObjectToString(_m.Get((Object)("note")));
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="Dim ordn As Ordine";
_ordn = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=4063253;
 //BA.debugLineNum = 4063253;BA.debugLine="ordn.Initialize(oid,cId,uId,dt_inv,nt)";
_ordn._initialize(null,ba,_oid,_cid,_uid,_dt_inv,_nt);
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
_righe = new anywheresoftware.b4a.objects.collections.List();
_righe.setObject((java.util.List)(_m.Get((Object)("righe"))));
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="For Each r As Map In righe";
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
RDebugUtils.currentLine=4063257;
 //BA.debugLineNum = 4063257;BA.debugLine="Try";
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
RDebugUtils.currentLine=4063258;
 //BA.debugLineNum = 4063258;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=4063259;
 //BA.debugLineNum = 4063259;BA.debugLine="Dim id As Int = r.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_r.Get((Object)("id"))));
RDebugUtils.currentLine=4063260;
 //BA.debugLineNum = 4063260;BA.debugLine="Dim oid As Int = ordn.Id";
_oid = _ordn._id;
RDebugUtils.currentLine=4063261;
 //BA.debugLineNum = 4063261;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
_cod = BA.ObjectToString(_r.Get((Object)("cod_art")));
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
_desc = BA.ObjectToString(_r.Get((Object)("desc_art")));
RDebugUtils.currentLine=4063263;
 //BA.debugLineNum = 4063263;BA.debugLine="Dim note As String = r.Get(\"note\")";
_note = BA.ObjectToString(_r.Get((Object)("note")));
RDebugUtils.currentLine=4063264;
 //BA.debugLineNum = 4063264;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
_prezzo = (float)(BA.ObjectToNumber(_r.Get((Object)("prez_art"))));
RDebugUtils.currentLine=4063265;
 //BA.debugLineNum = 4063265;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
_qta = (int)(BA.ObjectToNumber(_r.Get((Object)("qta"))));
RDebugUtils.currentLine=4063266;
 //BA.debugLineNum = 4063266;BA.debugLine="v.Initialize(id, cod, desc, oid, note, prezzo";
_v._initialize(null,ba,_id,_cod,_desc,_oid,_note,_prezzo,_qta);
RDebugUtils.currentLine=4063267;
 //BA.debugLineNum = 4063267;BA.debugLine="ordn.Voci.Add(v)";
_ordn._voci.Add((Object)(_v));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=4063269;
 //BA.debugLineNum = 4063269;BA.debugLine="Log(LastException)";
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
RDebugUtils.currentLine=4063273;
 //BA.debugLineNum = 4063273;BA.debugLine="m_ordini.Add(ordn)";
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
RDebugUtils.currentLine=4063277;
 //BA.debugLineNum = 4063277;BA.debugLine="Return m_ordini";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_ordini));return;};
RDebugUtils.currentLine=4063278;
 //BA.debugLineNum = 4063278;BA.debugLine="End Sub";
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