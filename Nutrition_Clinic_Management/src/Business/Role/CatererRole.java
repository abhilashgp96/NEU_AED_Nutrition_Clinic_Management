/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Environment;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anvita
 */
public class CatererRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Enterprise enterprise,Environment business){
     return null;
    }
    
}
