
package Problem1;
import java.util.Scanner;
/**
 * @version 1.0
 * @author Rijia (Rebecca) Hou
 * 15/09/2013 
 * Description: This program is for the assignment project1, problem1.
 */
public class Problem1 {

    /**
     *  @param args the command line arguments
     */
    /**
     *Description: Users enter an integer, the program will print the result of 1+2+...+n.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter an integer n. The program will calculate 1+2+..+n for you.");
        Scanner scan = new Scanner(System.in);
        try{
        int n = scan.nextInt();
         if(n<0)
            System.out.println("Input Error: You should enter a positive number!");
        else{
        int sum = 0;  // store the value of sum 1+2+...+n
        int i;
        for(i = 0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("The result of 1+2+...+n is "+sum);
        }
        } catch(Exception n){
            System.out.println("illegal input!");
        }
       
       
        
    }
}
