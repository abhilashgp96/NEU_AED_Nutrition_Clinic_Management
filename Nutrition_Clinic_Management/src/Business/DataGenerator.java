/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Nutritionist.Prescription;
import Business.Organization.AdminOrganization;
import Business.WorkQueue.NutritionistWorkRequest;
import java.util.Random;

/**
 *
 * @author abhilashgp
 */
public class DataGenerator {
    
    private static Random rand = new Random();
    private static String[] network = {"Boston", "New York", "Connecticut"};

    private static String[] beginning = {"kr", "ca", "Ra", "Ho", "Lj", "pg", "kre", "lop", "mat"};
    private static String[] middle = {"air", "cal", "Pla", "ghdo", "kal", "hkg", "pokre", "lojop", "mploat"};

    private static String[] clinicName = {"Healthy Foods","Go Green Clinic","Health First","Wellness Centre","Food World"};

    private static String[] organisationName = {"Nutritionist", "FDA Lab", "Caterers", "Food Supply Market", "Ingridient Market"};

    private static String[] DishName = {"Steak", "kombu", "Asparagus", "SteamedMussels", "ArugulaSalad", "TurkeyPicadillo", "WhiteBeanTostada", "parsleysalad"};
    
    private static String[] deficiencyName = {"Iron","Iodine","VitaminD","VitaminB12","Calcium","VitaminA","Magnesium","VitaminK"};
    
    private static String[] allerginName = {"Pollen","Lactose","Anaphylaxis","Casein","Gluten","Parvalbumin","Sesamumindicum","Glycinemax","ImmunoglobulinE"};
    
    public static String generateNetwork() {
        return network[rand.nextInt(network.length)];
    }
    
     public static String generateClinicName() {
        return clinicName[rand.nextInt(clinicName.length)];
    }
     
      public static String generationOrganisationName() {
        return organisationName[rand.nextInt(organisationName.length)];
    }
      
    public static String generateDish() {

        return DishName[rand.nextInt(DishName.length)];

    }
    
     public static String generateDeficiency() {

        return deficiencyName[rand.nextInt(deficiencyName.length)];

    }
     
    public static String generateAllergin() {

        return allerginName[rand.nextInt(allerginName.length)];

    }
     
     public static Prescription InitDishName() {

        Prescription pres = new Prescription();
        pres.setDishFoodName(generateDish());
        pres.setNetName(generateNetwork());
        
        return pres;

    }
     
     public static AdminOrganization InitOrgName() {

        AdminOrganization admin = new AdminOrganization();

        admin.setOrgName(generationOrganisationName());
        return admin;

    }
    
     public static Prescription InitDeficiencyName() {

        Prescription pres = new Prescription();
        pres.setNetName(generateNetwork());
        pres.setPrognosis(generateDeficiency());
        return pres;

    }
    
    
}
