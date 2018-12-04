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
public app.aegdistribuzione.starter _starter = null;
public app.aegdistribuzione.loginactivity _loginactivity = null;
public app.aegdistribuzione.scaricadatiactivity _scaricadatiactivity = null;
public app.aegdistribuzione.dettaglioordineactivity _dettaglioordineactivity = null;
public app.aegdistribuzione.clientiactivity _clientiactivity = null;
public app.aegdistribuzione.articoliactivity _articoliactivity = null;
public int  _getitemfromview(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getitemfromview"))
	 {return ((Integer) Debug.delegate(ba, "getitemfromview", new Object[] {_v}));}
Object _parent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _current = null;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim parent = v As Object, current As B4XView";
_parent = (Object)(_v.getObject());
_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
while ((__ref._sv.getScrollViewInnerPanel()).equals((java.lang.Object)(_parent)) == false) {
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="current = parent";
_current.setObject((java.lang.Object)(_parent));
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="parent = current.Parent";
_parent = (Object)(_current.getParent().getObject());
 }
;
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="v = current";
_v = _current;
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="Return v.Tag";
if (true) return (int)(BA.ObjectToNumber(_v.getTag()));
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="End Sub";
return 0;
}
public Object  _getvalue(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getvalue"))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Return GetItem(Index).Value";
if (true) return __ref._getitem(null,_index).Value;
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return null;
}
public String  _clear(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "clear"))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="items.Clear";
__ref._items.Clear();
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv.getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="SetScrollViewContentSize(0)";
__ref._setscrollviewcontentsize(null,(float) (0));
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="End Sub";
return "";
}
public String  _add(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "add"))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_pnl,_value}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
__ref._insertat(null,__ref._items.getSize(),_pnl,_value);
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _asview(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "asview"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub AsView As B4XView";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="End Sub";
return null;
}
public String  _insertat(app.aegdistribuzione.customlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertat"))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_pnl,_value}));}
float _size = 0f;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Dim size As Float";
_size = 0f;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="size = pnl.Width";
_size = (float) (_pnl.getWidth());
 }else {
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="size = pnl.Height";
_size = (float) (_pnl.getHeight());
 };
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
__ref._insertatimpl(null,_index,_pnl,(int) (_size),_value,(int) (0));
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(app.aegdistribuzione.customlistview __ref,Object _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "addtextitem"))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_text,_value}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
__ref._insertattextitem(null,__ref._items.getSize(),_text,_value);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
__c.Log("AddTextItem is only supported in vertical orientation.");
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createpanel(null,"");
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._createlabel(null,BA.ObjectToString(_text));
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
_lbl.setHeight((int) (__c.Max(__c.DipToCurrent((int) (50)),_lbl.getHeight())));
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
_pnl.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (2)),(int) (__ref._sv.getScrollViewContentWidth()-__c.DipToCurrent((int) (10))),_lbl.getHeight());
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="lbl.TextColor = DefaultTextColor";
_lbl.setTextColor(__ref._defaulttextcolor);
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
_pnl.setColor(__ref._defaulttextbackgroundcolor);
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="pnl.Height = lbl.Height + 2dip";
_pnl.setHeight((int) (_lbl.getHeight()+__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="InsertAt(Index, pnl, Value)";
__ref._insertat(null,_index,_pnl,_value);
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="Dim item As CLVItem = GetItem(Index)";
_item = __ref._getitem(null,_index);
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="item.TextItem = True";
_item.TextItem = __c.True;
RDebugUtils.currentLine=8912911;
 //BA.debugLineNum = 8912911;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim scrollbar As Int";
_scrollbar = 0;
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="If xui.IsB4J Then scrollbar = 20";
if (__ref._xui.getIsB4J()) { 
_scrollbar = (int) (20);};
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
__ref._sv.setScrollViewContentHeight((int) (_height-_scrollbar));
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="For Each it As CLVItem In items";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._items;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (app.aegdistribuzione.customlistview._clvitem)(group6.Get(index6));
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
_it.Panel.setHeight(__ref._sv.getScrollViewContentHeight());
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
_it.Panel.GetView((int) (0)).setHeight(_it.Panel.getHeight());
 }
};
 }else {
RDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
__ref._sv.setScrollViewContentWidth((int) (_width-_scrollbar));
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="For Each it As CLVItem In items";
{
final anywheresoftware.b4a.BA.IterableList group12 = __ref._items;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (app.aegdistribuzione.customlistview._clvitem)(group12.Get(index12));
RDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
_it.Panel.setWidth(__ref._sv.getScrollViewContentWidth());
RDebugUtils.currentLine=8257550;
 //BA.debugLineNum = 8257550;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
_it.Panel.GetView((int) (0)).setWidth(_it.Panel.getWidth());
RDebugUtils.currentLine=8257551;
 //BA.debugLineNum = 8257551;BA.debugLine="If it.TextItem Then";
if (_it.TextItem) { 
RDebugUtils.currentLine=8257552;
 //BA.debugLineNum = 8257552;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _it.Panel.GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=8257553;
 //BA.debugLineNum = 8257553;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
_lbl.SetLayoutAnimated((int) (0),_lbl.getLeft(),_lbl.getTop(),(int) (_it.Panel.getWidth()-_lbl.getLeft()),_lbl.getHeight());
 };
 }
};
 };
