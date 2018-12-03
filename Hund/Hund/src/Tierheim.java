
public class Tierheim {
	// Attribute
	private Hund hund1;
	private Katze katze1;
	//Methoden
	
	public void start() {	
		//Unser komplettes Programm werden wir hier shreiben
		oeffneTierheim();
		schliesseTierheim();
		nehmeNeuenHundAuf();
		}
	
	private void nehmeNeuenHundAuf() {
		hund1=new Hund();
		hund1.setzeAttrib("Bella","Jack Russell","schwarz",'w',10);
		System.out.println(hund1.getName()+" wurde aufgenommen");
	}
	private	void oeffneTierheim() {
		System.out.println("Das Tierheim ist geöffnet");
	}
		
	
	private void schliesseTierheim() {
		System.out.println("Das Tierheim ist jetzt geschlossen");
	}
	private void nehmeNeueKatzeAuf() {
	katze1=new Katze();
	katze1.setzeAttrib("Murr","Perser","schwarz",'w',10);
	katze1.setzeAttrib("Maunz", "Kurzhaar", "blau", 'm', 20);
	katze1.setzeAttrib("Karlchen", "Mischling", "braun", 'm', 12);
	
	
	System.out.println(katze1.getName()+" wurde aufgenommen");
}

}
