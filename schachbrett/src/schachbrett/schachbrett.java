package schachbrett;

public class schachbrett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Loesung Lesemann
		double laenge = 4;
		double breite = 4;
				
		System.out.println("Lesemann");
		System.out.println();
		int zaehler = 0;

		for (int i = 1; i <= laenge; i++) { // Zeile
			for (int j = 1; j <= breite; j++) { // Spalte

				if (zaehler == 0) {
					System.out.print("#");
					zaehler = 1;
				} else {
					System.out.print(" ");
					zaehler = 0;
				}
			}
			if (breite %2 == 0) {
			if (zaehler == 0) {
				zaehler = 1;
			} else {
				zaehler = 0;
			}}
			
			System.out.println();}

	}

}
