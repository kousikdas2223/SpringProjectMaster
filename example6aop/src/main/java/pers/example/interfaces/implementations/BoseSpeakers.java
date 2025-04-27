package pers.example.interfaces.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pers.example.interfaces.Speaker;
import pers.example.pojo.Song;

@Component
@Primary
public class BoseSpeakers  implements Speaker {
    @Override
    public String makeSound(Song song) {

        return "Playing " + song.getSongName() + " from Bose speakers";

    }
}
