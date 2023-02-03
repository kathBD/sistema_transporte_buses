package com.sistema.sistematransporte.repository.models;



public abstract class Ruta {
    private  String id;
    private String viajeRealizado;


    public Ruta(String id, String destino) {
        this.id = id;
        this.viajeRealizado = destino;

    }

    public Ruta() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getViajeRealizado() {
        return viajeRealizado;
    }

    public void setViajeRealizado(String viajeRealizado) {
        this.viajeRealizado = viajeRealizado;
    }



}
