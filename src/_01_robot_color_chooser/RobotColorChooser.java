//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot yee = new Robot();
		//3. Ask the user what color they would like the robot to draw
		yee.penDown();
		
		for (int i = 0; i < 5; i++) {
		yee.setSpeed(100);	
		yee.hide();	
		String color = JOptionPane.showInputDialog("What color do you want? ( red, blue, green )");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
			
		yee.setPenColor(Color.red);
		}else if (color.equals("blue")) {
			yee.setPenColor(Color.blue);
			}else if (color.equals("green")) {
				yee.setPenColor(Color.green);
			}else {
				yee.setRandomPenColor();
			}
			
for (int j = 0; j < 5; j++) {
	

			
		yee.move(i + 100);
	
			
	
			
	yee.turn(350/5);
		
	yee.turn(1);
}
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
