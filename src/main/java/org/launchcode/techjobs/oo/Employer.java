package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer {

    // Fields
    private int id;
    private static int nextId = 1;
    private String value;

    // Default constructor: assigns a unique id to each Employer object
    public Employer() {
        id = nextId;
        nextId++;
    }

    // Parameterized constructor: assigns a unique id and sets the value (employer name)
    public Employer(String value) {
        this();  // Calls the default constructor to assign a unique id
        this.value = value;
    }

    // toString method: returns the value of the Employer (name of the employer)
    @Override
    public String toString() {
        return (value != null) ? value : "Data not available";
    }

    // equals method: compares Employer objects based on their id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    // hashCode method: generates a hash code based on the id field
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters for id and value
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
