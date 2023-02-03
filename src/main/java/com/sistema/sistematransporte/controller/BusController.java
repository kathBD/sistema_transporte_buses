package com.sistema.sistematransporte.controller;


import com.sistema.sistematransporte.repository.models.Bus;
import com.sistema.sistematransporte.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sistema/terminal")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("/traer/buses")
    public ResponseEntity GETtraerBuses(){
        return new ResponseEntity<>(busService.obtenerBuses(), HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity listaBuses(@RequestBody Bus bus){

    }
}
