package com.sistema.sistematransporte.repository;


import com.sistema.sistematransporte.repository.models.Destino;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DestinoRepository {



        private List<Destino> horarios;


        public DestinoRepository(){
            this.horarios = new ArrayList<>();
        }




        public void horarioList() {
            horario = new ArrayList<>(List.of(new Destino("1", "7AM"),
                    new Destino("2", "830AM"),
                    new Destino("3","9:00AM"),
                    new Destino("4", ),
                    new Destino(),
                    new Destino(),
                    new Destino("16",),
                    new Destino()));

        }
}
