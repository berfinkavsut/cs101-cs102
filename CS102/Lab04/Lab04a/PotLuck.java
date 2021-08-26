import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/*
 * pot luck programme
 * 
 */
public class PotLuck{
  public static int count = 0;  
  
  public static void main ( String [] args ) {
    JFrame frame;
    JPanel panel;        
    JButton[] buttons;
    int FRAME_WIDTH = 1000;
    int FRAME_HEIGHT = 1000;
    int theChosenOne;   
    
    frame = new JFrame();
    frame.setTitle( "Pot Luck" );
    frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE ); 
    
    
    buttons = new JButton[25];   
    theChosenOne = (int) Math.random();
    buttons [ theChosenOne ] = new JButton( "?" );
    buttons [ theChosenOne ].addActionListener( new ActionListener () {
      public void actionPerformed( ActionEvent event ) {
        count++;
        System.out.println( "Click number:  " + count + "\n You got it :)" );
      }
    });    
    
    
    for ( int i = 0; i < 25; i++ ) {     
      if ( i != theChosenOne ) {
        buttons [i] = new JButton( "?" );
        buttons [i].addActionListener( new ActionListener () {
          public void actionPerformed( ActionEvent event ) {
            count++;
            System.out.println( "Click number: " + count);     
            // event.getSource().setVisible( false );      
          } 
        }); 
      }
    }
    panel = new JPanel();
    panel.setSize( 200, 200 );
    panel.setLayout ( new GridLayout( 3, 2 ) );
    
    
    for ( JButton a: buttons ){      
      panel.add( a );
    }
    frame.add( panel );   
        frame.setVisible( true );
  }   
  
  
}