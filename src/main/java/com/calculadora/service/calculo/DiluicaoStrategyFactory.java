package com.calculadora.service.calculo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DiluicaoStrategyFactory {

    private final List<DiluicaoStrategy> strategies;

    public DiluicaoStrategyFactory(List<DiluicaoStrategy> strategies) {
        this.strategies = strategies;
    }

    public List<DiluicaoStrategy> getStrategies() {
        return strategies;
    }

}
