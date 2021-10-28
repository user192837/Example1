import javax.swing.*;

public class SignUpView {
    JPanel panel;
    JTextField name,surname;
    JButton submit;
    SignUpView(){
        panel=new JPanel();
        name=new JTextField(20);
        surname=new JTextField(20);
        submit=new JButton("submit");
        panel.add(name);
        panel.add(surname);
        panel.add(submit);
    }
}
