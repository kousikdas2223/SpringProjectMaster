package pers.example.interfaces.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pers.example.interfaces.Speaker;

@Component
@Primary
public class BoseSpeakers  implements Speaker {
    @Override
    public String makeSound() {
        return "Sound from Bose speakers";
    }
}
