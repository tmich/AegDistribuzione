
package app.aegdistribuzione;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class apiclient {
    public static RemoteObject myClass;
	public apiclient() {
	}
    public static PCBA staticBA = new PCBA(null, apiclient.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _m_job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
public static RemoteObject _m_successo = RemoteObject.createImmutable(false);
public static RemoteObject _m_url = RemoteObject.createImmutable("");
public static RemoteObject _m_errore = RemoteObject.createImmutable("");
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
		return new Object[] {"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"m_errore",_ref.getField(false, "_m_errore"),"m_job",_ref.getField(false, "_m_job"),"m_successo",_ref.getField(false, "_m_successo"),"m_url",_ref.getField(false, "_m_url")};
}
}