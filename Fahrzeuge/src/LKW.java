
public class LKW extends Fahrzeug{
	public LKW(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch, double ladeKapazitaet) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
		this.ladeKapazitaet = ladeKapazitaet;
		System.out.println("Mit "+ ladeKapazitaet+" tonnen Platz für Ladung");
	}

	private double ladeKapazitaet;
}
