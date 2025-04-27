package pers.example.interfaces.implementations;

import org.springframework.stereotype.Component;
import pers.example.interfaces.Speaker;

@Component
public class SonySpeakers implements Speaker {
    @Override
    public String makeSound() {
        return "Sound from Sony speakers";
    }
}
