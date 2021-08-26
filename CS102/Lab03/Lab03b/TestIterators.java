import java.util.*;
/**
 * @author __Berfin Kavþut___
 * @version _14/03/2018__
 */ 
public class TestIterators 
{ 
  public static void main ( String [] args ) {
    
    // variables
    Iterator i, j;
    IntBag bag;
    
    // programme code 
    bag = new IntBag ();
    
    // Fill the integer bag with the numbers from 1 to 10
    for ( int k = 1; k <= 10; k++ ) {      
      bag.add ( k );
    }
    i = bag.iterator();
    
    while ( i.hasNext() ) 
    {
      System.out.println( i.next() );
      
      j = bag.iterator();
      
      while ( j.hasNext() )
      {
        System.out.println( "--" + j.next() );
      }
    }    
  }
}
