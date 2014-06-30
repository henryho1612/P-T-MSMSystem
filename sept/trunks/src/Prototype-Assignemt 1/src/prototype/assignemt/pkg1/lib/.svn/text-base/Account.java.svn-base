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
public class Account extends People implements Serializable{
    private String id;
    private static int numberId=1;
    private String password;
    
    public Account(String type,String name, String phone, String email, String address, String gender, String photo, String password) {
        super(name, phone, email, address, gender, photo);
        this.id=type+numberId;
        this.password=password;
        numberId++;
    }
    public Account(String id,String password){
        super("","","","","","");
        this.id=id;
        this.password=password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }
    
    public boolean check(Account curAccount){
        if(this.id.equals(curAccount.getId()) && this.password.equals(curAccount.getPassword())){
            return true;
        } else {
            return false;
        }
    }
}
