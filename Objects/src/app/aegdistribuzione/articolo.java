package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class articolo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.articolo");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.articolo.class).invoke(this, new Object[] {null});
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
public String _codice = "";
public String _descrizione = "";
public float _prezzo = 0f;
public String _dataultimamodifica = "";
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
public String  _initialize(app.aegdistribuzione.articolo __ref,anywheresoftware.b4a.BA _ba,int _aid,String _cod,String _descr,float _prz,String _dum) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="articolo";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_aid,_cod,_descr,_prz,_dum}));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub Initialize(aId As Int, cod As String, d";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Id=aId";
__ref._id = _aid;
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Codice=cod";
__ref._codice = _cod;
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Descrizione=descr";
__ref._descrizione = _descr;
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Prezzo=prz";
__ref._prezzo = _prz;
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="DataUltimaModifica=dum";
__ref._dataultimamodifica = _dum;
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.articolo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="articolo";
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Public Codice As String";
_codice = "";
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Public Descrizione As String";
_descrizione = "";
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Public Prezzo As Float";
_prezzo = 0f;
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="Public DataUltimaModifica As String";
_dataultimamodifica = "";
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="End Sub";
return "";
}
}