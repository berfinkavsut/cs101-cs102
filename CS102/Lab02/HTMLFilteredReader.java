/**
 * @author __Berfin Kavþut___
 * @version __28/02/2018__
 */ 
public class HTMLFilteredReader extends MySimpleURLReader
{
  
  // properties
  
  // constructors
  public HTMLFilteredReader ( String url ) {
    super( url );
  }
  
  // methods
  
  /**
   * getUnfilteredPageContents method
   * returns the original page including html codes
   * < between >: between is HTML code
   * @return String html
   */
  public String getUnfilteredPageContents() { 
    return super.getPageContents();
  }
  
   /**
   * getPercentage() method
   * returns the percentage of the decrease between the unlimited html text
   * and the limited html text 
   * @return double percentage of decrease
   */
    public double getPercentage() { 
    return  ( ( double )( getUnfilteredPageContents().length() -  getPageContents().length() ) / ( double )( getUnfilteredPageContents().length() ) ) * 100 ;
  }
    
  /** 
   * getPageContents method
   * modified version of MySimpleURLReader's method 
   * returns only the text without the html
   * @return String text
   */
  public String getPageContents() {   
    
    String text;
    String result;
    
    text = super.getPageContents();
    result = "";
    for ( int i = 0; i < text.length(); i++ ) {
      if ( text.charAt( i ) == '<' ) {
        while ( text.charAt( i ) != '>' ) {
          i++;
        }
      }
      else {
        result = result + text.charAt( i );
      }
    }
    return result;
  }
}
