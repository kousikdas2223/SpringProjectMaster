package pers.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.example.beans.Vehicle;
import pers.example.config.ProjectConfig;

public class example2MainClass {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        vehicle.setMaxSpeed(150);

        System.out.println(vehicle.getName());
        System.out.println(vehicle.getMaxSpeed());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println(vehicle1.getName());
        System.out.println(vehicle1.getMaxSpeed());

        context.close();
    }
}
