import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exC1 {

	
	public static void main(String[] args) {

		String titleCourse = null;
		int numberOfDayCourse = 0;
		int priceOfCoursePerDay = 0;
		int priceOfCourse = 0;
		float priceOfCourseVatIncluded = 0.0f;
		float priceOfVat = 0.0f;
		boolean priorKnowledgeOfCourse = false;
		String label = null;
		ArrayList<String> instructorsByCourse = new ArrayList<String>();

		Scanner scanner = new Scanner( System.in );
		System.out.print( "Enter the title                     : " );
        titleCourse = scanner.nextLine();
		System.out.print( "Enter the Number of day             : " );
        numberOfDayCourse = Integer.parseInt(scanner.nextLine());
		System.out.print( "Enter the price per day             : " );
        priceOfCoursePerDay = Integer.parseInt(scanner.nextLine());
		System.out.print( "Enter prior knowledge (false/true)  : " );
        priorKnowledgeOfCourse = Boolean.parseBoolean(scanner.nextLine());
		
		instructorsByCourse.add("Patrick"); 
		instructorsByCourse.add("Bruno"); 
		instructorsByCourse.add("Grietje"); 
		
		priceOfVat = 0;
		priceOfCourse = numberOfDayCourse * priceOfCoursePerDay;
		if (numberOfDayCourse > 3 && priorKnowledgeOfCourse) {
			System.out.println("No VAT !");
		} else {
			priceOfVat = (( (float) priceOfCourse * 21) / 100);
		}
		priceOfCourseVatIncluded = priceOfCourse + priceOfVat;
		
		if (priceOfCourseVatIncluded < 500) {
			label = " CHEAP";
		} else if (priceOfCourseVatIncluded < 1500) {
				label = " OK";
		} else {
				label = " EXPENSIVE";
		}
		
		printInfo(titleCourse, numberOfDayCourse, priceOfCoursePerDay, priceOfCourse, priceOfCourseVatIncluded, priceOfVat, priorKnowledgeOfCourse, label, instructorsByCourse);
	}
	
	private static void printInfo(String titleCourse, 
								  int numberOfDayCourse,
								  int priceOfCoursePerDay,
								  int priceOfCourse,
								  float priceOfCourseVatIncluded,
								  float priceOfVat,
								  boolean priorKnowledgeOfCourse,
								  String label,
								  ArrayList<String> instructorsByCourse)  {
		System.out.println("Title : " + titleCourse + label);
		System.out.println("Number of day  : " + numberOfDayCourse);
		System.out.println("Price : " + priceOfCoursePerDay);
		System.out.println("Is prior knowledge needed : " + priorKnowledgeOfCourse);
		System.out.println("There are " + instructorsByCourse.size() + " instructors for this course");
		System.out.println("Price of the Course : " + priceOfCourse + " Euro");
		System.out.println("VAT : " + priceOfVat + " Euro");
		System.out.println("The price is : " + priceOfCourseVatIncluded + " Euro");
	}
}