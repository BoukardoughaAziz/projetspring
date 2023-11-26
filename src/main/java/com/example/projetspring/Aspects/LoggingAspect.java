package com.example.projetspring.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component

public class LoggingAspect {
    @Before(" execution(* com.example.projetspring.Services.FoyerServicesImpl*.*(..)) ")
    public void logMethodEntryFoyer(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @Before(" execution(* com.example.projetspring.Services.ChambreServicesImpl*.*(..)) ")
    public void logMethodEntryChambre(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @Before(" execution(* com.example.projetspring.Services.ReservationServicesImpl*.*(..)) ")
    public void logMethodEntryReservation(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
        }
    @Before(" execution(* com.example.projetspring.Services.BlocServicesImpl*.*(..)) ")
    public void logMethodEntryBloc(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
        }
    @Before(" execution(* com.example.projetspring.Services.EtudiantServicesImpl*.*(..)) ")
    public void logMethodEntryEtudiant(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
        }
    @Before(" execution(* com.example.projetspring.Services.UniversiteServicesImpl*.*(..)) ")
    public void logMethodEntryUniversite(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
        }}

