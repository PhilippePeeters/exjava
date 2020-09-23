import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exD2 {

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
		instructorsByCourse = readFromFile(inputFileName);

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
		
		//Write results in a file
		String outputFileName = "E:\\JavaReskilling\\GitProjects\\exjava\\exjava\\exD2\\courseinfo.txt";
		ArrayList<String> contentResult = new ArrayList<String>();
		contentResult.add("Title : " + titleCourse + label + System.lineSeparator());
		contentResult.add("Number of day  : " + numberOfDayCourse + System.lineSeparator());
		contentResult.add("Price : " + priceOfCoursePerDay + System.lineSeparator());
		contentResult.add("Is prior knowledge needed : " + priorKnowledgeOfCourse + System.lineSeparator());
		contentResult.add("There are " + instructorsByCourse.size() + " instructors for this course" + System.lineSeparator());
		contentResult.add("The price is : " + priceOfCourseVatIncluded + " Euro" + System.lineSeparator());
		writeToFile(contentResult, outputFileName);
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
	

	public static ArrayList<String> readFromFile(String fileName) {
		ArrayList<String> contentListInstructors = new ArrayList<String>();
		Path pathToFile= Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(pathToFile)){
			String nextLine = null;
			while ((nextLine = reader.readLine()) != null) {
				contentListInstructors.add(nextLine.trim());
			}
			reader.close();
			System.out.println("Number of Instructors : " + contentListInstructors.size());
			
			for (String NameOfInstructor: contentListInstructors) {
				System.out.println("InstructorName : " + NameOfInstructor);
			}
			System.out.println("Content written to " + pathToFile  );
		} catch (IOException e) {
			System.out.println("Could not write file to " + pathToFile);
			e.printStackTrace();
		} 
		return contentListInstructors;
	}

	
	public static void writeToFile(ArrayList<String> content, String fileName) {
		Path pathToFile= Paths.get(fileName);
		try (BufferedWriter writer = Files.newBufferedWriter(pathToFile)){
			for(String line: content) {
				  writer.write(line);
			}
			System.out.println("Content written to " + pathToFile  );
			writer.close();
		} catch (IOException e) {
			System.out.println("Could not write file to " + pathToFile);
			e.printStackTrace();
		} 
	}
}


