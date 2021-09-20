package Random_Circle;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class MyPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        this.setBackground(Color.black);
        
        int w = this.getWidth();
        int h = this.getHeight();
        Random rnd = new Random();
        int n = 300;
        
        for (int i = 0; i < n; i++) {
            int x = rnd.nextInt(w);
            int y = rnd.nextInt(h);
            int s = 2 + rnd.nextInt(5);
            g.setColor(getRandomColor(rnd));
            g.fillOval(x, y, s, s);
        }
    }
    
    private Color getRandomColor(Random rnd) {
        return new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}
