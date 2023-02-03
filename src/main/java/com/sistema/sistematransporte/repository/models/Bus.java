package com.sistema.sistematransporte.repository.models;



public class Bus {
    private String id;
    private String tipo;
    private String numeroBus;
    private  int capacidad;
    private  int puestosDisponibles;



    public Bus(String id, String tipo, String numeroBus, int capacidad) {
        this.id = id;
        this.tipo = tipo;
        this.numeroBus = numeroBus;
        this.capacidad = capacidad;
        this.puestosDisponibles = capacidad;

    }

    public Bus() {

    }

    public void disminuirPuestos(){
        puestosDisponibles--;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(String numeroBus) {
        this.numeroBus = numeroBus;
    }

    public int getPuestosDisponibles() {
        return puestosDisponibles;
    }

    public void setPuestosDisponibles(int puestosDisponibles) {
        this.puestosDisponibles = puestosDisponibles;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void agregarBus(Bus bus) {
    }
}
