/**
 * @author __Berfin Kavþut___
 * @version _14/03/2018__
 */ 
public class Rectangle extends Shape implements Selectable
{
  // properties
  int width;
  int height;
  boolean selected;
  
  // constructors
  public Rectangle ( int width, int height ) {
    this.width = width;
    this.height = height;
  }
  
  // methods  
  /**
   * @Override
   * This method calculates and returns the area of the rectangle.
   * @return double area
   */ 
  public double getArea() {
    return ( double) ( width ) * ( double ) ( height );
  }
  
  /**
   * toString method
   * @return String
   */ 
  public String toString() {
    return "Shape: Rectangle / width: " + width + ", height = " + height + " / area: " + getArea() + "\n" +
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
  
  /**
   * @Override
   * This method checks whether the point given by the coordinates
   * is inside the rectangle or not
   * @param x - coordinate, y - coordinate
   * @return whether the point is inside the rectangle or not
   */ 
  public boolean contains( int x, int y ) {
    return( ( x >= ( this.x - ( width / 2 ) ) ) && ( x <= ( this.x + ( width / 2 ) ) ) && ( y <= ( this.y + ( height / 2 ) ) ) &&( y >= ( this.y - ( height / 2 ) ) ) );
  }
}
