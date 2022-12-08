/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseLst;
   

    public ArrayList<Enterprise> getEnterpriseLst() {
        return enterpriseLst;
    }

    public void setEnterpriseLst(ArrayList<Enterprise> enterpriseLst) {
        this.enterpriseLst = enterpriseLst;
    }
    
    public EnterpriseDirectory(){
        enterpriseLst=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.NutritionalClinic){
            enterprise=new NutritionalClinicEnterprise(name);
            enterpriseLst.add(enterprise);
        }
         else if (type==Enterprise.EnterpriseType.Catering){
            enterprise= new CateringEnterprise(name);
            enterpriseLst.add(enterprise);
        }
        
        else if (type==Enterprise.EnterpriseType.DishFood){
            enterprise=new DishFoodEnterprise(name);
            enterpriseLst.add(enterprise);
        }
        else if (type==Enterprise.EnterpriseType.Ingredient){
                
            enterprise=new IngredientEnterprise(name);
            enterpriseLst.add(enterprise);
           
        }
        return enterprise;
    }
}
