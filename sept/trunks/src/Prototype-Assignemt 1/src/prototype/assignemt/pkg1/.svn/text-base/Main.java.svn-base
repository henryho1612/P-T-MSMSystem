
package prototype.assignemt.pkg1;

import prototype.assignemt.pkg1.Controller.LogInController;
import prototype.assignemt.pkg1.Controller.TabSwitchController;

/**
 *
 * @author Thong
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    private GUI_Management management;
    private GUI_LoginForm loginForm;
    private GUI_ClassInfo classUI;
    private GUI_ParentInfo parentUI;
    private GUI_StudentInfo studentUI;
    private GUI_TeacherInfo teacherUI;
            
    
    public static void main(String[] args) {

       Main main = new Main();
       main.initializeApp();
    }

    public void initializeApp() {
        //initiallize GUI
        management = new GUI_Management();
        loginForm=new GUI_LoginForm();
        classUI = new GUI_ClassInfo();
        parentUI= new GUI_ParentInfo();
        studentUI = new GUI_StudentInfo();
        teacherUI = new GUI_TeacherInfo();
        
        Model model = new Model();
        loginForm=new GUI_LoginForm();

        
        loginForm.setVisible(true);
        TabSwitchController tabController = new TabSwitchController(model);
        LogInController logInController=new LogInController(model);
        loginForm.addLoginController(logInController);
        management.addTabSwitchController(tabController);
        
        model.addObserver(loginForm);
        model.addObserver(management);
        model.addObserver(classUI);
        model.addObserver(parentUI);
    }
}