RDebugUtils.currentLine=8257557;
 //BA.debugLineNum = 8257557;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="Private DividerSize As Float";
_dividersize = 0f;
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="Private EventName As String";
_eventname = "";
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="Public DefaultTextColor As Int";
_defaulttextcolor = 0;
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="Public DefaultTextBackgroundColor As Int";
_defaulttextbackgroundcolor = 0;
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="Public AnimationDuration As Int = 300";
_animationduration = (int) (300);
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="Private LastReachEndEvent As Long";
_lastreachendevent = 0L;
RDebugUtils.currentLine=8060940;
 //BA.debugLineNum = 8060940;BA.debugLine="Private PressedColor As Int";
_pressedcolor = 0;
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="Private LastAnimatedAction As Int";
_lastanimatedaction = 0;
RDebugUtils.currentLine=8060943;
 //BA.debugLineNum = 8060943;BA.debugLine="Private DesignerLabel As Label";
_designerlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8060944;
 //BA.debugLineNum = 8060944;BA.debugLine="Private horizontal As Boolean";
_horizontal = false;
RDebugUtils.currentLine=8060948;
 //BA.debugLineNum = 8060948;BA.debugLine="Private su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=8060952;
 //BA.debugLineNum = 8060952;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="LastAnimatedAction = LastAnimatedAction + 1";
