package controller;

import DAO.DAOHistorico;
import model.ModelHistorico;

/**
 *
 * @author cicero.ramos
 */
public class ControllerHistorico {
    
   private DAOHistorico daoHistorico = new DAOHistorico();
    
  public int salvarVendasController(ModelHistorico pModelHistorico) {
        return this.daoHistorico.salvarVendasDAO(pModelHistorico);
    }  
    
}
