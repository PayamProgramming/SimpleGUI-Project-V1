package Random_Circle;
import javax.swing.*;
import java.util.* ;
import java.awt.*;
public class Project038GPH {

    public static void main(String[] args) {

      JFrame app = new JFrame("Random Graphics");
        app.add(new MyPanel());
        app.setSize(500, 500);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }    
}
