B4A=true
Group=Classes
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub SingPlur(v As Int) As String
	If v == 1 Then
		Return "a"
	Else
		Return "e"
	End If
End Sub

Sub SingPlurM(v As Int) As String
	If v == 1 Then
		Return "o"
	Else
		Return "i"
	End If
End Sub