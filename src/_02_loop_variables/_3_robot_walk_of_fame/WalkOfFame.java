
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(1000);
		rob.setX(200);
		rob.penDown();
		for (int i=10; i>0; i--){
			for (int m = 5; m>0; m--){
			rob.move(30);
			rob.turn(144);
			}
		rob.turn(90);
		rob.penUp();
		rob.move(50);
		rob.penDown();
		rob.turn(270);
		}
		rob.penUp();
		rob.move(100);
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
