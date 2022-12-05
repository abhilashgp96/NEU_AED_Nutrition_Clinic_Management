/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.Organization;


import enterprise.Role.AccountantRole;
import enterprise.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class FinancialOrganization extends Organization{
    

    public FinancialOrganization() {
        super(Organization.Type.Finance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AccountantRole());
        return roles;
    }
     
}

