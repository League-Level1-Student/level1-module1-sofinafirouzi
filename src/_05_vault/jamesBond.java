package _05_vault;

import javax.swing.JOptionPane;

public class jamesBond {

	void findCode(Object vault, int secretCode) {
		for(int i = 0; i<1000000 ; i++) {
		if(secretCode==i) {
			JOptionPane.showMessageDialog(null, "Congrats! you opened the vault!"+ i + "was the secret code!");
			break;
		}//end if
		else {
			System.out.println("Sorry, " + i + "was not the secret code" );
		}
		}//end for
		
	}
}
