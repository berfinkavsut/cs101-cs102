/**
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class Dice
{
   // properties
   private Die dice1;
   private Die dice2;
   private int total;
   
   // constructors
   public Dice (){
     dice1 = new Die ();
     dice2 = new Die ();
     total = 0;     
   }
   
   // methods   
   public int roll (){
     dice1.roll();
     dice2.roll();
     total = dice1.getFaceValue() + dice2.getFaceValue();
     return total;
   }
   
   /**
   * Rolls the first dice
   * @return the current face value of the first dice
   */
   public int getDie1FaceValue (){
     return dice1.getFaceValue();
   }
   
   /**
   * Rolls the second dice
   * @return the current face value of the second dice
   */
   public int getDie2FaceValue (){
     return dice2.getFaceValue();
   }
   
   /**
   * Calculates the sum ofthe current face values 
   * @return total
   */   
   public int getDiceTotal (){
     return total;
   }
   
   /**
   * Demonstrates the result of the methods
   * @return the resultof the methods in sentence 
   */  
   public String toString(){
     return "First current face value is " + dice1.getFaceValue() + ". " + "\n" + "Second current face value is " + dice2.getFaceValue() + ". ";             
   }
}