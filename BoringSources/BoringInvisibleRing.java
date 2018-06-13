package Boring;

import java.util.Scanner;

public class BoringInvisibleRing {

	public BoringInvisibleRing() {
		System.out.println("You now have the invisible ring. When you put the ring on no one can see you.");
		System.out.println("Do you want to 1) put on the ring or 2) put the ring in your pocket?");
		Scanner s = new Scanner(System.in);
		String choice = s.next();
		switch(new Integer(choice)) {
			case 1:
				System.out.println("You put on the ring and avoid everyone both enemies and friends. You are able to get away from danger very easily now.");
				new BoringJava();
				break;
			case 2: 
				System.out.println("You put the ring in your pocket. You are not invisible with the ring in your pocket.");
				break;
			default:
				System.out.println("Something strange happened and your head blew up onto a gathering of dwarves.");
				
			
		}
	}


}