package com.example.projetspring.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component


public class PerformnceAspect {
    @Around(" execution(* com.example.projetspring.Services.FoyerServicesImpl*.*(..)) ")
    public Object profileFoyer(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime
                +"milliseconds.");
        return obj;
    }
    @Around(" execution(* com.example.projetspring.Services.ChambreServicesImpl*.*(..)) ")
    public Object profileChambre(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime
                +"milliseconds.");
        return obj;
    }
    @Around(" execution(* com.example.projetspring.Services.ReservationServicesImpl*.*(..)) ")
    public Object profileReservation(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime
                +"milliseconds.");
        return obj;
    }
    @Around(" execution(* com.example.projetspring.Services.BlocServicesImpl*.*(..)) ")
    public Object profileBloc(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime
                +"milliseconds.");
        return obj;
    }

    @Around(" execution(* com.example.projetspring.Services.EtudiantServicesImpl*.*(..)) ")
    public Object profileEtudiant(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime
                +"milliseconds.");
        return obj;
    }
    @Around(" execution(* com.example.projetspring.Services.UniversiteServicesImpl*.*(..)) ")
    public Object profileUniversite(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime
                +"milliseconds.");
        return obj;
    }
}
