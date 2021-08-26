import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

/**
 * @author __Berfin Kavþut___
 * @version _28/03/2018__
 */ 

public class Balloon extends Circle implements Drawable {
  
  public Balloon ( int x, int y )
  {
    super(25);
    super.setLocation( x, y );
  }
  
  public void draw( Graphics g )
  {
    g.drawOval( getX() - radius, getY() - radius, radius * 2, radius * 2);
  }  
  
  public void grow() {   
    int radius;
    radius = getRadius();
    radius++;
    setRadius( radius );
    if ( getRadius() > 100 ) {
      burst();  
    }    
  }
  public void burst() {
    setRadius (0);
    setSelected(true);
  }
}