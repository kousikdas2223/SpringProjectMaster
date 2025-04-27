package pers.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.example.interfaces.Speaker;
import pers.example.interfaces.Tyre;

@Component
public class VehicleServices {

    @Autowired
    private Speaker speaker;

    @Autowired
    private Tyre tyre;

    public void makeMusic(){
        System.out.println("Playing music from " + speaker.makeSound());
    }

    public void rotateTyre(){
        System.out.println("Tyre is rotating " + tyre.rotate());
    }
}
