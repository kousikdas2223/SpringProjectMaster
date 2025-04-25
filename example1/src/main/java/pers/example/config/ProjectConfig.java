package pers.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.example.beans.Vehicle;

@Configuration
public class ProjectConfig {

    @Bean(value="Audi")
    Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Tesla");
        vehicle.setMaxSpeed(200);
        return vehicle;
    }

    @Bean(value="Ferrari")
    Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        vehicle.setMaxSpeed(250);
        return vehicle;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer number(){
        return 100;
    }
}
