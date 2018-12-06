package DAO;

/**
 *
 * @author Cícero
 */

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelAutoInfo;

public class DAOInfoAuto extends ConexaoMySql {
 
    
  public ArrayList<ModelAutoInfo> getListaInfoAutoDAO(){
        ArrayList<ModelAutoInfo> listamodelInfo = new ArrayList();
        ModelAutoInfo modelInfo = new ModelAutoInfo();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo, "
                    + "marca_carro, "
                    + "marca_moto, "
                    + "motor_carro, "
                    + "motor_moto "
                 + " FROM"
                     + " tbinfoauto"
                 + " order by marca_carro asc "       
                + ";"
            );

            while(this.getResultSet().next()){
                modelInfo = new ModelAutoInfo();
                modelInfo.setCodigo(this.getResultSet().getInt(1));
                modelInfo.setMarca_carro(this.getResultSet().getString(2));
                modelInfo.setMarca_moto(this.getResultSet().getString(3));
                modelInfo.setMotor_carro(this.getResultSet().getString(4));
                modelInfo.setMotor_moto(this.getResultSet().getString(5));
                listamodelInfo.add(modelInfo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelInfo;
    }  
    
}
