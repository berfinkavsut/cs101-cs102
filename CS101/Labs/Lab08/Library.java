/**
 * @author Berfin Kavþut
 * @version 06/12/2017
 */ 
public class Library
{
  // properties
  private LibraryBook b1;
  private LibraryBook b2;
  private LibraryBook b3;
  private LibraryBook b4;
  
  // constructor
  public Library (){
    b1 = null;
    b2 = null;
    b3 = null;
    b4 = null;     
  }          
  
  // methods   
  /** 
   * Shows if the library has books or not
   * @return whether the library has books
   */  
  public boolean isEmpty(){      
    if ( b1 == null && b2 == null && b3 == null && b4 == null )        
      return true;
    return false;
  }
  
  /** 
   * toString
   * @return the books in list
   */   
  public String toString (){
    if ( isEmpty() )   
      System.out.println ( " The library is empty." );
    return "" + b1 + "\n" + b2 + "\n" + b3 + "\n" + b4;
  }   
  
  /** 
   * Adds new book to the library by defining a book which is not defined yet
   * @param String title 
   * @param String author
   */  
  public void add ( String title, String author ){      
    if ( b1 == null ){
      b1 = new LibraryBook ( title, author );
    }
    else if ( b2 == null ){
      b2 = new LibraryBook( title, author );
    }
    else if ( b3 == null ){
      b3 = new LibraryBook ( title, author );
    }
    else if ( b4 == null ){
      b4 = new LibraryBook( title, author );         
    }
  }
  
  /** 
   * Takes the LibraryBook object and compares with the books in the library
   * If the books is the same, the method deletes that book from the library retur
   * @param LibraryBook object
   * @return false if the book is not available or true if the book is in the library
   */    
  public boolean remove ( LibraryBook book){ 
    boolean a;
    a = false;
    if ( book != null && b1 != null && book.equals(b1)){
      b1 = null;      
      a = true;
    }
    if ( book != null && b2 != null && book.equals(b2)){
      b2 = null;     
      a = true;
    }
    if ( book != null && b3 != null && book.equals(b3)){
      b3 = null;      
      a = true;
    }
    if ( book != null && b4 != null && book.equals(b4)){
      b4 = null;       
      a = true;
    }
    return a;   
  }
  
  /** 
   * Returns the first LibraryBook object having the title 
   * @param String title 
   * @return LibraryBook object
   */  
  public LibraryBook findByTitle( String title ){      
    if ( b1 != null && title.equals ( b1.getTitle() ) )
      return b1;
    else if ( b2 != null && title.equals ( b2.getTitle() ) )
      return b2;
    else if ( b3 != null && title.equals ( b3.getTitle() ) )
      return b3;
    else if ( b4 != null && title.equals ( b4.getTitle() ) )
      return b4;
    else {
      System.out.println ( "The book is not available." );
      return null;
    }
  }
}
