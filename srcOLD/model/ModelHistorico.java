package model;

import java.sql.Date;

/**
 *
 * @author cicero.ramos
 */
public class ModelHistorico {
    
    private int codigo;    // codigo historico
    private String nome; 
    private String cpf;
    private String rg;    
    private Date dataNascimento;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String complemento;
    private String telefone;
    private String celular;
    private String email;
    
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
    private String observacao_veiculo;
    private Date dataCompra;
    private String tipo;
    
    private String observacao_venda;
    private Date dataVenda;
    private String tipoNegociacao;
    private Float valorTotal;
    private Float desconto;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "ModelHistorico{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", complemento=" + complemento + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", placa=" + placa + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", chassi=" + chassi + ", renavam=" + renavam + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", combustivel=" + combustivel + ", kmRodados=" + kmRodados + ", motor=" + motor + ", custoAquisicao=" + custoAquisicao + ", valorVenda=" + valorVenda + ", observacao_veiculo=" + observacao_veiculo + ", dataCompra=" + dataCompra + ", observacao_venda=" + observacao_venda + ", dataVenda=" + dataVenda + ", tipoNegociacao=" + tipoNegociacao + ", valorTotal=" + valorTotal + ", desconto=" + desconto + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getObservacao_venda() {
        return observacao_venda;
    }

    public void setObservacao_venda(String observacao_venda) {
        this.observacao_venda = observacao_venda;
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
