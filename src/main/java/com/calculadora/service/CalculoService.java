package com.calculadora.service;

import com.calculadora.controller.dto.ParametrosDTO;
import com.calculadora.model.Configuracao;
import com.calculadora.repository.ConfiguracaoRepository;
import com.calculadora.service.calculo.DiluicaoStrategy;
import com.calculadora.service.calculo.DiluicaoStrategyFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.util.List;

@Service
public class CalculoService {

    private final DiluicaoStrategyFactory factory;
    private final ConfiguracaoRepository configuracaoRepository;

    public CalculoService(DiluicaoStrategyFactory factory, ConfiguracaoRepository configuracaoRepository) {
        this.factory = factory;
        this.configuracaoRepository = configuracaoRepository;
    }

    public BigDecimal calcular(ParametrosDTO parametrosDTO) {
        List<DiluicaoStrategy> strategyList = factory.getStrategies();

        BigDecimal resultado = BigDecimal.ZERO;

        Configuracao configuracao = configuracaoRepository.findById(parametrosDTO.getConfiguracaoId())
                .orElseThrow(() -> new EntityNotFoundException("Configuração não encontrada"));

        for (DiluicaoStrategy diluicaoStrategy : strategyList) {
            if (diluicaoStrategy.supports(configuracao.getTipoDiluicao())) {
                BigDecimal diluicao = diluicaoStrategy.aplicarDiluicao(configuracao, parametrosDTO.getPesoCrianca());
                resultado = resultado.add(diluicao);
            }
        }

        return resultado;
    }

}
