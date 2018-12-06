
package controller;

import DAO.DAOValidaSistema;
import java.sql.Date;
import java.util.ArrayList;
import model.ModelValidaSistema;

/**
 *
 * @author cicero.ramos
 */
public class ControllerValidaSistema {
    
    private DAOValidaSistema daoValidaSistema = new DAOValidaSistema();
    
    /**
    * grava valida sistema
    * @param pModelValidaSistema
    * return int
    */
    
    
public int salvarValidaSistemaController(ModelValidaSistema pModelValidaSistema){
        return this.daoValidaSistema.salvarValidaSistemaDAO(pModelValidaSistema);
    }

public ArrayList<ModelValidaSistema> getValidaSistema(){
    
    return this.daoValidaSistema.getVerificaValidadeDAO();
    
}
    
}
