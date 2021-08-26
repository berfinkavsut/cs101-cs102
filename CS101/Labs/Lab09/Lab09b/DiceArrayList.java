import java.util.ArrayList;
/**
 * This programme rolls two dices at the same time for 1000 times 
 * Gets the total of the dices each time
 * Gets how many times that total is got by rolling the dices
 * Shows the numbers of the total number of the dices  by printing a histogram 
 * @author Berfin Kavþut
 * @version 13/12/2017
 */ 
public class DiceArrayList
{
   
   /**
   * Creates an array list by rolling two dices at the same time and
   * increasing the times of the total value by 1 each time 
   * @param the roll times
   * @return The array list for the times for the total number of the dices
   */
  public static ArrayList<Integer> dataCollector(int rollTimes){
    
    int rollNumber;
    Dice dice;
    ArrayList<Integer> diceRollList;

    diceRollList = new ArrayList<Integer>();
    dice = new Dice();    
    
    // Set the places for the dice totals inside the array list by setting each number to zero
    for (int i = 2; i <= 12; i++){   
      diceRollList.add(0);
    }
    
    for (int k = 0; k < rollTimes; k++ ){   
      // Roll the dices
      rollNumber = dice.roll();     
      // Increment every number for the roll total after each roll
      diceRollList.set(rollNumber - 2, diceRollList.get(rollNumber - 2) + 1);
    }
    
    // Print the array list which holds all the numbers for the roll times for each total number
    return diceRollList;      
  }
   
   /**
   * Prints a histogram by taking frequency data for each roll times
   * @param array list of the roll times
   */
  public static void printer(ArrayList<Integer> diceRollList){
    int max;
    int unit;
    int histogram;
    max = 0;
    
    // Show the array list
    System.out.println(diceRollList); 
    
    // Get the maximum of the roll times
    for (int p = 0; p < diceRollList.size(); p++){
      if ( diceRollList.get(p) >= max){
        max = diceRollList.get(p);
      }
    } 
    
    // Set the unit for representing one star
    unit = max / 10;   
    
    // Print the histogram
    for (int i = 10; i >= 1; i-- ){
      for (int j = 2; j <= 12; j++) {
        // Get the roll times for each total number from 2 to 12
        histogram = diceRollList.get(j-2);            
        // Check whether the roll time is bigger or smaller for the certain number needed by the line which it is in 
        // If it is bigger than the number print "*", if not print " "
        if ( histogram < ( unit * i ) )
          System.out.print(" ");
        else
          System.out.print("*");       
      }     
      System.out.println();      
    }
  }
    
  public static void main (String[]args){
    printer(dataCollector(1000));
  }  
}
