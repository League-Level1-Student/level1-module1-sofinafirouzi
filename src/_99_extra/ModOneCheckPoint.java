package _99_extra;

public class ModOneCheckPoint {
//give them good names
    void square(Robot bot) {

          for (int i=0; i<4; i++) { 
              bot.move(100);
              bot.turn(90);

         }
    }


    JLabel setLabel() {

         JLabel label = new JLabel();
         label.setText("STOP");
         return label;
    }


    void tryCode(int guess) {

         if (guess == secretCode) {
             playSound("woohoo.wav");
             JOptionPane.showMessageDialog(null,"Congratulations! You cracked the safe with " + guess);
         }
    }



    void orangePeel() {

         while (orange.hasMorePeel) {
             orange.peel();
         }
    }



    void energyCheck (Person person, boolean isSleepy) {

         if (isSleepy) {
             person.addCoffee();
         }
    }


}
