import  java.util.ArrayList;
/**
 * @author _Berfin Kavþut_
 * @version _19/12/2017_
 */ 
public class BigNum
{
  // properties
  public static final int SIZE = 4;
  public static final int BASE = 10;
  private int[] number;
  
  // constructor
  
  /** Constructor: sets the number to zero
    * 
    */
  public BigNum(){
    number = new int [ SIZE ];     
  }   
  
  /** Constructor: sets the values according to the parameter string
    * 
    * @param String no
    */
  public BigNum( String no ){ 
    
    number = new int [ SIZE ]; 
    
    // Take the characters of the number and add them to the number array
    for ( int j = 0; j < no.length(); j++){
      number[j] = no.charAt( no.length()-1 - j) - '0';
    }      
  }   
  
  /** Copy Constructor: initialize the number 
    * according to the  parameter obejct's number
    * 
    * @param other the other BigNum object
    */
  public BigNum( BigNum other){ 
    number = new int [ SIZE ]; 
    for ( int i = 0 ; i < SIZE ; i++){      
      this.number[i] = other.number[i];
    }
  }     
  
  // methods   
  
  /** 
   * Return the number in a String
   * @return the number in String
   */  
  public String toString(){   
    String result;
    result = "";
    for ( int a : number ){
      result = a + result;
    }
    return result;
  }
  
  /** 
   * Checks whether the number is equal to the other number
   * @param BigNum object other 
   * @return true if numbers are equal, false if not
   */  
  public boolean equals( BigNum other ){
    
    // Check whether every element of the number is equal to the other number's element 
    for ( int i = 0 ; i < SIZE ; i++){
      if ( other.number[i] != this.number[i] ){
        return false;
      }
    }
    return true;
  }
  
  /** 
   * Checks whether the numbers is zero or not
   * @return true if zero, false if not
   */  
  public boolean izZero(){ 
    
    // Check whether every element of the number is zero
    for ( int a : number ){
      if ( a != 0 ){
        return false;
      }
    }
    return true;     
  }
  
  /** 
   * Shifts the number to left orto right 
   * According to the entered booelan 
   * @param boolean left
   */
  public void shift( boolean left ){
    
    if ( left ){
      for ( int i = SIZE - 1 ; i > 0 ; i-- ){
        number [i] = number [i-1];
      }
      number [0] = 0;
    }     
    else{
      for ( int i = 0 ; i < SIZE - 1 ; i++ ){  
        number [i] = number [i+1];
      }
      number [SIZE-1] = 0;
    }      
  } 
  
  /** 
   * Add the other number to the number by changing the number
   * If the number overflows, returns 1 
   * If not, returns 0
   * @param BigNum object other
   * @return 1 if the number overflows, 0 if not
   */
  public int add( BigNum other ){       
    
    int nextDigit ;     
    int sum;     
    sum = 0;
    nextDigit  = 0;
    
    for ( int i = 0 ; i < SIZE ; i++ ){
      
      // Calculate the sum while doing the addition step for each digit
      sum = number [i] + other.number[i] + nextDigit;
      
      // If the sum is less than the base
      // Set the digit to sum
      // The next digit for the next addition step is 0      
      if ( sum < BASE ){
        this.number [i] = sum;
        nextDigit = 0;
      }
      
      // If the sum is equal to the base
      // Keep the remaining part for the next addition step 
      // by setting the next digit to 1
      // Set the digit to sum
      if ( sum >= BASE ){
        nextDigit = 1;
        sum = sum % BASE;
        this.number[i] = sum;       
      }  
      // Set the sum to 0 again
      sum = 0;
    }        
    return nextDigit ;
  }
  
    /** 
     * Checks whether the number is less than the other number
     * @param BigNum object other
     * @return true if it is less, false if not
     */
  public boolean isLessThan( BigNum other ){
   
    for ( int i = SIZE - 1 ; i >= 0 ; i-- ){
      if ( this.number[i] > other.number[i] ){
        return false;        
      }
      else if (this.number[i] < other.number[i] ){
        return true;
      }
    }  
    return false;
  }
}
  

  
