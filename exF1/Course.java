import java.util.HashSet;

public class Course {

	private String titleCourse;
	private int numberOfDayCourse;
	private int priceOfCoursePerDay;
	private boolean priorKnowledgeOfCourse;
	private HashSet<String> contentListInstructors;
	
	public Course(String titleCourse, int numberOfDayCourse, int priceOfCoursePerDay, boolean priorKnowledgeOfCourse) {
		this.titleCourse = titleCourse;
		this.numberOfDayCourse = numberOfDayCourse;
		this.priceOfCoursePerDay = priceOfCoursePerDay;
		this.priorKnowledgeOfCourse = priorKnowledgeOfCourse;
		this.contentListInstructors = new HashSet<String>();
	}

	public String getTitleCourse() {
		return titleCourse;
	}

	public void setTitleCourse(String titleCourse) {
		this.titleCourse = titleCourse;
	}

	public int getNumberOfDayCourse() {
		return numberOfDayCourse;
	}

	public void setNumberOfDayCourse(int numberOfDayCourse) {
		this.numberOfDayCourse = numberOfDayCourse;
	}

	public int getPriceOfCoursePerDay() {
		return priceOfCoursePerDay;
	}

	public void setPriceOfCoursePerDay(int priceOfCoursePerDay) {
		this.priceOfCoursePerDay = priceOfCoursePerDay;
	}

	public boolean isPriorKnowledgeOfCourse() {
		return priorKnowledgeOfCourse;
	}

	public void setPriorKnowledgeOfCourse(boolean priorKnowledgeOfCourse) {
		this.priorKnowledgeOfCourse = priorKnowledgeOfCourse;
	}
	
	public HashSet<String> getContentListInstructors() {
		return contentListInstructors;
	}

	public void setContentListInstructors(HashSet<String> contentListInstructors) {
		this.contentListInstructors = contentListInstructors;
	}

	public void printInfo() {
		String label;
		float priceOfCourseVatIncluded = totalPriceCalculation(numberOfDayCourse,priceOfCoursePerDay,priorKnowledgeOfCourse);

		if (priceOfCourseVatIncluded < 500) {
			label = " CHEAP";
		} else if (priceOfCourseVatIncluded < 1500) {
				label = " OK";
		} else {
				label = " EXPENSIVE";
		}

		System.out.println("Title : " + titleCourse + label);
		System.out.println("There are " + contentListInstructors.size() + " instructors for this course");
		printInstructor();
		System.out.println("Number of day  : " + numberOfDayCourse);
		System.out.println("Price : " + priceOfCoursePerDay);
		System.out.println("Is prior knowledge needed : " + priorKnowledgeOfCourse);
		System.out.println("The price is : " + priceOfCourseVatIncluded + " Euro");
		
	}
	
	private float totalPriceCalculation(int numberOfDayCourse,
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
	
	public void addInstructor(String instructor) {
		contentListInstructors.add(instructor);
	}
	
	public void removeInstructor(String instructor) {
		contentListInstructors.remove(instructor);
	}
	
	public void printInstructor() {
		for (String instructorName: contentListInstructors) {
		System.out.println("instructor Name : " + instructorName);
		}
	}
}
