/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.IngredientCatalogue.Ingridient;
import Business.Role.DishFoodSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class DishFoodOrganization extends Organization{
    
    private ArrayList<Ingridient> ingLst;

    public DishFoodOrganization() {
        
        super(Organization.Type.DishFood.getValue());
        ingLst =  new ArrayList<Ingridient>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DishFoodSupplierRole());
        return roles;
    }

    
    public ArrayList<Ingridient> getIngLst() {
        return ingLst;
    }

    public void setIngLst(ArrayList<Ingridient> ingLst) {
        this.ingLst = ingLst;
    }

    
    
    public void addIngredient(Ingridient cdi)
    {
       
        ingLst.add(cdi);
        
    }
    
   
    
}
