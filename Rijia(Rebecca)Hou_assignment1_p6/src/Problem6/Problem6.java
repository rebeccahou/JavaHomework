
package Problem6;
import java.util.Scanner;
import java.util.Date;
/**
 * @version 1.0
 * @author Rijia(Rebecca) Hou
 * 15/09/2013
 */
/**
 * Description : This program is for problem6.The program will test how fast user can type the 
 * sentence "I type very quickly".After the user type the sentence correctly, the
 * program will automatically calculate how many miliiseconds the user has used. 
 */
public class Problem6 {
    /**
     * @param args the command line arguments
     */
    /**
     * The program will test how fast user can type the sentence "I type very quickly".The program will record the start time and end time of user typing with Date class. After the user type the sentence correctly, the program will automatically calculate how many miliiseconds the user has used.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Your job is to type the sentence"+"'"+"I type very quickly"+"'"+" as fast as you can. ");
        System.out.println("When you are ready, press enter,type the sentence,and press enter again.");
        System.out.println("Now press enter..");
        String sen = new String("I type very quickly");
        Scanner scan = new Scanner(System.in);
        long start, end;
        String c;
        char yn;
        while(true){
            c= scan.nextLine(); // detect enter key!
            System.out.println("Start to type now! 'I type very quickly'");
            start = new Date().getTime(); 
            String input = scan.nextLine();
            if(input.equals(sen)){ // user type the sentence correctly, print the time user spent
                end = new Date().getTime();
                System.out.println("You spent "+(end-start)+"milliseconds.");
                System.out.println("Maybe you can do better. Do you want to try again?(y/n)");
            }
            else{
                System.out.println("Error:Your input is not exactly the same as the sentence\nDo you want to try again?(y/n)");
            }
            while(true){
                yn= scan.next().charAt(0);
                if(yn=='y' || yn =='n')
                    break;
            }
            if(yn=='n')
                break;
            else if(yn =='y'){
                System.out.println("Press enter to start a new turn!");
                c= scan.nextLine(); 
            }
               
        }
       
            
    }
}
