package car;// klasa odpowiadajaca za zwracanie aut


import java.util.Date;

public class CarReturn extends CarRental {
    private Date dateOfCustomerReturn;

    public Date getDateOfCustomerReturn() {
        return dateOfCustomerReturn;
    }

    public void setDateOfCustomerReturn(Date dateOfCustomerReturnCar) {
        this.dateOfCustomerReturn = dateOfCustomerReturnCar;
    }

    public CarReturn(String vinNumber, String regNumber, String make, String model, String carColor,
                     float pricePerDayRent, float pricePerMonthlyRent, float pricePerYearRent,
                     String carAvailability) {
        super(vinNumber, regNumber, make, model, carColor, pricePerDayRent, pricePerMonthlyRent,
                pricePerYearRent, carAvailability);
    }

    public int hashMap(){
        return this.getRegNumber().hashCode();
    }


}

