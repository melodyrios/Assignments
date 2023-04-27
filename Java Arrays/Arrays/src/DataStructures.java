
public class DataStructures {

	public static void main(String[] args) {
		//1. Write a program to sum all the values of a given Array in Java.
		//2. What is the output?
		
		int [] myArray = new int [] {2, 4, 6, 8, 10, 12};
		
			int sum = 0;
			
			for (int i = 0; i < myArray.length; i++) {
				sum = sum + myArray[i];
			}
			System.out.println(sum);
	}

}
