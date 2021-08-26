import java.util.Scanner;

/**
 * Making Some Calculations With The Input Numbers
 * @author Berfin Kavþut
 * @version 25/10/2017
 */ 

public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int n;
      int sum; 
      int count;
      int max;
      int min;     
          
      // Compute the sum, average, minimum and maximum value of the first 100 numbers in the text file     
      count = 0;
      sum = 0;
      max = Integer.MIN_VALUE;
      min = Integer.MAX_VALUE;
      while ( count < 100 )
      {
        n = scan.nextInt ();
        sum = sum + n;
        if ( n >= max )
        {
          max = n;
        }        
        if ( n <= min )
        {
           min = n;
        }
        count = count + 1;
      }
      
      // Show the average, minimum and maximum value of the first 100 numbers in the text file
      System.out.println( "The average is " + ( double ) sum / ( double ) count ) ;
      System.out.println( "The minimum value is " + min );
      System.out.println( "The maximum value is " + max );
  }
}