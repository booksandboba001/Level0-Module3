
package _99_extra;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String sting = JOptionPane.showInputDialog("Do you like bananas?");
		if (sting.equals("no")){
			JOptionPane.showMessageDialog(null, "You are crazy");
		}
		if (sting.equals("yes")){
			String crab_rights = JOptionPane.showInputDialog(null,"What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, crab_rights + " is much better than bananas!");
		}
		else{
			JOptionPane.showMessageDialog(null,"You are bananas!");
		}
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	}

}
