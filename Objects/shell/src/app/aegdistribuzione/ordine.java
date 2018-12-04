
package app.aegdistribuzione;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class ordine {
    public static RemoteObject myClass;
	public ordine() {
	}
    public static PCBA staticBA = new PCBA(null, ordine.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _idcliente = RemoteObject.createImmutable(0);
public static RemoteObject _idutente = RemoteObject.createImmutable(0);
public static RemoteObject _datainvio = RemoteObject.createImmutable("");
public static RemoteObject _note = RemoteObject.createImmutable("");
public static RemoteObject _voci = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static app.aegdistribuzione.main _main = null;
public static app.aegdistribuzione.ordineactivity _ordineactivity = null;
public static app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public static app.aegdistribuzione.starter _starter = null;
public static app.aegdistribuzione.loginactivity _loginactivity = null;
public static app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public static app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public static app.aegdistribuzione.clientiactivity _clientiactivity = null;
public static app.aegdistribuzione.articoliactivity _articoliactivity = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DataInvio",_ref.getField(false, "_datainvio"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"Id",_ref.getField(false, "_id"),"IdCliente",_ref.getField(false, "_idcliente"),"IdUtente",_ref.getField(false, "_idutente"),"Note",_ref.getField(false, "_note"),"Voci",_ref.getField(false, "_voci")};
}
}