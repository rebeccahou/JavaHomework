/**
 * This is the program for problem 2, assignment 2. 
 */
package rijia.rebecca.hou_assignment2_p2;
import java.text.DecimalFormat;

/**
 * @version 1.0
 * @author Rijia(Rebecca) Hou
 * 24/09/2013
 */
public class RijiaRebeccaHou_assignment2_p2 {

    /**
     * @param args the command line arguments
     * Description: the program will play 100000 games and calculate the probability of winning.
     */
    public static void main(String[] args) {
        // TODO code application logic here
       final int nTimes = 100000; // how many times the game is going to be played
       DiceRollingGame d = new DiceRollingGame();
       int wins = d.playGames(nTimes); // the time of winning the game
       double pro = 1.0 *wins /nTimes; // pro used to store the probability of winning
       DecimalFormat df = new DecimalFormat("#.##");       
       System.out.println("The probability of winning the game is "+ df.format(100*pro) +"%");
      
       /* After several times of running, the probability of winning is always less than 50%.
        * So the house is more likely to win the game in the long run
        */
        
    }
}
