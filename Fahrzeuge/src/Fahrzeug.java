
public class Fahrzeug {

		//Attribute
		protected int anzahlRaeder;
		protected String farbe;
		protected String marke;
		protected String modell;
		protected double motorLeistung;
		protected double tankVolumen;
		protected double tankStand;
		protected double verbrauch;
		
		//Konstruktor
		public Fahrzeug(int anzahlRaeder, String farbe,	String marke, String modell, double motorLeistung, double tankVolumen, double verbrauch) {
			this.anzahlRaeder = anzahlRaeder;
			this.farbe = farbe;
			this.marke = marke;
			this.modell = modell;
			this.motorLeistung = motorLeistung;
			this.tankVolumen = tankVolumen;
			this.tankStand = tankVolumen;
			this.verbrauch = verbrauch;
			System.out.println("Ein neuer "+ this.modell+" wurde erworben. ");
		
		//	System.out.println("Mit einer Tankfüllung umfahre ich eine quadratische Fläche von "+ dasFahrzeug1.quadrat() + " km²");
			
			
		}
		protected void test() {
			System.out.println("test0");
		}
		
	}