import cs101.sosgame.*;

public class SOSMain {
   public static void main( String [] args ) {
      SOS test = new SOS( 5 );
      System.out.println( test.isGameOver() );
      System.out.println( test.getTurn() );
      test.play( 's', 2 ,3 );
      System.out.println( test.getTurn() );
      test.play( 's', 2 ,5 );
      System.out.println( test.getTurn() );
      test.play( 'o', 2 ,4 );
      test.printBoard();
      System.out.println( test.getPlayerScore1() );
      System.out.println( test.getPlayerScore2() );
      System.out.println( test.getDimension() ); 
      System.out.println( test.INVALID_ROWCOL );
      System.out.println( test.ROWCOL_NOT_EMPTY );
      System.out.println( test.INVALID_LETTER );
   }
}