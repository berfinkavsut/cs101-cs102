import java.util.Scanner;

/**
 * Calculation Examples With Certain Constants and Variables
 * @author Berfin Kavþut 
 * @version Oct 10, 2017
 */ 
public class lab02c
{
   public static void main( String[] args)
   {     
      Scanner  scan = new Scanner( System.in);
      
      // constants
      
      //variables
      int apples;
      int bananas;
      
      //programme code
      // Take the values for apples, bananas and people from the user
      System.out.println( " The number of apples should be bigger than the number of bananas in order to make the calculations properly." );
      System.out.println( " The number of apples " );
      apples = scan.nextInt();
      System.out.println( " The number of bananas " );
      bananas = scan.nextInt();
      
      // Sum the constants and report the result
      System.out.println( "Apples + Bananas = " + ( apples + bananas ));

      // Substract the number of apples from the number of bananas and report the result
      System.out.println( "Bananas - Apples = " + ( bananas - apples )); 
      
      // Multiply the constants and report the result
      int x = apples * bananas;
      System.out.println( "Apples x Bananas = " + x );

      // Divide the number of apples by the number of bananas and report the result
      System.out.println( "Apples / Bananas = " + ( apples / bananas ));
      System.out.println( "The remainder of the division is " + ( apples - ( apples / bananas ) * bananas ));
      
      // Divide the number of apples by the number of bananas and report the exact result  
      System.out.println( "Apples / Bananas = " + (double) (apples) / (double) (bananas) );

      // Give the max value between apples and bananas
      System.out.println( "max(apples,bananas)= " + Math.max( apples, bananas )); 
      
      // If the numbers of the apples and bananas are the lenghts of a right triangle
      // Give the hypothenuse of this triangle   
      int a = apples;
      int b = bananas;
      System.out.println( "The hypothenuse of the triangle is " + Math.hypot(a,b));
   }
}
