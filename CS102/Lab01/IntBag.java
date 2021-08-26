import java.util.Arrays;

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
   * add Method
   * @param int index, int value
   */ 
  public void add( int index, int value )
  {    
    for ( int i = valid; i >= index; i-- ) {
      bag[ i ] = bag [ i - 1 ];
    }     
    bag [ index - 1 ] = value;  
    valid++;
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
   * @return String holding the locations
   */   
  public String findAll( int value )
  {
    String find;
    find = "";
    for ( int i = 0; i < size(); i++ ) {
      if ( get( i + 1 ) == value )
        find = find + ( i + 1 ) + " ";
    }
    return find;
  } 
  
  /**
   * toString Method
   * @return allLetters.
   */ 
  public String toString()
  {
    String result;
    result = " [ ";       
    for ( int i = 1; i < size(); i++ ){
      result = result + get( i ) + ", ";
    }
    result = result + get( valid ) + " ]";
    return result;    
  }   
  /**
   * shift Method
   * @param shiftTimes
   */ 
  public void shift ( int shiftTimes ) {    
    if ( size() + shiftTimes <= bag.length ) {
      for ( int i = 0; i < shiftTimes; i++ ) {
        add( 1, 0 );
      } 
    }
  }
  
}
