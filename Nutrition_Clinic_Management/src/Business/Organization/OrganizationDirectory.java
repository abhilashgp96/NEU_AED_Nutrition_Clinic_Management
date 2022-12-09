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
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationLst;

    public OrganizationDirectory() {
        organizationLst = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationLst() {
        return organizationLst;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Nutritionist.getValue())){
            organization = new NutritionistOrganization();
            organizationLst.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization=new LabOrganization();
            organizationLst.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization=new AdminOrganization();
            organizationLst.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Caterer.getValue())){
            organization=new CateringOrganization();
            organizationLst.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.DishFood.getValue())){
            organization=new DishFoodOrganization();
            organizationLst.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.Ingredient.getValue())){
            organization=new IngredientOrganization();
            organizationLst.add(organization);
        }
        return organization;
    }
}
    
