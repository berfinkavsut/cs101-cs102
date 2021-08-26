import java.util.Scanner;

/**
 * This programme shows the number of adjacent numbers
 * @author Berfin Kavþut
 * @version 11/11/2017
 */ 
public class AdjacentDuplicates
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int number1; 
      int number2;
      int count;
      
      // program code        
      // Take the series of the numbers
      System.out.print( "Enter numbers: " );
      number1 = scan.nextInt();     
      System.out.println( "Adjacent Duplicate, Occurence Count");
      
      // Check whether the adjacent numbers are the same 
      // Demonstrate the number and its repetition time 
      // End the loop when the user enters 0
      count = 1;  
      do 
      { 
         number2 = scan.nextInt();       
         if ( number2 == number1 )
         {
            count = count + 1; // increment count by 1
         }
         // Show the number and its repetition and set count to 1 again
         else if ( count != 1 )
         {
            System.out.println ( number1 + "," + count );
            count = 1;
         }
         number1 = number2;
      } while ( number2 != 0 ); 
   }
}
