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
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public String  _initialize(app.aegdistribuzione.cliente __ref,anywheresoftware.b4a.BA _ba,int _cid,String _cod,String _denom,String _indir,String _iva,String _dtum) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cliente";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_cid,_cod,_denom,_indir,_iva,_dtum}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub Initialize(cId As Int, Cod As String, D";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Id = cId";
__ref._id = _cid;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Codice = Cod";
__ref._codice = _cod;
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Denominazione = Denom";
__ref._denominazione = _denom;
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Indirizzo = Indir";
__ref._indirizzo = _indir;
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="PartitaIVA = Iva";
__ref._partitaiva = _iva;
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="DataUltimaModifica = dtum";
__ref._dataultimamodifica = _dtum;
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="Ordini.Initialize";
__ref._ordini.Initialize();
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.cliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cliente";
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Public Codice As String";
_codice = "";
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Public Denominazione As String";
_denominazione = "";
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Public Indirizzo As String";
_indirizzo = "";
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="Public PartitaIVA As String";
_partitaiva = "";
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="Public DataUltimaModifica As String";
_dataultimamodifica = "";
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="Public Ordini As List";
_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="End Sub";
return "";
}
}