import java.util.ArrayList;

/**
 * @author __Berfin Kavþut___
 * @version __28/02/2018__
 */ 
public class SuperHTMLFilteredReader extends HTMLFilteredReader 
{
  
  // properties
  
  private ArrayList <String> links;
  
  // constructors
  public SuperHTMLFilteredReader ( String url ) {
    super( url );
    links = new ArrayList <String>();
    }
  
  
  // methods
  
  /**
   * getLinks method
   * returns the list of the links 
   * @return String links
   */
  public ArrayList getLinks() {   
    String text;
    int mark;
    
    text = super.getUnfilteredPageContents ();
    mark = 0;
    // create ArrayList links
    for ( int i = 0; i < text.length() - 5; i++ ) {      
      if ( text.substring( i, i + 5 ).equals( "href=" ) ) {
        mark = i + 6;
        while( text.charAt( mark ) != '"' ) {
          mark++;
        }
        links.add( text.substring( i + 6, mark ) );
        i = mark; 
      }     
    }      
    return links;
  }
}

