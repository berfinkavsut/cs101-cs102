import java.util.Scanner;

/**
 * Drawing Rectangles With Holes
 * @author Berfin Kavþut
 * @version 01/11/2017
 */ 
public class Lab05a
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int height;  // a
    int width;   // b
    int thickness;   //c
    int a;
    int b;
    int c;
    int h;
    int w;
    int t;
    String again;
    
    // program code
    
    do
      {      
      do
      {        
      //Take the height 
      System.out.println( "Enter the height:" );
      height = scan.nextInt();
      //Take the width
      System.out.println( "Enter the width:" );
      width = scan.nextInt();      
      //Take the thickness
      System.out.println( "Enter the thickness:" );
      thickness = scan.nextInt(); 
      
      if ( thickness <= 0 || width <= 0 || height <= 0 )
      {
         System.out.println( "The numbers should be positive" );
      }
      }
      while ( height < 0 || thickness < 0 || width < 0 );
      
      h = height;
      w =  width;
      t = thickness;  
      
      // Draw the rectangle with the given information  
      for ( a = 1; a <= h; a++)
      {
        if ( a <= t || a > (h - t) )
        { 
          for ( b = 1; b <= w; b++)
          {
            System.out.print ( "*" );
          }
          System.out.println();
        }
        else         
        { 
          for ( c = 1; c <= w ; c++ )
          {                             
            if ( c <= t || c > (w - t) )
            {
              System.out.print ( "*" );
            }
            else 
            {
              System.out.print ( " " );
            }           
          }
          System.out.println();
        }
      }
      //Warn the user if the rectangle doesn't have holes  
      if( width - ( thickness * 2 ) <= 0 || height - ( thickness * 2 ) <= 0 ) 
      {
        System.out.println( "Oops... no hole!");  
      }
      //Ask whether the user wants to try again
      System.out.println( "Do you want to try again? Press Y:");
      again = scan.next();
      
      } while ( again.equalsIgnoreCase("y")); 
    
    System.out.println( "goodbye..." );    
  }
}


