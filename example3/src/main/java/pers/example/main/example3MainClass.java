package pers.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.example.beans.Vehicle;
import pers.example.config.ProjectConfig;

import java.util.Random;
import java.util.function.Supplier;

public class example3MainClass {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Audi");
        vehicle1.setMaxSpeed(150);
        Supplier<Vehicle> vehicleSupplier = () -> vehicle1;

        Supplier<Vehicle> vehicleSupplier2 = () -> {
            Vehicle vehicle2 = new Vehicle();
            vehicle2.setName("BMW");
            vehicle2.setMaxSpeed(200);
            return vehicle2;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);

        if(randomNumber % 2 == 0) {
            context.registerBean("Car", Vehicle.class, vehicleSupplier);
        }
        else{
            context.registerBean("Car", Vehicle.class, vehicleSupplier2);
        }

        Vehicle car = context.getBean("Car", Vehicle.class);

        System.out.println(car.getName());
        System.out.println(car.getMaxSpeed());

        context.close();
    }
}
