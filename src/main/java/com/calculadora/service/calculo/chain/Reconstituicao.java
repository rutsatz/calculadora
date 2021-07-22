package com.calculadora.service.calculo.chain;

import com.calculadora.service.calculo.Preparo;

import java.math.BigDecimal;

public class Reconstituicao extends Preparo {

    public Reconstituicao() {
        super(null);
    }

    public Reconstituicao(Preparo proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal diluir(BigDecimal valor) {
        if (proximo != null) {
            return proximo.diluir(valor);
        }
        return BigDecimal.ZERO;
    }
}
