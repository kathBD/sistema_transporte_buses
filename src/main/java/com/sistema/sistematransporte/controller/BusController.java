package com.sistema.sistematransporte.controller;



import com.sistema.sistematransporte.repository.models.Bus;
import com.sistema.sistematransporte.service.BusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/sistema")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping("/traer/buses")
    public ResponseEntity <List<Bus>> obtenerBuses() {
       return new ResponseEntity(busService.obtenerBuses(), HttpStatus.FOUND);

    }

  @PostMapping("/crear/bus")
    public ResponseEntity crearBus(@RequestBody Bus bus) {
      return new ResponseEntity(busService.agregarBus(bus), HttpStatus.CREATED);

  }








}





