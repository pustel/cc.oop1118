package test;

import java.util.Scanner;
import.java.util.ArrayList;

public class Molecule {

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);

		System.out.print("Wieviele Atome soll das Molek�l haben? ");
		int n = kbd.nextInt();
//		kbd.close();
		Atom atom[] = new Atom[n];
		for (int i = 0; i <= n-1; i++) {
			atom[i] = new Atom();
			// setze inhalte
			System.out.println("Ordnungszahl?");
			int oz = kbd.nextInt();
			atom[i].setProtonNumber(oz);
			System.out.println("Name?");
			String eName = kbd.next();
			atom[i].setName(eName);
			System.out.println("Elementsymbol?");
			String symb = kbd.next();
			atom[i].setSymbol(symb);
//		System.out.println("PSE-Spalte?");
//		int group = kbd.nextInt();
//		atom[i].setGroup(group);
//		System.out.println("Welcher Periode eh�rt es an?");
//		int period = kbd.nextInt();
//		atom[i].setPeriod(period);
			System.out.println("Oxidationszahl?");
			int ox = kbd.nextInt();
			atom[i].setOxState(ox);

		}}
		int i=0;
		ArrayList<Integer> counter = new ArrayList<Integer>();
		int t = atom[i].getProtonNumber();
		counter.add(t);
		i++;
		while (i <= n) {
			for (int j = 0; j <=i;j++) {
				
				if(atom[i].getProtonNumber() == counter(j)) {
					t = 0;}
				else {
					t = 1;
				}
				switch(t) {
			case 0: 
				int h = counter(j); 
				counter.remove(j);
				h +=1;
				counter.add(j,h);
				break;
			case 1:
				break;
			}
			//	counter.add(atom[i].getProtonNumber());	
			}
			
			i = i + 1;
		}
	}
}
