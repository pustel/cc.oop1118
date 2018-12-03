
public class Tankstelle {

	double literPreis = 1.5;
	
	

	void vollTanken(double bedarf) {
		double gesamtPreis = bedarf * this.literPreis;	
		
		System.out.printf("%s %.2f %s", "Bitte entrichten sie", gesamtPreis , "€");
		

	}
}
