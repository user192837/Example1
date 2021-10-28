package testforstack;

import javax.swing.*;

public class MainController {
    MainView view;
    MainController(MainView view){
        this.view=view;
    }
    void addPanel(JPanel panel, String name){
        view.cardLayoutPanel.add(panel,name);
    }
    void showPanel(String panel){
        view.cl.show(view.cardLayoutPanel,panel);
    }
}