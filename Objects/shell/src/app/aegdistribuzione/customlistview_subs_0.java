package app.aegdistribuzione;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class customlistview_subs_0 {


public static RemoteObject  _add(RemoteObject __ref,RemoteObject _pnl,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Add (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("add")) { return __ref.runUserSub(false, "customlistview","add", __ref, _pnl, _value);}
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 331;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
Debug.ShouldStop(2048);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_insertat",(Object)(__ref.getField(false,"_items").runMethod(true,"getSize")),(Object)(_pnl),(Object)(_value));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtextitem(RemoteObject __ref,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddTextItem (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("addtextitem")) { return __ref.runUserSub(false, "customlistview","addtextitem", __ref, _text, _value);}
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 139;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
Debug.ShouldStop(2048);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_insertattextitem",(Object)(__ref.getField(false,"_items").runMethod(true,"getSize")),(Object)(_text),(Object)(_value));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "customlistview","asview", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub AsView As B4XView";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Return mBase";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "customlistview","base_resize", __ref, _width, _height);}
RemoteObject _scrollbar = RemoteObject.createImmutable(0);
RemoteObject _it = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 60;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sv").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 62;BA.debugLine="Dim scrollbar As Int";
Debug.ShouldStop(536870912);
_scrollbar = RemoteObject.createImmutable(0);Debug.locals.put("scrollbar", _scrollbar);
 BA.debugLineNum = 63;BA.debugLine="If xui.IsB4J Then scrollbar = 20";
Debug.ShouldStop(1073741824);
if (__ref.getField(false,"_xui").runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
_scrollbar = BA.numberCast(int.class, 20);Debug.locals.put("scrollbar", _scrollbar);};
 BA.debugLineNum = 64;BA.debugLine="If horizontal Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 65;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
Debug.ShouldStop(1);
__ref.getField(false,"_sv").runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,_scrollbar}, "-",1, 0)));
 BA.debugLineNum = 66;BA.debugLine="For Each it As CLVItem In items";
Debug.ShouldStop(2);
{
final RemoteObject group6 = __ref.getField(false,"_items");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (group6.runMethod(false,"Get",index6));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 67;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
Debug.ShouldStop(4);
_it.getField(false,"Panel").runMethod(true,"setHeight",__ref.getField(false,"_sv").runMethod(true,"getScrollViewContentHeight"));
 BA.debugLineNum = 68;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
Debug.ShouldStop(8);
_it.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setHeight",_it.getField(false,"Panel").runMethod(true,"getHeight"));
 }
}Debug.locals.put("it", _it);
;
 }else {
 BA.debugLineNum = 71;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
Debug.ShouldStop(64);
__ref.getField(false,"_sv").runMethod(true,"setScrollViewContentWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,_scrollbar}, "-",1, 0)));
 BA.debugLineNum = 72;BA.debugLine="For Each it As CLVItem In items";
Debug.ShouldStop(128);
{
final RemoteObject group12 = __ref.getField(false,"_items");
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (group12.runMethod(false,"Get",index12));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 73;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
Debug.ShouldStop(256);
_it.getField(false,"Panel").runMethod(true,"setWidth",__ref.getField(false,"_sv").runMethod(true,"getScrollViewContentWidth"));
 BA.debugLineNum = 74;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
Debug.ShouldStop(512);
_it.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setWidth",_it.getField(false,"Panel").runMethod(true,"getWidth"));
 BA.debugLineNum = 75;BA.debugLine="If it.TextItem Then";
Debug.ShouldStop(1024);
if (_it.getField(true,"TextItem").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
Debug.ShouldStop(2048);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = _it.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 77;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
Debug.ShouldStop(4096);
_lbl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(_lbl.runMethod(true,"getLeft")),(Object)(_lbl.runMethod(true,"getTop")),(Object)(RemoteObject.solve(new RemoteObject[] {_it.getField(false,"Panel").runMethod(true,"getWidth"),_lbl.runMethod(true,"getLeft")}, "-",1, 1)),(Object)(_lbl.runMethod(true,"getHeight")));
 };
 }
}Debug.locals.put("it", _it);
;
 };
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private mBase As B4XView";
customlistview._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",customlistview._mbase);
 //BA.debugLineNum = 11;BA.debugLine="Public sv As B4XView";
customlistview._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_sv",customlistview._sv);
 //BA.debugLineNum = 12;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
 //BA.debugLineNum = 13;BA.debugLine="Private items As List";
customlistview._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_items",customlistview._items);
 //BA.debugLineNum = 14;BA.debugLine="Private DividerSize As Float";
customlistview._dividersize = RemoteObject.createImmutable(0f);__ref.setField("_dividersize",customlistview._dividersize);
 //BA.debugLineNum = 15;BA.debugLine="Private EventName As String";
customlistview._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",customlistview._eventname);
 //BA.debugLineNum = 16;BA.debugLine="Private CallBack As Object";
customlistview._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",customlistview._callback);
 //BA.debugLineNum = 17;BA.debugLine="Public DefaultTextColor As Int";
customlistview._defaulttextcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextcolor",customlistview._defaulttextcolor);
 //BA.debugLineNum = 18;BA.debugLine="Public DefaultTextBackgroundColor As Int";
customlistview._defaulttextbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextbackgroundcolor",customlistview._defaulttextbackgroundcolor);
 //BA.debugLineNum = 19;BA.debugLine="Public AnimationDuration As Int = 300";
customlistview._animationduration = BA.numberCast(int.class, 300);__ref.setField("_animationduration",customlistview._animationduration);
 //BA.debugLineNum = 20;BA.debugLine="Private LastReachEndEvent As Long";
customlistview._lastreachendevent = RemoteObject.createImmutable(0L);__ref.setField("_lastreachendevent",customlistview._lastreachendevent);
 //BA.debugLineNum = 21;BA.debugLine="Private PressedColor As Int";
customlistview._pressedcolor = RemoteObject.createImmutable(0);__ref.setField("_pressedcolor",customlistview._pressedcolor);
 //BA.debugLineNum = 22;BA.debugLine="Private xui As XUI";
