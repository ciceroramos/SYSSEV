package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author cicero.ramos
 */
public class ModelVeiculo {

    private int codigo;
    private String placa;
    private String anoFabricacao;
    private String anoModelo;
    private String chassi;
    private String renavam;
    private String marca;
    private String modelo;
    private String cor;
    private String combustivel;
    private String kmRodados;
    private String motor;
    private Double custoAquisicao;
    private Double valorVenda;
    private String observacao;
    private Date dataCompra;
    private String situacao;
    private String tipo;

    private int codigoVeiculo;
    private Double limpeza;
    private Double mecanica;
    private Double funilaria;
    private Double revisao;
    private Double debitos;
    private Double outros;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public Double getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(Double limpeza) {
        this.limpeza = limpeza;
    }

    public Double getMecanica() {
        return mecanica;
    }

    public void setMecanica(Double mecanica) {
        this.mecanica = mecanica;
    }

    public Double getFunilaria() {
        return funilaria;
    }

    public void setFunilaria(Double funilaria) {
        this.funilaria = funilaria;
    }

    public Double getRevisao() {
        return revisao;
    }

    public void setRevisao(Double revisao) {
        this.revisao = revisao;
    }

    public Double getDebitos() {
        return debitos;
    }

    public void setDebitos(Double debitos) {
        this.debitos = debitos;
    }

    public Double getOutros() {
        return outros;
    }

    public void setOutros(Double outros) {
        this.outros = outros;
    }

    @Override
    public String toString() {
        return "ModelVeiculo{" + "codigo=" + codigo + ", placa=" + placa + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", chassi=" + chassi + ", renavam=" + renavam + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", combustivel=" + combustivel + ", kmRodados=" + kmRodados + ", motor=" + motor + ", custoAquisicao=" + custoAquisicao + ", valorVenda=" + valorVenda + ", observacao=" + observacao + ", dataCompra=" + dataCompra + ", situacao=" + situacao + ", tipo=" + tipo + ", codigoVeiculo=" + codigoVeiculo + ", limpeza=" + limpeza + ", mecanica=" + mecanica + ", funilaria=" + funilaria + ", revisao=" + revisao + ", debitos=" + debitos + ", outros=" + outros + '}';
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(String kmRodados) {
        this.kmRodados = kmRodados;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Double getCustoAquisicao() {
        return custoAquisicao;
    }

    public void setCustoAquisicao(Double custoAquisicao) {
        this.custoAquisicao = custoAquisicao;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

}
