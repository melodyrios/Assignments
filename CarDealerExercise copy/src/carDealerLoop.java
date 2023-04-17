import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class carDealerLoop {

	public static void main(String[] args) {
		//You are a car dealer. Create a hash map of vehicles.
		//The model is the Key, the make is the Value.
		//Ask the customer what car (model) they are looking for. 
		//Use the Hash Map to determine if you have that vehicle, and what make it is.
		//(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")

		Scanner input = new Scanner(System.in);
		
		Map<String, String> cars = new HashMap<String, String>();
		cars.put("Mustang", "Ford");
		cars.put("Civic", "Honda");
		cars.put("Rav4", "Toyota");
		cars.put("Camaro", "Chevy");
		
		System.out.println("What model are you looking for?");
		String carModel = input.next();
		
		if(cars.containsKey(carModel)) {
			System.out.println("Oh, you're looking for a " +carModel+ "? Our selection is over here...");
		} 	
			
	} 
}
	
	
	
	


