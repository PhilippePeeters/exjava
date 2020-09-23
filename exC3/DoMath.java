import java.util.ArrayList;

public class DoMath {
		
	public static float calculateAverage(ArrayList<Integer> intergerArray) {
		float calculatedAverage = 0.0f;
		int totalOfInterger = 0;
		
		System.out.println("Size of the Array : " + intergerArray.size());

		for (int number: intergerArray){
			System.out.println("intergerArray number : " + number);
			totalOfInterger += number;
		}

		System.out.println("Total : " + totalOfInterger);

		calculatedAverage = totalOfInterger/(float)intergerArray.size();

		return calculatedAverage;
	}
}