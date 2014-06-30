/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.assignemt.pkg1;

import java.util.ArrayList;
import prototype.assignemt.pkg1.lib.Student;
import prototype.assignemt.pkg1.lib.Account;
import java.util.List;
import java.util.Observable;
import prototype.assignemt.pkg1.lib.Teacher;

/**
 *
 * @author Thong
 */
public class Model  extends Observable{
    
    public static int MAX_ROOM = 100;
    
    private List<Account> accounts;
    private List<Student> students;
    private List<Class> classes;
    private List<Teacher> teachers;
    
    private int[] room = {101, 102, 103, 104, 201, 202, 203};
    
    public Model() {
        accounts = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
        teachers = new ArrayList<>();
        
        
        accounts.add(new Account("s","Ngoc","0878898","d@d","dda","F","d2d","123"));
    }

    public void verifyAccount(Account acc){
       for(int i=0;i<accounts.size();i++){
           if(accounts.get(i).check(acc)){
               setChanged();
               notifyObservers(true);
               setChanged();
               notifyObservers(accounts);
               break;
           } 
       }
    }

    public void addNewAccount(Account account){
        accounts.add(account);
        
        setChanged();
        notifyObservers(accounts);
    }
    
    public void addNewStudent(Student student){
        students.add(student);
        
        setChanged();
        notifyObservers(student);
    }
    
    public void addNewTeacher(Teacher teacher){
        teachers.add(teacher);
        
        setChanged();
        notifyObservers(teachers);
    }
    
    public void addNewClass(Class newClass){
        classes.add(newClass);
        
        setChanged();
        notifyObservers(classes);
    }
    
    public void editAccount(Account account){
        
    }
    
    public void editStudent(Student student){
        
    }
    
    public void editTeacher (Teacher teacher){
        
    }
    
    public void editClass(Class curClass){
        
    }
    
    public void copyClass(Class curClass){
        
    }
}
