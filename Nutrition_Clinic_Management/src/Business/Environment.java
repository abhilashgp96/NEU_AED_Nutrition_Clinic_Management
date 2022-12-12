/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Ingredient.IngredientDirectory;
import Business.IngredientCatalogue.Ingridient;
import Business.Dish.DishDirectory;
import Business.Allergin.AllerginRecord;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class Environment extends Organization{
    
    private static Environment business;
    private ArrayList<Network> networkLst;
    private IngredientDirectory ingredientLst;
    private DishDirectory drugLst;
    private AllerginRecord allerginLst;
    public static Environment getInstance(){
        if(business==null){
            business=new Environment();
        }
        return business;
    }
    
    public Network AddNewNetwork(){
        Network network=new Network();
        networkLst.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private Environment(){
        super(null);
        networkLst=new ArrayList<Network>();
        drugLst = new DishDirectory();
        ingredientLst = new IngredientDirectory();
        allerginLst = new AllerginRecord();
    }

    public ArrayList<Network> getNetworkLst() {
        return networkLst;
    }

    public void setNetworkLst(ArrayList<Network> networkLst) {
        this.networkLst = networkLst;
    }
    
    public boolean uniqueUserCheck(String userName){
        if(!this.getUserAccountDirectory().UniqueUserCheck(userName)){
            return false;
        }
        for(Network network:networkLst){
            
        }
        return true;
    }
    
    public DishDirectory getDishLst() {
        return drugLst;
    }

    public void setDrugLst(DishDirectory drugLst) {
        this.drugLst = drugLst;
    }

    public IngredientDirectory getIngridientLst() {
        return ingredientLst;
    }

    public void setIngredientLst(IngredientDirectory IngredientLst) {
        this.ingredientLst = ingredientLst;
    }
    

    public AllerginRecord getAllerginLst() {
        return allerginLst;
    }

    public void setAllerginLst(AllerginRecord allerginLst) {
        this.allerginLst = allerginLst;
    }
    
  
    
   
}
