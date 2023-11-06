package com.example.projetspring.Controllers;

import com.example.projetspring.Services.IChambreServices;
import com.example.projetspring.entities.Chambre;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/chambre")
@RestController
@RequiredArgsConstructor

public class ChambreController {
    final IChambreServices chambreServices;

    @GetMapping("/retrieveAllChambres")
    public List<Chambre> retrieveAllChambres() {
        return  chambreServices.retrieveAllChambres();
    }

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c){
    return  chambreServices.addChambre(c);
    }

    @PutMapping("/addChambre")
    public Chambre updateChambre(@RequestBody Chambre c){
        return  chambreServices.updateChambre(c);
    }

    @GetMapping("/retrieveChambre/{id}")
    public Chambre retrieveChambre(@PathVariable Long id) {
        return   chambreServices.retrieveChambre(id);
    }


}
