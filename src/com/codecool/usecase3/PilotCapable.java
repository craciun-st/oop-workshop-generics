package com.codecool.usecase3;

public interface PilotCapable {

    boolean canPilotPlane();

    default void pilotPlane() {
        if (canPilotPlane()) {
            System.out.println("A pilot capable person has somehow managed to handle the plane up to a safe landing");
        }
        else {
            // RuntimeException is unchecked and will crash the program
            throw new RuntimeException("An unknowledgeable person has failed to pilot the plane and crashed!!");
        }
    }
}
