package zahlenraten;

import java.util.Scanner;
import java.util.Random;

public class zahlenraten0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int secret = rnd.nextInt(100) + 1;
		int guess;
		int counter = 0;
		Scanner kbd = new Scanner(System.in);
		for (int i = 30; i >= 0; i--) {
			System.out.println();
		}
		System.out.println("Ich habe eine Zufallszahl zwischen 1 und 100 gebildet");
		do {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.print("Bitte gib einen Tip ein: ");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			guess = kbd.nextInt();

			if (secret < guess)
				System.out.println("Du hast ein wenig zu hoch geraten");
			else if (secret > guess)
				System.out.println("Du hast ein wenig zu tief geraten");
			counter +=1;
			if (counter >= 10) {
				System.out.println("leider verloren");
				break;
			}
		} while (secret != guess);
		System.out.println();
		
		if(counter<10)System.out.println("We have a Winner! :Fanfares:");

	}

}
