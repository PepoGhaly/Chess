import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Selection extends MouseAdapter implements MouseListener {
    static boolean  computer_play= false;
    static JFrame selection = new JFrame("Selection");
    Image background=Toolkit.getDefaultToolkit().getImage("src\\Backgrounds\\Main menu1.png");
    ImageIcon twoPlayers = new ImageIcon(getClass().getResource("Buttons/Two Players.png"));
    JLabel twoPlayers_l = new JLabel(twoPlayers);
    ImageIcon onePlayer = new ImageIcon(getClass().getResource("Buttons/One Player.png"));
    JLabel onePlayer_l = new JLabel(onePlayer);
    ImageIcon back = new ImageIcon(getClass().getResource("Buttons/Back.png"));
    JLabel back_l = new JLabel(back);

    public Selection() {

        selection.setResizable(true);
        selection.setSize(1280,720);
        selection.setVisible(false);
        selection.setLocation(selection.getSize().width/4,selection.getSize().height/4);
        selection.setContentPane(new JLabel(new ImageIcon(background)));
        selection.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        onePlayer_l.setBounds(450 ,200,402,94);
        selection.add(onePlayer_l);
        onePlayer_l.addMouseListener(this);
        twoPlayers_l.setBounds(450,350,402,94);
        selection.add(twoPlayers_l);
        twoPlayers_l.addMouseListener(this);
        back_l.setBounds(450,550,402,94);
        selection.add(back_l);
        back_l.addMouseListener(this);

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
       if(mouseEvent.getSource() == onePlayer_l) {
           computer_play = true;
           selection.setVisible(false);
           Input input=new Input();
           Input.oneInput.setVisible(true);
       }
       else if (mouseEvent.getSource() == twoPlayers_l) {
           computer_play = false;
           selection.setVisible(false);
           Inputs inputs=new Inputs();
           Inputs.twoInputs.setVisible(true);
       }
       else if (mouseEvent.getSource() == back_l) {
           selection.setVisible(false);
           Loop.Menu.setVisible(true);
       }
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==onePlayer_l){
            onePlayer=new ImageIcon(getClass().getResource("\\Buttons\\One Player_sel.png"));
            onePlayer_l.setIcon(onePlayer);
        }
        else if (e.getSource()==twoPlayers_l){
            twoPlayers=new ImageIcon(getClass().getResource("\\Buttons\\Two Players_sel.png"));
            twoPlayers_l.setIcon(twoPlayers);
        }
        else if (e.getSource()== back_l){
            back=new ImageIcon(getClass().getResource("\\Buttons\\Back_sel.png"));
            back_l.setIcon(back);
        }
            }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==onePlayer_l){
            onePlayer=new ImageIcon(getClass().getResource("Buttons/One Player.png"));
            onePlayer_l.setIcon(onePlayer);
        }
        else if (e.getSource()==twoPlayers_l){
            twoPlayers=new ImageIcon(getClass().getResource("Buttons/Two Players.png"));
            twoPlayers_l.setIcon(twoPlayers);
        }
        else if (e.getSource()== back_l){
            back=new ImageIcon(getClass().getResource("Buttons/Back.png"));
            back_l.setIcon(back);
        }
    }
}
