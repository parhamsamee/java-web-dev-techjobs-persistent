package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description too long!")
    private String description;

    //constructors

    public Skill(String description) {
        this.description = description;
    }
        //no-arg constructor
    public Skill() {}


    //getters and setters
    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}