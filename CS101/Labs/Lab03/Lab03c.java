import java.util.Scanner;
import java.nio.file.*;   
import java.io.*;

/**
 * Web Page For The Company
 * @author Berfin Kavþut
 * @version2 Oct 18, 2017
 */ 
public class Lab03c
{
  public static void main( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    
    // constants
    
    // variables
    String name;
    int age;
    double salary;
    String comments;
    String hairColor;
    
    // programme code
    //The users will enter their name, age, salary and comments and hair color
    //System.out.println( "Enter your name:" );
    name = scan.next();
    //System.out.println( "Enter your age:" );
    age = scan.nextInt();
    while ( age <= 0 )
    {
      System.out.println( "Enter a valid number!" );
      age = scan.nextInt();
    }
    
    //System.out.println( "Enter your salary:" );
    salary = scan.nextDouble();
    while ( salary <= 0 || salary >= 10000)
    {
      System.out.println( "Enter a salary between 0 and 10000." );
      salary = scan.nextDouble();
    }  
    
    scan.nextLine();   // To make it read the next line, we inform the java
    comments = scan.nextLine();
    hairColor = scan.nextLine();
    
    // The net salary is salary = (salary - 100) * 0.85 normally
    // Rather than have a constant 15% tax rate for all, the government decides to take only 5% from employees earning below $1000 gross, but to take 25% from those earning more than $5000 
    // Implement teh new rule for the salary for the certain ranges
    if ( salary < 1000 )
    {
      salary = ( salary - 100 ) * 0.95;
    }
    else if ( salary <= 5000 )
    { 
      salary = ( salary - 100 ) * 0.85; // The previous decision for the salary of the government
    } 
    else 
    {   
      salary = ( salary - 100 ) * 0.75;
    }
    
    // Convert it to html and use the variable which we took from the user
    System.out.println( "<!DOCTYPE html>");
    System.out.println( "<html>"); 
    System.out.println( "<head>" );
    System.out.println( "<title>"+ name + "'s Home Page</title>" );
    System.out.println( "</head>" );
    System.out.println( "<body>" ); 
    System.out.println( "<hr>" );
    if ( Files.exists( Paths.get( name + ".jpg" ) ) )      
    { 
      System.out.println( " <img src=\"" + name + ".jpg\"> ") ;
    }
    System.out.println( "<h1>" + name + "</h1>" ); 
    System.out.println( "<p>Age: " + age + "</p>" );
    System.out.println( "<p>Salary: " + salary + " [the tax rate is 15%]" + "</p>" );
    System.out.println( "<p>Comments: " + comments + "</p>" );
    System.out.println( "<p>Hair Color: " + hairColor + "</p>" );
    System.out.println( "<hr>" ); 
    System.out.println( "</body>" );
    System.out.println( "</html>");
  }
}
