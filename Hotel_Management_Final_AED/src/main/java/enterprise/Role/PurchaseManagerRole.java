/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.Role;

import enterprise.Enterprise;
import enterprise.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anvita
 */
public class PurchaseManagerRole extends Role {
    
     public PurchaseManagerRole(){
    this.type=RoleType.PurchaseManager;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
      
       this.type = RoleType.PurchaseManager;
       return null;
    }
    
}
