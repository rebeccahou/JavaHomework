/**
 * This program is for problem1, assignment2
 */
package rijia.rebecca.hou_assignment2_p1;

/**
 * @author Rijia(Rebecca) Hou
 * version 1.0
 * 24/09/2013
 */
public class RijiaRebeccaHou_assignment2_p1 {

    /**
     * @param args the command line arguments
     * Description: The program will simulate 100 students changing the lockers and print the status of each locker
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locker[] L = new Locker[101]; // 100 lockers are used, from L[1] to L[100]  
        int i,j;
        for(i=1; i<=100; i++){ //initialize the Lockers
            L[i] = new Locker();
        }
        for(i=1; i<=100; i++){// simulate 100 students
             for(j = i; j<=100;j=j+i)
                L[j].ChangeStatus(); // simulate student i change status of the lockers from l(i) to l(100)
        }
        for(i = 1; i<=100; i++){ // check the status of each locker and print the status
            if(L[i].ReadStatus()==true)
                System.out.println("Locker "+ i + " is open");
      //      else
      //        System.out.println("Locker "+ i + " is closed");
        }
    }
}
