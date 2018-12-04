package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class customlistview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.customlistview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.customlistview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _clvitem{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper Panel;
public int Size;
public Object Value;
public int Color;
public boolean TextItem;
public void Initialize() {
IsInitialized = true;
Panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
Size = 0;
Value = new Object();
Color = 0;
TextItem = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public float _dividersize = 0f;
public String _eventname = "";
public Object _callback = null;
public int _defaulttextcolor = 0;
public int _defaulttextbackgroundcolor = 0;
public int _animationduration = 0;
public long _lastreachendevent = 0L;
public int _pressedcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _lastanimatedaction = 0;
public anywheresoftware.b4a.objects.LabelWrapper _designerlabel = null;
public boolean _horizontal = false;
public anywheresoftware.b4a.objects.StringUtils _su = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public app.aegdistribuzione.main _main = null;
public app.aegdistribuzione.ordineactivity _ordineactivity = null;
public app.aegdistribuzione.schedaclienteactivity _schedaclienteactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public int  _getitemfromview(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getitemfromview"))
	 {return ((Integer) Debug.delegate(ba, "getitemfromview", new Object[] {_v}));}
Object _parent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _current = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim parent = v As Object, current As B4XView";
_parent = (Object)(_v.getObject());
_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
while ((__ref._sv.getScrollViewInnerPanel()).equals((java.lang.Object)(_parent)) == false) {
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="current = parent";
_current.setObject((java.lang.Object)(_parent));
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="parent = current.Parent";
_parent = (Object)(_current.getParent().getObject());
 }
;
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="v = current";
_v = _current;
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="Return v.Tag";
if (true) return (int)(BA.ObjectToNumber(_v.getTag()));
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="End Sub";
return 0;
}
public Object  _getvalue(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getvalue"))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Return GetItem(Index).Value";
if (true) return __ref._getitem(null,_index).Value;
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="End Sub";
return null;
}
public String  _clear(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "clear"))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="items.Clear";
__ref._items.Clear();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv.getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="SetScrollViewContentSize(0)";
__ref._setscrollviewcontentsize(null,(float) (0));
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="End Sub";
return "";
}
public String  _add(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "add"))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_pnl,_value}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
__ref._insertat(null,__ref._items.getSize(),_pnl,_value);
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _asview(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub AsView As B4XView";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="End Sub";
return null;
}
public String  _insertat(app.aegdistribuzione.customlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertat"))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_pnl,_value}));}
float _size = 0f;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim size As Float";
_size = 0f;
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="size = pnl.Width";
_size = (float) (_pnl.getWidth());
 }else {
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="size = pnl.Height";
_size = (float) (_pnl.getHeight());
 };
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
__ref._insertatimpl(null,_index,_pnl,(int) (_size),_value,(int) (0));
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(app.aegdistribuzione.customlistview __ref,Object _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "addtextitem"))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_text,_value}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
__ref._insertattextitem(null,__ref._items.getSize(),_text,_value);
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="End Sub";
return "";
}
public String  _insertattextitem(app.aegdistribuzione.customlistview __ref,int _index,Object _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertattextitem"))
	 {return ((String) Debug.delegate(ba, "insertattextitem", new Object[] {_index,_text,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
app.aegdistribuzione.customlistview._clvitem _item = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
__c.Log("AddTextItem is only supported in vertical orientation.");
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createpanel(null,"");
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._createlabel(null,BA.ObjectToString(_text));
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
_lbl.setHeight((int) (__c.Max(__c.DipToCurrent((int) (50)),_lbl.getHeight())));
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
_pnl.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (2)),(int) (__ref._sv.getScrollViewContentWidth()-__c.DipToCurrent((int) (10))),_lbl.getHeight());
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="lbl.TextColor = DefaultTextColor";
_lbl.setTextColor(__ref._defaulttextcolor);
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
_pnl.setColor(__ref._defaulttextbackgroundcolor);
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="pnl.Height = lbl.Height + 2dip";
_pnl.setHeight((int) (_lbl.getHeight()+__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="InsertAt(Index, pnl, Value)";
__ref._insertat(null,_index,_pnl,_value);
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="Dim item As CLVItem = GetItem(Index)";
_item = __ref._getitem(null,_index);
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="item.TextItem = True";
_item.TextItem = __c.True;
RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(app.aegdistribuzione.customlistview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _scrollbar = 0;
app.aegdistribuzione.customlistview._clvitem _it = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Dim scrollbar As Int";
_scrollbar = 0;
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="If xui.IsB4J Then scrollbar = 20";
if (__ref._xui.getIsB4J()) { 
_scrollbar = (int) (20);};
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
__ref._sv.setScrollViewContentHeight((int) (_height-_scrollbar));
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="For Each it As CLVItem In items";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._items;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (app.aegdistribuzione.customlistview._clvitem)(group6.Get(index6));
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
_it.Panel.setHeight(__ref._sv.getScrollViewContentHeight());
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
_it.Panel.GetView((int) (0)).setHeight(_it.Panel.getHeight());
 }
};
 }else {
RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
__ref._sv.setScrollViewContentWidth((int) (_width-_scrollbar));
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="For Each it As CLVItem In items";
{
final anywheresoftware.b4a.BA.IterableList group12 = __ref._items;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (app.aegdistribuzione.customlistview._clvitem)(group12.Get(index12));
RDebugUtils.currentLine=10027021;
 //BA.debugLineNum = 10027021;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
_it.Panel.setWidth(__ref._sv.getScrollViewContentWidth());
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
_it.Panel.GetView((int) (0)).setWidth(_it.Panel.getWidth());
RDebugUtils.currentLine=10027023;
 //BA.debugLineNum = 10027023;BA.debugLine="If it.TextItem Then";
if (_it.TextItem) { 
RDebugUtils.currentLine=10027024;
 //BA.debugLineNum = 10027024;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _it.Panel.GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=10027025;
 //BA.debugLineNum = 10027025;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
_lbl.SetLayoutAnimated((int) (0),_lbl.getLeft(),_lbl.getTop(),(int) (_it.Panel.getWidth()-_lbl.getLeft()),_lbl.getHeight());
 };
 }
};
 };
RDebugUtils.currentLine=10027029;
 //BA.debugLineNum = 10027029;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="Private DividerSize As Float";
_dividersize = 0f;
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="Private EventName As String";
_eventname = "";
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="Public DefaultTextColor As Int";
_defaulttextcolor = 0;
RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="Public DefaultTextBackgroundColor As Int";
_defaulttextbackgroundcolor = 0;
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="Public AnimationDuration As Int = 300";
_animationduration = (int) (300);
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="Private LastReachEndEvent As Long";
_lastreachendevent = 0L;
RDebugUtils.currentLine=9830412;
 //BA.debugLineNum = 9830412;BA.debugLine="Private PressedColor As Int";
_pressedcolor = 0;
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9830414;
 //BA.debugLineNum = 9830414;BA.debugLine="Private LastAnimatedAction As Int";
_lastanimatedaction = 0;
RDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="Private DesignerLabel As Label";
_designerlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9830416;
 //BA.debugLineNum = 9830416;BA.debugLine="Private horizontal As Boolean";
_horizontal = false;
RDebugUtils.currentLine=9830420;
 //BA.debugLineNum = 9830420;BA.debugLine="Private su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=9830424;
 //BA.debugLineNum = 9830424;BA.debugLine="End Sub";
return "";
}
public void  _cleanafteranimation(app.aegdistribuzione.customlistview __ref) throws Exception{
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "cleanafteranimation"))
	 {Debug.delegate(ba, "cleanafteranimation", null); return;}
