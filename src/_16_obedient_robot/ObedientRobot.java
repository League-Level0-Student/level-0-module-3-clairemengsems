package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Robot yee = new Robot ();
		yee.penDown();
		yee.setSpeed(100);
		yee.hide();
		
		
		
		String shape = JOptionPane.showInputDialog("What shape do you want? (square, triangle, circle)");
		
String color = JOptionPane.showInputDialog("What color? (red,green,blue)");
		
		if(color.equals("red")) {
		yee.setPenColor(250,0,0);
		}else if (color.equals("green")) {
		yee.setPenColor(0,250,0);	
		}else if (color.equals("blue")) {
			yee.setPenColor(0,0,250);	
			}
	
		
		
		
		
		
		
		
		if (shape.equals("square")) {
		drawSquare(yee);
		}else if(shape.equals("triangle")) {
		drawTriangle(yee);
		}else if(shape.equals("circle")) {
		drawCircle(yee);
		}	
		
		
	
	}
	
	public static void drawSquare(Robot yee ) {
		yee.penDown();
		yee.setSpeed(100);
		yee.hide();
		
		
		
		
		for (int i = 0; i < 4; i++) {	
	
		yee.move(100);
		yee.turn(90);
		
	
		}
	}

	
	
	public static void drawTriangle(Robot yee ) {
		yee.penDown();
		yee.setSpeed(100);
		yee.hide();
		
		
		
		
		for (int i = 0; i < 4; i++) {	
	
		yee.move(100);
		yee.turn(120);
		
	
		}
	}
	
	public static void drawCircle(Robot yee ) {
		yee.penDown();
		yee.setSpeed(100);
		yee.hide();
		
		
		
		
		for (int i = 0; i < 1000; i++) {	
	
		yee.move(1);
		yee.turn(1);
		
	
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
