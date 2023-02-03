package com.sistema.sistematransporte.service;


import com.sistema.sistematransporte.repository.TrayectoRepository;
import com.sistema.sistematransporte.repository.models.Pasajero;
import com.sistema.sistematransporte.repository.models.TrayectoBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import java.util.UUID;

@Service
public class TrayectoBusService implements ICompraBoletoTrayectoService  {

    @Autowired
    private TrayectoRepository trayectoRepository;


    @Override
    public void registrarCompra(TrayectoBus trayectoBusComprado) {
        TrayectoBus trayecto = new TrayectoBus( UUID.randomUUID().toString(), new Date().toString());
        trayectoBusComprado.agregarDestino();
        trayectoBusComprado.getBus();
        trayectoBusComprado.getHorario();


    }

    @Override
    public void registarPasajero(Pasajero pasajero) {
        Pasajero nuevoPasajero = new Pasajero(UUID.randomUUID().toString(), new Date().toString(),
                pasajero.getNombre(),
                pasajero.getApellido(),
                pasajero.getNumeroTelefono(),
                pasajero.getDestino());

    }

    @Override
    public void registrarDestino() {
        this.registrarDestino();
    }






}