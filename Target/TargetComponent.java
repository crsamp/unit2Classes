import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target target1 = new Target(100,100);
        
        int x = getWidth() - 100;
        int y = getHeight() - 100;
        
        target1.draw(g2);
        
    }
}