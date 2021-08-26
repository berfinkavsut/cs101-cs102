import java.util.Scanner;

/**
 * Making Some Calculations With The Input Numbers - 2
 * @author Berfin Kavþut
 * @version 25/10/2017
 */ 

public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int n;
      int sum; 
      int max;
      int min;
      int count;
      
      // program code
      // Compute the sum, average, minimum and maximum value of the numbers until the negative number in the text file
      sum = 0;
      count = 0;
      max = Integer.MIN_VALUE;
      min = Integer.MAX_VALUE;
      n = scan.nextInt ();
      while ( n >= 0 )
      {                
        if ( n > max )
        {
           max = n;
        }
        if ( n < min )
        {
           min = n;
        }
        sum = sum + n;
        count = count + 1;
        n = scan.nextInt ();
      }
      
      // Show the sum, average, minimum and maximum value of the numbers until the negative number in the text file
      System.out.println( "The average is " + ( double ) sum / ( double ) count );
      System.out.println( "The minimum value is " + min );
      System.out.println( "The maximum value is " + max );
  }
}