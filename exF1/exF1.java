public class exF1 {

	public static void main(String[] args) {
		Course c2 = new Course("Java Training", 5, 55, true);
		c2.addInstructor("Alain");
		c2.addInstructor("Patrick");
		c2.addInstructor("Sandy");
		c2.printInfo();

		Course c3 = new Course("Java Training", 7, 250, true);
		c3.addInstructor("Grietjes");
		c3.addInstructor("Bruno");
		c3.printInfo();

		Course c4 = new Course("Java Training", 2, 25, false);
		c4.addInstructor("Peter");
		c4.addInstructor("Bart");
		c4.printInstructors();
		c4.removeInstructor("Bart");
		c4.printInstructors();
		c4.addInstructor("Cecile");
		c4.printInstructors();
		c4.printInfo();
		
	}

}
