package com.calculadora.service.calculo.chain;

import com.calculadora.service.calculo.Preparo;
import com.calculadora.service.calculo.model.ParametrosCalculo;

import java.math.BigDecimal;

public class Reconstituicao extends Preparo {

    public Reconstituicao() {
        super(null);
    }

    public Reconstituicao(Preparo proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal diluir(ParametrosCalculo parametrosCalculo) {
        BigDecimal valorAspirar;
//aqui tenho que fazer o primeiro calculo.
        if (parametrosCalculo.getValorFinalPosDiluicao() != null
                && BigDecimal.ZERO.compareTo(parametrosCalculo.getValorFinalPosDiluicao()) == -1) {
            valorAspirar = (parametrosCalculo.getDosagemPrescrita().multiply(parametrosCalculo.getValorFinalPosDiluicao()))
                    .divide(parametrosCalculo.getMedicamentoValorApresentacao());
        } else {
//TODO :  e se não tiver vai usar o que ? o valor de valor_diluicao ???
            valorAspirar = (parametrosCalculo.getDosagemPrescrita().multiply(parametrosCalculo.getValorDiluicao()))
                    .divide(parametrosCalculo.getMedicamentoValorApresentacao());
        }
        parametrosCalculo.setValorAspirarado(valorAspirar);

        if (proximo != null) {
            return proximo.diluir(parametrosCalculo);
        }
        return valorAspirar;
    }
}
