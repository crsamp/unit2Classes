import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;
/**
 * This class creates a building by you inputing the xCordinate, the ycoordinate, how wide you want
 * the building, and how tall you want your building as parameters.
 * 
 * @Chris Samp  
 * @1.0
 */
public class Building
{
    /** the width of the building*/
    private int xWidth;
    /** the height of the building*/
    private int yHeight;
    /** the x Coordinate of the building*/
    private int xCoordinate;
    /** the y Coordinate of the building*/
    private int yCoordinate;
    
    /**
     * contructor for object of class Building.
     * @param xCord the x Coordinate of the building.
     * @param yCord the y Coordinate of the building.
     * @param xBuilding the width of the building.
     * @param yBuilding the height of the building.
     */
    public Building(int xCord, int yCord,int xBuilding, int yBuilding)
    {
        xWidth = xBuilding;
        yHeight = yBuilding;
        xCoordinate = xCord;
        yCoordinate = yCord;
        
    }
    /**
     * An example of a method - draws the building onto the window.
     *
     * @param   g2  this is the window that the building will be drawn in.
     * 
     */
    public void draw(Graphics2D g2)
    {
        Random lightsOn = new Random();
        Rectangle outsideBuilding = new Rectangle(xCoordinate,yCoordinate,xWidth,yHeight);
        Rectangle windowOne = new Rectangle(xCoordinate+20,yCoordinate+50,40,40);
        Rectangle windowTwo = new Rectangle(xCoordinate+95,yCoordinate+50,40,40);
        Rectangle windowThree = new Rectangle(xCoordinate+20,yCoordinate+110,40,40);
        Rectangle windowFour = new Rectangle(xCoordinate+95,yCoordinate+110,40,40);
        Rectangle windowFive = new Rectangle(xCoordinate+20,yCoordinate+170,40,40);
        Rectangle windowSix = new Rectangle(xCoordinate+95,yCoordinate+170,40,40);
        Rectangle windowSeven = new Rectangle(xCoordinate+20,yCoordinate+230,40,40);
        Rectangle windowEight = new Rectangle(xCoordinate+95,yCoordinate+230,40,40);
        Rectangle door = new Rectangle(xCoordinate+57,yCoordinate+320,40,80);
        Ellipse2D.Double doorKnob = new Ellipse2D.Double(xCoordinate+65.0,yCoordinate+350,5.0,5.0);
        g2.setPaint(Color.BLACK);
        g2.fill(outsideBuilding);
        g2.setPaint(Color.YELLOW);
        if (lightsOn.nextInt(2)== 1){
            g2.setPaint(Color.gray);
        }
        
        g2.fill(windowOne);
        g2.setPaint(Color.YELLOW);
        if (lightsOn.nextInt(2)== 1){
            g2.setPaint(Color.gray);
        }
        
        g2.fill(windowTwo);
        g2.setPaint(Color.YELLOW);
        if (lightsOn.nextInt(2)== 1){
            g2.setPaint(Color.gray);
        }
        
        g2.fill(windowThree);
        g2.setPaint(Color.YELLOW);
        if (lightsOn.nextInt(2)== 1){
            g2.setPaint(Color.gray);
        }
        
        g2.fill(windowFour);
        g2.setPaint(Color.YELLOW);
        if (lightsOn.nextInt(2)== 1){
            g2.setPaint(Color.gray);
        }
        
        g2.fill(windowFive);
        g2.setPaint(Color.YELLOW);
        if (lightsOn.nextInt(2)== 1){
            g2.setPaint(Color.gray);
        }
        g2.fill(windowSix);
        if (lightsOn.nextInt(2)== 1){
            g2.setPaint(Color.gray);
        }
        g2.fill(windowSeven);
        if (lightsOn.nextInt(2)== 1){
            g2.setPaint(Color.gray);
        }
        g2.fill(windowEight);
       
        g2.setPaint(Color.red);
        g2.fill(door);
        g2.setPaint(Color.BLACK);
        g2.fill(doorKnob);
    }
}