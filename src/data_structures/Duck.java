package data_structures;

import java.util.ArrayList;

public class Duck {

	String name;

	public static void main(String[] args) {
		ArrayList<Duck> ducksArray = new ArrayList<>();

		ducksArray.add(new Duck("Daffy"));
		ducksArray.add(new Duck("Waddles"));

		Duck firstDuck = ducksArray.remove(0);

		firstDuck.feed();

		for (Duck d : ducksArray) {

			d.feed();

		}

	}

	public Duck(String name) {

		this.name = name;

	}

	void feed() {

		System.out.println(name + " " + "is being fed.");

	}

}
