package com.sistema.sistematransporte.repository;


import com.sistema.sistematransporte.repository.models.Destino;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DestinoRepository {



        private List<Destino> destinos;



        public DestinoRepository(){
            this.destinos = new ArrayList<>();

        }





        public void DestinoList() {
            destinos = new ArrayList<>(List.of(new Destino("1", "7:00AM", "Bogotá-Madrid" ),
                    new Destino("2", "830AM", "Bogotá-Chía"),
                    new Destino("3","9:00AM", "Bogotá-Mosquera"),
                    new Destino("4", "12:00PM", "Bogotá-Zipaquira")));


        }
}
