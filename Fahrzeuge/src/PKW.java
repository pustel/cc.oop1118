
public class PKW extends Fahrzeug {
	public PKW(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch, String typ) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		this.typ = typ;
		System.out.println("Ich bin ein " + this.typ + ".");
		// TODO Auto-generated constructor stub
	}
	
	//Attribute
	private String typ;
	private double reichWeite = weitReiche();
	//methoden
	private double weitReiche() {
		double x = this.tankVolumen/this.verbrauch*100;
		return x;
	}
	public double quadrat() {
		double x = (this.reichWeite / 4)*(this.reichWeite / 4);
		return x;
	}
	}
