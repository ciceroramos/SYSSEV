package controller;

import DAO.DAOVenda;
import java.util.ArrayList;
import model.ModelVendas;
import relatorios.DAORelatorios;

/**
 *
 * @author cicero.ramos
 */
public class ControllerVenda {
    
    private DAOVenda daoVenda = new DAOVenda();
    private DAORelatorios dAORelatorios = new DAORelatorios();
    
    public int salvarVendasController(ModelVendas pModelVendas) {
        return this.daoVenda.salvarVendasDAO(pModelVendas);
    }
    
    public ModelVendas getVendasController(int pCodigo) {
        return this.daoVenda.getVendasDAO(pCodigo);
    }

    public ArrayList<ModelVendas> getListaVendasController() {
        return this.daoVenda.getListaVendasDAO();
    }
    
    public boolean excluirVendasController(int pCodigo) {
        return this.daoVenda.excluirVendasDAO(pCodigo);
    }
    
    public boolean veiculoIndisponivelController(int pCodigo) {
        return this.daoVenda.veiculoIndisponivelDAO(pCodigo);
    }
    
    public boolean atualizarVendasController(ModelVendas pModelVendas) {
        return this.daoVenda.atualizarVendasDAO(pModelVendas);
    }
    
    public boolean gerarRelatorioVendaIndividual(int pCodigo) {
        return this.dAORelatorios.gerarRelatorioVendaIndividual(pCodigo);
    }
    
    public boolean gerarRelatorioVendaImpressao(int pCodigo) {
        return this.dAORelatorios.gerarRelatorioVendaImpressao(pCodigo);
    }
    
    public boolean gerarRelatorioVendaIndividualEmail(int pCodigo) {
        return this.dAORelatorios.gerarRelatorioVendaIndividualEmail(pCodigo);
    }
    
}
