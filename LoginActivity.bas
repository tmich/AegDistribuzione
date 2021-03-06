﻿B4A=true
Group=Activities
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
	Private btLogin As Button
	Private lblErrore As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("loginlayout")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Errore(msg As String)
	lblErrore.Text = msg
	lblErrore.SetVisibleAnimated(1000, True)
	lblErrore.SetVisibleAnimated(5000, False)
End Sub

Sub btLogin_Click
	Dim username As String = txNome.Text
	Dim password As String = txPassword.Text
	
	If username.Trim().Length == 0 Or password.Trim().Length == 0 Then
		Return
	End If
	
	btLogin.Enabled = False
	ProgressDialogShow2("Accesso in corso", False)
	
	Wait For (Starter.client.Login(username, password)) Complete (Result As Utente)
	
	If Starter.client.Successo Then
		Starter.User = Result
		Starter.db.SalvaUtente(Result)
		StartActivity(Main)
		Activity.Finish()
	Else
		btLogin.Enabled = True
		ProgressDialogHide
		Errore(Starter.client.Errore)
	End If
End Sub