package test;

public class Molecule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atom atom = new Atom(1, "Hydrogen", "H", 1, 1, 1);
		Atom a2 = new Atom();
		
		//atom.setAttributes(1, "Hydrogen", "H", 1, 1, 1);
		System.out.println(atom.toString());
		
	}
}
