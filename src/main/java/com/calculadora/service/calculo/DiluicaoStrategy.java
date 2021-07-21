package com.calculadora.service.calculo;

import com.calculadora.model.Configuracao;
import com.calculadora.model.enums.TipoDiluicao;

import java.math.BigDecimal;

public interface DiluicaoStrategy {

    boolean supports(TipoDiluicao tipoDiluicao);

    BigDecimal aplicarDiluicao(Configuracao configuracao, BigDecimal pesoCrianca);

}
