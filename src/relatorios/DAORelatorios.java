package relatorios;

import conexoes.ConexaoMySql;
import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;

/**
 *
 * @author cicero
 */
public class DAORelatorios extends ConexaoMySql {

    public boolean gerarRelatorioCliente() {   //aqui
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     ESTADO AS estado_uf, "
                    + "     CIDADE AS cidade_nome, "
                    + "     NOME AS clientes_NOME, "
                    + "     ENDERECO AS clientes_ENDERECO, "
                    + "     BAIRRO AS clientes_BAIRRO, "
                    + "     COMPLEMENTO AS clientes_COMPLEMENTO, "
                    + "     CEP AS clientes_CEP, "
                    + "     CELULAR AS clientes_CELULAR, "
                    + "     TELEFONE AS clientes_TELEFONE, "
                    + "     CODIGO AS clientes_CODIGO, "
                    + "     CPF AS clientes_CPF, "
                    + "     RG AS clientes_RG, "
                    + "     OBSERVACAO AS clientes_OBSERVACAO, "
                    + "     EMAIL AS clientes_EMAIL, "
                    + "     DATA_NASCIMENTO AS clientes_DATA_NASCIMENTO "
                    + " FROM "
                    + "   tbcliente "
                    + " ORDER BY NOME ASC ");

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioClientes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/SYSSEV/relClientes.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean exportarCliente() {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     ESTADO AS estado_uf, "
                    + "     CIDADE AS cidade_nome, "
                    + "     NOME AS clientes_NOME, "
                    + "     ENDERECO AS clientes_ENDERECO, "
                    + "     BAIRRO AS clientes_BAIRRO, "
                    + "     COMPLEMENTO AS clientes_COMPLEMENTO, "
                    + "     CEP AS clientes_CEP, "
                    + "     CELULAR AS clientes_CELULAR, "
                    + "     TELEFONE AS clientes_TELEFONE, "
                    + "     CODIGO AS clientes_CODIGO, "
                    + "     CPF AS clientes_CPF, "
                    + "     RG AS clientes_RG, "
                    + "     OBSERVACAO AS clientes_OBSERVACAO, "
                    + "     EMAIL AS clientes_EMAIL, "
                    + "     DATA_NASCIMENTO AS clientes_DATA_NASCIMENTO "
                    + " FROM "
                    + "   tbcliente "
                    + "     ORDER BY cliente.NOME ASC ");

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/exportarClientes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            JRXlsExporter exporter = new JRXlsExporter();
            ByteArrayOutputStream xlsReport = new ByteArrayOutputStream();
            exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRXlsExporterParameter.OUTPUT_STREAM, xlsReport);
            exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS, Boolean.TRUE);
            exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND, Boolean.TRUE);
            exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
            exporter.setParameter(JRXlsExporterParameter.OUTPUT_FILE_NAME, "C:/SYSSEV/relatorio.xls");

            exporter.exportReport();
            byte[] bytes = xlsReport.toByteArray();
            xlsReport.close();
            OutputStream ouputStream = new FileOutputStream("C:/SYSSEV/relatorio.xls");
            ouputStream.write(bytes, 0, bytes.length);
            ouputStream.flush();
            ouputStream.close();

