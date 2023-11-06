package com.example.projetspring.Controllers;

import com.example.projetspring.Services.IEtudiantServices;
import com.example.projetspring.entities.Etudiant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@RequiredArgsConstructor
public class EtudiantController {
    final IEtudiantServices etudiantServices;

    @GetMapping("/retrieveAllEtudiants")
    public List<Etudiant> retrieveAllEtudiants(){
        return etudiantServices.retrieveAllEtudiants();
    }

    @PostMapping("/addEtudiants")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants){
       return  etudiantServices.addEtudiants(etudiants);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(Etudiant e){
        return etudiantServices.updateEtudiant(e);
    }




}
