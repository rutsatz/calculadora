package com.calculadora.service.calculo.strategy;

import com.calculadora.model.Configuracao;
import com.calculadora.model.enums.TipoDiluicao;
import com.calculadora.service.calculo.DiluicaoStrategy;
import com.calculadora.service.calculo.chain.Reconstituicao;
import com.calculadora.service.calculo.chain.Rediluicao;

import java.math.BigDecimal;

public class InfusaoDiluicaoStrategy implements DiluicaoStrategy {
    @Override
    public boolean supports(TipoDiluicao tipoDiluicao) {
        return TipoDiluicao.INFUSAO.equals(tipoDiluicao);
    }

    @Override
    public BigDecimal aplicarDiluicao(Configuracao configuracao, BigDecimal pesoCrianca) {
        Rediluicao rediluicao = new Rediluicao();
        Reconstituicao reconstituicao = new Reconstituicao(rediluicao);

        return reconstituicao.diluir(configuracao.getMedicamento().getValorApresentacao());
    }
}
