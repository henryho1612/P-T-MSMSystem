package prototype.assignemt.pkg1.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTextField;
import prototype.assignemt.pkg1.GUI_LoginForm;
import prototype.assignemt.pkg1.Model;
import prototype.assignemt.pkg1.lib.Account;

/**
 *
 * @author Thong
 */
public class LogInController extends BasicController implements ActionListener{

    
    public LogInController(Model m){
        super(m);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        List<JTextField> textFields = (ArrayList<JTextField>) super.mes;
        Account checkAccount = new Account(textFields.get(0).getText(),textFields.get(1).getText());
        super.model.verifyAccount(checkAccount);
    }
    
}
