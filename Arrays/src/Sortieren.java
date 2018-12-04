
public class Sortieren {
	// Attribute
	// Initialisierung ohne Werte
	private int[] zahlen = new int[10];

	// Methoden
	public void starte() {
		// Array zahlen ausgeben
 		gebeIntArrayFor(zahlen);
		neueZeile();
		
		// Array zahlen mit Zufallszahlen füllen
		setzeArray(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();
		
		// Bubblesort aufrufen
		sortiereAufsteigend(zahlen);
		gebeIntArrayFor(zahlen);
		
	}
	
	private void neueZeile() {
		System.out.println();
	}
	private void gebeIntArrayForEach(int[] array) {
		// Array ausgeben
		// for each
		// Für jedes
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
	private void gebeIntArrayFor(int[] array) {
		// Aufgabe:
		// Komplettes Array ausgeben aber OHNE for each Schleife
		// Versuchen Sie, mit bereits bekannten Schleifen etwas zu basteln, was das
		// ganze Array ausgibt.
		// Zum Beispiel eine For schleife

		// Laufvariable i
		// Bedingung: i muss kleiner als die Anzahl der Einträge des Arrays sein
		// Anweisung: erhöhe i nach jedem Durchlauf um 1
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	// Gleichnamige Methoden mit unterschiedlichen Parametern nennt man
	// überladene Methoden.
	// Wichtig: Datentyp und Reihenfolge ist entscheidend
	private void setzeArray(int[] array, int wert) {
		for (int i = 0; i < array.length; i++) {
			array[i] = wert;
		}
	}
	private void setzeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = gebeZufallszahl();
		}
	}
	private int gebeZufallszahl() {
		return (int) (Math.random() * 100);
	}
	private void sortiereAufsteigend(int[] array) {
		// Bubblesort
		// 1. Zahlen tauschen
		for (int i= 0; i <= array.length-2; i++) {
			if(array[i] < array[i+1]) {
					int tmp = array[i+1];
					array[i+1] = array[i];
					array[i] = tmp;}
			
			
		}
	}
	private void sortiereAbsteigen(int[] array) {
		for (int stelle =0; stelle <= array.length-2; stelle++) {
			if(array[stelle] < array[stelle+1]) {
				int tmp = array[stelle+1];
				array[stelle+1] = array[stelle];
				array[stelle] = tmp;
			}
		}
	}
}
