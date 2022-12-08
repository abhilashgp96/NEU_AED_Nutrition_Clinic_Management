/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Nutritionist;

import java.util.Date;

/**
 *
 * @author Anvita
 */
public class Prescription {
    private int NumberOfTimesADay;
    private int totalNumberOfDays;
    private String netName;
    private String dishFoodName;
    private String prognosis;
    private Date prescDate;

    public int getNumberOfTimesADay() {
        return NumberOfTimesADay;
    }

    public void setNumberOfTimesADay(int NumberOfTimesADay) {
        this.NumberOfTimesADay = NumberOfTimesADay;
    }

    public int getTotalNumberOfDays() {
        return totalNumberOfDays;
    }

    public void setTotalNumberOfDays(int totalNumberOfDays) {
        this.totalNumberOfDays = totalNumberOfDays;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public String getDishFoodName() {
        return dishFoodName;
    }

    public void setDishFoodName(String dishFoodName) {
        this.dishFoodName = dishFoodName;
    }

    public String getPrognosis() {
        return prognosis;
    }

    public void setPrognosis(String prognosis) {
        this.prognosis = prognosis;
    }

    public Date getPrescDate() {
        return prescDate;
    }

    public void setPrescDate(Date prescDate) {
        this.prescDate = prescDate;
    }
    
}
