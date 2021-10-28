package testforstack;

public class SignUpController{
    SignUpController(MainController main,SignUpView view){
        PersonalAreaView viewPA=new
                PersonalAreaView();
        PersonalAreaController controllerPA = new PersonalAreaController(main,viewPA);
        main.addPanel(viewPA.panel,"PERSONALAREA");
        view.submit.addActionListener(e -> {
            Model model=new Model(view.name.getText(),view.surname.getText());
            controllerPA.setValue(model);
            main.showPanel("PERSONALAREA");
        });
    }
}