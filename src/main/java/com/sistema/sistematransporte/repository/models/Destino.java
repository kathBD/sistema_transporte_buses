package com.sistema.sistematransporte.repository.models;

public class Destino {
    private String id;

    private String date;
    private String horaSalida;

    private String recorrido;



    public Destino(String id, String horaSalida, String recorrido) {
        this.id = id;
        this.horaSalida = horaSalida;
        this.recorrido = recorrido;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }
}
