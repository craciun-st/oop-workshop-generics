package com.codecool.usecase3.basic_mixed_list.model;

public class Pilot {

    private String name;

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