customlistview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",customlistview._xui);
 //BA.debugLineNum = 23;BA.debugLine="Private LastAnimatedAction As Int";
customlistview._lastanimatedaction = RemoteObject.createImmutable(0);__ref.setField("_lastanimatedaction",customlistview._lastanimatedaction);
 //BA.debugLineNum = 24;BA.debugLine="Private DesignerLabel As Label";
customlistview._designerlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_designerlabel",customlistview._designerlabel);
 //BA.debugLineNum = 25;BA.debugLine="Private horizontal As Boolean";
customlistview._horizontal = RemoteObject.createImmutable(false);__ref.setField("_horizontal",customlistview._horizontal);
 //BA.debugLineNum = 29;BA.debugLine="Private su As StringUtils";
customlistview._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_su",customlistview._su);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cleanafteranimation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CleanAfterAnimation (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("cleanafteranimation")) { __ref.runUserSub(false, "customlistview","cleanafteranimation", __ref); return;}
ResumableSub_CleanAfterAnimation rsub = new ResumableSub_CleanAfterAnimation(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CleanAfterAnimation extends BA.ResumableSub {
public ResumableSub_CleanAfterAnimation(app.aegdistribuzione.customlistview parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.customlistview parent;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
RemoteObject group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CleanAfterAnimation (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,296);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 297;BA.debugLine="LastAnimatedAction = LastAnimatedAction + 1";
Debug.ShouldStop(256);
__ref.setField ("_lastanimatedaction",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastanimatedaction"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 298;BA.debugLine="Dim MyIndex As Int = LastAnimatedAction";
Debug.ShouldStop(512);
_myindex = __ref.getField(true,"_lastanimatedaction");Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 299;BA.debugLine="Sleep(AnimationDuration + 50)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_animationduration"),RemoteObject.createImmutable(50)}, "+",1, 1));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 300;BA.debugLine="If MyIndex <> LastAnimatedAction Then Return";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_lastanimatedaction")))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
Debug.CheckDeviceExceptions();if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 301;BA.debugLine="Dim Offset As Int = DividerSize";
Debug.ShouldStop(4096);
_offset = BA.numberCast(int.class, __ref.getField(true,"_dividersize"));Debug.locals.put("Offset", _offset);Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 302;BA.debugLine="For Each item As CLVItem In items";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//for
this.state = 10;
group6 = __ref.getField(false,"_items");
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("item", _item);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 10;
if (index6 < groupLen6) {
this.state = 9;
_item = (group6.runMethod(false,"Get",index6));Debug.locals.put("item", _item);}
if (true) break;

case 13:
//C
this.state = 12;
index6++;
Debug.locals.put("item", _item);
if (true) break;

case 9:
//C
this.state = 13;
 BA.debugLineNum = 303;BA.debugLine="SetPanelOffset(item.Panel, Offset)";
Debug.ShouldStop(16384);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_setpaneloffset",(Object)(_item.getField(false,"Panel")),(Object)(BA.numberCast(float.class, _offset)));
 BA.debugLineNum = 304;BA.debugLine="Offset = Offset + item.Size + DividerSize";
Debug.ShouldStop(32768);
_offset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_offset,_item.getField(true,"Size"),__ref.getField(true,"_dividersize")}, "++",2, 0));Debug.locals.put("Offset", _offset);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
Debug.locals.put("item", _item);
;
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "customlistview","clear", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="items.Clear";
Debug.ShouldStop(16777216);
__ref.getField(false,"_items").runVoidMethod ("Clear");
 BA.debugLineNum = 90;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 91;BA.debugLine="SetScrollViewContentSize(0)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_setscrollviewcontentsize",(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "customlistview","createlabel", __ref, _txt);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 448;BA.debugLine="Private Sub CreateLabel(txt As String) As B4XView";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 449;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(1);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 450;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(2);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 451;BA.debugLine="lbl.Gravity = DesignerLabel.Gravity";
Debug.ShouldStop(4);
_lbl.runMethod(true,"setGravity",__ref.getField(false,"_designerlabel").runMethod(true,"getGravity"));
 BA.debugLineNum = 452;BA.debugLine="lbl.TextSize = DesignerLabel.TextSize";
Debug.ShouldStop(8);
_lbl.runMethod(true,"setTextSize",__ref.getField(false,"_designerlabel").runMethod(true,"getTextSize"));
 BA.debugLineNum = 453;BA.debugLine="lbl.SingleLine = False";
Debug.ShouldStop(16);
_lbl.runVoidMethod ("setSingleLine",customlistview.__c.getField(true,"False"));
 BA.debugLineNum = 454;BA.debugLine="lbl.Text = txt";
Debug.ShouldStop(32);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_txt));
 BA.debugLineNum = 455;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
Debug.ShouldStop(64);
_lbl.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(true,"getScrollViewContentWidth"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1));
 BA.debugLineNum = 456;BA.debugLine="lbl.Height = su.MeasureMultilineTextHeight(lbl, t";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setHeight",__ref.getField(false,"_su").runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_txt))));
 BA.debugLineNum = 457;BA.debugLine="Return lbl";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanel(RemoteObject __ref,RemoteObject _paneleventname) throws Exception{
try {
		Debug.PushSubsStack("CreatePanel (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("createpanel")) { return __ref.runUserSub(false, "customlistview","createpanel", __ref, _paneleventname);}
Debug.locals.put("PanelEventName", _paneleventname);
 BA.debugLineNum = 419;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 420;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_xui").runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(_paneleventname));
 BA.debugLineNum = 421;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createscrollview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateScrollView (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,428);
if (RapidSub.canDelegate("createscrollview")) { return __ref.runUserSub(false, "customlistview","createscrollview", __ref);}
RemoteObject _hv = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
RemoteObject _nsv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
 BA.debugLineNum = 428;BA.debugLine="Private Sub CreateScrollView As B4XView";
Debug.ShouldStop(2048);
 BA.debugLineNum = 429;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 430;BA.debugLine="Dim hv As HorizontalScrollView";
Debug.ShouldStop(8192);
_hv = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");Debug.locals.put("hv", _hv);
 BA.debugLineNum = 431;BA.debugLine="hv.Initialize(0, \"sv\")";
Debug.ShouldStop(16384);
_hv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 432;BA.debugLine="Return hv";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _hv.getObject());
 }else {
 BA.debugLineNum = 434;BA.debugLine="Dim nsv As ScrollView";
Debug.ShouldStop(131072);
_nsv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 435;BA.debugLine="nsv.Initialize2(0, \"sv\")";
Debug.ShouldStop(262144);
_nsv.runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 436;BA.debugLine="Return nsv";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _nsv.getObject());
 };
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "customlistview","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _o = RemoteObject.createImmutable("");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 44;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="mBase = Base";
Debug.ShouldStop(4096);
__ref.getField(false,"_mbase").setObject (_base);
 BA.debugLineNum = 46;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
