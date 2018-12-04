B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txNome As EditText
	Private txPassword As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("loginlayout")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btLogin_Click
	Dim username As String = txNome.Text
	Dim password As String = txPassword.Text
	
	ProgressDialogShow2("Accesso in corso", False)
	
	Wait For (Starter.client.Login(username, password)) Complete (Result As Utente)
	
	If Starter.client.Successo Then
		Starter.User = Result
		Starter.db.SalvaUtente(Result)
		StartActivity(Main)
		Activity.Finish()
	Else
		ProgressDialogHide
		Msgbox("Nome utente o password errata", "Accesso")		
	End If
End Sub