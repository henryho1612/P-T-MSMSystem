/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.assignemt.pkg1.lib;

import java.io.Serializable;

/**
 *
 * @author Cao Anh
 */
public class Student extends People implements Serializable{
    private People parent;
    public Student(String name, String phone, String email, String address, String gender, String photo,People parent) {
        super(name, phone, email, address, gender, photo);
        this.parent=parent;
        numberId++;
        id="s"+numberId;
    }

    public void setParent(People parent) {
        this.parent = parent;
    }

    public People getParent() {
        return parent;
    }

    public String getId() {
        return id;
    }
    private static int numberId=0;
    private String id;
    
}
