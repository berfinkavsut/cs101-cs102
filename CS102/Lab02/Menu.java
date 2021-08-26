import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author __Berfin Kavþut___
 * @version __28/02/2018__
 */ 
public class Menu
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner ( System.in );
    
    // constants
    
    // variables 
    ArrayList < MySimpleURLReader >  poems;
    String                           poemURL;
    int                              select;  
    int                              poemIndex;
    int                              URLlength;
    
    // program code    
    poemURL = ""; 
    poemIndex = 0;
    poems = new ArrayList < MySimpleURLReader > ();
    
    // Introduce the user
    System.out.println( "Welcome to The Poem Generator Programme!" 
                         + "\n" + "In order to create your poem list, add URLs of your poems."
                         + "\n" + "Select 1 to enter your URL."
                         + "\n" + "Select 2 to print a poem from the list."
                         + "\n" + "Select 3 to exit.");
    
    // Take selection   
    System.out.print( "Select: " );
    select = scan.nextInt();
    
    while ( select != 3 ) {     
      if ( select == 1 ) { 
        
        System.out.println( "Enter the url of the poem that you would like to add to the list: " );
        poemURL = scan.next();
        URLlength = poemURL.length(); 
        
        if( poemURL.substring( URLlength - 3, URLlength ).equals( "txt" ) ) 
        {
          poems.add( new MySimpleURLReader ( poemURL ) );
        }
        else if( poemURL.substring( URLlength - 3, URLlength ).equals( "htm" ) )
        {
          poems.add( new HTMLFilteredReader ( poemURL ) );    
        }
      }
      
      if ( select == 2 ) {
        
        for ( int i = 0; i < poems.size(); i++ ) {
          System.out.println( "Index: " + i + "\t" + poems.get( i ).getName() );
        }
        
        System.out.println( "Enter the index of the poem you would like to see: " );
        poemIndex = scan.nextInt();
        // Check whether the entered numbers is not out of index border
        if ( poemIndex < poems.size() ) {
          System.out.println( "The poem you selected: " + "\n" + poems.get( poemIndex ).getPageContents() );
        }
      }   
      
      // Ask again for selection
      System.out.print( "Select: " );
      select = scan.nextInt();
    }
  
        
    
  
  }  
}
