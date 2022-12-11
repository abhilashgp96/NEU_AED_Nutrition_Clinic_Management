/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Environment;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anvita
 */
public abstract class Role {
 
    public enum RoleType{
        Admin("Admin"),
        Nutritionist("Nutritionist"),
        LabAssistant("Lab Assistant");
    
    private String value;
    private RoleType(String value){
    
        this.value=value;
    }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    
    
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Environment business,Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
