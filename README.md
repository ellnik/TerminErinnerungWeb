TerminErinnerungWeb

Projektbeschreibung

TerminErinnerungWeb ist eine Webanwendung zur Verwaltung von Terminen und Erinnerungen. 
Das Projekt wurde im Rahmen der Ausbildung zur Fachinformatikerin für Anwendungsentwicklung entwickelt.

Die Anwendung ermöglicht die Erfassung von Terminen über eine Weboberfläche. 
Die eingegebenen Daten werden mittels HTTP-POST an ein Servlet übertragen und dort verarbeitet.

Funktionen

Neuen Termin erfassen
Datum und Uhrzeit auswählen
Übertragung der Daten per HTTP-POST
Verarbeitung der Benutzereingaben im Servlet
Anzeige der übermittelten Daten im Browser

Verwendete Technologien
Java 21
JSP (Java Server Pages)
Jakarta Servlet
Maven
HTML
Apache Tomcat
MySQL (geplant)

Projektstruktur

src/main/java
└── servlet
    └── IndexServlet.java

src/main/webapp
└── index.jsp

Funktionsweise
Der Benutzer öffnet die Seite index.jsp.
Ein Terminname, Datum und Uhrzeit werden eingegeben.
Die Daten werden über ein HTML-Formular an das Servlet IndexServlet gesendet.
Das Servlet verarbeitet die Daten in der Methode doPost().
Die übermittelten Informationen werden im Browser angezeigt.
Aktueller Entwicklungsstand

✔ Maven-Webprojekt erstellt
✔ JSP-Webseite erstellt
✔ Servlet implementiert
✔ HTTP-POST Kommunikation eingerichtet
✔ Test auf Apache Tomcat erfolgreich durchgeführt

🔄 Speicherung in MySQL-Datenbank in Vorbereitung

Autorin
Olena Nikolaienko
Ausbildung: Fachinformatikerin für Anwendungsentwicklung
Projekt: TerminErinnerungWeb

result:https://github.com/ellnik/TerminErinnerungWeb/blob/main/projekt1.png
result:
