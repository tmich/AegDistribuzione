package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class ordine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.ordine");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.ordine.class).invoke(this, new Object[] {null});
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
public int _id = 0;
public int _idcliente = 0;
public int _idutente = 0;
public String _datainvio = "";
public String _note = "";
public anywheresoftware.b4a.objects.collections.List _voci = null;
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
public float  _totale(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "totale"))
	 {return ((Float) Debug.delegate(ba, "totale", null));}
float _tot = 0f;
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub Totale As Float";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim tot As Float = 0.0F";
_tot = (float) (0.0f);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="For Each v As VoceOrdine In Voci";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._voci;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (app.aegdistribuzione.voceordine)(group2.Get(index2));
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="tot = tot + v.Totale";
_tot = (float) (_tot+_v._totale(null));
 }
};
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Return tot";
if (true) return _tot;
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="End Sub";
return 0f;
}
public boolean  _aggiungi(app.aegdistribuzione.ordine __ref,app.aegdistribuzione.articolo _art,int _qta,String _nt) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "aggiungi"))
	 {return ((Boolean) Debug.delegate(ba, "aggiungi", new Object[] {_art,_qta,_nt}));}
boolean _cnt = false;
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub Aggiungi(art As Articolo, qta As Int, n";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Dim cnt As Boolean = Contiene(art)";
_cnt = __ref._contiene(null,_art);
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="If Not(cnt) Then";
if (__c.Not(_cnt)) { 
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="Dim v As VoceOrdine = Starter.db.NuovaVoce(Me, a";
_v = _starter._db._nuovavoce(null,(app.aegdistribuzione.ordine)(this),_art._codice,_art._descrizione,_qta,_art._prezzo,_nt);
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Voci.Add(v)";
__ref._voci.Add((Object)(_v));
 };
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="Return Not(cnt)";
if (true) return __c.Not(_cnt);
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="End Sub";
return false;
}
public String  _initialize(app.aegdistribuzione.ordine __ref,anywheresoftware.b4a.BA _ba,int _oid,int _cid,int _uid,String _dtinv,String _nt) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_oid,_cid,_uid,_dtinv,_nt}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub Initialize(oid As Int, cid As Int, uid";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Id=oid";
__ref._id = _oid;
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="IdCliente = cid";
__ref._idcliente = _cid;
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="IdUtente = uid";
__ref._idutente = _uid;
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="DataInvio = dtinv";
__ref._datainvio = _dtinv;
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Note = nt";
__ref._note = _nt;
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="Voci.Initialize";
__ref._voci.Initialize();
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="End Sub";
return "";
}
public String  _getdataformattata(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "getdataformattata"))
	 {return ((String) Debug.delegate(ba, "getdataformattata", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub getDataFormattata As String";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Return DataInvio";
if (true) return __ref._datainvio;
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public String  _tojson(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "tojson"))
	 {return ((String) Debug.delegate(ba, "tojson", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _js = null;
anywheresoftware.b4a.objects.collections.List _righe = null;
app.aegdistribuzione.voceordine _v = null;
anywheresoftware.b4a.objects.collections.Map _mv = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub ToJson As String";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Dim js As JSONGenerator";
_js = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Dim righe As List";
_righe = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="righe.Initialize";
_righe.Initialize();
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="For Each v As VoceOrdine In Voci";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._voci;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (app.aegdistribuzione.voceordine)(group6.Get(index6));
RDebugUtils.currentLine=13238280;
 //BA.debugLineNum = 13238280;BA.debugLine="Dim mv As Map = v.ToMap";
_mv = new anywheresoftware.b4a.objects.collections.Map();
_mv = _v._tomap(null);
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="mv.Remove(\"id\")";
_mv.Remove((Object)("id"));
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="righe.Add(mv)";
_righe.Add((Object)(_mv.getObject()));
 }
};
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="m.Put(\"righe\", righe)";
_m.Put((Object)("righe"),(Object)(_righe.getObject()));
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="js.Initialize(m)";
_js.Initialize(_m);
RDebugUtils.currentLine=13238287;
 //BA.debugLineNum = 13238287;BA.debugLine="Log(js.ToPrettyString(4))";
__c.Log(_js.ToPrettyString((int) (4)));
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="Return js.ToString()";
if (true) return _js.ToString();
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="End Sub";
return "";
}
public String  _fromjson(app.aegdistribuzione.ordine __ref,String _jsonstring) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "fromjson"))
	 {return ((String) Debug.delegate(ba, "fromjson", new Object[] {_jsonstring}));}
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _righe = null;
anywheresoftware.b4a.objects.collections.Map _r = null;
app.aegdistribuzione.voceordine _v = null;
int _vid = 0;
String _cod = "";
String _desc = "";
String _vnote = "";
float _prezzo = 0f;
int _qta = 0;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Public Sub FromJson(jsonString As String)";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="parser.Initialize(jsonString)";
_parser.Initialize(_jsonstring);
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Dim m As Map = root.Get(\"data\")";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="Id = m.Get(\"id\")";
__ref._id = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="IdCliente = m.Get(\"id_cliente\")";
__ref._idcliente = (int)(BA.ObjectToNumber(_m.Get((Object)("id_cliente"))));
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="IdUtente = m.Get(\"id_utente\")";
__ref._idutente = (int)(BA.ObjectToNumber(_m.Get((Object)("id_utente"))));
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="DataInvio = m.Get(\"data_invio\")";
__ref._datainvio = BA.ObjectToString(_m.Get((Object)("data_invio")));
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="Note = m.Get(\"note\")";
__ref._note = BA.ObjectToString(_m.Get((Object)("note")));
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="Dim righe As List = m.Get(\"righe\")";
_righe = new anywheresoftware.b4a.objects.collections.List();
_righe.setObject((java.util.List)(_m.Get((Object)("righe"))));
RDebugUtils.currentLine=18808846;
 //BA.debugLineNum = 18808846;BA.debugLine="For Each r As Map In righe";
_r = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group11 = _righe;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_r.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=18808848;
 //BA.debugLineNum = 18808848;BA.debugLine="Dim vId As Int = r.Get(\"id\")";
_vid = (int)(BA.ObjectToNumber(_r.Get((Object)("id"))));
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="Dim cod As String = r.Get(\"cod_art\")";
_cod = BA.ObjectToString(_r.Get((Object)("cod_art")));
RDebugUtils.currentLine=18808850;
 //BA.debugLineNum = 18808850;BA.debugLine="Dim desc As String = r.Get(\"desc_art\")";
_desc = BA.ObjectToString(_r.Get((Object)("desc_art")));
RDebugUtils.currentLine=18808851;
 //BA.debugLineNum = 18808851;BA.debugLine="Dim vNote As String = r.Get(\"note\")";
_vnote = BA.ObjectToString(_r.Get((Object)("note")));
RDebugUtils.currentLine=18808852;
 //BA.debugLineNum = 18808852;BA.debugLine="Dim prezzo As Float = r.Get(\"prez_art\")";
_prezzo = (float)(BA.ObjectToNumber(_r.Get((Object)("prez_art"))));
RDebugUtils.currentLine=18808853;
 //BA.debugLineNum = 18808853;BA.debugLine="Dim qta As Int = r.Get(\"qta\")";
_qta = (int)(BA.ObjectToNumber(_r.Get((Object)("qta"))));
RDebugUtils.currentLine=18808854;
 //BA.debugLineNum = 18808854;BA.debugLine="v.Initialize(vId, cod, desc, Id, vNote, prezzo,";
_v._initialize(null,ba,_vid,_cod,_desc,__ref._id,_vnote,_prezzo,_qta);
RDebugUtils.currentLine=18808855;
 //BA.debugLineNum = 18808855;BA.debugLine="Voci.Add(v)";
__ref._voci.Add((Object)(_v));
 }
};
RDebugUtils.currentLine=18808857;
 //BA.debugLineNum = 18808857;BA.debugLine="End Sub";
