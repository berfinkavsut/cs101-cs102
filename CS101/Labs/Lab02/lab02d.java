import java.util.Scanner;

// This programme will demonstrate maximum how many flowers we can have in a triangular-shaped garden 
// whose sides we already know if 17 flower can be planted in each square meter
// Later the length of its sides can be changed and other results can be obtained

/**
 * The Flower Garden
 * @author Berfin Kavþut
 * @version Oct 10, 2017
 */ 
public class lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final int FLOWERS = 17;
      
      // variables
      int lengthOne;
      int lengthTwo;
      int lengthThree;
      
      //programme code
      // Take the lengths of eeach side from the user
      System.out.println( " The lengths of the triangle's sides should be in square meter. " );
      System.out.println( " The first length = " );
      lengthOne = scan.nextInt();
      System.out.println( " The second length = " );
      lengthTwo = scan.nextInt();
      System.out.println( " The third length = " );
      lengthThree = scan.nextInt(); 
      
      // Calculate the semi-perimeter of the triangle in order to use it later in Heron's formula
      // Calculate the area of the triangle by using Heron's formula for the area of a triangle
      // Heron's formula for the area of a trianle is A, if the a, b and c are the lengths of its sides and s is the semi-perimeter of the triangle
      // A = \sqrt{s(s-a)(s-b)(s-c)}, 
      double semiPerimeter = (  lengthOne + lengthTwo + lengthThree ) / 2;
      double s = semiPerimeter;
      double area = Math.sqrt( s*( s- lengthOne )*( s - lengthTwo )*( s - lengthThree ));
      
      // Show the area of the triangular-shaped garden
      // Multiply the area by the number of flowers which is 17 in order to find the maximum number of flowers which can be planted in this garden
      System.out.println( " The area of the triangle = " +  area );
      System.out.println( " The maximum number of flowers which can be planted in this garden is " +  (int) (area * FLOWERS) );
   }
}