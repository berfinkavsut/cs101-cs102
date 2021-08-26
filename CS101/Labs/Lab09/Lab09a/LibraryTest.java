import java.util.Scanner;
/**
 * @author Berfin Kavþut
 * @version 13/12/2017
 */ 
public class LibraryTest
{
  public static void main( String[] args)
  {
    // constants
    
    // variables
    Library library;
    LibraryBook findBook;
    String option;
    String findTitle;
    String findOption;
    String dueDate;
    String title;
    String author;      
    
    // programme code      
    Scanner scan = new Scanner ( System.in );
    library = new Library ();
    
    // Ask the user to type their command
    System.out.println ( "Type Show, Find, Add or Exit: " );
    option = scan.next();
    
    while ( !option.equals( "Exit" )){
      
      if ( option.equals( "Show" ) )
        // Show the books inside the library
        System.out.println ( library );
      
      else if ( option.equals( "Find" )){
        // Take the title of the book 
        System.out.println ( "   Enter the title of the book you want to find: " );
        findTitle = scan.next(); 
        findBook = library.findByTitle ( findTitle ); 
        if ( findBook != null ){        
          do{
            System.out.println ( "   Enter Return, Loan, Remove or Back (to the main menu) : ");
            findOption = scan.next(); 
            
            if (  findOption.equals( "Loan" ) ){
              if ( !findBook.onLoan() ){
                System.out.println ( "     Enter the due date of the book: " );
                scan.nextLine();
                dueDate = scan.nextLine();
                findBook.loan( dueDate );
              }
              else{
                System.out.println( " The book is on loan." );
              }
            }
            
            else if ( findOption.equals( "Return" )){
              findBook.resetDueDate();
            }
            
            else if ( findOption.equals( "Remove" )){               
//              while ( library.remove ( findBook ) ) {}   
              library.remove ( findBook );
            }
            
          } while ( !findOption.equals ( "Back") );            
        }
        else {
          System.out.println ( " The book is not recorded in the library." );          
        }
      }
      
      else if ( option.equals( "Add" )){
        // Take the title of the book
        System.out.println ( "Enter the title: " );
        scan.nextLine();
        title = scan.nextLine();    
        // Take the author of the book            
        System.out.println ( "Enter the author: " );
        author = scan.nextLine(); 
        // Create a new book inside the library
        library.add ( title, author );
        System.out.println ( "Your book is added to the library." + "\n" + "   Title: " + title + "\n" + "   Author: " + author );
      }
      
      // Ask the user to type the command again
      System.out.println ( "Type Show, Find, Add or Exit: " );
      option = scan.next();
    }
    
  }
}