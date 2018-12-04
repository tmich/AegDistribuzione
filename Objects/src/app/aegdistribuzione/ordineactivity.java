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

public class ordineactivity extends Activity implements B4AActivity{
	public static ordineactivity mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "app.aegdistribuzione", "app.aegdistribuzione.ordineactivity");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ordineactivity).");
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
		activityBA = new BA(this, layout, processBA, "app.aegdistribuzione", "app.aegdistribuzione.ordineactivity");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "app.aegdistribuzione.ordineactivity", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ordineactivity) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ordineactivity) Resume **");
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
		return ordineactivity.class;
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
        BA.LogInfo("** Activity (ordineactivity) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            ordineactivity mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ordineactivity) Resume **");
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
public app.aegdistribuzione.ordine _m_ordine = null;
public app.aegdistribuzione.cliente _m_cliente = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _label1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcliente = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblindirizzo = null;
public app.aegdistribuzione.customlistview _clv2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _button1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblordine = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltotale = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btninvia = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public app.aegdistribuzione.main _main = null;
public app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Activity.LoadLayout(\"OrdineLayout\")";
mostCurrent._activity.LoadLayout("OrdineLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="ordineactivity";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _aggiorna() throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "aggiorna"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "aggiorna", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Aggiorna";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="m_ordine = Starter.db.GetOrdineInCorso(m_ordine.I";
mostCurrent._m_ordine = mostCurrent._starter._db._getordineincorso(null,mostCurrent._m_ordine._id);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="CaricaVoci";
_caricavoci();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="btnInvia.Enabled = (m_ordine.Voci.Size > 0)";
mostCurrent._btninvia.setEnabled((mostCurrent._m_ordine._voci.getSize()>0));
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="lblTotale.Text = NumberFormat2(m_ordine.Totale, 0";
mostCurrent._lbltotale.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._m_ordine._totale(null),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+" €"));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return "";
}
public static String  _caricavoci() throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "caricavoci"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "caricavoci", null));}
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub CaricaVoci()";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="clv2.Clear";
mostCurrent._clv2._clear(null);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="For Each v As VoceOrdine In m_ordine.Voci";
{
final anywheresoftware.b4a.BA.IterableList group2 = mostCurrent._m_ordine._voci;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (app.aegdistribuzione.voceordine)(group2.Get(index2));
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="clv2.Add(CreateListItem(v.DescArt, v.Qta, v.Prez";
mostCurrent._clv2._add(null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitem(_v._descart,_v._qta,_v._prezzo,mostCurrent._clv2._asview(null).getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100))).getObject())),(Object)(_v._id));
 }
};
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public static String  _btnaggiungi_click() throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaggiungi_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaggiungi_click", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub btnAggiungi_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="CallSubDelayed(ArticoliActivity, \"ScegliArticoloP";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._articoliactivity.getObject()),"ScegliArticoloPerOrdine");
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public static void  _btninvia_longclick() throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btninvia_longclick"))
	 {Debug.delegate(mostCurrent.activityBA, "btninvia_longclick", null); return;}
