/**
 * @author __Berfin Kavþut___
 * @version _14/03/2018__
 */ 
public class Square extends Rectangle implements Selectable
{
  // properties
  
  // constructors
  public Square ( int side ) {
    super( side, side );
  }  
  
  // methods  
  /**
   * toString method
   * @return String
   */ 
  public String toString() {
    return "Shape: Square / side: " + width + " / area: " + getArea() + "\n" +
      "Selected: " + getSelected() + " / Location: x: " + getX() + "   y: " + getY();
  }
}
