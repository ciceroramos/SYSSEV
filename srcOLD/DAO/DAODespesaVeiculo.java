package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelDespesaVeiculo;

/**
 *
 * @author cicero.ramos
 */
public class DAODespesaVeiculo  extends ConexaoMySql{
    
    public int salvarDespesaVeiculoDAO(ModelDespesaVeiculo pModelDespesaVeiculo){
        try {
            this.conectar();
            return this.insertSQL(
                 "INSERT INTO tbdespesa_veiculo("
                    + "codigo, "
                    + "codigo_veiculo, "
                    + "limpesa, "
                    + "mecanica, "
                    + "funilaria, "
                    + "revisao, "
                    + "debitos, "
                    + "outros "
                + ") VALUES ("
                    + "'" + pModelDespesaVeiculo.getCodigo() + "',"
                    + "'" + pModelDespesaVeiculo.getCodigoVeiculo()+ "',"
                    + "'" + pModelDespesaVeiculo.getLimpeza() + "',"
                    + "'" + pModelDespesaVeiculo.getMecanica() + "',"
                    + "'" + pModelDespesaVeiculo.getFunilaria()+ "',"
                    + "'" + pModelDespesaVeiculo.getRevisao()+ "',"
                    + "'" + pModelDespesaVeiculo.getDebitos()+ "',"
                    + "'" + pModelDespesaVeiculo.getOutros()+ "'"
                + ");"
            );    
            
         }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }

    }
    
    public ModelDespesaVeiculo getDespesaVeiculoDAO (int pCodigo){
        ModelDespesaVeiculo modelDespesaVeiculo = new ModelDespesaVeiculo();
        try {
            this.conectar();
            this.executarSQL(
               "SELECT "
                   + "codigo, "
                    + "codigo_veiculo, "
                    + "limpesa, "
                    + "mecanica, "
                    + "funilaria, "
                    + "revisao, "
                    + "debitos, "
                    + "outros " 
                + " FROM"
                     + " tbdespesa_veiculo"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"    
            
            );
            
            while (this.getResultSet().next()) {
                modelDespesaVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelDespesaVeiculo.setCodigoVeiculo(this.getResultSet().getInt(2));
                modelDespesaVeiculo.setLimpeza(this.getResultSet().getDouble(3));
                modelDespesaVeiculo.setMecanica(this.getResultSet().getDouble(4));
                modelDespesaVeiculo.setFunilaria(this.getResultSet().getDouble(5));
                modelDespesaVeiculo.setRevisao(this.getResultSet().getDouble(6));
                modelDespesaVeiculo.setDebitos(this.getResultSet().getDouble(7));
                modelDespesaVeiculo.setOutros(this.getResultSet().getDouble(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelDespesaVeiculo;

    }
    
    public ArrayList<ModelDespesaVeiculo> getListaDespesaVeiculoDAO(){
        ArrayList<ModelDespesaVeiculo> listamodelDespesaVaiculo =new ArrayList();
        ModelDespesaVeiculo modelDespesaVeiculo = new ModelDespesaVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                 "SELECT "
                   + "codigo, "
                    + "codigo_veiculo, "
                    + "limpesa, "
                    + "mecanica, "
                    + "funilaria, "
                    + "revisao, "
                    + "debitos, "
                    + "outros " 
                + " FROM"
                     + " tbdespesa_veiculo"
                + ";"    
            );
            
            while (this.getResultSet().next()) {
                modelDespesaVeiculo = new ModelDespesaVeiculo();
                modelDespesaVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelDespesaVeiculo.setCodigoVeiculo(this.getResultSet().getInt(2));
                modelDespesaVeiculo.setLimpeza(this.getResultSet().getDouble(3));
                modelDespesaVeiculo.setMecanica(this.getResultSet().getDouble(4));
                modelDespesaVeiculo.setFunilaria(this.getResultSet().getDouble(5));
                modelDespesaVeiculo.setRevisao(this.getResultSet().getDouble(6));
                modelDespesaVeiculo.setDebitos(this.getResultSet().getDouble(7));
                modelDespesaVeiculo.setOutros(this.getResultSet().getDouble(8));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelDespesaVaiculo;
        
        
        
    }
    
    public ArrayList<ModelDespesaVeiculo> getListaDespesaVeiculoCodDAO(int pCodigo){
        ArrayList<ModelDespesaVeiculo> listamodelDespesaVaiculo =new ArrayList();
        ModelDespesaVeiculo modelDespesaVeiculo = new ModelDespesaVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                 "SELECT "
                   + "codigo, "
                    + "codigo_veiculo, "
                    + "limpesa, "
                    + "mecanica, "
                    + "funilaria, "
                    + "revisao, "
                    + "debitos, "
                    + "outros " 
               + " FROM"
                     + " tbdespesa_veiculo"
                 + " WHERE"
                     + " codigo_veiculo = '" + pCodigo + "'"
                + ";"    
            );
            
            while (this.getResultSet().next()) {
                modelDespesaVeiculo = new ModelDespesaVeiculo();
                modelDespesaVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelDespesaVeiculo.setCodigoVeiculo(this.getResultSet().getInt(2));
                modelDespesaVeiculo.setLimpeza(this.getResultSet().getDouble(3));
                modelDespesaVeiculo.setMecanica(this.getResultSet().getDouble(4));
                modelDespesaVeiculo.setFunilaria(this.getResultSet().getDouble(5));
                modelDespesaVeiculo.setRevisao(this.getResultSet().getDouble(6));
                modelDespesaVeiculo.setDebitos(this.getResultSet().getDouble(7));
                modelDespesaVeiculo.setOutros(this.getResultSet().getDouble(8));
                listamodelDespesaVaiculo.add(modelDespesaVeiculo);                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelDespesaVaiculo;
        
    }
    
    public boolean atualizarDespesaVeiculo (ModelDespesaVeiculo pModelDespesaVeiculo){
        try {
          this.conectar();
          return this.executarUpdateDeleteSQL(
                "UPDATE tbdespesa_veiculo SET "  
                   + "codigo = '" + pModelDespesaVeiculo.getCodigo() + "',"
                   + "codigo_veiculo = '" + pModelDespesaVeiculo.getCodigoVeiculo()+ "',"
                   + "limpeza = '" + pModelDespesaVeiculo.getLimpeza()+ "',"
                   + "mecanica = '" + pModelDespesaVeiculo.getMecanica()+ "',"
                   + "funilaria = '" + pModelDespesaVeiculo.getFunilaria()+ "',"
                   + "revisao = '" + pModelDespesaVeiculo.getRevisao()+ "',"
                   + "debitos = '" + pModelDespesaVeiculo.getDebitos()+ "',"
                   + "outros = '" + pModelDespesaVeiculo.getOutros()+ "'"
                + " WHERE "
                    + "codigo = '" + pModelDespesaVeiculo.getCodigo() + "'"
                + ";"  
          
          );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public boolean excluirDespesaVeiculoDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbdespesa_veiculo "
                + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
    
    public ArrayList<ModelDespesaVeiculo> getListaDespesaVeiculoDAO(int pCodigoVeiculo){
        ArrayList<ModelDespesaVeiculo> listamodelDespesaVaiculo =new ArrayList();
        ModelDespesaVeiculo modelDespesaVeiculo = new ModelDespesaVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                 "SELECT "
                   + "codigo, "
                    + "codigo_veiculo, "
                    + "limpesa, "
                    + "mecanica, "
                    + "funilaria, "
                    + "revisao, "
                    + "debitos, "
                    + "outros " 
               + " FROM"
                     + " tbdespesa_veiculo"
                 + " WHERE"
                     + " codigo_veiculo = '" + pCodigoVeiculo + "'"
                + ";"    
            );
            
            while (this.getResultSet().next()) {
                modelDespesaVeiculo = new ModelDespesaVeiculo();
                modelDespesaVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelDespesaVeiculo.setCodigoVeiculo(this.getResultSet().getInt(2));
                modelDespesaVeiculo.setLimpeza(this.getResultSet().getDouble(3));
                modelDespesaVeiculo.setMecanica(this.getResultSet().getDouble(4));
                modelDespesaVeiculo.setFunilaria(this.getResultSet().getDouble(5));
                modelDespesaVeiculo.setRevisao(this.getResultSet().getDouble(6));
                modelDespesaVeiculo.setDebitos(this.getResultSet().getDouble(7));
                modelDespesaVeiculo.setOutros(this.getResultSet().getDouble(8));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelDespesaVaiculo;
        
    }
    
}
