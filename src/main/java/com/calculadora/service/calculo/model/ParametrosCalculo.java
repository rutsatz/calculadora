package com.calculadora.service.calculo.model;

import java.math.BigDecimal;

public class ParametrosCalculo {
    private BigDecimal dosagemPrescrita;
    private BigDecimal concentracoMaximaAdm;
    private BigDecimal valorAspirarado;
    private BigDecimal valorDiluicao;
    private BigDecimal valorFinalPosDiluicao;
    private BigDecimal medicamentoValorApresentacao;

    public BigDecimal getDosagemPrescrita() {
        return dosagemPrescrita;
    }

    public void setDosagemPrescrita(BigDecimal dosagemPrescrita) {
        this.dosagemPrescrita = dosagemPrescrita;
    }

    public BigDecimal getConcentracoMaximaAdm() {
        return concentracoMaximaAdm;
    }

    public void setConcentracoMaximaAdm(BigDecimal concentracoMaximaAdm) {
        this.concentracoMaximaAdm = concentracoMaximaAdm;
    }

    public BigDecimal getValorAspirarado() {
        return valorAspirarado;
    }

    public void setValorAspirarado(BigDecimal valorAspirarado) {
        this.valorAspirarado = valorAspirarado;
    }

    public BigDecimal getValorDiluicao() {
        return valorDiluicao;
    }

    public void setValorDiluicao(BigDecimal valorDiluicao) {
        this.valorDiluicao = valorDiluicao;
    }

    public BigDecimal getValorFinalPosDiluicao() {
        return valorFinalPosDiluicao;
    }

    public void setValorFinalPosDiluicao(BigDecimal valorFinalPosDiluicao) {
        this.valorFinalPosDiluicao = valorFinalPosDiluicao;
    }

    public BigDecimal getMedicamentoValorApresentacao() {
        return medicamentoValorApresentacao;
    }

    public void setMedicamentoValorApresentacao(BigDecimal medicamentoValorApresentacao) {
        this.medicamentoValorApresentacao = medicamentoValorApresentacao;
    }
}
