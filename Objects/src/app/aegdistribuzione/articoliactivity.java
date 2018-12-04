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

public class articoliactivity extends Activity implements B4AActivity{
	public static articoliactivity mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "app.aegdistribuzione", "app.aegdistribuzione.articoliactivity");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (articoliactivity).");
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
		activityBA = new BA(this, layout, processBA, "app.aegdistribuzione", "app.aegdistribuzione.articoliactivity");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "app.aegdistribuzione.articoliactivity", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (articoliactivity) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (articoliactivity) Resume **");
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
		return articoliactivity.class;
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
        BA.LogInfo("** Activity (articoliactivity) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            articoliactivity mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (articoliactivity) Resume **");
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
public anywheresoftware.b4a.objects.ListViewWrapper _lvarticoli = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txcerca = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncerca = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnannulla = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.IME _oime = null;
public static boolean _forresult = false;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public app.aegdistribuzione.main _main = null;
public app.aegdistribuzione.ordineactivity _ordineactivity = null;
public app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Activity.LoadLayout(\"ArticoliLayout\")";
mostCurrent._activity.LoadLayout("ArticoliLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="forResult = False";
_forresult = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="oIme.Initialize(\"Keyboard\")";
mostCurrent._oime.Initialize("Keyboard");
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="articoliactivity";
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="AggiornaLista(Starter.db.GetArticoli())";
_aggiornalista(mostCurrent._starter._db._getarticoli(null));
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="If lvArticoli.Size == 0 Then";
if (mostCurrent._lvarticoli.getSize()==0) { 
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="lvArticoli.SingleLineLayout.ItemHeight = 90";
mostCurrent._lvarticoli.getSingleLineLayout().setItemHeight((int) (90));
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="lvArticoli.SingleLineLayout.Label.TextColor = Co";
mostCurrent._lvarticoli.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.DarkGray);
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="lvArticoli.SingleLineLayout.Label.Typeface = Typ";
mostCurrent._lvarticoli.getSingleLineLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_BOLD_ITALIC));
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="lvArticoli.AddSingleLine(\"Nessun articolo in lis";
mostCurrent._lvarticoli.AddSingleLine(BA.ObjectToCharSequence("Nessun articolo in lista. Aggiornare gli articoli."));
 };
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="End Sub";
return "";
}
public static String  _aggiornalista(anywheresoftware.b4a.objects.collections.List _articoli) throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "aggiornalista"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "aggiornalista", new Object[] {_articoli}));}
app.aegdistribuzione.articolo _a = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub AggiornaLista(articoli As List)";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="lvArticoli.Clear";
mostCurrent._lvarticoli.Clear();
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="lvArticoli.TwoLinesAndBitmap.ItemHeight = 60dip";
mostCurrent._lvarticoli.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="lvArticoli.TwoLinesAndBitmap.Label.TextColor = Co";
mostCurrent._lvarticoli.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="lvArticoli.TwoLinesAndBitmap.Label.TextSize = 22";
mostCurrent._lvarticoli.getTwoLinesAndBitmap().Label.setTextSize((float) (22));
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="lvArticoli.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._lvarticoli.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (16));
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="For Each a As Articolo In articoli";
{
final anywheresoftware.b4a.BA.IterableList group6 = _articoli;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_a = (app.aegdistribuzione.articolo)(group6.Get(index6));
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="lvArticoli.AddTwoLinesAndBitmap2(a.Descrizione,";
mostCurrent._lvarticoli.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_a._descrizione),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_a._prezzo,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+" €"),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"articolo.png").getObject()),(Object)(_a));
 }
};
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="End Sub";
return "";
}
public static void  _btnaggiorna_click() throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaggiorna_click"))
	 {Debug.delegate(mostCurrent.activityBA, "btnaggiorna_click", null); return;}
