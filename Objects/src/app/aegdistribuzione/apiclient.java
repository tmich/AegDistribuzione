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
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
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
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Dim ordn As Ordine";
_ordn = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Dim form As Map";
_form = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="ordn.Initialize(0,0,0,\"\",\"\")";
_ordn._initialize(null,ba,(int) (0),(int) (0),(int) (0),"","");
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="form.Initialize";
_form.Initialize();
RDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="form.Put(\"id_cliente\", ord.IdCliente)";
_form.Put((Object)("id_cliente"),(Object)(_ord._idcliente));
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="form.Put(\"id_utente\", Starter.User.Id)";
_form.Put((Object)("id_utente"),(Object)(parent._starter._user._id));
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="form.Put(\"data\", ord.ToJson)";
_form.Put((Object)("data"),(Object)(_ord._tojson(null)));
RDebugUtils.currentLine=12779530;
 //BA.debugLineNum = 12779530;BA.debugLine="m_job.PostMultipart(m_url & \"/ordine\", form, Null";
__ref._m_job._postmultipart(__ref._m_url+"/ordine",_form,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "invia"), (Object)(__ref._m_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=12779533;
 //BA.debugLineNum = 12779533;BA.debugLine="Try";
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
RDebugUtils.currentLine=12779534;
 //BA.debugLineNum = 12779534;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=12779535;
 //BA.debugLineNum = 12779535;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=12779536;
 //BA.debugLineNum = 12779536;BA.debugLine="ordn.FromJson(m_job.GetString)";
_ordn._fromjson(null,__ref._m_job._getstring());
RDebugUtils.currentLine=12779537;
 //BA.debugLineNum = 12779537;BA.debugLine="Return ordn";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ordn));return;};
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=12779539;
 //BA.debugLineNum = 12779539;BA.debugLine="m_errore = m_job.ErrorMessage";
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
RDebugUtils.currentLine=12779542;
 //BA.debugLineNum = 12779542;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
RDebugUtils.currentLine=12779543;
 //BA.debugLineNum = 12779543;BA.debugLine="m_errore = \"Errore di connessione\"";
__ref._m_errore = "Errore di connessione";
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12779546;
 //BA.debugLineNum = 12779546;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=12779547;
 //BA.debugLineNum = 12779547;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub getSuccesso As Boolean";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Return m_successo";
if (true) return __ref._m_successo;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Dim m_ordini As List";
_m_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="m_ordini.Initialize";
_m_ordini.Initialize();
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="m_job.Download(m_url & \"/storico_ordini/\" & id_cl";
__ref._m_job._download(__ref._m_url+"/storico_ordini/"+BA.NumberToString(_id_cliente));
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "storicoordinipercliente"), (Object)(__ref._m_job));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=17563660;
 //BA.debugLineNum = 17563660;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="For Each m As Map In objects";
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
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="Dim dt_inv As String = m.Get(\"data_invio\")";
_dt_inv = BA.ObjectToString(_m.Get((Object)("data_invio")));
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="Dim oid As Int = m.Get(\"id\")";
_oid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="Dim cId As Int = m.Get(\"id_cliente\")";
_cid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_cliente"))));
RDebugUtils.currentLine=17563666;
 //BA.debugLineNum = 17563666;BA.debugLine="Dim uId As Int = m.Get(\"id_utente\")";
_uid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_utente"))));
RDebugUtils.currentLine=17563667;
 //BA.debugLineNum = 17563667;BA.debugLine="Dim nt As String = m.Get(\"note\")";
_nt = BA.ObjectToString(_m.Get((Object)("note")));
RDebugUtils.currentLine=17563668;
 //BA.debugLineNum = 17563668;BA.debugLine="Dim ordn As Ordine";
_ordn = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=17563669;
 //BA.debugLineNum = 17563669;BA.debugLine="ordn.Initialize(oid,cId,uId,dt_inv,nt)";
_ordn._initialize(null,ba,_oid,_cid,_uid,_dt_inv,_nt);
RDebugUtils.currentLine=17563671;
 //BA.debugLineNum = 17563671;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
