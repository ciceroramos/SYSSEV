package model;

import java.sql.Date;

/**
 *
 * @author cicero.ramos
 */
public class ModelVendas {

    private int codigo;
    private int veiculoCodigo;
    private int clienteCodigo;
    private String observacao;
    private Date dataVenda;
    private String tipoNegociacao;
    private Float valorTotal;
    private Float desconto;

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
    private String observacao_veiculo;
    private Date dataCompra;
    private String tipo;
    
    

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

    public String getObservacao_veiculo() {
        return observacao_veiculo;
    }

    public void setObservacao_veiculo(String observacao_veiculo) {
        this.observacao_veiculo = observacao_veiculo;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ModelVendas{" + "codigo=" + codigo + ", veiculoCodigo=" + veiculoCodigo + ", clienteCodigo=" + clienteCodigo + ", observacao=" + observacao + ", dataVenda=" + dataVenda + ", tipoNegociacao=" + tipoNegociacao + ", valorTotal=" + valorTotal + ", desconto=" + desconto + ", placa=" + placa + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", chassi=" + chassi + ", renavam=" + renavam + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", combustivel=" + combustivel + ", kmRodados=" + kmRodados + ", motor=" + motor + ", observacao_veiculo=" + observacao_veiculo + ", dataCompra=" + dataCompra + ", tipo=" + tipo + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVeiculoCodigo() {
        return veiculoCodigo;
    }

    public void setVeiculoCodigo(int veiculoCodigo) {
        this.veiculoCodigo = veiculoCodigo;
    }

    public int getClienteCodigo() {
        return clienteCodigo;
    }

    public void setClienteCodigo(int clienteCodigo) {
        this.clienteCodigo = clienteCodigo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getTipoNegociacao() {
        return tipoNegociacao;
    }

    public void setTipoNegociacao(String tipoNegociacao) {
        this.tipoNegociacao = tipoNegociacao;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }

}
