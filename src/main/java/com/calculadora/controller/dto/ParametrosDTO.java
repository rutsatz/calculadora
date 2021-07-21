package com.calculadora.controller.dto;

import java.math.BigDecimal;

public class ParametrosDTO {

    private BigDecimal dosagemPrescrita;

    private BigDecimal pesoCrianca;

    private Long configuracaoId;

    public BigDecimal getDosagemPrescrita() {
        return dosagemPrescrita;
    }

    public void setDosagemPrescrita(BigDecimal dosagemPrescrita) {
        this.dosagemPrescrita = dosagemPrescrita;
    }

    public BigDecimal getPesoCrianca() {
        return pesoCrianca;
    }

    public void setPesoCrianca(BigDecimal pesoCrianca) {
        this.pesoCrianca = pesoCrianca;
    }

    public Long getConfiguracaoId() {
        return configuracaoId;
    }

    public void setConfiguracaoId(Long configuracaoId) {
        this.configuracaoId = configuracaoId;
    }
}
