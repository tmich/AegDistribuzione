package app.aegdistribuzione;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class scaricadatiactivity extends Activity implements B4AActivity{
	public static scaricadatiactivity mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "app.aegdistribuzione", "app.aegdistribuzione.scaricadatiactivity");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (scaricadatiactivity).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "app.aegdistribuzione", "app.aegdistribuzione.scaricadatiactivity");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "app.aegdistribuzione.scaricadatiactivity", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (scaricadatiactivity) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (scaricadatiactivity) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return scaricadatiactivity.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (scaricadatiactivity) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            scaricadatiactivity mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (scaricadatiactivity) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaggiorna = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public app.aegdistribuzione.main _main = null;
public app.aegdistribuzione.ordineactivity _ordineactivity = null;
public app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="scaricadatiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Activity.LoadLayout(\"ScaricaDatiLayout\")";
mostCurrent._activity.LoadLayout("ScaricaDatiLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="scaricadatiactivity";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="scaricadatiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return "";
}
public static void  _btnaggiorna_click() throws Exception{
RDebugUtils.currentModule="scaricadatiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaggiorna_click"))
	 {Debug.delegate(mostCurrent.activityBA, "btnaggiorna_click", null); return;}
ResumableSub_BtnAggiorna_Click rsub = new ResumableSub_BtnAggiorna_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnAggiorna_Click extends BA.ResumableSub {
public ResumableSub_BtnAggiorna_Click(app.aegdistribuzione.scaricadatiactivity parent) {
this.parent = parent;
}
app.aegdistribuzione.scaricadatiactivity parent;
boolean _error = false;
String _msg = "";
anywheresoftware.b4a.objects.collections.List _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="scaricadatiactivity";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="BtnAggiorna.Enabled = False";
parent.mostCurrent._btnaggiorna.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Dim error As Boolean = False";
_error = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="Dim msg As String = \"\"";
_msg = "";
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="ProgressDialogShow2(\"Aggiornamento in corso\", Fal";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Aggiornamento in corso"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="Wait For (Starter.client.ScaricaClienti) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scaricadatiactivity", "btnaggiorna_click"), parent.mostCurrent._starter._client._scaricaclienti(null));
this.state = 56;
return;
case 56:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="If Starter.client.Successo Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent.mostCurrent._starter._client._getsuccesso(null)) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="ProgressBar1.Progress = 25";
parent.mostCurrent._progressbar1.setProgress((int) (25));
RDebugUtils.currentLine=6029323;
 //BA.debugLineNum = 6029323;BA.debugLine="If Result.Size > 0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result.getSize()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6029324;
 //BA.debugLineNum = 6029324;BA.debugLine="Starter.db.SalvaClienti(Result)";
parent.mostCurrent._starter._db._salvaclienti(null,_result);
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="error = True";
_error = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="msg = \"Errore durante l'aggiornamento dei client";
_msg = "Errore durante l'aggiornamento dei clienti";
 if (true) break;
;
RDebugUtils.currentLine=6029332;
 //BA.debugLineNum = 6029332;BA.debugLine="If error = False Then";

case 10:
//if
this.state = 23;
if (_error==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="Wait For (Starter.client.ScaricaArticoli) Comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scaricadatiactivity", "btnaggiorna_click"), parent.mostCurrent._starter._client._scaricaarticoli(null));
this.state = 57;
return;
case 57:
//C
this.state = 13;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=6029334;
 //BA.debugLineNum = 6029334;BA.debugLine="If Starter.client.Successo Then";
if (true) break;

