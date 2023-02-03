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

    public List <Bus> busesLista() {
        List <Bus> buses =  new  ArrayList<Bus>();
                buses.add(new Bus("1", "Ejecutivo", "12", 24));
                buses.add(new Bus("2", "microbús", "24", 12));
                buses.add(new Bus("3", "Buseta", "80", 40));
                buses.add(new Bus("4", "Bus", "80", 35));
                buses.add(new Bus("5", "Buset2", "60", 40));

       return buses;
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
