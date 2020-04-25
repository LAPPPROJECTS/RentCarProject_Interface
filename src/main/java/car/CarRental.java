package car;// klasa odpowiadajaca za wynajecie auta

import java.util.Date;
import java.util.Objects;

public abstract class CarRental extends Car {

    public Date dateOfRent;
    public Date dateOfReturn;

    public CarRental(String vinNumber, String regNumber, String make, String model, String carColor, float pricePerDayRent, float pricePerMonthlyRent, float pricePerYearRent, String carAvailability) {
        super(vinNumber, regNumber, make, model, carColor, pricePerDayRent, pricePerMonthlyRent, pricePerYearRent, carAvailability);
    }

    public Date getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(Date dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public int hashCode() {
        return this.getRegNumber().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            CarRental other = (CarRental) obj;
            if (!Objects.equals(this.getVinNumber(), other.getVinNumber())) {
                return false;
            } else if (!Objects.equals(this.getRegNumber(), other.getRegNumber())) {
                return false;
            } else if (!Objects.equals(this.getMake(), other.getMake())) {
                return false;
            } else if (!Objects.equals(this.getModel(), other.getModel())) {
                return false;
            } else if (!Objects.equals(this.dateOfRent, other.dateOfRent)) {
                return false;
            } else {
                return Objects.equals(this.dateOfReturn, other.dateOfReturn);
            }
        }
    }
}
