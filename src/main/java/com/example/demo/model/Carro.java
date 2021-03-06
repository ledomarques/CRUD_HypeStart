package com.example.demo.model;

import com.example.demo.enums.TipoCarro;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@ApiModel("Create car")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Id number")
    private Long id;

    @NotBlank(message = "Informe a marca do carro!")
    @ApiModelProperty(value = "Car brand")
    private String marca;

    @NotBlank(message = "Informe o modelo do carro!")
    @ApiModelProperty(value = "Car model")
    private String modelo;

    @NotNull(message = "Informe o tipo do carro!")
    @Enumerated(EnumType.STRING)
    @ApiModelProperty(value = "Car type")
    private TipoCarro tipo;

    @NotNull(message = "Informe o ano de fabricação!")
    @Size(min=4, max=4)
    @ApiModelProperty(value = "Car manufacture year")
    private Integer anoFabricacao;

    @NotNull(message = "Informe o ano do modelo!")
    @Size(min=4, max=4)
    @ApiModelProperty(value = "Car model year")
    private Integer anoModelo;

    @NotNull(message = "Informe o valor do carro!")
    @ApiModelProperty(value = "Car price")
    private double preco;

    @NotNull(message = "Informe a quantidade em estoque!")
    @ApiModelProperty(value = "Car quantity")
    private Integer quantidade;

    public Carro(String marca, String modelo, TipoCarro tipo, Integer anoFabricacao, Integer anoModelo, double preco, Integer quantidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Carro() {
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoCarro getTipo() {
        return tipo;
    }

    public double getPreco() { return preco; }

    public Integer getQuantidade() { return quantidade; }

    public Integer getAnoFabricacao() { return anoFabricacao; }

    public Integer getAnoModelo() { return anoModelo; }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(TipoCarro tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) { this.preco = preco; }

    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public void setAnoFabricacao(Integer anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    public void setAnoModelo(Integer anoModelo) { this.anoModelo = anoModelo; }
}