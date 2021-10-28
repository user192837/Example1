package testforstack;

public class PersonalAreaController{
    PersonalAreaView view;
    PersonalAreaController(MainController main,PersonalAreaView view){
        this.view=view;
        view.back.addActionListener(e -> main.showPanel("SIGNUP"));
    }
    public void setValue(Model model){
        view.name.setText(model.name());
        view.surname.setText(model.surname());
    }
}