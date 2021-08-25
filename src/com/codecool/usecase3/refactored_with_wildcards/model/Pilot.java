package com.codecool.usecase3.refactored_with_wildcards.model;

public class Pilot extends Person {


    public Pilot(String name) {
        this.name = name;
    }

    public boolean canPilotPlane() {
        return true;
    }

    public void pilotPlane() {
        System.out.println(name + " pilots the plane");
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                '}';
    }


}
