package app.aegdistribuzione;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class database extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "app.aegdistribuzione.database");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", app.aegdistribuzione.database.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public int _max_results = 0;
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
public app.aegdistribuzione.ordine  _getordineincorso(app.aegdistribuzione.database __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "getordineincorso"))
	 {return ((app.aegdistribuzione.ordine) Debug.delegate(ba, "getordineincorso", new Object[] {_id}));}
app.aegdistribuzione.ordine _o = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crs = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crs2 = null;
int _i = 0;
app.aegdistribuzione.voceordine _v = null;
float _prezzo = 0f;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub GetOrdineInCorso(id As Int) As Ordine";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim o As Ordine";
_o = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim crs As Cursor = Sql1.ExecQuery2(\"SELECT id, i";
_crs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_crs.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id, id_cliente, note FROM ordine_in_corso WHERE id = ?",new String[]{BA.NumberToString(_id)})));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="If crs.RowCount > 0 Then";
if (_crs.getRowCount()>0) { 
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="crs.Position = 0";
_crs.setPosition((int) (0));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="o.Initialize(crs.GetInt2(0), crs.GetInt2(1), Sta";
_o._initialize(null,ba,_crs.GetInt2((int) (0)),_crs.GetInt2((int) (1)),_starter._user._id,"",_crs.GetString2((int) (2)));
 }else {
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Return Null";
if (true) return (app.aegdistribuzione.ordine)(__c.Null);
 };
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="crs.Close";
_crs.Close();
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Dim crs2 As Cursor = Sql1.ExecQuery2(\"SELECT id,c";
_crs2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_crs2.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id,cod_art,desc_art,id_ordine,qta,prezzo,note FROM voce_ordine_in_corso "+"WHERE id_ordine = ?;",new String[]{BA.NumberToString(_id)})));
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="For i=0 To crs2.RowCount - 1";
{
final int step11 = 1;
final int limit11 = (int) (_crs2.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="crs2.Position = i";
_crs2.setPosition(_i);
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="Dim prezzo As Float = crs2.GetString(\"prezzo\")";
_prezzo = (float)(Double.parseDouble(_crs2.GetString("prezzo")));
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="v.Initialize(crs2.GetInt2(0), crs2.GetString2(1)";
_v._initialize(null,ba,_crs2.GetInt2((int) (0)),_crs2.GetString2((int) (1)),_crs2.GetString2((int) (2)),_id,_crs2.GetString("note"),_prezzo,_crs2.GetInt("qta"));
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="o.Voci.Add(v)";
_o._voci.Add((Object)(_v));
 }
};
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="crs2.Close";
_crs2.Close();
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="End Sub";
return null;
}
public String  _salvaordine(app.aegdistribuzione.database __ref,app.aegdistribuzione.ordine _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvaordine"))
	 {return ((String) Debug.delegate(ba, "salvaordine", new Object[] {_o}));}
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub SalvaOrdine(o As Ordine)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM voce_ordine where";
__ref._sql1.ExecNonQuery2("DELETE FROM voce_ordine where id_ordine = ?;",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_o._id)}));
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM ordine where id =";
__ref._sql1.ExecNonQuery2("DELETE FROM ordine where id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_o._id)}));
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO ordine (id, data_";
__ref._sql1.ExecNonQuery2("INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_o._id),(Object)(_o._datainvio),(Object)(_o._idcliente),(Object)(_o._idutente),(Object)(_o._note)}));
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="For Each v As VoceOrdine In o.Voci";
{
final anywheresoftware.b4a.BA.IterableList group5 = _o._voci;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (app.aegdistribuzione.voceordine)(group5.Get(index5));
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO voce_ordine (id,";
__ref._sql1.ExecNonQuery2("INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_v._id),(Object)(_v._codart),(Object)(_v._descart),(Object)(_v._idordine),(Object)(_v._qta),(Object)(_v._prezzo),(Object)(_v._note)}));
 }
};
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="End Sub";
return "";
}
public String  _eliminaordineincorso(app.aegdistribuzione.database __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "eliminaordineincorso"))
	 {return ((String) Debug.delegate(ba, "eliminaordineincorso", new Object[] {_id}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub EliminaOrdineInCorso(id As Int)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM voce_ordine_in_co";
__ref._sql1.ExecNonQuery2("DELETE FROM voce_ordine_in_corso WHERE id_ordine = ?;",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM ordine_in_corso W";
__ref._sql1.ExecNonQuery2("DELETE FROM ordine_in_corso WHERE id = ?;",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="End Sub";
return "";
}
public String  _salvastoricoordinipercliente(app.aegdistribuzione.database __ref,anywheresoftware.b4a.objects.collections.List _ordini,int _id_cliente) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvastoricoordinipercliente"))
	 {return ((String) Debug.delegate(ba, "salvastoricoordinipercliente", new Object[] {_ordini,_id_cliente}));}
String _qry1 = "";
String _qry2 = "";
app.aegdistribuzione.ordine _o = null;
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub SalvaStoricoOrdiniPerCliente(ordini As";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM voce_ordine WHERE";
__ref._sql1.ExecNonQuery2("DELETE FROM voce_ordine WHERE id_ordine IN (SELECT id FROM ordine WHERE id_cliente = ?);",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id_cliente)}));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM ordine WHERE id_c";
__ref._sql1.ExecNonQuery2("DELETE FROM ordine WHERE id_cliente = ?;",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id_cliente)}));
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Dim qry1 As String = \"INSERT INTO ordine (id, dat";
_qry1 = "INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);";
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Dim qry2 As String = \"INSERT INTO voce_ordine (id";
_qry2 = "INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);";
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="For Each o As Ordine In ordini";
{
final anywheresoftware.b4a.BA.IterableList group6 = _ordini;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_o = (app.aegdistribuzione.ordine)(group6.Get(index6));
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="Sql1.ExecNonQuery2(qry1, Array As Object(o.Id,o.";
__ref._sql1.ExecNonQuery2(_qry1,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_o._id),(Object)(_o._datainvio),(Object)(_o._idcliente),(Object)(_o._idutente),(Object)(_o._note)}));
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="For Each v As VoceOrdine In o.Voci";
{
final anywheresoftware.b4a.BA.IterableList group8 = _o._voci;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_v = (app.aegdistribuzione.voceordine)(group8.Get(index8));
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="Sql1.ExecNonQuery2(qry2, Array As Object(v.Id,v";
__ref._sql1.ExecNonQuery2(_qry2,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_v._id),(Object)(_v._codart),(Object)(_v._descart),(Object)(_v._idordine),(Object)(_v._qta),(Object)(_v._prezzo),(Object)(_v._note)}));
 }
};
 }
};
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="End Sub";
return "";
}
public String  _salvapreferitipercliente(app.aegdistribuzione.database __ref,anywheresoftware.b4a.objects.collections.List _preferiti,int _id_cliente) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvapreferitipercliente"))
	 {return ((String) Debug.delegate(ba, "salvapreferitipercliente", new Object[] {_preferiti,_id_cliente}));}
