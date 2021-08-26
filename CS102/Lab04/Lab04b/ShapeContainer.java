import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author __Berfin Kavþut___
 * @version _28/03/2018__
 */ 

public class ShapeContainer 
{
  // properties
  ArrayList<Shape> shapeList;
  int index;
  
  // constructors
  public ShapeContainer ( ) {
    shapeList = new ArrayList<Shape> ();
    index = 0;
  }
  
  // methods
  
  /**
   * This method adds the given object to shapeList.
   * @param Shape object
   */ 
  public void add( Shape object ) {
    shapeList.add ( object );
  }
  
  /**
   * This method calculates the total area of the shapes 
   * inside the shapeList by Iterator
   * 
   * @return double totalArea
   */ 
  public double getArea() {
    
    double totalArea;
    totalArea = 0;
    
    Iterator <Shape> iter = shapeList.iterator();
    while ( iter.hasNext() ) {
      totalArea += iter.next().getArea();
    }
    return totalArea;
  }  
  
  /**
   * This method fins the first shape that contains the given point
   * The point is given by stating it x - coordinate and y - coordinate seperately
   * @param int x - coordinate, int y - coordinate
   * @return the first Shape object containing the point
   */ 
  public Shape find( int x, int y ) {
    for ( int i = 0; i < shapeList.size(); i++ ) {
      if ( ( ( Selectable ) shapeList.get( i )).contains( x, y ) ) {
        ( ( Selectable ) shapeList.get( i ) ).setSelected( true );
        return shapeList.get( i );
      }      
    }
    return null;
  }
  
  /**
   * This method removes the selected Shape objects in the shapeList 
   */ 
  public void remove() {
    for ( int i = 0; i < shapeList.size(); i++ ) {
      if ( ( ( Selectable ) shapeList.get( i ) ).getSelected() ) {
        shapeList.remove( i );
        i = i - 1;
      }
    }  
  }
  
  /**
   * toString method
   * @return String
   */ 
  public String toString() {
    String result;
    result = "";
    for ( int i = 0; i < shapeList.size(); i++ ) {
      result = result + shapeList.get( i ).toString() + "\n" ;
    }
    return result;
  }  
  
  /**
   * @Override
   * next() method
   * @return Shape object
   */ 
  public Shape next() {
    Shape result;
    result = shapeList.get( index );
    index++;
    return result;
  }
  
  /**
   * @Override
   * hasNext() method
   * @return boolean
   */ 
  public boolean hasNext() {
    return ( index < shapeList.size() );    
  }
  
    
  public int size() {
    return shapeList.size();
  }
 
  public int selectAllAt( int x, int y ){
    int count;
    count = 0;
    for ( int i = 0; i < size(); i++ ){
      if ( ( ( Circle ) shapeList.get(i) ).contains( x,y ) ) {
        ( ( Circle ) shapeList.get(i) ).setSelected( true );
        count++;        
      }     
    }    
    return count;
  }
  
  public void removeSelected() {
     for ( int i = 0; i < size(); i++ ) {
        if (( ( Circle ) shapeList.get(i) ).getSelected() )
           shapeList.remove(i);
     }  
  }
    
  public Shape contains( int x, int y ){
    for ( int i = 0; i < size(); i++ ) {
       if( ( ( Circle ) shapeList.get(i) ).contains( x,y ) ) 
            return shapeList.get( i );
    }
    return null;
  }
  
  
   public Iterator <Shape> iterator() {
     
     return shapeList.iterator();
   }
     
   
}
