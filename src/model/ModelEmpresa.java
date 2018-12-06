package model;

public class ModelEmpresa {

    private int codigo;
    private String razaoSocial;
    private String nomeFantasia;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String cnpj;
    private String cpf;
    private String contrato;
    private String email;
    private String caminhoLogo;
    private String senhaEmail;

    public String getSenhaEmail() {
        return senhaEmail;
    }

    public void setSenhaEmail(String senhaEmail) {
        this.senhaEmail = senhaEmail;
    }

    public String getCaminhoLogo() {
        return caminhoLogo;
    }

    public void setCaminhoLogo(String caminhoLogo) {
        this.caminhoLogo = caminhoLogo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Construtor
     */
    public ModelEmpresa() {
    }

    /**
     * seta o valor de codigo
     *
     * @param pCodigo
     */
    public void setCodigo(int pCodigo) {
        this.codigo = pCodigo;
    }

    /**
     * return codigo
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * seta o valor de razaoSocial
     *
     * @param pRazaoSocial
     */
    public void setRazaoSocial(String pRazaoSocial) {
        this.razaoSocial = pRazaoSocial;
    }

    /**
     * return razaoSocial
     */
    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    /**
     * seta o valor de nomeFantasia
     *
     * @param pNomeFantasia
     */
    public void setNomeFantasia(String pNomeFantasia) {
        this.nomeFantasia = pNomeFantasia;
    }

    /**
     * return nomeFantasia
     */
    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    /**
     * seta o valor de endereco
     *
     * @param pEndereco
     */
    public void setEndereco(String pEndereco) {
        this.endereco = pEndereco;
    }

    /**
     * return endereco
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * seta o valor de bairro
     *
     * @param pBairro
     */
    public void setBairro(String pBairro) {
        this.bairro = pBairro;
    }

    /**
     * return bairro
     */
    public String getBairro() {
        return this.bairro;
    }

    /**
     * seta o valor de cidade
     *
     * @param pCodCidade
     */
    public void setCidade(String pCidade) {
        this.cidade = pCidade;
    }

    /**
     * return cidade
     */
    public String getCidade() {
        return this.cidade;
    }

    /**
     * seta o valor de codEstado
     *
     * @param pCodEstado
     */
    public void setEstado(String pEstado) {
        this.estado = pEstado;
    }

    /**
     * return codEstado
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * seta o valor de cep
     *
     * @param pCep
     */
    public void setCep(String pCep) {
        this.cep = pCep;
    }

    /**
     * return cep
     */
    public String getCep() {
        return this.cep;
    }

    /**
     * seta o valor de telefone
     *
     * @param pTelefone
     */
    public void setTelefone(String pTelefone) {
        this.telefone = pTelefone;
    }

    /**
     * return telefone
     */
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "ModelEmpresa{" + "codigo=" + codigo + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", telefone=" + telefone + ", cnpj=" + cnpj + ", cpf=" + cpf + ", contrato=" + contrato + ", email=" + email + ", caminhoLogo=" + caminhoLogo + ", senhaEmail=" + senhaEmail + '}';
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

}
