import java.util.Scanner;

/**
 * Methods
 * @author Berfin Kav?ut
 * @version 08.11.2017
 */ 
public class Lab06
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int n;
    String bin1;
    String bin2;    
    int sum;
    String binarySum;
    String reverseEachWord;
    double current;
    double sumSin;
    double sinNumber;
    
    // program code      
    // Show the power table
    for ( n = -1; n <= 10; n++)
    {
      System.out.print ( power ( n , 1 ) + " " + power ( n , 2 ) + " " + power ( n , 3 ) + " " +  power ( n , 4 ) );
      System.out.println();      
    }
    
    // Show the factorial table
    for ( n = 1; n <= 15; n++)
    {
      System.out.println ( n + " " + factorial( n ) );
    }
    
    // Take two binary numbers and calculate their sum
    System.out.println ( "Enter two binary numbers:" );
    bin1 = scan.next();
    bin2 = scan.next();
    sum = toDecimal ( bin1 ) + toDecimal ( bin2 );
    binarySum = toBinary(sum); 
    System.out.println ( "The sum of the numbers in binary is " + binarySum );  
    
    // Take a line from the user and reverse each word of it and show it
    System.out.println ( "Enter your sentence: " );
    scan.nextLine();
    reverseEachWord = scan.nextLine();
    System.out.println ( reverse ( reverseEachWord ));
    
    // Ask for a number, compute its sine 
    System.out.print( "Enter your number to find sin: ");
    sinNumber= scan.nextDouble(); 
    
    // Compute the sine with Taylor's series formula      
    n = 0;
    current = power ( (-1) , 0 ) * power ( sinNumber , (2 * 0) + 1 ) / (double) factorial( (2 * 0) + 1);
    System.out.println ( n + "," + current );         
    sumSin = current;
    
    for ( n = 1 ; n <= 10; n++)
    {           
      current = current * (-1) * power ( sinNumber , 2 ) / (double) ( ( 2 * n ) *  ( 2 * n + 1) );  
      System.out.println ( n + ",   " + current );  
      sumSin = sumSin + current;     
    }      
    
    //Show the sine
    System.out.println ( "The sine computed by Math.sin: " + Math.sin (sinNumber));
    System.out.println ( "The sine computed by Taylor series: " + sumSin );    
  }
  
  /**
   * This method computes the first number to the second number
   * @param x an example input parameter
   * @param y another example input 
   * @return x to the y
   */
  public static double power( double x, int y )
  { 
    double result;
    int a;      
    result = 1;    
    for (a = 1; a <= y; a++)
    {
      result = result * x;  
    }   
    return result;
  }
  
  /**
   * This method computes the factorial of the number
   * @param n an example input parameter
   * @return the factorial of input
   */
  public static int factorial( int n )
  {   
    
    int fact;
    fact = 1;
    
    if ( n > 0)
    {
      int a;
      for ( a = n; a > 0; a--)
      {
        fact = fact * a;
      }
    }
    return fact;        
  }
  
  /**
   * This method reverses the words in one string
   * @param s an example input
   * @return the reverse version of the string
   */      
  public static String reverse (String s)
  {
    int a;
    int b;
    s = s + " ";
    String reverse;
    reverse = "";
    b = 0;
    a = 0;
    
    while ( a > -1 )         
    {
      a = s.indexOf(' ', b );
      
      for ( int i= a; i >= b; i--)
      {
        reverse = reverse + s.charAt(i);
      }      
      b = a + 1;
    }   
    return reverse;
  }
  
  /**
   * This method converts binary to decimal
   * @param String base 2
   * @return decimal number
   */ 
  public static int toDecimal( String base2)
  {      
    int a;
    int b;
    int c;
    int power;
    int sum;
    int toDecimal;
    String base22;    
    
    sum = 0;
    b = 1; 
    for( a =  base2.length()-1 ; a >=0 ; a--)
    {  
      power = 1;
      for (c = 1; c < b; c++)
      {
        power = power * 2;
      }
      
      base22 = "" + base2.charAt(a);           
      if (base22.equals("1"))
      {
        sum = sum + power;
      }
      b = b + 1;
    }
    toDecimal = sum;
    return toDecimal;
  }
  
  /**
   * This method converts decimal to binary
   * @param int number
   * @return binary number
   */      
  public static String toBinary (int number) 
  {
    String toBinary;
    int rem;
    String remainder;
    toBinary = "";
    
    while ( number > 0 )
    {            
      rem = number % 2;
      remainder = "" + rem;
      toBinary = remainder + toBinary;
      number = number / 2;
    } 
    return toBinary;
  }       
}


