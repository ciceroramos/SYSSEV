package DAO;

import conexoes.ConexaoMySql;
import java.sql.Date;
import java.util.ArrayList;
import model.ModelVendas;

/**
 *
 * @author cicero.ramos
 */
public class DAOVenda extends ConexaoMySql {

    public int salvarVendasDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbvenda ("
                    + "codigo_cliente, "//
                    + "tipo_negociacao, " //
                    + "data_venda, "//
                    + "desconto, "//
                    + "valor_venda, "//
                    + "observacao, "//
                    + "placa, "
                    + "ano_fabricacao, "
                    + "ano_modelo, "
                    + "chassi, "
                    + "renavam, "
                    + "marca, "
                    + "modelo, "
                    + "cor, "
                    + "combustivel, "
                    + "km_rodados, "
                    + "motor, "
                    + "observacao_veiculo, "
                    + "data_compra, "
                    + "tipo "        
                    + ") VALUES ("
                    + "'" + pModelVendas.getClienteCodigo() + "',"
                    + "'" + pModelVendas.getTipoNegociacao() + "',"
                    + "'" + pModelVendas.getDataVenda() + "',"
                    + "'" + pModelVendas.getDesconto() + "',"
                    + "'" + pModelVendas.getValorTotal() + "',"
                    + "'" + pModelVendas.getObservacao() + "',"
                    + "'" + pModelVendas.getPlaca() + "',"
                    + "'" + pModelVendas.getAnoFabricacao() + "',"
                    + "'" + pModelVendas.getAnoModelo() + "',"
                    + "'" + pModelVendas.getChassi() + "',"
                    + "'" + pModelVendas.getRenavam() + "',"
                    + "'" + pModelVendas.getMarca() + "',"
                    + "'" + pModelVendas.getModelo() + "',"
                    + "'" + pModelVendas.getCor() + "',"
                    + "'" + pModelVendas.getCombustivel() + "',"
                    + "'" + pModelVendas.getKmRodados() + "',"
                    + "'" + pModelVendas.getMotor() + "',"
                    + "'" + pModelVendas.getObservacao_veiculo() + "',"
                    + "'" + pModelVendas.getDataCompra() + "',"
                    + "'" + pModelVendas.getTipo() + "'"        
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelVendas getVendasDAO(int pCodigo) {
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_cliente, "
                    + "tipo_negociacao, "
                    + "data_venda, "
                    + "desconto, "
                    + "valor_venda, "
                    + "observacao, " //alteracao
                    + "placa, "
                    + "ano_fabricacao, "
                    + "ano_modelo, "
                    + "chassi, "
                    + "renavam, "
                    + "marca, "
                    + "modelo, "
                    + "cor, "
                    + "combustivel, "
                    + "km_rodados, "
                    + "motor, "
                    + "observacao_veiculo, "
                    + "data_compra, "
                    + "tipo "        
                    + " FROM"
                    + " tbvenda"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendas.setCodigo(this.getResultSet().getInt(1));
                modelVendas.setClienteCodigo(this.getResultSet().getInt(2));
                modelVendas.setTipoNegociacao(this.getResultSet().getString(3));
                modelVendas.setDataVenda(this.getResultSet().getDate(4));
                modelVendas.setDesconto(this.getResultSet().getFloat(5));
                modelVendas.setValorTotal(this.getResultSet().getFloat(6));
                modelVendas.setObservacao(this.getResultSet().getString(7));                
                modelVendas.setPlaca(this.getResultSet().getString(8));
                modelVendas.setAnoFabricacao(this.getResultSet().getString(9));
                modelVendas.setAnoModelo(this.getResultSet().getString(10));
                modelVendas.setChassi(this.getResultSet().getString(11));
                modelVendas.setRenavam(this.getResultSet().getString(12));
                modelVendas.setMarca(this.getResultSet().getString(13));
                modelVendas.setModelo(this.getResultSet().getString(14));
                modelVendas.setCor(this.getResultSet().getString(15));
                modelVendas.setCombustivel(this.getResultSet().getString(16));
                modelVendas.setKmRodados(this.getResultSet().getString(17));
                modelVendas.setMotor(this.getResultSet().getString(18));
                modelVendas.setObservacao_veiculo(this.getResultSet().getString(19));
                modelVendas.setDataCompra(this.getResultSet().getDate(20));
                modelVendas.setTipo(this.getResultSet().getString(21));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendas;
    }

    public ModelVendas getListaCodVendasDAO(int pCodigo) {
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo, "
                    + "codigo_cliente, "
                    + "tipo_negociacao, "
                    + "data_venda, "
                    + "desconto, "
                    + "valor_venda, "
                    + "observacao, " //alteracao
                    + "placa, "
                    + "ano_fabricacao, "
                    + "ano_modelo, "
                    + "chassi, "
                    + "renavam, "
                    + "marca, "
                    + "modelo, "
                    + "cor, "
                    + "combustivel, "
                    + "km_rodados, "
                    + "motor, "
                    + "observacao_veiculo, "
                    + "data_compra, "
                    + "tipo "       
                    + " FROM"
                    + " tbvenda"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendas.setCodigo(this.getResultSet().getInt(1));
                modelVendas.setClienteCodigo(this.getResultSet().getInt(2));
                modelVendas.setTipoNegociacao(this.getResultSet().getString(3));
                modelVendas.setDataVenda(this.getResultSet().getDate(4));
                modelVendas.setDesconto(this.getResultSet().getFloat(5));
                modelVendas.setValorTotal(this.getResultSet().getFloat(6));
                modelVendas.setObservacao(this.getResultSet().getString(7));
                modelVendas.setPlaca(this.getResultSet().getString(8));
                modelVendas.setAnoFabricacao(this.getResultSet().getString(9));
                modelVendas.setAnoModelo(this.getResultSet().getString(10));
                modelVendas.setChassi(this.getResultSet().getString(11));
                modelVendas.setRenavam(this.getResultSet().getString(12));
                modelVendas.setMarca(this.getResultSet().getString(13));
                modelVendas.setModelo(this.getResultSet().getString(14));
                modelVendas.setCor(this.getResultSet().getString(15));
                modelVendas.setCombustivel(this.getResultSet().getString(16));
                modelVendas.setKmRodados(this.getResultSet().getString(17));
                modelVendas.setMotor(this.getResultSet().getString(18));
                modelVendas.setObservacao_veiculo(this.getResultSet().getString(19));
                modelVendas.setDataCompra(this.getResultSet().getDate(20));
                modelVendas.setTipo(this.getResultSet().getString(21));
                listamodelVendas.add(modelVendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendas;
    }

    public ArrayList<ModelVendas> getListaVendasDAO() {
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_cliente, "
                    + "tipo_negociacao, "
                    + "data_venda, "
                    + "desconto, "
                    + "valor_venda, "
                    + "observacao, " //alteracao
                    + "placa, "
                    + "ano_fabricacao, "
                    + "ano_modelo, "
                    + "chassi, "
                    + "renavam, "
                    + "marca, "
                    + "modelo, "
                    + "cor, "
                    + "combustivel, "
                    + "km_rodados, "
                    + "motor, "
                    + "observacao_veiculo, "
                    + "data_compra, "
                    + "tipo "
                    + " FROM"
                    + " tbvenda"
                    + " order by data_venda desc "        
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelVendas.setCodigo(this.getResultSet().getInt(1));
                modelVendas.setClienteCodigo(this.getResultSet().getInt(2));
                modelVendas.setTipoNegociacao(this.getResultSet().getString(3));
                modelVendas.setDataVenda(this.getResultSet().getDate(4));
                modelVendas.setDesconto(this.getResultSet().getFloat(5));
                modelVendas.setValorTotal(this.getResultSet().getFloat(6));
                modelVendas.setObservacao(this.getResultSet().getString(7));
                modelVendas.setPlaca(this.getResultSet().getString(8));
                modelVendas.setAnoFabricacao(this.getResultSet().getString(9));
                modelVendas.setAnoModelo(this.getResultSet().getString(10));
                modelVendas.setChassi(this.getResultSet().getString(11));
                modelVendas.setRenavam(this.getResultSet().getString(12));
                modelVendas.setMarca(this.getResultSet().getString(13));
                modelVendas.setModelo(this.getResultSet().getString(14));
                modelVendas.setCor(this.getResultSet().getString(15));
                modelVendas.setCombustivel(this.getResultSet().getString(16));
                modelVendas.setKmRodados(this.getResultSet().getString(17));
                modelVendas.setMotor(this.getResultSet().getString(18));
                modelVendas.setObservacao_veiculo(this.getResultSet().getString(19));
                modelVendas.setDataCompra(this.getResultSet().getDate(20));
                modelVendas.setTipo(this.getResultSet().getString(21));
                listamodelVendas.add(modelVendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendas;
    }
    
    public boolean atualizarVendasDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE tbvenda SET "
                    + "codigo = '" + pModelVendas.getCodigo() + "',"
                    + "codigo_cliente = '" + pModelVendas.getClienteCodigo() + "',"
                    + "tipo_negociacao = '" + pModelVendas.getTipoNegociacao() + "',"
                    + "data_venda = '" + pModelVendas.getDataVenda() + "',"
                    + "desconto = '" + pModelVendas.getDesconto() + "',"
                    + "valor_venda = '" + pModelVendas.getValorTotal() + "',"
                    + "observacao = '" + pModelVendas.getObservacao() + "'"
                    + "placa = '" + pModelVendas.getPlaca() + "',"
                    + "ano_fabricacao = '" + pModelVendas.getAnoFabricacao() + "',"
                    + "ano_modelo = '" + pModelVendas.getAnoModelo() + "',"
                    + "renavam = '" + pModelVendas.getRenavam() + "',"
                    + "chassi = '" + pModelVendas.getChassi() + "',"
                    + "marca = '" + pModelVendas.getMarca() + "',"
                    + "modelo = '" + pModelVendas.getModelo() + "',"
                    + "cor = '" + pModelVendas.getCor() + "',"
                    + "combustivel = '" + pModelVendas.getCombustivel() + "',"
                    + "km_rodados = '" + pModelVendas.getKmRodados() + "',"
                    + "motor = '" + pModelVendas.getMotor() + "',"
                    + "observacao = '" + pModelVendas.getObservacao() + "',"
                    + "data_compra = '" + pModelVendas.getDataCompra() + "',"
                    + "tipo = '" + pModelVendas.getTipo() + "'"        
                    + " WHERE "
                    + "codigo = '" + pModelVendas.getCodigo() + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean excluirVendasDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbvenda "
                    + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    public boolean veiculoIndisponivelDAO(int pCodigo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE tbveiculo SET "
                    + "situacao = 'INDISPONIVEL' "
                    + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
