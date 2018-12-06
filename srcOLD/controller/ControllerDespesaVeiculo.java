package controller;

import DAO.DAODespesaVeiculo;
import java.util.ArrayList;
import model.ModelDespesaVeiculo;

/**
 *
 * @author cicero.ramos
 */
public class ControllerDespesaVeiculo {

   private DAODespesaVeiculo daoDespesaVeiculo = new DAODespesaVeiculo();
   
   public int salvarDespezaVeiculoController (ModelDespesaVeiculo pModelDespesaVeiculo){
       return this.daoDespesaVeiculo.salvarDespesaVeiculoDAO(pModelDespesaVeiculo);
   }
   
   public ModelDespesaVeiculo getDespesaVeiculoController (int pCodigo){
       return this.daoDespesaVeiculo.getDespesaVeiculoDAO(pCodigo);
   }
    
   public ArrayList<ModelDespesaVeiculo> getListaDespesaVeiculoController(){
       return this.daoDespesaVeiculo.getListaDespesaVeiculoDAO();
       
   }

   public boolean atualizarDespesaVeiculoController(ModelDespesaVeiculo pModelDespesaVeiculo){
       return this.daoDespesaVeiculo.atualizarDespesaVeiculo(pModelDespesaVeiculo);
   }
   
   public boolean excluirDespesaVeiculoController (int pCodigo){
       return this.daoDespesaVeiculo.excluirDespesaVeiculoDAO(pCodigo);
   } 
   
   public ArrayList<ModelDespesaVeiculo> getListaDespesaVeiculoController(int pCodigoVeiculo){
       return this.daoDespesaVeiculo.getListaDespesaVeiculoDAO(pCodigoVeiculo);
       
   }
   
   public ArrayList<ModelDespesaVeiculo> getListaDespesaVeiculoCodController(int pCodigoVeiculo){
       return this.daoDespesaVeiculo.getListaDespesaVeiculoCodDAO(pCodigoVeiculo);
       
   }
   
}
