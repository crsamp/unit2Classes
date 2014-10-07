import javax.swing.JFrame;

public class CityScapeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setTitle("CityScape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CityScapeComponent component = new CityScapeComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}