String _ins = "";
app.aegdistribuzione.preferito _p = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub SalvaPreferitiPerCliente(preferiti As L";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM preferiti WHERE i";
__ref._sql1.ExecNonQuery2("DELETE FROM preferiti WHERE id_cliente = ?;",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id_cliente)}));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim ins As String = \"INSERT INTO preferiti (id_cl";
_ins = "INSERT INTO preferiti (id_cliente, cod_art, desc_art, id_art, occorrenze) VALUES(?,?,?,?,?);";
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="For Each p As Preferito In preferiti";
{
final anywheresoftware.b4a.BA.IterableList group4 = _preferiti;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_p = (app.aegdistribuzione.preferito)(group4.Get(index4));
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Sql1.ExecNonQuery2(ins, Array As Object(p.IdClie";
__ref._sql1.ExecNonQuery2(_ins,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_p._idcliente),(Object)(_p._codice),(Object)(_p._descrizione),(Object)(_p._idart),(Object)(_p._occorrenze)}));
 }
};
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="End Sub";
return "";
}
public app.aegdistribuzione.voceordine  _getvoce(app.aegdistribuzione.database __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "getvoce"))
	 {return ((app.aegdistribuzione.voceordine) Debug.delegate(ba, "getvoce", new Object[] {_id}));}
