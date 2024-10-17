package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location {

    private int id;
    private static int nextId = 1;
    private String value;

    // Default constructor: assigns a unique id
    public Location() {
        id = nextId;
        nextId++;
    }

    // Parameterized constructor: assigns a unique id and sets the value
    public Location(String value) {
        this();  // Calls the default constructor to initialize id
        this.value = value;
    }

    // Custom toString method
    @Override
    public String toString() {
        return (value != null) ? value : "Data not available";
    }

    // equals method: compares objects by id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    // hashCode method: uses id for hash calculation
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:
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
