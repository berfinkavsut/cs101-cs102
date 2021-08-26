import cs101.sosgame.*;
import javax.swing.*;
import java.awt.*;

public class SOSTest {
  public static void main( String [] args ) {    
    
    JFrame frame = new JFrame ();
    SOS sosGame = new SOS( 5 );
    SOSGUIPanel panelTest = new SOSGUIPanel( sosGame, "Berfin", "Meltem" );  
    frame.setTitle( "SOS GAME" ); 
    frame.setSize( new Dimension ( 1000, 1000 ) );
    frame.add ( panelTest );           
    frame.setVisible ( true );    
  }
}