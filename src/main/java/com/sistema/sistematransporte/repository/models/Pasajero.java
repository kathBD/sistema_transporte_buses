package com.sistema.sistematransporte.repository.models;


import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Ruta {
    private String id;
    private String nombre;
    private String apellido;
    private String numeroTelefono;

    private String pasajeroDestino;

    private int viajesRealizados;



    public Pasajero(String id, String nombre, String apellido, String numeroTelefono, String pasajeroDestino, int viajesRealizados) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.pasajeroDestino = pasajeroDestino;
        this.viajesRealizados = viajesRealizados;

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

    public String getPasajerpDestino() {
        return pasajeroDestino;
    }

    public void setPasajerpDestino(String pasajerpDestino) {
        this.pasajeroDestino = pasajerpDestino;
    }

    @Override
    public String getPasajeroDestino() {
        return pasajeroDestino;
    }

    @Override
    public void setPasajeroDestino(String pasajeroDestino) {
        this.pasajeroDestino = pasajeroDestino;
    }

    public int getViajesRealizados() {
        return viajesRealizados;
    }

    public void setViajesRealizados(int viajesRealizados) {
        this.viajesRealizados = viajesRealizados;
    }
}
