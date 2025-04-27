package pers.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pers.example.beans.Person;
import pers.example.beans.Vehicle;
import pers.example.config.ProjectConfig;

import java.util.Random;
import java.util.function.Supplier;

public class example4MainClass {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
         Person person = context.getBean(Person.class);

        System.out.println(person.getName());
        System.out.println(person.getVehicle().getName());

        context.close();
    }
}
