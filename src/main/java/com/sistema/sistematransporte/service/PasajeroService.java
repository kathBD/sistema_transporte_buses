package com.sistema.sistematransporte.service;


import com.sistema.sistematransporte.repository.PasajeroRepository;


import com.sistema.sistematransporte.repository.models.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PasajeroService {

    @Autowired
    public PasajeroRepository pasajeroRepository;


    public List<Pasajero> obtenerListaPasajeros() {

        return pasajeroRepository.pasajerosList();
    }


  public  Pasajero agregarPasajero(Pasajero pasajero){
        Pasajero nuevoPasajero = new Pasajero(UUID.randomUUID().toString(),
                pasajero.getNombre(),
                pasajero.getApellido(),
                pasajero.getNumeroTelefono(),
                pasajero.getPasajeroDestino(),
                pasajero.getViajesRealizados());
        return nuevoPasajero;
  }

}

