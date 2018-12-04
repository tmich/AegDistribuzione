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
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub Totale As Float";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim tot As Float = 0.0F";
_tot = (float) (0.0f);
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="For Each v As VoceOrdine In Voci";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._voci;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (app.aegdistribuzione.voceordine)(group2.Get(index2));
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="tot = tot + v.Totale";
_tot = (float) (_tot+_v._totale(null));
 }
};
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Return tot";
if (true) return _tot;
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(app.aegdistribuzione.ordine __ref,anywheresoftware.b4a.BA _ba,int _oid,int _cid,int _uid,String _dtinv,String _nt) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_oid,_cid,_uid,_dtinv,_nt}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub Initialize(oid As Int, cid As Int, uid";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Id=oid";
__ref._id = _oid;
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="IdCliente = cid";
__ref._idcliente = _cid;
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="IdUtente = uid";
__ref._idutente = _uid;
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="DataInvio = dtinv";
__ref._datainvio = _dtinv;
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Note = nt";
__ref._note = _nt;
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="Voci.Initialize";
__ref._voci.Initialize();
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="End Sub";
return "";
}
public String  _getdataformattata(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "getdataformattata"))
	 {return ((String) Debug.delegate(ba, "getdataformattata", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub getDataFormattata As String";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Return DataInvio";
if (true) return __ref._datainvio;
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Public Id As Int";
_id = 0;
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Public IdCliente As Int";
_idcliente = 0;
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Public IdUtente As Int";
_idutente = 0;
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="Public DataInvio As String";
_datainvio = "";
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="Public Note As String";
_note = "";
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="Public Voci As List";
_voci = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="End Sub";
return "";
}
public long  _getdatainvioticks(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "getdatainvioticks"))
	 {return ((Long) Debug.delegate(ba, "getdatainvioticks", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Public Sub getDataInvioTicks As Long";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy HH:mm:ss\"";
__c.DateTime.setDateFormat("dd/MM/yyyy HH:mm:ss");
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Return DateTime.DateParse(DataInvio)";
if (true) return __c.DateTime.DateParse(__ref._datainvio);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="End Sub";
return 0L;
}
public int  _numvoci(app.aegdistribuzione.ordine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ordine";
if (Debug.shouldDelegate(ba, "numvoci"))
	 {return ((Integer) Debug.delegate(ba, "numvoci", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub NumVoci As Int";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Return Voci.Size";
if (true) return __ref._voci.getSize();
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return 0;
}
}