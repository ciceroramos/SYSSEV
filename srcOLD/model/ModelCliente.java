package model;

import java.sql.Date;

public class ModelCliente {

    private int codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String cpf;
    private String rg;    
    private String observacao;
    private String email;
    private Date dataNascimento;
    private String telefone;
    private String celular;
    private String complemento;
    
    
    @Override
    public String toString() {
        return "ModelCliente{" + "codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", cpf=" + cpf + ", rg=" + rg + ", observacao=" + observacao + ", email=" + email + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + ", celular=" + celular + ", complemento=" + complemento + '}';
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de codigo
    * @param pCodigo
    */
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    /**
    * return codigo
    */
    public int getCodigo(){
        return this.codigo;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de endereco
    * @param pEndereco
    */
    public void setEndereco(String pEndereco){
        this.endereco = pEndereco;
    }
    /**
    * return endereco
    */
    public String getEndereco(){
        return this.endereco;
    }

    /**
    * seta o valor de bairro
    * @param pBairro
    */
    public void setBairro(String pBairro){
        this.bairro = pBairro;
    }
    /**
    * return bairro
    */
    public String getBairro(){
        return this.bairro;
    }

    /**
    * seta o valor de cep
    * @param pCep
    */
    public void setCep(String pCep){
        this.cep = pCep;
    }
    /**
    * return cep
    */
    public String getCep(){
        return this.cep;
    }

  

    /**
    * seta o valor de telefone
    * @param pTelefone
    */
    public void setTelefone(String pTelefone){
        this.telefone = pTelefone;
    }
    /**
    * return telefone
    */
    public String getTelefone(){
        return this.telefone;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    /**
    * @return email
    */
    public String getEmail() {
        return email;
    }
    
    /**
    * seta o valor de email
    * @param pEmail
    */
    public void setEmail(String pEmail) {
        this.email = pEmail;
    }
    
    
    
  
    
}