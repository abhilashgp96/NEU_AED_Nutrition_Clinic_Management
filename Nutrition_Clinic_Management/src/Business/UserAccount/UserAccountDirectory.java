/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccLst;

    public UserAccountDirectory() {
        userAccLst = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccLst() {
        return userAccLst;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccLst)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccLst.add(userAccount);
        return userAccount;
    }
    
    public boolean UniqueUserCheck(String username){
        for (UserAccount ua : userAccLst){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
