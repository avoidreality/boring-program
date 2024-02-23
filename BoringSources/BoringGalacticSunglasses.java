package Boring;

import java.util.Scanner;

public class BoringGalacticSunglasses {

	public BoringGalacticSunglasses() {
		
		System.out.println("You find yourself in possession of the most amazing item you can find in this world.");
		System.out.println("You slowly put the galactic sunglasses on. You see to the farthest reaches of the galaxy. You see when the big bang happened. You see when the universe will itself collapse on itself and be destroyed. You understand how to travel time and cure cancer with the galactic sunglasses.");
		System.out.println("You can destroy your enemies by shooting a deadly ray out of your sunglasses as well. This is why the galactic sunglasses are so important.");
		
		System.out.print("Do you hate Mondays like Garfield? (Y/N)");
		Scanner s = new Scanner(System.in);
		String choice = s.next();
		
		if ("Y".equals(choice)) 
			new BoringJava("GalacticSunglasses");
		else
			new BoringJava();
	}


}
