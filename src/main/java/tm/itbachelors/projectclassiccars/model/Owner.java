// Name: Lander Smits
// Class: 1ITF05
// Student-number: r1093338

package tm.itbachelors.projectclassiccars.model;

import java.util.ArrayList;

public class Owner extends Person {
    private int yearOfBirth;
    private String carCode;
    private ArrayList<String> wishList = new ArrayList<> ();

    public Owner(String firstName, String surName) {
        super(firstName, surName);
        carCode = "undefined";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCarCode() {
        return carCode;
    }

    public ArrayList<String> getWishList() {
        return wishList;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    //Custom Methods
    public boolean addToWishList(String carName) {
        if (wishList.size() < 5){
            wishList.add(carName);
            return true;
        }
        else{
            return false;
        }
    }

    public int getNumberOfWishes() {
        return wishList.size();
    }

    public String toString() {
        return "Owner " + super.toString() + " with car code " + getCarCode();
    }

}
