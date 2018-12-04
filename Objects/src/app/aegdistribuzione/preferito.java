package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class preferito extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.preferito");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.preferito.class).invoke(this, new Object[] {null});
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
public int _idart = 0;
public String _codice = "";
public String _descrizione = "";
public int _idcliente = 0;
public int _occorrenze = 0;
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
public String  _initialize(app.aegdistribuzione.preferito __ref,anywheresoftware.b4a.BA _ba,int _aid,String _cod,String _descr,int _cid,int _occ) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="preferito";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_aid,_cod,_descr,_cid,_occ}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub Initialize(aId As Int, cod As String, d";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="IdArt = aId";
__ref._idart = _aid;
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Codice = cod";
__ref._codice = _cod;
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Descrizione = descr";
__ref._descrizione = _descr;
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="IdCliente = cid";
__ref._idcliente = _cid;
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Occorrenze = occ";
__ref._occorrenze = _occ;
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.preferito __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferito";
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Public IdArt As Int";
_idart = 0;
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Public Codice As String";
_codice = "";
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Public Descrizione As String";
_descrizione = "";
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Public IdCliente As Int";
_idcliente = 0;
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Public Occorrenze As Int";
_occorrenze = 0;
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="End Sub";
return "";
}
}