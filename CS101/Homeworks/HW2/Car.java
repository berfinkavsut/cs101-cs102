/**
 * This class creates cars with certain efficiency values
 * Its methods can change the gas level of the car, drive it for certain distances
 * And report the current gas level
 * @author Berfin Kavþut
 * @version 07/12/2017
 */ 
public class Car
{
   // properties
   private double efficiency; 
   private double fuelLevel;
   
   // constructors
   public Car ( double efficiency ){
      this.efficiency = efficiency; // measured as miles/gallons (MPG)
      fuelLevel = 0; // the initial gas level in the car
   }
   
   // methods   
   /**
    * This method increases the gas level by tanking up the car
    * @param the gas amount tanked in the car
    */ 
   public void addGas ( double gas ){
      fuelLevel = fuelLevel + gas;
   }
   
   /**
    * This method decreases the gas amount when the car is driven 
    * as much as the input miles value
    * @param miles driven by the car
    */ 
   public void drive ( double miles ){
      fuelLevel = fuelLevel - ( miles / efficiency );
   }
   
   /**
    * This method gives the current gas level
    * @return the gas level
    */ 
   public double getGasLevel (){
      return fuelLevel;
   }
}