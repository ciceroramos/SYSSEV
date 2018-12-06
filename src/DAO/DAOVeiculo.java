package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVeiculo;

/**
 *
 * @author cicero.ramos
 */
public class DAOVeiculo extends ConexaoMySql {

    public int salvarVeiculoDAO(ModelVeiculo pModelVeiculo) {

        try {
            this.conectar();
            return this.insertSQL(
                    " INSERT INTO tbveiculo("
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
                    + "custo_aquisicao, "
                    + "valor_venda, "
                    + "observacao, "
                    + "data_compra, "
                    + "situacao, "
                    + "tipo "
                    + ") VALUES ("
                    + "'" + pModelVeiculo.getPlaca() + "',"
                    + "'" + pModelVeiculo.getAnoFabricacao() + "',"
                    + "'" + pModelVeiculo.getAnoModelo() + "',"
                    + "'" + pModelVeiculo.getChassi() + "',"
                    + "'" + pModelVeiculo.getRenavam() + "',"
                    + "'" + pModelVeiculo.getMarca() + "',"
                    + "'" + pModelVeiculo.getModelo() + "',"
                    + "'" + pModelVeiculo.getCor() + "',"
                    + "'" + pModelVeiculo.getCombustivel() + "',"
                    + "'" + pModelVeiculo.getKmRodados() + "',"
                    + "'" + pModelVeiculo.getMotor() + "',"
                    + "'" + pModelVeiculo.getCustoAquisicao() + "',"
                    + "'" + pModelVeiculo.getValorVenda() + "',"
                    + "'" + pModelVeiculo.getObservacao() + "',"
                    + "'" + pModelVeiculo.getDataCompra() + "',"
                    + "'" + pModelVeiculo.getSituacao() + "',"
                    + "'" + pModelVeiculo.getTipo() + "'"
                    + ");"
            );

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }

    public ModelVeiculo getVeiculoDAO(int pCodigo) {
        ModelVeiculo modelVeiculo = new ModelVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo, "
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
                    + "custo_aquisicao, "
                    + "valor_venda, "
                    + "observacao, "
                    + "data_compra, "
                    + "situacao, "
                    + "tipo "
                    + "FROM "
                    + " tbveiculo"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelVeiculo.setPlaca(this.getResultSet().getString(2));
                modelVeiculo.setAnoFabricacao(this.getResultSet().getString(3));
                modelVeiculo.setAnoModelo(this.getResultSet().getString(4));
                modelVeiculo.setChassi(this.getResultSet().getString(5));
                modelVeiculo.setRenavam(this.getResultSet().getString(6));
                modelVeiculo.setMarca(this.getResultSet().getString(7));
                modelVeiculo.setModelo(this.getResultSet().getString(8));
                modelVeiculo.setCor(this.getResultSet().getString(9));
                modelVeiculo.setCombustivel(this.getResultSet().getString(10));
                modelVeiculo.setKmRodados(this.getResultSet().getString(11));
                modelVeiculo.setMotor(this.getResultSet().getString(12));
                modelVeiculo.setCustoAquisicao(this.getResultSet().getDouble(13));
                modelVeiculo.setValorVenda(this.getResultSet().getDouble(14));
                modelVeiculo.setObservacao(this.getResultSet().getString(15));
                modelVeiculo.setDataCompra(this.getResultSet().getDate(16));
                modelVeiculo.setSituacao(this.getResultSet().getString(17));
                modelVeiculo.setTipo(this.getResultSet().getString(18));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVeiculo;

    }

    public ModelVeiculo getVeiculoDAO(String pPlaca) {
        ModelVeiculo modelVeiculo = new ModelVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
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
                    + "custo_aquisicao, "
                    + "valor_venda, "
                    + "observacao, "
                    + "data_compra, "
                    + "situacao, "
                    + "tipo "
                    + "FROM "
                    + " tbVeiculo"
                    + " WHERE"
                    + " placa = '" + pPlaca + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelVeiculo.setPlaca(this.getResultSet().getString(2));
                modelVeiculo.setAnoFabricacao(this.getResultSet().getString(3));
                modelVeiculo.setAnoModelo(this.getResultSet().getString(4));
                modelVeiculo.setChassi(this.getResultSet().getString(5));
                modelVeiculo.setRenavam(this.getResultSet().getString(6));
                modelVeiculo.setMarca(this.getResultSet().getString(7));
                modelVeiculo.setModelo(this.getResultSet().getString(8));
                modelVeiculo.setCor(this.getResultSet().getString(9));
                modelVeiculo.setCombustivel(this.getResultSet().getString(10));
                modelVeiculo.setKmRodados(this.getResultSet().getString(11));
                modelVeiculo.setMotor(this.getResultSet().getString(12));
                modelVeiculo.setCustoAquisicao(this.getResultSet().getDouble(13));
                modelVeiculo.setValorVenda(this.getResultSet().getDouble(14));
                modelVeiculo.setObservacao(this.getResultSet().getString(15));
                modelVeiculo.setDataCompra(this.getResultSet().getDate(16));
                modelVeiculo.setSituacao(this.getResultSet().getString(17));
                modelVeiculo.setTipo(this.getResultSet().getString(18));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVeiculo;

    }

    public ModelVeiculo getVeiculoModeloDAO(String pModelo) {
        ModelVeiculo modelVeiculo = new ModelVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo, "
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
                    + "custo_aquisicao, "
                    + "valor_venda, "
                    + "observacao, "
                    + "data_compra, "
                    + "situacao, "
                    + "tipo "
                    + "FROM "
                    + " tbVeiculo"
                    + " WHERE"
                    + " modelo = '" + pModelo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelVeiculo.setPlaca(this.getResultSet().getString(2));
                modelVeiculo.setAnoFabricacao(this.getResultSet().getString(3));
                modelVeiculo.setAnoModelo(this.getResultSet().getString(4));
                modelVeiculo.setChassi(this.getResultSet().getString(5));
                modelVeiculo.setRenavam(this.getResultSet().getString(6));
                modelVeiculo.setMarca(this.getResultSet().getString(7));
                modelVeiculo.setModelo(this.getResultSet().getString(8));
                modelVeiculo.setCor(this.getResultSet().getString(9));
                modelVeiculo.setCombustivel(this.getResultSet().getString(10));
                modelVeiculo.setKmRodados(this.getResultSet().getString(11));
                modelVeiculo.setMotor(this.getResultSet().getString(12));
                modelVeiculo.setCustoAquisicao(this.getResultSet().getDouble(13));
                modelVeiculo.setValorVenda(this.getResultSet().getDouble(14));
                modelVeiculo.setObservacao(this.getResultSet().getString(15));
                modelVeiculo.setDataCompra(this.getResultSet().getDate(16));
                modelVeiculo.setSituacao(this.getResultSet().getString(17));
                modelVeiculo.setTipo(this.getResultSet().getString(18));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVeiculo;

    }

    
    public ArrayList<ModelVeiculo> getListVeiculoDAO() {
        ArrayList<ModelVeiculo> listamodelVeiculo = new ArrayList();
        ModelVeiculo modelVeiculo = new ModelVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo, "
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
                    + "custo_aquisicao, "
                    + "valor_venda, "
                    + "observacao, "
                    + "data_compra, "
                    + "situacao, "
                    + "tipo "
                    + "FROM "
                    + " tbveiculo"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVeiculo = new ModelVeiculo();
                modelVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelVeiculo.setPlaca(this.getResultSet().getString(2));
                modelVeiculo.setAnoFabricacao(this.getResultSet().getString(3));
                modelVeiculo.setAnoModelo(this.getResultSet().getString(4));
                modelVeiculo.setChassi(this.getResultSet().getString(5));
                modelVeiculo.setRenavam(this.getResultSet().getString(6));
                modelVeiculo.setMarca(this.getResultSet().getString(7));
                modelVeiculo.setModelo(this.getResultSet().getString(8));
                modelVeiculo.setCor(this.getResultSet().getString(9));
                modelVeiculo.setCombustivel(this.getResultSet().getString(10));
                modelVeiculo.setKmRodados(this.getResultSet().getString(11));
                modelVeiculo.setMotor(this.getResultSet().getString(12));
                modelVeiculo.setCustoAquisicao(this.getResultSet().getDouble(13));
                modelVeiculo.setValorVenda(this.getResultSet().getDouble(14));
                modelVeiculo.setObservacao(this.getResultSet().getString(15));
                modelVeiculo.setDataCompra(this.getResultSet().getDate(16));
                modelVeiculo.setSituacao(this.getResultSet().getString(17));
                modelVeiculo.setTipo(this.getResultSet().getString(18));
                listamodelVeiculo.add(modelVeiculo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVeiculo;
    }

    public boolean atualizarVeiculoDAO(ModelVeiculo pModelVeiculo) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE tbveiculo SET "
                    + "codigo = '" + pModelVeiculo.getCodigo() + "',"
                    + "placa = '" + pModelVeiculo.getPlaca() + "',"
                    + "ano_fabricacao = '" + pModelVeiculo.getAnoFabricacao() + "',"
                    + "ano_modelo = '" + pModelVeiculo.getAnoModelo() + "',"
                    + "renavam = '" + pModelVeiculo.getRenavam() + "',"
                    + "chassi = '" + pModelVeiculo.getChassi() + "',"
                    + "marca = '" + pModelVeiculo.getMarca() + "',"
                    + "modelo = '" + pModelVeiculo.getModelo() + "',"
                    + "cor = '" + pModelVeiculo.getCor() + "',"
                    + "combustivel = '" + pModelVeiculo.getCombustivel() + "',"
                    + "km_rodados = '" + pModelVeiculo.getKmRodados() + "',"
                    + "motor = '" + pModelVeiculo.getMotor() + "',"
                    + "custo_aquisicao = '" + pModelVeiculo.getCustoAquisicao() + "',"
                    + "valor_venda = '" + pModelVeiculo.getValorVenda() + "',"
                    + "observacao = '" + pModelVeiculo.getObservacao() + "',"
                    + "data_compra = '" + pModelVeiculo.getDataCompra() + "',"
                    + "situacao = '" + pModelVeiculo.getSituacao() + "',"
                    + "tipo = '" + pModelVeiculo.getTipo() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelVeiculo.getCodigo() + "'"
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

    public boolean excluirVeiculoDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbveiculo "
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

    public ModelVeiculo getDespesaVeiculoDAO(int pCodigoVeiculo) {
        ModelVeiculo modelVeiculoDespesa = new ModelVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo_veiculo, "
                    + "limpeza, "
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
                modelVeiculoDespesa = new ModelVeiculo();
                modelVeiculoDespesa.setCodigoVeiculo(this.getResultSet().getInt(1));
                modelVeiculoDespesa.setLimpeza(this.getResultSet().getDouble(2));
                modelVeiculoDespesa.setMecanica(this.getResultSet().getDouble(3));
                modelVeiculoDespesa.setFunilaria(this.getResultSet().getDouble(4));
                modelVeiculoDespesa.setRevisao(this.getResultSet().getDouble(5));
                modelVeiculoDespesa.setDebitos(this.getResultSet().getDouble(6));
                modelVeiculoDespesa.setOutros(this.getResultSet().getDouble(7));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVeiculoDespesa;

    }

    public boolean salvarDespesaVeiculoDAO(ModelVeiculo pModelVeiculo) {
        try {
            this.conectar();
            this.insertSQL(
                    "INSERT INTO tbdespesa_veiculo("
                    + "codigo_veiculo, "
                    + "limpeza, "
                    + "mecanica, "
                    + "funilaria, "
                    + "revisao, "
                    + "debitos, "
                    + "outros "
                    + ") VALUES ("
                    + "'" + pModelVeiculo.getCodigo() + "',"
                    + "'" + pModelVeiculo.getLimpeza() + "',"
                    + "'" + pModelVeiculo.getMecanica() + "',"
                    + "'" + pModelVeiculo.getFunilaria() + "',"
                    + "'" + pModelVeiculo.getRevisao() + "',"
                    + "'" + pModelVeiculo.getDebitos() + "',"
                    + "'" + pModelVeiculo.getOutros() + "'"
                    + ");"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ArrayList<ModelVeiculo> getListVeiculoDisponivelDAO() {
        ArrayList<ModelVeiculo> listaModelVeiculo = new ArrayList();
        ModelVeiculo modelVeiculo = new ModelVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo, "
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
                    + "custo_aquisicao, "
                    + "valor_venda, "
                    + "observacao, "
                    + "data_compra, "
                    + "situacao, "
                    + "tipo "
                    + "FROM "
                    + " tbVeiculo"                   
                    + " order by modelo asc "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVeiculo = new ModelVeiculo();
                modelVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelVeiculo.setPlaca(this.getResultSet().getString(2));
                modelVeiculo.setAnoFabricacao(this.getResultSet().getString(3));
                modelVeiculo.setAnoModelo(this.getResultSet().getString(4));
                modelVeiculo.setChassi(this.getResultSet().getString(5));
                modelVeiculo.setRenavam(this.getResultSet().getString(6));
                modelVeiculo.setMarca(this.getResultSet().getString(7));
                modelVeiculo.setModelo(this.getResultSet().getString(8));
                modelVeiculo.setCor(this.getResultSet().getString(9));
                modelVeiculo.setCombustivel(this.getResultSet().getString(10));
                modelVeiculo.setKmRodados(this.getResultSet().getString(11));
                modelVeiculo.setMotor(this.getResultSet().getString(12));
                modelVeiculo.setCustoAquisicao(this.getResultSet().getDouble(13));
                modelVeiculo.setValorVenda(this.getResultSet().getDouble(14));
                modelVeiculo.setObservacao(this.getResultSet().getString(15));
                modelVeiculo.setDataCompra(this.getResultSet().getDate(16));
                modelVeiculo.setSituacao(this.getResultSet().getString(17));
                modelVeiculo.setTipo(this.getResultSet().getString(18));
                listaModelVeiculo.add(modelVeiculo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVeiculo;
    }

    public ArrayList<ModelVeiculo> getListVeiculoIndisponivelDAO() {
        ArrayList<ModelVeiculo> listaModelVeiculo = new ArrayList();
        ModelVeiculo modelVeiculo = new ModelVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo, "
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
                    + "custo_aquisicao, "
                    + "valor_venda, "
                    + "observacao, "
                    + "data_compra, "
                    + "situacao, "
                    + "tipo "
                    + "FROM "
                    + " tbVeiculo"
                    + " WHERE"
                    + " situacao = 'INDISPONIVEL' "
                    + " order by modelo asc "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVeiculo = new ModelVeiculo();
                modelVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelVeiculo.setPlaca(this.getResultSet().getString(2));
                modelVeiculo.setAnoFabricacao(this.getResultSet().getString(3));
                modelVeiculo.setAnoModelo(this.getResultSet().getString(4));
                modelVeiculo.setChassi(this.getResultSet().getString(5));
                modelVeiculo.setRenavam(this.getResultSet().getString(6));
                modelVeiculo.setMarca(this.getResultSet().getString(7));
                modelVeiculo.setModelo(this.getResultSet().getString(8));
                modelVeiculo.setCor(this.getResultSet().getString(9));
                modelVeiculo.setCombustivel(this.getResultSet().getString(10));
                modelVeiculo.setKmRodados(this.getResultSet().getString(11));
                modelVeiculo.setMotor(this.getResultSet().getString(12));
                modelVeiculo.setCustoAquisicao(this.getResultSet().getDouble(13));
                modelVeiculo.setValorVenda(this.getResultSet().getDouble(14));
                modelVeiculo.setObservacao(this.getResultSet().getString(15));
                modelVeiculo.setDataCompra(this.getResultSet().getDate(16));
                modelVeiculo.setSituacao(this.getResultSet().getString(17));
                modelVeiculo.setTipo(this.getResultSet().getString(18));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelVeiculo;
    }
    
    public boolean atualizarDespesaVeiculo(ModelVeiculo pModelVeiculo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbdespesa_veiculo SET "
                    + "codigo = '" + pModelVeiculo.getCodigo() + "',"
                    + "codigo_veiculo = '" + pModelVeiculo.getCodigoVeiculo() + "',"
                    + "limpeza = '" + pModelVeiculo.getLimpeza() + "',"
                    + "mecanica = '" + pModelVeiculo.getMecanica() + "',"
                    + "funilaria = '" + pModelVeiculo.getFunilaria() + "',"
                    + "revisao = '" + pModelVeiculo.getRevisao() + "',"
                    + "debitos = '" + pModelVeiculo.getDebitos() + "',"
                    + "outros = '" + pModelVeiculo.getOutros() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelVeiculo.getCodigo() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ArrayList<ModelVeiculo> getListaDespesaVeiculoCodDAO(int pCodigo){
        ArrayList<ModelVeiculo> listamodelDespesaVaiculo =new ArrayList();
        ModelVeiculo modelVeiculo = new ModelVeiculo();
        try {
            this.conectar();
            this.executarSQL(
                 "SELECT "
                   + "codigo, "
                    + "codigo_veiculo, "
                    + "limpeza, "
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
                modelVeiculo = new ModelVeiculo();
                modelVeiculo.setCodigo(this.getResultSet().getInt(1));
                modelVeiculo.setCodigoVeiculo(this.getResultSet().getInt(2));
                modelVeiculo.setLimpeza(this.getResultSet().getDouble(3));
                modelVeiculo.setMecanica(this.getResultSet().getDouble(4));
                modelVeiculo.setFunilaria(this.getResultSet().getDouble(5));
                modelVeiculo.setRevisao(this.getResultSet().getDouble(6));
                modelVeiculo.setDebitos(this.getResultSet().getDouble(7));
                modelVeiculo.setOutros(this.getResultSet().getDouble(8));
                listamodelDespesaVaiculo.add(modelVeiculo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelDespesaVaiculo;
        
    }
    
}
