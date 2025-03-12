
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		int numz;
		Robot randy = new Robot();
		randy.penDown();
		randy.setSpeed(100);
		for (numz =0; numz<4; numz++){
			randy.move(90);
			randy.turn(90);
		}
		randy.setPenWidth(10);
		String colore = JOptionPane.showInputDialog("What color do you want the robot to draw with?");
		if (colore.equals( "brown")){
			randy.setPenColor(139,69,19);
		}
		for (numz =0; numz<4; numz++){
			randy.move(100);
			randy.turn(90);
		}
		if (colore.equals( "misty rose")){
			randy.setPenColor(255,228,225);
		}
		for (numz =0; numz<4; numz++){
			randy.move(110);
			randy.turn(90);
		}
		if (colore.equals( "red")){
			randy.setPenColor(220,20,60);
		}
		for (numz =0; numz<4; numz++){
			randy.move(120);
			randy.turn(90);
		}
		if (colore.equals( "orange")){
			randy.setPenColor(255,140,0);
		}
		for (numz =0; numz<4; numz++){
			randy.move(130);
			randy.turn(90);
		}
		if (colore.equals( "yellow")){
			randy.setPenColor(255,215,0);
		}
		for (numz =0; numz<4; numz++){
			randy.move(140);
			randy.turn(90);
		}	
		if (colore.equals( "green")){
			randy.setPenColor(85,107,47);
		}
		for (numz =0; numz<4; numz++){
			randy.move(150);
			randy.turn(90);
		}
		if (colore.equals( "blue")){
			randy.setPenColor(0,0,128);
		}
		for (numz =0; numz<4; numz++){
			randy.move(160);
			randy.turn(90);
		}
		if (colore.equals( "purple")){
			randy.setPenColor(148,0,211);
		}	
		for (numz =0; numz<4; numz++){
			randy.move(170);
			randy.turn(90);
		}


	}
}
