
public class Motorrad extends Fahrzeug{
	public Motorrad(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch, boolean beiWagen) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		this.beiWagen = beiWagen;
		if(beiWagen)System.out.println("mit komfortablem Beiwagen");
	}

	private boolean beiWagen;
}
