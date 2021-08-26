import java.util.Scanner;

/**
 * Lab03a
 * @author Berfin Kavþut
 * @version 18/10/2017
 */ 
public class Lab03a
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int n;
    int sum;
    int sum2;
    int even;
    int odd;
    
    even = 0;
    odd= 0;
    
    // program code
    for ( int x = 0; x <= 50; x++ ) 
    {
      if ( !( x >= 12 && x <= 25 ) )
      {
        System.out.println( x + " is out of the range 12-25" );
      }
      else
      {
        System.out.println( x ); 
      }
      
      // Show whether each number is odd or even
      // Count the even and odd numbers and then show how many even numbers there are until 50  
      if ( x % 2 == 0 )
      { 
        System.out.println( x + " is even" );
        even = even + 1;
      }
      else
      {
        System.out.println(  x + " is odd" );
        odd = odd + 1;
      }
      //  Show if the number is multiple of 2, 5, 3 or 7 ( the sequence of the numbers are important )
      if ( x % 5 == 0 )
      {
        System.out.println( x + " Hi Five!" );
      }
      else if (  x % 2 == 0 )
      {
        System.out.println( x + " Hi Two!" );
      }
      else if (  x % 3 == 0 || x % 7 == 0 )
      {
        System.out.println( x + " Hi ThreeOrSeven!" );
      }
      else      
      {
        System.out.println( x + " Hi Others!" );
      }
    }
    
    System.out.println ( "There are " + even + " even numbers until 50." );  
    System.out.println ( "There are " + odd + " odd numbers until 50." );  
    
    // Take a number and show what is the sum when we add all the numbers until that number
    System.out.println ( "Enter a number:" );
    n = scan.nextInt();
    sum = 0;
    for ( int x = 0; x <= n; x++ )
    {  
      sum = sum + x;
    }
    System.out.println( "The sum is " + sum); 
    
    // Calculate the sum with the formular in order to control the sum then tell whether the sum is tru or not    
    sum2 = ( n * ( n + 1 ) ) / 2;
    if ( !( sum == sum2 ) )
    {
      System.out.println( " The sums are different. " );  
    }
    else 
    { 
      System.out.println( " The sums are the same " );
    }
  }
}

