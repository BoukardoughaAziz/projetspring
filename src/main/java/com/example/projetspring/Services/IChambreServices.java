package com.example.projetspring.Services;

import com.example.projetspring.entities.Chambre;

import java.util.List;

public interface IChambreServices {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (Long idChambre);
}
