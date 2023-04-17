
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise1 {

	public static void main(String[] args) {
		//Loop and Map.Entry Exercises
		//Write a program that does the following:
		//Asks the user for 5 numbers
		//Stores them in an array list
		//Finds the sum, product, largest, and smallest of those numbers
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		int number1, number2, number3, number4, number5;
		int sum, product, largest, smallest;
		
		System.out.print("Enter the first number: ");
			number1 = input.nextInt();
			
		System.out.print("Enter the second number: ");
			number2 = input.nextInt();
			
			
		System.out.print("Enter the third number: ");
			number3 = input.nextInt();
	
		System.out.print("Enter the fourth number: ");
			number4 = input.nextInt();
			
		System.out.print("Enter the fifth number: ");
			number5 = input.nextInt();
			
			
		sum = number1 + number2 + number3 + number4 + number5;
		product = number1 * number2 * number3 * number4 * number5;
		
		largest = number1;
		smallest = number1;
		
		if(number2 > largest)
			largest = number2;
			
		if(number3 > largest)
			largest = number3;
			
		if(number4 > largest) 
			largest = number4;
			
		if(number5 > largest)
			largest = number5;
		
		if(number2 < smallest)
			smallest = number2;
			
		if(number3 < smallest)
			smallest = number3;
			
		if(number4 < smallest) 
			smallest = number4;
			
		if(number5 < smallest)
			smallest = number5;
		
		System.out.println("The sum of numbers is: " + sum);
		System.out.println("The product of numbers is: " + product);
		System.out.println("The largest number from the list is: " + largest);
		System.out.println("The smallest number from the list is: " + smallest);
		
		
	}		
}

	
