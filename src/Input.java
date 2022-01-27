import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input extends MouseAdapter implements MouseListener {
    static JFrame oneInput = new JFrame("One input");
    Image background =Toolkit.getDefaultToolkit().getImage("D:\\Project\\Chess\\src\\Backgrounds\\Player 1.png");
    ImageIcon ready = new ImageIcon(getClass().getResource("Buttons/Ready.png"));
    JLabel ready_l = new JLabel(ready);
    ImageIcon play = new ImageIcon(getClass().getResource("Settings/Button.png"));
    JLabel play_l = new JLabel(play);
    ImageIcon back = new ImageIcon(getClass().getResource("Settings/Back Button.png"));
    JLabel back_l = new JLabel(back);
    JTextField player_1 = new JTextField("Player 1");
    boolean ready_1 = false;

    public Input() {

        oneInput.setResizable(true);
        oneInput.setSize(1280, 720);
        oneInput.setVisible(false);
        oneInput.setLocation(oneInput.getSize().width / 4, oneInput.getSize().height / 4);
        oneInput.setContentPane(new JLabel(new ImageIcon(background)));
        oneInput.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        player_1.setBounds(430, 185, 250, 35);
        player_1.setFont(new Font("Comic Sans", Font.BOLD, 20));
        oneInput.add(player_1);
        player_1.addMouseListener(this);
        ready_l.setBounds(812,180,176,45);
        oneInput.add(ready_l);
        ready_l.addMouseListener(this);
        play_l.setBounds(570,585,177,50);
        oneInput.add(play_l);
        play_l.addMouseListener(this);
        back_l.setBounds(55,586,180,55);
        oneInput.add(back_l);
        back_l.addMouseListener(this);

    }
    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if(mouseEvent.getSource() == ready_l) {
            ready_1 = true;
        }
        else if (mouseEvent.getSource() == back_l) {
            oneInput.setVisible(false);
            Selection s=new Selection();
            s.selection.setVisible(true);
        }
        else if (mouseEvent.getSource() == play_l  && ready_1) {
            oneInput.setVisible(false);
            Game g=new Game();
            Display.Game.setVisible(true);
            Game.Name1.setText(player_1.getText());
            Game.name2.setText("Computer");
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
        else if (e.getSource()==ready_l){
            ready=new ImageIcon(getClass().getResource("Buttons/Ready_sel.png"));
            ready_l.setIcon(ready);
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
        else if (e.getSource()==ready_l){
            ready=new ImageIcon(getClass().getResource("Buttons/Ready.png"));
            ready_l.setIcon(ready);
        }
    }
}
