/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class CateringOrganization extends Organization{
    
    private ArrayList<DishFoodCatalogue> dishFoodLst;
    public CateringOrganization() {
     
       super(Organization.Type.Caterer.getValue());
        dishFoodLst=new ArrayList<DishFoodCatalogue>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CatererRole());
        return roles;
    }

    public ArrayList<DishFoodCatalogue> getDishFoodLst() {
        return dishFoodLst;
    }

    public void setDishFoodLst(ArrayList<DishFoodCatalogue> dishFoodLst) {
        this.dishFoodLst = dishFoodLst;
    }
    
     public void addDishFood(DishFoodCatalogue mi)
    {
       
        dishFoodLst.add(mi);
        
    }
    
    
    
}
  
