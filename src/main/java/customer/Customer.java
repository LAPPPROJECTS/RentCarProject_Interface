package customer;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class Customer {

    private int userName;
    private String password;

    private String surname;
    private String postCode;
    private String address;
    private int houseNumber;
    private int mobileNumber;


    public int getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getAddress() {
        return address;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setIdCustomer(int userName) {
        this.userName = userName;
    }

    public void setName(String password) {
        this.password = password;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public Customer(int userName, String surname, String password, String postCode,
                    String address, int houseNumber,int mobileNumber) {

        //Paulina Twoje Dane
        this.userName = userName;
        this.password = password;


        this.surname = surname;
        this.postCode = postCode;
        this.address = address;
        this.houseNumber = houseNumber;
        this.mobileNumber = mobileNumber;
    }

    public int hashCode() {
        return this.surname.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            Customer other = (Customer) obj;
            if (!Objects.equals(this.userName, other.userName)) {
                return false;
            } else if (!Objects.equals(this.surname, other.surname)) {
                return false;
            } else if (!Objects.equals(this.password, other.password)) {
                return false;
            } else if (!Objects.equals(this.postCode, other.postCode)) {
                return false;
            } else if (!Objects.equals(this.address, other.address)) {
                return false;
            } else if (!Objects.equals(this.houseNumber, other.houseNumber)) {
                return false;
            } else {
                return this.mobileNumber == other.mobileNumber;
            }
        }
    }

    public String toString() {
        return this.userName + " " + this.surname + " " + this.mobileNumber + " ";
    }
}

