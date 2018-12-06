package controller;

import DAO.DAOVeiculo;
import java.util.ArrayList;
import model.ModelVeiculo;
import relatorios.DAORelatorios;

/**
 *
 * @author cicero.ramos
 */
public class ControllerVeiculo {

    private DAOVeiculo daoVeiculo = new DAOVeiculo();
    private DAORelatorios DAORelatorios = new DAORelatorios();

    public int salvarVeiculoController(ModelVeiculo pModelVeiculo) {
        return this.daoVeiculo.salvarVeiculoDAO(pModelVeiculo);
    }

    public ModelVeiculo getVeiculoCodController(int pCodigo) {
        return this.daoVeiculo.getVeiculoDAO(pCodigo);
    }

    public ModelVeiculo getVeiculoController(String pPlaca) {
        return this.daoVeiculo.getVeiculoDAO(pPlaca);

    }

    public ModelVeiculo getVeiculoModeloController(String pModelo) {
        return this.daoVeiculo.getVeiculoModeloDAO(pModelo);

    }
    
    public ArrayList<ModelVeiculo> getListaVeiculoController() {
        return this.daoVeiculo.getListVeiculoDAO();
    }

    public boolean atualizarVeiculoController(ModelVeiculo pModelVeiculo) {
        return this.daoVeiculo.atualizarVeiculoDAO(pModelVeiculo);
    }

    public boolean excluirVeiculoController(int pCodigo) {
        return this.daoVeiculo.excluirVeiculoDAO(pCodigo);
    }

    public ModelVeiculo getListaDespesaVeiculoController(int pCodigoVeiculo) {
        return this.daoVeiculo.getDespesaVeiculoDAO(pCodigoVeiculo);

    }

    public ArrayList<ModelVeiculo> getListaVeiculoDisponivelController() {
        return this.daoVeiculo.getListVeiculoDisponivelDAO();
    }
    
    public ArrayList<ModelVeiculo> getListaVeiculoIndisponivelController() {
        return this.daoVeiculo.getListVeiculoIndisponivelDAO();
    }

    public boolean salvarDespesasVeiculosController(ModelVeiculo pModelVeiculo) {
        return this.daoVeiculo.salvarDespesaVeiculoDAO(pModelVeiculo);
    }
    
    public boolean atualizarDespesaVeiculoController(ModelVeiculo pModelVeiculo){
       return this.daoVeiculo.atualizarDespesaVeiculo(pModelVeiculo);
   }
    
   public ArrayList<ModelVeiculo> getListaVeiculoDespesaController(int pCodigo ) {
        return this.daoVeiculo.getListaDespesaVeiculoCodDAO(pCodigo);
    }
   
   public boolean gerarRelatorioVeiculoIndividual(int pModelVeiculo) {
        return this.DAORelatorios.gerarRelatorioVeiculoIndividual(pModelVeiculo);
    }
   
   public boolean gerarRelatorioTotalVeiculos() {
        return this.DAORelatorios.gerarRelatorioTotalVeiculos();
    }
    
}
