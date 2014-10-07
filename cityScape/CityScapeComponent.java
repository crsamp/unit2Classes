import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CityScapeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Sky blueSkies = new Sky(800,400);
        int xSky = getWidth();
        int ySky = getHeight();
        Sun sun = new Sun(10,10,200,200);
        int xMoon = getWidth();
        int yMoon = getHeight();
        Street street = new Street(0,600,800,300);
        int xStreet = getWidth();
        int yStreet = getHeight();
        Grass grass = new Grass(800,200);
        int xGrass = getWidth();
        int yGrass = getHeight();
        
        
        Building firstBuilding = new Building(200,150,150,400);
        Building SecondBuilding = new Building (600,150,150,400);
        
        
        street.draw(g2);
        grass.draw(g2);
        blueSkies.draw(g2);
        sun.draw(g2);
        firstBuilding.draw(g2);
        SecondBuilding.draw(g2);
    }
}