/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.assignemt.pkg1.Controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import prototype.assignemt.pkg1.Model;

/**
 *
 * @author Thong
 */
public class TabSwitchController extends BasicController implements ActionListener{

    private JPanel tabs;
    
    public TabSwitchController(Model m) {
        super(m);
    }
    
    public void addTabs(JPanel tabs){
        this.tabs  = (JPanel) tabs;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        List<JToggleButton> Btns = (List<JToggleButton>) mes;
        JToggleButton selectedBtn = (JToggleButton)e.getSource();
        CardLayout c = (CardLayout) tabs.getLayout();
        System.out.println(selectedBtn.getName());
        c.show(tabs, selectedBtn.getName().toString());
        for (int i = 0; i < Btns.size(); i++) {
            if(!Btns.get(i).equals(selectedBtn)){
                Btns.get(i).setSelected(false);
            } else {
                Btns.get(i).setSelected(true);
            }
        }
    }
    
}
