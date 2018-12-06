package model;

import java.util.ArrayList;

/**
 *
 * @author cicero.ramos
 */
public class ModelOpcionais {

    private int codigo;
    private int codigoVeiculo;
    private String opcionais;
    private ArrayList<ModelOpcionais> listaModelOpcionaisVeiculo;

    public ArrayList<ModelOpcionais> getListaModelOpcionaisVeiculo() {
        return listaModelOpcionaisVeiculo;
    }

    public void setListaModelOpcionaisVeiculo(ArrayList<ModelOpcionais> listaModelOpcionaisVeiculo) {
        this.listaModelOpcionaisVeiculo = listaModelOpcionaisVeiculo;
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

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    @Override
    public String toString() {
        return "ModelOpcionais{" + "codigo=" + codigo + ", codigoVeiculo=" + codigoVeiculo + ", opcionais=" + opcionais + '}';
    }
    
    
    
    
    
}
