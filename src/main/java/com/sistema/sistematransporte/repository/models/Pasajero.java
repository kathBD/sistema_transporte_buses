package com.sistema.sistematransporte.repository.models;


import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Ruta {
    private String id;
    private String nombre;
    private String apellido;
    private String numeroTelefono;

    private List<TrayectoBus> viajesRealizados;


    public Pasajero(String id, String nombre, String apellido, String numeroTelefono, String pasajeroDestino) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        viajesRealizados = new ArrayList<TrayectoBus>();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public List<TrayectoBus> getViajesRealizados() {
        return viajesRealizados;
    }

    public void setViajesRealizados(List<TrayectoBus> viajesRealizados) {
        this.viajesRealizados = viajesRealizados;
    }

}
