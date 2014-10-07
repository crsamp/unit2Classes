import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Creates a sun given the coordinates and the x and y values.
 * 
 * @Chris Samp
 * @1.0
 */
public class Sun
{
    private int xLeft;
    private int yTop;
    private int xCoordinate;
    private int yCoordinate;
    public Sun(int xSun, int ySun, int xCord, int yCord)
    {
        xLeft = xSun;
        yTop = ySun;
        xCoordinate = xCord;
        yCoordinate = yCord;
    }
    public void draw (Graphics2D g2)
    {
        Ellipse2D.Double bigSun = new Ellipse2D.Double(xLeft,yTop,xCoordinate,yCoordinate);
        Ellipse2D.Double bigSun1 = new Ellipse2D.Double(xLeft,yTop,xCoordinate-10,yCoordinate-10);
        Ellipse2D.Double bigSun2 = new Ellipse2D.Double(xLeft,yTop,xCoordinate-20,yCoordinate-20);
        Ellipse2D.Double bigSun3 = new Ellipse2D.Double(xLeft,yTop,xCoordinate-30,yCoordinate-30);
        Ellipse2D.Double bigSun4 = new Ellipse2D.Double(xLeft,yTop,xCoordinate-40,yCoordinate-40);
        Ellipse2D.Double bigSun5 = new Ellipse2D.Double(xLeft,yTop,xCoordinate-50,yCoordinate-50);
        
        
    
        g2.setPaint(new Color(255,255,0));
        g2.fill(bigSun);
        g2.setPaint(new Color(255,240,0));
        g2.fill(bigSun1);
        g2.setPaint(new Color(255,225,0));
        g2.fill(bigSun2);
        g2.setPaint(new Color(255,210,0));
        g2.fill(bigSun3);
        g2.setPaint(new Color(255,195,0));
        g2.fill(bigSun4);
        g2.setPaint(new Color(255,180,0));
        g2.fill(bigSun5);
    }
}