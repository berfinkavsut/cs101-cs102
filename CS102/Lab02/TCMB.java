import cs1.SimpleURLReader;
/**
 * @author __Berfin Kavþut___
 * @version __28/02/2018__
 */ 
public class TCMB
{
  public static void main( String[] args)
  {
    // constants
    
    // variables
    HTMLFilteredReader            tcmbKurlar;
    double                        buying;
    double                        selling;
    String                        text;
    String                        gbp;
    String                        chf; 
    double                        gbpBuying;
    double                        gbpSelling;  
    // program code
    
    tcmbKurlar= new HTMLFilteredReader ( "http://www.tcmb.gov.tr/kurlar/today.xml" );
    text = tcmbKurlar.getUnfilteredPageContents (); 
    
    gbp = "Kod=\"GBP\"";
    chf = "Kod=\"CHF\""; 
    
    gbpBuying = 0;
    gbpSelling = 0;
    
    System.out.println( "*************************************************************************" );
    System.out.println( tcmbKurlar.getPageContents() );
    System.out.println( "*************************************************************************" );
    
    for ( int i = text.indexOf( gbp ); i < text.indexOf( chf ); i++ ) {
      
      if ( text.substring( i, i + 13 ).equals( "<ForexBuying>" ) ) {        
        gbpBuying = Double.parseDouble( text.substring( i + 13, i + 19 ) );
      } 
      if ( text.substring( i, i + 14 ).equals( "<ForexSelling>" ) ) {
        gbpSelling = Double.parseDouble( text.substring( i + 14, i + 20 ) );
      }
    } 
    
    System.out.println( "Buying price for GBP: " + gbpBuying );
    System.out.println( "Selling price for GBP: " + gbpBuying );  
    System.out.println( "1 TL = " + ( 1 / gbpBuying ) + " GBP"  );
  } 
 }
  
