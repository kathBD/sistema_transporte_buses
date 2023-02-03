package com.sistema.sistematransporte.service;

import com.sistema.sistematransporte.repository.models.Bus;

import java.util.List;

public interface IBusService {

     List<Bus> obtenerBuses();
     void obtenerHorario();
     void obtenerDestino();
     void disminuirCapacidad();

     Bus agregarBus(Bus bus);


}
