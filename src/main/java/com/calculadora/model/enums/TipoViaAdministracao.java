package com.calculadora.model.enums;

public enum TipoViaAdministracao {

    INTRAMUSCULAR("IM", "Intramuscular"),
    INTRAVENOSO("IV", "Intravenoso");

    private final String sigla;
    private final String nome;

    TipoViaAdministracao(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

}
