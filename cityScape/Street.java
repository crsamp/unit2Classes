import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * creates a street given the the x Coordinate and y coordinate of the upper left corner of the street
 * and the width and height of the street.
 * 
 * @Chris Samp 
 * @1.0
 */
public class Street
{
    /** the length of the street. */
    private int xLength;
    /** the width of the street. */
    private int yWidth;
    /** the x coordinate of the street. */
    private int xCord;
    /** the y coordinate of the street. */
    private int yCord;
    
    /**
     * Constructor for objects of class Street
     * @param xCoordinate   x Coordinate of the street
     * @param yCoordinate   y coordinate of the street
     * @param xStreet       Width of the street
     * @param yStreet       Height of the street
     */
    public Street(int xCoordinate, int yCoordinate, int xStreet, int yStreet)
    {
        xLength = xStreet;
        yWidth = yStreet;
        xCord = xCoordinate;
        yCord = yCoordinate;
    }
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @param    g2    This is the window that the street will be down in.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle mainStreet = new Rectangle(xCord,yCord,xLength,yWidth);
        Rectangle lineOne = new Rectangle(xCord,yCord+90,50,20);
        Rectangle lineTwo = new Rectangle(xCord+100,yCord+90,50,20);
        Rectangle lineThree = new Rectangle(xCord+200,yCord+90,50,20);
        Rectangle lineFour = new Rectangle(xCord+300,yCord+90,50,20);
        Rectangle lineFive = new Rectangle(xCord+400,yCord+90,50,20);
        Rectangle lineSix = new Rectangle(xCord+500,yCord+90,50,20);
        Rectangle lineSeven = new Rectangle(xCord+600,yCord+90,50,20);
        Rectangle lineEight = new Rectangle(xCord+700,yCord+90,50,20);
        Rectangle lineNine = new Rectangle(xCord+800,yCord+90,50,20);
        g2.setPaint(Color.BLACK);
        g2.fill(mainStreet);
        g2.setPaint(Color.YELLOW);
        g2.fill(lineOne);
        g2.fill(lineTwo);
        g2.fill(lineThree);
        g2.fill(lineFour);
        g2.fill(lineFive);
        g2.fill(lineSix);
        g2.fill(lineSeven);
        g2.fill(lineEight);
        g2.fill(lineNine);
    }
}