//            String nomeArquivo = "C:/BLHair/relClientes.pdf";
//            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
//            File file = new File(nomeArquivo);
//            try {
//                Desktop.getDesktop().open(file);
//            } catch (Exception e) {
//                JOptionPane.showConfirmDialog(null, e);
//            }
//            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioClienteIndividual(int pCodigoCliente) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     ESTADO AS estado_uf, "
                    + "     CIDADE AS cidade_nome, "
                    + "     NOME AS clientes_NOME, "
                    + "     ENDERECO AS clientes_ENDERECO, "
                    + "     BAIRRO AS clientes_BAIRRO, "
                    + "     COMPLEMENTO AS clientes_COMPLEMENTO, "
                    + "     CEP AS clientes_CEP, "
                    + "     CELULAR AS clientes_CELULAR, "
                    + "     TELEFONE AS clientes_TELEFONE, "
                    + "     CODIGO AS clientes_CODIGO, "
                    + "     CPF AS clientes_CPF, "
                    + "     RG AS clientes_RG, "
                    + "     OBSERVACAO AS clientes_OBSERVACAO, "
                    + "     EMAIL AS clientes_EMAIL, "
                    + "     DATA_NASCIMENTO AS clientes_DATA_NASCIMENTO "
                    + " FROM "
                    + "   tbcliente "
                    + " WHERE CODIGO = '" + pCodigoCliente + "'");

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioClientes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/SYSSEV/relClientesIndividual.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioVeiculoIndividual(int pCodigoVeiculo) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + " tbopcionais.OPCIONAIS AS opcionais,  "
                    + " tbveiculo.PLACA as placa_veiculo,"
                    + " tbveiculo.ANO_FABRICACAO as anof_veiculo,"
                    + " tbveiculo.ANO_MODELO as anom_veiculo,"
                    + " tbveiculo.MARCA as marca_veiculo,"
                    + " tbveiculo.MODELO as modelo_veiculo,"
                    + " tbveiculo.COR as cor_veiculo,"
                    + " tbveiculo.COMBUSTIVEL as combustivel_veiculo,"
                    + " tbveiculo.KM_RODADOS as km_veiculo,"
                    + " tbveiculo.MOTOR as motor_veiculo,"
                    + " tbveiculo.OBSERVACAO as obs_veiculo,"
                    + " tbveiculo.TIPO as tipo_veiculo,"
                    + " tbveiculo.VALOR_VENDA as valorVenda_veiculo"
                    + " from "
                    + " tbopcionais "
                    + "inner join "
                    + " tbveiculo tbveiculo on tbveiculo.codigo = tbopcionais.CODIGO_VEICULO "
                    + "where "
                    + " tbopcionais.CODIGO_VEICULO= '" + pCodigoVeiculo + "'");

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVeiculoIndividual.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/SYSSEV/relVeiculoIndividual.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioTotalVeiculos() {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + " tbopcionais.OPCIONAIS AS opcionais,  "
                    + " tbveiculo.PLACA as placa_veiculo,"
                    + " tbveiculo.ANO_FABRICACAO as anof_veiculo,"
                    + " tbveiculo.ANO_MODELO as anom_veiculo,"
                    + " tbveiculo.MARCA as marca_veiculo,"
                    + " tbveiculo.MODELO as modelo_veiculo,"
                    + " tbveiculo.COR as cor_veiculo,"
                    + " tbveiculo.COMBUSTIVEL as combustivel_veiculo,"
                    + " tbveiculo.KM_RODADOS as km_veiculo,"
                    + " tbveiculo.MOTOR as motor_veiculo,"
                    + " tbveiculo.OBSERVACAO as obs_veiculo,"
                    + " tbveiculo.TIPO as tipo_veiculo,"
                    + " tbveiculo.VALOR_VENDA as valorVenda_veiculo"
                    + " from "
                    + "   tbopcionais "
                    + " inner join "
                    + "    tbveiculo tbveiculo on tbveiculo.codigo = tbopcionais.CODIGO_VEICULO "
                    + " where tbveiculo.SITUACAO = 'DISPONIVEL' "
                    + " ORDER BY tbveiculo.CODIGO "
            );

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioTotalVeiculos.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/SYSSEV/relVeiculoTotal.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    //----------------------------------------------------------------------------------------------------------------------------------------
    public boolean gerarRelatorioVendaIndividual(int pCodigo) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + " tbcliente.ESTADO AS estado_uf, "
                    + " tbcliente.CIDADE AS cidade_nome, "
                    + " tbcliente.NOME AS clientes_NOME, "
                    + " tbcliente.ENDERECO AS clientes_ENDERECO, "
                    + " tbcliente.BAIRRO AS clientes_BAIRRO, "
                    + " tbcliente.COMPLEMENTO AS clientes_COMPLEMENTO, "
                    + " tbcliente.CEP AS clientes_CEP, "
                    + " tbcliente.CELULAR AS clientes_CELULAR, "
                    + " tbcliente.TELEFONE AS clientes_TELEFONE, "
                    + " tbcliente.CPF AS clientes_CPF, "
                    + " tbcliente.RG AS clientes_RG, "
                    + " tbcliente.OBSERVACAO AS clientes_OBSERVACAO, "
                    + " tbcliente.EMAIL AS clientes_EMAIL, "
                    + " tbcliente.DATA_NASCIMENTO AS clientes_DATA_NASCIMENTO, "
                    + " tbvenda.CODIGO as codigo, "
                    + " tbvenda.TIPO_NEGOCIACAO as tipo_negociacao, "
                    + " tbvenda.DATA_VENDA as data_venda, "
                    + " tbvenda.DESCONTO as desconto, "
                    + " tbvenda.VALOR_VENDA as valorVenda_veiculo,"
                    + " tbvenda.OBSERVACAO as observacao_venda, "
                    + " tbvenda.PLACA as placa_veiculo, "
                    + " tbvenda.ANO_FABRICACAO as anof_veiculo,"
                    + " tbvenda.ANO_MODELO as anom_veiculo,"
                    + " tbvenda.MARCA as marca_veiculo,"
                    + " tbvenda.MODELO as modelo_veiculo,"
                    + " tbvenda.COR as cor_veiculo,"
                    + " tbvenda.COMBUSTIVEL as combustivel_veiculo,"
                    + " tbvenda.KM_RODADOS as km_veiculo,"
                    + " tbvenda.MOTOR as motor_veiculo,"
                    + " tbvenda.OBSERVACAO_VEICULO as obs_veiculo,"
                    + " tbvenda.TIPO as tipo_veiculo"
                    + " FROM "
                    + "   tbvenda tbvenda "
                    + "  INNER JOIN tbcliente tbcliente ON tbvenda.CODIGO_CLIENTE = tbcliente.CODIGO "
                    + "  where tbvenda.CODIGO = '" + pCodigo + "'");
            
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVendas.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/SYSSEV/relrelatorioVendas.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean gerarRelatorioVendaImpressao(int pCodigo) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + " tbcliente.ESTADO AS estado_uf, "
                    + " tbcliente.CIDADE AS cidade_nome, "
                    + " tbcliente.NOME AS clientes_NOME, "
                    + " tbcliente.ENDERECO AS clientes_ENDERECO, "
                    + " tbcliente.BAIRRO AS clientes_BAIRRO, "
                    + " tbcliente.COMPLEMENTO AS clientes_COMPLEMENTO, "
                    + " tbcliente.CEP AS clientes_CEP, "
                    + " tbcliente.CELULAR AS clientes_CELULAR, "
                    + " tbcliente.TELEFONE AS clientes_TELEFONE, "
                    + " tbcliente.CPF AS clientes_CPF, "
                    + " tbcliente.RG AS clientes_RG, "
                    + " tbcliente.OBSERVACAO AS clientes_OBSERVACAO, "
                    + " tbcliente.EMAIL AS clientes_EMAIL, "
                    + " tbcliente.DATA_NASCIMENTO AS clientes_DATA_NASCIMENTO, "
                    + " tbvenda.CODIGO as codigo, "
                    + " tbvenda.TIPO_NEGOCIACAO as tipo_negociacao, "
                    + " tbvenda.DATA_VENDA as data_venda, "
                    + " tbvenda.DESCONTO as desconto, "
                    + " tbvenda.VALOR_VENDA as valorVenda_veiculo,"
                    + " tbvenda.OBSERVACAO as observacao_venda, "
                    + " tbvenda.PLACA as placa_veiculo, "
                    + " tbvenda.ANO_FABRICACAO as anof_veiculo,"
                    + " tbvenda.ANO_MODELO as anom_veiculo,"
                    + " tbvenda.MARCA as marca_veiculo,"
                    + " tbvenda.MODELO as modelo_veiculo,"
                    + " tbvenda.COR as cor_veiculo,"
                    + " tbvenda.COMBUSTIVEL as combustivel_veiculo,"
                    + " tbvenda.KM_RODADOS as km_veiculo,"
                    + " tbvenda.MOTOR as motor_veiculo,"
                    + " tbvenda.OBSERVACAO_VEICULO as obs_veiculo,"
                    + " tbvenda.TIPO as tipo_veiculo"
                    + " FROM "
                    + "   tbvenda tbvenda "
                    + "  INNER JOIN tbcliente tbcliente ON tbvenda.CODIGO_CLIENTE = tbcliente.CODIGO "
                    + "  where tbvenda.CODIGO = '" + pCodigo + "'");
            
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVendas.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/SYSSEV/relrelatorioVendas.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioVendaIndividualEmail(int pCodigo) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + " tbcliente.ESTADO AS estado_uf, "
                    + " tbcliente.CIDADE AS cidade_nome, "
                    + " tbcliente.NOME AS clientes_NOME, "
                    + " tbcliente.ENDERECO AS clientes_ENDERECO, "
                    + " tbcliente.BAIRRO AS clientes_BAIRRO, "
                    + " tbcliente.COMPLEMENTO AS clientes_COMPLEMENTO, "
                    + " tbcliente.CEP AS clientes_CEP, "
                    + " tbcliente.CELULAR AS clientes_CELULAR, "
                    + " tbcliente.TELEFONE AS clientes_TELEFONE, "
                    + " tbcliente.CPF AS clientes_CPF, "
                    + " tbcliente.RG AS clientes_RG, "
                    + " tbcliente.OBSERVACAO AS clientes_OBSERVACAO, "
                    + " tbcliente.EMAIL AS clientes_EMAIL, "
                    + " tbcliente.DATA_NASCIMENTO AS clientes_DATA_NASCIMENTO, "
                    + " tbvenda.CODIGO as codigo, "
                    + " tbvenda.TIPO_NEGOCIACAO as tipo_negociacao, "
                    + " tbvenda.DATA_VENDA as data_venda, "
                    + " tbvenda.DESCONTO as desconto, "
                    + " tbvenda.VALOR_VENDA as valorVenda_veiculo,"
                    + " tbvenda.OBSERVACAO as observacao_venda, "
                    + " tbvenda.PLACA as placa_veiculo, "
                    + " tbvenda.ANO_FABRICACAO as anof_veiculo,"
                    + " tbvenda.ANO_MODELO as anom_veiculo,"
                    + " tbvenda.MARCA as marca_veiculo,"
                    + " tbvenda.MODELO as modelo_veiculo,"
                    + " tbvenda.COR as cor_veiculo,"
                    + " tbvenda.COMBUSTIVEL as combustivel_veiculo,"
                    + " tbvenda.KM_RODADOS as km_veiculo,"
                    + " tbvenda.MOTOR as motor_veiculo,"
                    + " tbvenda.OBSERVACAO_VEICULO as obs_veiculo,"
                    + " tbvenda.TIPO as tipo_veiculo"
                    + " FROM "
                    + "   tbvenda tbvenda "
                    + "  INNER JOIN tbcliente tbcliente ON tbvenda.CODIGO_CLIENTE = tbcliente.CODIGO "
                    + "  where tbvenda.CODIGO = '" + pCodigo + "'");
            
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVendas.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/SYSSEV/relrelatorioVendas.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            //irá criar o arquivo para anexar e mandar por email
            file.createNewFile(); 

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    
    public boolean gerarRelatorioVendasCliente(Date pDataInicial, Date dataFinal, int codigoCliente) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     vendas.CODIGO AS vendas_CODIGO, "
                    + "     vendas.CLIENTES_CODIGO AS vendas_CLIENTES_CODIGO, "
                    + "     vendas.DATA_EXECUCAO AS vendas_DATA_EXECUCAO, "
                    + "     vendas.VALOR_TOTAL AS vendas_VALOR_TOTAL, "
                    + "     vendas.DESCONTO AS vendas_DESCONTO, "
                    + "     VENDAS.FUNCIONARIO_CODIGO AS vendas_FUNCIONARIO_CODIGO," //ALTERACAO
                    + "     vendas_produto.QUANTIDADE AS vendas_produto_QUANTIDADE, "
                    + "     produtos.CODIGO AS produtos_CODIGO, "
                    + "     produtos.NOME AS produtos_NOME, "
                    + "     produtos.VALOR AS produtos_VALOR, "
                    + "     clientes.CODIGO AS clientes_CODIGO, "
                    + "     clientes.NOME AS clientes_NOME, "
                    + "     clientes.ENDERECO AS clientes_ENDERECO, "
                    + "     clientes.BAIRRO AS clientes_BAIRRO, "
                    + "     clientes.CEP AS clientes_CEP, "
                    + "     clientes.TELEFONE AS clientes_TELEFONE, "
                    + "     cidade.nome AS cidade_nome, "
                    + "     estado.uf AS estado_uf, "
                    + "     unidade_medida.abreviacao AS unidade_medida_abreviacao, "
                    + "     vendas.OBSERVACAO AS vendas_OBSERVACAO, "
                    + "     clientes.CPF_CNPJ AS clientes_CPF_CNPJ, "
                    + "     clientes.OBSERVACAO AS clientes_OBSERVACAO, "
                    + "     forma_pagamento.descricao AS forma_pagamento_descricao, "
                    + "     fornecedores.NOME AS fornecedores_NOME, "
                    + "     vendas_produto.`VALOR_UNITARIO` AS vendas_produto_VALOR_UNITARIO  "
                    + " FROM "
                    + "     vendas vendas INNER JOIN vendas_produto vendas_produto ON vendas.CODIGO = vendas_produto.CODIGO_VENDA "
                    + "     INNER JOIN produtos produtos ON vendas_produto.CODIGO_PRODUTO = produtos.CODIGO "
                    + "     INNER JOIN unidade_medida unidade_medida ON produtos.UNIDADE_MEDIDA = unidade_medida.codigo "
                    + "     INNER JOIN fornecedores fornecedores ON produtos.FORNECEDORES_CODIGO = fornecedores.CODIGO "
                    + "     INNER JOIN clientes clientes ON vendas.CLIENTES_CODIGO = clientes.CODIGO "
                    + "     INNER JOIN forma_pagamento forma_pagamento ON vendas.TIPO_PAGAMENTO = forma_pagamento.codigo "
                    + "     INNER JOIN estado estado ON clientes.COD_ESTADO = estado.codigo "
                    + "     INNER JOIN cidade cidade ON clientes.COD_CIDADE = cidade.codigo "
                    + "     AND estado.codigo = cidade.fk_cod_estado "
                    + "WHERE "
                    + "(data_EXECUCAO BETWEEN  '" + pDataInicial + "' AND '" + dataFinal + "' )"
                    + "AND (vendas.tipo = 1) "
                    + "AND (clientes.codigo = '" + codigoCliente + "')");
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVendasPorCliente.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/BLHAIR/relVendasPorCliente.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioVendasClienteMes(int mes, int codigoCliente) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     vendas.CODIGO AS vendas_CODIGO, "
                    + "     vendas.CLIENTES_CODIGO AS vendas_CLIENTES_CODIGO, "
                    + "     vendas.DATA_EXECUCAO AS vendas_DATA_EXECUCAO, "
                    + "     vendas.VALOR_TOTAL AS vendas_VALOR_TOTAL, "
                    + "     vendas.DESCONTO AS vendas_DESCONTO, "
                    + "     VENDAS.FUNCIONARIO_CODIGO AS vendas_FUNCIONARIO_CODIGO," //ALTERACAO
                    + "     vendas_produto.QUANTIDADE AS vendas_produto_QUANTIDADE, "
                    + "     produtos.CODIGO AS produtos_CODIGO, "
                    + "     produtos.NOME AS produtos_NOME, "
                    + "     produtos.VALOR AS produtos_VALOR, "
                    + "     clientes.CODIGO AS clientes_CODIGO, "
                    + "     clientes.NOME AS clientes_NOME, "
                    + "     clientes.ENDERECO AS clientes_ENDERECO, "
                    + "     clientes.BAIRRO AS clientes_BAIRRO, "
                    + "     clientes.CEP AS clientes_CEP, "
                    + "     clientes.TELEFONE AS clientes_TELEFONE, "
                    + "     cidade.nome AS cidade_nome, "
                    + "     estado.uf AS estado_uf, "
                    + "     unidade_medida.abreviacao AS unidade_medida_abreviacao, "
                    + "     vendas.OBSERVACAO AS vendas_OBSERVACAO, "
                    + "     clientes.CPF_CNPJ AS clientes_CPF_CNPJ, "
                    + "     clientes.OBSERVACAO AS clientes_OBSERVACAO, "
                    + "     forma_pagamento.descricao AS forma_pagamento_descricao, "
                    + "     fornecedores.NOME AS fornecedores_NOME, "
                    + "     vendas_produto.`VALOR_UNITARIO` AS vendas_produto_VALOR_UNITARIO  "
                    + " FROM "
                    + "     vendas vendas INNER JOIN vendas_produto vendas_produto ON vendas.CODIGO = vendas_produto.CODIGO_VENDA "
                    + "     INNER JOIN produtos produtos ON vendas_produto.CODIGO_PRODUTO = produtos.CODIGO "
                    + "     INNER JOIN unidade_medida unidade_medida ON produtos.UNIDADE_MEDIDA = unidade_medida.codigo "
                    + "     INNER JOIN fornecedores fornecedores ON produtos.FORNECEDORES_CODIGO = fornecedores.CODIGO "
                    + "     INNER JOIN clientes clientes ON vendas.CLIENTES_CODIGO = clientes.CODIGO "
                    + "     INNER JOIN forma_pagamento forma_pagamento ON vendas.TIPO_PAGAMENTO = forma_pagamento.codigo "
                    + "     INNER JOIN estado estado ON clientes.COD_ESTADO = estado.codigo "
                    + "     INNER JOIN cidade cidade ON clientes.COD_CIDADE = cidade.codigo "
                    + "     AND estado.codigo = cidade.fk_cod_estado "
                    + "WHERE "
                    + "( MONTH(DATA_EXECUCAO) = '" + mes + "')"
                    + "AND (vendas.tipo = 1) "
                    + "AND (clientes.codigo = '" + codigoCliente + "')");
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVendasPorClienteMes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/BLHAIR/relVendasPorClienteMes.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioVendaTodosCliente(Date pDataInicial, Date dataFinal) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     vendas.CODIGO AS vendas_CODIGO, "
                    + "     vendas.CLIENTES_CODIGO AS vendas_CLIENTES_CODIGO, "
                    + "     vendas.DATA_EXECUCAO AS vendas_DATA_EXECUCAO, " //ALTERADO DE DATA_VENDA PARA DATA_EXECUCAO
                    + "     vendas.VALOR_TOTAL AS vendas_VALOR_TOTAL, "
                    + "     vendas.DESCONTO AS vendas_DESCONTO, "
                    + "     VENDAS.FUNCIONARIO_CODIGO AS vendas_FUNCIONARIO_CODIGO," //ALTERACAO
                    + "     vendas_produto.QUANTIDADE AS vendas_produto_QUANTIDADE, "
                    + "     produtos.CODIGO AS produtos_CODIGO, "
                    + "     produtos.NOME AS produtos_NOME, "
                    + "     produtos.VALOR AS produtos_VALOR, "
                    + "     clientes.CODIGO AS clientes_CODIGO, "
                    + "     clientes.NOME AS clientes_NOME, "
                    + "     clientes.ENDERECO AS clientes_ENDERECO, "
                    + "     clientes.BAIRRO AS clientes_BAIRRO, "
                    + "     clientes.CEP AS clientes_CEP, "
                    + "     clientes.TELEFONE AS clientes_TELEFONE, "
                    + "     cidade.nome AS cidade_nome, "
                    + "     estado.uf AS estado_uf, "
                    + "     unidade_medida.abreviacao AS unidade_medida_abreviacao, "
                    + "     vendas.OBSERVACAO AS vendas_OBSERVACAO, "
                    + "     clientes.CPF_CNPJ AS clientes_CPF_CNPJ, "
                    + "     clientes.OBSERVACAO AS clientes_OBSERVACAO, "
                    + "     forma_pagamento.descricao AS forma_pagamento_descricao, "
                    + "     fornecedores.NOME AS fornecedores_NOME, "
                    + "     vendas_produto.`VALOR_UNITARIO` AS vendas_produto_VALOR_UNITARIO  "
                    + " FROM "
                    + "     vendas vendas INNER JOIN vendas_produto vendas_produto ON vendas.CODIGO = vendas_produto.CODIGO_VENDA "
                    + "     INNER JOIN produtos produtos ON vendas_produto.CODIGO_PRODUTO = produtos.CODIGO "
                    + "     INNER JOIN unidade_medida unidade_medida ON produtos.UNIDADE_MEDIDA = unidade_medida.codigo "
                    + "     INNER JOIN fornecedores fornecedores ON produtos.FORNECEDORES_CODIGO = fornecedores.CODIGO "
                    + "     INNER JOIN clientes clientes ON vendas.CLIENTES_CODIGO = clientes.CODIGO "
                    + "     INNER JOIN forma_pagamento forma_pagamento ON vendas.TIPO_PAGAMENTO = forma_pagamento.codigo "
                    + "     INNER JOIN estado estado ON clientes.COD_ESTADO = estado.codigo "
                    + "     INNER JOIN cidade cidade ON clientes.COD_CIDADE = cidade.codigo "
                    + "     AND estado.codigo = cidade.fk_cod_estado "
                    + "WHERE "
                    + "(data_EXECUCAO BETWEEN  '" + pDataInicial + "' AND '" + dataFinal + "' )"
                    + "AND (vendas.tipo = 1) GROUP BY vendas.CODIGO ");
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVendasPeriodo.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/BLHAIR/relVendasPeriodo.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioVendaTodosClienteMes(int mes) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "   vendas.DATA_EXECUCAO AS vendas_DATA_EXECUCAO, "
                    + "   round( SUM(vendas.VALOR_TOTAL),2) AS vendas_TOTAL_DIA "
                    + " FROM "
                    + "   vendas "
                    + " WHERE "
                    + " ( MONTH(DATA_EXECUCAO) = '" + mes + "')"
                    + " AND (vendas.tipo = 1)"
                    + " GROUP BY vendas.DATA_EXECUCAO ASC ");
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVendasPeriodoMes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/BLHAIR/relVendasMes.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Gerar relatório de venda de uma conta a receber
     *
     * @param pCodigo
     * @return
     */
    public boolean gerarRelatorioContaVenda(int pCodigo) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     vendas.CODIGO AS vendas_CODIGO, "
                    + "     vendas.CLIENTES_CODIGO AS vendas_CLIENTES_CODIGO, "
                    + "     vendas.DATA_VENDA AS vendas_DATA_VENDA, "
                    + "     vendas.VALOR_TOTAL AS vendas_VALOR_TOTAL, "
                    + "     vendas.DESCONTO AS vendas_DESCONTO, "
                    + "     vendas.TIPO_PAGAMENTO AS vendas_TIPO_PAGAMENTO, "
                    + "     vendas_produto.CODIGO AS vendas_produto_CODIGO, "
                    + "     vendas_produto.CODIGO_PRODUTO AS vendas_produto_CODIGO_PRODUTO, "
                    + "     vendas_produto.CODIGO_VENDA AS vendas_produto_CODIGO_VENDA, "
                    + "     vendas_produto.QUANTIDADE AS vendas_produto_QUANTIDADE, "
                    + "     produtos.CODIGO AS produtos_CODIGO, "
                    + "     produtos.FORNECEDORES_CODIGO AS produtos_FORNECEDORES_CODIGO, "
                    + "     produtos.NOME AS produtos_NOME, "
                    + "     produtos.VALOR AS produtos_VALOR, "
                    + "     produtos.ESTOQUE AS produtos_ESTOQUE, "
                    + "     produtos.CODIGO_BARRAS AS produtos_CODIGO_BARRAS, "
                    + "     clientes.CODIGO AS clientes_CODIGO, "
                    + "     clientes.NOME AS clientes_NOME, "
                    + "     clientes.ENDERECO AS clientes_ENDERECO, "
                    + "     clientes.BAIRRO AS clientes_BAIRRO, "
                    + "     clientes.CEP AS clientes_CEP, "
                    + "     clientes.TELEFONE AS clientes_TELEFONE, "
                    + "     clientes.EMAIL AS clientes_EMAIL, "
                    + "     cidade.nome AS cidade_nome, "
                    + "     estado.uf AS estado_uf "
                    + " FROM "
                    + "     clientes clientes INNER JOIN vendas vendas ON clientes.CODIGO = vendas.CLIENTES_CODIGO "
                    + "     INNER JOIN vendas_produto vendas_produto ON vendas.CODIGO = vendas_produto.CODIGO_VENDA "
                    + "     INNER JOIN produtos produtos ON vendas_produto.CODIGO_PRODUTO = produtos.CODIGO "
                    + "     INNER JOIN cidade cidade ON clientes.COD_CIDADE = cidade.codigo "
                    + "     INNER JOIN estado estado ON clientes.COD_ESTADO = estado.codigo "
                    + "     AND estado.codigo = cidade.fk_cod_estado "
                    + " WHERE vendas.CODIGO = '" + pCodigo + "';");
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioContaVendasReceber.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/BLHAIR/relContaVendasReceber.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Gerar relatorio de agenda
     *
     * @param pDataInicial
     * @param pDataFinal
     * @return
     */
    public boolean gerarRelatorioAgendaCliente(Date pDataInicial, Date pDataFinal) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     vendas.CODIGO AS vendas_CODIGO, "
                    + "     vendas.DATA_VENDA AS vendas_DATA_VENDA, "
                    + "     vendas.data_execucao AS vendas_data_execucao, "
                    + "     vendas.hora_execucao AS vendas_hora_execucao, "
                    + "     clientes.CODIGO AS clientes_CODIGO, "
                    + "     clientes.NOME AS clientes_NOME, "
                    + "     clientes.TELEFONE AS clientes_TELEFONE, "
                    + "     funcionario.NOME AS funcionario_NOME "
                    + " FROM "
                    + " vendas vendas "
                    + "    INNER JOIN clientes clientes ON vendas.CLIENTES_CODIGO = clientes.CODIGO "
                    + "    INNER JOIN funcionario funcionario ON vendas.FUNCIONARIO_CODIGO = funcionario.CODIGO "
                    + " WHERE "
                    + " vendas.data_execucao BETWEEN  '" + pDataInicial + "' AND '" + pDataFinal + "' AND vendas.tipo = '0';");

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioAgendaTotal.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/BLHAIR/relAgendaClienteTotal.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean gerarRelatorioAgendaIndividual(int pCodigo) { //alterar 1320
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     clientes.NOME AS clientes_NOME, "
                    + "     vendas.CODIGO AS vendas_CODIGO, "
                    + "     vendas.CLIENTES_CODIGO AS vendas_CLIENTES_CODIGO, "
                    + "     vendas.DATA_VENDA AS vendas_DATA_VENDA, "
                    + "     vendas.data_execucao AS vendas_data_execucao, "
                    + "     vendas.hora_execucao AS vendas_hora_execucao, "
                    + "     clientes.TELEFONE AS clientes_TELEFONE, "
                    + "     clientes.CODIGO AS clientes_CODIGO, "
                    + "     clientes.ENDERECO AS clientes_ENDERECO, "
                    + "     clientes.BAIRRO AS clientes_BAIRRO, "
                    + "     clientes.CEP AS clientes_CEP, "
                    + "     cidade. nome  AS cidade_nome, "
                    + "     estado. uf  AS estado_uf, "
                    + "     produtos.CODIGO AS produtos_CODIGO, "
                    + "     produtos.NOME AS produtos_NOME, "
                    + "     produtos.VALOR AS produtos_VALOR, "
                    + "     produtos.FABRICANTE AS produtos_FABRICANTE, "
                    + "     vendas_produto.VALOR_UNITARIO AS vendas_produto_VALOR_UNITARIO, "
                    + "     vendas_produto.QUANTIDADE AS vendas_produto_QUANTIDADE, "
                    + "     funcionario.NOME AS funcionario_NOME "
                    + " FROM "
                    + "     vendas vendas "
                    + "      INNER JOIN vendas_produto vendas_produto ON vendas.CODIGO = vendas_produto.CODIGO_VENDA "
                    + "      INNER JOIN produtos produtos ON vendas_produto.CODIGO_PRODUTO = produtos.CODIGO "
                    + "      INNER JOIN fornecedores fornecedores ON produtos.FORNECEDORES_CODIGO = fornecedores.CODIGO "
                    + "      INNER JOIN clientes clientes ON vendas.CLIENTES_CODIGO = clientes.CODIGO "
                    + "      INNER JOIN funcionario funcionario ON vendas.FUNCIONARIO_CODIGO = funcionario.CODIGO "
                    + "      INNER JOIN estado estado ON clientes.COD_ESTADO = estado.codigo "
                    + "      INNER JOIN cidade cidade ON clientes.COD_CIDADE = cidade.codigo "
                    + "      AND estado.codigo = cidade.fk_cod_estado "
                    + " WHERE "
                    + " (vendas.codigo = '" + pCodigo + "') "
                    + " AND (vendas.tipo = 0)");

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioAgenda.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/BLHAIR/relAgendaCliente.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
