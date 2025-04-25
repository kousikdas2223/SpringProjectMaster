package pers.example.beans;

import org.springframework.stereotype.Component;

@Component
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

    @PostConstruct
    public void init(){
        System.out.println("init method called");
        this.name = "Audi";
        this.maxSpeed = 200;
    }
}