Debug.ShouldStop(8192);
_o = BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ListOrientation"))),(Object)((RemoteObject.createImmutable("Vertical")))));Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 47;BA.debugLine="horizontal = o = \"Horizontal\"";
Debug.ShouldStop(16384);
__ref.setField ("_horizontal",BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_o,BA.ObjectToString("Horizontal"))));
 BA.debugLineNum = 48;BA.debugLine="sv = CreateScrollView";
Debug.ShouldStop(32768);
__ref.setField ("_sv",__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_createscrollview"));
 BA.debugLineNum = 49;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 BA.debugLineNum = 50;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui").runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DividerColor")))))));
 BA.debugLineNum = 51;BA.debugLine="DividerSize = DipToCurrent(Props.Get(\"DividerHeig";
Debug.ShouldStop(262144);
__ref.setField ("_dividersize",BA.numberCast(float.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DividerHeight")))))))));
 BA.debugLineNum = 52;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
Debug.ShouldStop(524288);
__ref.setField ("_pressedcolor",__ref.getField(false,"_xui").runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PressedColor")))))));
 BA.debugLineNum = 53;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
Debug.ShouldStop(1048576);
__ref.setField ("_animationduration",BA.numberCast(int.class, _props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("InsertAnimationDuration"))),(Object)((__ref.getField(true,"_animationduration"))))));
 BA.debugLineNum = 54;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
Debug.ShouldStop(2097152);
__ref.setField ("_defaulttextcolor",__ref.getField(false,"_xui").runMethod(true,"PaintOrColorToColor",(Object)((_lbl.runMethod(true,"getTextColor")))));
 BA.debugLineNum = 55;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
Debug.ShouldStop(4194304);
__ref.setField ("_defaulttextbackgroundcolor",__ref.getField(false,"_mbase").runMethod(true,"getColor"));
 BA.debugLineNum = 56;BA.debugLine="DesignerLabel = Lbl";
Debug.ShouldStop(8388608);
__ref.setField ("_designerlabel",_lbl);
 BA.debugLineNum = 57;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_base_resize",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase").runMethod(true,"getHeight"))));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finditemoffset(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("FindItemOffset (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("finditemoffset")) { return __ref.runUserSub(false, "customlistview","finditemoffset", __ref, _index);}
RemoteObject _offset = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 356;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="Dim Offset As Int";
Debug.ShouldStop(16);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 358;BA.debugLine="For i = 0 To Min(Index - 1, items.Size - 1)";
Debug.ShouldStop(32);
{
final int step2 = 1;
final int limit2 = (int) (0 + customlistview.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))).<Double>get().doubleValue());
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 359;BA.debugLine="Offset = Offset + GetItem(i).Size + DividerSize";
Debug.ShouldStop(64);
_offset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_offset,__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitem",(Object)(BA.numberCast(int.class, _i))).getField(true,"Size"),__ref.getField(true,"_dividersize")}, "++",2, 0));Debug.locals.put("Offset", _offset);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 361;BA.debugLine="Return Offset";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return _offset;
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "customlistview","getbase", __ref);}
 BA.debugLineNum = 94;BA.debugLine="Public Sub GetBase As B4XView";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="Return mBase";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirstvisibleindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFirstVisibleIndex (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,366);
if (RapidSub.canDelegate("getfirstvisibleindex")) { return __ref.runUserSub(false, "customlistview","getfirstvisibleindex", __ref);}
RemoteObject _bottom = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 366;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="Dim bottom As Int";
Debug.ShouldStop(16384);
_bottom = RemoteObject.createImmutable(0);Debug.locals.put("bottom", _bottom);
 BA.debugLineNum = 368;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(32768);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 369;BA.debugLine="bottom = bottom +  GetItem(i).Size + DividerSize";
