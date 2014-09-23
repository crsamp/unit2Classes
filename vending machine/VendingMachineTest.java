

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int numberOfTokens = 0;
    private int numberOfCans = 0;
    

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {   
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testFillUp()
    {
        VendingMachine machine = new VendingMachine(10,50);
        machine.fillUp(20);
        int numberOfSodas = machine.getCans();
        assertEquals(70,numberOfSodas,1e-6);
    }
    
    @Test
    public void testBuySoda()
    {
        VendingMachine machine = new VendingMachine(10,50);
        machine.buySoda();
        int numberOfSodas = machine.getCans();
        assertEquals(49,numberOfSodas,1e-6);
    }
}

