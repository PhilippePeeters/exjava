import java.util.ArrayList;
import java.util.List;

public class exA2 {
	public static void main(String[] args) {
		String titleCourse = null;
		int numberOfDayCourse = 0;
		int priceOfCourse = 0;
		boolean priorKnowledgeOfCourse = false;
		
		titleCourse = "Java Beginner";
		numberOfDayCourse = 10;
		priceOfCourse = 1500;
		priorKnowledgeOfCourse = true;

		List<String> instructorsByCourse = new ArrayList<String>();
		instructorsByCourse.add("Patrick"); 
		instructorsByCourse.add("Bruno"); 
		instructorsByCourse.add("Grietje"); 

		System.out.println("Title : " + titleCourse);
		System.out.println("Number of day  : " + numberOfDayCourse);
		System.out.println("Price : " + priceOfCourse);
		System.out.println("Is prior knowledge needed : " + priorKnowledgeOfCourse);
		System.out.println("There are " + instructorsByCourse.size() + " instructors for this course");

	}
	
}