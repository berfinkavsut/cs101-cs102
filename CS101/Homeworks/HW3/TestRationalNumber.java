/**
 * Tests the RationalNumber class by using its methods for some computations
 * @author Berfin Kavþut
 * @version 13/12/2017
 */ 
public class TestRationalNumber
{
  public static void main ( String[]args ){
    
    // constants
    
    // variables
    RationalNumber a;
    RationalNumber b;
    RationalNumber c;
    RationalNumber d;
    
    // programme code     
    a = new RationalNumber ( -15 , 6 );   
    b = new RationalNumber ( 17 , 6 ); 
    c = new RationalNumber ( 18 , 4 );
    d = new RationalNumber ( 0 , 23 );
    
    //Demosntrate the rational numbers
    System.out.println ( "a: " + a );
    System.out.println ( "b: " + b );
    System.out.println ( "c: " + c );
    System.out.println ( "d: " + d );
    
    //Ask questions about the rational numbers
    System.out.println ( "Is b integer?: " + b.isInteger() );
    System.out.println ( "Is d zero?: " + d.isZero() );  
    System.out.println ( "Is d less than b?: " + d.isLessThan(b) );    
    
    //Show the reciprocal of a      
    System.out.println ( "The reciprocal of a= " + a + " is " + a.reciprocal() );
    
    //Make operations with the numbers and demonstrate the equation of the operation
    System.out.println ( b + " + " + c + " = " + b.add(c));     
    System.out.println ( a + " - " + b + " = " + a.subtract(b) );
    System.out.println ( b + " * " + a + " = " + b.multiply(a) );
    System.out.println ( b + " / " + a + " = " + b.divide(a) );      
  }
}