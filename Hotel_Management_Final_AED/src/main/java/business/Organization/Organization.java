/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organization;

/**
 *
 * @author Anvita
 */
public class Organization {
    private String name;
    private int id;
    private static int count = 1;
    
    public Organization(){
    id = count;
    count++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Organization{" + "name=" + name + '}';
    }
}
