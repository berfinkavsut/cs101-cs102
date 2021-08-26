/**
 * @author __Berfin Kavþut___
 * @version _14/03/2018__
 */ 
public interface Selectable
{      
  // methods  
  /**
   * This method returns whether the shape is
   * selected or not
   * @return true if selected, false if not selected
   */
  public boolean getSelected();
  
  /**
   * Mutator Method
   * This method determines if the shape is 
   * selected or not
   * @param boolean selected or not
   */ 
  public void setSelected( boolean a );
  
  /**
   * This method calculates if the given point
   * with x and y coordinate is inside the shape or not
   * @param int x, int y
   * @return true if the shape contains the point, else false
   */ 
  public boolean contains( int x, int y );  
}
