import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Inputs extends MouseAdapter implements MouseListener {
    static JFrame twoInputs = new JFrame("Two inputs");
    Image background =Toolkit.getDefaultToolkit().getImage("D:\\Project\\Chess\\src\\Backgrounds\\Player 2.png");
    ImageIcon ready1 = new ImageIcon(getClass().getResource("Buttons/Ready.png"));
    JLabel ready1_l = new JLabel(ready1);
    ImageIcon ready2 = new ImageIcon(getClass().getResource("Buttons/Ready.png"));
    JLabel ready2_l = new JLabel(ready2);
    ImageIcon play = new ImageIcon(getClass().getResource("Settings/Button.png"));
    JLabel play_l = new JLabel(play);
    ImageIcon back = new ImageIcon(getClass().getResource("Settings/Back Button.png"));
    JLabel back_l = new JLabel(back);
    static JTextField player_1 = new JTextField("Player 1");
    static JTextField player_2 = new JTextField("Player 2");
    boolean ready_1 = false;
    boolean ready_2 = false;

    public Inputs() {

        twoInputs.setResizable(true);
        twoInputs.setSize(1280,720);
        twoInputs.setVisible(false);
        twoInputs.setLocation(twoInputs.getSize().width/4,twoInputs.getSize().height/4);
        twoInputs.setContentPane(new JLabel(new ImageIcon(background)));
        twoInputs.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        twoInputs.addMouseListener(this);
        player_1.setBounds(430,185,250,35);
        player_1.setFont(new Font("Comic Sans",Font.BOLD,20));
        twoInputs.add(player_1);
        player_2.setBounds(430,330,250,35);
        player_2.setFont(new Font("Comic Sans",Font.BOLD,20));
        twoInputs.add(player_2);
        ready1_l.setBounds(812,180,176,45);
        twoInputs.add(ready1_l);
        ready1_l.addMouseListener(this);
        ready2_l.setBounds(809,327,176,45);
        twoInputs.add(ready2_l);
        ready2_l.addMouseListener(this);
        play_l.setBounds(570,585,177,50);
        twoInputs.add(play_l);
        play_l.addMouseListener(this);
        back_l.setBounds(55,586,180,55);
        twoInputs.add(back_l);
        back_l.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if(mouseEvent.getSource() == ready1_l) {
            ready_1 = true;
        }
        else if (mouseEvent.getSource() == ready2_l) {
             ready_2 = true;
        }
        else if (mouseEvent.getSource() == back_l) {
            twoInputs.setVisible(false);
            Selection s=new Selection();
            s.selection.setVisible(true);
        }
        else if (mouseEvent.getSource() == play_l && ready_2 && ready_1) {
            twoInputs.setVisible(false);
            Game g=new Game();
            Promotion P =new Promotion();
            Display.Game.setVisible(true);
            Game.Name1.setText(player_1.getText());
            Game.name2.setText(player_2.getText());
            Music.c.close();
        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==back_l){
            back=new ImageIcon(getClass().getResource("Settings\\Back Button_sel.png"));
            back_l.setIcon(back);
        }
        else if (e.getSource()==play_l){
            play=new ImageIcon(getClass().getResource("Settings/Button_sel.png"));
            play_l.setIcon(play);
        }
        else if (e.getSource()==ready1_l){
            ready1=new ImageIcon(getClass().getResource("Buttons/Ready_sel.png"));
            ready1_l.setIcon(ready1);
        }
        else if (e.getSource()==ready2_l){
            ready2=new ImageIcon(getClass().getResource("Buttons/Ready_sel.png"));
            ready2_l.setIcon(ready2);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==back_l){
            back=new ImageIcon(getClass().getResource("Settings\\Back Button.png"));
            back_l.setIcon(back);
        }
        else if (e.getSource()==play_l){
            play=new ImageIcon(getClass().getResource("Settings/Button.png"));
            play_l.setIcon(play);
        }
        else if (e.getSource()==ready1_l){
            ready1=new ImageIcon(getClass().getResource("Buttons/Ready.png"));
            ready1_l.setIcon(ready1);
        }
        else if (e.getSource()==ready2_l){
            ready2=new ImageIcon(getClass().getResource("Buttons/Ready.png"));
            ready2_l.setIcon(ready2);
        }
    }
}
