
public class Main {
	public static void main(String[] args) {
		//new object
		Tier dasTier = new Tier();
		Hund Hasso = new Hund();
		Katze Maunz = new Katze();
		Ratte Beule = new Ratte();
		
//		Hasso.fressen();
//		Maunz.fressen();
//		Beule.fressen();
//		Hasso.bellen();
//		Beule.bellen();
	
		//set
		Hasso.setAttributes("Hasso", "Bordercollie", "schwarz");
		Maunz.setAttributes("Maunz", "perser", "grau");
		Beule.setAttributes("Beule", "Wanderratte", "Schwarz-Weiﬂ");
		
		//get
		System.out.print("Hallo, ich bin ");
		System.out.println(Beule.getName());
		System.out.print("Ich bin eine ");
		System.out.print(Beule.getColor()+"e ");
		System.out.println(Beule.getRasse());
		System.out.println("Und ich bin sooo niedlich");
		System.out.println("bitte hol mich aus dem Tierheim ab");
		

		
}}
