package data_structures;

import java.util.ArrayList;

//1. On ​ paper​ ,
//#1 - Make an ArrayList of Eggs.
//#2 - Crack all the eggs in the carton.
// Provided:
public class ListIterationFluentP1 {
	public static void main(String[] args) {
for(Egg egg: eggs) {
	
egg.crack();
		
	}
	}

	class Egg {

		void crack() {

			System.out.println("Cracked eggs");

		}
	}

	static ArrayList<Egg> eggs = new ArrayList<>();


}