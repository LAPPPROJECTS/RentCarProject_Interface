package car;/*

           oczywista klasa ;)

 */

import java.util.Objects;

public class Car {

    private String vinNumber;
    private String regNumber;
    private int yearOfProduction;
    private String make;
    private String model;
    private String carColor;
    private float priceForCar;
    private float monthlyLeasingCost; // nie wiem jeszcze czy te 4 dane
    private float pricePerDayRent;    //    nie powinno byc
    private float pricePerMonthlyRent;//       przeniesione do
    private float pricePerYearRent;   //          klasy CarProfitability
    private int carMileage;
    private String carAvailability;

    private String getVinNumber() {
        return this.vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public float getPriceForCar() {
        return priceForCar;
    }

    public void setPriceForCar(float priceForCar) {
        this.priceForCar = priceForCar;
    }

    public float getMonthlyLeasingCost() {
        return monthlyLeasingCost;
    }

    public void setMonthlyLeasingCost(float monthlyLeasingCost) {
        this.monthlyLeasingCost = monthlyLeasingCost;
    }

    public float getPricePerDayRent() {
        return pricePerDayRent;
    }

    public void setPricePerDayRent(float pricePerDayRent) {
        this.pricePerDayRent = pricePerDayRent;
    }

    public float getPricePerMonthlyRent() {
        return pricePerMonthlyRent;
    }

    public void setPricePerMonthlyRent(float pricePerMonthlyRent) {
        this.pricePerMonthlyRent = pricePerMonthlyRent;
    }

    public float getPricePerYearRent() {
        return pricePerYearRent;
    }

    public void setPricePerYearRent(float pricePerYearRent) {
        this.pricePerYearRent = pricePerYearRent;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }

    public String getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }
    
    public static void main(String[]args){
        
    }

    public Car(String vinNumber, String regNumber, String make, String model, String carColor,float pricePerDayRent,
               float pricePerMonthlyRent, float pricePerYearRent, String carAvailability){
        this.vinNumber = vinNumber;
        this.regNumber = regNumber;
        this.make = make;
        this.model = model;
        this.carColor = carColor;
        this.pricePerDayRent = pricePerDayRent;
        this.pricePerMonthlyRent = pricePerMonthlyRent;
        this.pricePerYearRent = pricePerYearRent;
        this.carAvailability = carAvailability;
        
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            Car other = (Car) obj;
            if (!Objects.equals(this.vinNumber, other.vinNumber)) {
                return false;
            } else if (!Objects.equals(this.regNumber, other.regNumber)) {
                return false;
            } else if (Float.floatToIntBits(this.pricePerDayRent) != Float.floatToIntBits(other.pricePerDayRent)) {
                return false;
            } else if (Float.floatToIntBits(this.pricePerMonthlyRent) != Float.floatToIntBits(other.pricePerMonthlyRent)) {
                return false;
            } else if (Float.floatToIntBits(this.pricePerYearRent) != Float.floatToIntBits(other.pricePerYearRent)) {
                return false;
            } else if (!Objects.equals(this.make, other.make)) {
                return false;
            } else if (!Objects.equals(this.model, other.model)) {
                return false;
            } else {
                return this.carColor.equals(other.carColor);
            }
        }
    }
    public String toString(){
        return this.vinNumber + " " + this.regNumber + " " + this.make + " " + this.model + " "
                + this.carColor + " ";
    }
    
}
