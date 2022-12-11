/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.IngredientRole;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class IngredientOrganization extends Organization{
    
    
     public IngredientOrganization() {
        super(Organization.Type.Ingredient.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IngredientRole());
        return roles;
    }
    
}
