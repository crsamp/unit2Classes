

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String doorName = "Front";
    private String doorState = "Open";

    /**
     * Default constructor for objects of class Door
     */
    public Door(String name,String state)
    {
        this.doorName = name;
        this.doorState= state;
    }

    /**
     * This method changes the state of the door from open to closed.
     *
     * @pre        You need to assume that the door is open
     * @post       the door will be closed.
     * @return    returns a string "Closed"
     */
    public String closeDoor()
    {
        this.doorState = "Closed";
        return this.doorState;
    }

    /**
     * This method changes the state of the door from closed to open.
     *
     * @pre     you need to assume that the door is closed.
     * 
     * @post    the door will be open
     * 
     * @return  returns a string "Open"
     */
    public String openDoor()
    {
        this.doorState = "Open";
        return this.doorState;
    }


    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     assume door already has a name\
     * 
     * @return  name of the door
     */
    public String getName()
    {
        return this.doorName;
    }


    /**
     * This method changes the name of the door.
     *          
     * @post    The door will be called the name that you use as a parameter.
     * @param   the new name of the door.
     * @return  returns the name of the door.
     */
    public String setName(String newName)
    {
        this.doorName = newName;
        return this.doorName;
    }

}
