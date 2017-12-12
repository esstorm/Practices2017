package models;

import java.util.Date;

public class Driver extends Person implements PaymentCheck{

    String driverLicense;
    double hours;
    int fines;
    double netWage;
    double grossWage;

    public Driver(String name, Date birthday, String driverLicense){
        super(name, birthday);
        this.driverLicense = driverLicense;
        netWage = grossWage = 0;
    }

    public void setAdditionalNightHours(double hours){
        this.hours = hours;
        netWage += hours * 40;
    }

    public void setGottenFines(int fines){
        this.fines = fines;
    }

    public String getDiscounts(){
        return "Total fines: " + fines;
    }

    public String getGrossWage(){
        return "Gross wage: " + (netWage - fines);
    }
}