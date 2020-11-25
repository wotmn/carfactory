package com.unver.carfactory.model;

public class Sedan implements Car {

    @Override
    public String getType() {
        String carTypeDescription = "Sedan Car has produced.";
        return carTypeDescription;
    }
}
