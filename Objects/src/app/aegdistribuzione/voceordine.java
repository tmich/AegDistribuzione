package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class voceordine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.voceordine");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.voceordine.class).invoke(this, new Object[] {null});
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
public String _codart = "";
public String _descart = "";
public int _idordine = 0;
public String _note = "";
public float _prezzo = 0f;
public int _qta = 0;
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
public String  _initialize(app.aegdistribuzione.voceordine __ref,anywheresoftware.b4a.BA _ba,int _vid,String _vcod,String _vdesc,int _oid,String _nt,float _prz,int _q) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="voceordine";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vid,_vcod,_vdesc,_oid,_nt,_prz,_q}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub Initialize(vid As Int, vcod As String,";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Id = vid";
__ref._id = _vid;
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="CodArt = vcod";
__ref._codart = _vcod;
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="DescArt = vdesc";
__ref._descart = _vdesc;
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="IdOrdine = oid";
__ref._idordine = _oid;
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="Note = nt";
__ref._note = _nt;
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Prezzo = prz";
__ref._prezzo = _prz;
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="Qta = q";
__ref._qta = _q;
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _tomap(app.aegdistribuzione.voceordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="voceordine";
if (Debug.shouldDelegate(ba, "tomap"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "tomap", null));}
anywheresoftware.b4a.objects.collections.Map _mv = null;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub ToMap As Map";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Dim mv As Map";
_mv = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="mv.Initialize";
_mv.Initialize();
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="mv.Put(\"id\", Id)";
_mv.Put((Object)("id"),(Object)(__ref._id));
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="mv.Put(\"codice\", CodArt)";
_mv.Put((Object)("codice"),(Object)(__ref._codart));
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="mv.Put(\"desc_art\", DescArt)";
_mv.Put((Object)("desc_art"),(Object)(__ref._descart));
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="mv.Put(\"prez_art\", Prezzo)";
_mv.Put((Object)("prez_art"),(Object)(__ref._prezzo));
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="mv.Put(\"qta\", Qta)";
_mv.Put((Object)("qta"),(Object)(__ref._qta));
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="mv.Put(\"note\", Note)";
_mv.Put((Object)("note"),(Object)(__ref._note));
RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="Return mv";
if (true) return _mv;
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="End Sub";
return null;
}
public float  _totale(app.aegdistribuzione.voceordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="voceordine";
if (Debug.shouldDelegate(ba, "totale"))
	 {return ((Float) Debug.delegate(ba, "totale", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub Totale As Float";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Return Prezzo * Qta";
if (true) return (float) (__ref._prezzo*__ref._qta);
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return 0f;
}
public String  _class_globals(app.aegdistribuzione.voceordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="voceordine";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Public CodArt As String";
_codart = "";
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Public DescArt As String";
_descart = "";
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Public IdOrdine As Int";
_idordine = 0;
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Public Note As String";
_note = "";
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="Public Prezzo As Float";
_prezzo = 0f;
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="Public Qta As Int";
_qta = 0;
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="End Sub";
return "";
}
}