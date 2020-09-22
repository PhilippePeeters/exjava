import java.util.Scanner;

public class exB5 {
	public static void main(String[] args) {
		String userName = null;
		String greetedAgain = null;

		do {
			Scanner scanner = new Scanner( System.in );
			System.out.print( "Enter your user   : " );
			userName = scanner.nextLine();

			System.out.println("welcome " + userName);

			System.out.print( "would you like to be greeted again? (Y/N)" );
			greetedAgain = scanner.nextLine();
			
		} while (greetedAgain.equalsIgnoreCase("Y"));
	
		System.out.println("End Program");
	}
}