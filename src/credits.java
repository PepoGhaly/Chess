import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class credits extends MouseAdapter implements MouseListener {
    JFrame frame =new JFrame("Credits");
    Image background=Toolkit.getDefaultToolkit().getImage("src\\Backgrounds\\cridets.png");
    ImageIcon back=new ImageIcon(getClass().getResource("Settings/Back Button.png"));
    JLabel Back_l=new JLabel(back);
    public  credits(){
        frame.setResizable(true);
        frame.setSize(1280,720);
        frame.setVisible(false);
        frame.setLocation(frame.getSize().width/4,frame.getSize().height/4);
        frame.setContentPane(new JLabel(new ImageIcon(background)));
        Back_l.setBounds(450,570,402,94);
        frame.add(Back_l);
        Back_l.addMouseListener(this);
    }
    @Override
    public void mousePressed(MouseEvent mouseEvent){
        if (mouseEvent.getSource()==Back_l){
            frame.setVisible(false);
            Loop.Menu.setVisible(true);
        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==Back_l){
            back=new ImageIcon(getClass().getResource("Settings\\Back Button_sel.png"));
            Back_l.setIcon(back);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==Back_l){
            back=new ImageIcon(getClass().getResource("Settings\\Back Button.png"));
            Back_l.setIcon(back);
        }
    }

}
