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

public class clientiactivity extends Activity implements B4AActivity{
	public static clientiactivity mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "app.aegdistribuzione", "app.aegdistribuzione.clientiactivity");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (clientiactivity).");
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
		activityBA = new BA(this, layout, processBA, "app.aegdistribuzione", "app.aegdistribuzione.clientiactivity");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "app.aegdistribuzione.clientiactivity", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (clientiactivity) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (clientiactivity) Resume **");
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
		return clientiactivity.class;
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
        BA.LogInfo("** Activity (clientiactivity) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            clientiactivity mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (clientiactivity) Resume **");
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
public anywheresoftware.b4a.objects.ListViewWrapper _lvclienti = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txcerca = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncerca = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnannulla = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.IME _oime = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public app.aegdistribuzione.main _main = null;
public app.aegdistribuzione.ordineactivity _ordineactivity = null;
public app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="clientiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Activity.LoadLayout(\"ClientiLayout\")";
mostCurrent._activity.LoadLayout("ClientiLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="oIme.Initialize(\"Keyboard\")";
mostCurrent._oime.Initialize("Keyboard");
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="clientiactivity";
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="clientiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="If txCerca.Visible Then";
if (mostCurrent._txcerca.getVisible()) { 
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="AggiornaLista(Starter.db.CercaClientiPerNome(txC";
_aggiornalista(mostCurrent._starter._db._cercaclientipernome(null,mostCurrent._txcerca.getText()));
 }else {
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="AggiornaLista(Starter.db.GetClienti())";
_aggiornalista(mostCurrent._starter._db._getclienti(null));
 };
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="If lvClienti.Size == 0 Then";
if (mostCurrent._lvclienti.getSize()==0) { 
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="lvClienti.SingleLineLayout.ItemHeight = 90";
mostCurrent._lvclienti.getSingleLineLayout().setItemHeight((int) (90));
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="lvClienti.SingleLineLayout.Label.TextColor = Col";
mostCurrent._lvclienti.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="lvClienti.SingleLineLayout.Label.Typeface = Type";
mostCurrent._lvclienti.getSingleLineLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_BOLD_ITALIC));
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="lvClienti.AddSingleLine(\"Nessun cliente in lista";
mostCurrent._lvclienti.AddSingleLine(BA.ObjectToCharSequence("Nessun cliente in lista. Aggiornare i clienti."));
 };
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="End Sub";
return "";
}
public static String  _aggiornalista(anywheresoftware.b4a.objects.collections.List _clienti) throws Exception{
RDebugUtils.currentModule="clientiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "aggiornalista"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "aggiornalista", new Object[] {_clienti}));}
app.aegdistribuzione.cliente _c = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub AggiornaLista(clienti As List)";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="lvClienti.Clear";
mostCurrent._lvclienti.Clear();
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="lvClienti.TwoLinesAndBitmap.ItemHeight = 60dip";
mostCurrent._lvclienti.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="lvClienti.TwoLinesAndBitmap.Label.TextColor = Col";
mostCurrent._lvclienti.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="lvClienti.TwoLinesAndBitmap.Label.TextSize = 22";
mostCurrent._lvclienti.getTwoLinesAndBitmap().Label.setTextSize((float) (22));
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="lvClienti.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._lvclienti.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (16));
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="For Each c As Cliente In clienti";
{
final anywheresoftware.b4a.BA.IterableList group6 = _clienti;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_c = (app.aegdistribuzione.cliente)(group6.Get(index6));
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="lvClienti.AddTwoLinesAndBitmap2(c.Denominazione,";
mostCurrent._lvclienti.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_c._denominazione),BA.ObjectToCharSequence(_c._indirizzo),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"persona.png").getObject()),(Object)(_c));
 }
};
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="End Sub";
return "";
}
public static void  _btnaggiorna_click() throws Exception{
RDebugUtils.currentModule="clientiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaggiorna_click"))
	 {Debug.delegate(mostCurrent.activityBA, "btnaggiorna_click", null); return;}
ResumableSub_btnAggiorna_Click rsub = new ResumableSub_btnAggiorna_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnAggiorna_Click extends BA.ResumableSub {
public ResumableSub_btnAggiorna_Click(app.aegdistribuzione.clientiactivity parent) {
this.parent = parent;
}
app.aegdistribuzione.clientiactivity parent;
anywheresoftware.b4a.objects.collections.List _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientiactivity";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="ProgressDialogShow2(\"Aggiornamento in corso\", Fal";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Aggiornamento in corso"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Wait For (Starter.client.ScaricaClienti) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientiactivity", "btnaggiorna_click"), parent.mostCurrent._starter._client._scaricaclienti(null));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="If Starter.client.Successo Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._starter._client._getsuccesso(null)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="If Result.Size > 0 Then";
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
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Starter.db.SalvaClienti(Result)";
parent.mostCurrent._starter._db._salvaclienti(null,_result);
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="AggiornaLista(Starter.db.GetClienti())";
_aggiornalista(parent.mostCurrent._starter._db._getclienti(null));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="ProgressDialogHide()";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnannulla_click() throws Exception{
RDebugUtils.currentModule="clientiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnannulla_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnannulla_click", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub btnAnnulla_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="txCerca.Visible = False";
mostCurrent._txcerca.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="btnCerca.Visible = True";
mostCurrent._btncerca.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="btnAnnulla.Visible = False";
mostCurrent._btnannulla.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="txCerca.Text = \"\"";
mostCurrent._txcerca.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="oIme.HideKeyboard";
mostCurrent._oime.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Label1.Visible = True";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="AggiornaLista(Starter.db.GetClienti())";
_aggiornalista(mostCurrent._starter._db._getclienti(null));
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="End Sub";
return "";
}
public static String  _btncerca_click() throws Exception{
RDebugUtils.currentModule="clientiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncerca_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncerca_click", null));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub btnCerca_Click";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Label1.Visible = False";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="txCerca.Visible = True";
mostCurrent._txcerca.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="oIme.ShowKeyboard(txCerca)";
mostCurrent._oime.ShowKeyboard((android.view.View)(mostCurrent._txcerca.getObject()));
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="btnCerca.Visible = False";
mostCurrent._btncerca.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="btnAnnulla.Visible = True";
mostCurrent._btnannulla.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="End Sub";
return "";
}
public static String  _lvclienti_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="clientiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lvclienti_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lvclienti_itemclick", new Object[] {_position,_value}));}
app.aegdistribuzione.cliente _cli = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub lvClienti_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Dim cli As Cliente = Value";
_cli = (app.aegdistribuzione.cliente)(_value);
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="CallSubDelayed2(SchedaClienteActivity, \"Visualizz";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._schedaclienteactivity.getObject()),"VisualizzaScheda",(Object)(_cli));
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="End Sub";
return "";
}
public static String  _txcerca_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="clientiactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txcerca_textchanged"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txcerca_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub txCerca_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="AggiornaLista(Starter.db.CercaClientiPerNome(New)";
_aggiornalista(mostCurrent._starter._db._cercaclientipernome(null,_new));
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
}