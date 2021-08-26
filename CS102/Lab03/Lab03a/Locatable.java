/**
 * @author __Berfin Kavþut___
 * @version _14/03/2018__
 */ 
public interface Locatable 
{    
  // methods
  /**
   * Accessor method
   * @return x - coordinate
   */
  public int getX();
  
  /**
   * Accessor method
   * @return y - coordinate
   */
  public int getY();
  
  /**
   * This method sets the coordinates of the shape
   * @param x - coordinate, y - coordinate
   */
  public void setLocation( int x, int y );
}
