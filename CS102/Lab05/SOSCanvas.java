import cs101.sosgame.*;
import javax.swing.*;
import java.awt.*;

public class SOSCanvas extends JPanel {
  
  //properties
  SOS sos;
  int dimension;
  final int PANEL_WIDTH = 800;
  final int PANEL_HEIGHT = 800;
  double columnSpace;
  double rowSpace;
  
  // constructor
  public SOSCanvas ( SOS sos ){  
    this.dimension = sos.getDimension();
    this.sos = sos;
    this.setPreferredSize( new Dimension (  PANEL_WIDTH, PANEL_HEIGHT ) );
    columnSpace = ( double ) ( PANEL_WIDTH ) / dimension;
    rowSpace = ( double ) ( PANEL_HEIGHT ) / dimension;
  }
  
  // methods 
  
  // @override
  public void paintComponent ( Graphics g ){
    super.paintComponent( g );   
    
    // Draw the lines    
    g.setColor ( Color.BLACK );
    for ( int i = 0; i <= dimension; i++ ) {
      g.drawLine( ( int ) ( columnSpace * i ), 0, ( int ) ( columnSpace * i ), ( int )( PANEL_HEIGHT  ) );
      g.drawLine(  0, ( int ) ( rowSpace * i ), ( int ) ( PANEL_WIDTH  ) , ( int ) ( rowSpace * i ) );
    }   
    for ( int i = 0; i < sos.getDimension(); i++ ) {
      for ( int j = 0; j < sos.getDimension(); j++ ) {
        g.drawString( "" + sos.getCellContents( j, i ) ,  (int)( ( i * 800 / dimension ) + ( 800 / dimension / 2 ) ), (int)( ( j * 800 / dimension ) + ( 800 / dimension / 2 ) ) );
      }
    }
    repaint();
  }
  
  //setSOS
  public void setSOS ( SOS sos ) {
    this.sos = sos;   
  }
  
 
}