_righe = new anywheresoftware.b4a.objects.collections.List();
_righe.setObject((java.util.List)(_m.Get((Object)("righe"))));
RDebugUtils.currentLine=17563672;
 //BA.debugLineNum = 17563672;BA.debugLine="For Each r As Map In righe";
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
RDebugUtils.currentLine=17563673;
 //BA.debugLineNum = 17563673;BA.debugLine="Try";
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
RDebugUtils.currentLine=17563674;
 //BA.debugLineNum = 17563674;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=17563675;
 //BA.debugLineNum = 17563675;BA.debugLine="Dim id As Int = r.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_r.Get((Object)("id"))));
RDebugUtils.currentLine=17563676;
 //BA.debugLineNum = 17563676;BA.debugLine="Dim oid As Int = ordn.Id";
_oid = _ordn._id;
RDebugUtils.currentLine=17563677;
 //BA.debugLineNum = 17563677;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
_cod = BA.ObjectToString(_r.Get((Object)("cod_art")));
RDebugUtils.currentLine=17563678;
 //BA.debugLineNum = 17563678;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
_desc = BA.ObjectToString(_r.Get((Object)("desc_art")));
RDebugUtils.currentLine=17563679;
 //BA.debugLineNum = 17563679;BA.debugLine="Dim note As String = r.Get(\"note\")";
_note = BA.ObjectToString(_r.Get((Object)("note")));
RDebugUtils.currentLine=17563680;
 //BA.debugLineNum = 17563680;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
_prezzo = (float)(BA.ObjectToNumber(_r.Get((Object)("prez_art"))));
RDebugUtils.currentLine=17563681;
 //BA.debugLineNum = 17563681;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
_qta = (int)(BA.ObjectToNumber(_r.Get((Object)("qta"))));
RDebugUtils.currentLine=17563682;
 //BA.debugLineNum = 17563682;BA.debugLine="v.Initialize(id, cod, desc, oid, note, prezzo";
_v._initialize(null,ba,_id,_cod,_desc,_oid,_note,_prezzo,_qta);
RDebugUtils.currentLine=17563683;
 //BA.debugLineNum = 17563683;BA.debugLine="ordn.Voci.Add(v)";
_ordn._voci.Add((Object)(_v));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=17563685;
 //BA.debugLineNum = 17563685;BA.debugLine="Log(LastException)";
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
RDebugUtils.currentLine=17563689;
 //BA.debugLineNum = 17563689;BA.debugLine="m_ordini.Add(ordn)";
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
RDebugUtils.currentLine=17563693;
 //BA.debugLineNum = 17563693;BA.debugLine="Return m_ordini";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_ordini));return;};
RDebugUtils.currentLine=17563694;
 //BA.debugLineNum = 17563694;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="Dim m_preferiti As List";
_m_preferiti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="m_preferiti.Initialize";
_m_preferiti.Initialize();
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="m_job.Download(m_url & \"/preferiti/\" & id_cliente";
__ref._m_job._download(__ref._m_url+"/preferiti/"+BA.NumberToString(_id_cliente));
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricapreferitipercliente"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=20185096;
 //BA.debugLineNum = 20185096;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=20185097;
 //BA.debugLineNum = 20185097;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=20185098;
 //BA.debugLineNum = 20185098;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=20185099;
 //BA.debugLineNum = 20185099;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=20185100;
 //BA.debugLineNum = 20185100;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=20185102;
 //BA.debugLineNum = 20185102;BA.debugLine="For Each m As Map In objects";
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
RDebugUtils.currentLine=20185103;
 //BA.debugLineNum = 20185103;BA.debugLine="Dim cod As String = m.Get(\"cod_art\")";
_cod = BA.ObjectToString(_m.Get((Object)("cod_art")));
RDebugUtils.currentLine=20185104;
 //BA.debugLineNum = 20185104;BA.debugLine="Dim desc As String = m.Get(\"desc_art\")";
