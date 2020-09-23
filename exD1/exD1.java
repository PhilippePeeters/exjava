import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class exD1 {

	
	public static void main(String[] args) {
		String titleCourse = null;
		int numberOfDayCourse = 0;
		int priceOfCoursePerDay = 0;
		boolean priorKnowledgeOfCourse = false;
		String label = null;
		ArrayList<String> instructorsByCourse = new ArrayList<String>();

		Scanner scanner = new Scanner( System.in );
		System.out.print( "Enter the title                     : " );
        titleCourse = scanner.nextLine();

        // Introduce until correct value for the Number of day
        boolean notErrorEntry;
		do {
			notErrorEntry = false;
			try {
				System.out.print( "Enter the Number of day             : " );
				numberOfDayCourse = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e1) {
				System.out.print( "It's not a correct Number ! Try again" + System.lineSeparator());
				notErrorEntry = true;
			}
		} while (notErrorEntry);

        // Introduce until correct value for the price per day
		do {
			notErrorEntry = false;
			try {
				System.out.print( "Enter the price per day             : " );
		        priceOfCoursePerDay = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e1) {
				System.out.print( "It's not a correct Number ! Try again" + System.lineSeparator());
				notErrorEntry = true;
			}
		} while (notErrorEntry);

		System.out.print( "Enter prior knowledge (false/true)  : " );
		priorKnowledgeOfCourse = Boolean.parseBoolean(scanner.nextLine());

		String inputFileName = "E:\\JavaReskilling\\GitProjects\\exjava\\exjava\\exD1\\instructors.txt";

		try {
//			ArrayList<String> instructorsByCourse = new ArrayList<String>();
			BufferedReader in = new BufferedReader(new FileReader(inputFileName));
			String nextLine = null;
			while ((nextLine = in.readLine()) != null) {
				instructorsByCourse.add(nextLine.trim());
			}
			in.close();
			System.out.println("Number of Instructors : " + instructorsByCourse.size());
			
			for (String NameOfInstructor: instructorsByCourse) {
				System.out.println("InstructorName : " + NameOfInstructor);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		printInfo(titleCourse, numberOfDayCourse, priceOfCoursePerDay, priorKnowledgeOfCourse, label, instructorsByCourse);

	}
	
	private static void printInfo(String titleCourse, 
								  int numberOfDayCourse,
								  int priceOfCoursePerDay,
								  boolean priorKnowledgeOfCourse,
								  String label,
								  ArrayList<String> instructorsByCourse)  {
		float priceOfCourseVatIncluded = totalPriceCalculation(numberOfDayCourse,priceOfCoursePerDay,priorKnowledgeOfCourse);

		if (priceOfCourseVatIncluded < 500) {
			label = " CHEAP";
		} else if (priceOfCourseVatIncluded < 1500) {
				label = " OK";
		} else {
				label = " EXPENSIVE";
		}

		System.out.println("Title : " + titleCourse + label);
		System.out.println("Number of day  : " + numberOfDayCourse);
		System.out.println("Price : " + priceOfCoursePerDay);
		System.out.println("Is prior knowledge needed : " + priorKnowledgeOfCourse);
		System.out.println("There are " + instructorsByCourse.size() + " instructors for this course");
		System.out.println("The price is : " + priceOfCourseVatIncluded + " Euro");
	}
		
	private static float totalPriceCalculation(int numberOfDayCourse,
											   int priceOfCoursePerDay,
											   boolean priorKnowledgeOfCourse) {
		int priceOfCourse = 0;
		float priceOfCourseVatIncluded = 0.0f;
		float priceOfVat = 0.0f;

		priceOfVat = 0;
		priceOfCourse = numberOfDayCourse * priceOfCoursePerDay;
		if (numberOfDayCourse > 3 && priorKnowledgeOfCourse) {
			System.out.println("No VAT !");
		} else {
			priceOfVat = (( (float) priceOfCourse * 21) / 100);
		}
		return priceOfCourseVatIncluded = priceOfCourse + priceOfVat;
	}
}