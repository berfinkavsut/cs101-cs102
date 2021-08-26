import javax.swing.*;
/**
 * @author __Berfin Kavþut___
 * @version _28/03/2018__
 */ 

public class Lab04b
{  
  public static void main( String [] args ){
   JFrame frame = new JFrame ();
   int FRAME_WIDTH = 500;
   int FRAME_HEIGHT = 500;
   BalloonsGamePanel  gamePanel = new  BalloonsGamePanel ();
   
   gamePanel.initGame();
   
   frame.setSize( FRAME_WIDTH, FRAME_HEIGHT ); 
  // JLabel deneme = new JLabel("DENEME");
   frame.add(gamePanel);
   frame.setVisible(true);
   frame.setTitle( "Balloon Game" );
   frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );  
  
  }
}
