/**
 * Tests Die Class
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class TestDie
{
   public static void main( String[] args)
   {    
      //constants 
      
      // variables   
       Die dice;
       
      // programme code 
      dice = new Die();  
      System.out.println ( dice.roll());
      System.out.println ( dice.roll());
      System.out.println ( dice.getFaceValue() );                                 
   }
}
