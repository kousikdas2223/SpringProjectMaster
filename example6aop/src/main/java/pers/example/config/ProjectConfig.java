package pers.example.config;

import org.springframework.context.annotation.*;
import pers.example.beans.Person;
import pers.example.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = {"pers.example.beans",
        "pers.example.services",
        "pers.example.interfaces.implementations",
        "pers.example.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
