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





    public List<Pasajero> pasajerosList() {
        pasajeros= new ArrayList<>();
        pasajeros.add(new Pasajero("10", "Juan", "Lima", "310258744", "Bogotá-Madrid", 7));
        pasajeros.add(new Pasajero("11", "Marta", "Gomez", "4587111", "Facatativa-Bogotá", 11));
        pasajeros.add(new Pasajero("12", "Pedro", "Rueda", "32088888", "Bogotá-Funza", 5));
        pasajeros.add(new Pasajero("13", "Lina", "Camargo", "380555555", "Chía-Bogotá", 4));
        pasajeros.add(new Pasajero("14", "Luna", "Lope", "3120000000", "Mosquera-Bogotá", 7));
        pasajeros.add(new Pasajero("15", "Miguel", "Dimas", "3208999999", "Bogotá-Cota", 1));
        pasajeros.add(new Pasajero("16", "Ana", "Gil", "311698777", "Bogotá-Zipaquira", 2));
        pasajeros.add(new Pasajero("17", "Jenny", "Perez", "23578444", "Bogotá-Chía", 1));

        return pasajeros;
    }

    public void agregarPasajero(Pasajero pasajero){pasajeros.add(pasajero);}




    public List<Pasajero> obtenerPasajeros(){
        return this.pasajerosList();
    }


public void agregarPasajero(){
        this.agregarPasajero();
}


}
