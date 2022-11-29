/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.UserAccount;

import enterprise.Role.Role;

/**
 *
 * @author abhilashgp
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role role;

    public UserAccount() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    

    @Override
    public String toString() {
        return "UserAccount{" + "username=" + username + '}';
    }
  
}
