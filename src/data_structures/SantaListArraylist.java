package data_structures;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class SantaListArraylist {

	public static void main(String[] args) {
		new SantaListArraylist();
	}
	
	SantaListArraylist() {
		
		ArrayList<JLabel> list = new ArrayList<>();
	list.add(loadImageFromJavaProject("earring.jpg"));
		
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
	
		frame.setVisible(true);
		panel.setVisible(true);

		frame.add(panel);
		frame.add(list.get(0));

		frame.pack();
	}

	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}