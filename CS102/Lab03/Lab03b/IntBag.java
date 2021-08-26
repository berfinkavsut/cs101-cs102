import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Lab01 
 * @author _Berfin Kavþut_
 * @version __14.02.2018__
 */ 
public class IntBag
{
  
  // properties
  private int [] bag;
  private int valid;
  
  // constructors 
  public IntBag ( ){
    bag = new int [ 100 ];
    valid = 0;
  }
  
  public IntBag ( int capacity ){
    bag = new int [ capacity ];
    valid = 0;
  }
  
  // methods
  
  /**
   * Iterator Method
   * @param 
   * @return IntBagIterator object
   */ 
  public Iterator iterator ()
  {
    return new IntBagIterator ( this );
  }
  
  /**
   * add Method
   * @param int index, int value
   */ 
  public void add( int index, int value )
  {
    valid++;
    for ( int i = valid; i >= index - 1; i-- ) {
      bag[ i ] = bag [ i - 1 ];
    }     
    bag [ index - 1 ] = value;  
  }
  
  /**
   * add Method
   * @param int value
   */ 
  public void add( int value )
  {
    bag[ size() ] = value;
    valid++;
  }
  
  /**
   * remove Method
   * @param int index
   */   
  public void remove( int index )
  {   
    for ( int i = ( index - 1 ); i < valid - 1; i++ ) {
      bag[ i ] = bag [ i + 1 ];
    }
    bag [ valid -1 ] = 0;
    valid--;
  }
  
  /**
   * contains Method
   * @param int value
   */
  public boolean contains( int value )
  {
    for ( int a: bag ) {
      if ( a == value )
        return true;
    }
    return false;      
  }  
  
  /**
   * size Method
   * @return int valid
   */  
  public int size()
  {
    return valid;    
  }  
  
  /**
   * get Method
   * @param int index
   * @return the value at that index
   */  
  public int get( int index )
  {
    return bag[ index - 1 ];    
  }  
  
  /**
   * findAllMethod
   * @param int value
   * @return ArrayList<Integer> holding the location
   */   
  public ArrayList<Integer> findAll( int value )
  {
    ArrayList <Integer> find;
    find = new ArrayList <Integer> ();
    for ( int i = 0; i < size(); i++ ) {
      if ( get( i ) == value )
        find.add( i + 1 );
    }
    return find;
  } 
  
  /**
   * toString Method
   * @return allLetters.
   */ 
  public String toString()
  {
    return " ....... ";    
  } 
  
  // This class will be used for the Iterator method
  private class IntBagIterator implements Iterator
  {
    // properties
    IntBag aBag;
    int index;
    
    // constructor 
    public IntBagIterator ( IntBag bag ) {
      aBag = bag;
      // It will start from the end and iterate in the opposite direction
      index = valid;
    }
    
    // methods    
    /**
     * @Override 
     * nextTo()
     * This method gets the previous object from the IntBag object
     * @return the Integer object of int[] bag
     */
    public Object next() {  
      int result;
      result = aBag.get ( index );
      index--; // decrement by 1
      return result;
    }
    
    /**
     * hasNext()
     * @return true if the next object exists, else false
     */
    public boolean hasNext() {
      return ( index > 0 );
    }    
  }
}