_desc = BA.ObjectToString(_m.Get((Object)("desc_art")));
RDebugUtils.currentLine=20185105;
 //BA.debugLineNum = 20185105;BA.debugLine="Dim id As Int = m.Get(\"id_art\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id_art"))));
RDebugUtils.currentLine=20185106;
 //BA.debugLineNum = 20185106;BA.debugLine="Dim cid As String = m.Get(\"id_cliente\")";
_cid = BA.ObjectToString(_m.Get((Object)("id_cliente")));
RDebugUtils.currentLine=20185107;
 //BA.debugLineNum = 20185107;BA.debugLine="Dim occ As String = m.Get(\"occorrenze\")";
_occ = BA.ObjectToString(_m.Get((Object)("occorrenze")));
RDebugUtils.currentLine=20185109;
 //BA.debugLineNum = 20185109;BA.debugLine="Dim pr As Preferito";
_pr = new app.aegdistribuzione.preferito();
RDebugUtils.currentLine=20185110;
 //BA.debugLineNum = 20185110;BA.debugLine="pr.Initialize(id, cod, desc, cid, occ)";
_pr._initialize(null,ba,_id,_cod,_desc,(int)(Double.parseDouble(_cid)),(int)(Double.parseDouble(_occ)));
RDebugUtils.currentLine=20185111;
 //BA.debugLineNum = 20185111;BA.debugLine="m_preferiti.Add(pr)";
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
RDebugUtils.currentLine=20185115;
 //BA.debugLineNum = 20185115;BA.debugLine="Return m_preferiti";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_preferiti));return;};
RDebugUtils.currentLine=20185116;
 //BA.debugLineNum = 20185116;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub getErrore As String";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Return m_errore";
if (true) return __ref._m_errore;
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="End Sub";
return "";
}
public String  _initialize(app.aegdistribuzione.apiclient __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="apiclient";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="m_job.Initialize(\"\", Me)";
__ref._m_job._initialize(ba,"",this);
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="m_url = \"http://80.211.227.37:5002/api/v2\"";
__ref._m_url = "http://80.211.227.37:5002/api/v2";
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim user As Utente";
_user = new app.aegdistribuzione.utente();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Dim form As Map";
_form = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="form.Initialize";
_form.Initialize();
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="form.Put(\"username\", username)";
_form.Put((Object)("username"),(Object)(_username));
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="form.Put(\"password\", password)";
_form.Put((Object)("password"),(Object)(_password));
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="m_job.PostMultipart(m_url & \"/login\", form, Null)";
__ref._m_job._postmultipart(__ref._m_url+"/login",_form,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "login"), (Object)(__ref._m_job));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="Try";
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
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="If m_job.Success Then";
if (true) break;

case 4:
//if
this.state = 11;
if (__ref._m_job._success) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="Else If m_job.Response.StatusCode == 404 Then";
if (__ref._m_job._response.getStatusCode()==404) { 
this.state = 8;
}else {
this.state = 10;
}}
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="Dim m As Map = objects.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_objects.Get((int) (0))));
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="user.Initialize(m.Get(\"id\"), m.Get(\"username\"),";
_user._initialize(null,ba,(int)(BA.ObjectToNumber(_m.Get((Object)("id")))),BA.ObjectToString(_m.Get((Object)("username"))),BA.ObjectToString(_m.Get((Object)("ultimo_accesso"))));
RDebugUtils.currentLine=5505045;
 //BA.debugLineNum = 5505045;BA.debugLine="Return user";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_user));return;};
 if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="m_errore = \"Nome utente o password errata\"";
__ref._m_errore = "Nome utente o password errata";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=5505049;
 //BA.debugLineNum = 5505049;BA.debugLine="m_errore = m_job.ErrorMessage";
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
RDebugUtils.currentLine=5505052;
 //BA.debugLineNum = 5505052;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
RDebugUtils.currentLine=5505053;
 //BA.debugLineNum = 5505053;BA.debugLine="m_errore = \"Errore di connessione\"";
