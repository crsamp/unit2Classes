import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    public void draw (Graphics2D g2)
    {
        Ellipse2D.Double outsideRing = new Ellipse2D.Double(xLeft,yTop, 100,100);
        Ellipse2D.Double secondRing = new Ellipse2D.Double((xLeft+12.5),(yTop+12.5),75,75);
        Ellipse2D.Double thirdRing = new Ellipse2D.Double((xLeft+25),(yTop+25),50,50);
        Ellipse2D.Double innerRing = new Ellipse2D.Double((xLeft+37.5),(yTop+37.5),25,25);
        Rectangle backGround = new Rectangle(300,400);
        Rectangle backGround2 = new Rectangle(250,350);
        Rectangle backGround3 = new Rectangle(200,300);
        Rectangle backGround4 = new Rectangle(150,250);
        Rectangle backGround5 = new Rectangle(100,200);
        Rectangle backGround6 = new Rectangle(50,150);
        
        g2.setPaint(Color.RED);
        g2.fill(backGround);
        g2.setPaint(Color.BLACK);
        g2.fill(backGround2);
        g2.setPaint(Color.RED);
        g2.fill(backGround3);
        g2.setPaint(Color.BLACK);
        g2.fill(backGround4);
        g2.setPaint(Color.RED);
        g2.fill(backGround5);
        g2.setPaint(Color.BLACK);
        g2.fill(backGround6);
        
        g2.draw(outsideRing);
        g2.fill(outsideRing);
        g2.setPaint(Color.white);
        
        g2.draw(secondRing);
        g2.fill(secondRing);
        g2.setPaint(Color.BLACK);
        g2.draw(thirdRing);
        g2.fill(thirdRing);
        g2.setPaint(Color.white);
        g2.draw(innerRing);
        g2.fill(innerRing);
    }
}