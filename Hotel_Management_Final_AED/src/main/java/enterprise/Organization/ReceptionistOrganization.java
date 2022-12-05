/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.Organization;

import enterprise.Role.FrontOfficeManagerRole;
import enterprise.Role.Role;
import enterprise.Role.ValetParkerRole;
import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class ReceptionistOrganization extends Organization{
    
    public ReceptionistOrganization() {
        super(Organization.Type.Receptionist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ValetParkerRole());
        roles.add(new FrontOfficeManagerRole());
        return roles;
    }
     
}
