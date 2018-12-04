
package app.aegdistribuzione;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class voceordine {
    public static RemoteObject myClass;
	public voceordine() {
	}
    public static PCBA staticBA = new PCBA(null, voceordine.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _codart = RemoteObject.createImmutable("");
public static RemoteObject _descart = RemoteObject.createImmutable("");
public static RemoteObject _idordine = RemoteObject.createImmutable(0);
public static RemoteObject _note = RemoteObject.createImmutable("");
public static RemoteObject _prezzo = RemoteObject.createImmutable(0f);
public static RemoteObject _qta = RemoteObject.createImmutable(0);
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
		return new Object[] {"CodArt",_ref.getField(false, "_codart"),"DescArt",_ref.getField(false, "_descart"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"Id",_ref.getField(false, "_id"),"IdOrdine",_ref.getField(false, "_idordine"),"Note",_ref.getField(false, "_note"),"Prezzo",_ref.getField(false, "_prezzo"),"Qta",_ref.getField(false, "_qta")};
}
}