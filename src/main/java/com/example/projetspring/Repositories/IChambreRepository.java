package com.example.projetspring.Repositories;

import com.example.projetspring.entities.Chambre;
import com.example.projetspring.entities.Universite;
import org.springframework.data.repository.CrudRepository;

public interface IChambreRepository extends CrudRepository<Chambre,Long> {
}