ResumableSub_CleanAfterAnimation rsub = new ResumableSub_CleanAfterAnimation(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CleanAfterAnimation extends BA.ResumableSub {
public ResumableSub_CleanAfterAnimation(app.aegdistribuzione.customlistview parent,app.aegdistribuzione.customlistview __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
app.aegdistribuzione.customlistview __ref;
app.aegdistribuzione.customlistview parent;
int _myindex = 0;
int _offset = 0;
app.aegdistribuzione.customlistview._clvitem _item = null;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="customlistview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="LastAnimatedAction = LastAnimatedAction + 1";
__ref._lastanimatedaction = (int) (__ref._lastanimatedaction+1);
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="Dim MyIndex As Int = LastAnimatedAction";
_myindex = __ref._lastanimatedaction;
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Sleep(AnimationDuration + 50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "customlistview", "cleanafteranimation"),(int) (__ref._animationduration+50));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="If MyIndex <> LastAnimatedAction Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_myindex!=__ref._lastanimatedaction) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Dim Offset As Int = DividerSize";
_offset = (int) (__ref._dividersize);
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="For Each item As CLVItem In items";
if (true) break;

case 7:
//for
this.state = 10;
group6 = __ref._items;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 10;
if (index6 < groupLen6) {
this.state = 9;
_item = (app.aegdistribuzione.customlistview._clvitem)(group6.Get(index6));}
if (true) break;

case 13:
//C
this.state = 12;
index6++;
if (true) break;

case 9:
//C
this.state = 13;
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="SetPanelOffset(item.Panel, Offset)";
__ref._setpaneloffset(null,_item.Panel,(float) (_offset));
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="Offset = Offset + item.Size + DividerSize";
_offset = (int) (_offset+_item.Size+__ref._dividersize);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setpaneloffset(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "setpaneloffset"))
	 {return ((String) Debug.delegate(ba, "setpaneloffset", new Object[] {_p,_offset}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub SetPanelOffset (p As B4XView, offset A";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="p.Left = offset";
_p.setLeft((int) (_offset));
 }else {
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="p.Top = offset";
_p.setTop((int) (_offset));
 };
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewcontentsize(app.aegdistribuzione.customlistview __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "setscrollviewcontentsize"))
	 {return ((String) Debug.delegate(ba, "setscrollviewcontentsize", new Object[] {_f}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="sv.ScrollViewContentWidth = f";
__ref._sv.setScrollViewContentWidth((int) (_f));
 }else {
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="sv.ScrollViewContentHeight = f";
__ref._sv.setScrollViewContentHeight((int) (_f));
 };
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(app.aegdistribuzione.customlistview __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createlabel"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_txt}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Private Sub CreateLabel(txt As String) As B4XView";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="lbl.Gravity = DesignerLabel.Gravity";
_lbl.setGravity(__ref._designerlabel.getGravity());
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="lbl.TextSize = DesignerLabel.TextSize";
_lbl.setTextSize(__ref._designerlabel.getTextSize());
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="lbl.SingleLine = False";
_lbl.setSingleLine(__c.False);
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="lbl.Text = txt";
_lbl.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
_lbl.setWidth((int) (__ref._sv.getScrollViewContentWidth()-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="lbl.Height = su.MeasureMultilineTextHeight(lbl, t";
_lbl.setHeight(__ref._su.MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),BA.ObjectToCharSequence(_txt)));
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=12386314;
 //BA.debugLineNum = 12386314;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createpanel(app.aegdistribuzione.customlistview __ref,String _paneleventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createpanel"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createpanel", new Object[] {_paneleventname}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
if (true) return __ref._xui.CreatePanel(ba,_paneleventname);
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createscrollview(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createscrollview"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createscrollview", null));}
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Private Sub CreateScrollView As B4XView";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Dim hv As HorizontalScrollView";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="hv.Initialize(0, \"sv\")";
_hv.Initialize(ba,(int) (0),"sv");
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Return hv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_hv.getObject()));
 }else {
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Dim nsv As ScrollView";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="nsv.Initialize2(0, \"sv\")";
_nsv.Initialize2(ba,(int) (0),"sv");
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="Return nsv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_nsv.getObject()));
 };
RDebugUtils.currentLine=12189706;
 //BA.debugLineNum = 12189706;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(app.aegdistribuzione.customlistview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _o = "";
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="mBase = Base";
__ref._mbase.setObject((java.lang.Object)(_base));
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
_o = BA.ObjectToString(_props.GetDefault((Object)("ListOrientation"),(Object)("Vertical")));
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="horizontal = o = \"Horizontal\"";
__ref._horizontal = (_o).equals("Horizontal");
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="sv = CreateScrollView";
__ref._sv = __ref._createscrollview(null);
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase.AddView((android.view.View)(__ref._sv.getObject()),(int) (0),(int) (0),__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
__ref._sv.getScrollViewInnerPanel().setColor(__ref._xui.PaintOrColorToColor(_props.Get((Object)("DividerColor"))));
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="DividerSize = DipToCurrent(Props.Get(\"DividerHeig";
__ref._dividersize = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("DividerHeight"))))));
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
__ref._pressedcolor = __ref._xui.PaintOrColorToColor(_props.Get((Object)("PressedColor")));
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
__ref._animationduration = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("InsertAnimationDuration"),(Object)(__ref._animationduration))));
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
__ref._defaulttextcolor = __ref._xui.PaintOrColorToColor((Object)(_lbl.getTextColor()));
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
__ref._defaulttextbackgroundcolor = __ref._mbase.getColor();
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="DesignerLabel = Lbl";
__ref._designerlabel = _lbl;
RDebugUtils.currentLine=9961485;
 //BA.debugLineNum = 9961485;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize(null,__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="End Sub";
