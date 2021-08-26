/**
 * Rolling A Pair of Dices
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class First
{
   public static void main( String[] args)
   {
      // constants

      // variables
      int roll;
      int dice1;
      int dice2;

      // program code
      roll = 0;
      dice1 = 0;
      dice2 = 0;
      while ( dice1 != 6 || dice2 != 6 ) {
        dice1 = ( int ) ( Math.random() * 6 + 1 );
        dice2 = ( int ) ( Math.random() * 6 + 1 );
        roll++;
      }      
      System.out.println( "The number of the rolls until two of the dices are 6 is " + roll + "." );
   }
}
