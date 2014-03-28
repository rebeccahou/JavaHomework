
package problem3;
import java.util.Scanner;
/**
 * @version 1.0
 * @author Rijia(Rebecca) Hou
 * 15/09/2013
 */
/**
 * Description:
 * This program is for Project1 Problem3. 
 * Users can enter an integer n and the program will display a multiplication
 * table modulus n, which begins with 1*! mod n and finishes at 12*12 mod n.
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    /**
     * Description: Users enter an integer n, the program will print a multiplication table modulus n, beginning with 1*! mod n and finishes at 12*12 mod n.
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter an integer n, the program will print a multiplication table modulus n, beginning with 1*! mod n and finishes at 12*12 mod n.");
        Scanner scan = new Scanner(System.in);
        try{
        int n = scan.nextInt();
        if(n<0)
            System.out.println("Input Error, the input number should not be negative");
        else{
        System.out.println("The multiplication table modulus n as below: ");
        int i,j;
       // Print the number of each row;        
        System.out.print("  ");
        for(i = 1;i<=12;i++){
            System.out.format("%6d", i);
        }
       System.out.println();
        for(i = 1; i<=12; i++){
            System.out.format("%3d", i); // print the number of each line
            for(j =1; j<=12; j++){
                System.out.format("%5d", i*j%n); // print the number in the table
                System.out.print(" ");
                }
                System.out.print("\n");
        }    
        }
        }catch(Exception n){
            System.out.println("Illegal input!");
        }
        
    }
}