__ref._lastanimatedaction = (int) (__ref._lastanimatedaction+1);
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Dim MyIndex As Int = LastAnimatedAction";
_myindex = __ref._lastanimatedaction;
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Sleep(AnimationDuration + 50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "customlistview", "cleanafteranimation"),(int) (__ref._animationduration+50));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="If MyIndex <> LastAnimatedAction Then Return";
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
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="Dim Offset As Int = DividerSize";
_offset = (int) (__ref._dividersize);
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="For Each item As CLVItem In items";
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
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="SetPanelOffset(item.Panel, Offset)";
__ref._setpaneloffset(null,_item.Panel,(float) (_offset));
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="Offset = Offset + item.Size + DividerSize";
_offset = (int) (_offset+_item.Size+__ref._dividersize);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub SetPanelOffset (p As B4XView, offset A";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="p.Left = offset";
_p.setLeft((int) (_offset));
 }else {
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="p.Top = offset";
_p.setTop((int) (_offset));
 };
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewcontentsize(app.aegdistribuzione.customlistview __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "setscrollviewcontentsize"))
	 {return ((String) Debug.delegate(ba, "setscrollviewcontentsize", new Object[] {_f}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="sv.ScrollViewContentWidth = f";
__ref._sv.setScrollViewContentWidth((int) (_f));
 }else {
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="sv.ScrollViewContentHeight = f";
__ref._sv.setScrollViewContentHeight((int) (_f));
 };
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(app.aegdistribuzione.customlistview __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createlabel"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_txt}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub CreateLabel(txt As String) As B4XView";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="lbl.Gravity = DesignerLabel.Gravity";
_lbl.setGravity(__ref._designerlabel.getGravity());
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="lbl.TextSize = DesignerLabel.TextSize";
_lbl.setTextSize(__ref._designerlabel.getTextSize());
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="lbl.SingleLine = False";
_lbl.setSingleLine(__c.False);
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="lbl.Text = txt";
_lbl.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
_lbl.setWidth((int) (__ref._sv.getScrollViewContentWidth()-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="lbl.Height = su.MeasureMultilineTextHeight(lbl, t";
_lbl.setHeight(__ref._su.MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),BA.ObjectToCharSequence(_txt)));
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createpanel(app.aegdistribuzione.customlistview __ref,String _paneleventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createpanel"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createpanel", new Object[] {_paneleventname}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
if (true) return __ref._xui.CreatePanel(ba,_paneleventname);
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createscrollview(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createscrollview"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createscrollview", null));}
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub CreateScrollView As B4XView";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Dim hv As HorizontalScrollView";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="hv.Initialize(0, \"sv\")";
_hv.Initialize(ba,(int) (0),"sv");
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Return hv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_hv.getObject()));
 }else {
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="Dim nsv As ScrollView";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="nsv.Initialize2(0, \"sv\")";
_nsv.Initialize2(ba,(int) (0),"sv");
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="Return nsv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_nsv.getObject()));
 };
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(app.aegdistribuzione.customlistview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _o = "";
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="mBase = Base";
__ref._mbase.setObject((java.lang.Object)(_base));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
_o = BA.ObjectToString(_props.GetDefault((Object)("ListOrientation"),(Object)("Vertical")));
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="horizontal = o = \"Horizontal\"";
__ref._horizontal = (_o).equals("Horizontal");
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="sv = CreateScrollView";
__ref._sv = __ref._createscrollview(null);
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase.AddView((android.view.View)(__ref._sv.getObject()),(int) (0),(int) (0),__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
__ref._sv.getScrollViewInnerPanel().setColor(__ref._xui.PaintOrColorToColor(_props.Get((Object)("DividerColor"))));
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="DividerSize = DipToCurrent(Props.Get(\"DividerHeig";
__ref._dividersize = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("DividerHeight"))))));
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
__ref._pressedcolor = __ref._xui.PaintOrColorToColor(_props.Get((Object)("PressedColor")));
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
__ref._animationduration = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("InsertAnimationDuration"),(Object)(__ref._animationduration))));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
__ref._defaulttextcolor = __ref._xui.PaintOrColorToColor((Object)(_lbl.getTextColor()));
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
__ref._defaulttextbackgroundcolor = __ref._mbase.getColor();
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="DesignerLabel = Lbl";
__ref._designerlabel = _lbl;
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize(null,__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="End Sub";
return "";
}
public int  _finditemoffset(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "finditemoffset"))
	 {return ((Integer) Debug.delegate(ba, "finditemoffset", new Object[] {_index}));}