return "";
}
public int  _finditemoffset(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "finditemoffset"))
	 {return ((Integer) Debug.delegate(ba, "finditemoffset", new Object[] {_index}));}
int _offset = 0;
int _i = 0;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Dim Offset As Int";
_offset = 0;
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="For i = 0 To Min(Index - 1, items.Size - 1)";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_index-1,__ref._items.getSize()-1));
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Offset = Offset + GetItem(i).Size + DividerSize";
_offset = (int) (_offset+__ref._getitem(null,_i).Size+__ref._dividersize);
 }
};
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="Return Offset";
if (true) return _offset;
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="End Sub";
return 0;
}
public app.aegdistribuzione.customlistview._clvitem  _getitem(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getitem"))
	 {return ((app.aegdistribuzione.customlistview._clvitem) Debug.delegate(ba, "getitem", new Object[] {_index}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub GetItem(Index As Int) As CLVItem";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Return items.Get(Index)";
if (true) return (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_index));
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub GetBase As B4XView";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="End Sub";
return null;
}
public int  _getfirstvisibleindex(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getfirstvisibleindex"))
	 {return ((Integer) Debug.delegate(ba, "getfirstvisibleindex", null));}
int _bottom = 0;
int _i = 0;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim bottom As Int";
_bottom = 0;
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="bottom = bottom +  GetItem(i).Size + DividerSize";
_bottom = (int) (_bottom+__ref._getitem(null,_i).Size+__ref._dividersize);
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="If bottom > GetScrollViewOffset Then Return i";
if (_bottom>__ref._getscrollviewoffset(null)) { 
if (true) return _i;};
 }
};
RDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="Return items.Size - 1";
if (true) return (int) (__ref._items.getSize()-1);
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewoffset(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewoffset"))
	 {return ((Float) Debug.delegate(ba, "getscrollviewoffset", null));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub GetScrollViewOffset As Float";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Return sv.ScrollViewOffsetX";
if (true) return (float) (__ref._sv.getScrollViewOffsetX());
 }else {
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="Return sv.ScrollViewOffsetY";
if (true) return (float) (__ref._sv.getScrollViewOffsetY());
 };
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="End Sub";
return 0f;
}
public int  _getlastvisibleindex(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getlastvisibleindex"))
	 {return ((Integer) Debug.delegate(ba, "getlastvisibleindex", null));}
int _first = 0;
int _bottom = 0;
int _i = 0;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub getLastVisibleIndex As Int";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
_first = __ref._getfirstvisibleindex(null);
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Dim bottom As Int";
_bottom = 0;
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="bottom = bottom +  GetItem(i).Size + DividerSize";
_bottom = (int) (_bottom+__ref._getitem(null,_i).Size+__ref._dividersize);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="If i >= first And bottom >= GetScrollViewOffset";
if (_i>=_first && _bottom>=__ref._getscrollviewoffset(null)+__ref._getscrollviewvisiblesize(null)) { 
if (true) return (int) (__c.Max(_i-1,_first));};
 }
};
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="Return items.Size - 1";
if (true) return (int) (__ref._items.getSize()-1);
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewvisiblesize(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewvisiblesize"))
	 {return ((Float) Debug.delegate(ba, "getscrollviewvisiblesize", null));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Return sv.Width";
if (true) return (float) (__ref._sv.getWidth());
 }else {
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Return sv.Height";
if (true) return (float) (__ref._sv.getHeight());
 };
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getpanel"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Return GetItem(Index).Panel.GetView(0)";
if (true) return __ref._getitem(null,_index).Panel.GetView((int) (0));
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="End Sub";
return null;
}
public float  _getpaneloffset(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getpaneloffset"))
	 {return ((Float) Debug.delegate(ba, "getpaneloffset", new Object[] {_p}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub GetPanelOffset (p As B4XView) As Float";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Return p.Left";
if (true) return (float) (_p.getLeft());
 }else {
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="Return p.Top";
if (true) return (float) (_p.getTop());
 };
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="End Sub";
return 0f;
}
public float  _getscrollviewcontentsize(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewcontentsize"))
	 {return ((Float) Debug.delegate(ba, "getscrollviewcontentsize", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="Return sv.ScrollViewContentWidth";
if (true) return (float) (__ref._sv.getScrollViewContentWidth());
 }else {
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Return sv.ScrollViewContentHeight";
if (true) return (float) (__ref._sv.getScrollViewContentHeight());
 };
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="End Sub";
return 0f;
}
public int  _getsize(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getsize"))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Return items.Size";
if (true) return __ref._items.getSize();
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="EventName = vEventName";
__ref._eventname = _veventname;
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="CallBack = vCallBack";
__ref._callback = _vcallback;
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="items.Initialize";
__ref._items.Initialize();
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
__ref._defaulttextbackgroundcolor = __ref._xui.Color_White;
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="DefaultTextColor = xui.Color_Black";
__ref._defaulttextcolor = __ref._xui.Color_Black;
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="End Sub";
return "";
}
public String  _insertatimpl(app.aegdistribuzione.customlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemsize,Object _value,int _initialsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertatimpl"))
	 {return ((String) Debug.delegate(ba, "insertatimpl", new Object[] {_index,_pnl,_itemsize,_value,_initialsize}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _includedividierheight = 0;
app.aegdistribuzione.customlistview._clvitem _newitem = null;
int _offset = 0;
app.aegdistribuzione.customlistview._clvitem _previtem = null;
int _i = 0;
app.aegdistribuzione.customlistview._clvitem _it = null;
int _newoffset = 0;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub InsertAtImpl(Index As Int, Pnl As B4XV";
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createpanel(null,"Panel");
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="p.Color = Pnl.Color";
_p.setColor(_pnl.getColor());
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="Pnl.Color = xui.Color_Transparent";
_pnl.setColor(__ref._xui.Color_Transparent);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),_itemsize,__ref._sv.getScrollViewContentHeight());
 }else {
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__ref._sv.getScrollViewContentWidth(),_itemsize);
 };
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="p.Tag = Index";
_p.setTag((Object)(_index));
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="Dim IncludeDividierHeight As Int";
_includedividierheight = 0;
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = D";
if (_initialsize==0) { 
_includedividierheight = (int) (__ref._dividersize);}
else {
_includedividierheight = (int) (0);};
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="Dim NewItem As CLVItem";
_newitem = new app.aegdistribuzione.customlistview._clvitem();
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="NewItem.Panel = p";
_newitem.Panel = _p;
RDebugUtils.currentLine=10813455;
 //BA.debugLineNum = 10813455;BA.debugLine="NewItem.Size = ItemSize";
_newitem.Size = _itemsize;
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="NewItem.Value = Value";
_newitem.Value = _value;
RDebugUtils.currentLine=10813457;
 //BA.debugLineNum = 10813457;BA.debugLine="NewItem.Color = p.Color";
_newitem.Color = _p.getColor();
RDebugUtils.currentLine=10813458;
 //BA.debugLineNum = 10813458;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
if (_index==__ref._items.getSize() && _initialsize==0) { 
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="items.Add(NewItem)";
__ref._items.Add((Object)(_newitem));
RDebugUtils.currentLine=10813460;
 //BA.debugLineNum = 10813460;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=10813461;
 //BA.debugLineNum = 10813461;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=10813462;
 //BA.debugLineNum = 10813462;BA.debugLine="offset = DividerSize";
_offset = (int) (__ref._dividersize);
 }else {
RDebugUtils.currentLine=10813464;
 //BA.debugLineNum = 10813464;BA.debugLine="offset = GetScrollViewContentSize";
_offset = (int) (__ref._getscrollviewcontentsize(null));
 };
RDebugUtils.currentLine=10813466;
 //BA.debugLineNum = 10813466;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10813467;
 //BA.debugLineNum = 10813467;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv.getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_itemsize,__ref._sv.getHeight());
 }else {
RDebugUtils.currentLine=10813469;
 //BA.debugLineNum = 10813469;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv.getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv.getWidth(),_itemsize);
 };
 }else {
RDebugUtils.currentLine=10813472;
 //BA.debugLineNum = 10813472;BA.debugLine="CleanAfterAnimation";
__ref._cleanafteranimation(null);
RDebugUtils.currentLine=10813473;
 //BA.debugLineNum = 10813473;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=10813474;
 //BA.debugLineNum = 10813474;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=10813475;
 //BA.debugLineNum = 10813475;BA.debugLine="offset = DividerSize";
_offset = (int) (__ref._dividersize);
 }else {
RDebugUtils.currentLine=10813477;
 //BA.debugLineNum = 10813477;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
_previtem = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get((int) (_index-1)));
RDebugUtils.currentLine=10813478;
 //BA.debugLineNum = 10813478;BA.debugLine="offset = GetPanelOffset(PrevItem.Panel) + PrevI";
_offset = (int) (__ref._getpaneloffset(null,_previtem.Panel)+_previtem.Size+__ref._dividersize);
 };
RDebugUtils.currentLine=10813480;
 //BA.debugLineNum = 10813480;BA.debugLine="For i = Index To items.Size - 1";
{
final int step39 = 1;
final int limit39 = (int) (__ref._items.getSize()-1);
_i = _index ;
for (;_i <= limit39 ;_i = _i + step39 ) {
RDebugUtils.currentLine=10813481;
 //BA.debugLineNum = 10813481;BA.debugLine="Dim It As CLVItem = items.Get(i)";
_it = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_i));
RDebugUtils.currentLine=10813482;
 //BA.debugLineNum = 10813482;BA.debugLine="Dim NewOffset As Int = GetPanelOffset(It.Panel)";
_newoffset = (int) (__ref._getpaneloffset(null,_it.Panel)+_itemsize-_initialsize+_includedividierheight);
RDebugUtils.currentLine=10813483;
 //BA.debugLineNum = 10813483;BA.debugLine="If Min(NewOffset, GetPanelOffset(It.Panel)) - G";
if (__c.Min(_newoffset,__ref._getpaneloffset(null,_it.Panel))-__ref._getscrollviewoffset(null)<__ref._getscrollviewvisiblesize(null)) { 
RDebugUtils.currentLine=10813484;
 //BA.debugLineNum = 10813484;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10813485;
 //BA.debugLineNum = 10813485;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel.SetLayoutAnimated(__ref._animationduration,_newoffset,(int) (0),_it.Size,_it.Panel.getHeight());
 }else {
RDebugUtils.currentLine=10813487;
 //BA.debugLineNum = 10813487;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel.SetLayoutAnimated(__ref._animationduration,(int) (0),_newoffset,_it.Panel.getWidth(),_it.Size);
 };
 }else {
RDebugUtils.currentLine=10813490;
 //BA.debugLineNum = 10813490;BA.debugLine="SetPanelOffset(It.Panel, NewOffset)";
__ref._setpaneloffset(null,_it.Panel,(float) (_newoffset));
 };
RDebugUtils.currentLine=10813492;
 //BA.debugLineNum = 10813492;BA.debugLine="It.Panel.Tag = i + 1";
_it.Panel.setTag((Object)(_i+1));
 }
};
RDebugUtils.currentLine=10813494;
 //BA.debugLineNum = 10813494;BA.debugLine="items.InsertAt(Index, NewItem)";
