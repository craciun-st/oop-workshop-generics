package com.codecool.usecase2.list_inheritance.model;

import java.util.*;

public class Dog extends Mammal {




    public Dog(String name, String gender) {
        super(name, gender);
    }

    public void bark() {
        System.out.println("Woof woof!");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }



    public static List<Dog> getRandomDogs(int number) {
        if (number <= 0) return Collections.emptyList();
        Random randomizer = new Random();
        List<Dog> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            result.add( getRandomDog(randomizer) );
        }
        return result;
    }

    public static Dog getRandomDog(Random randomizer) {
        int lenMaleNames = DOG_MALE_NAMES.size();
        int lenFemaleNames = DOG_FEMALE_NAMES.size();
        switch (randomizer.nextInt(2)) {
            case 0: return new Dog(DOG_MALE_NAMES.get(randomizer.nextInt(lenMaleNames)), "M");
            case 1: return new Dog(DOG_FEMALE_NAMES.get(randomizer.nextInt(lenFemaleNames)), "F");
            default: throw new IllegalStateException("Switch failed in getting a random dog!");
        }
    }


    public static final List<String> DOG_MALE_NAMES = Arrays.asList(
            "Buddy",
            "Jasper",
            "Milo",
            "Oscar",
            "Rex"
    );

    public static final List<String> DOG_FEMALE_NAMES = Arrays.asList(
            "Bella",
            "Cookie",
            "Daisy",
            "Lulu",
            "Maya"
    );


}
