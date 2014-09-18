

/**
 * Write a description of class VendingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    public int numberOfTokens = 0;
    public int numberOfCans = 0;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int numberOfTokensInMachine, int numberOfCansInMachine) 
    {
        this.numberOfTokens = numberOfTokensInMachine;
        this.numberOfCans = numberOfCansInMachine;
    }

    /**
     * This method allows you to fill up the vending machine with the amount of cans that
     * you input.
     *
     * @post    The vending machine will be filled with cans.
     * @param    int cans      put in the amount of cans that you want to add to your vending
     * machine.
     */
    public void fillUp(int cans)
    {
        this.numberOfCans = this.numberOfCans+cans;
    }
   
    /**
     * Tells you how many tokens are in the machine.
     *
     * @post    it will tell you how many tokens are in the machine.
     * @return  returns an int of the number of tokens that are in the machine.
     */
    public int getTokens()
    {
        return this.numberOfTokens;
    }

    /**
     * Tells you how many cans are in the vending machine
     *
     * @post    It will tell you the number of cans that are in the vending machine.
     * @return  returns an integer of the number of cans in the vending machine.
     */
    public int getCans()
    {
        return this.numberOfCans;
    }

    /**
     * subtracs 1 can from the amount of cans that are in the vending machine and then
     * adds 1 token to the vending machine.
     *
     * @pre     im assuming that there is atleast 1 can of soda inside of the soda machine.
     * @post    it will subtract 1 from numberOfCans and add 1 to numberOfTokens.

     * @return  description of the return value
     */
    public void buySoda()
    {
        this.numberOfCans = this.numberOfCans-1;
        this.numberOfTokens = this.numberOfTokens+1;
    }

}
