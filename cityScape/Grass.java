
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates a rectangle that is green to look like grass.
 * 
 * @Chris Samp 
 * @1.0
 */
public class Grass
{
    /** length of the grass */
    private int xLength;
    /** height of the grass */
    private int yWidth;
    /** the x coordinant of the upper left point on the rectangle. */
    private int xCord;
    /** the y coordinant of the upper left point on the rectangle. */
    private int yCord;
    
    /**
     * constructor for objects of class Grass
     * @param xCoordinant   the x Coordinate of the Grass.
     * @param yCoordinant   the y Coordinate of the Grass.
     * @param xGrass        the width of the Grass.
     * @param yGrass        the height of the Grass.
     */
    public Grass (int xCoordinant, int yCoordinant,int xGrass, int yGrass)
    {
        xLength = xGrass;
        yWidth = yGrass;
        xCord = xCoordinant;
        yCord = yCoordinant;
    }
    /**
     * An example of a method - Draws grass onto the window.
     *
     * @param   g2  this is the window that the Grass will be drawn in.
     * 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle grassLawn = new Rectangle(xCord,yCord,xLength,yWidth);
        
        g2.setPaint(Color.GREEN);
        g2.fill(grassLawn);
    }
}