package com.codecool.usecase2.list_inheritance.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Animal {


    protected String name;
    protected String gender;

    // Order matters, since both parameters are of String-type !!
    public Animal(String name, String gender) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static List<Animal> getRandomAnimals(int number) {
        if (number <= 0) return Collections.emptyList();
        Random randomizer = new Random();
        List<Animal> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            result.add( new Animal("Animal "+(i+1), getRandomGender(randomizer)));
        }
        return result;
    }

    public static String getRandomGender(Random randomizer) {
        switch (randomizer.nextInt(2)) {
            case 0: return "M";
            case 1: return "F";
            default: throw new IllegalStateException("Randomizer failed in bounding to just 2 (two genders)!");
        }
    }
}