return "";
}
public boolean  _contiene(app.aegdistribuzione.ordine __ref,app.aegdistribuzione.articolo _art) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "contiene"))
	 {return ((Boolean) Debug.delegate(ba, "contiene", new Object[] {_art}));}
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub Contiene(art As Articolo) As Boolean";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="For Each v As VoceOrdine In Voci";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._voci;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = (app.aegdistribuzione.voceordine)(group1.Get(index1));
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="If v.CodArt == art.Codice Then";
if ((_v._codart).equals(_art._codice)) { 
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }
};
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=21037064;
 //BA.debugLineNum = 21037064;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Public IdCliente As Int";
_idcliente = 0;
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Public IdUtente As Int";
_idutente = 0;
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Public DataInvio As String";
_datainvio = "";
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Public Note As String";
_note = "";
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="Public Voci As List";
_voci = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="End Sub";
return "";
}
public long  _getdatainvioticks(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "getdatainvioticks"))
	 {return ((Long) Debug.delegate(ba, "getdatainvioticks", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub getDataInvioTicks As Long";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy HH:mm:ss\"";
__c.DateTime.setDateFormat("dd/MM/yyyy HH:mm:ss");
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Return DateTime.DateParse(DataInvio)";
if (true) return __c.DateTime.DateParse(__ref._datainvio);
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="End Sub";
return 0L;
}
public int  _numvoci(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "numvoci"))
	 {return ((Integer) Debug.delegate(ba, "numvoci", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub NumVoci As Int";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Return Voci.Size";
if (true) return __ref._voci.getSize();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return 0;
}
}