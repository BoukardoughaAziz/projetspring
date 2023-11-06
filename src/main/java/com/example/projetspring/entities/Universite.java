package com.example.projetspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Getter
@Setter

public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private Long Adresse;
    @OneToOne
    private Foyer foyer;

    public Universite(Long idUniversite, String nomUniversite, Long adresse) {
        this.idUniversite = idUniversite;
        this.nomUniversite = nomUniversite;
        Adresse = adresse;
    }

    public Universite() {
    }
}
