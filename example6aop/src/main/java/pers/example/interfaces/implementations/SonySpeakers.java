package pers.example.interfaces.implementations;

import org.springframework.stereotype.Component;
import pers.example.interfaces.Speaker;
import pers.example.pojo.Song;

@Component
public class SonySpeakers implements Speaker {
    @Override
    public String makeSound(Song song) {

        return "Playing " + song.getSongName() + " from Sony speakers";

    }
}