ResumableSub_btnInvia_LongClick rsub = new ResumableSub_btnInvia_LongClick(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnInvia_LongClick extends BA.ResumableSub {
public ResumableSub_btnInvia_LongClick(app.aegdistribuzione.ordineactivity parent) {
this.parent = parent;
}
app.aegdistribuzione.ordineactivity parent;
int _iresult = 0;
app.aegdistribuzione.ordine _result = null;
anywheresoftware.b4a.objects.collections.List _storico = null;
anywheresoftware.b4a.objects.collections.List _preferiti = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ordineactivity";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Msgbox2Async(\"Inviare l'ordine?\", \"Invio\", \"Invia";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Inviare l'ordine?"),BA.ObjectToCharSequence("Invio"),"Invia","Annulla","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Wait For MsgBox_Result (iResult As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ordineactivity", "btninvia_longclick"), null);
this.state = 25;
return;
case 25:
//C
this.state = 1;
_iresult = (Integer) result[0];
;
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="If iResult == DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 24;
if (_iresult==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="ProgressDialogShow2(\"Invio in corso\", False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Invio in corso"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Wait For (Starter.client.Invia(m_ordine)) Comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ordineactivity", "btninvia_longclick"), parent.mostCurrent._starter._client._invia(null,parent.mostCurrent._m_ordine));
this.state = 26;
return;
case 26:
//C
this.state = 4;
_result = (app.aegdistribuzione.ordine) result[0];
;
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="If Starter.client.Successo Then";
if (true) break;

case 4:
//if
this.state = 23;
if (parent.mostCurrent._starter._client._getsuccesso(null)) { 
this.state = 6;
}else {
this.state = 22;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="If Result <> Null Then";
if (true) break;

case 7:
//if
this.state = 20;
if (_result!= null) { 
this.state = 9;
}else {
this.state = 19;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Starter.db.SalvaOrdine(Result)";
parent.mostCurrent._starter._db._salvaordine(null,_result);
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Starter.db.EliminaOrdineInCorso(m_ordine.Id)";
parent.mostCurrent._starter._db._eliminaordineincorso(null,parent.mostCurrent._m_ordine._id);
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="wait for (Starter.client.StoricoOrdiniPerClien";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ordineactivity", "btninvia_longclick"), parent.mostCurrent._starter._client._storicoordinipercliente(null,parent.mostCurrent._m_cliente._id));
this.state = 27;
return;
case 27:
//C
this.state = 10;
_storico = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="If Starter.client.Successo Then";
if (true) break;

case 10:
//if
this.state = 13;
if (parent.mostCurrent._starter._client._getsuccesso(null)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="Starter.db.SalvaStoricoOrdiniPerCliente(Stori";
parent.mostCurrent._starter._db._salvastoricoordinipercliente(null,_storico,parent.mostCurrent._m_cliente._id);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="Wait For (Starter.client.ScaricaPreferitiPerCl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ordineactivity", "btninvia_longclick"), parent.mostCurrent._starter._client._scaricapreferitipercliente(null,parent.mostCurrent._m_cliente._id));
this.state = 28;
return;
case 28:
//C
this.state = 14;
_preferiti = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="If Starter.client.Successo Then";
if (true) break;

case 14:
//if
this.state = 17;
if (parent.mostCurrent._starter._client._getsuccesso(null)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="Starter.db.SalvaPreferitiPerCliente(Preferiti";
parent.mostCurrent._starter._db._salvapreferitipercliente(null,_preferiti,parent.mostCurrent._m_cliente._id);
 if (true) break;

case 17:
//C
this.state = 20;
;
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="ProgressDialogHide()";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="ToastMessageShow(\"Ordine inviato correttamente";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Ordine inviato correttamente"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="Msgbox(\"C'è stato un problema con l'invio dell";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("C'è stato un problema con l'invio dell'ordine: "+parent.mostCurrent._starter._client._geterrore(null)),BA.ObjectToCharSequence("Attenzione"),mostCurrent.activityBA);
 if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=1245213;
 //BA.debugLineNum = 1245213;BA.debugLine="Msgbox(\"C'è stato un problema con l'invio dell'";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("C'è stato un problema con l'invio dell'ordine: "+parent.mostCurrent._starter._client._geterrore(null)),BA.ObjectToCharSequence("Attenzione"),mostCurrent.activityBA);
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=1245216;
 //BA.debugLineNum = 1245216;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _button1_click() throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click"))
	 {Debug.delegate(mostCurrent.activityBA, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(app.aegdistribuzione.ordineactivity parent) {
this.parent = parent;
}
app.aegdistribuzione.ordineactivity parent;
int _index = 0;
int _id_voce = 0;
app.aegdistribuzione.voceordine _v = null;
int _iresult = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ordineactivity";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim index As Int = clv2.GetItemFromView(Sender)";
_index = parent.mostCurrent._clv2._getitemfromview(null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Dim id_voce As Int = clv2.GetValue(index)";
_id_voce = (int)(BA.ObjectToNumber(parent.mostCurrent._clv2._getvalue(null,_index)));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Dim v As VoceOrdine = Starter.db.GetVoce(id_voce)";
_v = parent.mostCurrent._starter._db._getvoce(null,_id_voce);
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Msgbox2Async(\"Eliminare \" & v.DescArt & \"?\", \"Eli";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Eliminare "+_v._descart+"?"),BA.ObjectToCharSequence("Elimina"),"Elimina","Annulla","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Wait For MsgBox_Result (iResult As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ordineactivity", "button1_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_iresult = (Integer) result[0];
;
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="If iResult == DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_iresult==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Starter.db.EliminaVoce(id_voce)";
parent.mostCurrent._starter._db._eliminavoce(null,_id_voce);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="m_ordine = Starter.db.GetOrdineInCorso(m_ordine.";
parent.mostCurrent._m_ordine = parent.mostCurrent._starter._db._getordineincorso(null,parent.mostCurrent._m_ordine._id);
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Aggiorna";
_aggiorna();
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _carica(app.aegdistribuzione.ordine _ord) throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "carica"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "carica", new Object[] {_ord}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Carica(ord As Ordine)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="m_ordine = ord";
mostCurrent._m_ordine = _ord;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="m_cliente = Starter.db.GetCliente(m_ordine.IdClie";
mostCurrent._m_cliente = mostCurrent._starter._db._getcliente(null,mostCurrent._m_ordine._idcliente);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="lblCliente.Text = m_cliente.Denominazione";
mostCurrent._lblcliente.setText(BA.ObjectToCharSequence(mostCurrent._m_cliente._denominazione));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="lblIndirizzo.Text = m_cliente.Indirizzo";
mostCurrent._lblindirizzo.setText(BA.ObjectToCharSequence(mostCurrent._m_cliente._indirizzo));
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="lblOrdine.Text = \"Ordine n° \" & m_ordine.Id";
mostCurrent._lblordine.setText(BA.ObjectToCharSequence("Ordine n° "+BA.NumberToString(mostCurrent._m_ordine._id)));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="lblTotale.Text = NumberFormat2(m_ordine.Totale, 0";
mostCurrent._lbltotale.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(mostCurrent._m_ordine._totale(null),(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+" €"));
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="CaricaVoci";
_caricavoci();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(String _text,int _qta,float _prezzo,int _width,int _height) throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistitem"))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistitem", new Object[] {_text,_qta,_prezzo,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _i = 0;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub CreateListItem(Text As String, Qta As Int, Pre";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="p.SetLayout(0, 0, Width, Height)";
_p.SetLayout((int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="p.LoadLayout(\"CellItem\")";
_p.LoadLayout("CellItem",mostCurrent.activityBA);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Label1.Text = Text";
mostCurrent._label1.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Label2.Text = NumberFormat2(Prezzo, 0, 2, 2, Fals";
mostCurrent._label2.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2(_prezzo,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)+" €"));
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="For i = 1 To 30";
{
final int step7 = 1;
final int limit7 = (int) (30);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Spinner1.Add(i)";
mostCurrent._spinner1.Add(BA.NumberToString(_i));
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="If i == Qta - 1 Then";
if (_i==_qta-1) { 
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Spinner1.SelectedIndex = i";
mostCurrent._spinner1.setSelectedIndex(_i);
 };
 }
};
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="End Sub";
return null;
}
public static String  _clv2_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv2_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clv2_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub clv2_ItemClick(Index As Int, Value As Object)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="clv2.AsView.BringToFront";
mostCurrent._clv2._asview(null).BringToFront();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Log(Index & \" = \" & Value)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_index)+" = "+BA.ObjectToString(_value));
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public static String  _getresult(app.aegdistribuzione.articolo _result) throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getresult"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getresult", new Object[] {_result}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub GetResult(Result As Articolo)";
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If m_ordine.Aggiungi(Result, 1, \"\") == False Then";
if (mostCurrent._m_ordine._aggiungi(null,_result,(int) (1),"")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="ToastMessageShow(\"Articolo già presente\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Articolo già presente"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Aggiorna";
_aggiorna();
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="End Sub";
return "";
}
public static String  _spinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="ordineactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinner1_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinner1_itemclick", new Object[] {_position,_value}));}
int _index = 0;
int _id_voce = 0;
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Spinner1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim index As Int = clv2.GetItemFromView(Sender)";
_index = mostCurrent._clv2._getitemfromview(null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim id_voce As Int = clv2.GetValue(index)";
_id_voce = (int)(BA.ObjectToNumber(mostCurrent._clv2._getvalue(null,_index)));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim v As VoceOrdine = Starter.db.GetVoce(id_voce)";
_v = mostCurrent._starter._db._getvoce(null,_id_voce);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="v.Qta = Value";
_v._qta = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Starter.db.AggiornaVoce(v)";
mostCurrent._starter._db._aggiornavoce(null,_v);
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Aggiorna";
_aggiorna();
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="End Sub";
return "";
}
}