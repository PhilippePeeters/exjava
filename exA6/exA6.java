import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class exA6 {
	public static void main(String[] args) {
		HashMap<String,Integer> numberOfDayPerMonth = new HashMap<String,Integer>();
		numberOfDayPerMonth.put("January",31);
		numberOfDayPerMonth.put("February",28);
		numberOfDayPerMonth.put("March",31);
		numberOfDayPerMonth.put("April",30);
		numberOfDayPerMonth.put("May",31);
		numberOfDayPerMonth.put("June",30);
		numberOfDayPerMonth.put("July",31);
		numberOfDayPerMonth.put("August",31);
		numberOfDayPerMonth.put("September",30);
		numberOfDayPerMonth.put("October",31);
		numberOfDayPerMonth.put("November",30);
		numberOfDayPerMonth.put("December",31);
		
		String monthName = null;
		int day = 1;
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "Enter the name of the month       : " );
        monthName = scanner.nextLine();
		System.out.print( "Enter the day                     : " );
        day = Integer.parseInt(scanner.nextLine());

		int numberOfDay = numberOfDayPerMonth.get(monthName);
		System.out.println("Still " + (numberOfDay - day) + " in the month of " + monthName);
	}
}