package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class utente extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.utente");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.utente.class).invoke(this, new Object[] {null});
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
public String _nome = "";
public String _ultimoaccesso = "";
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
public String  _initialize(app.aegdistribuzione.utente __ref,anywheresoftware.b4a.BA _ba,int _uid,String _nom,String _uac) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="utente";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_uid,_nom,_uac}));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub Initialize(uid As Int, nom As String, u";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Id=uid";
__ref._id = _uid;
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Nome=nom";
__ref._nome = _nom;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="UltimoAccesso=uac";
__ref._ultimoaccesso = _uac;
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.utente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="utente";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Public Nome As String";
_nome = "";
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Public UltimoAccesso As String";
_ultimoaccesso = "";
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="End Sub";
return "";
}
}