int _offset = 0;
int _i = 0;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Dim Offset As Int";
_offset = 0;
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="For i = 0 To Min(Index - 1, items.Size - 1)";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_index-1,__ref._items.getSize()-1));
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Offset = Offset + GetItem(i).Size + DividerSize";
_offset = (int) (_offset+__ref._getitem(null,_i).Size+__ref._dividersize);
 }
};
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Return Offset";
if (true) return _offset;
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="End Sub";
return 0;
}
public app.aegdistribuzione.customlistview._clvitem  _getitem(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getitem"))
	 {return ((app.aegdistribuzione.customlistview._clvitem) Debug.delegate(ba, "getitem", new Object[] {_index}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub GetItem(Index As Int) As CLVItem";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return items.Get(Index)";
if (true) return (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_index));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub GetBase As B4XView";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return null;
}
public int  _getfirstvisibleindex(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getfirstvisibleindex"))
	 {return ((Integer) Debug.delegate(ba, "getfirstvisibleindex", null));}
int _bottom = 0;
int _i = 0;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim bottom As Int";
_bottom = 0;
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="bottom = bottom +  GetItem(i).Size + DividerSize";
_bottom = (int) (_bottom+__ref._getitem(null,_i).Size+__ref._dividersize);
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="If bottom > GetScrollViewOffset Then Return i";
if (_bottom>__ref._getscrollviewoffset(null)) { 
if (true) return _i;};
 }
};
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="Return items.Size - 1";
if (true) return (int) (__ref._items.getSize()-1);
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewoffset(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewoffset"))
	 {return ((Float) Debug.delegate(ba, "getscrollviewoffset", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub GetScrollViewOffset As Float";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Return sv.ScrollViewOffsetX";
if (true) return (float) (__ref._sv.getScrollViewOffsetX());
 }else {
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Return sv.ScrollViewOffsetY";
if (true) return (float) (__ref._sv.getScrollViewOffsetY());
 };
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub getLastVisibleIndex As Int";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
_first = __ref._getfirstvisibleindex(null);
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Dim bottom As Int";
_bottom = 0;
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="bottom = bottom +  GetItem(i).Size + DividerSize";
_bottom = (int) (_bottom+__ref._getitem(null,_i).Size+__ref._dividersize);
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="If i >= first And bottom >= GetScrollViewOffset";
if (_i>=_first && _bottom>=__ref._getscrollviewoffset(null)+__ref._getscrollviewvisiblesize(null)) { 
if (true) return (int) (__c.Max(_i-1,_first));};
 }
};
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="Return items.Size - 1";
if (true) return (int) (__ref._items.getSize()-1);
RDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewvisiblesize(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewvisiblesize"))
	 {return ((Float) Debug.delegate(ba, "getscrollviewvisiblesize", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Return sv.Width";
if (true) return (float) (__ref._sv.getWidth());
 }else {
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Return sv.Height";
if (true) return (float) (__ref._sv.getHeight());
 };
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getpanel"))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Return GetItem(Index).Panel.GetView(0)";
if (true) return __ref._getitem(null,_index).Panel.GetView((int) (0));
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return null;
}
public float  _getpaneloffset(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getpaneloffset"))
	 {return ((Float) Debug.delegate(ba, "getpaneloffset", new Object[] {_p}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub GetPanelOffset (p As B4XView) As Float";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Return p.Left";
if (true) return (float) (_p.getLeft());
 }else {
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Return p.Top";
if (true) return (float) (_p.getTop());
 };
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="End Sub";
return 0f;
}
public float  _getscrollviewcontentsize(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewcontentsize"))
	 {return ((Float) Debug.delegate(ba, "getscrollviewcontentsize", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Return sv.ScrollViewContentWidth";
if (true) return (float) (__ref._sv.getScrollViewContentWidth());
 }else {
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="Return sv.ScrollViewContentHeight";
if (true) return (float) (__ref._sv.getScrollViewContentHeight());
 };
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="End Sub";
return 0f;
}
public int  _getsize(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getsize"))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Return items.Size";
if (true) return __ref._items.getSize();
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(app.aegdistribuzione.customlistview __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="EventName = vEventName";
__ref._eventname = _veventname;
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="CallBack = vCallBack";
__ref._callback = _vcallback;
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="items.Initialize";
__ref._items.Initialize();
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
__ref._defaulttextbackgroundcolor = __ref._xui.Color_White;
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="DefaultTextColor = xui.Color_Black";
__ref._defaulttextcolor = __ref._xui.Color_Black;
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub InsertAtImpl(Index As Int, Pnl As B4XV";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createpanel(null,"Panel");
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="p.Color = Pnl.Color";
_p.setColor(_pnl.getColor());
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Pnl.Color = xui.Color_Transparent";
_pnl.setColor(__ref._xui.Color_Transparent);
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),_itemsize,__ref._sv.getScrollViewContentHeight());
 }else {
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__ref._sv.getScrollViewContentWidth(),_itemsize);
 };
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="p.Tag = Index";
_p.setTag((Object)(_index));
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="Dim IncludeDividierHeight As Int";
_includedividierheight = 0;
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = D";
if (_initialsize==0) { 
_includedividierheight = (int) (__ref._dividersize);}
else {
_includedividierheight = (int) (0);};
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="Dim NewItem As CLVItem";
_newitem = new app.aegdistribuzione.customlistview._clvitem();
RDebugUtils.currentLine=9043982;
 //BA.debugLineNum = 9043982;BA.debugLine="NewItem.Panel = p";
_newitem.Panel = _p;
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="NewItem.Size = ItemSize";
_newitem.Size = _itemsize;
RDebugUtils.currentLine=9043984;
 //BA.debugLineNum = 9043984;BA.debugLine="NewItem.Value = Value";
_newitem.Value = _value;
RDebugUtils.currentLine=9043985;
 //BA.debugLineNum = 9043985;BA.debugLine="NewItem.Color = p.Color";
_newitem.Color = _p.getColor();
RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
if (_index==__ref._items.getSize() && _initialsize==0) { 
RDebugUtils.currentLine=9043987;
 //BA.debugLineNum = 9043987;BA.debugLine="items.Add(NewItem)";
__ref._items.Add((Object)(_newitem));
RDebugUtils.currentLine=9043988;
 //BA.debugLineNum = 9043988;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=9043989;
 //BA.debugLineNum = 9043989;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=9043990;
 //BA.debugLineNum = 9043990;BA.debugLine="offset = DividerSize";
_offset = (int) (__ref._dividersize);
 }else {
RDebugUtils.currentLine=9043992;
 //BA.debugLineNum = 9043992;BA.debugLine="offset = GetScrollViewContentSize";
_offset = (int) (__ref._getscrollviewcontentsize(null));
 };
RDebugUtils.currentLine=9043994;
 //BA.debugLineNum = 9043994;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9043995;
 //BA.debugLineNum = 9043995;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv.getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_itemsize,__ref._sv.getHeight());
 }else {
RDebugUtils.currentLine=9043997;
 //BA.debugLineNum = 9043997;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv.getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv.getWidth(),_itemsize);
 };
 }else {
RDebugUtils.currentLine=9044000;
 //BA.debugLineNum = 9044000;BA.debugLine="CleanAfterAnimation";
__ref._cleanafteranimation(null);
RDebugUtils.currentLine=9044001;
 //BA.debugLineNum = 9044001;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=9044002;
 //BA.debugLineNum = 9044002;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=9044003;
 //BA.debugLineNum = 9044003;BA.debugLine="offset = DividerSize";
_offset = (int) (__ref._dividersize);
 }else {
RDebugUtils.currentLine=9044005;
 //BA.debugLineNum = 9044005;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
_previtem = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get((int) (_index-1)));
RDebugUtils.currentLine=9044006;
 //BA.debugLineNum = 9044006;BA.debugLine="offset = GetPanelOffset(PrevItem.Panel) + PrevI";
_offset = (int) (__ref._getpaneloffset(null,_previtem.Panel)+_previtem.Size+__ref._dividersize);
 };
RDebugUtils.currentLine=9044008;
 //BA.debugLineNum = 9044008;BA.debugLine="For i = Index To items.Size - 1";
{
final int step39 = 1;
final int limit39 = (int) (__ref._items.getSize()-1);
_i = _index ;
for (;_i <= limit39 ;_i = _i + step39 ) {
RDebugUtils.currentLine=9044009;
 //BA.debugLineNum = 9044009;BA.debugLine="Dim It As CLVItem = items.Get(i)";
_it = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_i));
RDebugUtils.currentLine=9044010;
 //BA.debugLineNum = 9044010;BA.debugLine="Dim NewOffset As Int = GetPanelOffset(It.Panel)";
_newoffset = (int) (__ref._getpaneloffset(null,_it.Panel)+_itemsize-_initialsize+_includedividierheight);
RDebugUtils.currentLine=9044011;
 //BA.debugLineNum = 9044011;BA.debugLine="If Min(NewOffset, GetPanelOffset(It.Panel)) - G";
if (__c.Min(_newoffset,__ref._getpaneloffset(null,_it.Panel))-__ref._getscrollviewoffset(null)<__ref._getscrollviewvisiblesize(null)) { 
RDebugUtils.currentLine=9044012;
 //BA.debugLineNum = 9044012;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9044013;
 //BA.debugLineNum = 9044013;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel.SetLayoutAnimated(__ref._animationduration,_newoffset,(int) (0),_it.Size,_it.Panel.getHeight());
 }else {
RDebugUtils.currentLine=9044015;
 //BA.debugLineNum = 9044015;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel.SetLayoutAnimated(__ref._animationduration,(int) (0),_newoffset,_it.Panel.getWidth(),_it.Size);
 };
 }else {
RDebugUtils.currentLine=9044018;
 //BA.debugLineNum = 9044018;BA.debugLine="SetPanelOffset(It.Panel, NewOffset)";
__ref._setpaneloffset(null,_it.Panel,(float) (_newoffset));
 };
RDebugUtils.currentLine=9044020;
 //BA.debugLineNum = 9044020;BA.debugLine="It.Panel.Tag = i + 1";
_it.Panel.setTag((Object)(_i+1));
 }
};
RDebugUtils.currentLine=9044022;
 //BA.debugLineNum = 9044022;BA.debugLine="items.InsertAt(Index, NewItem)";
__ref._items.InsertAt(_index,(Object)(_newitem));
RDebugUtils.currentLine=9044023;
 //BA.debugLineNum = 9044023;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9044024;
 //BA.debugLineNum = 9044024;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv.getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_initialsize,__ref._sv.getHeight());
RDebugUtils.currentLine=9044025;
 //BA.debugLineNum = 9044025;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
_p.SetLayoutAnimated(__ref._animationduration,_offset,(int) (0),_itemsize,_p.getHeight());
 }else {
RDebugUtils.currentLine=9044027;
 //BA.debugLineNum = 9044027;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv.getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv.getWidth(),_initialsize);
RDebugUtils.currentLine=9044028;
 //BA.debugLineNum = 9044028;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, 0, offse";
_p.SetLayoutAnimated(__ref._animationduration,(int) (0),_offset,_p.getWidth(),_itemsize);
 };
 };
