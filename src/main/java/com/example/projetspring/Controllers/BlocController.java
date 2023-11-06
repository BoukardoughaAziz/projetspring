package com.example.projetspring.Controllers;

import com.example.projetspring.Services.IBlocServices;
import com.example.projetspring.entities.Bloc;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@RequiredArgsConstructor

public class BlocController {
    final IBlocServices blocServices;

    @GetMapping("/retrieveBlocs")
    public List<Bloc> retrieveBlocs(){
        return blocServices.retrieveBlocs();

    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc){
        return blocServices.updateBloc(bloc);

    }

    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc){
        return blocServices.addBloc(bloc);
    }


    @GetMapping("/retrieveBloc/{id}")
    public Bloc retrieveBloc(@PathVariable Long id) {
        return blocServices.retrieveBloc(id);
    }

    @DeleteMapping("/removeBloc/{id}")
    public void removeBloc(@PathVariable Long id){
        blocServices.removeBloc(id);
        }


    }



