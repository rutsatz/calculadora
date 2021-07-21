package com.calculadora.model.enums;

public enum TipoUnidade {
    MILILITRO("ml", "Mililitro"),
    MILIGRAMA("mg", "Miligrama");

    private final String sigla;
    private final String nome;

    TipoUnidade(String sigla, String nome) {
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
