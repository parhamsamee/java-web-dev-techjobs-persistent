package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description too long!")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    //constructors

    public Skill(String description, List<Job> jobs) {
        super();
        this.description = description;
        this.jobs = jobs;

    }
        //no-arg constructor
    public Skill() {}


    //getters and setters
    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Job> getJobs() { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }
}