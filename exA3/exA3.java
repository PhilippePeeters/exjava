import java.util.ArrayList;
import java.util.List;

public class exA3 {
	public static void main(String[] args) {
		String titleCourse = null;
		int numberOfDayCourse = 0;
		int priceOfCoursePerDay = 0;
		int priceOfCourse = 0;
		double priceOfCourseVatIncluded = 0.0;
		double priceOfVat = 0.0;
		boolean priorKnowledgeOfCourse = false;
		
		titleCourse = "Java Beginner";
		numberOfDayCourse = 10;
		priceOfCoursePerDay = 155;
		priorKnowledgeOfCourse = true;

		List<String> instructorsByCourse = new ArrayList<String>();
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