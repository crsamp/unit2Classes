import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CityScapeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Sky blueSkies = new Sky(0,0,800,400);
        
        Sun sun = new Sun(10,10,200,200);
        
        Street street = new Street(0,600,800,300);
        
        Grass grass = new Grass(0,400,800,200);
        Cloud cloud1 = new Cloud(200,50,60,60);
        Cloud cloud2 = new Cloud(400,80,80,80);
        
        
        Building firstBuilding = new Building(200,150,150,400);
        Building SecondBuilding = new Building (600,50,175,450);
        
        
        street.draw(g2);
        grass.draw(g2);
        blueSkies.draw(g2);
        sun.draw(g2);
        cloud1.draw(g2);
        cloud2.draw(g2);
        firstBuilding.draw(g2);
        SecondBuilding.draw(g2);
    }
}