import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * A class that creates a cloud based on the coordinates given and the height and width of each circle of the cloud.
 * 
 * @Chris Samp
 * @1.0
 */
public class Cloud
{
    /** the x coordinate of the cloud from the upper left point */
    private int xCord;
    /** the y coordinate of the cloud from the upper left point */
    private int yCord;
    /** the width of each of the circles used to construct the cloud */
    private int xWidth;
    /** the height of each of the circles used to construct the cloud */
    private int yHeight;
    
    /**
     * constructor for objects of class Cloud
     * @param xCoordinant   the x Coordinant of the upper left point on the cloud.
     * @param yCoordinant   the y Coordinant of the upper left point on the cloud.
     * @param xCloud        the width of one of the two circles used to construct the cloud.
     * @param yCloud        the height of the cloud.
     */
    
    public Cloud (int xCoordinant, int yCoordinant, int xCloud, int yCloud)
    {
        xCord = xCoordinant;
        yCord = yCoordinant;
        xWidth = xCloud;
        yHeight = yCloud;
    }
    
    /**
     * An example of a method - Creates a cloud using two circles.
     * @param    g2     the window that the cloud is drawn on.
     */
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double cloudOne = new Ellipse2D.Double(xCord,yCord,xWidth,yHeight);
        Ellipse2D.Double cloudTwo = new Ellipse2D.Double(xCord+(xWidth/2),yCord,xWidth,yHeight);
        
        g2.setPaint(Color.WHITE);
        g2.fill(cloudOne);
        g2.fill(cloudTwo);
    }
}