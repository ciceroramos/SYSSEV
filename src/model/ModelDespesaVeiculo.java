package model;

/**
 *
 * @author cicero.ramos
 */
public class ModelDespesaVeiculo {

    private int codigo;
    private int codigoVeiculo;
    private Double limpeza;
    private Double mecanica;
    private Double funilaria;
    private Double revisao;
    private Double debitos;
    private Double outros;

    @Override
    public String toString() {
        return "ModelDespesaVeiculo{" + "codigo=" + codigo + ", codigoVeiculo=" + codigoVeiculo + ", limpeza=" + limpeza + ", mecanica=" + mecanica + ", funilaria=" + funilaria + ", revisao=" + revisao + ", debitos=" + debitos + ", outros=" + outros + '}';
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    
    
    
    
    
    
}
