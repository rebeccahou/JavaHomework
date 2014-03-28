
package Problem5;
import java.util.Scanner;
import java.util.Random;
/**
 * @version 1.0
 * @author Rijia(Rebecca) Hou
 * 16/09/2013
 */
/**
 * This program is designed for problem5.The  program will ask user an integer n,
 * and simulate the rolling of two dices for n times using radom numbers.The program will draw a bar chart
 * showing the respective frequency of each total.
 */
public class Problem5 {
   
    /**
     * @param args the command line arguments
     */
    /**
     * Description: Users enter an integer n, the program will simulate n times of two dice rolling and draw a bar chart to show the frequency of each number occurred
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner(System.in);
       try{
       int n;
        while(true){
        System.out.println("Please enter an integer n");       
        n = scan.nextInt();
        if(n<=0)
            System.out.println("n should bigger than 0 ");
        else
            break;
       }
      int[] d1 = new int[n]; //restore the result of rolling dice1
      int[] d2 = new int[n]; //restore the result of rolling dice2
      int[] sum = new int[n]; //restore the sum of two dices 
      int[] fre = new int[13]; //restore the frequecy of the sum, eg. fre[4]=5 means the result 4 occured 5 times;
      int i;

       for(i=0;i<n;i++){
           d1[i] = Rolling();
           d2[i] = Rolling();
           sum[i] = d1[i]+d2[i];
           fre[sum[i]]++;
       }
       DrawBarChart(n,fre);    
       }catch(Exception n ){
           System.out.println("Illegal input!");
       }     
    }
    /**
     * Method description: Simulate the rolling of dice using Random numbers.
     * @return an integer among 1,2,3,4,5,6
     */ 
    public static int Rolling(){ 
        /* Generate Random numbers in a range to simulate dice rolling*/
        int r;
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6);// range[0,5 ]
        r = 1+randomInt;        
        return r;
    }
    /**
     * Method description: Print the bar chart, showing the frequency of each number occurred in the dice rolling
     * @param n the times of rolling dices
     * @param fre the array used to store the frequency each number occurred.
     */
    public static void DrawBarChart(int n, int[] fre){
        System.out.println("The bar chart below shows the respective frequency of each total, one * represents one time");
        int i,j;
        System.out.println("sum     frequecy");
        for(i=2; i<=12; i++){
            System.out.print(" "+i+" " );
            System.out.print("     ");
            for(j = 1; j<= fre[i]; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
