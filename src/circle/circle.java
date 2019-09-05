package circle;
 
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
 
public class circle extends JFrame 
{
    public circle()
    {
        setTitle("Tutorial");
        setSize(960,960);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawOval(480,480,200,200);
        g.fillOval(480, 480, 200, 200);
    }
 
    public static void main(String args[])
    {
        circle t = new circle();
        t.paint(null);
    }
}