Debug.ShouldStop(65536);
_bottom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bottom,__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitem",(Object)(BA.numberCast(int.class, _i))).getField(true,"Size"),__ref.getField(true,"_dividersize")}, "++",2, 0));Debug.locals.put("bottom", _bottom);
 BA.debugLineNum = 370;BA.debugLine="If bottom > GetScrollViewOffset Then Return i";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_bottom,BA.numberCast(double.class, __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewoffset")))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, _i);};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 372;BA.debugLine="Return items.Size - 1";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetItem (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("getitem")) { return __ref.runUserSub(false, "customlistview","getitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 103;BA.debugLine="Private Sub GetItem(Index As Int) As CLVItem";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Return items.Get(Index)";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return (__ref.getField(false,"_items").runMethod(false,"Get",(Object)(_index)));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitemfromview(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromView (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,397);
if (RapidSub.canDelegate("getitemfromview")) { return __ref.runUserSub(false, "customlistview","getitemfromview", __ref, _v);}
RemoteObject _parent = RemoteObject.declareNull("Object");
RemoteObject _current = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("v", _v);
 BA.debugLineNum = 397;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="Dim parent = v As Object, current As B4XView";
Debug.ShouldStop(8192);
_parent = (_v.getObject());Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
_current = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("current", _current);
 BA.debugLineNum = 399;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
Debug.ShouldStop(16384);
while (RemoteObject.solveBoolean("!",__ref.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel"),_parent)) {
 BA.debugLineNum = 400;BA.debugLine="current = parent";
Debug.ShouldStop(32768);
_current.setObject(_parent);
 BA.debugLineNum = 401;BA.debugLine="parent = current.Parent";
Debug.ShouldStop(65536);
_parent = (_current.runMethod(false,"getParent").getObject());Debug.locals.put("parent", _parent);
 }
;
 BA.debugLineNum = 403;BA.debugLine="v = current";
Debug.ShouldStop(262144);
_v = _current;Debug.locals.put("v", _v);
 BA.debugLineNum = 404;BA.debugLine="Return v.Tag";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, _v.runMethod(false,"getTag"));
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastvisibleindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLastVisibleIndex (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,376);
if (RapidSub.canDelegate("getlastvisibleindex")) { return __ref.runUserSub(false, "customlistview","getlastvisibleindex", __ref);}
RemoteObject _first = RemoteObject.createImmutable(0);
RemoteObject _bottom = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 376;BA.debugLine="Public Sub getLastVisibleIndex As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 377;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
Debug.ShouldStop(16777216);
_first = __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getfirstvisibleindex");Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 378;BA.debugLine="Dim bottom As Int";
Debug.ShouldStop(33554432);
_bottom = RemoteObject.createImmutable(0);Debug.locals.put("bottom", _bottom);
 BA.debugLineNum = 379;BA.debugLine="For i = 0 To items.Size - 1";
Debug.ShouldStop(67108864);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 380;BA.debugLine="bottom = bottom +  GetItem(i).Size + DividerSize";
Debug.ShouldStop(134217728);
_bottom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bottom,__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitem",(Object)(BA.numberCast(int.class, _i))).getField(true,"Size"),__ref.getField(true,"_dividersize")}, "++",2, 0));Debug.locals.put("bottom", _bottom);
 BA.debugLineNum = 381;BA.debugLine="If i >= first And bottom >= GetScrollViewOffset";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("g",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _first)) && RemoteObject.solveBoolean("g",_bottom,RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewoffset"),__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewvisiblesize")}, "+",1, 0))) { 
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, customlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _first))));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 383;BA.debugLine="Return items.Size - 1";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "customlistview","getpanel", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 108;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Return GetItem(Index).Panel.GetView(0)";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitem",(Object)(_index)).getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpaneloffset(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("GetPanelOffset (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("getpaneloffset")) { return __ref.runUserSub(false, "customlistview","getpaneloffset", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 288;BA.debugLine="Private Sub GetPanelOffset (p As B4XView) As Float";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 290;BA.debugLine="Return p.Left";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(float.class, _p.runMethod(true,"getLeft"));
 }else {
 BA.debugLineNum = 292;BA.debugLine="Return p.Top";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(float.class, _p.runMethod(true,"getTop"));
 };
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewcontentsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewContentSize (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("getscrollviewcontentsize")) { return __ref.runUserSub(false, "customlistview","getscrollviewcontentsize", __ref);}
 BA.debugLineNum = 264;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="If horizontal Then";
Debug.ShouldStop(256);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 266;BA.debugLine="Return sv.ScrollViewContentWidth";
Debug.ShouldStop(512);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv").runMethod(true,"getScrollViewContentWidth"));
 }else {
 BA.debugLineNum = 268;BA.debugLine="Return sv.ScrollViewContentHeight";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv").runMethod(true,"getScrollViewContentHeight"));
 };
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewoffset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewOffset (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("getscrollviewoffset")) { return __ref.runUserSub(false, "customlistview","getscrollviewoffset", __ref);}
 BA.debugLineNum = 248;BA.debugLine="Private Sub GetScrollViewOffset As Float";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 250;BA.debugLine="Return sv.ScrollViewOffsetX";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv").runMethod(true,"getScrollViewOffsetX"));
 }else {
 BA.debugLineNum = 252;BA.debugLine="Return sv.ScrollViewOffsetY";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"));
 };
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewvisiblesize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewVisibleSize (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("getscrollviewvisiblesize")) { return __ref.runUserSub(false, "customlistview","getscrollviewvisiblesize", __ref);}
 BA.debugLineNum = 240;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="If horizontal Then";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 242;BA.debugLine="Return sv.Width";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv").runMethod(true,"getWidth"));
 }else {
 BA.debugLineNum = 244;BA.debugLine="Return sv.Height";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv").runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "customlistview","getsize", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Public Sub getSize As Int";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Return items.Size";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_items").runMethod(true,"getSize");
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetValue (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "customlistview","getvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 113;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Return GetItem(Index).Value";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitem",(Object)(_index)).getField(false,"Value");
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "customlistview","initialize", __ref, _ba, _vcallback, _veventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallBack", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(8);
__ref.setField ("_eventname",_veventname);
 BA.debugLineNum = 37;BA.debugLine="CallBack = vCallBack";
Debug.ShouldStop(16);
__ref.setField ("_callback",_vcallback);
 BA.debugLineNum = 39;BA.debugLine="items.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_items").runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
Debug.ShouldStop(128);
__ref.setField ("_defaulttextbackgroundcolor",__ref.getField(false,"_xui").getField(true,"Color_White"));
 BA.debugLineNum = 41;BA.debugLine="DefaultTextColor = xui.Color_Black";
Debug.ShouldStop(256);
__ref.setField ("_defaulttextcolor",__ref.getField(false,"_xui").getField(true,"Color_Black"));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAt (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("insertat")) { return __ref.runUserSub(false, "customlistview","insertat", __ref, _index, _pnl, _value);}
RemoteObject _size = RemoteObject.createImmutable(0f);
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 162;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="Dim size As Float";
Debug.ShouldStop(4);
_size = RemoteObject.createImmutable(0f);Debug.locals.put("size", _size);
 BA.debugLineNum = 164;BA.debugLine="If horizontal Then";
Debug.ShouldStop(8);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 165;BA.debugLine="size = pnl.Width";
Debug.ShouldStop(16);
_size = BA.numberCast(float.class, _pnl.runMethod(true,"getWidth"));Debug.locals.put("size", _size);
 }else {
 BA.debugLineNum = 167;BA.debugLine="size = pnl.Height";
Debug.ShouldStop(64);
_size = BA.numberCast(float.class, _pnl.runMethod(true,"getHeight"));Debug.locals.put("size", _size);
 };
 BA.debugLineNum = 169;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