ResumableSub_btnAggiorna_Click rsub = new ResumableSub_btnAggiorna_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnAggiorna_Click extends BA.ResumableSub {
public ResumableSub_btnAggiorna_Click(app.aegdistribuzione.articoliactivity parent) {
this.parent = parent;
}
app.aegdistribuzione.articoliactivity parent;
anywheresoftware.b4a.objects.collections.List _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="articoliactivity";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="ProgressDialogShow2(\"Aggiornamento in corso\", Fal";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Aggiornamento in corso"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Wait For (Starter.client.ScaricaArticoli) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "articoliactivity", "btnaggiorna_click"), parent.mostCurrent._starter._client._scaricaarticoli(null));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="If Starter.client.Successo Then";
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
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="If Result.Size > 0 Then";
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
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="Starter.db.SalvaArticoli(Result)";
parent.mostCurrent._starter._db._salvaarticoli(null,_result);
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="AggiornaLista(Starter.db.GetArticoli())";
_aggiornalista(parent.mostCurrent._starter._db._getarticoli(null));
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
RDebugUtils.currentLine=5767177;
 //BA.debugLineNum = 5767177;BA.debugLine="ProgressDialogHide()";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnannulla_click() throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnannulla_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnannulla_click", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub btnAnnulla_Click";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="txCerca.Visible = False";
mostCurrent._txcerca.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="btnCerca.Visible = True";
mostCurrent._btncerca.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="btnAnnulla.Visible = False";
mostCurrent._btnannulla.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="txCerca.Text = \"\"";
mostCurrent._txcerca.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="oIme.HideKeyboard";
mostCurrent._oime.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="Label1.Visible = True";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="AggiornaLista(Starter.db.GetArticoli())";
_aggiornalista(mostCurrent._starter._db._getarticoli(null));
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="End Sub";
return "";
}
public static String  _btncerca_click() throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncerca_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncerca_click", null));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub btnCerca_Click";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Label1.Visible = False";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="txCerca.Visible = True";
mostCurrent._txcerca.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="oIme.ShowKeyboard(txCerca)";
mostCurrent._oime.ShowKeyboard((android.view.View)(mostCurrent._txcerca.getObject()));
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="btnCerca.Visible = False";
mostCurrent._btncerca.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="btnAnnulla.Visible = True";
mostCurrent._btnannulla.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="End Sub";
return "";
}
public static String  _lvarticoli_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lvarticoli_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lvarticoli_itemclick", new Object[] {_position,_value}));}
app.aegdistribuzione.articolo _art = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub lvArticoli_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim art As Articolo = Value";
_art = (app.aegdistribuzione.articolo)(_value);
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="oIme.HideKeyboard";
mostCurrent._oime.HideKeyboard(mostCurrent.activityBA);
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="If forResult Then";
if (_forresult) { 
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="forResult = False";
_forresult = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="CallSubDelayed2(OrdineActivity, \"GetResult\", art";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._ordineactivity.getObject()),"GetResult",(Object)(_art));
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Activity.Finish()";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="Msgbox(art.Descrizione, \"Articolo\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_art._descrizione),BA.ObjectToCharSequence("Articolo"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="End Sub";
return "";
}
public static String  _scegliarticoloperordine() throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "scegliarticoloperordine"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "scegliarticoloperordine", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub ScegliArticoloPerOrdine()";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="forResult = True";
_forresult = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="If lvArticoli.Size == 0 Then";
if (mostCurrent._lvarticoli.getSize()==0) { 
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="AggiornaLista(Starter.db.GetArticoli())";
_aggiornalista(mostCurrent._starter._db._getarticoli(null));
 };
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="End Sub";
return "";
}
public static String  _txcerca_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="articoliactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txcerca_textchanged"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txcerca_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub txCerca_TextChanged (Old As String, New As Str";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="AggiornaLista(Starter.db.CercaArticoliPerNome(New";
_aggiornalista(mostCurrent._starter._db._cercaarticolipernome(null,_new));
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
}