/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.Organization;

import enterprise.Role.PurchaseManagerRole;
import enterprise.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class PurchaseOrganization extends Organization{
    
    public PurchaseOrganization() {
        super(Organization.Type.Purchase.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PurchaseManagerRole());
        return roles;
    }
     
}
