package data_structures;

import java.util.ArrayList;

public class ListIterationMasterP1 {
	public static void main(String[] args) {

		songs.add(new Song("cold"));
		songs.add(new Song("hot"));

	}

	static ArrayList<Song> songs = new ArrayList<>();

}

class Song {
	String songName;

	Song(String songName) {
		this.songName = songName;
	}

	double getDuration() {
		return 0.5;

	}
}