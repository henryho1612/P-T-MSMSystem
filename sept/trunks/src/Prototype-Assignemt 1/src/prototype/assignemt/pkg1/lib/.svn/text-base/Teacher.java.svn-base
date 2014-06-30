/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.assignemt.pkg1.lib;

import java.io.Serializable;
import prototype.assignemt.pkg1.lib.People;

/**
 *
 * @author Cao Anh
 */
public class Teacher extends People implements Serializable{
    private String id;
    private static int numberId=0;
    public Teacher(String name, String phone, String email, String address, String gender, String photo) {
        super(name, phone, email, address, gender, photo);
        numberId++;
        id="t"+numberId;
    }

    public String getId() {
        return id;
    }
    
    
}
