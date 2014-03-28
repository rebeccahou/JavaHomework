package rijia.rebecca.hou_assignment2_p2;
import java.util.Random;
/**
 * @version 1.0
 * @author Rijia(Rebecca) Hou
 * 24/09/2013
 */
/**
 * Class Dice has one variable num and two methods Roll and getNum.
 */
public class Dice {
    private int num; // use to store the number of the surface of the dice
    /**
     * Description: simulate dice rolling using random numbers and set num with the result
     * @return the result of the dice rolling 
     */
    public int Roll(){
        Random r = new Random();
        num =1+ r.nextInt(6); // generate the random integer from [0,5]
        return num;
        
    }
    /**
     * Description: get the num of the dice
     * @return the variable num
     */
    public int getNum(){
        return num;
    }
    
}
