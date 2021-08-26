/**
 * @author Berfin Kavþut
 * @version 06/12/2017
 */ 
public class TestLibraryBook
{
  public static void main( String[] args)
  {
    // constants
    
    // variables
    LibraryBook book1; 
    LibraryBook book2;
    LibraryBook book3;
    LibraryBook book4;
    
    // program code
    book1 = new LibraryBook("War & Peace", "Tolstoy" );
    // Initiliaze book2 with book1
    book2 = book1;   
    book3 = book1.clone();
    book4 = new LibraryBook("Pride & Prejudice", "Jane Austen" );          
    
//      // Show the due date, whether it is loaned or not and the loan times of the book
//      // The due date is expected to not be initiliazed
//      System.out.println( "Due Date: " + book1.getDueDate()); 
//      System.out.println( "on loan: " + book1.onLoan() ); 
//      System.out.println( "the times of loan: " + book1.getTimesLoaned() );
//      System.out.println();
//      
//      // Change the due date of the book and its information of loaning
//      book1.loan ( "Dec 1" );
//      System.out.println( "Due Date: " + book1.getDueDate()); 
//      System.out.println( "on loan: " + book1.onLoan() ); 
//      System.out.println( "the times of loan: " + book1.getTimesLoaned() );    
//      System.out.println(); 
//      
//      // Reset the due date of the book when the book is returned      
//      book1.resetDueDate ();
//      
//      // Change the due date of the book again and its information of loaning
//      book1.loan( "Dec 15" );
//      System.out.println( "Due Date: " + book1.getDueDate()); 
//      System.out.println( "on loan: " + book1.onLoan() ); 
//      System.out.println( "the times of loan: " + book1.getTimesLoaned() );
//      System.out.println();
//      
//      // Change the due date of the book  
//      // The programme won't be able to change it because the book is not returned
//      book1.loan( "Dec 22" );
//      System.out.println( "Due Date: " + book1.getDueDate()); 
//      System.out.println( "on loan: " + book1.onLoan() ); 
//      System.out.println( "the times of loan: " + book1.getTimesLoaned() );
//      System.out.println();       
    
    //Show the necessary information about the books
    System.out.println( "book1: " + book1 + "\n" + "book2: " +  book2 + "\n" + "book3: " +  book3 + "\n" + "book4: " +  book4 ); 
    
    // Compare the first object with other references 
    System.out.println( "book1 == book2 : " + (book1 == book2) ); 
    System.out.println( "book1 == book3 : " + (book1 == book3) ); 
    System.out.println( "book1 == book4 : " + (book1 == book4) ); 
    
    // Compare two references of one single object
    System.out.println( "book1.equals(book2) : " + book1.equals(book2) );     
    
    // Compare two objects whose properties are different
    System.out.println( "book1.equals(book4) : " + book1.equals(book4) );
    
    // Compare these two objects when their properties are the same      
    System.out.println( "book1.equals(book3) : " + book1.equals(book3) );
    
    // Test hasSameAuthor() method
    // Compare the authors of two books when these properties are the same
    System.out.println( "Are the authors of  book1 and book2 the same?: " + book1.hasSameAuthor(book2));
    // Test hasSameTitle() method
    // Compare the titles of two books when these properties are the same
    System.out.println( "Are the titles of  book1 and book4 the same?: " + book1.hasSameTitle(book4));
    
  }
}
