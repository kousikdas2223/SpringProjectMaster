package pers.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class VechileStartedAspect {

    Logger logger = Logger.getLogger(VechileStartedAspect.class.getName());

    @Before("execution(* pers.example.services.*.*(..)) && args(vehicleStarted,..)")
    public void vechileStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Exception {
        if(!vehicleStarted)
            throw new Exception("Vechile not started");
    }

}
