import java.util.Scanner;
import java.util.ArrayList;

public class exB3 {
	
	public static void main(String[] args) {
		int totalOfInterger = 0;
		ArrayList<Integer> intergerArray = new ArrayList<Integer>();
		String inputNumberStringUser = null;
		boolean endEntry = true;
		Scanner scanner = new Scanner( System.in );
		
		do {
			System.out.print( "Enter numbers (X to terminate) : " );
			inputNumberStringUser = scanner.nextLine();
			
			try {  
			    	Double.parseDouble(inputNumberStringUser);  
			    	System.out.println("Number input : " + inputNumberStringUser);
			    	intergerArray.add(Integer.parseInt(inputNumberStringUser));
			    	endEntry = true;
			  } catch(NumberFormatException e){
				  	endEntry = false;
			  }  
		} while (endEntry);

		System.out.println("Size of the Array : " + intergerArray.size());

		for (int number: intergerArray){
			System.out.println("intergerArray number : " + number);
	    	totalOfInterger += number;
		}
	
		System.out.println("Total : " + totalOfInterger);
		System.out.println("Average :"+ totalOfInterger/(float)intergerArray.size());
	}
}