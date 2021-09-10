package com.br.tec.apigerenciacerveja.entidades;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "pais", schema = "Public")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Paises {

    @Id
    private BigInteger id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_pt")
    private String nomePt;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "bacen")
    private Integer bacen;


}
