import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * This class creates the sky.
 * 
 * @Chris Samp 
 * @1.0
 */
public class Sky
{
    /** the width of the sky */
    /** the height of the sky */
    private int xLength;
    private int yWidth;
    
    /**
     * Constructor for objects of class Sky
     * @param xSky  the width of the sky
     * @param ySky  the height of the sky
     */
    public Sky(int xSky, int ySky)
    {
        xLength = xSky;
        yWidth = ySky;
    
    }
    /**
     * An example of a method - Creates the sky.
     *
     * @param    g2    The window that the sky is drawn in.
     */
    public void draw(Graphics2D g2)
    {
        Rectangle blueSky = new Rectangle(0,0,xLength,yWidth);
        
        
        
        g2.setPaint(new Color(0,0,255));
        g2.fill(blueSky);
       
        
    }
}