package com.sistema.sistematransporte.service;



import com.sistema.sistematransporte.repository.BusRepository;
import com.sistema.sistematransporte.repository.TrayectoRepository;
import com.sistema.sistematransporte.repository.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service
public class BusService implements IBusService {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private TrayectoRepository trayectoRepository;


    @Override
    public List<Bus> obtenerBuses() {
        return busRepository.obtenerBuses();
    }

    @Override
    public void obtenerHorario() {
        this.obtenerHorario();

    }

    @Override
    public void obtenerDestino() {
       this.obtenerDestino();
    }

    @Override
    public void disminuirCapacidad() {
        busRepository.disminuirPuesto();
    }

    @Override
    public void agregarBus() {
       busRepository.agregarBus();
    }



}
