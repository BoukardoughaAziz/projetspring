package com.example.projetspring.Controllers;

import com.example.projetspring.Services.IFoyerServices;
import com.example.projetspring.entities.Foyer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@RequiredArgsConstructor
public class FoyerController {
    final IFoyerServices foyerServices;


    @GetMapping("/retrieveAllFoyers")
    public List<Foyer> retrieveAllFoyers(){
        return foyerServices.retrieveAllFoyers();
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody  Foyer f){
        return foyerServices.addFoyer(f);
    }

    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody  Foyer f){
        return foyerServices.updateFoyer(f);
    }

    @GetMapping("/retrieveFoyer/{id}")
    public Foyer retrieveFoyer(@PathVariable Long idFoyer){
        return foyerServices.retrieveFoyer(idFoyer);

    }

    @DeleteMapping("/removeFoyer/{id}")
    public void removeFoyer(@PathVariable Long idFoyer) {
        foyerServices.retrieveFoyer(idFoyer);
    }




}
