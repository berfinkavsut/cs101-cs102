import cs1.SimpleURLReader;
/**
 * @author __Berfin Kavþut___
 * @version __28/02/2018__
 */ 
public class Test
{
  public static void main( String[] args)
  {
    // constants
    
    // variables
    SimpleURLReader           test1;
    MySimpleURLReader         test2;
    HTMLFilteredReader        test3;
    SuperHTMLFilteredReader   test4;
     
    // program code
    test1 = new SimpleURLReader ( "http://www.cs.bilkent.edu.tr/~david/housman.txt" );
    System.out.println( test1.getPageContents() );
    System.out.println( test1.getLineCount() );
    System.out.println( "*************************************************************************" );
    
    test2 = new MySimpleURLReader ( "http://www.cs.bilkent.edu.tr/~david/housman.txt" );
    System.out.println( test2.getPageContents() );
    System.out.println( test2.getLineCount() );
    System.out.println( test2.getURL() );
    System.out.println( test2.getName() );
    System.out.println( "*************************************************************************" );
    
    test3 = new HTMLFilteredReader ( "http://www.cs.bilkent.edu.tr/~david/housman.htm" );
    System.out.println( test3.getUnfilteredPageContents() );
    System.out.println( "*************************************************************************" );
    System.out.println( test3.getPageContents() ); // error //
    System.out.println( test3.getLineCount() );
    System.out.println( test3.getURL() );
    System.out.println( test3.getName() );
    System.out.println( test3.getPercentage() );
    System.out.println( "*************************************************************************" );
    
    test4 = new SuperHTMLFilteredReader ( "http://www.cs.bilkent.edu.tr/~david/index.html" );
    System.out.println( test4.getUnfilteredPageContents() );
    System.out.println( test4.getLineCount() );
    System.out.println( test4.getURL() );
    System.out.println( test4.getName() );
    System.out.println( test4.getLinks() );
    System.out.println( test4.getPercentage() );
  }
}
