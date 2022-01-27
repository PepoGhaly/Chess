import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loop extends MouseAdapter implements MouseListener {

    static JFrame Menu;
    JLabel play_l,settings_l,LeaderBoard_l,credit_l,Exit_l;
    Image backGround=Toolkit.getDefaultToolkit().getImage("src\\Backgrounds\\Main menu1.png");
    ImageIcon Play,settings,LeaderBoard,Credit,Exit;
    Music m=new Music();

    public Loop(){
        m.sound();
        //Play Button
        Play=new ImageIcon(getClass().getResource("Buttons\\Play.png"));
        play_l=new JLabel(Play);
        play_l.setBounds(441,172,400,95);
        play_l.addMouseListener(this);
        // Settings Button
        settings=new ImageIcon(getClass().getResource("Buttons\\Settings.png"));
        settings_l=new JLabel(settings);
        settings_l.setBounds(441,283,400,95);
        settings_l.addMouseListener(this);
        // Leader Board Button
        LeaderBoard=new ImageIcon(getClass().getResource("Buttons\\Leader.png"));
        LeaderBoard_l=new JLabel(LeaderBoard);
        LeaderBoard_l.setBounds(441,395,400,95);
        LeaderBoard_l.addMouseListener(this);
        // Credits Button
        Credit=new ImageIcon(getClass().getResource("Buttons\\Credits.png"));
        credit_l=new JLabel(Credit);
        credit_l.setBounds(441,507,400,95);
        credit_l.addMouseListener(this);
        // Credits Button
        Exit=new ImageIcon(getClass().getResource("\\Buttons\\Exit.png"));
        Exit_l=new JLabel(Exit);
        Exit_l.setBounds(441,615,400,95);
        Exit_l.addMouseListener(this);
        //Window
        //Main Menu Window
        Menu=new JFrame("Chess");
        Menu.setResizable(true);
        Menu.setSize(1289, 758);
        Menu.setVisible(true);
        Menu.setLocation(Menu.getSize().width/8,Menu.getSize().height/8);
        Menu.setContentPane(new JLabel(new ImageIcon(backGround)));
        Menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Menu.add(play_l);
        Menu.add(settings_l);
        Menu.add(LeaderBoard_l);
        Menu.add(credit_l);
        Menu.add(Exit_l);
        Menu.validate();

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if(mouseEvent.getSource()==play_l){
            Menu.setVisible(false);
//            Settings.frame1.setVisible(false);

            Selection s=new Selection();
            Selection.selection.setVisible(true);

        }
        else if(mouseEvent.getSource()==settings_l){
            Menu.setVisible(false);
           // Display.Game.setVisible(false);
            Settings s=new Settings();
            s.frame1.setVisible(true);
            if(Settings.count==1){
                Settings.radioButton1.setVisible(false);
                Settings.radioButton1Selected.setVisible(true);
                Settings.radioButton2.setVisible(true);
                Settings.radioButton2Selected.setVisible(false);
                Settings.radioButton3.setVisible(true);
                Settings.radioButton3Selected.setVisible(false);
            }
            else if (Settings.count==2){
                Settings.radioButton2.setVisible(false);
                Settings.radioButton2Selected.setVisible(true);
                Settings.radioButton1Selected.setVisible(false);
                Settings.radioButton1.setVisible(true);
                Settings.radioButton3Selected.setVisible(false);
                Settings.radioButton3.setVisible(true);
            }
            else if(Settings.count==3){
                Settings.radioButton3.setVisible(false);
                Settings.radioButton3Selected.setVisible(true);
                Settings.radioButton1Selected.setVisible(false);
                Settings.radioButton1.setVisible(true);
                Settings.radioButton2Selected.setVisible(false);
                Settings.radioButton2.setVisible(true);
            }
        }
        else if(mouseEvent.getSource()==LeaderBoard_l){
            Menu.setVisible(false);
            leaderboard l =new leaderboard();
            l.Leader.setVisible(true);
        }
        else if(mouseEvent.getSource()==credit_l){
            Menu.setVisible(false);
            credits c =new credits();
            c.frame.setVisible(true);
        }
        else if(mouseEvent.getSource()==Exit_l){
            System.exit(1);

        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==play_l){
        Play=new ImageIcon(getClass().getResource("\\Buttons\\Play_sel.png"));
        play_l.setIcon(Play);
        }
        else if (e.getSource()==settings_l){
        settings=new ImageIcon(getClass().getResource("\\Buttons\\Settings_sel.png"));
        settings_l.setIcon(settings);
        }
        else if (e.getSource()== LeaderBoard_l){
            LeaderBoard=new ImageIcon(getClass().getResource("\\Buttons\\LeaderBoard.png"));
            LeaderBoard_l.setIcon(LeaderBoard);
        }
        else if (e.getSource()== credit_l){
            Credit=new ImageIcon(getClass().getResource("\\Buttons\\Credits_sel.png"));
            credit_l.setIcon(Credit);
        }
        else if (e.getSource()== Exit_l){
            Exit=new ImageIcon(getClass().getResource("\\Buttons\\Exit_sel.png"));
            Exit_l.setIcon(Exit);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==play_l){
        Play=new ImageIcon(getClass().getResource("\\Buttons\\Play.png"));
        play_l.setIcon(Play);
        }
        else if (e.getSource()==settings_l){
        settings=new ImageIcon(getClass().getResource("\\Buttons\\Settings.png"));
        settings_l.setIcon(settings);
        }
        else if (e.getSource()== LeaderBoard_l){
            LeaderBoard=new ImageIcon(getClass().getResource("\\Buttons\\Leader.png"));
            LeaderBoard_l.setIcon(LeaderBoard);
        }
        else if (e.getSource()== credit_l){
            Credit=new ImageIcon(getClass().getResource("\\Buttons\\Credits.png"));
            credit_l.setIcon(Credit);
        }
        else if (e.getSource()== Exit_l){
            Exit=new ImageIcon(getClass().getResource("\\Buttons\\Exit.png"));
            Exit_l.setIcon(Exit);
        }
    }
}
