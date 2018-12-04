
package app.aegdistribuzione;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class ordineactivity implements IRemote{
	public static ordineactivity mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public ordineactivity() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("ordineactivity"), "app.aegdistribuzione.ordineactivity");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, ordineactivity.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _m_ordine = RemoteObject.declareNull("app.aegdistribuzione.ordine");
public static RemoteObject _m_cliente = RemoteObject.declareNull("app.aegdistribuzione.cliente");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcliente = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblindirizzo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _clv2 = RemoteObject.declareNull("app.aegdistribuzione.customlistview");
public static RemoteObject _spinner1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblordine = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltotale = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btninvia = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static app.aegdistribuzione.main _main = null;
public static app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public static app.aegdistribuzione.articoliactivity _articoliactivity = null;
public static app.aegdistribuzione.starter _starter = null;
public static app.aegdistribuzione.loginactivity _loginactivity = null;
public static app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public static app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public static app.aegdistribuzione.clientiactivity _clientiactivity = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",ordineactivity.mostCurrent._activity,"ArticoliActivity",Debug.moduleToString(app.aegdistribuzione.articoliactivity.class),"btnInvia",ordineactivity.mostCurrent._btninvia,"Button1",ordineactivity.mostCurrent._button1,"ClientiActivity",Debug.moduleToString(app.aegdistribuzione.clientiactivity.class),"clv2",ordineactivity.mostCurrent._clv2,"DettaglioOrdineActivity",Debug.moduleToString(app.aegdistribuzione.dettaglioordineactivity.class),"HttpUtils2Service",ordineactivity.mostCurrent._httputils2service,"Label1",ordineactivity.mostCurrent._label1,"Label2",ordineactivity.mostCurrent._label2,"lblCliente",ordineactivity.mostCurrent._lblcliente,"lblIndirizzo",ordineactivity.mostCurrent._lblindirizzo,"lblOrdine",ordineactivity.mostCurrent._lblordine,"lblTotale",ordineactivity.mostCurrent._lbltotale,"LoginActivity",Debug.moduleToString(app.aegdistribuzione.loginactivity.class),"m_cliente",ordineactivity.mostCurrent._m_cliente,"m_ordine",ordineactivity.mostCurrent._m_ordine,"Main",Debug.moduleToString(app.aegdistribuzione.main.class),"ScaricaDatiActivity",Debug.moduleToString(app.aegdistribuzione.scaricadatiactivity.class),"SchedaClienteActivity",Debug.moduleToString(app.aegdistribuzione.schedaclienteactivity.class),"Spinner1",ordineactivity.mostCurrent._spinner1,"Starter",Debug.moduleToString(app.aegdistribuzione.starter.class)};
}
}