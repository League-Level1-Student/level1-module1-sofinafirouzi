package _06_duck;

import javax.swing.JOptionPane;

public class duck {
int numberOfFriends;
String favoriteFood;
public void Duck(String favoriteFood, int numberOfFriends) {
  	this.favoriteFood = favoriteFood;
  	this.numberOfFriends = numberOfFriends;
}//end Duck

void quack() {
	JOptionPane.showMessageDialog(null, "quack!! I want " + favoriteFood);
}// end quack

void waddle() {
	JOptionPane.showMessageDialog(null, "waddle waddle waddle lets go on a walk with your" + numberOfFriends + "friends!");
}//end waddle


}//end class duck


