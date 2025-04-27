package pers.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.example.interfaces.Speaker;
import pers.example.interfaces.Tyre;
import pers.example.pojo.Song;

import java.util.logging.Logger;

@Component
public class VehicleServices {

    private Logger logger = Logger.getLogger(VehicleServices.class.getName());

    @Autowired
    private Speaker speaker;

    @Autowired
    private Tyre tyre;

    public String playMusic(boolean vehicleStarted, Song song){

//        String music = null;
//
//        if(vehicleStarted){
//            music = speaker.makeSound(song);
//            logger.info(music);
//        }
//        else
//            logger.info("Vehicle is not started, so can not play music");
        return speaker.makeSound(song);
    }

    public String startCar(boolean vehicleStarted){
//
//        String carStatus = null;
//
//        if(!vehicleStarted){
//            carStatus = tyre.rotate("Staring the car");
//            logger.info(carStatus);
//        }
//        else
//            logger.info("Vehicle is already started");
        return tyre.rotate();

    }

    public String stopCar(boolean vehicleStarted){

//        String carStatus = null;
//
//        if(vehicleStarted) {
//            carStatus = tyre.rotate("Staring the car");
//            logger.info(carStatus);
//        }
//        else
//            logger.info("Vehicle is not started");
        return tyre.rotate();
    }
}
