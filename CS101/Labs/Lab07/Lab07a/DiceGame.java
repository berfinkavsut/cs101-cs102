/**
 * __program description___ 
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class DiceGame
{
  // properties
  private Dice dice;
  private int count;
  
  // constructors
  public DiceGame (){
    dice = new Dice ();
    count = 0;
  }
  
  // methods
  
  /**
   * Counts until two dices are 6 at the same time
   * @return the count times
   */
  public int play (){
    while ( dice.roll() != 12 ){
       count ++;
    }
    return count;
  }  
}
   

