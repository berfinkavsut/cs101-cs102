import cs1.SimpleURLReader;
/**
 * @author __Berfin Kavþut___
 * @version __28/02/2018__
 */ 
public class MySimpleURLReader extends SimpleURLReader
{
  
  // properties
  private String url;
  // constructors
  public MySimpleURLReader ( String url ) {
    super( url );
    this.url = url; 
  }
  
  // methods
  
  /** 
   * getPageContents method
   * returns the text without String null
   * @return String text
   */
  public String getPageContents() {
    return super.getPageContents().substring( 4 );   
  }
  
  /** 
   * getURL method
   * returns the URL String
   * @return String url
   */
  public String getURL() {
    return url;   
  }            
  
  /** 
   * getName method
   * returns the part in the url
   * after the character '/'
   * @return String filename part of the url
   */
  public String getName() {
    String url;    
    url = getURL();
    return url.substring( url.lastIndexOf( '/' ) + 1 );
  }
}