__ref._m_errore = "Errore di connessione";
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=5505056;
 //BA.debugLineNum = 5505056;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=5505057;
 //BA.debugLineNum = 5505057;BA.debugLine="End Sub";
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
public String  _class_globals(app.aegdistribuzione.apiclient __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="apiclient";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim m_job As HttpJob";
_m_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Dim m_successo As Boolean";
_m_successo = false;
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Dim m_url As String";
_m_url = "";
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Dim m_errore As String";
_m_errore = "";
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim m_articoli As List";
_m_articoli = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="m_articoli.Initialize";
_m_articoli.Initialize();
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="m_job.Download(m_url & \"/articoli\")";
__ref._m_job._download(__ref._m_url+"/articoli");
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricaarticoli"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="For Each ob In objects";
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
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="Dim m As Map = ob";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ob));
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
_cod = BA.ObjectToString(_m.Get((Object)("codice")));
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
_dtum = BA.ObjectToString(_m.Get((Object)("data_ultima_modifica")));
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="Dim descr As String = m.Get(\"descrizione\")";
_descr = BA.ObjectToString(_m.Get((Object)("descrizione")));
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="Dim id As Int = m.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="Dim prz As Float = m.Get(\"prezzo\")";
_prz = (float)(BA.ObjectToNumber(_m.Get((Object)("prezzo"))));
RDebugUtils.currentLine=5242901;
 //BA.debugLineNum = 5242901;BA.debugLine="Dim a As Articolo";
_a = new app.aegdistribuzione.articolo();
RDebugUtils.currentLine=5242902;
 //BA.debugLineNum = 5242902;BA.debugLine="a.Initialize(id,cod,descr,prz,dtum)";
_a._initialize(null,ba,_id,_cod,_descr,_prz,_dtum);
RDebugUtils.currentLine=5242903;
 //BA.debugLineNum = 5242903;BA.debugLine="m_articoli.Add(a)";
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
RDebugUtils.currentLine=5242907;
 //BA.debugLineNum = 5242907;BA.debugLine="Return m_articoli";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_articoli));return;};
RDebugUtils.currentLine=5242908;
 //BA.debugLineNum = 5242908;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Dim m_clienti As List";
_m_clienti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="m_clienti.Initialize";
_m_clienti.Initialize();
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="m_job.Download(m_url & \"/clienti\")";
__ref._m_job._download(__ref._m_url+"/clienti");
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricaclienti"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=5308431;
 //BA.debugLineNum = 5308431;BA.debugLine="For Each ob In objects";
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
RDebugUtils.currentLine=5308432;
 //BA.debugLineNum = 5308432;BA.debugLine="Dim m As Map = ob";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ob));
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="Dim cod As String = m.Get(\"codice\")";
_cod = BA.ObjectToString(_m.Get((Object)("codice")));
RDebugUtils.currentLine=5308434;
 //BA.debugLineNum = 5308434;BA.debugLine="Dim denom As String = m.Get(\"denominazione\")";
_denom = BA.ObjectToString(_m.Get((Object)("denominazione")));
RDebugUtils.currentLine=5308435;
 //BA.debugLineNum = 5308435;BA.debugLine="Dim id As Int = m.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=5308436;
 //BA.debugLineNum = 5308436;BA.debugLine="Dim indir As String = m.Get(\"indirizzo\")";
_indir = BA.ObjectToString(_m.Get((Object)("indirizzo")));
RDebugUtils.currentLine=5308437;
 //BA.debugLineNum = 5308437;BA.debugLine="Dim piva As String = m.Get(\"part_iva\")";
_piva = BA.ObjectToString(_m.Get((Object)("part_iva")));
RDebugUtils.currentLine=5308438;
 //BA.debugLineNum = 5308438;BA.debugLine="Dim dtum As String = m.Get(\"data_ultima_modific";
_dtum = BA.ObjectToString(_m.Get((Object)("data_ultima_modifica")));
RDebugUtils.currentLine=5308439;
 //BA.debugLineNum = 5308439;BA.debugLine="Dim c As Cliente";
_c = new app.aegdistribuzione.cliente();
RDebugUtils.currentLine=5308440;
 //BA.debugLineNum = 5308440;BA.debugLine="c.Initialize(id,cod,denom,indir,piva,dtum)";
_c._initialize(null,ba,_id,_cod,_denom,_indir,_piva,_dtum);
RDebugUtils.currentLine=5308441;
 //BA.debugLineNum = 5308441;BA.debugLine="m_clienti.Add(c)";
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
RDebugUtils.currentLine=5308445;
 //BA.debugLineNum = 5308445;BA.debugLine="Return m_clienti";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_clienti));return;};
RDebugUtils.currentLine=5308446;
 //BA.debugLineNum = 5308446;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Dim m_preferiti As List";
_m_preferiti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="m_preferiti.Initialize";
_m_preferiti.Initialize();
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="m_job.Download(m_url & \"/preferiti\")";
__ref._m_job._download(__ref._m_url+"/preferiti");
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "scaricapreferiti"), (Object)(__ref._m_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="For Each m As Map In objects";
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
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="Dim cod As String = m.Get(\"cod_art\")";
_cod = BA.ObjectToString(_m.Get((Object)("cod_art")));
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="Dim desc As String = m.Get(\"desc_art\")";
_desc = BA.ObjectToString(_m.Get((Object)("desc_art")));
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="Dim id As Int = m.Get(\"id_art\")";
_id = (int)(BA.ObjectToNumber(_m.Get((Object)("id_art"))));
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="Dim cid As String = m.Get(\"id_cliente\")";
_cid = BA.ObjectToString(_m.Get((Object)("id_cliente")));
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="Dim occ As String = m.Get(\"occorrenze\")";
_occ = BA.ObjectToString(_m.Get((Object)("occorrenze")));
RDebugUtils.currentLine=5439509;
 //BA.debugLineNum = 5439509;BA.debugLine="Dim pr As Preferito";
_pr = new app.aegdistribuzione.preferito();
RDebugUtils.currentLine=5439510;
 //BA.debugLineNum = 5439510;BA.debugLine="pr.Initialize(id, cod, desc, cid, occ)";
_pr._initialize(null,ba,_id,_cod,_desc,(int)(Double.parseDouble(_cid)),(int)(Double.parseDouble(_occ)));
RDebugUtils.currentLine=5439511;
 //BA.debugLineNum = 5439511;BA.debugLine="m_preferiti.Add(pr)";
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
RDebugUtils.currentLine=5439515;
 //BA.debugLineNum = 5439515;BA.debugLine="Return m_preferiti";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_preferiti));return;};
RDebugUtils.currentLine=5439516;
 //BA.debugLineNum = 5439516;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="m_successo = False";
__ref._m_successo = parent.__c.False;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Dim m_ordini As List";
_m_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="m_ordini.Initialize";
_m_ordini.Initialize();
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="m_job.Download(m_url & \"/storico_ordini\")";
__ref._m_job._download(__ref._m_url+"/storico_ordini");
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Wait For (m_job) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "apiclient", "storicoordini"), (Object)(__ref._m_job));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="If m_job.Success Then";
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
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="m_successo = True";
__ref._m_successo = parent.__c.True;
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="parser.Initialize(m_job.GetString)";
_parser.Initialize(__ref._m_job._getstring());
RDebugUtils.currentLine=5373963;
 //BA.debugLineNum = 5373963;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="Dim objects As List = root.Get(\"data\")";
