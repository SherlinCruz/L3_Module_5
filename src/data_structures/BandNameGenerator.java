package data_structures;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class BandNameGenerator {
	public static void main(String[] args) {
		BandNameGenerator bandsName = new BandNameGenerator();

	}

	BandNameGenerator() {

		ArrayList<String> adjectives = new ArrayList<String>();

		adjectives.add("Glamorous");
		adjectives.add("Beautiful");
		adjectives.add("Clever");
		adjectives.add("Massive");
		adjectives.add("Fresh");
		adjectives.add("Broken");
		adjectives.add("Hot");
		adjectives.add("Green");
		adjectives.add("Purple");
		adjectives.add("Angry");

		ArrayList<String> nouns = new ArrayList<String>();

		nouns.add("Cats");
		nouns.add("Socks");
		nouns.add("Ships");
		nouns.add("Heroes");
		nouns.add("Monkeys");
		nouns.add("Babies");
		nouns.add("Matches");
		nouns.add("Airline");
		nouns.add("Bands");
		nouns.add("Friends");

		Random rand = new Random();

		int value = rand.nextInt(adjectives.size());

		JOptionPane.showMessageDialog(null, adjectives.get(value) + " " + nouns.get(value));

	}

}
