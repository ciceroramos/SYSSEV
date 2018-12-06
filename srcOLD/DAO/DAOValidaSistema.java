package DAO;

import model.ModelValidaSistema;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author cicero.ramos
 */
public class DAOValidaSistema extends ConexaoMySql {

    /**
     * grava ValidaSistema
     *
     * @param pModelValidaSistema return int
     */
    public int salvarValidaSistemaDAO(ModelValidaSistema pModelValidaSistema) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO validade_sistema ("
                    + "dataVencimento"
                    + ") VALUES ("
                    + "'" + pModelValidaSistema.getDataVencimento() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public ArrayList<ModelValidaSistema> getVerificaValidadeDAO() {
        ArrayList<ModelValidaSistema> listamodelValidaSistema = new ArrayList();
        ModelValidaSistema modelValida = new ModelValidaSistema();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "dataVencimento "
                    + " FROM"
                    + " validade_sistema "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelValida.setCodigo(this.getResultSet().getInt(1));
                modelValida.setDataVencimento(this.getResultSet().getDate(2));
                listamodelValidaSistema.add(modelValida);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            this.fecharConexao();
        }
        return listamodelValidaSistema;
    }

}
