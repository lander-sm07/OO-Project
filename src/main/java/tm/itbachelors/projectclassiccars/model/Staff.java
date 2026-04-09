// Name: Lander Smits
// Class: 1ITF05
// Student-number: r1093338

package tm.itbachelors.projectclassiccars.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Staff extends Person {
    private LocalDate startDate;
    private boolean senior;

    public Staff(String firstName, String surName) {
        super(firstName, surName);
        this.startDate = LocalDate.now();
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public boolean isSenior() {
        return senior;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    //Custom Methods
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = startDate.format(formatter);

        String prefix; // defines variable "prefix"
        if (senior) {
            prefix = "Senior staff member ";
        } else {
            prefix = "Staff member ";
        }

        return prefix + super.toString() + " is employed since " + formattedDate;
    }
}
