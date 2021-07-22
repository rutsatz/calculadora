package com.calculadora.service.calculo;

import com.calculadora.service.calculo.model.ParametrosCalculo;

import java.math.BigDecimal;

public abstract class Preparo {

    public Preparo proximo;

    public Preparo(Preparo proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal diluir(ParametrosCalculo parametrosCalculo);

}
