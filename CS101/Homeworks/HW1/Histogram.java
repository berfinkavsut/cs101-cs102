import java.util.Scanner;

/**
 * This programme takes a series of numbers from the user and
 * demonstrates the number and character "*" as much as this number
 * @author Berfin Kavþut
 * @version 11/11/2017
 */ 

public class Histogram
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int number;
      
      // program code
      
      // Take a number and display the number and "*" as much as this number
      // End the loop when the user enters a negative number
      System.out.print("Enter the numbers: ");
      number = scan.nextInt();
      while( number >= 0 )
      {
         System.out.print (number + " " );         
         for ( int i = 1; i <= number; i++)
         {
            System.out.print("*");
         }
         System.out.println ();          
         number = scan.nextInt();
      } 
   }
}
