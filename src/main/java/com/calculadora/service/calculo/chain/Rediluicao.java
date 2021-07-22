package com.calculadora.service.calculo.chain;

import com.calculadora.service.calculo.Preparo;
import com.calculadora.service.calculo.model.ParametrosCalculo;

import java.math.BigDecimal;

public class Rediluicao extends Preparo {

    public Rediluicao() {
        super(null);
    }

    public Rediluicao(Preparo proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal diluir(ParametrosCalculo parametrosCalculo) {
        //montar o calculo aqui e ver se tiver outro chmar o proximo ainda
        BigDecimal valorAcrescentar = (parametrosCalculo.getDosagemPrescrita().divide(parametrosCalculo.getConcentracoMaximaAdm()))
                .subtract(parametrosCalculo.getValorAspirarado());
        BigDecimal nextVal = parametrosCalculo.getValorAspirarado().add(valorAcrescentar);
        parametrosCalculo.setValorAspirarado(nextVal);

        if (proximo != null) {
            return proximo.diluir(parametrosCalculo);
        }
        return nextVal;
    }
}
