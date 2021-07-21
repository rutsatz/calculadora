package com.calculadora.controller;

import com.calculadora.controller.dto.ParametrosDTO;
import com.calculadora.service.CalculoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;

@RestController
@RequestMapping("/calculos")
public class CalculoController {

    private final CalculoService calculoService;

    public CalculoController(CalculoService calculoService) {
        this.calculoService = calculoService;
    }

    @Operation(summary = "Criar um novo cálculo")
    @PostMapping
    public BigDecimal novo(@Valid @RequestBody ParametrosDTO parametrosDTO) {
        return calculoService.calcular(parametrosDTO);
    }


}
