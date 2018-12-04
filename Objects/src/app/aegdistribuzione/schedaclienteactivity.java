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

public class schedaclienteactivity extends Activity implements B4AActivity{
	public static schedaclienteactivity mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "app.aegdistribuzione", "app.aegdistribuzione.schedaclienteactivity");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (schedaclienteactivity).");
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
		activityBA = new BA(this, layout, processBA, "app.aegdistribuzione", "app.aegdistribuzione.schedaclienteactivity");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "app.aegdistribuzione.schedaclienteactivity", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (schedaclienteactivity) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (schedaclienteactivity) Resume **");
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
		return schedaclienteactivity.class;
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
        BA.LogInfo("** Activity (schedaclienteactivity) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            schedaclienteactivity mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (schedaclienteactivity) Resume **");
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
public app.aegdistribuzione.cliente _cli = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabhost1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview2 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview3 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public app.aegdistribuzione.main _main = null;
public app.aegdistribuzione.ordineactivity _ordineactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Activity.LoadLayout(\"SchedaClienteLayout\")";
mostCurrent._activity.LoadLayout("SchedaClienteLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="TabHost1.AddTab(\"Scheda\", \"ListaPreferitiLayout\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Scheda","ListaPreferitiLayout");
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="TabHost1.AddTab(\"Ordini in corso\", \"ordinincorsol";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Ordini in corso","ordinincorsolayout");
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="TabHost1.AddTab(\"Storico Ordini\", \"StoricoOrdiniL";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"Storico Ordini","StoricoOrdiniLayout");
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (0),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="CaricaPreferiti";
_caricapreferiti();
 break; }
case 1: {
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="CaricaOrdiniInCorso";
_caricaordiniincorso();
 break; }
case 2: {
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="CaricaStoricoOrdini";
_caricastoricoordini();
 break; }