__ref._items.InsertAt(_index,(Object)(_newitem));
RDebugUtils.currentLine=10813495;
 //BA.debugLineNum = 10813495;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10813496;
 //BA.debugLineNum = 10813496;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv.getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_initialsize,__ref._sv.getHeight());
RDebugUtils.currentLine=10813497;
 //BA.debugLineNum = 10813497;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
_p.SetLayoutAnimated(__ref._animationduration,_offset,(int) (0),_itemsize,_p.getHeight());
 }else {
RDebugUtils.currentLine=10813499;
 //BA.debugLineNum = 10813499;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv.getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv.getWidth(),_initialsize);
RDebugUtils.currentLine=10813500;
 //BA.debugLineNum = 10813500;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, 0, offse";
_p.SetLayoutAnimated(__ref._animationduration,(int) (0),_offset,_p.getWidth(),_itemsize);
 };
 };
RDebugUtils.currentLine=10813503;
 //BA.debugLineNum = 10813503;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize(null,(float) (__ref._getscrollviewcontentsize(null)+_itemsize-_initialsize+_includedividierheight));
RDebugUtils.currentLine=10813504;
 //BA.debugLineNum = 10813504;BA.debugLine="If items.Size = 1 Then SetScrollViewContentSize(G";
if (__ref._items.getSize()==1) { 
__ref._setscrollviewcontentsize(null,(float) (__ref._getscrollviewcontentsize(null)+_includedividierheight));};
RDebugUtils.currentLine=10813505;
 //BA.debugLineNum = 10813505;BA.debugLine="End Sub";
