/**
 * @author __Berfin Kavþut___
 * @version _14/03/2018__
 */ 
public abstract class Shape implements Locatable
{
  // properties
  int x;
  int y;
  
  // constructors
  
  // methods  
  /**
   * This method calculates area and returns it.
   * @return double area
   */ 
  public abstract double getArea();  
  
  /**
   * @Override
   * Accessor method
   * @return x coordinate
   */ 
  public int getX(){
    return x;
  }
  
  /**
   * @Override
   * Accessor method
   * @return  y coordinate
   */ 
  public int getY() {
    return y;
  }
  
  /**
   * @Override
   * Mutator Method
   * This method determines the coordinates of the shape
   * @param x-coordinate, y-coordinate
   */ 
  public void setLocation( int x, int y ) {
    this.x = x;
    this.y = y;
  }
}
