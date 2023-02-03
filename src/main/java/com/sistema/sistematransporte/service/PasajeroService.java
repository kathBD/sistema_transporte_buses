package com.sistema.sistematransporte.service;


import com.sistema.sistematransporte.repository.PasajeroRepository;

import com.sistema.sistematransporte.repository.models.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService {

    @Autowired
    public PasajeroRepository pasajeroRepository;


    public List<Pasajero> obtenerListaPasajeros() {

        return pasajeroRepository.pasajerosList();
    }

}

