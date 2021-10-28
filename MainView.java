import javax.swing.*;
import java.awt.*;

public class MainView {
    JFrame frame;
    JPanel cardLayoutPanel;
    JPanel masterPanel;
    CardLayout cl;
    MainView(){
        frame = new JFrame("Frame");
        cardLayoutPanel = new JPanel();
        cardLayoutPanel.setLayout(new CardLayout());
        cl=(CardLayout) cardLayoutPanel.getLayout();

        masterPanel = new JPanel();
        masterPanel.setLayout(new BorderLayout());
        masterPanel.add(cardLayoutPanel);

        frame.getContentPane().add(masterPanel);
        frame.setResizable(true);
        frame.setSize(850, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        MainView viewM= new MainView();
        MainController controllerM=new MainController(viewM);
        SignUpView viewS = new SignUpView();
        SignUpController controllerR=new SignUpController(controllerM,viewS);
        controllerM.addPanel(viewS.panel,"SIGNUP");
        controllerM.showPanel("SIGNUP");
    }
}
