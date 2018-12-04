
package app.aegdistribuzione;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cliente {
    public static RemoteObject myClass;
	public cliente() {
	}
    public static PCBA staticBA = new PCBA(null, cliente.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _codice = RemoteObject.createImmutable("");
public static RemoteObject _denominazione = RemoteObject.createImmutable("");
public static RemoteObject _indirizzo = RemoteObject.createImmutable("");
public static RemoteObject _partitaiva = RemoteObject.createImmutable("");
public static RemoteObject _dataultimamodifica = RemoteObject.createImmutable("");
public static RemoteObject _ordini = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static app.aegdistribuzione.main _main = null;
public static app.aegdistribuzione.ordineactivity _ordineactivity = null;
public static app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public static app.aegdistribuzione.articoliactivity _articoliactivity = null;
public static app.aegdistribuzione.starter _starter = null;
public static app.aegdistribuzione.loginactivity _loginactivity = null;
public static app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public static app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public static app.aegdistribuzione.clientiactivity _clientiactivity = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Codice",_ref.getField(false, "_codice"),"DataUltimaModifica",_ref.getField(false, "_dataultimamodifica"),"Denominazione",_ref.getField(false, "_denominazione"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"Id",_ref.getField(false, "_id"),"Indirizzo",_ref.getField(false, "_indirizzo"),"Ordini",_ref.getField(false, "_ordini"),"PartitaIVA",_ref.getField(false, "_partitaiva")};
}
}