package com.codecool.usecase3.basic_mixed_list;

import com.codecool.usecase3.basic_mixed_list.model.FlightAttendant;
import com.codecool.usecase3.basic_mixed_list.model.Passenger;
import com.codecool.usecase3.basic_mixed_list.model.Pilot;

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
        List passengerList = List.of(passenger1, passenger2, passenger3, passenger4);

        List integerList = List.of(2, 3, 5, 7);

        // print all people
        List allPeople = getAllPeopleOnPlane(passengerList, List.of(theKindGeriatric), theFrenchman, theOverAchiever);

        // Ooopsie! we can mix any types when using List unparameterized
//        List allPeople = getAllPeopleOnPlane(integerList, List.of(theKindGeriatric), theFrenchman, theOverAchiever);

        for (Object person : allPeople) {
            System.out.println(person.toString());
        }
    }


    public static List getAllPeopleOnPlane(
            List passengerList,
            List flightAttendants,
            Pilot... pilots
    ) {
        List result = new ArrayList(16);
        for (Object passenger : passengerList) {
//            if (passenger instanceof Passenger) {
                result.add(passenger);
//            }
        }
        for (Object flightAttendant : flightAttendants) {
            result.add(flightAttendant);
        }
        for (Pilot pilot : pilots) {
            result.add(pilot);
        }

        return result;
    }


}
