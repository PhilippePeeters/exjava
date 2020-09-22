import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exB4 {
	public static void main(String[] args) {
		String languageCode = null;
		String greeting = null;
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "Enter the language code   : " );
        languageCode = scanner.nextLine();
	
		switch(languageCode) {
				case "NL":
					greeting = "Goeiedag!";
					break;
				case "FR":
					greeting = "Bonjour!";
					break;
				case "EN":
					greeting = "Good day!";
					break;
				default:
					greeting = "Goeiedag, bonjour and good day!";
		}
		
		System.out.println("welcome message : " + greeting);
	}
}