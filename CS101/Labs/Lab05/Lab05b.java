import java.util.Scanner;

/**
 * The Computation Table 
 * @author Berfin Kavþut
 * @version 01/11/2017
 */ 
public class Lab05b
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // constants
    
    // variables
    int row;
    int col;
    int r;
    int c;
    int number;
    String printed;
    int printedLength;
    int diff;
    int i;
    
    // program code
    
    //Take the row number    
    System.out.println( "Enter the rows number:" );
    row = scan.nextInt();
    //Take the columns number
    System.out.println( "Enter the columns number:" );
    col = scan.nextInt();
    
    // Show the number table
    System.out.println( "The table for the selected numbers:" );
    for ( r=1; r <= row; r++)
    {
      for ( c=1; c <= col; c++)
      {
        printed = r + "," + c;
        printedLength = printed.length();
        diff = 6 - printedLength;
        
        for( i=0; i < diff; i++)
        {
          System.out.print(" ");
        }      
        System.out.print( r + "," + c);
      }
      System.out.println();
    }
    
    // Show the multiplication table
    System.out.println( "The multiplication table:" );
    for ( r=1; r <= row; r++)
    {
      for ( c=1; c <= col; c++)
      {        
        printed = "" + (r * c) ;
        printedLength = printed.length();
        diff = 6 - printedLength;
        
        for( i=0; i < diff; i++)
        {
          System.out.print(" ");
        }      
        System.out.print( r * c);
      }
      System.out.println();
    }
    
    // Show the number table starting from 0
    number = 0;
    System.out.println( "The table starting from 0:" );
    for ( r=1; r <= row; r++)
    {  
      for ( c=0; c < col; c++)
      {        
        printed = "" + number ;
        printedLength = printed.length();
        diff = 6 - printedLength;        
        for( i=0; i < diff; i++)
        {
          System.out.print(" ");
        } 
        System.out.print(number);
        number++;
      }
      
      System.out.println();
    }
    
    // Show the number table only showing the row 
    System.out.println( "The table only showing the row number in the first column:" );
    for ( r=1; r <= row; r++)
    {
      for ( c=1; c <= col; c++)
      {                
        if ( c == 1 )
        {    
          printed = "" + r;
          printedLength = printed.length();
          diff = 6 - printedLength;
          
          for( i=0; i < diff; i++)                  
          {
            System.out.print(" ");        
          }
          System.out.print(r);
        }
        else 
        {
          printed = "-";
          printedLength = printed.length();
          diff = 6 - printedLength;
          
          for( i=0; i < diff; i++)                  
          {
            System.out.print(" ");        
          }
          System.out.print("-");           
        }
      }
      System.out.println();
    }     
  }
}




