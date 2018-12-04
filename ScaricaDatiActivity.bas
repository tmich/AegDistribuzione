B4A=true
Group=Activities
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim ProgressBar1 As ProgressBar
	'Dim job As HttpJob
	Dim BtnAggiorna As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("ScaricaDatiLayout")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub BtnAggiorna_Click
	BtnAggiorna.Enabled = False
	Dim error As Boolean = False
	Dim msg As String = ""
	
	ProgressDialogShow2("Aggiornamento in corso", False)
	
	' 1. Clienti
	Wait For (Starter.client.ScaricaClienti) Complete (Result As List)
	If Starter.client.Successo Then
		ProgressBar1.Progress = 25
		If Result.Size > 0 Then
			Starter.db.SalvaClienti(Result)
		End If
	Else
		error = True
		msg = "Errore durante l'aggiornamento dei clienti"
	End If
	
	' 2. Articoli
	If error = False Then
		Wait For (Starter.client.ScaricaArticoli) Complete (Result As List)
		If Starter.client.Successo Then
			ProgressBar1.Progress = 40
			If Result.Size > 0 Then
				Starter.db.SalvaArticoli(Result)
			End If
		Else
			error = True
			msg = "Errore durante l'aggiornamento degli articoli"
		End If
	End If	
		
	' 3. Storico Ordini
	If error = False Then
		Wait For (Starter.client.StoricoOrdini) Complete (Result As List)
		If Starter.client.Successo Then
			ProgressBar1.Progress = 70
			If Result.Size > 0 Then
				Starter.db.SalvaStoricoOrdini(Result)
			End If
		Else
			error = True
			msg = "Errore durante l'aggiornamento dello storico ordini"
		End If
	End If
		
	' 4. Preferiti
	If error = False Then
		Wait For (Starter.client.ScaricaPreferiti) Complete (Result As List)
		If Starter.client.Successo Then
			ProgressBar1.Progress = 90
			If Result.Size > 0 Then
				Starter.db.SalvaPreferiti(Result)
			End If
		Else
			error = True
			msg = "Errore durante l'aggiornamento degli articoli preferiti"
		End If
	End If
		
'		Wait For (Starter.client.ScaricaUltimiOrdini) Complete (Ordini As List)
'		If Starter.client.Successo Then
'			If Result.Size > 0 Then
'				Starter.db.SalvaTuttiGliOrdini(Ordini)
'			End If
'			
'			ProgressBar1.Progress = 66
'			
'			' 3. Voci Ordini
'			Wait For (Starter.client.ScaricaVociUltimiOrdini) Complete (VociOrdini As List)
'			If Starter.client.Successo Then
'				If VociOrdini.Size > 0 Then
'					Starter.db.SalvaTutteLeVociOrdini(VociOrdini)
'				End If
'				ProgressBar1.Progress = 100
'			End If
'		End If
		
	BtnAggiorna.Enabled = True
	ProgressDialogHide()
	
	If error Then
		Msgbox(msg, "Errore")
		ProgressBar1.Progress = 0
	Else
		ToastMessageShow("Aggiornamento completato", False)
		Activity.Finish()
	End If
End Sub