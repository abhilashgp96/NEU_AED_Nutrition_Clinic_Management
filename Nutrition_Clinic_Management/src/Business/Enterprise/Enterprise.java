 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author abhilashgp
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType typeOfEnterprise;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        NutritionalClinic("Nutritional Clinic"),
        Catering("Catering"),
        DishFood("DIsh/Food market"),
        Ingredient("Ingredient market");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getTypeOfEnterprise() {
        return typeOfEnterprise;
    }

    public void setTypeOfEnterprise(EnterpriseType typeOfEnterprise) {
        this.typeOfEnterprise = typeOfEnterprise;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.typeOfEnterprise=type;
        organizationDirectory=new OrganizationDirectory();
    }
}
