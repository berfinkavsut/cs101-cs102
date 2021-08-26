/**
 * Creates a rational number by taking a suitable numerator and denominator
 * Makes certain operations with these rational numbers
 * @author Berfin Kavþut
 * @version 13/12/2017
 */ 

public class RationalNumber
{
  // properties
  private int numerator;
  private int denominator;
  
  // constructors
  public RationalNumber ( int n, int d ){      
    
    // Take the greatest common divider of the numerator and denominator
    int divider;  
    divider = ( gcd ( n, d ) ); 
    
    if ( ( n % 1 == 0 ) && ( d % 1 == 0 ) ){
      
      if ( d > 0 && n != 0 ){ 
        // Divide numerator and denominator to their gcd to simplify the fraction        
        numerator = n / divider;
        denominator = d / divider; 
        //Create the rational number
      }
      
      // If numerator is zero, create the rational number by giving the value 1 to its denominator       
      else if ( n == 0 ){
        numerator = 0;
        denominator = 1;         
      }
    }
  }
  
  // methods     
  /**
   * Takes two numbers and calculates their greatest common divisor
   * @param double first and second numbers
   * @return the gcd of the numbers
   */
  private static int gcd ( int n, int d ){
    int gcd;
    gcd = 1;
    for ( int i = 1; i <= Math.abs(n) || i <= Math.abs(d); i++ ){  
      if ( n % i == 0 && d % i == 0 ){
        gcd = i;
      }
    } 
    return gcd;
  }
  
  /**
   * Checks whether the rational number is integer or not
   * @return true if it is integer, false if not
   */    
  public boolean isInteger ( ){ 
    if ( numerator % denominator == 0 ){
      return true;
    }
    return false;
  }
  
  /**
   * Checks whether the rational number is zero
   * @return true if it is zero, false if not
   */ 
  public boolean isZero (){
    if ( numerator == 0 ){
      return true;
    }
    return false;
  }
  
  /**
   * Checks whether the rational number is less than the other rational number 
   * @param  RationalNumber object
   * @return true if rational number is less than the other rational number, false if not 
   */
  public boolean isLessThan( RationalNumber other ){
    if (  other.denominator * numerator < other.numerator * denominator ){
      return true;
    }
    return false;
  }
  
  /**
   * Checks whether the rational numbers are equal or not
   * @param  RationalNumber object 
   * @return true if they are equal, false if not
   */ 
  public boolean equals( RationalNumber other ){
    if ( numerator == other.numerator && denominator == other.numerator ){
      return true;
    }
    return false;
  }
  
  /**
   * Demonstrates the rational number as string
   * @return the rational number as string object
   */ 
  public String toString (){
    return numerator + "/" + denominator;
  }
  
  /**
   * Adds other rational number to the rational number
   * @param RationalNumber object
   * @return the result as a RationalNumber object
   */ 
  public RationalNumber add ( RationalNumber other ){
    int n;
    int d;
    n = (other.denominator * numerator) + (other.numerator * denominator);
    d = other.denominator * denominator;
    return new RationalNumber ( n , d );
  } 
  
  /**
   * Subtracts other rational number from the rational number
   * @param RationalNumber object
   * @return the result as a RationalNumber object
   */ 
  public RationalNumber subtract ( RationalNumber other) {
    int n;
    int d;
    n = (other.denominator * numerator) - (other.numerator * denominator);
    d = other.denominator * denominator;
    return new RationalNumber ( n , d );
  }
  
  /**
   * Multiplies other rational number with the rational number
   * @param RationalNumber object
   * @return the result as a RationalNumber object
   */ 
  public RationalNumber multiply ( RationalNumber other ) {
    int n;
    int d;
    n = other.numerator * numerator;
    d = other.denominator * denominator;
    return new RationalNumber ( n , d );
  }    
  
  /**
   * Divides the rational number by the other rational number
   * @param  RationalNumber object
   * @return the result as a RationalNumber object
   */ 
  public RationalNumber divide ( RationalNumber other ){
    int n;
    int d;    
    n =  other.denominator * numerator;
    d =  other.numerator * denominator;
    if ( other.numerator < 0 ){
      n = (-1) * other.denominator * numerator;
      d = (-1) * other.numerator * denominator;
    }
    else if ( other.numerator ==  0 ){
      return null;
    }
    return new RationalNumber ( n , d );
  }  
  
  /**
   * Calculates the reciprocal of the rational number 
   * And gives it back as a RationalNumber object
   * @return the reciprocal as a RationalNumber object
   */ 
  public RationalNumber reciprocal(){
    int n;
    int d;   
    n = denominator;
    d = numerator;   
    if ( numerator < 0 ){
      d = (-1) * numerator;
      n = (-1) * denominator;     
    }
    else if ( numerator ==  0 ){
      return null;
    }
    return new RationalNumber ( n , d );
  } 
}
