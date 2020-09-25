public class Instructor {

	private String firstNameInstructor = null;
	private String lastNameInstructor = null;
	private int ageInstructor = 0;
	private int ageStartingAtAbis = 0;
	private float startingSalary = 0.0f;
	
	public Instructor(String firstNameInstructor,
					  String lastNameInstructor,
					  int ageInstructor,
					  int ageStartingAtAbis,
					  float startingSalary) {
		this.firstNameInstructor = firstNameInstructor;
		this.lastNameInstructor = lastNameInstructor;
		this.ageInstructor = ageInstructor;
		this.ageStartingAtAbis = ageStartingAtAbis;
		this.startingSalary = startingSalary;
		
	}
	
	public void printSalaryHistory() {
		int seniority= 0;
		int age = ageStartingAtAbis;
		float salaryEvolution = startingSalary;
		String outputLine;
		while (age < ageInstructor) {
			outputLine = "Salary of " + this.firstNameInstructor + " " + this.lastNameInstructor + " at " + age + " is " + salaryEvolution;
			System.out.println(outputLine);
			age += 5;
			seniority += 5;
			if (seniority <= 35) {
				salaryEvolution *= 1.03f;
			} else {
				outputLine = "Maximum salary reached" + System.lineSeparator();
				System.out.println(outputLine);
				break;
			}
		}
	}
}
