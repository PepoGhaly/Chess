import javax.swing.*;
import java.awt.*;

public class  Display extends JFrame {

        static JFrame Game;
        static Image img1 = Toolkit.getDefaultToolkit().getImage("src\\New Board.png");
        static Image img2 = Toolkit.getDefaultToolkit().getImage("src\\board2Theme.png");
        static Image img3 = Toolkit.getDefaultToolkit().getImage("src\\board3Theme.png");
        //JFrame display;
    public Display() {
            Game=new JFrame("Play");
            //canvas.setPreferredSize(new Dimension(600,600)));
            Game.setResizable(true);
            Game.setTitle("Chess");
            Game.setSize(1289,818);
            Game.setVisible(false);
            Game.setLocation(Game.getSize().width/2,Game.getSize().height/2);
            Game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            Game.setLayout(null);


            // pack();
            Game.validate();
        }

}