Debug.ShouldStop(256);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_insertatimpl",(Object)(_index),(Object)(_pnl),(Object)(BA.numberCast(int.class, _size)),(Object)(_value),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertatimpl(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemsize,RemoteObject _value,RemoteObject _initialsize) throws Exception{
try {
		Debug.PushSubsStack("InsertAtImpl (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("insertatimpl")) { return __ref.runUserSub(false, "customlistview","insertatimpl", __ref, _index, _pnl, _itemsize, _value, _initialsize);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _includedividierheight = RemoteObject.createImmutable(0);
RemoteObject _newitem = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _previtem = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
int _i = 0;
RemoteObject _it = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
RemoteObject _newoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemSize", _itemsize);
Debug.locals.put("Value", _value);
Debug.locals.put("InitialSize", _initialsize);
 BA.debugLineNum = 173;BA.debugLine="Private Sub InsertAtImpl(Index As Int, Pnl As B4XV";
Debug.ShouldStop(4096);
 BA.debugLineNum = 175;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_createpanel",(Object)(RemoteObject.createImmutable("Panel")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 176;BA.debugLine="p.Color = Pnl.Color";
Debug.ShouldStop(32768);
_p.runMethod(true,"setColor",_pnl.runMethod(true,"getColor"));
 BA.debugLineNum = 177;BA.debugLine="Pnl.Color = xui.Color_Transparent";
Debug.ShouldStop(65536);
_pnl.runMethod(true,"setColor",__ref.getField(false,"_xui").getField(true,"Color_Transparent"));
 BA.debugLineNum = 178;BA.debugLine="If horizontal Then";
Debug.ShouldStop(131072);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
Debug.ShouldStop(262144);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(__ref.getField(false,"_sv").runMethod(true,"getScrollViewContentHeight")));
 }else {
 BA.debugLineNum = 181;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
Debug.ShouldStop(1048576);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_sv").runMethod(true,"getScrollViewContentWidth")),(Object)(_itemsize));
 };
 BA.debugLineNum = 183;BA.debugLine="p.Tag = Index";
Debug.ShouldStop(4194304);
_p.runMethod(false,"setTag",(_index));
 BA.debugLineNum = 184;BA.debugLine="Dim IncludeDividierHeight As Int";
Debug.ShouldStop(8388608);
_includedividierheight = RemoteObject.createImmutable(0);Debug.locals.put("IncludeDividierHeight", _includedividierheight);
 BA.debugLineNum = 185;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = D";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_initialsize,BA.numberCast(double.class, 0))) { 
_includedividierheight = BA.numberCast(int.class, __ref.getField(true,"_dividersize"));Debug.locals.put("IncludeDividierHeight", _includedividierheight);}
else {
_includedividierheight = BA.numberCast(int.class, 0);Debug.locals.put("IncludeDividierHeight", _includedividierheight);};
 BA.debugLineNum = 186;BA.debugLine="Dim NewItem As CLVItem";
Debug.ShouldStop(33554432);
_newitem = RemoteObject.createNew ("app.aegdistribuzione.customlistview._clvitem");Debug.locals.put("NewItem", _newitem);
 BA.debugLineNum = 187;BA.debugLine="NewItem.Panel = p";
Debug.ShouldStop(67108864);
_newitem.setField ("Panel",_p);
 BA.debugLineNum = 188;BA.debugLine="NewItem.Size = ItemSize";
Debug.ShouldStop(134217728);
_newitem.setField ("Size",_itemsize);
 BA.debugLineNum = 189;BA.debugLine="NewItem.Value = Value";
Debug.ShouldStop(268435456);
_newitem.setField ("Value",_value);
 BA.debugLineNum = 190;BA.debugLine="NewItem.Color = p.Color";
Debug.ShouldStop(536870912);
_newitem.setField ("Color",_p.runMethod(true,"getColor"));
 BA.debugLineNum = 191;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(false,"_items").runMethod(true,"getSize"))) && RemoteObject.solveBoolean("=",_initialsize,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 192;BA.debugLine="items.Add(NewItem)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_items").runVoidMethod ("Add",(Object)((_newitem)));
 BA.debugLineNum = 193;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(1);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 194;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 195;BA.debugLine="offset = DividerSize";
