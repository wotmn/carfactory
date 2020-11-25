package com.unver.carfactory.model;

public class Cabrio implements Car {

    @Override
    public String getType() {
        String carTypeDescription = "Cabrio Car has produced.";
        return carTypeDescription;
    }
}
