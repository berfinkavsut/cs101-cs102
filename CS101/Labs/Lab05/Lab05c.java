import java.util.Scanner;

/**
 * Simple Calculator 
 * @author Berfin Kavþut
 * @version 01/11/2017
 */ 
public class Lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      final double FIRST_VALUE = 0.0;
      
      // variables
      double value;  // the current number to be used
      double value2; // the next number taken from the user   
      double sum;
      double current;
      double b;
      double fact;
      double a;
      double n;
      String select;
      String strnumber; 
      String noSpace;
      String calculation;     
      String sin;
      
      // program code          
      System.out.println( "Welcome to \"SimpleCalc\"..." );
      value = FIRST_VALUE;  
      current = 0;
      
      do
      {           
         System.out.println( "---------------" );
         System.out.println( "[" + value + "]" );
         System.out.println( "---------------" );
         System.out.println( "+,-,*,/ value" );
         System.out.println( "Clear");
         System.out.println( "Quit");
         System.out.println( "---------------" );
         System.out.println( "Select:" );
         
         // Take the command for computation
         select = scan.nextLine();      
         calculation = select.substring(0,1);     
         sin = select.substring (0,3);
         
         if ( !( select.equals("Clear")|| select.equals("Quit") || sin.equals("sin") ) )
         {        
            strnumber= select.substring(1,select.length());  
            noSpace = strnumber.trim();      
            value2 = Double.parseDouble(noSpace);
            
            if ( calculation.equals("+") )
            {
               System.out.println( value + value2 );
               value = value + value2;
            }
            
            if ( calculation.equals("-") )
            {
               System.out.println( value - value2 );
               value = value - value2;
            }
            
            if ( calculation.equals("*") )
            {
               System.out.println( value * value2 );
               value = value * value2;
            }
            
            if ( calculation.equals("/") )
            {
               System.out.println( value / value2 );
               value = value / value2;
            }  
         }      
         
         sum = 0;     
         if ( sin.equals("sin") )
         {  
            // Compute the sine with Math.sin method 
            System.out.println( "The sine value computed with the Math.sin method:" + Math.sin(value) );

            
            // Compute the sine with Taylor's series formula until n = 10  
            for ( n=0; n <=10; n++)
            {        
               fact = 1;
               for ( a = 1; a <= (2 * n) + 1; a++)
               {      
                  fact = fact * a;
               }          
               current = Math.pow( (-1), n) * Math.pow ( value, (2 * n) + 1 ) / fact;          
               sum = sum + current;
            }        
            System.out.println( "The sine value computed with the Taylor series until n = 10 :" + sum );   
            
            
            // Compute the sine with Taylor's series formula         
            n = 0;
            sum = 0;        
            do
            { 
               fact = 1;
               for ( a = 1; a <= (2 * n) + 1; a++)
               {      
                  fact = fact * a;
               }          
               current = Math.pow( (-1), n) * Math.pow ( value, (2 * n) + 1 ) / fact;          
               sum = sum + current;
               n = n +1;
            } while ( Math.abs(current) > 0.00001 ); 
            
            
            
            System.out.println( "The sine value computed with the Taylor series:" + sum );  
            value = sum;
            
         }        
         
         if ( select.equals( "Clear" ))
         {
            value = FIRST_VALUE;
         }
      }while ( !(select.equals( "Quit" )) );
      
      System.out.println( "Thanks for using \"SimpleCalc\", goodbye." );      
   }
}
