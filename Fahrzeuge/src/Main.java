
public class Main {
	public static void main(String[] args) {
		PKW dasFahrzeug1 = new PKW(4, "Schwarz", "VW", "Bulli", 55, 120, 22, "Campingbus");
		Fahrzeug dasFahrzeug2 = new Motorrad(2, "rot", "Triumph", "Sieger", 55, 30, 8, false);
		Fahrzeug dasFahrzeug3 = new LKW(4, "orange", "Deutz", "501", 500, 1000, 50, 800);
		Fahrzeug dasFahrzeug4 = new Trekker(4,"Gr�n", "Kentucky", "Harvester", 1200, 3000, 130, 200);
		
		//System.out.println("Mit einer Tankf�llung umfahre ich eine quadratische Fl�che von "+ dasFahrzeug1.test() + " km�");
		dasFahrzeug1.quadrat();
		dasFahrzeug2.quadrat();
	}
}
