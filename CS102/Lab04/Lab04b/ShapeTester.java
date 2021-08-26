import java.util.Scanner;
/**
 * @author __Berfin Kavþut___
 * @version _14/03/2018__
 */ 
public class ShapeTester
{
  public static void main ( String[] args ){
    
    Scanner scan = new Scanner ( System.in ); 
    
    // constants
    
    // variables
    ShapeContainer shapeList;
    Shape rectangle;
    Shape circle;
    int option;
    int x;
    int y;
    int select;
    int radius;
    int width;
    int height;
    
    // programme code
    
    shapeList = new ShapeContainer();
    
    System.out.println( "Welcome to Shape Container!" 
                         + "\n" + "You can add your circles and rectangles here."
                         + "\n" + "1: Circle"+ "\n" + "2: Rectangle" + "\n" + "3: Exit" );
    
    option = scan.nextInt();
    while ( option != 3 ) {
      if ( option == 1 ) {
        // CREATE
        System.out.println( "What is the radius?: " );
        radius = scan.nextInt();
        circle = new Circle ( radius );
        shapeList.add( circle );
        
        // LOCATION
        System.out.println( "Enter Locations: " );
        System.out.println( "   x: " );
        x = scan.nextInt();
        System.out.println( "   y: " );
        y = scan.nextInt();
        circle.setLocation(  x, y );
        
        // SELECT
        System.out.println( "Select? " + "\n" + "1: yes" +  "\n" + "2: no" );
        select = scan.nextInt();        
        if ( select == 1 ) 
          (( Circle )( circle )).setSelected ( true );
        else if ( select == 2 ) 
           (( Circle )( circle )).setSelected ( false );     
        
      }      
      if ( option == 2 ) {
        // CREATE
        System.out.println( "What is the width?: " );
        width = scan.nextInt();
        System.out.println( "What is the height?: " );
        height = scan.nextInt(); 
        ectangle = new Rectangle ( width, height );
        shapeList.add( rectangle );
        
        // LOCATION
        System.out.println( "Enter Locations: " );
        System.out.println( "   x: " );
        x = scan.nextInt();
        System.out.println( "   y: " );
        y = scan.nextInt();
        rectangle.setLocation(  x, y );
        
        // SELECT
        System.out.println( "Select? " + "\n" + "1: yes" + "\n2: no" );
        select = scan.nextInt();        
        if ( select == 1 ) 
          ( (Rectangle)(rectangle) ).setSelected ( true );
        else if ( select == 2 ) 
          ( (Rectangle)(rectangle) ).setSelected ( false );
      }  
      
      System.out.println( "1: Circle"+ "\n" + "2: Rectangle" + "\n" + "3: Exit" );
      option = scan.nextInt();
    }
    System.out.println( shapeList.toString() );
    System.out.println( "The total area: " + shapeList.getArea() );    
  }
  
}