return "";
}
public String  _jumptoitem(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "jumptoitem"))
	 {return ((String) Debug.delegate(ba, "jumptoitem", new Object[] {_index}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub JumpToItem(Index As Int)";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="SetScrollViewOffset(FindItemOffset(Index))";
__ref._setscrollviewoffset(null,(float) (__ref._finditemoffset(null,_index)));
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewoffset(app.aegdistribuzione.customlistview __ref,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "setscrollviewoffset"))
	 {return ((String) Debug.delegate(ba, "setscrollviewoffset", new Object[] {_offset}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="sv.ScrollViewOffsetX = offset";
__ref._sv.setScrollViewOffsetX((int) (_offset));
 }else {
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="sv.ScrollViewOffsetY = offset";
__ref._sv.setScrollViewOffsetY((int) (_offset));
 };
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="End Sub";
return "";
}
public String  _panel_click(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "panel_click"))
	 {return ((String) Debug.delegate(ba, "panel_click", null));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub Panel_Click";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="PanelClickHandler(Sender)";
__ref._panelclickhandler(null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="End Sub";
return "";
}
public void  _panelclickhandler(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "panelclickhandler"))
	 {Debug.delegate(ba, "panelclickhandler", new Object[] {_senderpanel}); return;}
ResumableSub_PanelClickHandler rsub = new ResumableSub_PanelClickHandler(this,__ref,_senderpanel);
rsub.resume(ba, null);
}
public static class ResumableSub_PanelClickHandler extends BA.ResumableSub {
public ResumableSub_PanelClickHandler(app.aegdistribuzione.customlistview parent,app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
this.__ref = parent;
}
app.aegdistribuzione.customlistview __ref;
app.aegdistribuzione.customlistview parent;
anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel;
int _clr = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="customlistview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Dim clr As Int = GetItem(SenderPanel.Tag).Color";
_clr = __ref._getitem(null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Color;
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedColo";
_senderpanel.SetColorAnimated((int) (50),_clr,__ref._pressedcolor);
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._xui.SubExists(ba,__ref._callback,__ref._eventname+"_ItemClick",(int) (2))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
parent.__c.CallSubNew3(ba,__ref._callback,__ref._eventname+"_ItemClick",_senderpanel.getTag(),__ref._getitem(null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Value);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "customlistview", "panelclickhandler"),(int) (200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor, c";
_senderpanel.SetColorAnimated((int) (200),__ref._pressedcolor,_clr);
RDebugUtils.currentLine=11927560;
 //BA.debugLineNum = 11927560;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _removeat(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "removeat"))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
app.aegdistribuzione.customlistview._clvitem _removeitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _i = 0;
app.aegdistribuzione.customlistview._clvitem _item = null;
int _newoffset = 0;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub RemoveAt(Index As Int)";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="If getSize <= 1 Then";
if (__ref._getsize(null)<=1) { 
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="Clear";
__ref._clear(null);
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_index));
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._items.getSize()-1);
_i = (int) (_index+1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="Dim item As CLVItem = items.Get(i)";
_item = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_i));
RDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="p = item.Panel";
_p = _item.Panel;
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="p.Tag = i - 1";
_p.setTag((Object)(_i-1));
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="Dim NewOffset As Int = GetPanelOffset(p) - item.";
_newoffset = (int) (__ref._getpaneloffset(null,_p)-_item.Size-__ref._dividersize);
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="SetPanelOffset(p, NewOffset)";
__ref._setpaneloffset(null,_p,(float) (_newoffset));
 }
};
RDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize(null,(float) (__ref._getscrollviewcontentsize(null)-_removeitem.Size-__ref._dividersize));
RDebugUtils.currentLine=10551311;
 //BA.debugLineNum = 10551311;BA.debugLine="items.RemoveAt(Index)";