app.aegdistribuzione.voceordine _v = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crs = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub GetVoce(id As Int) As VoceOrdine";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim crs As Cursor = Sql1.ExecQuery2(\"SELECT id,co";
_crs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_crs.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id,cod_art, desc_art, id_ordine, qta, prezzo, note FROM voce_ordine_in_corso WHERE id=?",new String[]{BA.NumberToString(_id)})));
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="If crs.RowCount == 0 Then";
if (_crs.getRowCount()==0) { 
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Return Null";
if (true) return (app.aegdistribuzione.voceordine)(__c.Null);
 }else {
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="crs.Position = 0";
_crs.setPosition((int) (0));
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="v.Initialize(crs.GetInt(\"id\"), crs.GetString(\"co";
_v._initialize(null,ba,_crs.GetInt("id"),_crs.GetString("cod_art"),_crs.GetString("desc_art"),_crs.GetInt("id_ordine"),_crs.GetString("note"),(float)(Double.parseDouble(_crs.GetString("prezzo"))),_crs.GetInt("qta"));
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="Return v";
if (true) return _v;
 };
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="End Sub";
return null;
}
public String  _eliminavoce(app.aegdistribuzione.database __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "eliminavoce"))
	 {return ((String) Debug.delegate(ba, "eliminavoce", new Object[] {_id}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub EliminaVoce(id As Int)";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Sql1.ExecNonQuery2(\"DELETE FROM voce_ordine_in_co";
__ref._sql1.ExecNonQuery2("DELETE FROM voce_ordine_in_corso WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="End Sub";
return "";
}
public app.aegdistribuzione.cliente  _getcliente(app.aegdistribuzione.database __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "getcliente"))
	 {return ((app.aegdistribuzione.cliente) Debug.delegate(ba, "getcliente", new Object[] {_id}));}
app.aegdistribuzione.cliente _c = null;
String _qry = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub GetCliente(id As Int) As Cliente";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim c As Cliente";
_c = new app.aegdistribuzione.cliente();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim qry As String = \"SELECT id, codice,denominazi";
_qry = "SELECT id, codice,denominazione,indirizzo,piva,data_ultima_modifica from CLIENTE where id = ?;";
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim Cursor1 As Cursor = Sql1.ExecQuery2(qry, Arra";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2(_qry,new String[]{BA.NumberToString(_id)})));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="For i = 0 To Cursor1.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Cursor1.Position = i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="c.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
_c._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetString("codice"),_cursor1.GetString("denominazione"),_cursor1.GetString("indirizzo"),_cursor1.GetString("piva"),_cursor1.GetString("data_ultima_modifica"));
 }
};
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="End Sub";
return null;
}
public String  _aggiornavoce(app.aegdistribuzione.database __ref,app.aegdistribuzione.voceordine _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "aggiornavoce"))
	 {return ((String) Debug.delegate(ba, "aggiornavoce", new Object[] {_v}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub AggiornaVoce(v As VoceOrdine)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Sql1.ExecNonQuery2(\"UPDATE voce_ordine_in_corso S";
__ref._sql1.ExecNonQuery2("UPDATE voce_ordine_in_corso SET cod_art = ?, desc_art = ?, qta = ?, prezzo = ?, note = ? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_v._codart),(Object)(_v._descart),(Object)(_v._qta),(Object)(_v._prezzo),(Object)(_v._note),(Object)(_v._id)}));
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _caricavoci(app.aegdistribuzione.database __ref,int _idordine) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "caricavoci"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "caricavoci", new Object[] {_idordine}));}
anywheresoftware.b4a.objects.collections.List _voci = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.voceordine _vo = null;
float _prezzo = 0f;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub CaricaVoci(IdOrdine As Int) As List";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim voci As List";
_voci = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="voci.Initialize";
_voci.Initialize();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, cod_art, de";
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id, cod_art, desc_art, qta, prezzo, note FROM voce_ordine WHERE id_ordine = ?;",new String[]{BA.NumberToString(_idordine)})));
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="For i = 0 To Cursor1.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Cursor1.Position = i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="Dim vo As VoceOrdine";
_vo = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Dim prezzo As Float = Cursor1.GetString(\"prezzo\"";
_prezzo = (float)(Double.parseDouble(_cursor1.GetString("prezzo")));
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="vo.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetS";
_vo._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetString("cod_art"),_cursor1.GetString("desc_art"),_idordine,_cursor1.GetString("note"),_prezzo,_cursor1.GetInt("qta"));
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="voci.Add(vo)";
_voci.Add((Object)(_vo));
 }
};
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="Return voci";
if (true) return _voci;
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _caricavociordineincorso(app.aegdistribuzione.database __ref,int _idordineincorso) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "caricavociordineincorso"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "caricavociordineincorso", new Object[] {_idordineincorso}));}
anywheresoftware.b4a.objects.collections.List _voci = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.voceordine _vo = null;
float _prezzo = 0f;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub CaricaVociOrdineInCorso(IdOrdineInCors";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim voci As List";
_voci = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="voci.Initialize";
_voci.Initialize();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, cod_art, de";
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id, cod_art, desc_art, qta, prezzo, note FROM voce_ordine_in_corso WHERE id_ordine = ?;",new String[]{BA.NumberToString(_idordineincorso)})));
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="For i = 0 To Cursor1.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Cursor1.Position = i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Dim vo As VoceOrdine";
_vo = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="Dim prezzo As Float = Cursor1.GetString(\"prezzo\"";
_prezzo = (float)(Double.parseDouble(_cursor1.GetString("prezzo")));
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="vo.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetS";
_vo._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetString("cod_art"),_cursor1.GetString("desc_art"),_idordineincorso,_cursor1.GetString("note"),_prezzo,_cursor1.GetInt("qta"));
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="voci.Add(vo)";
_voci.Add((Object)(_vo));
 }
};
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="Return voci";
if (true) return _voci;
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _cercaarticolipernome(app.aegdistribuzione.database __ref,String _denom) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "cercaarticolipernome"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "cercaarticolipernome", new Object[] {_denom}));}
anywheresoftware.b4a.objects.collections.List _articoli = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.articolo _a = null;
float _prezzo = 0f;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub CercaArticoliPerNome(denom As String) A";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim Articoli As List";
_articoli = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Articoli.Initialize";
_articoli.Initialize();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim Cursor1 As Cursor = Sql1.ExecQuery2(\"SELECT i";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id, codice, descrizione, prezzo, data_ultima_modifica FROM articolo "+"WHERE descrizione LIKE ? ORDER BY descrizione LIMIT ?;",new String[]{"%"+_denom+"%",BA.NumberToString(__ref._max_results)})));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Dim a As Articolo";
_a = new app.aegdistribuzione.articolo();
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Dim prezzo As Float = Cursor1.GetString(\"prezzo\"";
_prezzo = (float)(Double.parseDouble(_cursor1.GetString("prezzo")));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="a.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
_a._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetString("codice"),_cursor1.GetString("descrizione"),_prezzo,_cursor1.GetString("data_ultima_modifica"));
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="Articoli.Add(a)";
_articoli.Add((Object)(_a));
 }
};
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="Return Articoli";
if (true) return _articoli;
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _cercaclientipernome(app.aegdistribuzione.database __ref,String _denom) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "cercaclientipernome"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "cercaclientipernome", new Object[] {_denom}));}
anywheresoftware.b4a.objects.collections.List _clienti = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.cliente _c = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub CercaClientiPerNome(denom As String) As";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim clienti As List";
_clienti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="clienti.Initialize";
_clienti.Initialize();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, codice, den";
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id, codice, denominazione, indirizzo, piva, data_ultima_modifica "+" FROM cliente WHERE denominazione like ? ORDER BY denominazione LIMIT ?;",new String[]{"%"+_denom+"%",BA.NumberToString(__ref._max_results)})));
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Dim c As Cliente";
_c = new app.aegdistribuzione.cliente();
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="c.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
_c._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetString("codice"),_cursor1.GetString("denominazione"),_cursor1.GetString("indirizzo"),_cursor1.GetString("piva"),_cursor1.GetString("data_ultima_modifica"));
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="clienti.Add(c)";
_clienti.Add((Object)(_c));
 }
};
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="Return clienti";
if (true) return _clienti;
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(app.aegdistribuzione.database __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim Sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim MAX_RESULTS As Int=100";
_max_results = (int) (100);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="End Sub";
return "";
}
public String  _close(app.aegdistribuzione.database __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "close"))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If Sql1.IsInitialized Then";
if (__ref._sql1.IsInitialized()) { 
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Sql1.Close";
__ref._sql1.Close();
 };
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="End Sub";
return "";
}
public String  _createtables(app.aegdistribuzione.database __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "createtables"))
	 {return ((String) Debug.delegate(ba, "createtables", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub CreateTables";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS cliente;\"";
__ref._sql1.ExecNonQuery("DROP TABLE IF EXISTS cliente;");
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE cliente (id INTEG";
__ref._sql1.ExecNonQuery("CREATE TABLE cliente (id INTEGER PRIMARY KEY, codice TEXT, denominazione TEXT, indirizzo TEXT, piva TEXT, data_ultima_modifica TEXT);");
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS articolo;";
__ref._sql1.ExecNonQuery("DROP TABLE IF EXISTS articolo;");
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE articolo (id INTE";
__ref._sql1.ExecNonQuery("CREATE TABLE articolo (id INTEGER PRIMARY KEY, codice TEXT, descrizione TEXT, prezzo FLOAT, data_ultima_modifica TEXT);");
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS ordine_in";
__ref._sql1.ExecNonQuery("DROP TABLE IF EXISTS ordine_in_corso;");
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE ordine_in_corso (";
__ref._sql1.ExecNonQuery("CREATE TABLE ordine_in_corso (id INTEGER PRIMARY KEY, id_cliente INTEGER, note TEXT);");
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS voce_ordi";
__ref._sql1.ExecNonQuery("DROP TABLE IF EXISTS voce_ordine_in_corso;");
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE voce_ordine_in_co";
__ref._sql1.ExecNonQuery("CREATE TABLE voce_ordine_in_corso (id INTEGER PRIMARY KEY, cod_art TEXT, desc_art TEXT, "+"id_ordine INTEGER, qta INTEGER, prezzo FLOAT, note TEXT);");
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS ordine;\")";
__ref._sql1.ExecNonQuery("DROP TABLE IF EXISTS ordine;");
RDebugUtils.currentLine=1769492;
 //BA.debugLineNum = 1769492;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE ordine (id INTEGE";
__ref._sql1.ExecNonQuery("CREATE TABLE ordine (id INTEGER PRIMARY KEY, data_invio TEXT, id_cliente INTEGER, id_utente INTEGER, note TEXT);");
RDebugUtils.currentLine=1769495;
 //BA.debugLineNum = 1769495;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS voce_ordi";
__ref._sql1.ExecNonQuery("DROP TABLE IF EXISTS voce_ordine;");
RDebugUtils.currentLine=1769496;
 //BA.debugLineNum = 1769496;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE voce_ordine (id I";
__ref._sql1.ExecNonQuery("CREATE TABLE voce_ordine (id INTEGER PRIMARY KEY, cod_art TEXT, desc_art TEXT, "+"id_ordine INTEGER, qta INTEGER, prezzo FLOAT, note TEXT);");
RDebugUtils.currentLine=1769500;
 //BA.debugLineNum = 1769500;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS preferiti";
__ref._sql1.ExecNonQuery("DROP TABLE IF EXISTS preferiti;");
RDebugUtils.currentLine=1769501;
 //BA.debugLineNum = 1769501;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE preferiti (id_cli";
__ref._sql1.ExecNonQuery("CREATE TABLE preferiti (id_cliente INTEGER, cod_art TEXT, desc_art TEXT, "+"id_art INTEGER, occorrenze INTEGER);");
RDebugUtils.currentLine=1769505;
 //BA.debugLineNum = 1769505;BA.debugLine="Sql1.ExecNonQuery(\"DROP TABLE IF EXISTS utente;\")";
__ref._sql1.ExecNonQuery("DROP TABLE IF EXISTS utente;");
RDebugUtils.currentLine=1769506;
 //BA.debugLineNum = 1769506;BA.debugLine="Sql1.ExecNonQuery(\"CREATE TABLE utente (id INTEGE";
__ref._sql1.ExecNonQuery("CREATE TABLE utente (id INTEGER PRIMARY KEY, username TEXT, ultimo_accesso TEXT);");
RDebugUtils.currentLine=1769508;
 //BA.debugLineNum = 1769508;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getarticoli(app.aegdistribuzione.database __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "getarticoli"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getarticoli", null));}
anywheresoftware.b4a.objects.collections.List _articoli = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.articolo _a = null;
float _prezzo = 0f;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="public Sub GetArticoli() As List";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim Articoli As List";
_articoli = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Articoli.Initialize";
_articoli.Initialize();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim Cursor1 As Cursor = Sql1.ExecQuery2(\"SELECT i";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id, codice, descrizione, prezzo, data_ultima_modifica FROM articolo LIMIT ?;",new String[]{BA.NumberToString(__ref._max_results)})));
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Dim a As Articolo";
_a = new app.aegdistribuzione.articolo();
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Dim prezzo As Float = Cursor1.GetString(\"prezzo\"";
_prezzo = (float)(Double.parseDouble(_cursor1.GetString("prezzo")));
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="a.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
_a._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetString("codice"),_cursor1.GetString("descrizione"),_prezzo,_cursor1.GetString("data_ultima_modifica"));
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Articoli.Add(a)";
_articoli.Add((Object)(_a));
 }
};
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="Return Articoli";
if (true) return _articoli;
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getclienti(app.aegdistribuzione.database __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "getclienti"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getclienti", null));}
anywheresoftware.b4a.objects.collections.List _clienti = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.cliente _c = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub GetClienti() As List";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim Clienti As List";
_clienti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Clienti.Initialize";
_clienti.Initialize();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, codice, den";
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id, codice, denominazione, indirizzo, piva, data_ultima_modifica "+" FROM cliente ORDER BY denominazione LIMIT ?;",new String[]{BA.NumberToString(__ref._max_results)})));
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Dim c As Cliente";
_c = new app.aegdistribuzione.cliente();
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="Cursor1.Position=i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="c.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetSt";
_c._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetString("codice"),_cursor1.GetString("denominazione"),_cursor1.GetString("indirizzo"),_cursor1.GetString("piva"),_cursor1.GetString("data_ultima_modifica"));
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="Clienti.Add(c)";
_clienti.Add((Object)(_c));
 }
};
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="Return Clienti";
if (true) return _clienti;
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getpreferiticliente(app.aegdistribuzione.database __ref,int _cid) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "getpreferiticliente"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getpreferiticliente", new Object[] {_cid}));}
anywheresoftware.b4a.objects.collections.List _preferiti = null;
String _qry = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.preferito _p = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub GetPreferitiCliente(cid As Int) As List";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim preferiti As List";
_preferiti = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim qry As String = \"SELECT id_cliente,cod_art,de";
_qry = "SELECT id_cliente,cod_art,desc_art,id_art,occorrenze FROM preferiti WHERE id_cliente = ? ORDER BY occorrenze DESC;";
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim Cursor1 As Cursor = Sql1.ExecQuery2(qry, Arra";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2(_qry,new String[]{BA.NumberToString(_cid)})));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="preferiti.Initialize";
_preferiti.Initialize();
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="For i = 0 To Cursor1.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Cursor1.Position = i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim p As Preferito";
_p = new app.aegdistribuzione.preferito();
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="p.Initialize(Cursor1.GetInt(\"id_art\"), Cursor1.G";
_p._initialize(null,ba,_cursor1.GetInt("id_art"),_cursor1.GetString("cod_art"),_cursor1.GetString("desc_art"),_cursor1.GetInt("id_cliente"),_cursor1.GetInt("occorrenze"));
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="preferiti.Add(p)";
_preferiti.Add((Object)(_p));
 }
};
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="Return preferiti";
if (true) return _preferiti;
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="End Sub";
return null;
}
public app.aegdistribuzione.utente  _getutente(app.aegdistribuzione.database __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "getutente"))
	 {return ((app.aegdistribuzione.utente) Debug.delegate(ba, "getutente", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
app.aegdistribuzione.utente _u = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub GetUtente() As Utente";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Cursor1 = Sql1.ExecQuery(\"SELECT id, username, ul";
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT id, username, ultimo_accesso FROM utente LIMIT 1;")));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="If Cursor1.RowCount = 0 Then";
if (_cursor1.getRowCount()==0) { 
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Return Null";
if (true) return (app.aegdistribuzione.utente)(__c.Null);
 };
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Cursor1.Position = 0";
_cursor1.setPosition((int) (0));
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Dim u As Utente";
_u = new app.aegdistribuzione.utente();
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="u.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetStr";
_u._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetString("username"),_cursor1.GetString("ultimo_accesso"));
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Return u";
if (true) return _u;
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="End Sub";
return null;
}
public String  _initialize(app.aegdistribuzione.database __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Sql1.Initialize(File.DirInternal, \"aegd.db\", True";
__ref._sql1.Initialize(__c.File.getDirInternal(),"aegd.db",__c.True);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="If TablesExist = False Then";
if (__ref._tablesexist(null)==__c.False) { 
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="CreateTables";
__ref._createtables(null);
 };
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="End Sub";
return "";
}
public boolean  _tablesexist(app.aegdistribuzione.database __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "tablesexist"))
	 {return ((Boolean) Debug.delegate(ba, "tablesexist", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub TablesExist As Boolean";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Try";
try {RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Sql1.ExecQuery(\"SELECT id FROM cliente LIMIT 1;\"";
__ref._sql1.ExecQuery("SELECT id FROM cliente LIMIT 1;");
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(getActivityBA())));
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="End Sub";
return false;
}
public app.aegdistribuzione.voceordine  _nuovavoce(app.aegdistribuzione.database __ref,app.aegdistribuzione.ordine _o,String _cod,String _desc,int _q,float _prz,String _nt) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "nuovavoce"))
	 {return ((app.aegdistribuzione.voceordine) Debug.delegate(ba, "nuovavoce", new Object[] {_o,_cod,_desc,_q,_prz,_nt}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _crs = null;
int _id = 0;
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub NuovaVoce(o As Ordine, cod As String, d";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO voce_ordine_in_co";
__ref._sql1.ExecNonQuery2("INSERT INTO voce_ordine_in_corso (cod_art, desc_art, id_ordine, qta, prezzo, note) "+"VALUES(?,?,?,?,?,?);",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cod),(Object)(_desc),(Object)(_o._id),(Object)(_q),(Object)(_prz),(Object)(_nt)}));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="Dim crs As Cursor = Sql1.ExecQuery(\"SELECT last_i";
_crs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_crs.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT last_insert_rowid();")));
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="crs.Position = 0";
_crs.setPosition((int) (0));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Dim id As Int = crs.GetInt2(0)";
_id = _crs.GetInt2((int) (0));
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="crs.Close";
_crs.Close();
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="Dim v As VoceOrdine";
_v = new app.aegdistribuzione.voceordine();
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="v.Initialize(id, cod, desc, o.Id, nt, prz, q)";
_v._initialize(null,ba,_id,_cod,_desc,_o._id,_nt,_prz,_q);
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="Return v";
if (true) return _v;
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="End Sub";
return null;
}
public app.aegdistribuzione.ordine  _nuovoordine(app.aegdistribuzione.database __ref,app.aegdistribuzione.cliente _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "nuovoordine"))
	 {return ((app.aegdistribuzione.ordine) Debug.delegate(ba, "nuovoordine", new Object[] {_c}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _crs = null;
int _id = 0;
app.aegdistribuzione.ordine _o = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub NuovoOrdine(c As Cliente) As Ordine";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO ordine_in_corso (";
__ref._sql1.ExecNonQuery2("INSERT INTO ordine_in_corso (id_cliente) VALUES(?);",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_c._id)}));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="Dim crs As Cursor = Sql1.ExecQuery(\"SELECT last_i";
_crs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_crs.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT last_insert_rowid();")));
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="crs.Position = 0";
_crs.setPosition((int) (0));
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="Dim id As Int = crs.GetInt2(0)";
_id = _crs.GetInt2((int) (0));
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="crs.Close";
_crs.Close();
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="Dim o As Ordine";
_o = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="o.Initialize(id, c.Id, Starter.User.Id, \"\", \"\")";
_o._initialize(null,ba,_id,_c._id,_starter._user._id,"","");
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _ordiniincorsopercliente(app.aegdistribuzione.database __ref,int _idcliente) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "ordiniincorsopercliente"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "ordiniincorsopercliente", new Object[] {_idcliente}));}
anywheresoftware.b4a.objects.collections.List _ordini = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.ordine _o = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub OrdiniInCorsoPerCliente(IdCliente As In";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim Ordini As List";
_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Ordini.Initialize";
_ordini.Initialize();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id,id_cliente,n";
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id,id_cliente,note FROM ordine_in_corso WHERE id_cliente = ? ORDER BY id DESC;",new String[]{BA.NumberToString(_idcliente)})));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Cursor1.Position = i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="Dim o As Ordine";
_o = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="o.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetIn";
_o._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetInt("id_cliente"),_starter._user._id,"",_cursor1.GetString("note"));
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="o.Voci.AddAll(CaricaVociOrdineInCorso(o.Id))";
_o._voci.AddAll(__ref._caricavociordineincorso(null,_o._id));
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="Ordini.Add(o)";
_ordini.Add((Object)(_o));
 }
};
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="Return Ordini";
if (true) return _ordini;
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _ordinipercliente(app.aegdistribuzione.database __ref,int _idcliente) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "ordinipercliente"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "ordinipercliente", new Object[] {_idcliente}));}
anywheresoftware.b4a.objects.collections.List _ordini = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _i = 0;
app.aegdistribuzione.ordine _o = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub OrdiniPerCliente(IdCliente As Int) As L";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim Ordini As List";
_ordini = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Ordini.Initialize";
_ordini.Initialize();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Cursor1 = Sql1.ExecQuery2(\"SELECT id, data_invio,";
_cursor1.setObject((android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT id, data_invio,id_cliente,id_utente,note FROM ordine WHERE id_cliente = ? ORDER BY id DESC;",new String[]{BA.NumberToString(_idcliente)})));
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="For i=0 To Cursor1.RowCount - 1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor1.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Cursor1.Position = i";
_cursor1.setPosition(_i);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Dim o As Ordine";
_o = new app.aegdistribuzione.ordine();
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="o.Initialize(Cursor1.GetInt(\"id\"), Cursor1.GetIn";
_o._initialize(null,ba,_cursor1.GetInt("id"),_cursor1.GetInt("id_cliente"),_cursor1.GetInt("id_utente"),_cursor1.GetString("data_invio"),_cursor1.GetString("note"));
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="o.Voci.AddAll(CaricaVoci(o.Id))";
_o._voci.AddAll(__ref._caricavoci(null,_o._id));
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Ordini.Add(o)";
_ordini.Add((Object)(_o));
 }
};
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="Return Ordini";
if (true) return _ordini;
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="End Sub";
return null;
}
public String  _salvaarticoli(app.aegdistribuzione.database __ref,anywheresoftware.b4a.objects.collections.List _articoli) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvaarticoli"))
	 {return ((String) Debug.delegate(ba, "salvaarticoli", new Object[] {_articoli}));}
