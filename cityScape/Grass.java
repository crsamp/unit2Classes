
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Grass
{
    private int xLength;
    private int yWidth;
    public Grass (int xGrass, int yGrass)
    {
        xLength = xGrass;
        yWidth = yGrass;
        
    }
    public void draw(Graphics2D g2)
    {
        Rectangle grassLawn = new Rectangle(0,400,xLength,yWidth);
        
        g2.setPaint(Color.GREEN);
        g2.fill(grassLawn);
    }
}