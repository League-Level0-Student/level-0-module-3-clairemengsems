//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
for (int i = 0; i < 10; i++) {
	

String answer = JOptionPane.showInputDialog("Guess the number from one to one hundred?");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int num = Integer.parseInt(answer);			
			// 5. if the guess is correct
if (num == random) {
JOptionPane.showMessageDialog(null, "You guessed it!");
System.exit(0);
}
if (num > random)	{
JOptionPane.showMessageDialog(null, "Too high!");
}
if (num < random)	{
JOptionPane.showMessageDialog(null, "Too low!");
}
}
JOptionPane.showMessageDialog(null, "Good Job! You lost.");

// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


