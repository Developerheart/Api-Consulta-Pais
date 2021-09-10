package com.br.tec.apigerenciacerveja.controladores;


import com.br.tec.apigerenciacerveja.entidades.Paises;
import com.br.tec.apigerenciacerveja.serviços.PaisesServiços;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Paises")
public class PaisController {

    @Autowired
    private PaisesServiços paisesServiços;


    @GetMapping("/")
    public Page<Paises> paisesList(Pageable page){

        return paisesServiços.paisesRepository.findAll(page);
    }


}