_objects = new anywheresoftware.b4a.objects.collections.List();
_objects.setObject((java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="For Each m As Map In objects";
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
RDebugUtils.currentLine=5373967;
 //BA.debugLineNum = 5373967;BA.debugLine="Dim dt_inv As String = m.Get(\"data_invio\")";
_dt_inv = BA.ObjectToString(_m.Get((Object)("data_invio")));
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="Dim oid As Int = m.Get(\"id\")";
_oid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=5373969;
 //BA.debugLineNum = 5373969;BA.debugLine="Dim cId As Int = m.Get(\"id_cliente\")";
_cid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_cliente"))));
RDebugUtils.currentLine=5373970;
 //BA.debugLineNum = 5373970;BA.debugLine="Dim uId As Int = m.Get(\"id_utente\")";
_uid = (int)(BA.ObjectToNumber(_m.Get((Object)("id_utente"))));
RDebugUtils.currentLine=5373971;
 //BA.debugLineNum = 5373971;BA.debugLine="Dim nt As String = m.Get(\"note\")";
_nt = BA.ObjectToString(_m.Get((Object)("note")));
RDebugUtils.currentLine=5373972;
 //BA.debugLineNum = 5373972;BA.debugLine="Dim ordn As Ordine";
_ordn = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=5373973;
 //BA.debugLineNum = 5373973;BA.debugLine="ordn.Initialize(oid,cId,uId,dt_inv,nt)";
_ordn._initialize(null,ba,_oid,_cid,_uid,_dt_inv,_nt);
RDebugUtils.currentLine=5373975;
 //BA.debugLineNum = 5373975;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
_righe = new anywheresoftware.b4a.objects.collections.List();
_righe.setObject((java.util.List)(_m.Get((Object)("righe"))));
RDebugUtils.currentLine=5373976;
 //BA.debugLineNum = 5373976;BA.debugLine="For Each r As Map In righe";
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
RDebugUtils.currentLine=5373977;
 //BA.debugLineNum = 5373977;BA.debugLine="Try";
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
RDebugUtils.currentLine=5373978;
 //BA.debugLineNum = 5373978;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=5373979;
 //BA.debugLineNum = 5373979;BA.debugLine="Dim id As Int = r.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_r.Get((Object)("id"))));
RDebugUtils.currentLine=5373980;
 //BA.debugLineNum = 5373980;BA.debugLine="Dim oid As Int = ordn.Id";
_oid = _ordn._id;
RDebugUtils.currentLine=5373981;
 //BA.debugLineNum = 5373981;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
_cod = BA.ObjectToString(_r.Get((Object)("cod_art")));
RDebugUtils.currentLine=5373982;
 //BA.debugLineNum = 5373982;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
_desc = BA.ObjectToString(_r.Get((Object)("desc_art")));
RDebugUtils.currentLine=5373983;
 //BA.debugLineNum = 5373983;BA.debugLine="Dim note As String = r.Get(\"note\")";
_note = BA.ObjectToString(_r.Get((Object)("note")));
RDebugUtils.currentLine=5373984;
 //BA.debugLineNum = 5373984;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
_prezzo = (float)(BA.ObjectToNumber(_r.Get((Object)("prez_art"))));
RDebugUtils.currentLine=5373985;
 //BA.debugLineNum = 5373985;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
_qta = (int)(BA.ObjectToNumber(_r.Get((Object)("qta"))));
RDebugUtils.currentLine=5373986;
 //BA.debugLineNum = 5373986;BA.debugLine="v.Initialize(id, cod, desc, oid, note, prezzo";
_v._initialize(null,ba,_id,_cod,_desc,_oid,_note,_prezzo,_qta);
RDebugUtils.currentLine=5373987;
 //BA.debugLineNum = 5373987;BA.debugLine="ordn.Voci.Add(v)";
_ordn._voci.Add((Object)(_v));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=5373989;
 //BA.debugLineNum = 5373989;BA.debugLine="Log(LastException)";
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
RDebugUtils.currentLine=5373993;
 //BA.debugLineNum = 5373993;BA.debugLine="m_ordini.Add(ordn)";
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
RDebugUtils.currentLine=5373997;
 //BA.debugLineNum = 5373997;BA.debugLine="Return m_ordini";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m_ordini));return;};
RDebugUtils.currentLine=5373998;
 //BA.debugLineNum = 5373998;BA.debugLine="End Sub";
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