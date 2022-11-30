/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise.Organization;

import enterprise.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anvita
 */
public abstract class Organization {
    private String name;
    private int organizationID;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private static int count = 1;
    
    public enum Type{
        Finance("Financial Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new FinancialOrganization();
//            }
        }, Purchase("Purchase Organization"){
//            public Organization createOrganization() {
//                return new FrontOfficeOrganization();
//            }
        }, Receptionist("Receptionist Organization"){
//            public Organization createOrganization() {
//                return new ReceptionistOrganization();
//            }
        }, HR("HR Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new HROrganization();
//            }
        }, Kitchen("Kitchen Organization"){
//            public Organization createOrganization() {
//                return new KitchenOrganization();
//            }
        }, Restaurant("Restaurant Organization"){
//            public Organization createOrganization() {
//                return new RestaurantOrganization();
//            };
        };
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }
    
    public Organization(String name){
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = count;
        count++;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getName() {
        return name;
    }

    public int getorganizationId() {
        return organizationID;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Organization{" + "name=" + name + '}';
    }
}
