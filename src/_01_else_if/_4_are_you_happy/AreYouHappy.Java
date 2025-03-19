package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy{
    public static void main(String[]args){
        String ask = JOptionPane.showInputDialog("Are you happy?");
        if (ask.equals("yes")){
            JOptionPane.showMessageDialog(null,"Keep doing what you are doing!");
        }
        else{
            String ask1 = JOptionPane.showInputDialog("Do you want to be happy?");
            if (ask1.equals("yes")){
                JOptionPane.showMessageDialog(null,"Change something, then return and start over!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Keep doing what you are doing!");
            }
        }
    }
}