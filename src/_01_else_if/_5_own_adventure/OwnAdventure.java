package _01_else_if._5_own_adventure;
import javax.swing.JOptionPane;

public class OwnAdventure {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("You set off into the forest, and encounter a magical ___");
        String t = JOptionPane.showInputDialog("The magical "+s+" tells you you are the chosen one destined to defeat the wicked ___");
        String o = JOptionPane.showInputDialog("You set off to defeat the wicked "+t+" but the magical "+s+" stops you. He says you have to find the Holy ___");
        String r = JOptionPane.showInputDialog("The magical "+s+" lets you go to search. You find it inside a dark___");
        JOptionPane.showMessageDialog(null, "The wicked "+t+" has caught you, but you lop off its head with the Holy "+o);
    }
}