String _qry = "";
app.aegdistribuzione.articolo _a = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub SalvaArticoli(articoli As List)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM articolo\")";
__ref._sql1.ExecNonQuery("DELETE FROM articolo");
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Dim qry As String = \"INSERT INTO articolo (id, co";
_qry = "INSERT INTO articolo (id, codice, descrizione, prezzo, data_ultima_modifica) VALUES(?,?,?,?,?);";
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="For Each a As Articolo In articoli";
{
final anywheresoftware.b4a.BA.IterableList group4 = _articoli;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_a = (app.aegdistribuzione.articolo)(group4.Get(index4));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Sql1.ExecNonQuery2(qry, Array As Object(a.Id, a.";
__ref._sql1.ExecNonQuery2(_qry,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_a._id),(Object)(_a._codice),(Object)(_a._descrizione),(Object)(_a._prezzo),(Object)(_a._dataultimamodifica)}));
 }
};
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="End Sub";
return "";
}
public String  _salvaclienti(app.aegdistribuzione.database __ref,anywheresoftware.b4a.objects.collections.List _clienti) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvaclienti"))
	 {return ((String) Debug.delegate(ba, "salvaclienti", new Object[] {_clienti}));}
String _qry = "";
app.aegdistribuzione.cliente _c = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub SalvaClienti(clienti As List)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM cliente\")";
__ref._sql1.ExecNonQuery("DELETE FROM cliente");
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim qry As String = \"INSERT INTO cliente (id, cod";
_qry = "INSERT INTO cliente (id, codice,denominazione,indirizzo,piva,data_ultima_modifica) VALUES(?,?,?,?,?,?);";
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="For Each c As Cliente In clienti";
{
final anywheresoftware.b4a.BA.IterableList group4 = _clienti;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_c = (app.aegdistribuzione.cliente)(group4.Get(index4));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Sql1.ExecNonQuery2(qry, Array As Object(c.Id, c.";
__ref._sql1.ExecNonQuery2(_qry,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_c._id),(Object)(_c._codice),(Object)(_c._denominazione),(Object)(_c._indirizzo),(Object)(_c._partitaiva),(Object)(_c._dataultimamodifica)}));
 }
};
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="End Sub";
return "";
}
public String  _salvaordineincorso(app.aegdistribuzione.database __ref,app.aegdistribuzione.ordine _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvaordineincorso"))
	 {return ((String) Debug.delegate(ba, "salvaordineincorso", new Object[] {_o}));}
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub SalvaOrdineInCorso(o As Ordine)";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO ordine_in_corso (";
__ref._sql1.ExecNonQuery2("INSERT INTO ordine_in_corso (id_cliente, note) VALUES(?,?);",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_o._idcliente),(Object)(_o._note)}));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="For Each v As VoceOrdine In o.Voci";
{
final anywheresoftware.b4a.BA.IterableList group3 = _o._voci;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (app.aegdistribuzione.voceordine)(group3.Get(index3));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO voce_ordine_in_c";
__ref._sql1.ExecNonQuery2("INSERT INTO voce_ordine_in_corso (cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?);",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_v._codart),(Object)(_v._descart),(Object)(_v._idordine),(Object)(_v._qta),(Object)(_v._prezzo),(Object)(_v._note)}));
 }
};
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
return "";
}
public String  _salvapreferiti(app.aegdistribuzione.database __ref,anywheresoftware.b4a.objects.collections.List _preferiti) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvapreferiti"))
	 {return ((String) Debug.delegate(ba, "salvapreferiti", new Object[] {_preferiti}));}
