package eingabe;

import java.util.Scanner;

public class eingabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter now: ");
		x = keyboard.nextInt();
		
		System.out.println("Let's see.");
		System.out.println("you typed a "+ x);
	}

}
