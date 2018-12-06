package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelOpcionais;

/**
 *
 * @author cicero.ramos
 */
public class DAOOpcionais extends ConexaoMySql {

    public int salvarOpcionais(ModelOpcionais pModelOpcionais) {
        try {
            this.conectar();
            int sizeLista = pModelOpcionais.getListaModelOpcionaisVeiculo().size();
            for (int i = 0; i < sizeLista; i++) {
                this.insertSQL(
                        "INSERT INTO tbopcionais ("
                        + "codigo_veiculo,"
                        + " opcionais"
                        + ") VALUES ("
                        + "'" + pModelOpcionais.getListaModelOpcionaisVeiculo().get(i).getCodigoVeiculo() + "',"
                        + "'" + pModelOpcionais.getListaModelOpcionaisVeiculo().get(i).getOpcionais() + "'"
                        + ");"
                );
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;

        } finally {
            this.fecharConexao();
        }

    }

    public ArrayList<ModelOpcionais> getListaOpcionaisDAO() {
        ArrayList<ModelOpcionais> listamodelOpcionais = new ArrayList<>();
        ModelOpcionais modelOpcionais = new ModelOpcionais();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_veiculo,"
                    + "opcionais"
                    + " FROM"
                    + " tbopcionais"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelOpcionais = new ModelOpcionais();
                modelOpcionais.setCodigo(this.getResultSet().getInt(1));
                modelOpcionais.setCodigoVeiculo(this.getResultSet().getInt(2));
                modelOpcionais.setOpcionais(this.getResultSet().getString(3));
                listamodelOpcionais.add(modelOpcionais);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelOpcionais;

    }

    public ArrayList<ModelOpcionais> getListaOpcionaisVeiculo(int pCodVeiculo) {
        ArrayList<ModelOpcionais> listamodelOpcionais = new ArrayList<>();
        ModelOpcionais modelOpcionais = new ModelOpcionais();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_veiculo,"
                    + "opcionais"
                    + " FROM"
                    + " tbopcionais"
                    + " WHERE"
                    + " codigo_veiculo = '" + pCodVeiculo + "'"
            );

            while (this.getResultSet().next()) {
                modelOpcionais = new ModelOpcionais();
                modelOpcionais.setCodigo(this.getResultSet().getInt(1));
                modelOpcionais.setCodigoVeiculo(this.getResultSet().getInt(2));
                modelOpcionais.setOpcionais(this.getResultSet().getString(3));
                listamodelOpcionais.add(modelOpcionais);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelOpcionais;

    }

    public boolean atualizarOpcionaisDAO(ModelOpcionais pModelOpcionais) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbopcionais SET "
                    + "codigo = '" + pModelOpcionais.getCodigo() + "',"
                    + "codigo_veiculo = '" + pModelOpcionais.getCodigoVeiculo() + "',"
                    + "codigo_venda = '" + pModelOpcionais.getOpcionais() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelOpcionais.getCodigo() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirOpcionaisDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbopcionais "
                    + " WHERE "
                    + "codigo_veiculo = '" + pCodigo + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
