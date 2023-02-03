package com.sistema.sistematransporte.repository;

import com.sistema.sistematransporte.repository.models.Pasajero;
import com.sistema.sistematransporte.repository.models.Ruta;
import com.sistema.sistematransporte.repository.models.TrayectoBus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PasajeroRepository  extends Ruta {

    private List<TrayectoBus> trayectos;
    private List<Pasajero>pasajeros;

    public PasajeroRepository(){
        this.trayectos = new ArrayList<>();
    }




    public void pasajerosList() {
        pasajeros= new ArrayList<>(List.of(new Pasajero("10", "Juan", "Lima", "310258744", "Bogotá-Madrid"),
                new Pasajero("11", "Marta", "Gomez", "4587111", "Facatativa-Bogotá"),
                new Pasajero("12", "Pedro", "Rueda", "32088888", "Bogotá-Funza"),
                new Pasajero("13", "Lina", "Camargo", "380555555", "Chía-Bogotá"),
                new Pasajero("14", "Luna", "Lope", "3120000000", "Mosquera-Bogotá"),
                new Pasajero("15", "Miguel", "Dimas", "3208999999", "Bogotá-Cota"),
                new Pasajero("16", "Ana", "Gil", "311698777", "Bogotá-Zipaquira"),
                new Pasajero("17", "Jenny", "Perez", "23578444", "Bogotá-Chía")));

    }

    public void agregarTrayectoBus(TrayectoBus trayectoBus){
        trayectos.add(trayectoBus);
    }

    public List<TrayectoBus> obtenerTrayectos(){
        return this.trayectos;
    }


}