default: {
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Log(\"Boh?\")";
anywheresoftware.b4a.keywords.Common.Log("Boh?");
 break; }
}
;
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="End Sub";
return "";
}
public static String  _caricapreferiti() throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "caricapreferiti"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "caricapreferiti", null));}
anywheresoftware.b4a.objects.collections.List _preferiti = null;
app.aegdistribuzione.preferito _p = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub CaricaPreferiti";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim preferiti As List = Starter.db.GetPreferitiCl";
_preferiti = new anywheresoftware.b4a.objects.collections.List();
_preferiti = mostCurrent._starter._db._getpreferiticliente(null,mostCurrent._cli._id);
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="ListView1.TwoLinesAndBitmap.ItemHeight = 60dip";
mostCurrent._listview1.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.TextColor = Col";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="ListView1.TwoLinesAndBitmap.Label.TextSize = 22";
mostCurrent._listview1.getTwoLinesAndBitmap().Label.setTextSize((float) (22));
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="ListView1.TwoLinesAndBitmap.SecondLabel.TextSize";
mostCurrent._listview1.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (16));
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="For Each p As Preferito In preferiti";
{
final anywheresoftware.b4a.BA.IterableList group7 = _preferiti;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_p = (app.aegdistribuzione.preferito)(group7.Get(index7));
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="ListView1.AddTwoLinesAndBitmap2(p.Descrizione, p";
mostCurrent._listview1.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_p._descrizione),BA.ObjectToCharSequence(BA.NumberToString(_p._occorrenze)+" volt"+_singplur(_p._occorrenze)),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"stella.png").getObject()),(Object)(_p));
 }
};
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="End Sub";
return "";
}
public static String  _caricaordiniincorso() throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "caricaordiniincorso"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "caricaordiniincorso", null));}
anywheresoftware.b4a.objects.collections.List _ordini = null;
app.aegdistribuzione.ordine _o = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Private Sub CaricaOrdiniInCorso";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim ordini As List = Starter.db.OrdiniInCorsoPerC";
_ordini = new anywheresoftware.b4a.objects.collections.List();
_ordini = mostCurrent._starter._db._ordiniincorsopercliente(null,mostCurrent._cli._id);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="ListView3.Clear";
mostCurrent._listview3.Clear();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="ListView3.SingleLineLayout.Label.Gravity = Gravit";
mostCurrent._listview3.getSingleLineLayout().Label.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.TOP);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="ListView3.SingleLineLayout.ItemHeight = 60";
mostCurrent._listview3.getSingleLineLayout().setItemHeight((int) (60));
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="ListView3.SingleLineLayout.Label.TextColor = Colo";
mostCurrent._listview3.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="ListView3.SingleLineLayout.Label.TextSize = 22";
mostCurrent._listview3.getSingleLineLayout().Label.setTextSize((float) (22));
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="For Each o As Ordine In ordini";
{
final anywheresoftware.b4a.BA.IterableList group7 = _ordini;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_o = (app.aegdistribuzione.ordine)(group7.Get(index7));
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="ListView3.AddSingleLine2(\"Ordine n. \" & o.Id, o)";
mostCurrent._listview3.AddSingleLine2(BA.ObjectToCharSequence("Ordine n. "+BA.NumberToString(_o._id)),(Object)(_o));
 }
};
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="End Sub";
return "";
}
public static String  _caricastoricoordini() throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "caricastoricoordini"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "caricastoricoordini", null));}
anywheresoftware.b4a.objects.collections.List _ordini = null;
app.aegdistribuzione.ordine _o = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Private Sub CaricaStoricoOrdini";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim ordini As List = Starter.db.OrdiniPerCliente(";
_ordini = new anywheresoftware.b4a.objects.collections.List();
_ordini = mostCurrent._starter._db._ordinipercliente(null,mostCurrent._cli._id);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="ListView2.Clear";
mostCurrent._listview2.Clear();
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="ListView2.SingleLineLayout.Label.Gravity = Gravit";
mostCurrent._listview2.getSingleLineLayout().Label.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.TOP);
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="ListView2.SingleLineLayout.ItemHeight = 60";
mostCurrent._listview2.getSingleLineLayout().setItemHeight((int) (60));
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor = Colo";
mostCurrent._listview2.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize = 22";
mostCurrent._listview2.getSingleLineLayout().Label.setTextSize((float) (22));
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="For Each o As Ordine In ordini";
{
final anywheresoftware.b4a.BA.IterableList group7 = _ordini;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_o = (app.aegdistribuzione.ordine)(group7.Get(index7));
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="ListView2.AddSingleLine2(\"Ordine del \" & o.DataF";
mostCurrent._listview2.AddSingleLine2(BA.ObjectToCharSequence("Ordine del "+_o._getdataformattata(null)),(Object)(_o));
 }
};
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="End Sub";
return "";
}
public static String  _btnnuovo_click() throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnuovo_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnuovo_click", null));}
app.aegdistribuzione.ordine _o = null;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub BtnNuovo_Click";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim o As Ordine = Starter.db.NuovoOrdine(cli)";
_o = mostCurrent._starter._db._nuovoordine(null,mostCurrent._cli);
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="CallSubDelayed2(OrdineActivity, \"Carica\", o)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._ordineactivity.getObject()),"Carica",(Object)(_o));
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return "";
}
public static String  _singplur(int _v) throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "singplur"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "singplur", new Object[] {_v}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub SingPlur(v As Int) As String";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="If v == 1 Then";
if (_v==1) { 
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Return \"a\"";
if (true) return "a";
 }else {
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Return \"e\"";
if (true) return "e";
 };
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="End Sub";
return "";
}
public static String  _listview2_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview2_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview2_itemclick", new Object[] {_position,_value}));}
app.aegdistribuzione.ordine _o = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub ListView2_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim o As Ordine = Value";
_o = (app.aegdistribuzione.ordine)(_value);
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="CallSubDelayed2(DettaglioOrdineActivity, \"Aggiorn";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._dettaglioordineactivity.getObject()),"AggiornaLista",(Object)(_o));
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="End Sub";
return "";
}
public static String  _listview3_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview3_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listview3_itemclick", new Object[] {_position,_value}));}
app.aegdistribuzione.ordine _o = null;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub ListView3_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim o As Ordine = Value";
_o = (app.aegdistribuzione.ordine)(_value);
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="CallSubDelayed2(OrdineActivity, \"Carica\", o)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._ordineactivity.getObject()),"Carica",(Object)(_o));
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="End Sub";
return "";
}
public static String  _tabhost1_tabchanged() throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tabhost1_tabchanged"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tabhost1_tabchanged", null));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub TabHost1_TabChanged";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Select TabHost1.CurrentTab";
switch (BA.switchObjectToInt(mostCurrent._tabhost1.getCurrentTab(),(int) (0),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="CaricaPreferiti";
_caricapreferiti();
 break; }
case 1: {
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="CaricaOrdiniInCorso";
_caricaordiniincorso();
 break; }
case 2: {
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="CaricaStoricoOrdini";
_caricastoricoordini();
 break; }
default: {
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="Log(\"Boh?\")";
anywheresoftware.b4a.keywords.Common.Log("Boh?");
 break; }
}
;
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="End Sub";
return "";
}
public static String  _visualizzascheda(app.aegdistribuzione.cliente _c) throws Exception{
RDebugUtils.currentModule="schedaclienteactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "visualizzascheda"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "visualizzascheda", new Object[] {_c}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub VisualizzaScheda(c As Cliente)";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="cli = c";
mostCurrent._cli = _c;
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Activity.Title = cli.Denominazione & \" \" & cli.In";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence(mostCurrent._cli._denominazione+" "+mostCurrent._cli._indirizzo));
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="CaricaPreferiti";
_caricapreferiti();
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="End Sub";
return "";
}
}