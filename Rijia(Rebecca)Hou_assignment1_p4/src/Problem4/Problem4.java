
package Problem4;
import java.util.Scanner;

/**
 * @version 1.0
 * @author Rijia(Rebecca) Hou
 * 15/09/2013
 */
/**
 * Description: 
 * This program is for assignment1, problem4. 
 * Users enter an integer n, the program will calculate the result for the method, which is defined as
 * F(0) = 3
 * F(1) = 5
 * F(n) = F(n-1) +5*F(n-2)+n+2
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    /**
     * Description: Users enter an integer n, program will print the result of F(n) 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Function F is defined as :");
        System.out.println( "F(0) = 3");        
        System.out.println("F(1) = 5"); 
        System.out.println("F(n) = F(n-1) + 5*F(n-2) + n + 3");      
        System.out.println("Now please enter an integer n, the program will print the result of F(n) ");
        Scanner scan = new Scanner(System.in);
       try{ int n = scan.nextInt();
        if(n<0)
            System.out.println("InputError: input number shouldn't be negative ");
        else
            System.out.println("The result of F(n)is "+F(n));
       }catch(Exception n ){
           System.out.println("Illegal input!");
       }  
    }
    /**
     * Description: The realization of  function F.  
     * @param n an integer 
     * @return the result of F(n),where F(0)=3, F(1)=5, F(n)=F(n-1)+5*F(n-2)+n+3
     */
    public static int F(int n ){
        if(n == 0)
            return 3;
        else if(n == 1)
            return 5;
        else 
            return F(n-1) +5*F(n-2)+n+2;
    }
    
}
