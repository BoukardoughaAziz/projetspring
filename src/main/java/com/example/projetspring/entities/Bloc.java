package com.example.projetspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity

public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    private Foyer foyer;

    @OneToMany
    private Set<Chambre> chambre;





    public Bloc(Long idBloc, String nomBloc, Long capaciteBloc) {
        this.idBloc = idBloc;
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
    }


    public Bloc() {
    }
}
