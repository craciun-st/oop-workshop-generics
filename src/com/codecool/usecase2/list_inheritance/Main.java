package com.codecool.usecase2.list_inheritance;

import com.codecool.usecase2.list_inheritance.model.Animal;
import com.codecool.usecase2.list_inheritance.model.Dog;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = Animal.getRandomAnimals(3);
        List<Dog> dogs = Dog.getRandomDogs(6);

        Dog rufus = new Dog("Rufus", "M");

        // adding an individual element to a list of supertypes works:
        animals.add(rufus);


        //however, the below code does not compile!
//        List<Animal> moreAnimals = concatenateLists(animals, dogs);


        // List<Animal> IS NOT A SUPERCLASS OF List<Dog> so 'dogs' can not be freely cast into 'list2' from the
        // function's signature


        //this works
//        List<Animal> moreAnimals = concatenateListsUsingGenericSubtypes(animals, dogs);


        //this also works and is somewhat simpler
        List<Animal> moreAnimals = concatenateListsUsingWildcards(animals, dogs);

        System.out.println(moreAnimals);

    }




    public static List<Animal> concatenateLists(List<Animal> list1, List<Animal> list2) {
        // create a copy of list1
        List<Animal> result = new LinkedList<>(list1);

        // iterate through list2 and add to the 'result' list
        for (Animal animal: list2) {
            result.add(animal);
        }
        return result;
    }

    public static <T extends Animal, U extends Animal> List<Animal> concatenateListsUsingGenericSubtypes(
            List<T> list1,
            List<U> list2
    ) {
        List<Animal> result = new LinkedList<>();
        for (T animalOfTypeT : list1) {

            result.add(animalOfTypeT);
        }

        for (U animalOfTypeU : list2) {
            result.add(animalOfTypeU);
        }

        return result;
    }


    public static List<Animal> concatenateListsUsingWildcards(
            List<? extends Animal> list1,
            List<? extends Animal> list2
    ) {
        List<Animal> result = new LinkedList<>();
        for (Animal animal : list1) {

            result.add(animal);
        }

        for (Animal animal : list2) {
            result.add(animal);
        }

        return result;
    }


}
