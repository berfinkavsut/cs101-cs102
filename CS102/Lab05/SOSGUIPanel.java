import cs101.sosgame.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SOSGUIPanel extends JPanel {
  
  //properties
  String playerName1;
  String playerName2;
  SOSCanvas canvas;
  SOS sos;
  
  //my addition to properties
  JPanel info;
  JLabel score1;
  JLabel score2;
  JLabel player1;
  JLabel player2;  
  ButtonGroup group;
  JRadioButton buttonS; 
  JRadioButton buttonO;  
  JLabel S;
  JLabel O;
  
  // name taker part
  JPanel nameTaker;
  JTextField nameTaker1; 
  JTextField nameTaker2; 
  
  // button border
  JPanel buttonPanel; 
  
  // restart button 
  JButton restartButton;
  
  //constructor
  public SOSGUIPanel( SOS sos, String playerName1, String playerName2 ) {
    this.sos = sos;
    this.playerName1 = playerName1;
    this.playerName2 = playerName2;  
    
    // name taker constructor
    nameTaker = new JPanel ();   
    nameTaker1 = new JTextField (); 
    nameTaker2 = new JTextField (); 
    
    nameTaker1.setPreferredSize( new Dimension ( 100, 25 ) );
    nameTaker2.setPreferredSize( new Dimension ( 100, 25 ) ); 
    nameTaker1.addActionListener ( new TextListener () ); 
    nameTaker2.addActionListener ( new TextListener () ); 
    nameTaker.add( new JLabel( "Player 1: " ) );
    nameTaker.add( nameTaker1 ); 
    nameTaker.add( new JLabel( "Player 2: " ) );
    nameTaker.add( nameTaker2 ); 
    
    restartButton = new JButton ( "RESTART" );
    restartButton.addActionListener( new RestartListener () );
    
    this.setLayout ( new BorderLayout () );
    this.add ( restartButton, BorderLayout.WEST );
    this.add ( nameTaker, BorderLayout.NORTH );
    this.add ( createInfoPanel(), BorderLayout.SOUTH );     
    this.add ( canvas, BorderLayout.CENTER );
  }  
  
  //methods
  private JPanel createInfoPanel () {
    info = new JPanel(); 
    canvas = new SOSCanvas ( sos );
    canvas.addMouseListener ( new SOSListener () );
    buttonS = new JRadioButton( "S" );
    buttonO = new JRadioButton( "O" );
    buttonS.setSelected ( true );
    group = new ButtonGroup ();
    group.add ( buttonS );
    group.add ( buttonO ) ;   
    buttonPanel = new JPanel ();
    buttonPanel.setBackground( Color.YELLOW );
    buttonPanel.add ( buttonS );
    buttonPanel.add ( buttonO );
    
    player1 = new JLabel ( playerName1 + ": " );  
    player2 = new JLabel ( playerName2 + ": " ); 
    player1.setOpaque ( true ); 
    player2.setOpaque ( true );
    score1 = new JLabel ( "" );
    score2 = new JLabel ( "" );  
    info.setLayout( new FlowLayout() );
    info.add ( player1 );
    info.add ( score1 );
    info.add ( buttonPanel );
    info.add ( player2 ); 
    info.add ( score2 );
    return info;
  }
  
  public void restart () {    
    this.sos = new SOS ( sos.getDimension () );
   // score1.setText( "0" );
   // score2.setText( "0" );
    canvas.setSOS ( sos );
    
  }
  
  private class SOSListener extends MouseAdapter {    
    public void mouseClicked (  MouseEvent event ) {
      
      int y = ( event.getY() / ( canvas.PANEL_HEIGHT / sos.getDimension() ) ) + 1; 
      int x = ( event.getX() / ( canvas.PANEL_WIDTH / sos.getDimension() ) ) + 1;     
      
      if ( buttonS.isSelected() ) {
        sos.play ( 's', y, x );
      }
      else if ( buttonO.isSelected() ) {
        sos.play ( 'o', y, x );
      }   
      
      //REPAINT - VIEW'S JOB
      score1.setText( "" + sos.getPlayerScore1 () );
      score2.setText( "" + sos.getPlayerScore2 () );   
      
      Color lightBlue = new Color ( 51, 204, 255 ); 
      if ( sos.getTurn () == 1 ) {
        
        player1.setBackground ( lightBlue);
        player2.setBackground ( Color.WHITE );
      }
      else if ( sos.getTurn () == 2 ) {
        player1.setBackground ( Color.WHITE );
        player2.setBackground ( lightBlue);
      }      
      
      sos.printBoard();
      System.out.println ( event.getX() + " and " + event.getY() + sos.getTurn () );
      
      if ( sos.isGameOver () ) {
        int first;
        int second;
        first = sos.getPlayerScore1 ();
        second = sos.getPlayerScore2 ();        
        if ( first > second ) {
          JOptionPane.showMessageDialog ( null , "Game Over! The winner is " + player1.getText()  ); 
          restart();
        }
        else if ( first < second ){
          JOptionPane.showMessageDialog ( null , "Game Over! The winner is " + player2.getText()  );
          restart();
        }
        else if ( first == second ) {          
          JOptionPane.showMessageDialog( null, "No Winner!" );
          restart();
        }
      }
    }
  }
  
  private class TextListener implements ActionListener {
    public void actionPerformed( ActionEvent event ) {
      if ( event.getSource () == nameTaker1 )
        player1.setText ( nameTaker1.getText() );
      else if ( event.getSource () == nameTaker2 )
        player2.setText ( nameTaker2.getText() );
    }
  }
  private class RestartListener implements ActionListener {
    public void actionPerformed( ActionEvent event ) {
      restart();
    }    
  } 
}