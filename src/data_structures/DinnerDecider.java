package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {
	public static void main(String[] args) {

		ArrayList<String> food = new ArrayList<String>();

		food.add("Pizza");
		food.add("Spaghetti");
		food.add("Eggs");
		food.add("Rice");
		food.add("Salad");

		Random random = new Random();

		int randomNumber = random.nextInt(food.size());
		
		
		System.out.println("You should eat " + food.get(randomNumber) + " tonight.");
		
	}

}
