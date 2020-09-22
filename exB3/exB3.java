public class exB3 {
	
   public static void main(String args[]){
      int iterator = 0;
	  int totalOfInterger = 0;
      int intergerArray[] = {2,9,3,0,8};
      int numberOfInteger = 5;

      for(iterator=0; iterator < numberOfInteger; iterator++) {
         totalOfInterger += intergerArray[iterator];
      }
      System.out.println("Average :"+ totalOfInterger/(float)numberOfInteger);
   }
}