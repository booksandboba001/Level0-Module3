package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive {
    public static void main(String[] args) {
        String years = JOptionPane.showInputDialog("what year were you born in?");
        for (int how_old = Integer.parseInt(years); how_old<=2025; how_old++){
            System.out.println(how_old);
        }
    }
}
