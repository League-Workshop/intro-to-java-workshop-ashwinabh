package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {

	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to
		// do it...
		JOptionPane.showMessageDialog(null,
				"If you find yourself having to cross a pirhana infested river, here is how to do  it...");
		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog(null, "enter and adjective");
		// Get the user to enter a type o
		String liquid = JOptionPane.showInputDialog(null, "enter a type of liquid");
		// Get the user to enter a body part
		String bodypart = JOptionPane.showInputDialog(null, "enter a body part");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog(null, "enter a verb");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog(null, "enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null,
				"Piranhas are more " + adjective
						+ " during the day, so cross the river at night. Pirhana's are attracted to the scent of fresh "
						+ liquid + " and will most likely take a bite out of your " + bodypart + " if you " + verb
						+ ". If you do get bit, try to run back to the " + place + ".");

	}
}
