
package Boring;

import java.util.Scanner;

public class BoringJava {
	
	public BoringJava(String s) {
		if (s.equals("GalacticSunglasses")) {
			System.out.println("Congratulations you won!");
		}
		System.exit(0);
	}
	
	public BoringJava () {
		System.out.println("***Massive Farts***");
		go();
	}
	
	static void go() {
		System.out.println("This is a very boring Java class.");
		System.out.println("Enter a number greater than 9000 for the win. Enter a number below zero for something interesting.");
		System.out.print("Please enter your favorite number: ");
		Scanner user_input = new Scanner(System.in);
		String fav_number;
		fav_number = user_input.next();
		System.out.println("Man, is " + fav_number + " really your favorite number?");
		bigChoice(new Integer(fav_number));
	}
	
	public static void main(String[] args) {
		new BoringJava().go();
		
		
	}
	
	public static void bigChoice(int x) {
		
		if (x >= 0 && x <= 9000 ) {
			System.out.println("Your character was scorched to a crisp by a hungry greedy dragon.");
			
			
		} else if (x < 0) {
			System.out.println("Your character becomes the first colonist of Mars.");
			new BoringMarsLevel();
			
		}
		else {
			System.out.println("Your character finds herself in an enchanted forest of elfs.");
			new EnchantedBoringLevel();
		}
	}
	
	


}

