<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html> <head> <meta charset="UTF-8"> <title>TerminErinnerung</title> </head> <body>

<h1>TerminErinnerung</h1>

<p> Diese Webanwendung hilft Benutzern, ihre Termine zu verwalten und rechtzeitig an wichtige Ereignisse erinnert zu werden. </p>

<h2>Projektbeschreibung</h2>

<p> Das System ermöglicht die Erfassung und Verwaltung von Terminen. Benutzer können einen Termin mit Datum und Uhrzeit eingeben und die Daten an das System senden. </p>

<h2>Funktionen</h2>

<ul> <li>Neuen Termin erstellen</li> <li>Termin bearbeiten</li> <li>Termin löschen</li> <li>Alle Termine anzeigen</li> <li>Erinnerungen verwalten</li> </ul>

<h2>Verwendete Technologien</h2>

<ul> <li>Java</li> <li>JSP</li> <li>Jakarta Servlet</li> <li>HTML</li> <li>CSS</li> <li>Apache Tomcat</li> <li>MySQL (geplant)</li> </ul>

<h2>Ziel des Projekts</h2>

<p> Das Ziel dieses Projekts ist es, die Organisation von Terminen zu erleichtern und wichtige Ereignisse nicht zu vergessen. </p>

<h2>Projektinformationen</h2>

<p> Erstellt von: Olena Nikolaienko <br> Ausbildung: Fachinformatikerin für Anwendungsentwicklung <br> Projekt: TerminErinnerung </p>

<hr>

<h2>Neuen Termin anlegen</h2>

<form action="IndexServlet" method="post">

Terminname:<br>
<input type="text" name="termin" required>
<br><br>

Datum:<br>
<input type="date" name="datum" required>
<br><br>

Uhrzeit:<br>
<input type="time" name="uhrzeit" required>
<br><br>

<input type="submit" value="Termin speichern">

</form>

</body> 
</html>