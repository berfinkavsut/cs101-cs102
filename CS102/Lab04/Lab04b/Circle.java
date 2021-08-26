/**
 * @author __Berfin Kavþut___
 * @version _28/03/2018__
 */ 

public class Circle extends Shape implements Selectable
{
  // properties
  int radius;
  boolean selected;
  
  // constructors 
  public Circle ( int radius ) {
    this.radius = radius;
  }
  
  //methods
  
  //int getX()
  //int getY() 
  //setLocation( int x, int y ) 
  
  /**
   * @Override
   * This method calculates and returns the area of the circle.
   * @return double area
   */ 
  public double getArea() {
    return ( double ) ( radius ) * ( double ) ( radius ) * Math.PI;
  }   
  
  /**
   * toString method
   * @return String
   */ 
  public String toString() {
    return "Shape: Circle / radius: " + radius + " / area: " + getArea() + "\n" +
      "Selected: " + getSelected() + " / Location: x: " + getX() + "   y: " + getY();
  }
  
  /**
   * @Override
   * This method returns whether the shape is selected or not.
   * @return boolean selected
   */ 
  public boolean getSelected() {
    return selected;
  }
  
  /**
   * @Override
   * This method sets the boolean selected with the parameter
   * @param boolean a
   */ 
  public void setSelected( boolean a ) {
    selected = a;
  }
  
  public int getRadius( ) {
     return radius;
  }
  
  public void setRadius( int x ) {
     this.radius = x;
  }
  /**
   * @Override
   * This method check whether the point given by the coordinates
   * is inside the circle or not
   * @param x - coordinate, y - coordinate
   * @return whether the point is inside the circle or not
   */ 
  public boolean contains( int x, int y ) {
    return ( Math.pow ( ( x - this.x ), 2 ) + Math.pow ( ( y - this.y ), 2 ) <= Math.pow ( radius, 2 ) );
  }
}
