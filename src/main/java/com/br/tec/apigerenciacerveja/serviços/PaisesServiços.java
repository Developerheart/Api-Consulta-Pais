package com.br.tec.apigerenciacerveja.serviços;


import com.br.tec.apigerenciacerveja.entidades.Paises;
import com.br.tec.apigerenciacerveja.repositorios.PaisesRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class PaisesServiços {

    public final PaisesRepository paisesRepository;

    public PaisesServiços(PaisesRepository paisesRepository) {
        this.paisesRepository = paisesRepository;
    }

    public List<Paises> paisesList(Pageable pageable){

        return paisesRepository.findAll();
    }

}
