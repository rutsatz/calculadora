package com.calculadora.service.calculo;

import java.math.BigDecimal;

public abstract class Preparo {

    public Preparo proximo;

    public Preparo(Preparo proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal diluir(BigDecimal valor);

}
