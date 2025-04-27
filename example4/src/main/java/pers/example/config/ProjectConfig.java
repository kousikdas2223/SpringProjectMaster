package pers.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pers.example.beans.Person;
import pers.example.beans.Vehicle;

@Configuration
@ComponentScan("pers.example")
public class ProjectConfig {

    //Wiring using method calls or parameters

    @Bean
    Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        vehicle.setMaxSpeed(200);
        return vehicle;
    }

    @Bean
    @Primary
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        vehicle.setMaxSpeed(150);
        return vehicle;
    }

    @Bean
    Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        vehicle.setMaxSpeed(250);
        return vehicle;
    }

}
