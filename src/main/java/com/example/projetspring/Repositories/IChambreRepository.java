package com.example.projetspring.Repositories;

import com.example.projetspring.entities.Chambre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IChambreRepository extends CrudRepository<Chambre,Long> {
    Chambre findChambreByNumChambre(Long numChambre);
}
