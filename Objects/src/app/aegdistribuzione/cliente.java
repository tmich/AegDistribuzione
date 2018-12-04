package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cliente extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.cliente");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.cliente.class).invoke(this, new Object[] {null});
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
public String _denominazione = "";
public String _indirizzo = "";
public String _partitaiva = "";
public String _dataultimamodifica = "";
public anywheresoftware.b4a.objects.collections.List _ordini = null;
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
public String  _initialize(app.aegdistribuzione.cliente __ref,anywheresoftware.b4a.BA _ba,int _cid,String _cod,String _denom,String _indir,String _iva,String _dtum) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cliente";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_cid,_cod,_denom,_indir,_iva,_dtum}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub Initialize(cId As Int, Cod As String, D";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Id = cId";
__ref._id = _cid;
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Codice = Cod";
__ref._codice = _cod;
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Denominazione = Denom";
__ref._denominazione = _denom;
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="Indirizzo = Indir";
__ref._indirizzo = _indir;
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="PartitaIVA = Iva";
__ref._partitaiva = _iva;
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="DataUltimaModifica = dtum";
__ref._dataultimamodifica = _dtum;
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="Ordini.Initialize";
__ref._ordini.Initialize();
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.cliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cliente";
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Public Codice As String";
_codice = "";
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Public Denominazione As String";
_denominazione = "";
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Public Indirizzo As String";
_indirizzo = "";
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="Public PartitaIVA As String";
_partitaiva = "";
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Public DataUltimaModifica As String";
_dataultimamodifica = "";
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="Public Ordini As List";
_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="End Sub";
return "";
}
}