package pers.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.example.beans.Person;
import pers.example.beans.Vehicle;
import pers.example.config.ProjectConfig;

import java.util.Random;
import java.util.function.Supplier;

public class example5MainClass {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        Vehicle vehicle = context.getBean(Vehicle.class);

        vehicle.getVehicleServices().makeMusic();
        vehicle.getVehicleServices().rotateTyre();

        context.close();
    }
}
