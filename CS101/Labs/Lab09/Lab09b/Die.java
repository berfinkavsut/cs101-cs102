/**
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class Die
{
   // properties
   private int currentFaceValue;
   
   // constructors
   public Die (){
     currentFaceValue = 0;
   }
   
   // methods
   
   /**
   * Rolls a dice
   * @return the current face value
   */
   public int roll (){     
      currentFaceValue = (int)( Math.random() * 6 + 1 );
      return currentFaceValue;
   }
   
   /**
   * Shows the current face value
   * @return the current face value
   */
   public int getFaceValue(){
      return currentFaceValue;
   }  
   
   /**
   * Shows the result of the methods
   * @return the current face value in sentence
   */   
   public String toString(){
     return "Current face value is " + currentFaceValue; 
   }
}
