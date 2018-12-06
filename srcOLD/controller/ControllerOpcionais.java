package controller;

import DAO.DAOOpcionais;
import java.util.ArrayList;
import model.ModelOpcionais;

/**
 *
 * @author cicero.ramos
 */
public class ControllerOpcionais {

    private DAOOpcionais daoOpcionais = new DAOOpcionais();
    
    public int salvarOpcionaisVeiculosController(ModelOpcionais pModelOpcionais){
        return this.daoOpcionais.salvarOpcionais(pModelOpcionais);
    }
   
    public ArrayList<ModelOpcionais> getListaOpcionaisController(){
        return this.daoOpcionais.getListaOpcionaisDAO();
    }
    
    public ArrayList<ModelOpcionais> getListaOpcionaisCodVController(int pCodVeiculo){
        return this.daoOpcionais.getListaOpcionaisVeiculo(pCodVeiculo);
    }
    
    public boolean atualizarOpcionaisController(ModelOpcionais pModelOpcionais){
        return this.daoOpcionais.atualizarOpcionaisDAO(pModelOpcionais);
    }
    
    public boolean excluirOpcionaisController(int pCodigo){
        return this.daoOpcionais.excluirOpcionaisDAO(pCodigo);
    }
    
}
