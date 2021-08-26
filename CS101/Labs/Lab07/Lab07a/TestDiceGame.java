/**
 * Tests Dice Game Class
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class TestDiceGame
{
   public static void main( String[] args)
   {
      // constants

      // variables
     DiceGame testDiceGame;

      // program code
     testDiceGame = new DiceGame();     
     System.out.println ( testDiceGame.play() );     
   }
}
