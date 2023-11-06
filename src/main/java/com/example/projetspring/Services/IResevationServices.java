package com.example.projetspring.Services;

import com.example.projetspring.entities.Reservation;

import java.util.List;

public interface IResevationServices {
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (Long idReservation);
}
