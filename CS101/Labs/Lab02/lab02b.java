import java.awt.Graphics;
import java.applet.Applet;

/**
 * An Applet!
 */
public class lab02b extends Applet 
{
    
   public void paint( Graphics g)
   {
      g.drawString( "Hello...", 50, 50);
      g.drawRect( 25, 25, 100, 50);
   }
    
}
