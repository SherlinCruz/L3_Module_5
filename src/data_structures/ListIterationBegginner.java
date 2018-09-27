package data_structures;

import java.awt.Color;
import java.util.ArrayList;


public class ListIterationBegginner {
	public static void main(String[] args) {

		// 1
		for (Pig pig : theYard) {
			pig.feed();
		}

		// 2
		for (Bubble bubble : bubbleWrap) {

			bubble.pop();

		}

		// 3
		for (Song song : playlist) {
			song.play();
		}

		// 4
		Decorator decorator = new Decorator();
		decorator.hangOrnaments();

	}

	// 1. Feed all the pigs in the yard.
	class Pig {
		void feed() {
		}
	}

	static ArrayList<Pig> theYard = new ArrayList<Pig>();

	// 2. Pop all the bubbles in the bubble wrap.
	class Bubble {
		void pop() {
		}
	}

	static ArrayList<Bubble> bubbleWrap = new ArrayList<Bubble>();

	// 3. Play all the songs in the playlist.
	class Song {
		void play() {
		}
	}

	static ArrayList<Song> playlist = new ArrayList<Song>();

	// 4. Code the Ornament and Decorator classes. Add some Ornaments to the
	// boxOfDecorations in the Decorator class. Hang all the ornaments in the box.
	class Ornament {
		Color color;

		Ornament(Color color){
		
			this.color= color;
		
		}
		
		void hang() {
			System.out.println("hanging a" + color + "ornament");

		}
	}

	class Decorator {
		
		static ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();

		// in Decorator class
		Decorator() {
			boxOfDecorations.add(new Ornament(Color.red));
			boxOfDecorations.add(new Ornament(Color.gray));

		}

		void hangOrnaments() {
			for(Ornament ornament:boxOfDecorations) {
				ornament.hang();
		}
	}

		// Add a color to the Ornament class so that your program prints “Hanging a red
		// ornament”, etc.

}
