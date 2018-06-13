package Boring;

import java.util.Scanner;

public class EnchantedBoringLevel {


	public EnchantedBoringLevel () {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
	
		System.out.println("***Enchanted Boring Forest***");
		System.out.println("Welcome to another boring level of this video game!\n\n\n\n");
		this.enchant();
	}
	
	public void enchant() {
		
		System.out.println("You find yourself in a magical forest all alone.\nYou hear music in the distance.\n" +
		"An elf appears and takes you to their tree house mansion.");
		
		System.out.print("The elf prince offers you three choices 1) invisible ring, 2) galactic sunglasses, 3) a map of the enchanted forest. Which do you choose?");
		Scanner enchanted_choice = new Scanner(System.in);
		String choice;
		choice = enchanted_choice.next();
		
		switch(new Integer(choice)) {
			
			case 1:
				System.out.println("You chose the invisible ring");
				new BoringInvisibleRing();
				break;
			case 2:
				System.out.println("You chose the galactic sunglasses");
				new BoringGalacticSunglasses();
				break;
			case 3:
				System.out.println("You chose the map of the enchanted forest");
				new BoringMap();
				break;
			default:
			    System.out.println("You shot yourself in the face.");
				
		}
	}
	
	
	


}