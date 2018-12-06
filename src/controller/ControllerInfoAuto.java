package controller;

import DAO.DAOInfoAuto;
import java.util.ArrayList;
import model.ModelAutoInfo;

/**
 *
 * @author Cícero
 */
public class ControllerInfoAuto {

    
private DAOInfoAuto daoInfoAuto = new DAOInfoAuto();
    
 public ArrayList<ModelAutoInfo> getListaInfoAutoController(){
        return this.daoInfoAuto.getListaInfoAutoDAO();
    }

    
}
