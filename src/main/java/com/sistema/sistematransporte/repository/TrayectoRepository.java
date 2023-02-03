package com.sistema.sistematransporte.repository;


import com.sistema.sistematransporte.repository.models.Pasajero;
import com.sistema.sistematransporte.repository.models.TrayectoBus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TrayectoRepository {

    private List<Pasajero>pasajeros;

    private List<TrayectoBus>trayectoBuses;


    public TrayectoRepository(){
        this.pasajeros = new ArrayList<>();
    }

    public List<TrayectoBus> obtenerTrayecto(){
        return this.trayectoBuses;
    }



    public void generarBoleto(Pasajero pasajero, TrayectoBus trayectoBus){
        trayectoBus.getBus().disminuirPuestos();

    }
    public  void  imprimirBoleto(Pasajero pasajero, TrayectoBus trayectoBus ){
        pasajero.getId();
        pasajero.getNombre();
        pasajero.getApellido();
        trayectoBus.getBus();
        trayectoBus.getDate();
    }
  public void setPasajeros(List<Pasajero> pasajeros){
        this.pasajeros = pasajeros;
  }

}
