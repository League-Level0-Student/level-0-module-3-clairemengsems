package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String areyouhappy = JOptionPane.showInputDialog("Are you happy? (yes/no)");

		if (areyouhappy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		} else {
			String wanttobehappy = JOptionPane.showInputDialog("Do you want to be happy?");
			if (wanttobehappy.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
			} else {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		}

	}

}
