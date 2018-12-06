package DAO;

import conexoes.ConexaoMySql;
import model.ModelHistorico;

/**
 *
 * @author cicero.ramos
 */
public class DAOHistorico extends ConexaoMySql {

    public int salvarVendasDAO(ModelHistorico pModelHistorico) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbhistorico ("

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
                    + "email, "
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
                    + "observacao_veiculo, "
                    + "data_compra, "
                    + "tipo, "
                    + "tipo_negociacao, "
                    + "data_venda, "
                    + "desconto, "
                    + "valor_venda, "
                    + "observacao_venda"
                    + ") VALUES ("
                    + "'" + pModelHistorico.getNome() + "',"
                    + "'" + pModelHistorico.getCpf()+ "',"
                    + "'" + pModelHistorico.getRg()+ "',"
                    + "'" + pModelHistorico.getDataNascimento()+"',"
                    + "'" + pModelHistorico.getEndereco() + "',"
                    + "'" + pModelHistorico.getBairro() + "',"
                    + "'" + pModelHistorico.getCep() + "',"
                    + "'" + pModelHistorico.getCidade() + "',"
                    + "'" + pModelHistorico.getEstado() + "',"
                    + "'" + pModelHistorico.getComplemento()+ "',"
                    + "'" + pModelHistorico.getTelefone() + "',"
                    + "'" + pModelHistorico.getCelular()+"',"    
                    + "'" + pModelHistorico.getEmail()+ "',"
                    + "'" + pModelHistorico.getPlaca() + "',"
                    + "'" + pModelHistorico.getAnoFabricacao() + "',"
                    + "'" + pModelHistorico.getAnoModelo() + "',"
                    + "'" + pModelHistorico.getChassi() + "',"
                    + "'" + pModelHistorico.getRenavam() + "',"
                    + "'" + pModelHistorico.getMarca() + "',"
                    + "'" + pModelHistorico.getModelo() + "',"
                    + "'" + pModelHistorico.getCor() + "',"
                    + "'" + pModelHistorico.getCombustivel() + "',"
                    + "'" + pModelHistorico.getKmRodados() + "',"
                    + "'" + pModelHistorico.getMotor() + "',"
                    + "'" + pModelHistorico.getCustoAquisicao() + "',"
                    + "'" + pModelHistorico.getValorVenda() + "',"
                    + "'" + pModelHistorico.getObservacao_veiculo() + "',"
                    + "'" + pModelHistorico.getDataCompra() + "',"
                    + "'" + pModelHistorico.getTipo() + "',"        
                    + "'" + pModelHistorico.getTipoNegociacao() + "',"
                    + "'" + pModelHistorico.getDataVenda() + "',"
                    + "'" + pModelHistorico.getDesconto() + "',"
                    + "'" + pModelHistorico.getValorVenda() + "',"
                    + "'" + pModelHistorico.getObservacao_venda() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

}
