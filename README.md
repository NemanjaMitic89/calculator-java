# calculator-java
Za izvršenje zadatka "Metrika, pregled i statička analiza" koristio sam sonarqube platformu.
Zadatk je bio izračunati ukupan "LOC (Line of code - Linija koda)" i ciklomatska i kognitivna složenost metoda evaluateExpression i Calculate.

Ima ukupno 148 LOC, 
U Start.java ima 19 LOC, dok u Calculator.java ima 129 što je ukupno 148 LOC
Ciklomatska kompleksnost u Fajlu Calculator.java iznosi 26 dok je kognitivna kompleksnost 29.


Drugi zadatk je bio obavi neformalan pregled koda i njegovu statičku analizu (bez pokretanja koda). Zaključke formulisati u obliku izveštaja i to u sledećem formatu:

fajl – broj linije koda – zapažanje.
Za obavljanje statičke analize koda sam koristio SonarLint alat u VSC. Uz njegovu pomoć, sam pronašao nedoslednosti, propuste i sumnjive delove koda,na sledećim linijama koda u fajlu Start.java.

Start.java - LOC "1" - fajl nije dodeljen u pravi paket.
Start.java - LOC "6" - metoda Expression treba da se promeni u expression.
Start.java - LOC "8" - Sintaksna greška.
Start.java - LOC "19" - Sintaksna greška.

U fajlu Start.java su pronađene 4 nedoslednosti(Snell bug).
Sada prelazimo na fajl Calculator.java;

Calculator.java - LOC "1" - fajl nije dodeljen u pravi paket.
Calculator.java - LOC "4" - klasa Calculator treba da bude privatna a ne javna.
Calculator.java - LOC "18" - preimenovati metodu ToString da ne bi dolazilo do mešanja sa superklasom toString. i na ovoj liniji koda je pronađeno dva CODE SMELL
Calculator.java - LOC "24" - preimenovati metodu 
Calculator.java - LOC "70" - Sintaksna greška 
Calculator.java - LOC "74" - preimenovati metodu
Calculator.java - LOC "183" - višak komande

U Calculator.java fajlu pronađeno je ukupno 8 nedoslednosti (Smell Bug) 
Što je ukupno na kraju 12 nedoslednsoti (Smell bug).
