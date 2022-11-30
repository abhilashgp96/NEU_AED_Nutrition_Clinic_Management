/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.Organization;

import enterprise.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author soumya
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Finance.getValue())){
            organization = new FinancialOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Purchase.getValue())){
            organization = new PurchaseOrganization();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.Receptionist.getValue())){
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.HR.getValue())){
            organization = new HROrganizationn();
            organizationList.add(organization);
            
         } 
        else if (type.getValue().equals(Type.Kitchen.getValue())){
            organization = new KitchenOrganization();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Type.Restaurant.getValue())){
            organization = new RestaurantOrganization();
            organizationList.add(organization);
                
        }
        return organization;
    }
}
