
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 30th";
		String dadsBirthday = "June 9th";
		String myBirthday = "Februrary 12th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String birthday = JOptionPane.showInputDialog("Who's birthday do you need? (mom, dad, me)");	
		// 3. Print out what the user typed
if (birthday.equals("mom")) {
JOptionPane.showMessageDialog(null, momsBirthday);	
}else if (birthday.equals("dad")) {
	JOptionPane.showMessageDialog(null, dadsBirthday);	
}else if (birthday.equals("me")) {
	JOptionPane.showMessageDialog(null, myBirthday);	
}else {
JOptionPane.showMessageDialog(null, "Sorry, I don't know that person's birthday!");
JOptionPane.showMessageDialog(null, "now go away");
}
		
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
