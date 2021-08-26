/**
 * Identifies a book and then makes it loaned or not 
 * @author Berfin Kavþut
 * @version 06/12/2017
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
  
  /** Copy Constructor: initialize title and author according to 
    * parameter object's title and author  
    * @param other the other LibraryBooks object
    */
  public LibraryBook( LibraryBook other ) 
  {
    title = other.title;      
    author = other.author;
  }   
  
  // methods  
  
  /** 
   * Clones the object with the input object
   * @return another LibraryBooks object
   */  
  public LibraryBook clone (){  
    return new LibraryBook ( title, author );       
  }   
  
  /** 
   * Compares the title of the object 
   * with the parameter object's title
   * @param other the other LibraryBooks object
   * @return whether the titles are the same or not
   */  
  public boolean hasSameTitle ( LibraryBook other ){
    if ( title.equals(other.title) )
      return true;
    return false;
  }  
  
  /** 
   * Compares the author of the object 
   * with the parameter object's author
   * @param other the other LibraryBooks object
   * @return whether the authors are the same or not
   */  
  public boolean hasSameAuthor ( LibraryBook other ){
    if ( author.equals(other.author) )
      return true;
    return false;
  }       
  
  /**
   * Takes the due date when the book is loaned
   * Increments the times of loan by 1
   * @param the new due date of the book
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
   * Gets the times of loan
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
    return "" + author + ", " + title;
  }  
  
  /**
   * Compares the properties of two objects
   * @param LibraryBook object
   * @return whether all the properties of the objects are identical or not 
   */  
  public boolean equals ( LibraryBook other ){      
    if ( author.equals(other.author) && title.equals(other.title))
      return true;
    return false;        
  }
}


