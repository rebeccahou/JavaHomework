package rijia.rebecca.hou_assignment2_p2;
/**
 * @version 1.0
 * @author Rijia(Rebecca) Hou
 * 24/09/2013
 */
/**
 * Description: This class is used to simulate the dice rolling game
 */
public class DiceRollingGame {
    public Dice d1; // dice 1 for the game
    public Dice d2; // dice 2 for the game
   DiceRollingGame(){
        d1 = new Dice();
        d2 = new Dice();
    }
   /**
     * Description:simulate the player playing the game, get the result if the player wins or not. 
     * @return if the player wins or not for a round. true if wins, false if lose
   */     
    public boolean RollingGame(){
       int sum; // store the sum of the results of rolling two dices
       int point = 0; // store the sum if the player has the 4,5,6,8,9,10 as come out roll
       boolean first = true; // true if it's come out roll, false if not come out roll
       while(true){
         sum =  d1.Roll()+d2.Roll();
         switch(sum){
             case 2:{
 //                System.out.println("2");
                 if(first) // 2 as a come out roll, lose automatically
                     return false;
                 else
                     continue;
             }
             case 3:{
//                  System.out.println("3");
                if(first)// 3 as a come out roll, lose automatically
                     return false;
                 else
                     continue;  
             } 
             case 4:{
 //                 System.out.println("4");
                 if( first){ // 4 as a come out roll, keep rolling 
                    point = 4;
                    first = false;
                    continue;
                 }
                 else{
                     if(point==4)// first roll 4 after a 4, win the game
                         return true;
                     else 
                         continue;
                 }
             }
            case 5:{
 //                System.out.println("5");
                if( first){ // 5 as a come out roll, keep rolling 
                    point = 5;
                    first = false;
                    continue;
                 }
                 else{
                     if(point==5)// first roll 5 after a 5, win the game
                         return true;
                     else 
                         continue;
                 }                 
             }
            case 6:{
  //               System.out.println("6");
                if( first){ // 6 as a come out roll, keep rolling 
                    point = 6;
                    first = false;
                    continue;
                 }
                 else{
                     if(point==6)// first roll 6 after a 6, win the game
                         return true;
                     else 
                         continue;
                 }  
            }
            case 7:{
 //                System.out.println("7");
                if(first)// first roll as 7, automatically win
                    return true;
                else // first 7 after other point, lose
                    return false;
            }
            case 8:{
 //                System.out.println("8");
                if( first){ // 8 as a come out roll, keep rolling 
                    point = 8;
                    first = false;
                    continue;
                 }
                 else{
                     if(point==8)// first roll 8 after a 8, win the game
                         return true;
                     else 
                         continue;
                 }       
            }
            case 9:{
 //                System.out.println("9");
                 if( first){ // 9 as a come out roll, keep rolling 
                    point = 9;
                    first = false;
                    continue;
                 }
                 else{
                     if(point==9)// first roll 9 after a 9, win the game
                         return true;
                     else 
                         continue;
                 }                      
            }
            case 10:{
 //                System.out.println("10");
                if( first){ // 10 as a come out roll, keep rolling 
                    point = 10;
                    first = false;
                    continue;
                 }
                 else{
                     if(point==10)// first roll 10 after a 10, win the game
                         return true;
                     else 
                         continue;
                 }          
            }
            case 11:{
 //                System.out.println("11");
                if(first)// 11 as a come out roll, win
                    return true;
                else
                    continue;
            }
            case 12:{
   //              System.out.println("12");
                if(first)// 12 as a come out roll, lose
                    return false;
                else
                    continue;
            }
         }
       }
      
    }
    /**
     * Description: Play the rolling game for n times and return how many times the player wins
     * @param nTimes how many time the player play the game
     * @return how many time the player wins
     */
    public int playGames(int nTimes){
        int totalWins = 0;
        for(int i =1; i<=nTimes; i++){
      //      System.out.println("Round"+i);
            if( RollingGame()){
                totalWins++;
      //      System.out.println("wins");
            }
                
        }
        return totalWins;
           
    }
  
}
