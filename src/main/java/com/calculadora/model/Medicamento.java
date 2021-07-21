package com.calculadora.model;

import com.calculadora.model.enums.TipoApresentacao;
import com.calculadora.model.enums.TipoUnidade;
import com.calculadora.model.enums.TipoViaAdministracao;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long codigo;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotNull(message = "Marca não cadastrada no sistema")
    @ManyToOne
    @JoinColumn(name = "codigo_marca")
    private Marca marca;

    @NotNull(message = "Tipo de apresentação é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_apresentacao")
    private TipoApresentacao tipoApresentacao;

    @NotNull(message = "O valor da apresentação obrigatório")
    @Column(name = "valor_apresentacao")
    private BigDecimal valorApresentacao;

    @NotNull(message = "Tipo de via de adminitração é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_via_administracao")
    private TipoViaAdministracao tipoViaAdministracao;

    @NotNull(message = "Tipo de unidade é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_unidade")
    private TipoUnidade tipoUnidade;

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

    public TipoApresentacao getTipoApresentacao() {
        return tipoApresentacao;
    }

    public void setTipoApresentacao(TipoApresentacao tipoApresentacao) {
        this.tipoApresentacao = tipoApresentacao;
    }

    public BigDecimal getValorApresentacao() {
        return valorApresentacao;
    }

    public void setValorApresentacao(BigDecimal valorApresentacao) {
        this.valorApresentacao = valorApresentacao;
    }

    public TipoViaAdministracao getTipoViaAdministracao() {
        return tipoViaAdministracao;
    }

    public void setTipoViaAdministracao(TipoViaAdministracao tipoViaAdministracao) {
        this.tipoViaAdministracao = tipoViaAdministracao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public TipoUnidade getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(TipoUnidade tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }
}
