package com.example.projetspring.Services;

import com.example.projetspring.Repositories.IChambreRepository;
import com.example.projetspring.Repositories.IEtudiantRepository;
import com.example.projetspring.Repositories.IReservationRepsository;
import com.example.projetspring.entities.Chambre;
import com.example.projetspring.entities.Etudiant;
import com.example.projetspring.entities.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ReservationServicesImpl implements IResevationServices{
    final IReservationRepsository reservationRepsository;
    final IChambreRepository chambreRepository;
    final IEtudiantRepository etudiantRepository;
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

    @Override
    public Reservation ajouterReservation(Long idChambre, Long cinEtudiant) {
       Chambre chambre = chambreRepository.findById(idChambre).orElse(null);
       Etudiant etudiant = etudiantRepository.findEtudiantByCin(cinEtudiant);
       //numreservation
       Long cinetudiant = etudiant.getCin();
       Long numchambre = chambre.getNumChambre();
       String nombloc = chambre.getBloc().getNomBloc();
       String numreservation = numchambre + " " + nombloc + " " + cinetudiant;

       //debut annee
        LocalDate thisyear = LocalDate.now();
        int year = thisyear.getYear();
        LocalDate debutannee = LocalDate.of(year,9,1);

        //finannee
        LocalDate finannee = LocalDate.of(year + 1,6,1);


        Reservation reservation = new Reservation();
        if (1 == 1){
            reservation.setNumReservation(numreservation);
            reservation.setDebutAnneeUniversitaire(debutannee);
            reservation.setFinAnneeUniversitaire(finannee);
            reservation.setEstValide(true);
            reservationRepsository.save(reservation);

        }

        return reservation;
    }
}
