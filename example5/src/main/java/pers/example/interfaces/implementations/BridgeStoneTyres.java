package pers.example.interfaces.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pers.example.interfaces.Tyre;

@Primary
@Component
public class BridgeStoneTyres implements Tyre {

    @Override
    public String rotate() {
        return "Car is using BridgeStone tyres";
    }
}
