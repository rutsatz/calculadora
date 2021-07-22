package com.calculadora.model;

import com.calculadora.model.enums.TipoDiluicao;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Configuracao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long codigo;

    private String nome;

    @NotNull(message = "Medicamento não cadastrado no sistema")
    @ManyToOne
    @JoinColumn(name = "codigo_medicamento")
    private Medicamento medicamento;

    @NotNull(message = "Tipo de diluição é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_diluicao")
    private TipoDiluicao tipoDiluicao;

    @Column(name = "valor_diluicao")
    private BigDecimal valorDiluicao;

    @Column(name = "valor_final_pos_diluicao")
    private BigDecimal valorFinalPosDiluicao;

    @Column(name = "concentracao_maxima_adm")
    private BigDecimal concentracaoMaximaAdm;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public TipoDiluicao getTipoDiluicao() {
        return tipoDiluicao;
    }

    public void setTipoDiluicao(TipoDiluicao tipoDiluicao) {
        this.tipoDiluicao = tipoDiluicao;
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

    public BigDecimal getConcentracaoMaximaAdm() {
        return concentracaoMaximaAdm;
    }

    public void setConcentracaoMaximaAdm(BigDecimal concentracaoMaximaAdm) {
        this.concentracaoMaximaAdm = concentracaoMaximaAdm;
    }
}
