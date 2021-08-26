/**
 * Takes the due date when the book is loaned
 * Shows whether the book is loaned or not  
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class TestLibraryBook
{
   public static void main( String[] args)
   {
      // constants

      // variables
      LibraryBook book; 

      // program code
      book = new LibraryBook("War & Peace", "Tolstoy" );     
      System.out.println( "Title: " + book.getTitle() );
      System.out.println( "Author: " + book.getAuthor() );
      System.out.println();
          
      System.out.println( "Due Date: " + book.getDueDate()); 
      System.out.println( "on loan: " + book.onLoan() ); 
      System.out.println( "the times of loan: " + book.getTimesLoaned() );
      System.out.println();
      
      book.loan ( "Dec 1" );
      System.out.println( "Due Date: " + book.getDueDate()); 
      System.out.println( "on loan: " + book.onLoan() ); 
      System.out.println( "the times of loan: " + book.getTimesLoaned() );    
      System.out.println(); 
      
      book.resetDueDate ();
      
      book.loan( "Dec 15" );
      System.out.println( "Due Date: " + book.getDueDate()); 
      System.out.println( "on loan: " + book.onLoan() ); 
      System.out.println( "the times of loan: " + book.getTimesLoaned() );
      System.out.println();
      
      book.loan( "Dec 22" );
      System.out.println( "Due Date: " + book.getDueDate()); 
      System.out.println( "on loan: " + book.onLoan() ); 
      System.out.println( "the times of loan: " + book.getTimesLoaned() );
      System.out.println();
      book.resetDueDate ();
      
      System.out.println( book );
   }
}
