import java.util.*;

/**
 * Lab01 
 * @author _Berfin Kavþut_
 * @version __14.02.2018__
 */ 
public class IntBagTest
{
  public static void main ( String [] args ) {
    
    Scanner scan = new Scanner ( System.in );
    
    // constants
    final int SENTINEL = -1;
    
    // variables
    IntBag test;
    int primeAdd;
    int primeCheck;
    int capacity;
    int menu;
    int value;
    int index;
    int testValue;
    String print;
    
    // programme code
    
    // Create a number list whose capacity is 100 
    test = new IntBag ( 100 );
    // Create a list full of prime numbers starting from 2
    
    test.add ( 2 ); // first prime number in our prime number collection 
    primeAdd = 3; 
    
    while ( test.size() < 100 ) {
      primeCheck = 0;
      // Check if the primeAdd is a prime number
      for ( int i = 1; i <= test.size(); i++ ) {
        
        if ( primeAdd % test.get(i) == 0 )
          primeCheck++;
      }
      // If primeAdd is a prime number, add it to the list
      if ( primeCheck == 0)
        test.add( primeAdd );
      //Increment primeAdd by 1
      primeAdd++;
    }   
    // Print the prime numbers list
    System.out.println( "Prime Numbers: " + test.toString() );
    
    
    testValue = 0;
    print = "";
    capacity = 0;
    value = 0;
    
    do { 
      System.out.println( " 1: Create a list with a specific capacity. " +
                         "\n" + " 2: Create your list with the numbers entered. " + 
                         "\n" + " 3: Print the list. " +
                         "\n" + " 4: Add a number to the list at a specified location. " +  
                         "\n" + " 5: Remove a number from the list at a specified location. " +
                         "\n" + " 6: Read a test value. " +
                         "\n" + " 7: Find the locations of the number entered at option 6 ( to print select option 8 ). " +
                         "\n" + " 8: Print the set of the locations. " +
                         "\n" + " 9: Shift the list. " +
                         "\n" + " 10: Quit. ");
      
      System.out.println( "Enter your option: " );      
      menu = scan.nextInt();  
      
      if ( menu == 1 ) {
        System.out.println( "Enter the capacity: " );
        capacity = scan.nextInt(); 
        test = new IntBag ( capacity );         
      }
      
      value = 0;
      if ( menu == 2 ) {
        System.out.println( "Add your numbers ( to stop, enter -1 ) " );
        
        while ( value != SENTINEL && test.size() < capacity ) {
          value = scan.nextInt();
          if ( value != SENTINEL )
            test.add( value );  
        }
      }      
      
      if ( menu == 3 )  {
        System.out.println( test.toString() );
      }
      
      if ( menu == 4 ) {       
        if ( test.size() <= capacity ) {
          System.out.println( "Enter your number to be added: ");
          value = scan.nextInt();
          System.out.println( "Enter your index: ");
          index = scan.nextInt();
          test.add( index, value );   
        }
      }
      
      if ( menu == 5 ) {
        System.out.println( "Enter your index: ");
        index = scan.nextInt();
        test.remove( index );
      }
      
      if ( menu == 6 ) {
        System.out.println( "Enter your number: ");
        testValue = scan.nextInt();         
      }
      
      if ( menu == 7 ) {
        print = test.findAll ( testValue );
      }
      
      if ( menu == 8 ) {    
        System.out.println( print );
      }   
      
      if ( menu == 9 ){
         System.out.println( "Enter your shift times: ");
         value = scan.nextInt();
         test.shift( value );
      }
      
    } while ( menu != 10);    
  }
}