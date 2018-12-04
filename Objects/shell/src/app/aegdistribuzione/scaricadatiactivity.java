
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

public class scaricadatiactivity implements IRemote{
	public static scaricadatiactivity mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public scaricadatiactivity() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("scaricadatiactivity"), "app.aegdistribuzione.scaricadatiactivity");
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
		pcBA = new PCBA(this, scaricadatiactivity.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _progressbar1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _btnaggiorna = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static app.aegdistribuzione.main _main = null;
public static app.aegdistribuzione.ordineactivity _ordineactivity = null;
public static app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public static app.aegdistribuzione.articoliactivity _articoliactivity = null;
public static app.aegdistribuzione.starter _starter = null;
public static app.aegdistribuzione.loginactivity _loginactivity = null;
public static app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public static app.aegdistribuzione.clientiactivity _clientiactivity = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",scaricadatiactivity.mostCurrent._activity,"ArticoliActivity",Debug.moduleToString(app.aegdistribuzione.articoliactivity.class),"BtnAggiorna",scaricadatiactivity.mostCurrent._btnaggiorna,"ClientiActivity",Debug.moduleToString(app.aegdistribuzione.clientiactivity.class),"DettaglioOrdineActivity",Debug.moduleToString(app.aegdistribuzione.dettaglioordineactivity.class),"HttpUtils2Service",scaricadatiactivity.mostCurrent._httputils2service,"LoginActivity",Debug.moduleToString(app.aegdistribuzione.loginactivity.class),"Main",Debug.moduleToString(app.aegdistribuzione.main.class),"OrdineActivity",Debug.moduleToString(app.aegdistribuzione.ordineactivity.class),"ProgressBar1",scaricadatiactivity.mostCurrent._progressbar1,"SchedaClienteActivity",Debug.moduleToString(app.aegdistribuzione.schedaclienteactivity.class),"Starter",Debug.moduleToString(app.aegdistribuzione.starter.class)};
}
}