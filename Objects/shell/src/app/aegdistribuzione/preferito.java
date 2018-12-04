
package app.aegdistribuzione;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class preferito {
    public static RemoteObject myClass;
	public preferito() {
	}
    public static PCBA staticBA = new PCBA(null, preferito.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _idart = RemoteObject.createImmutable(0);
public static RemoteObject _codice = RemoteObject.createImmutable("");
public static RemoteObject _descrizione = RemoteObject.createImmutable("");
public static RemoteObject _idcliente = RemoteObject.createImmutable(0);
public static RemoteObject _occorrenze = RemoteObject.createImmutable(0);
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
		return new Object[] {"Codice",_ref.getField(false, "_codice"),"Descrizione",_ref.getField(false, "_descrizione"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"IdArt",_ref.getField(false, "_idart"),"IdCliente",_ref.getField(false, "_idcliente"),"Occorrenze",_ref.getField(false, "_occorrenze")};
}
}