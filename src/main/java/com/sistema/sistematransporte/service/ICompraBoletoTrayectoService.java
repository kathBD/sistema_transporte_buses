package com.sistema.sistematransporte.service;

import com.sistema.sistematransporte.repository.models.Pasajero;
import com.sistema.sistematransporte.repository.models.TrayectoBus;

public interface ICompraBoletoTrayectoService {

    void registrarCompra(TrayectoBus trayectoBus);

    void registarPasajero(Pasajero pasajero);

    void registrarDestino();


}
