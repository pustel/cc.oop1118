
public class Tier {
	//Attribs
	private String name;
	private String rasse;
	private String farbe;
	
	//Methods
	public void fressen(){
		System.out.println("majmmjammampf");
	}
	public void setAttributes(String name, String rasse, String farbe) {
		this.name = name;
		this.rasse = rasse;
		this.farbe = farbe;
	}
	public String getName() {
		return this.name;
	}
	public String getRasse() {
		return this.rasse;
	}
	public String getColor() {
		return this.farbe;
	}
}