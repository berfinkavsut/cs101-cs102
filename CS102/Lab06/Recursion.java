import java.util.*;

/**
 * Recursion
 * @author: _Berfin Kavþut_
 * @date: _18.04.2018_ 
 */ 
public class Recursion {
  public static void main ( String [] args ) {
    
    Scanner scan = new Scanner ( System.in );
    
    // variables
    String text;
    int decimal;    
    int n;
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Integer> a = new ArrayList<Integer>();
    
    // Programe Code
    // method 1
    System.out.println( "Enter your word to count 'e' characters: " );
    text = scan.next();
    System.out.println( "The number of e's: " + countE( text ) );
    
    //method 2
    System.out.println( "Enter your decimal number to convert to binary number: " );
    decimal = scan.nextInt();
    System.out.println( "The binary value: " + binary( decimal ) );
    
    // method 3    
    list.add("aba");
    list.add("abc");
    list.add("abc");
    list.add("ccc");
    list.add("cfee");
    list.add("zzz");
    System.out.println( "String list: " + list );
    System.out.println( "Is the list alphabetically ordered? :" + lexicographic( list ) );
    
    // method 4
    n = 3;
    System.out.println( even( n ) ); 
    
    // method 5
    a.add(5);
    a.add(4);   
    a.add(7);
    a.add(8);
    a.add(3);
    System.out.println( "The Array List: " + a );
    System.out.println( "The minimum value: " + getMin( a ) );
    System.out.println( "The sorted list:" + sort( a ) ); 
    
    System.out.println( inOrder(451) );
  }
  
  /*
   * This method counts 'e' chars in a String  
   * @param String str
   * @return int count
   */
  public static int countE( String str ) {
    if ( str.length() == 0 ) // base case
      return 0;
    else if ( str.charAt( 0 ) == 'e' )
      return 1 + countE( str.substring ( 1, str.length()) );
    else 
      return countE ( str.substring ( 1, str.length() ) );  
  }
  
  /*
   * This method converts the number of decimal value
   * to a binary number
   * @param int decimal
   * @return String binary
   */  
  public static String binary( int decimal ) {
    if ( decimal == 0 ) // base case 
      return "";
    else if ( decimal % 2 == 1 ) 
      return binary( decimal / 2 ) +  "1";     
    else
      return binary( decimal / 2 ) + "0";    
  }
  
  /*
   * This method returns whether the list of Strings is alphabetic or not
   * @param int decimal
   * @return boolean if alphabetic list, true; else, false
   */  
  public static boolean lexicographic( ArrayList<String> list ) {
    if ( list.size() == 1 ) // base case
      return true;
    if ( list.get(0).compareTo(list.get((1))) <= 0 ){
      list.remove( 0 );
      return lexicographic ( list );        
    }
    return false;
  }
  
  /*
   * This method returns number list 
   * with respect to the given int n
   * @param int n
   * @return ArrayList<Integer> even numbers, their digits have to be ordered
   */  
  public static ArrayList<Integer> even( int n ) {    
    ArrayList<Integer> result = new ArrayList<Integer>();
    for ( int i = ( int ) ( Math.pow( 10, ( n - 1 ) ) ); i < ( int )( Math.pow ( 10, n ) ); i++ ) {
      if ( inOrder(i) && ( i % 2 == 0 ) ) {
        result.add(i);
      }
    }
    return result;     
  }
  
  /*
   * This method returns whether the digits of number 
   * are in order or not
   * @param int x
   * @return true if inORder, if not false
   */  
  public static boolean inOrder( int x ) {   
    if ( x == 0 ) // base case
      return true;
    if ( ( ( x / 10 ) % 10 ) < ( x % 10 ) )
      return inOrder( x / 10 );
    else 
      return false;      
  } 
  
  /*
   * This method sorts this given integer list
   * @param ArrayList<Integer> list
   * @return ArrayList<Integer>
   */  
  public static ArrayList<Integer> sort( ArrayList<Integer> list ) {    
    int temp;
    int min;
    int mark;
    
    mark = 0;
    min = list.get(0);
    
    if ( list.size() == 1 ) {
      return list;
    }
    else {
      for ( int i = 0; i < list.size(); i++ ) {    
        if ( list.get( i ) <= min ){
           min = list.get( i );
           mark = i;
        }
      }
      temp = list.get( mark );
      list.remove( mark );
      System.out.println( list );
      sort(list).add( 0, temp );
      return list;
    }
    //return list;
  } 
  
   /*
   * This method finds the minimum value in the list
   * @param ArrayList<Integer> list
   * @return int minimum value of the list
   */  
  public static int getMin( ArrayList<Integer> list ) {    
     if ( list.size() == 1 )
       return list.get(0);
     else if ( list.get(0) <= getMin( new ArrayList<Integer>( list.subList ( 1, list.size() ) ) ) ) 
       return list.get(0);
     else
       return getMin (  new ArrayList<Integer> (list.subList( 1 , list.size() )) );
  }   
}