Debug.ShouldStop(4);
_offset = BA.numberCast(int.class, __ref.getField(true,"_dividersize"));Debug.locals.put("offset", _offset);
 }else {
 BA.debugLineNum = 197;BA.debugLine="offset = GetScrollViewContentSize";
Debug.ShouldStop(16);
_offset = BA.numberCast(int.class, __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewcontentsize"));Debug.locals.put("offset", _offset);
 };
 BA.debugLineNum = 199;BA.debugLine="If horizontal Then";
Debug.ShouldStop(64);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 200;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
Debug.ShouldStop(128);
__ref.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(__ref.getField(false,"_sv").runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 202;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
Debug.ShouldStop(512);
__ref.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_offset),(Object)(__ref.getField(false,"_sv").runMethod(true,"getWidth")),(Object)(_itemsize));
 };
 }else {
 BA.debugLineNum = 205;BA.debugLine="CleanAfterAnimation";
Debug.ShouldStop(4096);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_cleanafteranimation");
 BA.debugLineNum = 206;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(8192);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 207;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 208;BA.debugLine="offset = DividerSize";
Debug.ShouldStop(32768);
_offset = BA.numberCast(int.class, __ref.getField(true,"_dividersize"));Debug.locals.put("offset", _offset);
 }else {
 BA.debugLineNum = 210;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
Debug.ShouldStop(131072);
_previtem = (__ref.getField(false,"_items").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("PrevItem", _previtem);Debug.locals.put("PrevItem", _previtem);
 BA.debugLineNum = 211;BA.debugLine="offset = GetPanelOffset(PrevItem.Panel) + PrevI";
Debug.ShouldStop(262144);
_offset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getpaneloffset",(Object)(_previtem.getField(false,"Panel"))),_previtem.getField(true,"Size"),__ref.getField(true,"_dividersize")}, "++",2, 0));Debug.locals.put("offset", _offset);
 };
 BA.debugLineNum = 213;BA.debugLine="For i = Index To items.Size - 1";
Debug.ShouldStop(1048576);
{
final int step39 = 1;
final int limit39 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _index.<Integer>get().intValue() ;
for (;(step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39) ;_i = ((int)(0 + _i + step39))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 214;BA.debugLine="Dim It As CLVItem = items.Get(i)";
Debug.ShouldStop(2097152);
_it = (__ref.getField(false,"_items").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("It", _it);Debug.locals.put("It", _it);
 BA.debugLineNum = 215;BA.debugLine="Dim NewOffset As Int = GetPanelOffset(It.Panel)";
Debug.ShouldStop(4194304);
_newoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getpaneloffset",(Object)(_it.getField(false,"Panel"))),_itemsize,_initialsize,_includedividierheight}, "+-+",3, 0));Debug.locals.put("NewOffset", _newoffset);Debug.locals.put("NewOffset", _newoffset);
 BA.debugLineNum = 216;BA.debugLine="If Min(NewOffset, GetPanelOffset(It.Panel)) - G";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {customlistview.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _newoffset)),(Object)(BA.numberCast(double.class, __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getpaneloffset",(Object)(_it.getField(false,"Panel")))))),__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewoffset")}, "-",1, 0),BA.numberCast(double.class, __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewvisiblesize")))) { 
 BA.debugLineNum = 217;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 218;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
Debug.ShouldStop(33554432);
_it.getField(false,"Panel").runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration")),(Object)(_newoffset),(Object)(BA.numberCast(int.class, 0)),(Object)(_it.getField(true,"Size")),(Object)(_it.getField(false,"Panel").runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 220;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
Debug.ShouldStop(134217728);
_it.getField(false,"Panel").runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration")),(Object)(BA.numberCast(int.class, 0)),(Object)(_newoffset),(Object)(_it.getField(false,"Panel").runMethod(true,"getWidth")),(Object)(_it.getField(true,"Size")));
 };
 }else {
 BA.debugLineNum = 223;BA.debugLine="SetPanelOffset(It.Panel, NewOffset)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_setpaneloffset",(Object)(_it.getField(false,"Panel")),(Object)(BA.numberCast(float.class, _newoffset)));
 };
 BA.debugLineNum = 225;BA.debugLine="It.Panel.Tag = i + 1";
Debug.ShouldStop(1);
_it.getField(false,"Panel").runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 227;BA.debugLine="items.InsertAt(Index, NewItem)";
Debug.ShouldStop(4);
__ref.getField(false,"_items").runVoidMethod ("InsertAt",(Object)(_index),(Object)((_newitem)));
 BA.debugLineNum = 228;BA.debugLine="If horizontal Then";
Debug.ShouldStop(8);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 229;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
Debug.ShouldStop(16);
__ref.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_initialsize),(Object)(__ref.getField(false,"_sv").runMethod(true,"getHeight")));
 BA.debugLineNum = 230;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
Debug.ShouldStop(32);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration")),(Object)(_offset),(Object)(BA.numberCast(int.class, 0)),(Object)(_itemsize),(Object)(_p.runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 232;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
Debug.ShouldStop(128);
__ref.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_offset),(Object)(__ref.getField(false,"_sv").runMethod(true,"getWidth")),(Object)(_initialsize));
 BA.debugLineNum = 233;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, 0, offse";
Debug.ShouldStop(256);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration")),(Object)(BA.numberCast(int.class, 0)),(Object)(_offset),(Object)(_p.runMethod(true,"getWidth")),(Object)(_itemsize));
 };
 };
 BA.debugLineNum = 236;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
Debug.ShouldStop(2048);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_setscrollviewcontentsize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewcontentsize"),_itemsize,_initialsize,_includedividierheight}, "+-+",3, 0))));
 BA.debugLineNum = 237;BA.debugLine="If items.Size = 1 Then SetScrollViewContentSize(G";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_setscrollviewcontentsize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewcontentsize"),_includedividierheight}, "+",1, 0))));};
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertattextitem(RemoteObject __ref,RemoteObject _index,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAtTextItem (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("insertattextitem")) { return __ref.runUserSub(false, "customlistview","insertattextitem", __ref, _index, _text, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _item = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 144;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="If horizontal Then";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 146;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
Debug.ShouldStop(131072);
customlistview.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("AddTextItem is only supported in vertical orientation.")));
 BA.debugLineNum = 147;BA.debugLine="Return";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 149;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
Debug.ShouldStop(1048576);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_createpanel",(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 150;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
Debug.ShouldStop(2097152);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_createlabel",(Object)(BA.ObjectToString(_text)));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 151;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
Debug.ShouldStop(4194304);
_lbl.runMethod(true,"setHeight",BA.numberCast(int.class, customlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _lbl.runMethod(true,"getHeight"))))));
 BA.debugLineNum = 152;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
Debug.ShouldStop(8388608);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(true,"getScrollViewContentWidth"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(Object)(_lbl.runMethod(true,"getHeight")));
 BA.debugLineNum = 153;BA.debugLine="lbl.TextColor = DefaultTextColor";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_defaulttextcolor"));
 BA.debugLineNum = 154;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
Debug.ShouldStop(33554432);
_pnl.runMethod(true,"setColor",__ref.getField(true,"_defaulttextbackgroundcolor"));
 BA.debugLineNum = 155;BA.debugLine="pnl.Height = lbl.Height + 2dip";
Debug.ShouldStop(67108864);
_pnl.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"getHeight"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1));
 BA.debugLineNum = 156;BA.debugLine="InsertAt(Index, pnl, Value)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_insertat",(Object)(_index),(Object)(_pnl),(Object)(_value));
 BA.debugLineNum = 157;BA.debugLine="Dim item As CLVItem = GetItem(Index)";
