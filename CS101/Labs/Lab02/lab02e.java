import java.util.Scanner;

/**
 * Web Page For The Company
 * @author Berfin Kavþut
 * @version Oct 11, 2017
 */ 
public class lab02e
{
   public static void main( String[] args )
   {
     Scanner scan = new Scanner( System.in );
     
      // constants
     
      // variables
      String name;
      String age;
      String salary;
      String comments;
      String hairColor;
      
      // programme code
      //The users will enter their name, age, salary and comments and hair color
      name = scan.next();
      age = scan.next();
      salary = scan.next();
      scan.nextLine();   // To make it read the next line, we inform the java
      comments = scan.nextLine();
      hairColor = scan.next();

      // Convert it to html and use the variable which we took from the user
      System.out.println( "<!DOCTYPE html>");
      System.out.println( );  
      System.out.println( "<html>");
      System.out.println( );  
      System.out.println( "<head>" );
      System.out.println( "<title>"+ name + "'s Home Page</title>" );
      System.out.println( "</head>" );
      System.out.println( );  
      System.out.println( "<body>" );
      System.out.println( );  
      System.out.println( "<hr>" );
      System.out.println( "<h1>" + name + "</h1>" ); 
      System.out.println( "<p>Age: " + age + "</p>" );
      System.out.println( "<p>Salary: " + salary + "</p>" );
      System.out.println( "<p>Comments: " + comments + "</p>" );
      System.out.println( "<p>Hair Color: " + hairColor + "</p>" );
      System.out.println( "<hr>" ); 
      System.out.println( ); 
      System.out.println( "</body>" );
      System.out.println( );  
      System.out.println( "</html>");
      
  }
}
