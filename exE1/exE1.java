import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class exE1 {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		String firstNameInstructor = null;
		String lastNameInstructor = null;
		int ageInstructor = 0;
		int ageStartingAtAbis = 0;
		float startingSalary = 0.0f;
		
		scanner = new Scanner( System.in );

		firstNameInstructor = getStringUser("Enter the first Name of the Instructor           : ");
		lastNameInstructor = getStringUser("Enter the last Name of the Instructor            : ");
		ageInstructor = getIntUser("Enter the the Age of the Instructor              : ");
		ageStartingAtAbis = getIntUser("Enter the the Age Stating in Abis                : ");
		startingSalary = getFloatUser("Enter the starting salary of the Instructor      : ");
		
		printSalaryHistory(firstNameInstructor, lastNameInstructor, ageInstructor, ageStartingAtAbis, startingSalary);
		
	}
	
	private static String getStringUser(String inputMessage) {
		String message = null;
		System.out.print(inputMessage);
		message = scanner.nextLine();
		return message;
	}


	private static int getIntUser(String inputMessage) {
		int numberInt = 0;
        boolean notErrorEntry;
		do {
			notErrorEntry = false;
			try {
				System.out.print(inputMessage);
				numberInt = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e1) {
				System.out.print( "It's not a correct Number ! Try again" + System.lineSeparator());
				notErrorEntry = true;
			}
		} while (notErrorEntry);
		return numberInt;
	}


	private static float getFloatUser(String inputMessage) {
		float numberFloat = 0;
        boolean notErrorEntry;
		do {
			notErrorEntry = false;
			try {
				System.out.print(inputMessage);
				numberFloat = Float.parseFloat(scanner.nextLine());
			} catch (NumberFormatException e1) {
				System.out.print( "It's not a correct Number ! Try again" + System.lineSeparator());
				notErrorEntry = true;
			}
		} while (notErrorEntry);
		return numberFloat;
	}

	private static void printSalaryHistory(String firstName, String LastName, int ageInstructor, int ageStartingAtAbis, float startingSalary) {
		int seniority= 0;
		int age = ageStartingAtAbis;
		float salaryEvolution = startingSalary;
		String outputLine;
		ArrayList<String> outputSalaryList = new ArrayList<String>();
		while (age < ageInstructor) {
			outputLine = "Salary of " + firstName + " " + LastName + " at " + age + " is " + salaryEvolution + System.lineSeparator();
			System.out.println(outputLine);
			outputSalaryList.add(outputLine);
			age += 5;
			seniority += 5;
			if (seniority <= 35) {
				salaryEvolution *= 1.03f;
			} else {
				outputLine = "Maximum salary reached" + System.lineSeparator();
				outputSalaryList.add(outputLine);
				System.out.println(outputLine);
				break;
			}
		}
		String outputFileName = "E:\\JavaReskilling\\GitProjects\\exjava\\exjava\\exE1\\salaryhistory.txt";
		writeToFile(outputSalaryList, outputFileName);
	}
	
	private static void writeToFile(ArrayList<String> content, String fileName) {
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