Debug.ShouldStop(268435456);
_item = __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitem",(Object)(_index));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 158;BA.debugLine="item.TextItem = True";
Debug.ShouldStop(536870912);
_item.setField ("TextItem",customlistview.__c.getField(true,"True"));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("JumpToItem (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("jumptoitem")) { return __ref.runUserSub(false, "customlistview","jumptoitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 336;BA.debugLine="Public Sub JumpToItem(Index As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 337;BA.debugLine="SetScrollViewOffset(FindItemOffset(Index))";
Debug.ShouldStop(65536);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_setscrollviewoffset",(Object)(BA.numberCast(float.class, __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_finditemoffset",(Object)(_index)))));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel_Click (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("panel_click")) { return __ref.runUserSub(false, "customlistview","panel_click", __ref);}
 BA.debugLineNum = 440;BA.debugLine="Private Sub Panel_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 441;BA.debugLine="PanelClickHandler(Sender)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_panelclickhandler",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), customlistview.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _panelclickhandler(RemoteObject __ref,RemoteObject _senderpanel) throws Exception{
try {
		Debug.PushSubsStack("PanelClickHandler (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,386);
if (RapidSub.canDelegate("panelclickhandler")) { __ref.runUserSub(false, "customlistview","panelclickhandler", __ref, _senderpanel); return;}
ResumableSub_PanelClickHandler rsub = new ResumableSub_PanelClickHandler(null,__ref,_senderpanel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PanelClickHandler extends BA.ResumableSub {
public ResumableSub_PanelClickHandler(app.aegdistribuzione.customlistview parent,RemoteObject __ref,RemoteObject _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
app.aegdistribuzione.customlistview parent;
RemoteObject _senderpanel;
RemoteObject _clr = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PanelClickHandler (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,386);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("SenderPanel", _senderpanel);
 BA.debugLineNum = 387;BA.debugLine="Dim clr As Int = GetItem(SenderPanel.Tag).Color";
Debug.ShouldStop(4);
_clr = __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitem",(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"getTag")))).getField(true,"Color");Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 388;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedColo";
Debug.ShouldStop(8);
_senderpanel.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 50)),(Object)(_clr),(Object)(__ref.getField(true,"_pressedcolor")));
 BA.debugLineNum = 389;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(false,"_xui").runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback")),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname"),RemoteObject.createImmutable("_ItemClick"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 390;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
Debug.ShouldStop(32);
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback")),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname"),RemoteObject.createImmutable("_ItemClick"))),(Object)(_senderpanel.runMethod(false,"getTag")),(Object)(__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getitem",(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"getTag")))).getField(false,"Value")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 392;BA.debugLine="Sleep(200)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),BA.numberCast(int.class, 200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 393;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor, c";
Debug.ShouldStop(256);
_senderpanel.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(true,"_pressedcolor")),(Object)(_clr));
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _removeat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveAt (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("removeat")) { return __ref.runUserSub(false, "customlistview","removeat", __ref, _index);}
RemoteObject _removeitem = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
RemoteObject _newoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 118;BA.debugLine="Public Sub RemoveAt(Index As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If getSize <= 1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("k",__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getsize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 120;BA.debugLine="Clear";
Debug.ShouldStop(8388608);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_clear");
 BA.debugLineNum = 121;BA.debugLine="Return";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 123;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
