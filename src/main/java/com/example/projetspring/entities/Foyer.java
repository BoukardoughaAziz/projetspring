package com.example.projetspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
 @Getter
@Setter

public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long CapaciteFoyer;

    @OneToOne(mappedBy = "foyer" ,cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Universite universite;

    @OneToMany(mappedBy = "foyer",cascade = {CascadeType.PERSIST, CascadeType.REMOVE} ,fetch = FetchType.EAGER)
    private Set<Bloc> bloc;

    public Foyer(Long idFoyer, String nomFoyer, Long capaciteFoyer) {
        this.idFoyer = idFoyer;
        this.nomFoyer = nomFoyer;
        CapaciteFoyer = capaciteFoyer;
    }

    public Foyer() {
    }
}
