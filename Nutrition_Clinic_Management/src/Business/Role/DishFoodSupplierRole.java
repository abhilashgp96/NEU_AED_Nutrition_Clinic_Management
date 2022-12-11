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
import userinterface.DishFoodSupplier.DishFoodSupplierWorkArea;

/**
 *
 * @author Anvita
 */
public class DishFoodSupplierRole extends Role{
   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Environment business,Network network){
    return new DishFoodSupplierWorkArea(userProcessContainer,business,account,organization,enterprise,network);
    }
    
}
