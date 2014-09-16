

/**
 * The car class tyracks the fueld remaining in the car as it is driven based on the fuel
 * efficiency
 * 
 * @author Chris Samp
 * @version 12 september 2014
 */
public class Car
{
    /** the fuel efficiency of this car measured in miles per gallon */
    private double fuelEfficiency;
    
    /** the number of gallons of fuel left in this car's tank */
    
    private double fuelInTank;

    /**
     * Constructure for a car of the specified fuel efficiency.
     */
    public Car(double fuelEfficiency)
    {
        this.fuelEfficiency = fuelEfficiency;
        fuelInTank = 0;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank.
     *    that describes the operation of the method
     *
     * @pre        specified number of gallons doesn't exceed this car's tank's capacity
     *            
     * @param    gallons    number of gallons of fuel to add to this can't tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = gallons + this.fuelInTank;
    }

    /**
     * Updates the fuel in this can't tank based on the specified number of miles driven and this
     * car's fuel efficiency.
     *
     * @pre     the specified number of miles does not consume more than the fuel in this car's tank
     *          
     * @param   miles   number of miles this car has driven
     */
    public void drive(double miles)
    {
        this.fuelInTank= this.fuelInTank-(miles/this.fuelEfficiency);
    }


    /**
     * returns the number of gallons of fuel left in the car's tank
     * 
     * @return  the numebr of gallons of fuel left in the car's tank
     */
    public double getGasInTank()
    {
        // put your code here
        return this.fuelInTank;
    }

}
