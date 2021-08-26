import java.util.Scanner;

/**
 * While-Loops Practices
 * @author Berfin Kavþut
 * @version 25/10/2017
 */ 
public class Lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      //constants
      
      //variables
      int n;
      int x;      
      int a;
      int count;
      double k;
      double b;
      
      //program code      
      //Take a positive integer from the user
      System.out.println( "Enter a positive integer:");
      n = scan.nextInt();
      
      //Warn the user if the number is not positive      
      while( n <= 0 ) 
      {
         System.out.println( "The number should be positive!");
         n = scan.nextInt();
      }
      
      //Show the numbers from 0 to n in each line
      x = 0;
      while ( x <= n )
      {
         System.out.print( x + " " );
         x = x + 1;
      }
      System.out.println();
            
      //Show the numbers from 0 to n, there will be 5 numbers in each line
      count = 1;  
      x = 0; 
      while ( x <= n )
      {
         System.out.print( x + " " );
         if( count % 5 == 0 )
         {
            System.out.println( );
         }
         x = x + 1;
         count = count + 1;
      }
      System.out.println();
      
      //Show the numbers from n to 0
      a = n;
      while ( 0 <= a )
      {
         System.out.print( a + " " );
         a = a - 1;
      }
      System.out.println();
      
      //Show the even values from -n up to n
      a = n;
      a = (-1) * a;
      
      while ( a <= n )
      {
         if ( a % 2 == 0 )
         {
            System.out.print( a + " " );
         }
         a = a + 1;
      }
      System.out.println();
      
      //Show the squares of the even values from 0 up to n, there will be 5 numbers in each line
      x = 0;
      count = 1;
      while ( x <= n )
      {
         System.out.print( x * x + " " ); 
         
         if ( count % 5 == 0 )
         {
            System.out.println();
         }
        
         x = x + 2;
         count = count + 1;
      }
      System.out.println();      
      
      //Show the numbers from 3 to n which are divisible by 3 or 4, but not both,
      //from n down to 3 inclusive, there will be five numbers per line
      a = n;
      while ( a >= 3 )
      { 
         if ( (a % 3 == 0 || a % 4 == 0) && ( a % 12 != 0 ))
         {
            System.out.print ( a + " " );
         }
         a = a - 1;
      }
      System.out.println();
      
      
      //Show all the divisors of n ( including 1 )
      x = 1;
      while ( x <= n )
      {
         if ( n % x == 0)
         {
            System.out.print ( x + " " );
         }
         x = x + 1;
      }
      System.out.println();
      
      //Compute k = 1 / number for all numbers from 0 to n 
      //Check if k is bigger than 0.01
      //Show all k in 2 significant digits
      b = (double) n;
      while ( b != 0 )
      { 
         k = 1 / b;
         if ( k > 0.01 )
         {
         System.out.format("%.2f ", k);  
         }
         b = b - 1;
      }
   }
}