RDebugUtils.currentLine=9044031;
 //BA.debugLineNum = 9044031;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize(null,(float) (__ref._getscrollviewcontentsize(null)+_itemsize-_initialsize+_includedividierheight));
RDebugUtils.currentLine=9044032;
 //BA.debugLineNum = 9044032;BA.debugLine="If items.Size = 1 Then SetScrollViewContentSize(G";
if (__ref._items.getSize()==1) { 
__ref._setscrollviewcontentsize(null,(float) (__ref._getscrollviewcontentsize(null)+_includedividierheight));};
RDebugUtils.currentLine=9044033;
 //BA.debugLineNum = 9044033;BA.debugLine="End Sub";
return "";
}
public String  _jumptoitem(app.aegdistribuzione.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "jumptoitem"))
	 {return ((String) Debug.delegate(ba, "jumptoitem", new Object[] {_index}));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub JumpToItem(Index As Int)";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="SetScrollViewOffset(FindItemOffset(Index))";
__ref._setscrollviewoffset(null,(float) (__ref._finditemoffset(null,_index)));
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewoffset(app.aegdistribuzione.customlistview __ref,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "setscrollviewoffset"))
	 {return ((String) Debug.delegate(ba, "setscrollviewoffset", new Object[] {_offset}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="sv.ScrollViewOffsetX = offset";
__ref._sv.setScrollViewOffsetX((int) (_offset));
 }else {
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="sv.ScrollViewOffsetY = offset";
__ref._sv.setScrollViewOffsetY((int) (_offset));
 };
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="End Sub";
return "";
}
public String  _panel_click(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "panel_click"))
	 {return ((String) Debug.delegate(ba, "panel_click", null));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub Panel_Click";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="PanelClickHandler(Sender)";
__ref._panelclickhandler(null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim clr As Int = GetItem(SenderPanel.Tag).Color";
_clr = __ref._getitem(null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Color;
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedColo";
_senderpanel.SetColorAnimated((int) (50),_clr,__ref._pressedcolor);
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";
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
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
parent.__c.CallSubNew3(ba,__ref._callback,__ref._eventname+"_ItemClick",_senderpanel.getTag(),__ref._getitem(null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Value);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "customlistview", "panelclickhandler"),(int) (200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor, c";
_senderpanel.SetColorAnimated((int) (200),__ref._pressedcolor,_clr);
RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub RemoveAt(Index As Int)";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="If getSize <= 1 Then";
if (__ref._getsize(null)<=1) { 
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Clear";
__ref._clear(null);
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_index));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._items.getSize()-1);
_i = (int) (_index+1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Dim item As CLVItem = items.Get(i)";
_item = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_i));
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="p = item.Panel";
_p = _item.Panel;
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="p.Tag = i - 1";
_p.setTag((Object)(_i-1));
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="Dim NewOffset As Int = GetPanelOffset(p) - item.";
_newoffset = (int) (__ref._getpaneloffset(null,_p)-_item.Size-__ref._dividersize);
RDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="SetPanelOffset(p, NewOffset)";
__ref._setpaneloffset(null,_p,(float) (_newoffset));
 }
};
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize(null,(float) (__ref._getscrollviewcontentsize(null)-_removeitem.Size-__ref._dividersize));
RDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="items.RemoveAt(Index)";
__ref._items.RemoveAt(_index);
RDebugUtils.currentLine=8781840;
 //BA.debugLineNum = 8781840;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel.RemoveViewFromParent();
