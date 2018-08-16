package data_structures;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ComedyCentral implements ActionListener {

	JFrame frame = new JFrame();

	JButton button = new JButton();

	public static void main(String[] args) {
		ComedyCentral comedy = new ComedyCentral();
		comedy.setup();
	}

	void setup() {
		
		System.out.println("sherlin");
		
		
		frame.add(button);
		
		frame.setVisible(true);
		
		button.setVisible(true);
		
		button.addActionListener(this);

		button.setText("Press me!");

		ArrayList<String> jokes = new ArrayList<String>();

		jokes.add("What's the difference between an elephant and a grape?");

		jokes.add("Why did Jane say when she saw the elephants coming over the hill? ");

		jokes.add("How do you fit an elephant in a closet in 3 steps");

		jokes.add("What is a pirate’s favorite form of transportation?");

		ArrayList<String> punchlines = new ArrayList<String>();

		punchlines.add("Grapes are purple");

		punchlines.add("Here comes the elephant over the hill");

		punchlines.add("1. You open the door elephant 2. Put the elephant in the closet 3. CLose the door");

		punchlines.add("Ship");

		Random rand = new Random();
		int value = rand.nextInt(jokes.size());

		if (rand.equals(0)) {

			System.out.println(punchlines.get(0));

		}
		if (rand.equals(1)) {

			System.out.println(punchlines.get(1));

		}
		if (rand.equals(2)) {

			System.out.println(punchlines.get(2));

		}
		if (rand.equals(3)) {

			System.out.println(punchlines.get(3));

		}
frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(button)) {

			// System.out.println(punchlines);

			setup();

		}

	}

}
