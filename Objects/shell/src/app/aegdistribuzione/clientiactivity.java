
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

public class clientiactivity implements IRemote{
	public static clientiactivity mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public clientiactivity() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("clientiactivity"), "app.aegdistribuzione.clientiactivity");
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
		pcBA = new PCBA(this, clientiactivity.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _lvclienti = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _txcerca = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btncerca = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnannulla = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _oime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _bd = RemoteObject.declareNull("flm.b4a.betterdialogs.BetterDialogs");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static app.aegdistribuzione.main _main = null;
public static app.aegdistribuzione.ordineactivity _ordineactivity = null;
public static app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public static app.aegdistribuzione.articoliactivity _articoliactivity = null;
public static app.aegdistribuzione.starter _starter = null;
public static app.aegdistribuzione.loginactivity _loginactivity = null;
public static app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public static app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",clientiactivity.mostCurrent._activity,"ArticoliActivity",Debug.moduleToString(app.aegdistribuzione.articoliactivity.class),"BD",clientiactivity.mostCurrent._bd,"btnAnnulla",clientiactivity.mostCurrent._btnannulla,"btnCerca",clientiactivity.mostCurrent._btncerca,"DettaglioOrdineActivity",Debug.moduleToString(app.aegdistribuzione.dettaglioordineactivity.class),"HttpUtils2Service",clientiactivity.mostCurrent._httputils2service,"Label1",clientiactivity.mostCurrent._label1,"LoginActivity",Debug.moduleToString(app.aegdistribuzione.loginactivity.class),"lvClienti",clientiactivity.mostCurrent._lvclienti,"Main",Debug.moduleToString(app.aegdistribuzione.main.class),"oIme",clientiactivity.mostCurrent._oime,"OrdineActivity",Debug.moduleToString(app.aegdistribuzione.ordineactivity.class),"ScaricaDatiActivity",Debug.moduleToString(app.aegdistribuzione.scaricadatiactivity.class),"SchedaClienteActivity",Debug.moduleToString(app.aegdistribuzione.schedaclienteactivity.class),"Starter",Debug.moduleToString(app.aegdistribuzione.starter.class),"txCerca",clientiactivity.mostCurrent._txcerca};
}
}