/**
 * Identifies a book and then makes it loaned or not 
 * @author Berfin Kavþut
 * @version 29/11/2017
 */ 
public class LibraryBook
{
  // properties
  private String title;
  private String author;
  private String  dueDate;
  private int timesLoaned;
  
  // constructor
  public LibraryBook ( String title, String author ){
    this.title = title;
    this.author = author;
    dueDate = "";
    timesLoaned = 0;      
  }    
  
  // methods  
  
  /**
   * Takes the due date when the book is loaned
   * Increments the times of loan by 1
   * @param the due date of the book
   */
  public void loan ( String newDueDate ){
    if ( dueDate.equals ("")){
      dueDate = newDueDate;
      timesLoaned ++;    
    }
  }
  
  /**
   * Resets the due date
   * Increments the times of loan by 1
   */  
  public void resetDueDate (){
    dueDate = "";
  }
  
  /**
   * Shows whether the book is loaned or not
   * @return true or false
   */  
  public boolean onLoan (){
    if ( dueDate.equals("")){
      return false;
    }
    else{ 
      return true;
    }   
  }
  
  /**
   * Gets the title of the book
   * @return the title
   */  
  public String getTitle (){
    return title;
  }
  
  /**
   * Gets the author of the book
   * @return the title
   */  
  public String getAuthor (){
    return author;
  }
  
  /**
   * Gets the due date of the book
   * @return the due date
   */  
  public String getDueDate (){
    return dueDate;
  }
  
  /**
   * Gets the times ofloan
   * @return the timesofloan
   */  
  public int getTimesLoaned (){
    return timesLoaned;
  }   
  
  /**
   * Shows the results of the methods in a sentence 
   * @return the results
   */  
  public String toString () {      
    return "" + author + ", " + title + ", " + timesLoaned;
  }   
}


