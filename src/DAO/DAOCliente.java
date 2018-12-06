package DAO;

import conexoes.ConexaoMySql;
import model.ModelCliente;
import java.util.ArrayList;

//DAOCLIENTE
public class DAOCliente extends ConexaoMySql {

    /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbcliente ("
                    + "nome,"
                    + "cpf,"
                    + "rg,"
                    + "data_nascimento,"
                    + "endereco,"
                    + "bairro,"
                    + "cep,"
                    + "cidade,"
                    + "estado,"
                    + "complemento,"
                    + "telefone,"    
                    + "celular,"
                    + "observacao, "
                    + "email "                    
                + ") VALUES ("
                    + "'" + pModelCliente.getNome() + "',"
                    + "'" + pModelCliente.getCpf()+ "',"
                    + "'" + pModelCliente.getRg()+ "',"
                    + "'" + pModelCliente.getDataNascimento()+"',"
                    + "'" + pModelCliente.getEndereco() + "',"
                    + "'" + pModelCliente.getBairro() + "',"
                    + "'" + pModelCliente.getCep() + "',"
                    + "'" + pModelCliente.getCidade() + "',"
                    + "'" + pModelCliente.getEstado() + "',"
                    + "'" + pModelCliente.getComplemento()+ "',"
                    + "'" + pModelCliente.getTelefone() + "',"
                    + "'" + pModelCliente.getCelular()+"',"    
                    + "'" + pModelCliente.getObservacao()+ "',"
                    + "'" + pModelCliente.getEmail()+ "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Cliente
    * @param pCodigo
    * return ModelCliente
    */
    public ModelCliente getClienteDAO(int pCodigo){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "cpf,"
                    + "rg,"
                    + "data_nascimento,"
                    + "endereco,"
                    + "bairro,"
                    + "cep,"
                    + "cidade,"
                    + "estado,"
                    + "complemento,"
                    + "telefone,"    
                    + "celular,"
                    + "observacao, "
                    + "email " 
                 + " FROM"
                     + " tbcliente"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setCpf(this.getResultSet().getString(3));
                modelCliente.setRg(this.getResultSet().getString(4));
                modelCliente.setDataNascimento(this.getResultSet().getDate(5));
                modelCliente.setEndereco(this.getResultSet().getString(6));
                modelCliente.setBairro(this.getResultSet().getString(7));
                modelCliente.setCep(this.getResultSet().getString(8));
                modelCliente.setCidade(this.getResultSet().getString(9));
                modelCliente.setEstado(this.getResultSet().getString(10));
                modelCliente.setComplemento(this.getResultSet().getString(11));
                modelCliente.setTelefone(this.getResultSet().getString(12));
                modelCliente.setCelular(this.getResultSet().getString(13));
                modelCliente.setObservacao(this.getResultSet().getString(14));
                modelCliente.setEmail(this.getResultSet().getString(15));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    
   /**
    * recupera Cliente
    * @param pNome
    * return ModelCliente
    */
    public ModelCliente getClienteDAO(String pNome){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo, "
                    + "nome, "
                    + "cpf, "
                    + "rg, "
                    + "data_nascimento, "
                    + "endereco, "
                    + "bairro, "
                    + "cep, "
                    + "cidade, "
                    + "estado, "
                    + "complemento, "
                    + "telefone, "    
                    + "celular, "
                    + "observacao, "
                    + "email "  
                 + " FROM"
                     + " tbcliente"
                 + " WHERE"
                     + " nome = '" + pNome + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setCpf(this.getResultSet().getString(3));
                modelCliente.setRg(this.getResultSet().getString(4));
                modelCliente.setDataNascimento(this.getResultSet().getDate(5));
                modelCliente.setEndereco(this.getResultSet().getString(6));
                modelCliente.setBairro(this.getResultSet().getString(7));
                modelCliente.setCep(this.getResultSet().getString(8));
                modelCliente.setCidade(this.getResultSet().getString(9));
                modelCliente.setEstado(this.getResultSet().getString(10));
                modelCliente.setComplemento(this.getResultSet().getString(11));
                modelCliente.setTelefone(this.getResultSet().getString(12));
                modelCliente.setCelular(this.getResultSet().getString(13));
                modelCliente.setObservacao(this.getResultSet().getString(14));
                modelCliente.setEmail(this.getResultSet().getString(15));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }


    /**
    * recupera uma lista de Cliente
        * return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "cpf,"
                    + "rg,"
                    + "data_nascimento,"
                    + "endereco,"
                    + "bairro,"
                    + "cep,"
                    + "cidade,"
                    + "estado,"
                    + "complemento,"
                    + "telefone,"    
                    + "celular,"
                    + "observacao, "
                    + "email "    
                 + " FROM"
                     + " tbcliente"
                 + " order by nome asc "       
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setCpf(this.getResultSet().getString(3));
                modelCliente.setRg(this.getResultSet().getString(4));
                modelCliente.setDataNascimento(this.getResultSet().getDate(5));
                modelCliente.setEndereco(this.getResultSet().getString(6));
                modelCliente.setBairro(this.getResultSet().getString(7));
                modelCliente.setCep(this.getResultSet().getString(8));
                modelCliente.setCidade(this.getResultSet().getString(9));
                modelCliente.setEstado(this.getResultSet().getString(10));
                modelCliente.setComplemento(this.getResultSet().getString(11));
                modelCliente.setTelefone(this.getResultSet().getString(12));
                modelCliente.setCelular(this.getResultSet().getString(13));
                modelCliente.setObservacao(this.getResultSet().getString(14));
                modelCliente.setEmail(this.getResultSet().getString(15));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    public ArrayList<ModelCliente> getListaClientePDVDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "cpf,"
                    + "rg,"
                    + "data_nascimento,"
                    + "endereco,"
                    + "bairro,"
                    + "cep,"
                    + "cidade,"
                    + "estado,"
                    + "complemento,"
                    + "telefone,"    
                    + "celular,"
                    + "observacao, "
                    + "email "  
                 + " FROM"
                     + " tbcliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                 modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setCpf(this.getResultSet().getString(3));
                modelCliente.setRg(this.getResultSet().getString(4));
                modelCliente.setDataNascimento(this.getResultSet().getDate(5));
                modelCliente.setEndereco(this.getResultSet().getString(6));
                modelCliente.setBairro(this.getResultSet().getString(7));
                modelCliente.setCep(this.getResultSet().getString(8));
                modelCliente.setCidade(this.getResultSet().getString(9));
                modelCliente.setEstado(this.getResultSet().getString(10));
                modelCliente.setComplemento(this.getResultSet().getString(11));
                modelCliente.setTelefone(this.getResultSet().getString(12));
                modelCliente.setCelular(this.getResultSet().getString(13));
                modelCliente.setObservacao(this.getResultSet().getString(14));
                modelCliente.setEmail(this.getResultSet().getString(15));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }
    
    
    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "UPDATE tbcliente SET "
                    + "codigo = '" + pModelCliente.getCodigo() + "',"
                    + "nome = '" + pModelCliente.getNome() + "',"
                    + "cpf = '" + pModelCliente.getCpf()+ "',"
                    + "rg = '" + pModelCliente.getRg()+ "',"
                    + "data_nascimento = '"+ pModelCliente.getDataNascimento()+"',"
                    + "endereco = '" + pModelCliente.getEndereco() + "',"
                    + "bairro = '" + pModelCliente.getBairro() + "',"
                    + "cep = '" + pModelCliente.getCep() + "',"
                    + "cidade = '" + pModelCliente.getCidade() + "',"
                    + "estado = '" + pModelCliente.getEstado() + "',"
                    + "complemento = '" + pModelCliente.getComplemento()+ "',"
                    + "telefone = '" + pModelCliente.getTelefone() + "',"
                    + "celular = '"+ pModelCliente.getCelular()+"',"
                    + "observacao = '" + pModelCliente.getObservacao()+ "',"
                    + "email = '" + pModelCliente.getEmail()+ "'"
                + " WHERE "
                    + "codigo = '" + pModelCliente.getCodigo() + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Cliente
    * @param pCodigo
    * return boolean
    */
    public boolean excluirClienteDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbcliente "
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
}