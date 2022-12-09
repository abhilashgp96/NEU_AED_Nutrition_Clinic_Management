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
public abstract class Organization {
    
    private String orgName;
    private WorkQueue workQueue;
    private EmployeeDirectory empDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int orgID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Nutritionist("Nutritionist Organization"), Lab("FDA Lab Organization"), Caterer("Caterer Organization"), DishFood("Food Supplier Organization"), Ingredient("Ingredient supplier Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name) {
        this.orgName = name;
        workQueue = new WorkQueue();
        empDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
}
