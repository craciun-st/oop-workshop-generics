package com.codecool.usecase3.basic_mixed_list.model;

import java.util.List;

public class Passenger {

    private String name;
    private List<String> skills;

    public Passenger(String name) {
        this.name = name;
    }

    public void ridePlane() {
        System.out.println("I am a passenger\n" +
                "And I ride and I ride\n" +
                "Singin' la la la la la la la la\n" +
                "La la la la la la la la\n" +
                "La la la la la la la la la la\n\n");
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                '}';
    }
}
