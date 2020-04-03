package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	
	String flavor = JOptionPane.showInputDialog("What flavor would you like?");
	String time = JOptionPane.showInputDialog("How long do you want it to cook for?");
	int cookTime = Integer.parseInt(time);
	Popcorn bag = new Popcorn(flavor);
	Microwave microwave = new Microwave();
	microwave.setTime(cookTime);
	microwave.putInMicrowave(bag);
	microwave.startMicrowave();
}
}
