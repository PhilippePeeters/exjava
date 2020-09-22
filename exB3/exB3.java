import java.util.Scanner;
import java.util.ArrayList;

public class exB3 {
	
	public static void main(String[] args) {
		int totalOfInterger = 0;
		ArrayList<Integer> intergerArray = new ArrayList<Integer>();
		int numberOfInteger = 0;
		String inputNumberStringUser = null;
		boolean endEntry = true;
	
		do {
			numberOfInteger++;
			Scanner scanner = new Scanner( System.in );
			System.out.print( "Enter numbers " + numberOfInteger +" (X to terminate) : " );
			inputNumberStringUser = scanner.nextLine();
			
			try {  
			    	Double.parseDouble(inputNumberStringUser);  
			    	intergerArray.add(Integer.parseInt(inputNumberStringUser));
			    	totalOfInterger += intergerArray.get(numberOfInteger - 1);
			    	endEntry = true;
			  } catch(NumberFormatException e){
				  	endEntry = false;
			  }  
		} while (endEntry);

		for (int number: intergerArray){
			System.out.println("intergerArray : " + number);
		}
		System.out.println("Total : " + totalOfInterger);
		System.out.println("Average :"+ totalOfInterger/(float)(numberOfInteger-1));
	}
}