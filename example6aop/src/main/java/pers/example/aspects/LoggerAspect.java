package pers.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* pers.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().getName().toString() + " method execution started");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        logger.info("Time took to execute the method : " + String.valueOf(duration));
        logger.info(joinPoint.getSignature().getName().toString() + " method execution completed");
    }
}
