package com.unver.carfactory.controller;

import com.unver.carfactory.model.Cabrio;
import com.unver.carfactory.model.Car;
import com.unver.carfactory.model.Hatchback;
import com.unver.carfactory.model.Sedan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;

@SpringBootApplication
@RestController
public class CarfactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarfactoryApplication.class, args);
    }

    @RequestMapping("/carType")
    public String carType(@RequestParam String car) {
        try{
            if (car.equals("cabrio")){
                Car cabrio = new Cabrio();
                return cabrio.getType();
            }else if(car.equals("sedan")){
                Car sedan = new Sedan();
                return sedan.getType();
            }else if (car.equals("hatchback")){
                Car hatchback = new Hatchback();
                return hatchback.getType();
            }else
                return "vehicle selection not made";
        }catch (Exception ex){
            ex.printStackTrace();
            return "";
        }
    }

}