case 13:
//if
this.state = 22;
if (parent.mostCurrent._starter._client._getsuccesso(null)) { 
this.state = 15;
}else {
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=6029335;
 //BA.debugLineNum = 6029335;BA.debugLine="ProgressBar1.Progress = 40";
parent.mostCurrent._progressbar1.setProgress((int) (40));
RDebugUtils.currentLine=6029336;
 //BA.debugLineNum = 6029336;BA.debugLine="If Result.Size > 0 Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_result.getSize()>0) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=6029337;
 //BA.debugLineNum = 6029337;BA.debugLine="Starter.db.SalvaArticoli(Result)";
parent.mostCurrent._starter._db._salvaarticoli(null,_result);
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=6029340;
 //BA.debugLineNum = 6029340;BA.debugLine="error = True";
_error = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6029341;
 //BA.debugLineNum = 6029341;BA.debugLine="msg = \"Errore durante l'aggiornamento degli art";
_msg = "Errore durante l'aggiornamento degli articoli";
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;
;
RDebugUtils.currentLine=6029346;
 //BA.debugLineNum = 6029346;BA.debugLine="If error = False Then";

case 23:
//if
this.state = 36;
if (_error==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=6029347;
 //BA.debugLineNum = 6029347;BA.debugLine="Wait For (Starter.client.StoricoOrdini) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scaricadatiactivity", "btnaggiorna_click"), parent.mostCurrent._starter._client._storicoordini(null));
this.state = 58;
return;
case 58:
//C
this.state = 26;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=6029348;
 //BA.debugLineNum = 6029348;BA.debugLine="If Starter.client.Successo Then";
if (true) break;

case 26:
//if
this.state = 35;
if (parent.mostCurrent._starter._client._getsuccesso(null)) { 
this.state = 28;
}else {
this.state = 34;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=6029349;
 //BA.debugLineNum = 6029349;BA.debugLine="ProgressBar1.Progress = 70";
parent.mostCurrent._progressbar1.setProgress((int) (70));
RDebugUtils.currentLine=6029350;
 //BA.debugLineNum = 6029350;BA.debugLine="If Result.Size > 0 Then";
if (true) break;

case 29:
//if
this.state = 32;
if (_result.getSize()>0) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=6029351;
 //BA.debugLineNum = 6029351;BA.debugLine="Starter.db.SalvaStoricoOrdini(Result)";
parent.mostCurrent._starter._db._salvastoricoordini(null,_result);
 if (true) break;

case 32:
//C
this.state = 35;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=6029354;
 //BA.debugLineNum = 6029354;BA.debugLine="error = True";
_error = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6029355;
 //BA.debugLineNum = 6029355;BA.debugLine="msg = \"Errore durante l'aggiornamento dello sto";
_msg = "Errore durante l'aggiornamento dello storico ordini";
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;
;
RDebugUtils.currentLine=6029360;
 //BA.debugLineNum = 6029360;BA.debugLine="If error = False Then";

case 36:
//if
this.state = 49;
if (_error==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=6029361;
 //BA.debugLineNum = 6029361;BA.debugLine="Wait For (Starter.client.ScaricaPreferiti) Compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "scaricadatiactivity", "btnaggiorna_click"), parent.mostCurrent._starter._client._scaricapreferiti(null));
this.state = 59;
return;
case 59:
//C
this.state = 39;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=6029362;
 //BA.debugLineNum = 6029362;BA.debugLine="If Starter.client.Successo Then";
if (true) break;

case 39:
//if
this.state = 48;
if (parent.mostCurrent._starter._client._getsuccesso(null)) { 
this.state = 41;
}else {
this.state = 47;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=6029363;
 //BA.debugLineNum = 6029363;BA.debugLine="ProgressBar1.Progress = 90";
parent.mostCurrent._progressbar1.setProgress((int) (90));
RDebugUtils.currentLine=6029364;
 //BA.debugLineNum = 6029364;BA.debugLine="If Result.Size > 0 Then";
if (true) break;

case 42:
//if
this.state = 45;
if (_result.getSize()>0) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=6029365;
 //BA.debugLineNum = 6029365;BA.debugLine="Starter.db.SalvaPreferiti(Result)";
parent.mostCurrent._starter._db._salvapreferiti(null,_result);
 if (true) break;

case 45:
//C
this.state = 48;
;
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=6029368;
 //BA.debugLineNum = 6029368;BA.debugLine="error = True";
_error = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6029369;
 //BA.debugLineNum = 6029369;BA.debugLine="msg = \"Errore durante l'aggiornamento degli art";
_msg = "Errore durante l'aggiornamento degli articoli preferiti";
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=6029391;
 //BA.debugLineNum = 6029391;BA.debugLine="BtnAggiorna.Enabled = True";
parent.mostCurrent._btnaggiorna.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6029392;
 //BA.debugLineNum = 6029392;BA.debugLine="ProgressDialogHide()";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=6029394;
 //BA.debugLineNum = 6029394;BA.debugLine="If error Then";
if (true) break;

case 50:
//if
this.state = 55;
if (_error) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 55;
RDebugUtils.currentLine=6029395;
 //BA.debugLineNum = 6029395;BA.debugLine="Msgbox(msg, \"Errore\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_msg),BA.ObjectToCharSequence("Errore"),mostCurrent.activityBA);
RDebugUtils.currentLine=6029396;
 //BA.debugLineNum = 6029396;BA.debugLine="ProgressBar1.Progress = 0";
parent.mostCurrent._progressbar1.setProgress((int) (0));
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=6029398;
 //BA.debugLineNum = 6029398;BA.debugLine="ToastMessageShow(\"Aggiornamento completato\", Fal";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Aggiornamento completato"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6029399;
 //BA.debugLineNum = 6029399;BA.debugLine="Activity.Finish()";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 55:
//C
this.state = -1;
;
RDebugUtils.currentLine=6029401;
 //BA.debugLineNum = 6029401;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}