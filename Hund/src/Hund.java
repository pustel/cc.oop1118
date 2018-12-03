
public class Hund {
	//Attribute
	String name;
	String rasse;
	String fellFarbe;
	char geschlecht;
	int groesse;
	
	//Methoden
	public void setzeAttrib(String name, String rasse, String fellFarbe,char geschlecht,int groesse) {
		this.name = name;
		this.rasse = rasse;
		this.fellFarbe = fellFarbe;
		this.geschlecht = geschlecht;
		this.groesse = groesse;
	}
	public void pinkeln() {}
	public void fressen(int gewicht) {}
	public void pupsen() {}
	public void trinke(double liter) {}
	
	public String getName() {
		return this.name;
	}
}
