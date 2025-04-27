package pers.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Vehicle {

    private String name;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Vehicle init method called");
//    }
//
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("destroy method called");
//    }
}
