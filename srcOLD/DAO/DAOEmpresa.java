package DAO;

import model.ModelEmpresa;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

public class DAOEmpresa extends ConexaoMySql {

    /**
    * grava Empresa
    * @param pModelEmpresa
    * return int
    */
    public int salvarEmpresaDAO(ModelEmpresa pModelEmpresa){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO empresa ("
                    + "codigo,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep,"
                    + "telefone, "
                    + "cnpj, "
                    + "cpf, "
                    + "contrato, "    
                    + "email, "    
                    + "caminho_logo, "    
                    + "senha_email "    
                + ") VALUES ("
                    + "'" + pModelEmpresa.getCodigo() + "',"
                    + "'" + pModelEmpresa.getRazaoSocial() + "',"
                    + "'" + pModelEmpresa.getNomeFantasia() + "',"
                    + "'" + pModelEmpresa.getEndereco() + "',"
                    + "'" + pModelEmpresa.getBairro() + "',"
                    + "'" + pModelEmpresa.getCidade() + "',"
                    + "'" + pModelEmpresa.getEstado() + "',"
                    + "'" + pModelEmpresa.getCep() + "',"
                    + "'" + pModelEmpresa.getTelefone() + "',"
                    + "'" + pModelEmpresa.getCnpj()+ "',"
                    + "'" + pModelEmpresa.getCpf()+ "',"
                    + "'" + pModelEmpresa.getContrato()+ "',"    
                    + "'" + pModelEmpresa.getEmail()+ "',"    
                    + "'" + pModelEmpresa.getCaminhoLogo()+ "',"    
                    + "'" + pModelEmpresa.getSenhaEmail()+ "'"    
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
    * recupera Empresa
    * @param pCodigo
    * return ModelEmpresa
    */
    public ModelEmpresa getEmpresaDAO(int pCodigo){
        ModelEmpresa modelEmpresa = new ModelEmpresa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep,"
                    + "telefone,"
                    + "cnpj, "
                    + "cpf, "
                    + "contrato, " 
                    + "email, "    
                    + "caminho_logo, "    
                    + "senha_email " 
                 + " FROM"
                     + " empresa"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelEmpresa.setCodigo(this.getResultSet().getInt(1));
                modelEmpresa.setRazaoSocial(this.getResultSet().getString(2));
                modelEmpresa.setNomeFantasia(this.getResultSet().getString(3));
                modelEmpresa.setEndereco(this.getResultSet().getString(4));
                modelEmpresa.setBairro(this.getResultSet().getString(5));
                modelEmpresa.setCidade(this.getResultSet().getString(6));
                modelEmpresa.setEstado(this.getResultSet().getString(7));
                modelEmpresa.setCep(this.getResultSet().getString(8));
                modelEmpresa.setTelefone(this.getResultSet().getString(9));
                modelEmpresa.setCnpj(this.getResultSet().getString(10));
                modelEmpresa.setCpf(this.getResultSet().getString(11));
                modelEmpresa.setContrato(this.getResultSet().getString(12));
                modelEmpresa.setEmail(this.getResultSet().getString(13));
                modelEmpresa.setCaminhoLogo(this.getResultSet().getString(14));
                modelEmpresa.setSenhaEmail(this.getResultSet().getString(15));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelEmpresa;
    }

    /**
    * recupera uma lista de Empresa
        * return ArrayList
    */
    public ArrayList<ModelEmpresa> getListaEmpresaDAO(){
        ArrayList<ModelEmpresa> listamodelEmpresa = new ArrayList();
        ModelEmpresa modelEmpresa = new ModelEmpresa();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "razao_social,"
                    + "nome_fantasia,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "estado,"
                    + "cep,"
                    + "telefone,"
                    + "cnpj, "
                    + "cpf, "
                    + "contrato, "     
                    + "email, "    
                    + "caminho_logo, "    
                    + "senha_email "     
                 + " FROM"
                     + " empresa "
                + ";"
            );

            while(this.getResultSet().next()){
                modelEmpresa = new ModelEmpresa();
                modelEmpresa.setCodigo(this.getResultSet().getInt(1));
                modelEmpresa.setRazaoSocial(this.getResultSet().getString(2));
                modelEmpresa.setNomeFantasia(this.getResultSet().getString(3));
                modelEmpresa.setEndereco(this.getResultSet().getString(4));
                modelEmpresa.setBairro(this.getResultSet().getString(5));
                modelEmpresa.setCidade(this.getResultSet().getString(6));
                modelEmpresa.setEstado(this.getResultSet().getString(7));
                modelEmpresa.setCep(this.getResultSet().getString(8));
                modelEmpresa.setTelefone(this.getResultSet().getString(9));
                modelEmpresa.setCnpj(this.getResultSet().getString(10));
                modelEmpresa.setCpf(this.getResultSet().getString(11));
                modelEmpresa.setContrato(this.getResultSet().getString(12));
                modelEmpresa.setEmail(this.getResultSet().getString(13));
                modelEmpresa.setCaminhoLogo(this.getResultSet().getString(14));
                modelEmpresa.setSenhaEmail(this.getResultSet().getString(15));
                listamodelEmpresa.add(modelEmpresa);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelEmpresa;
    }

    /**
    * atualiza Empresa
    * @param pModelEmpresa
    * return boolean
    */
    public boolean atualizarEmpresaDAO(ModelEmpresa pModelEmpresa){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE empresa SET "
                    + "codigo = '" + pModelEmpresa.getCodigo() + "',"
                    + "razao_social = '" + pModelEmpresa.getRazaoSocial() + "',"
                    + "nome_fantasia = '" + pModelEmpresa.getNomeFantasia() + "',"
                    + "endereco = '" + pModelEmpresa.getEndereco() + "',"
                    + "bairro = '" + pModelEmpresa.getBairro() + "',"
                    + "cidade = '" + pModelEmpresa.getCidade() + "',"
                    + "estado = '" + pModelEmpresa.getEstado() + "',"
                    + "cep = '" + pModelEmpresa.getCep() + "',"
                    + "telefone = '" + pModelEmpresa.getTelefone() + "',"
                    + "cnpj = '" + pModelEmpresa.getCnpj()+ "',"
                    + "cpf = '" + pModelEmpresa.getCpf()+ "',"    
                    + "contrato = '" + pModelEmpresa.getContrato()+ "',"    
                    + "email = '" + pModelEmpresa.getEmail()+ "',"    
                    + "caminho_logo = '" + pModelEmpresa.getCaminhoLogo()+ "',"    
                    + "senha_email = '" + pModelEmpresa.getSenhaEmail()+ "'"    
                + " WHERE "
                    + "codigo = '" + pModelEmpresa.getCodigo() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Empresa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirEmpresaDAO(int pCodigo){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM empresa "
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