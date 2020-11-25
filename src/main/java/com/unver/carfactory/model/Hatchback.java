package com.unver.carfactory.model;

public class Hatchback implements Car {

    @Override
    public String getType() {
        String carTypeDescription = "Hatchback Car has produced.";
        return carTypeDescription;
    }
}