String _ins = "";
app.aegdistribuzione.preferito _p = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub SalvaPreferiti(preferiti As List)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM preferiti;\")";
__ref._sql1.ExecNonQuery("DELETE FROM preferiti;");
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim ins As String = \"INSERT INTO preferiti (id_cl";
_ins = "INSERT INTO preferiti (id_cliente, cod_art, desc_art, id_art, occorrenze) VALUES(?,?,?,?,?);";
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="For Each p As Preferito In preferiti";
{
final anywheresoftware.b4a.BA.IterableList group4 = _preferiti;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_p = (app.aegdistribuzione.preferito)(group4.Get(index4));
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Sql1.ExecNonQuery2(ins, Array As Object(p.IdClie";
__ref._sql1.ExecNonQuery2(_ins,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_p._idcliente),(Object)(_p._codice),(Object)(_p._descrizione),(Object)(_p._idart),(Object)(_p._occorrenze)}));
 }
};
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="End Sub";
return "";
}
public String  _salvastoricoordini(app.aegdistribuzione.database __ref,anywheresoftware.b4a.objects.collections.List _ordini) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvastoricoordini"))
	 {return ((String) Debug.delegate(ba, "salvastoricoordini", new Object[] {_ordini}));}
String _qry1 = "";
String _qry2 = "";
app.aegdistribuzione.ordine _o = null;
app.aegdistribuzione.voceordine _v = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub SalvaStoricoOrdini(ordini As List)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM voce_ordine;\")";
__ref._sql1.ExecNonQuery("DELETE FROM voce_ordine;");
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Sql1.ExecNonQuery(\"DELETE FROM ordine;\")";
__ref._sql1.ExecNonQuery("DELETE FROM ordine;");
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Dim qry1 As String = \"INSERT INTO ordine (id, dat";
_qry1 = "INSERT INTO ordine (id, data_invio,id_cliente,id_utente,note) VALUES(?,?,?,?,?);";
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Dim qry2 As String = \"INSERT INTO voce_ordine (id";
_qry2 = "INSERT INTO voce_ordine (id, cod_art,desc_art,id_ordine,qta,prezzo,note) VALUES(?,?,?,?,?,?,?);";
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="For Each o As Ordine In ordini";
{
final anywheresoftware.b4a.BA.IterableList group6 = _ordini;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_o = (app.aegdistribuzione.ordine)(group6.Get(index6));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Sql1.ExecNonQuery2(qry1, Array As Object(o.Id,o.";
__ref._sql1.ExecNonQuery2(_qry1,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_o._id),(Object)(_o._datainvio),(Object)(_o._idcliente),(Object)(_o._idutente),(Object)(_o._note)}));
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="For Each v As VoceOrdine In o.Voci";
{
final anywheresoftware.b4a.BA.IterableList group8 = _o._voci;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_v = (app.aegdistribuzione.voceordine)(group8.Get(index8));
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Sql1.ExecNonQuery2(qry2, Array As Object(v.Id,v";
__ref._sql1.ExecNonQuery2(_qry2,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_v._id),(Object)(_v._codart),(Object)(_v._descart),(Object)(_v._idordine),(Object)(_v._qta),(Object)(_v._prezzo),(Object)(_v._note)}));
 }
};
 }
};
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="End Sub";
return "";
}
public String  _salvautente(app.aegdistribuzione.database __ref,app.aegdistribuzione.utente _usr) throws Exception{
__ref = this;
RDebugUtils.currentModule="database";
if (Debug.shouldDelegate(ba, "salvautente"))
	 {return ((String) Debug.delegate(ba, "salvautente", new Object[] {_usr}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub SalvaUtente(usr As Utente)";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Sql1.ExecNonQuery2(\"INSERT INTO utente (id, usern";
__ref._sql1.ExecNonQuery2("INSERT INTO utente (id, username, ultimo_accesso) VALUES(?, ?, ?);",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_usr._id),(Object)(_usr._nome),(Object)(_usr._ultimoaccesso)}));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="End Sub";
return "";
}
}