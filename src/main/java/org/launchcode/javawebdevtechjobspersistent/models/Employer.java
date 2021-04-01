package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required.")
    @Size(max = 50, message = "Employer can only have one location.")
    private String location;

    //constructors
    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    //getters and setters
    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }
}
