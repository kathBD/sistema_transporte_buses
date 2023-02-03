package com.sistema.sistematransporte.repository;


import com.sistema.sistematransporte.repository.models.Pasajero;
import com.sistema.sistematransporte.repository.models.TrayectoBus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TrayectoRepository {

    private List<Pasajero>pasajeros;


    public TrayectoRepository(){
        this.pasajeros = new ArrayList<>();
    }

    public List<Pasajero> ObternListaPasajeros(){
        return this.pasajeros;
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
        trayectoBus.getRuta();
        trayectoBus.getHorario();
    }
  public void setPasajeros(List<Pasajero> pasajeros){
        this.pasajeros = pasajeros;
  }

}
