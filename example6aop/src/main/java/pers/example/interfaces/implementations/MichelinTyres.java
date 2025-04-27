package pers.example.interfaces.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pers.example.interfaces.Tyre;

@Component
public class MichelinTyres implements Tyre {

    @Override
    public String rotate() {

        return "Car is using Michelin tyres";

    }

}
