package pers.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.example.beans.Person;
import pers.example.beans.Vehicle;
import pers.example.config.ProjectConfig;
import pers.example.pojo.Song;
import pers.example.services.VehicleServices;

import java.util.Random;
import java.util.function.Supplier;

public class example6aopMainClass {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        boolean vehicleStarted = true;

        System.out.println(vehicleServices.playMusic(vehicleStarted, new Song("My favourite song")));
        System.out.println(vehicleServices.startCar(vehicleStarted));
        System.out.println(vehicleServices.stopCar(vehicleStarted));

        context.close();
    }
}
