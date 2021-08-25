package com.codecool.usecase2.list_inheritance.model;

public class Mammal extends Animal {

    public Mammal(String name, String gender) {
        super(name, gender);
    }

    public boolean canGiveMilk() {
        return gender.equals("F");
    }
}
