import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exC2 {

	
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
			System.out.print( "Enter the Number of day             : " );
	        numberOfDayCourse = Integer.parseInt(scanner.nextLine());
			System.out.print( "Enter the price per day             : " );
	        priceOfCoursePerDay = Integer.parseInt(scanner.nextLine());
			System.out.print( "Enter prior knowledge (false/true)  : " );
	        priorKnowledgeOfCourse = Boolean.parseBoolean(scanner.nextLine());
			
			instructorsByCourse.add("Patrick"); 
			instructorsByCourse.add("Bruno"); 
			instructorsByCourse.add("Grietje"); 
			
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