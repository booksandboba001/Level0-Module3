
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 30th";
		String dadsBirthday = "October 5th";
		String myBirthday = "September 24th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		// 3. Print out what the user typed
		String chicken = JOptionPane.showInputDialog("Which birthday do you want?");
		if (chicken.equals("mom")){
			JOptionPane.showMessageDialog(null,momsBirthday);
		}
		if (chicken.equals("dad")){
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		if (chicken.equals("Evie")){
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else{
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday");
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
