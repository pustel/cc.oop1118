
public class Auto {
	// Attribute = Eigenschaften
	String marke;
	String modell;
	String serienNummer;
	int kw;
	int hubRaum;
	int anzahlSitze;
	double tankVolumen = 60;
	double verbrauch = 8;
	double reichweite;
	double gefahreneKm;
	double rest;
	double restKm;



	void druckeReichweite() {
		System.out.println("Reichweite: " + reichweite + " km");
	}

	void druckeInfo() {
//		druckeMarkeUndModell();
//		berechneReichweite();
		System.out.println("Tankvolumen: " + tankVolumen + " l");
		System.out.println("Verbrauch: " + verbrauch + "l/100 km");
		druckeReichweite();
		System.out.println();
	}

	void setzeAttribute(String marke, String modell, String serienNummer, int kW, int hubRaum, int anzahlSitze,
			int tankVolumen, int verbrauch) {
		this.marke = marke;
		this.modell = modell;
		this.serienNummer = serienNummer;
		this.kw = kW;
		this.hubRaum = hubRaum;
		this.anzahlSitze = anzahlSitze;
		this.tankVolumen = tankVolumen;
		
		this.verbrauch = verbrauch;
		// Wenn die nächste Zeile ausgeführt wird, dann wurde das Tankvolumen schon neu gesetzt.
		this.rest = this.tankVolumen;
		
	}

	void tankRest(int gefahreneKm) {
		//this.gefahreneKm = gefahreneKm = 0;
		
		this.rest = tankVolumen - (gefahreneKm * verbrauch / 100);
		this.restKm = Math.floor(rest / verbrauch * 100);
		
		System.out.println();
		System.out.printf("%s %.0f %s \n","Im Tank sollten sich noch" , this.rest , "l Treibstoff befinden");
		System.out.printf("%s %.0f %s \n","Das reicht etwa für" , restKm , "weitere Kilometer");
	}

	double tankBedarf() {
//		int bedarf = Math.floor( gefahrenekm*verbrauch);
//		return bedarf;

		return this.tankVolumen - this.rest;
	}
}
