package com.calculadora.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Calculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long codigo;

    @NotNull(message = "Medicamento não cadastrado no sistema")
    @ManyToOne
    @JoinColumn(name = "codigo_medicamento")
    private Medicamento medicamento;


}
