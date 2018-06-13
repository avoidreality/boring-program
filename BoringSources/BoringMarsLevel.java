package Boring;

public class BoringMarsLevel {


	public BoringMarsLevel() {
		System.out.println("You are now on the red desert planet Mars.");
		System.out.println("Do you want to 1.) set up camp in a dormant volcanic cave, 2.) drive on the surface, or 3.) communicate with Earth?	");
		java.util.Scanner choice = new java.util.Scanner(System.in);
		String the_choice = choice.next();
		switch(new Integer(the_choice)) {
			case 1: 
				System.out.println("You are now deep underground in a former lava tube of a now dead volcano. There is ice towards the bottom of the cave.");
				new BoringJava();
				break;
			case 2: 
				System.out.println("You are now driving on the Martian surface.");
				new BoringJava();
				break;
			case 3:
				System.out.println("You booted up your computer and initiated a glitchy communique with the lonely planet.");
				new BoringJava();
				break;
			default:
				System.out.println("Your space suit suffered a tear and you died.");
		}		
		
		
		
	}

}