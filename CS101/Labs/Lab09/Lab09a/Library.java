import  java.util.ArrayList;
/**
 * @author Berfin Kavþut
 * @version 13/12/2017
 */ 
public class Library
{
  // properties
  private ArrayList<LibraryBook> libraryList;
  
  // constructor
  public Library (){
    libraryList = new ArrayList<LibraryBook>();    
  }          
  
  // methods   
  /** 
   * Shows if the array list has the books or not
   * @return whether the library has books
   */  
  public boolean isEmpty(){      
    if ( libraryList.isEmpty() == true)        
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
    return "" + libraryList;
  }   
  
  /** 
   * Adds new book to the array list
   * @param String title 
   * @param String author
   */  
  public void add ( String title, String author ){   
    libraryList.add ( new LibraryBook(title,author) );      
  }
  
  /** 
   * Takes the LibraryBook object and compares with the books inside the array list
   * If the books is the same, the method removes it from the array list
   * @param LibraryBook object
   * @return false if the book is not available, or true if the book is in the library
   */    
  public boolean remove ( LibraryBook book){ 
    boolean a;
    a = false;
    for ( LibraryBook libraryBook : libraryList ){
      if ( book.equals(libraryBook) ){
        libraryList.remove(libraryBook); 
        a = true;
      }
    }
    return a;
  }          
  
  /** 
   * Returns the first LibraryBook object having the title from the array list
   * @param String title 
   * @return LibraryBook object
   */  
  public LibraryBook findByTitle( String title ){      
    for ( LibraryBook libraryBook : libraryList ){
      if ( title.equals( libraryBook.getTitle() ) ){
        return libraryBook;  
      }
    }
    return null;
  }  
}  

