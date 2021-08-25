package com.codecool.usecase3.refactored_with_wildcards;

import com.codecool.usecase3.refactored_with_wildcards.model.FlightAttendant;
import com.codecool.usecase3.refactored_with_wildcards.model.Passenger;
import com.codecool.usecase3.refactored_with_wildcards.model.Person;
import com.codecool.usecase3.refactored_with_wildcards.model.Pilot;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pilot theFrenchman = new Pilot("Antoine de Saint-Exupéry");
        Pilot theOverAchiever = new Pilot("Amelia Earhart");

        FlightAttendant theKindGeriatric = new FlightAttendant("Ron Akana");

        Passenger passenger1 = new Passenger("John Doe");
        Passenger passenger2 = new Passenger("Jane Doe");
        Passenger passenger3 = new Passenger("The obligatory mom");
        Passenger passenger4 = new Passenger("The obligatory crying baby");

        // unmodifiable list
        List<Passenger> passengerList = List.of(passenger1, passenger2, passenger3, passenger4);

        // miscreant list
        List<Integer> integerList = List.of(2, 3, 5, 7);


        // print all people

        // replace Object with a more specific superclass (here, Person) !!

        List<Object> allPeople = getAllPeopleOnPlane(
                integerList,
                List.of(theKindGeriatric),
                List.of(theFrenchman, theOverAchiever)
        );
        for (Object person : allPeople) {
            System.out.println(person);
        }
    }


    public static <T> List<T> getAllPeopleOnPlane(
            List<? extends T>... personLists
    ) {
        // do not perform any casting when using varargs, since varargs are stored as an array (e.g.
        //                  List<? extends T>[]
        // )
        // you will get an unexpected ClassCastException at runtime if you make an unsafe operation!


        // adding to a list while respecting inheritance should be safe
        List<T> result = new ArrayList<>(16);
        for (List<? extends T> list : personLists) {
            for (T person : list) {
                result.add(person);
            }
        }


        return result;
    }


}
