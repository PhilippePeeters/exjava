import java.util.Scanner;
import java.util.ArrayList;

public class exC3 {
	
	public static void main(String[] args) {
		ArrayList<Integer> intergerArray = new ArrayList<Integer>();
		String inputNumberStringUser = null;
		boolean endEntry = true;
		Scanner scanner = new Scanner( System.in );
		
		do {
			System.out.print( "Enter numbers (X to terminate) : " );
			inputNumberStringUser = scanner.nextLine();
			
			try {  
			    	Double.parseDouble(inputNumberStringUser);  
			    	intergerArray.add(Integer.parseInt(inputNumberStringUser));
			    	endEntry = true;
			  } catch(NumberFormatException e){
				  	endEntry = false;
			  }  
		} while (endEntry);

		DoMath calculateAverage = new DoMath();
		float averageNumbers = calculateAverage.calculateAverage(intergerArray);

		System.out.println("Average :"+ averageNumbers);	}
}