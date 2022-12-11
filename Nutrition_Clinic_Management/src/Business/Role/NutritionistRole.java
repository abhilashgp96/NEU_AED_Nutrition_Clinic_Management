/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Environment;
import Business.Network.Network;
import Business.Organization.NutritionistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NutritionistRole.NutritionistWorkAreaJPanel;

/**
 *
 * @author Anvita
 */
public class NutritionistRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Environment business,Network network){
    
        return new NutritionistWorkAreaJPanel(userProcessContainer,account,(NutritionistOrganization) organization,enterprise,business,network);
    }
    
}
