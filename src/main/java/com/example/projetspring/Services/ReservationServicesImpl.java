package com.example.projetspring.Services;

import com.example.projetspring.Repositories.IReservationRepsository;
import com.example.projetspring.entities.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ReservationServicesImpl implements IResevationServices{
    final IReservationRepsository reservationRepsository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepsository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepsository.save(res);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepsository.findById(idReservation).orElse(null);
    }
}
