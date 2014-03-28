/**
 * Description: This program is for problem3 assignment2. 
 */
package rijia.rebecca.hou_assignment2_p3;
import java.util.Random;
import java.util.Arrays;

/**
 * @version 1.0
 * @author Rijia (Rebecca) Hou
 * 25/09/2013
 */
public class RijiaRebeccaHou_assignment2_p3 {

    /**
     * @param args the command line arguments
     * Description: the program will generate a 100000 integer array, and a key.
     * It will use linearSearch and binarySearch to find the key from the array.
     * Finally the program will print the execution time of linearSearch and binarySearch
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = new int[100000];
        int key;  
        
        /*Generate the array with random integers*/
        System.out.println("Array generation begins!");
        for(int i = 0; i<100000;i++){ // randomly generate 100000 integers for list
            Random r = new Random();
            list[i] = r.nextInt(100000);
    
        }
        System.out.println("Array generation complete!");
        key = new Random().nextInt(100000); // randomly generate a key for the list
  
       /*calculate the time of invoking linearSearch*/
        long startTime1 = System.currentTimeMillis();
        LinearSearch.linearSearch(list, key); 
        long endTime1 = System.currentTimeMillis();
        long executionTime1 = endTime1 - startTime1;
        System.out.println("The time of invoking linearSearch is "+ executionTime1+" milliseconds");
        
        /*sort the integer array list*/
        Arrays.sort(list);
        
        /*calculate the time of invoking binarySearch*/
        long startTime2 = System.currentTimeMillis();
        BinarySearch.binarySearch(list,key);
        long endTime2 = System.currentTimeMillis();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("The time of invoking binarySearch is "+ executionTime2+" milliseconds");
    
    }
    
}
