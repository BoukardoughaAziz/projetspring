package com.example.projetspring.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonBackReference
    @ManyToOne
    private Foyer foyer;

    @JsonIgnore
    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Chambre> chambre;





    public Bloc(Long idBloc, String nomBloc, Long capaciteBloc) {
        this.idBloc = idBloc;
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
    }


    public Bloc() {
    }
}
