import javax.swing.*;
import java.awt.*;

/**
 * Created by eranga on 4/6/18.
 */
public class PongGame extends JComponent{
    public static void main(String[] args) {
        JFrame window = new JFrame("Pong Game");
        window.add(new PongGame());
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }


    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0x067C42));
        g.fillRect(0,0,800, 600);

        g.setColor(Color.black);
        g.fillRect(0,500,150, 50);

        g.setColor(new Color(33, 24, 102));
        g.fillOval(400, 300, 30, 30);
    }
}
