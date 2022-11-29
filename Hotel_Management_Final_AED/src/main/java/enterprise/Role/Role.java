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
public abstract class Role {
    
    public enum RoleType{
        
        Admin("Admin"),
         Accountant("Accountant"),
         ValetParker("ValetParker"),
         FrontOfficeManager("FrontOfficeManager"),
         HRManager("HRManager"),
         RestaurantManager("RestaurantManager"),
         Chef("Chef"),
         Waiter("Waiter"),
         Cashier("Cashier"),
         PurchaseManager("PurchaseManager");
        
     
        
        private String value;
        
        private RoleType(String value){
         this.value=value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "RoleType{" + "value=" + value + '}';
        }
        
              
    }
    
    public RoleType type;
    
     public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Enterprise enterprise);
     
    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
}
