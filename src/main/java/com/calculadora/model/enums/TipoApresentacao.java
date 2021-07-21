package com.calculadora.model.enums;

public enum TipoApresentacao {
    FRASCO("FR", "Frasco"),
    AMPOLA("AM", "Ampola");

    private final String sigla;
    private final String nome;

    TipoApresentacao(String sigla, String nome) {
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
