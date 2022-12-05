/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.Organization;


import enterprise.Role.CashierRole;
import enterprise.Role.RestaurantManagerRole;
import enterprise.Role.Role;
import enterprise.Role.WaiterRole;
import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class RestaurantOrganization extends Organization{
    
    public RestaurantOrganization() {
        super(Organization.Type.Restaurant.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WaiterRole());
        roles.add(new CashierRole());
        roles.add(new RestaurantManagerRole());
        return roles;
    }
     
}

