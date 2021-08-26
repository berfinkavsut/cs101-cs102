/**
 * This programme creates two cars with different efficiency values
 * After tanking up the car with a certain gas, it drives the cars for certain distances
 * And the reports the remaining gas levels of the cars
 * @author Berfin Kavþut
 * @version 07/12/2017
 */ 
public class TestCar
{
   public static void main( String[] args)
   {      
      // constants

      // variables
      Car car1;
      Car car2;

      // program code
      // Create a car that has 50 miles per gallons efficiency
      car1 = new Car ( 50 );
      // Create another car that has 40 miles per gallons efficiency
      car2 = new Car ( 40 );  
      
      // Demonstrate the efficiencies of each car
      System.out.println ( "The first car's efficiency is 50 MPG" );
      System.out.println ( "The second car's efficiency is 40 MPG" );

      // Add 30 gallons to the tank of the first car
      car1.addGas ( 30 );
      // Drive the car for 100 miles
      car1.drive ( 100 );      
      // Demonstrate the gas added and the miles driven by the car      
      System.out.println( "The first car is tanked up 30 gallons and driven for 100 miles." );
      // Demostrate the current gas level of the first car
      System.out.println( "The current gas level in the first car: " + car1.getGasLevel() );

      // Add 45 gallons to the tank of the first car
      car2.addGas ( 45 );
      // Drive the car for 130 miles
      car2.drive ( 130 );  
      // Demonstrate the gas added and the miles driven by the car    
      System.out.println( "The second car is tanked up 45 gallons and driven for 130 miles." );
      // Demonstrate the current gas level of the second car
      System.out.println( "The current gas level in the second car: " + car2.getGasLevel() );
   }
}