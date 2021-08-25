package com.codecool.usecase3.refactored_with_wildcards.model;

public class FlightAttendant extends Person {


    public FlightAttendant(String name) {
        this.name = name;
    }


    public void serveRefreshments() {
        System.out.println("Refreshments are served!");
    }

    public void cleanupTrash() {
        // Objects with all null fields should be de-referenced by other objects
        // in order to have them picked up by the Garbage Collector
        // Setting the object as whole to null may or may not help
    }

    @Override
    public String toString() {
        return "FlightAttendant{" +
                "name='" + name + '\'' +
                '}';
    }
}
