
package Problem2;
import java.util.Scanner;
/**
 * @version 1.0
 * @author Rijia (Rebecca) Hou
 * 15/09/2013
 */
/**
 * Description: This program is for Project1 Problem2.
 * Users can input an integer n, and the program will calculate automatically
 * the result of 1*2*...*n.
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    /**
     * Description: Users input an integer through keyboard, the program will print the result of n!
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Please enter an integer n. The program will calculate 1*2*..n for you.");
       Scanner scan = new Scanner(System.in);
       try{
       int n = scan.nextInt(); 
       if(n<0)
           System.out.println("Input Error: no negative number allowed!");
       else{
           int r = 1;
       // r used to restore the results
       for (int i = 1; i<=n; i++){
           r = r*i;
       }
       System.out.println("The result of 1*2*..*n is "+r); 
       }
       }catch(Exception n){
           System.out.println("Illegal input!");
       }
    }
}
