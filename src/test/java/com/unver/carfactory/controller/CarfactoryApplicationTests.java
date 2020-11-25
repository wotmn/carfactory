package com.unver.carfactory.controller;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CarfactoryApplicationTests {

    CarfactoryApplication carfactoryApplication = new CarfactoryApplication();

    @Test
    void controlEqualsCarTypeMethod(){
        assertEquals("cabrio", carfactoryApplication.carType("cabrio"));
        assertEquals("sedan", carfactoryApplication.carType("sedan"));
        assertEquals("hatchback", carfactoryApplication.carType("hatchback"));
    }
    @Test
    void controlNotNullCarTypeMethod(){
        assertNotNull(carfactoryApplication.carType("cabrio"));
        assertNotNull(carfactoryApplication.carType("sedan"));
        assertNotNull(carfactoryApplication.carType("hatchback"));
    }

}
