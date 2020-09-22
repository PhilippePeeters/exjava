import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exA5 {
	public static void main(String[] args) {
		String titleCourse = null;
		int numberOfDayCourse = 0;
		int priceOfCoursePerDay = 0;
		int priceOfCourse = 0;
		double priceOfCourseVatIncluded = 0.0;
		double priceOfVat = 0.0;
		boolean priorKnowledgeOfCourse = false;
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "Enter the title                     : " );
        titleCourse = scanner.nextLine();
		System.out.print( "Enter the Number of day             : " );
        numberOfDayCourse = Integer.parseInt(scanner.nextLine());
		System.out.print( "Enter the price per day             : " );
        priceOfCoursePerDay = Integer.parseInt(scanner.nextLine());
		System.out.print( "Enter prior knowledge (false/true)  : " );
        priorKnowledgeOfCourse = Boolean.parseBoolean(scanner.nextLine());
		
/*		if (args.length != 4) {
			System.out.println("Parameters not correct !");
			//exit(-1);
		} else {
			titleCourse = args[0];
			numberOfDayCourse = Integer.parseInt(args[1]);
			priceOfCoursePerDay = Integer.parseInt(args[2]);
			priorKnowledgeOfCourse = Boolean.parseBoolean(args[3]);
		} */

		ArrayList<String> instructorsByCourse = new ArrayList<String>();
		instructorsByCourse.add("Patrick"); 
		instructorsByCourse.add("Bruno"); 
		instructorsByCourse.add("Grietje"); 
		
		priceOfCourse = numberOfDayCourse * priceOfCoursePerDay;
		priceOfVat = (( (double) priceOfCourse * 21) / 100);
		priceOfCourseVatIncluded = priceOfCourse + priceOfVat;

		System.out.println("Title : " + titleCourse);
		System.out.println("Number of day  : " + numberOfDayCourse);
		System.out.println("Price : " + priceOfCoursePerDay);
		System.out.println("Is prior knowledge needed : " + priorKnowledgeOfCourse);
		System.out.println("There are " + instructorsByCourse.size() + " instructors for this course");
		System.out.println("Price of the Course : " + priceOfCourse + " Euro");
		System.out.println("VAT : " + priceOfVat + " Euro");
		System.out.println("The price (VAT included) is : " + priceOfCourseVatIncluded + " Euro");
	}
}