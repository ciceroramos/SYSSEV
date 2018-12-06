package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;
import relatorios.DAORelatorios;


public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();
    private DAORelatorios dAORelatorios = new DAORelatorios();

    /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pCodigo
    * return ModelCliente
    * 
    */
    public ModelCliente getClienteController(int pCodigo){
        return this.daoCliente.getClienteDAO(pCodigo);
    }
    
    /**
    * recupera Cliente
    * @param pNome
    * return ModelCliente
    */
    public ModelCliente getClienteController(String pNome){
        return this.daoCliente.getClienteDAO(pNome);
    }

    /**
    * recupera uma lista deCliente
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }
    
    public ArrayList<ModelCliente> getListaClientePDVController(){
        return this.daoCliente.getListaClientePDVDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pCodigo
    * return boolean
    */
    public boolean excluirClienteController(int pCodigo){
        return this.daoCliente.excluirClienteDAO(pCodigo);
    }

    public boolean gerarRelatorioCliente() {
        return this.dAORelatorios.gerarRelatorioCliente();
    }
    
    public boolean exportarCliente() {
        return this.dAORelatorios.exportarCliente();
    }
    
    public boolean gerarRelatorioClienteIndividual(int pCodigoCliente) {
        return this.dAORelatorios.gerarRelatorioClienteIndividual(pCodigoCliente);
    }
    
}