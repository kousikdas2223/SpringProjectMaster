package pers.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.example.beans.Vehicle;
import pers.example.config.ProjectConfig;

public class example2MainClass {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println(vehicle1.getName());
        System.out.println(vehicle1.getMaxSpeed());

        Vehicle vehicle2 = context.getBean(Vehicle.class);
        System.out.println(vehicle2.getName());
        System.out.println(vehicle2.getMaxSpeed());

        vehicle1.setName("Honda City");
        vehicle1.setMaxSpeed(180);
        System.out.println(vehicle1.getName());
        System.out.println(vehicle1.getMaxSpeed());
        System.out.println(vehicle2.getName());
        System.out.println(vehicle2.getMaxSpeed());

        context.close();
    }
}
