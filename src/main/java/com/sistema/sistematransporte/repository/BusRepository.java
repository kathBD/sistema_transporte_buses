package com.sistema.sistematransporte.repository;


import com.sistema.sistematransporte.repository.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BusRepository {

    private List<Bus>buses;



    @Override
    public String toString() {
        return "BusRepository{" +
                "buses=" + buses +
                '}';
    }

    public void busesLista() {
        buses = new ArrayList<>(List.of(new Bus("1", "Ejecutivo", "12", 24),
                new Bus("2", "microbús", "24", 12),
                new Bus("3", "Buseta", "80", 40),
                new Bus("4", "Bus", "80", 35),
                new Bus("5", "Buseta", "60", 40),
                new Bus("6", "Ejecutivo", "14", 60),
                new Bus("7", "Buseta", "90", 40)));
    }




    public List<Bus> obtenerBuses() {
        return buses;
    }

    public void disminuirPuesto() {
        this.disminuirPuesto();
    }
    public void agregarBus() {
        this.agregarBus();
    }

}
