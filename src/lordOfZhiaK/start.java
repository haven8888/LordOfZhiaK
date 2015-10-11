package lordOfZhiaK;
import java.util.Scanner;

public class start {
	public static void main (String arg[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the world of Zhiak!");
		
		try {
			   Thread.sleep(3000);
			    }
		catch (InterruptedException ex)
			        {
			            // do nothing
			        }

		
		System.out.println("The Elders have granted your reincarnation.");
		System.out.println("They see the potential your Ki has.");
		System.out.println("You were once a very courageous adventurer. Do you remember your name?");
		String name = input.nextLine();
		System.out.println("Hello " + name + " Today you will beging the journy that will claim you lord of Zhiak" );
		
		System.out.println("Do you wish to be resurrected now?");
		String answer = input.nextLine();
			if (answer.equals("yes")){
					System.out.println("You wake up in the middle of a dessert. there's a dried plant infront of you with a yellow fruit hanging from it.");
	}else { 
		System.out.println("what are you waiting for?");
		
	}
		
		
	}
}
