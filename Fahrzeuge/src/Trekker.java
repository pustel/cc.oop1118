
public class Trekker extends Fahrzeug{
	public Trekker(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch, double zugKraft) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		this.zugKraft = zugKraft;
		System.out.println("Ich ziehe "+ zugKraft+" Tonnen!");
	}

	private double zugKraft;
}
