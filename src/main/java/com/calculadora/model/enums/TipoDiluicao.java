package com.calculadora.model.enums;

public enum TipoDiluicao {
    PRONTO("Pronto para uso"),
    INFUSAO("Infusão");

    private final String nome;

    TipoDiluicao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
