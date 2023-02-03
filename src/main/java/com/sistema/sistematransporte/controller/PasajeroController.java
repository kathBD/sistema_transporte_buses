package com.sistema.sistematransporte.controller;





import com.sistema.sistematransporte.repository.models.Bus;
import com.sistema.sistematransporte.repository.models.Pasajero;
import com.sistema.sistematransporte.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pasajeros")
public class PasajeroController {

    @Autowired
    private PasajeroService pasajeroService;


    @GetMapping("/lista")
    public ResponseEntity getPasajerosList(){

        return new ResponseEntity(pasajeroService.obtenerListaPasajeros(),HttpStatus.FOUND);
    }






}