__ref._items.RemoveAt(_index);
RDebugUtils.currentLine=10551312;
 //BA.debugLineNum = 10551312;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel.RemoveViewFromParent();
RDebugUtils.currentLine=10551313;
 //BA.debugLineNum = 10551313;BA.debugLine="End Sub";
return "";
}
public String  _replaceat(app.aegdistribuzione.customlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemheight,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "replaceat"))
	 {return ((String) Debug.delegate(ba, "replaceat", new Object[] {_index,_pnl,_itemheight,_value}));}
app.aegdistribuzione.customlistview._clvitem _removeitem = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_index));
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="items.RemoveAt(Index)";
__ref._items.RemoveAt(_index);
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel.RemoveViewFromParent();
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
__ref._insertatimpl(null,_index,_pnl,_itemheight,_value,_removeitem.Size);
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="End Sub";
return "";
}
public String  _resizeitem(app.aegdistribuzione.customlistview __ref,int _index,int _itemheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "resizeitem"))
	 {return ((String) Debug.delegate(ba, "resizeitem", new Object[] {_index,_itemheight}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
Object _value = null;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanel(null,_index);
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Dim value As Object = items.Get(Index)";
_value = __ref._items.Get(_index);
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Dim parent As B4XView = p.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _p.getParent();
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="p.Color = parent.Color";
_p.setColor(_parent.getColor());
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
__ref._replaceat(null,_index,_p,_itemheight,_value);
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="End Sub";
return "";
}
public String  _scrollhandler(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "scrollhandler"))
	 {return ((String) Debug.delegate(ba, "scrollhandler", null));}
int _position = 0;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Private Sub ScrollHandler";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="Dim position As Int = GetScrollViewOffset";
_position = (int) (__ref._getscrollviewoffset(null));
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
if (_position+__ref._getscrollviewvisiblesize(null)>=__ref._getscrollviewcontentsize(null)-__c.DipToCurrent((int) (5)) && __c.DateTime.getNow()>__ref._lastreachendevent+100) { 
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
if (__ref._xui.SubExists(ba,__ref._callback,__ref._eventname+"_ReachEnd",(int) (0))) { 
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="LastReachEndEvent = DateTime.Now";
__ref._lastreachendevent = __c.DateTime.getNow();
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
__c.CallSubDelayed(ba,__ref._callback,__ref._eventname+"_ReachEnd");
 }else {
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
__ref._lastreachendevent = (long) (__c.DateTime.getNow()+1000*__c.DateTime.TicksPerDay);
 };
 };
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoitem(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "scrolltoitem"))
	 {return ((String) Debug.delegate(ba, "scrolltoitem", new Object[] {_index}));}
float _offset = 0f;
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Dim offset As Float = FindItemOffset(Index)";
_offset = (float) (__ref._finditemoffset(null,_index));
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Dim hv As HorizontalScrollView = sv";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
_hv.setObject((android.widget.HorizontalScrollView)(__ref._sv.getObject()));
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="hv.ScrollPosition = offset 'smooth scroll";
_hv.setScrollPosition((int) (_offset));
 }else {
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_nsv.setObject((android.widget.ScrollView)(__ref._sv.getObject()));
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="nsv.ScrollPosition = offset";
_nsv.setScrollPosition((int) (_offset));
 };
RDebugUtils.currentLine=11665421;
 //BA.debugLineNum = 11665421;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(app.aegdistribuzione.customlistview __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "sv_scrollchanged"))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="ScrollHandler";
__ref._scrollhandler(null);
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="End Sub";
return "";
}
}