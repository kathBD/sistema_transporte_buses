package com.sistema.sistematransporte.repository.models;



public class TrayectoBus extends Ruta {

    private  String id;

    private Bus bus;

    private String date;
    private int numerodePasajeros;

    private Destino destino;


    public TrayectoBus(String id, Bus bus, Destino horario, String date, int numerodePasajeros, Destino destino) {
        super();
        this.id = id;
       this.bus = bus;
        this.date = date;
       this.numerodePasajeros= numerodePasajeros;
       this.destino = destino;
    }

    public TrayectoBus(String id, String date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  public void verListapasajeros(){
     this.numerodePasajeros++;
  }




    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }




    public int getNumerodePasajeros() {
        return numerodePasajeros;
    }

    public void setNumerodePasajeros(int numerodePasajeros) {
        this.numerodePasajeros = numerodePasajeros;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}
