// Name: Lander Smits
// Class: 1ITF05
// Student-number: r1093338

package tm.itbachelors.projectclassiccars.model;

import java.util.ArrayList;

public class Car {
    private String brand;
    private String type;
    private int kilometers;
    private String photo;
    private ArrayList<Maintenance> maintenances = new ArrayList<>();

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        if (kilometers > this.kilometers) {
            this.kilometers = kilometers;
        }

    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return brand + " - " + type;
    }

    public ArrayList<Maintenance> getMaintenances() {
        return maintenances;
    }

    public int getNumberOfMaintenances() {
        return maintenances.size();
    }

    public void addMaintenance(Maintenance maintenance) {
        maintenances.add(maintenance);
    }

    public Maintenance searchMaintenanceByType(String type) {
        for (Maintenance maintenance : maintenances) {
            if(maintenance.getType().equals(type)) { // checks if 2 objects have same value
                return maintenance; // once a match is found it returns it immediately
            }
        }
        return null; // return null if nothing was found
    }

    public void registerOwner(Owner owner) {
        String brandPart = brand.substring(0,2).toUpperCase();
        String typePart = type.substring(0,2).toUpperCase();

        String carCode = brandPart + "_" + typePart + "_" + kilometers;

        owner.setCarCode(carCode);
    }
}
