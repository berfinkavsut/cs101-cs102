import java.util.Scanner;

/**
 * Drawing A Triangle
 * @author Berfin Kavþut
 * @version 25/10/2017
 */ 
public class Lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      char character;
      double n;
      
      // program code
      
      // Take a character from the user
      System.out.println( "Enter a character:");            
      character = scan.next().charAt(0);    
      
      // Take a number from the user
      System.out.println( "Enter a number:");
      n = scan.nextInt ();
      
      for (int i=1; i< ( 2 * n)  ; i += 2)
      {
         for (int k=0; k < (n - i / 2); k++)
         {
            System.out.print(" ");
         }
         for (int j=0; j<i; j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      
//      // Draw the triangle with the character and the number      
//      for ( int k = 1; k <= n; k++ )
//      {
//         for ( int b = 1; b <= (2 * n - 1); b++)
//         {
//            while ( b < ( n - ( k - 1 ) ) )
//            {
//               System.out.print(" ");               
//            }          
//            
//            int a=1;
//            while ( b >= ( n - ( k - 1 ) ) || b <= ( n + ( k - 1 ) ) )
//            {                
//               if ( a % 2 != 0 )
//               {
//                  System.out.print(character);
//               }
//               else 
//               {
//                  System.out.print(" ");           
//               } 
//               a++;
//            }  
//         System.out.println ();
//      }
// }
   }
}




