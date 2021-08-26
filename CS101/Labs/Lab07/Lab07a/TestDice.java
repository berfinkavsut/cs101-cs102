/**
 * Tests Dice Class 
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class TestDice
{
   public static void main( String[] args)
   {
     
     // constants

     // variables
     Dice diceTest;

     // program code     
     diceTest = new Dice ();
     System.out.println( diceTest.roll());
     System.out.println( diceTest.getDie1FaceValue());     
     System.out.println( diceTest.getDie2FaceValue());
     System.out.println( diceTest.getDiceTotal());
   }
}
