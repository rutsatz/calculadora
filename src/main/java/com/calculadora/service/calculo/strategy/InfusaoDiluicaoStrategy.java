package com.calculadora.service.calculo.strategy;

import com.calculadora.model.Configuracao;
import com.calculadora.model.enums.TipoDiluicao;
import com.calculadora.service.calculo.DiluicaoStrategy;

import java.math.BigDecimal;

public class InfusaoDiluicaoStrategy implements DiluicaoStrategy {
    @Override
    public boolean supports(TipoDiluicao tipoDiluicao) {
        return TipoDiluicao.INFUSAO.equals(tipoDiluicao);
    }

    @Override
    public BigDecimal aplicarDiluicao(Configuracao configuracao, BigDecimal pesoCrianca) {
        return configuracao.getMedicamento().getValorApresentacao().multiply(pesoCrianca);
    }
}
