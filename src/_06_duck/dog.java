package _06_duck;

import javax.swing.JOptionPane;

public class dog {
	
		int age;
		String favoriteColor;
		
		public void Dog(String favoriteColor, int age) {
		  	this.favoriteColor = favoriteColor;
		  	this.age = age;
		}//end Dog

		void bark() {
			JOptionPane.showConfirmDialog(null, "woof its almost your birthday! you're already"+ age + "years old!");
		}//end bark
		
		void run() {
			JOptionPane.showMessageDialog(null, "your dog wants to go on a run, don't forget the" + favoriteColor + "leash");;
		}//end run
		
	}//end dog