RDebugUtils.currentLine=8781841;
 //BA.debugLineNum = 8781841;BA.debugLine="End Sub";
return "";
}
public String  _replaceat(app.aegdistribuzione.customlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemheight,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "replaceat"))
	 {return ((String) Debug.delegate(ba, "replaceat", new Object[] {_index,_pnl,_itemheight,_value}));}
app.aegdistribuzione.customlistview._clvitem _removeitem = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (app.aegdistribuzione.customlistview._clvitem)(__ref._items.Get(_index));
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="items.RemoveAt(Index)";
__ref._items.RemoveAt(_index);
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel.RemoveViewFromParent();
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
__ref._insertatimpl(null,_index,_pnl,_itemheight,_value,_removeitem.Size);
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanel(null,_index);
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim value As Object = items.Get(Index)";
_value = __ref._items.Get(_index);
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Dim parent As B4XView = p.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _p.getParent();
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="p.Color = parent.Color";
_p.setColor(_parent.getColor());
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
__ref._replaceat(null,_index,_p,_itemheight,_value);
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="End Sub";
return "";
}
public String  _scrollhandler(app.aegdistribuzione.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "scrollhandler"))
	 {return ((String) Debug.delegate(ba, "scrollhandler", null));}
int _position = 0;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub ScrollHandler";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Dim position As Int = GetScrollViewOffset";
_position = (int) (__ref._getscrollviewoffset(null));
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
if (_position+__ref._getscrollviewvisiblesize(null)>=__ref._getscrollviewcontentsize(null)-__c.DipToCurrent((int) (5)) && __c.DateTime.getNow()>__ref._lastreachendevent+100) { 
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
if (__ref._xui.SubExists(ba,__ref._callback,__ref._eventname+"_ReachEnd",(int) (0))) { 
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="LastReachEndEvent = DateTime.Now";
__ref._lastreachendevent = __c.DateTime.getNow();
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
__c.CallSubDelayed(ba,__ref._callback,__ref._eventname+"_ReachEnd");
 }else {
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
__ref._lastreachendevent = (long) (__c.DateTime.getNow()+1000*__c.DateTime.TicksPerDay);
 };
 };
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="Dim offset As Float = FindItemOffset(Index)";
_offset = (float) (__ref._finditemoffset(null,_index));
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="If horizontal Then";
if (__ref._horizontal) { 
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Dim hv As HorizontalScrollView = sv";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
_hv.setObject((android.widget.HorizontalScrollView)(__ref._sv.getObject()));
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="hv.ScrollPosition = offset 'smooth scroll";
_hv.setScrollPosition((int) (_offset));
 }else {
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_nsv.setObject((android.widget.ScrollView)(__ref._sv.getObject()));
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="nsv.ScrollPosition = offset";
_nsv.setScrollPosition((int) (_offset));
 };
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(app.aegdistribuzione.customlistview __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "sv_scrollchanged"))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="ScrollHandler";
__ref._scrollhandler(null);
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="End Sub";
return "";
}
}