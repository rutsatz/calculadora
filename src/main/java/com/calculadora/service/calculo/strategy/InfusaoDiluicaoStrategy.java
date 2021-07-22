package com.calculadora.service.calculo.strategy;

import com.calculadora.model.Configuracao;
import com.calculadora.model.enums.TipoDiluicao;
import com.calculadora.service.calculo.DiluicaoStrategy;
import com.calculadora.service.calculo.chain.Reconstituicao;
import com.calculadora.service.calculo.chain.Rediluicao;
import com.calculadora.service.calculo.model.ParametrosCalculo;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class InfusaoDiluicaoStrategy implements DiluicaoStrategy {
    @Override
    public boolean supports(TipoDiluicao tipoDiluicao) {
        return TipoDiluicao.INFUSAO.equals(tipoDiluicao);
    }

    @Override
    public BigDecimal aplicarDiluicao(Configuracao configuracao, BigDecimal pesoCrianca, BigDecimal dosagemPrescrita) {
        //como esse será o proximo ele é a diluição 2
        Rediluicao rediluicao = new Rediluicao();
        //diluição 1
        Reconstituicao reconstituicao = new Reconstituicao(rediluicao);

        ParametrosCalculo parametrosCalculo = new ParametrosCalculo();
        parametrosCalculo.setDosagemPrescrita(dosagemPrescrita);
        parametrosCalculo.setConcentracoMaximaAdm(configuracao.getConcentracaoMaximaAdm());
        parametrosCalculo.setValorFinalPosDiluicao(configuracao.getValorFinalPosDiluicao());
        parametrosCalculo.setValorDiluicao(configuracao.getValorDiluicao());
        parametrosCalculo.setMedicamentoValorApresentacao(configuracao.getMedicamento().getValorApresentacao());

        BigDecimal valorFinal = reconstituicao.diluir(parametrosCalculo);

        //aqui retorna o valor final
        return valorFinal;
    }
}
