package com.codecool.other.duck_typing_via_reflection;

import com.codecool.other.duck_typing_via_reflection.model.Duck;
import com.codecool.other.duck_typing_via_reflection.model.QuackDoctor;
import com.codecool.other.duck_typing_via_reflection.model.Truck;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Duck theDuck = new Duck();
        QuackDoctor mountebank = new QuackDoctor();
        Truck bigHorn = new Truck(65, 15.88);

        System.out.println(theDuck.getClass().getSimpleName() + " is a duck: " + isADuck(theDuck));
        System.out.println(mountebank.getClass().getSimpleName() + " is a duck: " + isADuck(mountebank));
        System.out.println(bigHorn.getClass().getSimpleName() + " is a duck: " + isADuck(bigHorn));

    }

    public static <T> boolean isADuck(T object) {
        boolean walksLikeADuck = false;
        boolean quacksLikeADuck = false;

        //public methods
        Method[] publicMethods = object.getClass().getMethods();
        for (Method method: publicMethods) {
            if (method.getName().equals("walk")) {
                walksLikeADuck = true;
            }
            if (method.getName().equals("quack")) {
                quacksLikeADuck = true;
            }
        }


        return walksLikeADuck && quacksLikeADuck;
    }


}
