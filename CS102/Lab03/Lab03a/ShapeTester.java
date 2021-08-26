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
    Shape shape; // polymorphism
    
    int option; // option for menu
    int select; // select option
    int x; // x - coordinate
    int y; // y - coordinate   
    int radius;
    int width;
    int height;
    
    // programme code
    
    shapeList = new ShapeContainer();
    
    // MENU 
    System.out.println( "Welcome to Shape Container!" 
                         + "\n" + "You can add your circles and rectangles here."
                         + "\n" + "1: Circle"+ "\n" + "2: Rectangle" + "\n" + "3: Print" + "\n" + "4: Toggle" 
                         + "\n" + "5: Remove the selected shapes" + "\n" + "6: Exit" );
    
    option = scan.nextInt();
    while ( option != 6 ) {
      
      // Add the circle with the taken information to the shape list
      if ( option == 1 ) {
        
        // CREATE
        System.out.println( "What is the radius?: " );
        radius = scan.nextInt();
        shape = new Circle ( radius );
        shapeList.add( shape );
        
        // LOCATE
        System.out.println( "Enter Locations: " );
        System.out.println( "   x: " );
        x = scan.nextInt();
        System.out.println( "   y: " );
        y = scan.nextInt();
        shape.setLocation(  x, y );      
      }      
      
      // Add the rectangle with the taken information to the shape list
      if ( option == 2 ) {
        
        // CREATE
        System.out.println( "What is the width?: " );
        width = scan.nextInt();
        System.out.println( "What is the height?: " );
        height = scan.nextInt(); 
        shape = new Rectangle ( width, height );
        shapeList.add( shape );
        
        // LOCATE
        System.out.println( "Enter Locations: " );
        System.out.println( "   x: " );
        x = scan.nextInt();
        System.out.println( "   y: " );
        y = scan.nextInt();
        shape.setLocation(  x, y );
      }     
      
      // Print the information about the shapes
      if ( option == 3 ) {
        System.out.println( shapeList.toString() );
        System.out.println( "The total area: " + shapeList.getArea() ); 
      }     
      
      // Find the first shape inside the list of shapes that you want with its coordinates and toggle it if you could find it
      if ( option == 4 ) {
        System.out.println( "Enter the locations to find your shape: ");
        System.out.println( "x: "); 
        x = scan.nextInt();
        System.out.println( "y: "); 
        y = scan.nextInt();
        // Find the point 
        System.out.println( shapeList.find ( x, y ) );
      }
      
      // Remove the selected ones from the shape list
      if ( option == 5 ) {
        shapeList.remove();      
        System.out.println( "The selected shapes are removed from the list." );
      }    
      
      // Present the menu again
      System.out.println( "1: Circle"+ "\n" + "2: Rectangle" + "\n" + "3: Print" + "\n" + "4: Toggle" 
                           + "\n" + "5: Remove" + "\n" + "6: Exit" );      
      // Take the option of the user
      option = scan.nextInt();
    }    
    
    // Print all the information so far about the shapes 
    System.out.println( shapeList.toString() );
    System.out.println( "The total area: " + shapeList.getArea() );
    
  }  
}
