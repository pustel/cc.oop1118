import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner derScanner = new Scanner(System.in);
		Auto auto1 = new Auto();
//		Auto auto2 = new Auto();
//		Auto auto3 = new Auto();
		Tankstelle tankstelle = new Tankstelle();
		auto1.setzeAttribute("Audi", "A6", "4894078963", 48, 2, 5, 72, 8);
//		auto2.setzeAttribute("Mercedes", "C-Klasse", "FDAC734833877449", 55, 4, 5, 66, 12);
//		auto3.setzeAttribute("BMW", "3er", "F-BMW-3er-8394083242398", 75, 6, 2, 120, 23);

//		auto1.druckeInfo();	// Gibt das selbe aus, wie Zeile die letzen Zeilen
//		auto2.druckeInfo();
//		auto3.druckeInfo();

		int gefahreneKm = 0;
		char tankWunsch = ' ';
		double bedarf = 0.0;
		Scanner kbd = new Scanner(System.in);
		System.out.println("Wieviele Km sind sie bereits gefahren?");
		gefahreneKm = kbd.nextInt();
		
		auto1.tankRest(gefahreneKm);
		System.out.println("willst du tanken (y/n)?");
		
		tankWunsch = kbd.next().charAt(0);
		if (tankWunsch == 'y') {
			tankstelle.vollTanken(auto1.tankBedarf());
		} else {
			System.out.println("du will weiterfahren ohne Tank auffuellen? ok.");
		}
		kbd.close();

	}

}
