package testforstack;

import javax.swing.*;

public class PersonalAreaView{
    JPanel panel;
    JLabel name,surname;
    JButton back;
    PersonalAreaView(){
        panel=new JPanel();
        name=new JLabel();
        surname=new JLabel();
        back=new JButton("Back");
        panel.add(name);
        panel.add(surname);
        panel.add(back);
    }
}