Debug.ShouldStop(67108864);
_removeitem = (__ref.getField(false,"_items").runMethod(false,"Get",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 124;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 125;BA.debugLine="For i = Index + 1 To items.Size - 1";
Debug.ShouldStop(268435456);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="Dim item As CLVItem = items.Get(i)";
Debug.ShouldStop(536870912);
_item = (__ref.getField(false,"_items").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 127;BA.debugLine="p = item.Panel";
Debug.ShouldStop(1073741824);
_p = _item.getField(false,"Panel");Debug.locals.put("p", _p);
 BA.debugLineNum = 128;BA.debugLine="p.Tag = i - 1";
Debug.ShouldStop(-2147483648);
_p.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 129;BA.debugLine="Dim NewOffset As Int = GetPanelOffset(p) - item.";
Debug.ShouldStop(1);
_newoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getpaneloffset",(Object)(_p)),_item.getField(true,"Size"),__ref.getField(true,"_dividersize")}, "--",2, 0));Debug.locals.put("NewOffset", _newoffset);Debug.locals.put("NewOffset", _newoffset);
 BA.debugLineNum = 130;BA.debugLine="SetPanelOffset(p, NewOffset)";
Debug.ShouldStop(2);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_setpaneloffset",(Object)(_p),(Object)(BA.numberCast(float.class, _newoffset)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 132;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
Debug.ShouldStop(8);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_setscrollviewcontentsize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewcontentsize"),_removeitem.getField(true,"Size"),__ref.getField(true,"_dividersize")}, "--",2, 0))));
 BA.debugLineNum = 133;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(16);
__ref.getField(false,"_items").runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 134;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(32);
_removeitem.getField(false,"Panel").runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replaceat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ReplaceAt (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,321);
if (RapidSub.canDelegate("replaceat")) { return __ref.runUserSub(false, "customlistview","replaceat", __ref, _index, _pnl, _itemheight, _value);}
RemoteObject _removeitem = RemoteObject.declareNull("app.aegdistribuzione.customlistview._clvitem");
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 321;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
Debug.ShouldStop(1);
 BA.debugLineNum = 322;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
Debug.ShouldStop(2);
_removeitem = (__ref.getField(false,"_items").runMethod(false,"Get",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 323;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(4);
__ref.getField(false,"_items").runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 324;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(8);
_removeitem.getField(false,"Panel").runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 325;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
Debug.ShouldStop(16);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_insertatimpl",(Object)(_index),(Object)(_pnl),(Object)(_itemheight),(Object)(_value),(Object)(_removeitem.getField(true,"Size")));
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizeitem(RemoteObject __ref,RemoteObject _index,RemoteObject _itemheight) throws Exception{
try {
		Debug.PushSubsStack("ResizeItem (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("resizeitem")) { return __ref.runUserSub(false, "customlistview","resizeitem", __ref, _index, _itemheight);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("ItemHeight", _itemheight);
 BA.debugLineNum = 310;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getpanel",(Object)(_index));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 312;BA.debugLine="Dim value As Object = items.Get(Index)";
Debug.ShouldStop(8388608);
_value = __ref.getField(false,"_items").runMethod(false,"Get",(Object)(_index));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 313;BA.debugLine="Dim parent As B4XView = p.Parent";
Debug.ShouldStop(16777216);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_parent = _p.runMethod(false,"getParent");Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 314;BA.debugLine="p.Color = parent.Color";
Debug.ShouldStop(33554432);
_p.runMethod(true,"setColor",_parent.runMethod(true,"getColor"));
 BA.debugLineNum = 315;BA.debugLine="p.RemoveViewFromParent";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 316;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_replaceat",(Object)(_index),(Object)(_p),(Object)(_itemheight),(Object)(_value));
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrollhandler(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScrollHandler (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,407);
if (RapidSub.canDelegate("scrollhandler")) { return __ref.runUserSub(false, "customlistview","scrollhandler", __ref);}
RemoteObject _position = RemoteObject.createImmutable(0);
 BA.debugLineNum = 407;BA.debugLine="Private Sub ScrollHandler";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 408;BA.debugLine="Dim position As Int = GetScrollViewOffset";
Debug.ShouldStop(8388608);
_position = BA.numberCast(int.class, __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewoffset"));Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 BA.debugLineNum = 409;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_position,__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewvisiblesize")}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_getscrollviewcontentsize"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0)) && RemoteObject.solveBoolean(">",customlistview.__c.getField(false,"DateTime").runMethod(true,"getNow"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastreachendevent"),RemoteObject.createImmutable(100)}, "+",1, 2)))) { 
 BA.debugLineNum = 410;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
Debug.ShouldStop(33554432);
if (__ref.getField(false,"_xui").runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback")),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname"),RemoteObject.createImmutable("_ReachEnd"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 411;BA.debugLine="LastReachEndEvent = DateTime.Now";
Debug.ShouldStop(67108864);
__ref.setField ("_lastreachendevent",customlistview.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 412;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
Debug.ShouldStop(134217728);
customlistview.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback")),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname"),RemoteObject.createImmutable("_ReachEnd"))));
 }else {
 BA.debugLineNum = 414;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
Debug.ShouldStop(536870912);
__ref.setField ("_lastreachendevent",RemoteObject.solve(new RemoteObject[] {customlistview.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(1000),customlistview.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+*",1, 2));
 };
 };
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrolltoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ScrollToItem (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("scrolltoitem")) { return __ref.runUserSub(false, "customlistview","scrolltoitem", __ref, _index);}
RemoteObject _offset = RemoteObject.createImmutable(0f);
RemoteObject _hv = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
RemoteObject _nsv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 341;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 345;BA.debugLine="Dim offset As Float = FindItemOffset(Index)";
Debug.ShouldStop(16777216);
_offset = BA.numberCast(float.class, __ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_finditemoffset",(Object)(_index)));Debug.locals.put("offset", _offset);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 346;BA.debugLine="If horizontal Then";
Debug.ShouldStop(33554432);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 347;BA.debugLine="Dim hv As HorizontalScrollView = sv";
Debug.ShouldStop(67108864);
_hv = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
_hv.setObject(__ref.getField(false,"_sv").getObject());Debug.locals.put("hv", _hv);
 BA.debugLineNum = 348;BA.debugLine="hv.ScrollPosition = offset 'smooth scroll";
Debug.ShouldStop(134217728);
_hv.runMethod(true,"setScrollPosition",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 350;BA.debugLine="Dim nsv As ScrollView = sv";
Debug.ShouldStop(536870912);
_nsv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
_nsv.setObject(__ref.getField(false,"_sv").getObject());Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 351;BA.debugLine="nsv.ScrollPosition = offset";
Debug.ShouldStop(1073741824);
_nsv.runMethod(true,"setScrollPosition",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaneloffset(RemoteObject __ref,RemoteObject _p,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("SetPanelOffset (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("setpaneloffset")) { return __ref.runUserSub(false, "customlistview","setpaneloffset", __ref, _p, _offset);}
Debug.locals.put("p", _p);
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 280;BA.debugLine="Private Sub SetPanelOffset (p As B4XView, offset A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 282;BA.debugLine="p.Left = offset";
Debug.ShouldStop(33554432);
_p.runMethod(true,"setLeft",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 284;BA.debugLine="p.Top = offset";
Debug.ShouldStop(134217728);
_p.runMethod(true,"setTop",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollviewcontentsize(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetScrollViewContentSize (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("setscrollviewcontentsize")) { return __ref.runUserSub(false, "customlistview","setscrollviewcontentsize", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 272;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="If horizontal Then";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 274;BA.debugLine="sv.ScrollViewContentWidth = f";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv").runMethod(true,"setScrollViewContentWidth",BA.numberCast(int.class, _f));
 }else {
 BA.debugLineNum = 276;BA.debugLine="sv.ScrollViewContentHeight = f";
Debug.ShouldStop(524288);
__ref.getField(false,"_sv").runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, _f));
 };
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollviewoffset(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("SetScrollViewOffset (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setscrollviewoffset")) { return __ref.runUserSub(false, "customlistview","setscrollviewoffset", __ref, _offset);}
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 256;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_horizontal").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 258;BA.debugLine="sv.ScrollViewOffsetX = offset";
Debug.ShouldStop(2);
__ref.getField(false,"_sv").runMethod(true,"setScrollViewOffsetX",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 260;BA.debugLine="sv.ScrollViewOffsetY = offset";
Debug.ShouldStop(8);
__ref.getField(false,"_sv").runMethod(true,"setScrollViewOffsetY",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sv_scrollchanged(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("sv_ScrollChanged (customlistview) ","customlistview",17,__ref.getField(false, "ba"),__ref,444);
if (RapidSub.canDelegate("sv_scrollchanged")) { return __ref.runUserSub(false, "customlistview","sv_scrollchanged", __ref, _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 444;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="ScrollHandler";
Debug.ShouldStop(268435456);
__ref.runClassMethod (app.aegdistribuzione.customlistview.class, "_scrollhandler");
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}