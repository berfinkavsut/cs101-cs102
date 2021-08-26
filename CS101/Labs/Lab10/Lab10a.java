/**
 * @author _Berfin Kavþut_
 * @version _19/12/2017_
 */ 
public class Lab10a
{
   public static void main ( String []args ){
      
      // constants
      
      // variables
      BigNum b1;
      BigNum b2;
      BigNum b3;
      BigNum b4;
      int overflow;
            
      // programme code
      b1 = new BigNum ();
      b2 = new BigNum ( "110" );       
      b3 = new BigNum ( b2 );
      b4 = new BigNum ( "101" );
      
      System.out.println( "b1: " + b1 );
      System.out.println( "b2: " + b2 );
      System.out.println( "b3: " + b3 );
      System.out.println( "b4: " + b4 );
      
      System.out.println( "b1.equals(b2): " + b1.equals(b2) );      
      System.out.println( "b2.equals(b3): " + b2.equals(b3) );
      System.out.println( "b1.izZero(): " + b1.izZero() );     
      System.out.println( "Is b2 less than b4: " + b2.isLessThan(b4) ); 
      
      overflow = b2.add(b4);
      System.out.println( "b2 + b4 = " + b2 + " , overflow: " + overflow );
      
      b3.shift( true );
      System.out.println( "After multiplying b3 by its own base: " +  b3 ); 
      
      b4.shift( false );
      System.out.println( "After dividing b4 by its own base: " +  b4 );     
   }
   
}