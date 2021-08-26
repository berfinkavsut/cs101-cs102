import java.util.Scanner;

// This programme will demonstrate the maximum number of flowers we can have in a triangular-shaped garden 
// whose sides we will choose if 17 flowers can be planted in each square meter
// First, it will say whether the triangle is possible with the given lengths, then calculate the flower number

/**
 * The Flower Garden
 * @author Berfin Kavþut
 * @version 17/10/2017
 */ 
public class Lab03b
{
  public static void main( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    
    // constants
    final int FLOWERS = 17;
    
    // variables
    
    int a; // the first side
    int b; // the second side
    int c; // the third side
    
    //programme code
    // Take the lengths of each side from the user      
    
    System.out.println( " The lengths of the triangle's sides should be in meter. " );
    System.out.println( " The first length = " );
    a = scan.nextInt();
    System.out.println( " The second length = " );
    b = scan.nextInt();
    System.out.println( " The third length = " );
    c = scan.nextInt();
    
    //Tell whether the triangle can be drawn
    
    while ( !( a < b + c && b < a + c && c < a + b ) )
    {
      System.out.println ( " The triangle can't be formed! Change your values of the sides. " );
      System.out.println( " The first length = " );
      a = scan.nextInt();
      System.out.println( " The second length = " );
      b = scan.nextInt();
      System.out.println( " The third length = " );
      c = scan.nextInt();
    }
        
    // Calculate the semi-perimeter of the triangle in order to use it later in Heron's formula
    // Calculate the area with Heron's formula
    // Heron's formula for the area of a trianle is A, if the a, b and c are the lengths of its sides and s is the semi-perimeter of the triangle
    // A = \sqrt{s(s-a)(s-b)(s-c)}, 
    double semiPerimeter = (  a + b + c ) / 2;
    double s = semiPerimeter;
    double area = Math.sqrt( s *( s - a )*( s - b )*( s - c ));
    
    // Show the area of the triangular-shaped garden
    // Multiply the area by the number of flowers which is 17 in order to find the maximum number of flowers which can be planted in this garden
    System.out.println( " The area of the triangle = " +  area );
    System.out.println( " The maximum number of flowers which can be planted in this garden is " +  (int) (area * FLOWERS) );
  }
}