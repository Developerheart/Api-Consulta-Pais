package com.br.tec.apigerenciacerveja.repositorios;

import com.br.tec.apigerenciacerveja.entidades.Paises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface PaisesRepository extends JpaRepository<Paises, BigInteger>{

}