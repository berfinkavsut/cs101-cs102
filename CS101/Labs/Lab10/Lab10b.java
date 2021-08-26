import java.util.Scanner;
/**
 * @author _Berfin Kavþut_
 * @version _19/12/2017_
 */ 
public class Lab10b
{
  public static void main ( String []args ){
    Scanner scan = new Scanner( System.in);      
    
    // constants
    
    // variables    
    String bigNumString;     
    BigNum [] numbers = new BigNum [10];
    BigNum max; // max number
    BigNum temp; // to copy the element of the array
    int mark; // to copy the element of the array
    int n;
    
    // programme code    
    mark = 0;    
    bigNumString = "";
    
    for ( int j = 0 ; j < numbers.length ; j++ ){   
      // Determine a number string randomly
      for ( int i = 0 ; i < BigNum.SIZE ; i++ ){
        bigNumString = bigNumString + ( int ) ( Math.random() * ( BigNum.BASE ) ) ;                  
      } 
      // Create the BigNum object with that number
      numbers [j] = new BigNum ( bigNumString ); 
      System.out.println( numbers[j] );    
      bigNumString = ""; // set the string number to empty      
      
    }
    
    System.out.println( "Is 5th number less than 8th number: " + numbers[4].isLessThan( numbers[7] ) );    
    
    System.out.println( " Enter n: " );     
    n = scan.nextInt();
    
   

    while ( n >= 0 && n <= 10){
      // Set max to the first BigNum object in the array
      max = numbers[0];
      mark = 0;
      for ( int i = 0 ; i < n ; i++ ){       
        if ( max.isLessThan( numbers[i] ) ){
          max = numbers[i];
          mark = i;          
        }
      }    
      
      // Change the maximum number with the number which is in the order of the entered number
      temp = numbers [mark];
      numbers [mark] = numbers [n-1];
      numbers [n-1] = temp;
      
      for ( int i = 0 ; i < numbers.length ; i++ ){ 
           System.out.println( numbers[i] );         
      }
     
      System.out.println( "The " + n + "th number " + numbers [mark] + " is changed by the " + ( mark + 1 )  + "th number " + numbers[n-1] ); 
      
      System.out.println( " Enter n: " ); 
      n = scan.nextInt();      
    }
    
  }
}