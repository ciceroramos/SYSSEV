package view;

import conexoes.ConexaoMySql;
import controller.ControllerDespesaVeiculo;
import controller.ControllerInfoAuto;
import controller.ControllerOpcionais;
import controller.ControllerVeiculo;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelAutoInfo;
import model.ModelDespesaVeiculo;
import model.ModelOpcionais;
import model.ModelVeiculo;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import util.AguardeGerandoRelatorio;
import util.BLDatas;
import util.BLTiraAcentos;
import util.ModeloTabelaGeralPequena;
import util.ModeloTabelaGeralVeiculo;

/**
 *
 * @author cicero.ramos
 */
public class ViewVeiculos extends javax.swing.JFrame {

    ModelVeiculo modelVeiculo = new ModelVeiculo();
    ModelVeiculo modelVeiculoDespesa = new ModelVeiculo();
    ControllerVeiculo controllerVeiculo = new ControllerVeiculo();
    ArrayList<ModelVeiculo> listaModelVeiculo = new ArrayList<>();
    ArrayList<ModelVeiculo> listDespesaVeiculo = new ArrayList<>();
    ControllerOpcionais controllerOpcionais = new ControllerOpcionais();
    ArrayList<ModelOpcionais> listaModelOpcionais = new ArrayList<>();
    ControllerDespesaVeiculo controllerDespesaVeiculo = new ControllerDespesaVeiculo();
    ModelDespesaVeiculo modelDespesaVeiculo = new ModelDespesaVeiculo();
    ModelAutoInfo modelAutoInfo = new ModelAutoInfo();
    ControllerInfoAuto controllerInfo = new ControllerInfoAuto();
    ArrayList<ModelAutoInfo> listaModelAutoInfo = new ArrayList<>();

    BLDatas bl = new BLDatas();

    String tipoCadastro, filename = null;

    /**
     * Creates new form ViewVeiculos
     */
    public ViewVeiculos() {
        initComponents();
        tbVeiculo.setDefaultRenderer(Object.class, new ModeloTabelaGeralVeiculo());
        tdDespesas.setDefaultRenderer(Object.class, new ModeloTabelaGeralPequena());
        tbDialogDespesa.setDefaultRenderer(Object.class, new ModeloTabelaGeralPequena());
        this.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        carregarVeiculo();

    }

    private void somaCustos() {

        Float d = Float.parseFloat(tfDebitos.getText());
        Float o = Float.parseFloat(tfOutros.getText());
        Float f = Float.parseFloat(tfFunilaria.getText());
        Float m = Float.parseFloat(tfMecanica.getText());
        Float l = Float.parseFloat(tfLimpeza.getText());
        Float r = Float.parseFloat(tfRevisao.getText());

        Float total = d + o + f + m + l + r;
        tfTotalDespeza.setText(total.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMopcionais = new javax.swing.JMenuItem();
        jMdespesas = new javax.swing.JMenuItem();
        jDdespesa = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDialogDespesa = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jDopcionais = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListaOpcionais = new javax.swing.JList();
        jLabel28 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVeiculo = new javax.swing.JTable();
        btIncluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btExportar = new javax.swing.JButton();
        btAjuda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        tfFabricacao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfAnoModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfChassi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfRenavam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cdLMotor = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        tfCor = new javax.swing.JTextField();
        cblCombustivel = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfKm = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cdSituacao = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfObservacao = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        cbAr = new javax.swing.JCheckBox();
        cbDH = new javax.swing.JCheckBox();
        cbDE = new javax.swing.JCheckBox();
        cbArbag = new javax.swing.JCheckBox();
        cbABS = new javax.swing.JCheckBox();
        cbSom = new javax.swing.JCheckBox();
        cbKM = new javax.swing.JCheckBox();
        cbVE = new javax.swing.JCheckBox();
        cbAlarme = new javax.swing.JCheckBox();
        cbTE = new javax.swing.JCheckBox();
        cbRE = new javax.swing.JCheckBox();
        cbBC = new javax.swing.JCheckBox();
        cbCapotaMaritima = new javax.swing.JCheckBox();
        cbComputadorBordo = new javax.swing.JCheckBox();
        cbArQuente = new javax.swing.JCheckBox();
        cbControleTracao = new javax.swing.JCheckBox();
        cbSensorEsta = new javax.swing.JCheckBox();
        cbRetrovisor = new javax.swing.JCheckBox();
        cbTetoSolar = new javax.swing.JCheckBox();
        cbGPS = new javax.swing.JCheckBox();
        cbLimpadorTrazeiro = new javax.swing.JCheckBox();
        cbEncostoCabeca = new javax.swing.JCheckBox();
        cbVolante = new javax.swing.JCheckBox();
        cbNeblina = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfLimpeza = new javax.swing.JTextField();
        tfMecanica = new javax.swing.JTextField();
        tfFunilaria = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfRevisao = new javax.swing.JTextField();
        tfDebitos = new javax.swing.JTextField();
        tfOutros = new javax.swing.JTextField();
        tfTotalDespeza = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tdDespesas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        cBPartidaEletrica = new javax.swing.JCheckBox();
        cBdiscoDianteiro = new javax.swing.JCheckBox();
        cBrodaLeve = new javax.swing.JCheckBox();
        cBabs = new javax.swing.JCheckBox();
        cBcbs = new javax.swing.JCheckBox();
        cBfreioTraseiro = new javax.swing.JCheckBox();
        tfCusto = new javax.swing.JTextField();
        tfValorVenda = new javax.swing.JTextField();
        cdTipo = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        rbCarro = new javax.swing.JRadioButton();
        rbMoto = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();

        jPopupMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMopcionais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMopcionais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/List.png"))); // NOI18N
        jMopcionais.setText("Exibir Opcionais");
        jMopcionais.setActionCommand("");
        jMopcionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMopcionaisActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMopcionais);

        jMdespesas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMdespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Calculator.png"))); // NOI18N
        jMdespesas.setText("Exibir Despesas");
        jMdespesas.setActionCommand("");
        jMdespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdespesasActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMdespesas);

        jDdespesa.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDdespesa.setTitle("Informações <<SysSeV>>");

        tbDialogDespesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LIMPEZA", "MECÂNICA", "FUNILARIA", "REVISÃO", "DÉBITOS", "OUTROS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbDialogDespesa);
        if (tbDialogDespesa.getColumnModel().getColumnCount() > 0) {
            tbDialogDespesa.getColumnModel().getColumn(0).setResizable(false);
            tbDialogDespesa.getColumnModel().getColumn(1).setResizable(false);
            tbDialogDespesa.getColumnModel().getColumn(2).setResizable(false);
            tbDialogDespesa.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Informações das Despesas do Veículo selecionado");

        javax.swing.GroupLayout jDdespesaLayout = new javax.swing.GroupLayout(jDdespesa.getContentPane());
        jDdespesa.getContentPane().setLayout(jDdespesaLayout);
        jDdespesaLayout.setHorizontalGroup(
            jDdespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDdespesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDdespesaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDdespesaLayout.setVerticalGroup(
            jDdespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDdespesaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDopcionais.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDopcionais.setTitle("Informações <<SysSeV>>");

        jListaOpcionais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane5.setViewportView(jListaOpcionais);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 51));
        jLabel28.setText("Lista de Opcionais do Veículo");

        javax.swing.GroupLayout jDopcionaisLayout = new javax.swing.GroupLayout(jDopcionais.getContentPane());
        jDopcionais.getContentPane().setLayout(jDopcionaisLayout);
        jDopcionaisLayout.setHorizontalGroup(
            jDopcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDopcionaisLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jDopcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jDopcionaisLayout.setVerticalGroup(
            jDopcionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDopcionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículos <<SysSev>>");
        setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        tbVeiculo.setAutoCreateRowSorter(true);
        tbVeiculo.setBackground(new java.awt.Color(245, 245, 245));
        tbVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Modelo/Descrição", "Ano Fabricação", "Ano Modelo", "Valor Venda", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVeiculo.setComponentPopupMenu(jPopupMenu1);
        tbVeiculo.setShowVerticalLines(false);
        tbVeiculo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbVeiculo);

        btIncluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Add.png"))); // NOI18N
        btIncluir.setText("Incluir");
        btIncluir.setBorder(null);
        btIncluir.setContentAreaFilled(false);
        btIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Modify.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setBorder(null);
        btAlterar.setContentAreaFilled(false);
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setBorder(null);
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/print.png"))); // NOI18N
        btImprimir.setText("Imprimir");
        btImprimir.setBorder(null);
        btImprimir.setContentAreaFilled(false);
        btImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pesquise:");

        tfPesquisa.setBackground(new java.awt.Color(245, 245, 245));
        tfPesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfPesquisa.setOpaque(false);
        tfPesquisa.setSelectionColor(new java.awt.Color(102, 102, 255));
        tfPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisaFocusLost(evt);
            }
        });
        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyReleased(evt);
            }
        });

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Find.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setBorder(null);
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btExportar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Table.png"))); // NOI18N
        btExportar.setText("Exportar Lista");
        btExportar.setBorder(null);
        btExportar.setContentAreaFilled(false);
        btExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarActionPerformed(evt);
            }
        });

        btAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Help.png"))); // NOI18N
        btAjuda.setBorder(null);
        btAjuda.setContentAreaFilled(false);
        btAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(btAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(btExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Lista", jPanel1);

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Turn off.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setBorder(null);
        btCancelar.setContentAreaFilled(false);
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Apply.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setBorder(null);
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Código:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(245, 245, 245));
        tfCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfCodigo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PLACA:");

        tfPlaca.setBackground(new java.awt.Color(204, 255, 255));
        tfPlaca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPlaca.setEnabled(false);
        tfPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ano Fabricação:");

        tfFabricacao.setBackground(new java.awt.Color(255, 255, 204));
        tfFabricacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfFabricacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfFabricacao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfFabricacao.setEnabled(false);
        tfFabricacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFabricacaoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ano Modelo:");

        tfAnoModelo.setBackground(new java.awt.Color(255, 255, 204));
        tfAnoModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfAnoModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAnoModelo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfAnoModelo.setEnabled(false);
        tfAnoModelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAnoModeloFocusLost(evt);
            }
        });
        tfAnoModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAnoModeloKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CHASSI:");

        tfChassi.setBackground(new java.awt.Color(245, 245, 245));
        tfChassi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfChassi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfChassi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfChassi.setEnabled(false);
        tfChassi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfChassiFocusLost(evt);
            }
        });
        tfChassi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfChassiKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("RENAVAM:");

        tfRenavam.setBackground(new java.awt.Color(245, 245, 245));
        tfRenavam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfRenavam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRenavam.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfRenavam.setEnabled(false);
        tfRenavam.setOpaque(false);
        tfRenavam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfRenavamKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("MARCA:");

        cbMarca.setBackground(new java.awt.Color(245, 245, 245));
        cbMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbMarca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        cbMarca.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Motor / Cilindrada:");

        cdLMotor.setBackground(new java.awt.Color(245, 245, 245));
        cdLMotor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cdLMotor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        cdLMotor.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Cor Predominante:");

        tfCor.setBackground(new java.awt.Color(245, 245, 245));
        tfCor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfCor.setEnabled(false);
        tfCor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCorFocusLost(evt);
            }
        });

        cblCombustivel.setBackground(new java.awt.Color(245, 245, 245));
        cblCombustivel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cblCombustivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GASOLINA", "ETANOL", "DIESEL", "GÁS FLEX", "FLEX", "HÍBRIDO" }));
        cblCombustivel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        cblCombustivel.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Combustível:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("KM Rodados:");

        tfKm.setBackground(new java.awt.Color(245, 245, 245));
        tfKm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfKm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfKm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfKm.setEnabled(false);

        jDate.setBackground(new java.awt.Color(204, 255, 204));
        jDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        jDate.setForeground(new java.awt.Color(0, 0, 0));
        jDate.setEnabled(false);
        jDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Data Cadastro:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Situação:");

        cdSituacao.setBackground(new java.awt.Color(255, 255, 153));
        cdSituacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cdSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DISPONIVEL", "RESERVADO" }));
        cdSituacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        cdSituacao.setEnabled(false);

        tfObservacao.setColumns(20);
        tfObservacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfObservacao.setRows(5);
        tfObservacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfObservacao.setEnabled(false);
        tfObservacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfObservacaoFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(tfObservacao);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Observações:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Valor Venda:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Custo:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Modelo / Descrição:");

        tfModelo.setBackground(new java.awt.Color(245, 245, 245));
        tfModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfModelo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfModelo.setEnabled(false);
        tfModelo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfModeloFocusLost(evt);
            }
        });

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));

        cbAr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbAr.setText("Ar-Condicionado");
        cbAr.setEnabled(false);
        cbAr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbDH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbDH.setText("D.H");
        cbDH.setEnabled(false);
        cbDH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbDE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbDE.setText("D.E");
        cbDE.setEnabled(false);
        cbDE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbArbag.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbArbag.setText("ARBAG");
        cbArbag.setEnabled(false);
        cbArbag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbABS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbABS.setText("ABS");
        cbABS.setEnabled(false);
        cbABS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbSom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbSom.setText("Som");
        cbSom.setEnabled(false);
        cbSom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbKM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbKM.setText("Kit Multimídea");
        cbKM.setEnabled(false);
        cbKM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbVE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbVE.setText("Vidros Elétricos");
        cbVE.setEnabled(false);
        cbVE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbAlarme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbAlarme.setText("Alarme");
        cbAlarme.setEnabled(false);

        cbTE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbTE.setText("Trava Elétrica");
        cbTE.setEnabled(false);

        cbRE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbRE.setText("Rodas Esportivas");
        cbRE.setEnabled(false);

        cbBC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbBC.setText("Banco em Couro");
        cbBC.setEnabled(false);

        cbCapotaMaritima.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbCapotaMaritima.setText("Capota Marítima");
        cbCapotaMaritima.setEnabled(false);

        cbComputadorBordo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbComputadorBordo.setText("Computador de Bordo");
        cbComputadorBordo.setEnabled(false);

        cbArQuente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbArQuente.setText("Ar-Quente");
        cbArQuente.setEnabled(false);

        cbControleTracao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbControleTracao.setText("Controle de Tração");
        cbControleTracao.setEnabled(false);

        cbSensorEsta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbSensorEsta.setText("Sensor de Estacionamento");
        cbSensorEsta.setEnabled(false);

        cbRetrovisor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbRetrovisor.setText("Retrovisores Elétricos");
        cbRetrovisor.setEnabled(false);

        cbTetoSolar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbTetoSolar.setText("Teto Solar");
        cbTetoSolar.setEnabled(false);

        cbGPS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbGPS.setText("GPS");
        cbGPS.setEnabled(false);
        cbGPS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbLimpadorTrazeiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbLimpadorTrazeiro.setText("Limpador Trazeiro");
        cbLimpadorTrazeiro.setEnabled(false);
        cbLimpadorTrazeiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbEncostoCabeca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbEncostoCabeca.setText("Encosto de Cabeça Traseiro");
        cbEncostoCabeca.setEnabled(false);
        cbEncostoCabeca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbVolante.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbVolante.setText("Comandos No Volante");
        cbVolante.setEnabled(false);

        cbNeblina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbNeblina.setText("Farol de Neblina");
        cbNeblina.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEncostoCabeca)
                    .addComponent(cbLimpadorTrazeiro)
                    .addComponent(cbAr)
                    .addComponent(cbDH)
                    .addComponent(cbDE)
                    .addComponent(cbArbag)
                    .addComponent(cbGPS)
                    .addComponent(cbVE)
                    .addComponent(cbKM)
                    .addComponent(cbABS)
                    .addComponent(cbSom)
                    .addComponent(cbVolante))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbNeblina)
                    .addComponent(cbBC)
                    .addComponent(cbControleTracao)
                    .addComponent(cbCapotaMaritima)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAlarme)
                            .addComponent(cbTE)
                            .addComponent(cbRE)))
                    .addComponent(cbTetoSolar)
                    .addComponent(cbComputadorBordo)
                    .addComponent(cbArQuente)
                    .addComponent(cbRetrovisor)
                    .addComponent(cbSensorEsta))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbAlarme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbBC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbControleTracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCapotaMaritima))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbAr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbArbag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbABS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSom)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTetoSolar)
                    .addComponent(cbKM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbComputadorBordo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbVE, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbArQuente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbGPS, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbRetrovisor)
                    .addComponent(cbLimpadorTrazeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEncostoCabeca)
                    .addComponent(cbSensorEsta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVolante)
                    .addComponent(cbNeblina))
                .addGap(11, 11, 11))
        );

        jTabbedPane2.addTab("Opcionais Veículos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("LIMPEZA: R$");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("MECÂNICA: R$");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("FUNILARIA: R$");

        tfLimpeza.setBackground(new java.awt.Color(245, 245, 245));
        tfLimpeza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLimpeza.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfLimpeza.setEnabled(false);

        tfMecanica.setBackground(new java.awt.Color(245, 245, 245));
        tfMecanica.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMecanica.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfMecanica.setEnabled(false);

        tfFunilaria.setBackground(new java.awt.Color(245, 245, 245));
        tfFunilaria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfFunilaria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfFunilaria.setEnabled(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("REVISÃO: R$");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("DÉBITOS: R$");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("OUTROS: R$");

        tfRevisao.setBackground(new java.awt.Color(245, 245, 245));
        tfRevisao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRevisao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfRevisao.setEnabled(false);

        tfDebitos.setBackground(new java.awt.Color(245, 245, 245));
        tfDebitos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDebitos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfDebitos.setEnabled(false);

        tfOutros.setBackground(new java.awt.Color(245, 245, 245));
        tfOutros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfOutros.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfOutros.setEnabled(false);

        tfTotalDespeza.setEditable(false);
        tfTotalDespeza.setBackground(new java.awt.Color(255, 102, 102));
        tfTotalDespeza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfTotalDespeza.setForeground(new java.awt.Color(255, 255, 255));
        tfTotalDespeza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTotalDespeza.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfTotalDespeza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTotalDespezaFocusLost(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Total despeza: R$");

        tdDespesas.setAutoCreateRowSorter(true);
        tdDespesas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tdDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LIMPESA", "MECANICA", "FUNILARIA", "REVISÃO", "DÉBITOS", "OUTROS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tdDespesas.setShowVerticalLines(false);
        tdDespesas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tdDespesas);
        if (tdDespesas.getColumnModel().getColumnCount() > 0) {
            tdDespesas.getColumnModel().getColumn(0).setResizable(false);
            tdDespesas.getColumnModel().getColumn(1).setResizable(false);
            tdDespesas.getColumnModel().getColumn(2).setResizable(false);
            tdDespesas.getColumnModel().getColumn(3).setResizable(false);
            tdDespesas.getColumnModel().getColumn(4).setResizable(false);
            tdDespesas.getColumnModel().getColumn(5).setResizable(false);
        }
        tdDespesas.getAccessibleContext().setAccessibleParent(jTabbedPane2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLimpeza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMecanica, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel21)
                                .addGap(9, 9, 9)
                                .addComponent(tfFunilaria, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(tfRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel23)
                                .addGap(12, 12, 12)
                                .addComponent(tfDebitos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfTotalDespeza, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfLimpeza, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMecanica, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(tfFunilaria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDebitos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotalDespeza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)))
        );

        jTabbedPane2.addTab("Despesas", jPanel4);

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));

        cBPartidaEletrica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cBPartidaEletrica.setText("Partida Elética");
        cBPartidaEletrica.setEnabled(false);

        cBdiscoDianteiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cBdiscoDianteiro.setText("Freio a Disco Dianteiro");
        cBdiscoDianteiro.setEnabled(false);

        cBrodaLeve.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cBrodaLeve.setText("Roda Liga Leve");
        cBrodaLeve.setEnabled(false);

        cBabs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cBabs.setText("ABS");
        cBabs.setEnabled(false);

        cBcbs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cBcbs.setText("CBS");
        cBcbs.setEnabled(false);

        cBfreioTraseiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cBfreioTraseiro.setText("Freio a Disco Traseiro");
        cBfreioTraseiro.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBfreioTraseiro)
                    .addComponent(cBPartidaEletrica)
                    .addComponent(cBabs))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBdiscoDianteiro)
                    .addComponent(cBcbs)
                    .addComponent(cBrodaLeve))
                .addGap(59, 59, 59))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBPartidaEletrica)
                    .addComponent(cBdiscoDianteiro))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBabs)
                    .addComponent(cBcbs))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBfreioTraseiro)
                    .addComponent(cBrodaLeve))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Opcionais Motos", jPanel5);

        tfCusto.setBackground(new java.awt.Color(204, 255, 204));
        tfCusto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCusto.setForeground(new java.awt.Color(255, 51, 0));
        tfCusto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCusto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tfValorVenda.setBackground(new java.awt.Color(204, 255, 204));
        tfValorVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfValorVenda.setForeground(new java.awt.Color(0, 102, 204));
        tfValorVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValorVenda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cdTipo.setBackground(new java.awt.Color(245, 245, 245));
        cdTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cdTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NOVO", "USADO" }));
        cdTipo.setSelectedIndex(1);
        cdTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 1, true));
        cdTipo.setEnabled(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Tipo:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("R$");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("R$");

        rbCarro.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup1.add(rbCarro);
        rbCarro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbCarro.setText("CARRO");
        rbCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCarroActionPerformed(evt);
            }
        });

        rbMoto.setBackground(new java.awt.Color(245, 245, 245));
        buttonGroup1.add(rbMoto);
        rbMoto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbMoto.setText("MOTO");
        rbMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMotoActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 0));
        jLabel31.setText(">> Selecione o tipo de cadastro ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(783, 783, 783)
                        .addComponent(jLabel17)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(716, 716, 716)
                        .addComponent(jLabel29)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel30)
                                .addGap(12, 12, 12)
                                .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel11)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel9)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(cblCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(cdLMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(tfKm, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel10))
                                            .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel4))
                                            .addComponent(tfFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel5))
                                            .addComponent(tfAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel15))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel2)
                                    .addGap(76, 76, 76)
                                    .addComponent(jLabel13)
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel26)
                                    .addGap(95, 95, 95)
                                    .addComponent(jLabel14))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(cdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(cdSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel3)
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel7)
                                        .addGap(153, 153, 153)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(tfRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(tfChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel18)
                                            .addGap(121, 121, 121)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(rbCarro)
                        .addGap(21, 21, 21)
                        .addComponent(rbMoto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13)
                            .addComponent(jLabel26)
                            .addComponent(jLabel14))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel18))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel12)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cblCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdLMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(tfKm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(6, 6, 6)
                                .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(tfFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(3, 3, 3)
                                        .addComponent(tfAnoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(3, 3, 3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarActionPerformed
        String nomeArquivo = JOptionPane.showInputDialog(this, "Informe o nome do arquivo para a exportação", "Solicitação", JOptionPane.QUESTION_MESSAGE);
        filename = "C:/" + nomeArquivo + ".xls";  // local do arquivo
        exportarVeiculos();
    }//GEN-LAST:event_btExportarActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        novoVeiculo();
        tfPlaca.requestFocus();
        tipoCadastro = "NOVO";

    }//GEN-LAST:event_btIncluirActionPerformed

    private void listaInfoCarro() {

        listaModelAutoInfo = controllerInfo.getListaInfoAutoController();
        cbMarca.removeAllItems();
        for (int i = 0; i < listaModelAutoInfo.size(); i++) {
            cbMarca.addItem(listaModelAutoInfo.get(i).getMarca_carro());
            cdLMotor.addItem(listaModelAutoInfo.get(i).getMotor_carro());

        }

    }

    private void listaInfoMoto() {

        listaModelAutoInfo = controllerInfo.getListaInfoAutoController();
        cbMarca.removeAllItems();
        for (int i = 0; i < listaModelAutoInfo.size(); i++) {
            cbMarca.addItem(listaModelAutoInfo.get(i).getMarca_moto());
            cdLMotor.addItem(listaModelAutoInfo.get(i).getMotor_moto());

        }

    }


    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarCampos();
        tbVeiculo.clearSelection();
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_btCancelarActionPerformed


    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        int selecao = tbVeiculo.getSelectedRow();

        if (selecao < 0) {

            JOptionPane.showMessageDialog(this, "Selecione um Veículo para Alterar");
        } else {
            tipoCadastro = "ALTERAR";
            habilitaCampos();
           //listaInfoCarro();
            //listaInfoMoto();
            recuperarVeiculo();
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void tfRenavamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRenavamKeyReleased
        String cp = tfRenavam.getText();
        cp = cp.replaceAll("\\D*", ""); //ignora qualquer coisa que não seja numero.  
        int cont = cp.length();
        if (cont > 10 - 1) {
            try {
                JOptionPane.showMessageDialog(null, "O RENAVAM CONSISTE EM 11 DÍGITOS!");
            } catch (Error e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_tfRenavamKeyReleased

    private void tfChassiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfChassiKeyReleased
        String cp = tfChassi.getText();
        int cont = cp.length();
        if (cont >= 16 - 1) {
            try {
                JOptionPane.showMessageDialog(null, "O CHASSI CONSISTE EM 17 DÍGITOS!");
            } catch (Error e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_tfChassiKeyReleased

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        int linha = tbVeiculo.getSelectedRow();
        int codigo = (int) tbVeiculo.getValueAt(linha, 0);
        String nome = (String) tbVeiculo.getValueAt(linha, 1);

        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerVeiculo.excluirVeiculoController(codigo)) {
                controllerOpcionais.excluirOpcionaisController(codigo);
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarVeiculo();
                desabilitarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btExcluirActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        DefaultTableModel tabela = (DefaultTableModel) this.tbVeiculo.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbVeiculo.setRowSorter(sorter);
        String text = tfPesquisa.getText();
        sorter.setRowFilter(RowFilter.regexFilter(text, 1));


    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tfModeloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfModeloFocusLost
        // converte em maiusculo o que o usuario digitar
        this.tfModelo.setText(tfModelo.getText().toUpperCase());
        //tira acentos
        BLTiraAcentos blTiraAcentos = new BLTiraAcentos();
        this.tfModelo.setText(blTiraAcentos.TiraAcentos(tfModelo.getText()));


    }//GEN-LAST:event_tfModeloFocusLost

    private void tfPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaFocusLost
        // converte em maiusculo o que o usuario digitar
        this.tfPesquisa.setText(tfPesquisa.getText().toUpperCase());
        //tira acentos
        BLTiraAcentos blTiraAcentos = new BLTiraAcentos();
        this.tfPesquisa.setText(blTiraAcentos.TiraAcentos(tfPesquisa.getText()));
    }//GEN-LAST:event_tfPesquisaFocusLost

    private void tfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyReleased

        DefaultTableModel tabela = (DefaultTableModel) this.tbVeiculo.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbVeiculo.setRowSorter(sorter);
        String text = tfPesquisa.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text, 2));
        }


    }//GEN-LAST:event_tfPesquisaKeyReleased

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (tipoCadastro.equals("NOVO")) {
            salvarVeiculo();
        } else if (tipoCadastro.equals("ALTERAR")) {
            alterarVeiculo();
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfFabricacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFabricacaoKeyReleased
        String cp = tfFabricacao.getText();
        cp = cp.replaceAll("\\D*", ""); //ignora qualquer coisa que não seja numero.  
        int cont = cp.length();
        if (cont > 4) {
            try {
                JOptionPane.showMessageDialog(null, "O Ano de Fabricação CONSISTE EM 4 DÍGITOS!");
            } catch (Error e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_tfFabricacaoKeyReleased

    private void tfAnoModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAnoModeloKeyReleased
        String cp = tfAnoModelo.getText();
        cp = cp.replaceAll("\\D*", ""); //ignora qualquer coisa que não seja numero.  
        int cont = cp.length();
        if (cont > 4) {
            try {

                JOptionPane.showMessageDialog(null, "O Ano do Modelo CONSISTE EM 4 DÍGITOS!");
            } catch (Error e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_tfAnoModeloKeyReleased

    private void verificaModelo() {

        int ano = Integer.parseInt(tfFabricacao.getText());
        int modelo = Integer.parseInt(tfAnoModelo.getText());
        if (modelo < ano) {
            JOptionPane.showMessageDialog(null, "O ano do modelo não pode ser menor que o ano de fabricação");
            tfAnoModelo.setText("");
        }

    }

    private void tfTotalDespezaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTotalDespezaFocusLost
        somaCustos();
    }//GEN-LAST:event_tfTotalDespezaFocusLost

    private void tfChassiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfChassiFocusLost

        tfChassi.setText(tfChassi.getText().toUpperCase());

    }//GEN-LAST:event_tfChassiFocusLost

    private void tfCorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCorFocusLost
        tfCor.setText(tfCor.getText().toUpperCase());
    }//GEN-LAST:event_tfCorFocusLost

    private void tfObservacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfObservacaoFocusLost
        tfObservacao.setText(tfObservacao.getText().toUpperCase());
    }//GEN-LAST:event_tfObservacaoFocusLost

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed

        int linhaSelecionada = tbVeiculo.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {

            final AguardeGerandoRelatorio carregando = new AguardeGerandoRelatorio();
            final ControllerVeiculo controllerVeiculo = new ControllerVeiculo();
            carregando.setVisible(true);
            Thread t = new Thread() {
                @Override
                public void run() {
                    // imprimir clientes
                    controllerVeiculo.gerarRelatorioVeiculoIndividual((int) tbVeiculo.getValueAt(tbVeiculo.getSelectedRow(), 0));
                    carregando.dispose();
                }
            };
            t.start();
        }

    }//GEN-LAST:event_btImprimirActionPerformed

    private void jMopcionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMopcionaisActionPerformed
        //recebe a linha selecionada
        int linha = this.tbVeiculo.getSelectedRow();
        //pega o codigo do veiculo na linha selecionada
        int codigo = (Integer) tbVeiculo.getValueAt(linha, 0);

        listaModelOpcionais = controllerOpcionais.getListaOpcionaisCodVController(codigo);
        DefaultListModel lista = new DefaultListModel();
        int cont = listaModelOpcionais.size();
        for (int i = 0; i < cont; i++) {

            lista.addElement(listaModelOpcionais.get(i).getOpcionais());
            jListaOpcionais.setModel(lista);
        }
        jDopcionais.pack();
        jDopcionais.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        jDopcionais.setVisible(true);
        jDopcionais.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMopcionaisActionPerformed

    private void jMdespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdespesasActionPerformed

        //recebe a linha selecionada
        int linha = this.tbVeiculo.getSelectedRow();
        //pega o codigo do veiculo na linha selecionada
        int codigo = (Integer) tbVeiculo.getValueAt(linha, 0);

        listDespesaVeiculo = controllerVeiculo.getListaVeiculoDespesaController(codigo);
        DefaultTableModel modelo = (DefaultTableModel) tbDialogDespesa.getModel();
        modelo.setNumRows(0);
        int cont = listDespesaVeiculo.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listDespesaVeiculo.get(i).getLimpeza(),
                listDespesaVeiculo.get(i).getMecanica(),
                listDespesaVeiculo.get(i).getFunilaria(),
                listDespesaVeiculo.get(i).getRevisao(),
                listDespesaVeiculo.get(i).getDebitos(),
                listDespesaVeiculo.get(i).getOutros()

            });
        }
        jDdespesa.pack();
        jDdespesa.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        jDdespesa.setVisible(true);
        jDdespesa.setLocationRelativeTo(null);

    }//GEN-LAST:event_jMdespesasActionPerformed

    private void tfAnoModeloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAnoModeloFocusLost
        verificaModelo();

    }//GEN-LAST:event_tfAnoModeloFocusLost

    private void btAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjudaActionPerformed

        JOptionPane.showMessageDialog(rootPane, "Utilizando as Funções do Cadastro de Veículo.\n"
                + "\n"
                + "Para a inclusão de um veículo deve-se utilizar o botão INCLUIR, que levará para a tela de cadastro onde é recomendado"
                + " o preenchimento dos campos, já na abas de OPCIONAIS E DESPESAS \n"
                + "o preenchimento será de acordo com cada perfil do veículo.\n"
                + " \n"
                + "O botão de CANCELAR pode ser utilizado para cancelar qualquer ação errônea.\n"
                + " \n"
                + "O botão de SALVAR é utilizado para salvar qualquer cadastro NOVO e qualquer ALTERAÇÃO realizada.\n"
                + " \n"
                + "Para alterar alguma informação do veículo selecione o campo para modifica-lo.\n"
                + "\n"
                + "Após a inclusão do veículo, o sistema lhe oferece a opção de ALTERAR onde basta selecionar o veículo"
                + " desejado na tabela acima e clicar em alterar, que irá exibir todas as informações cadastradas \n "
                + "do veículo como as despesas e opcionais. "
                + "\n"
                + "Para a exclusão de um veículo, basta selecionar e clicar no botão EXCLUIR.\n"
                + " \n"
                + "Para a impressão de um veículo, basta selecionar e clicar no botão IMPRIMIR.\n"
                + " \n"
                + "Na área da tabela ao precionar o botão direito do mouse disponibilizamos duas opções para a visualização dos OPCIONAIS e DESPESAS"
                + " do veículo selecionado.\n"
                + " \n"
                + "Disponibilizamos a opção de exportação da lista dos veículo disponíveis no estoque, basta clicar no botão EXPORTAR LISTA e informar"
                + " um nome parao arquivo, onde esse arquivo será salvo na unidade C:\\", "Ajuda", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btAjudaActionPerformed

    private void rbCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCarroActionPerformed
        cbMarca.removeAllItems();
        cdLMotor.removeAllItems();
        listaInfoCarro();
        jTabbedPane2.setSelectedIndex(0);

    }//GEN-LAST:event_rbCarroActionPerformed

    private void rbMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMotoActionPerformed
        cdLMotor.removeAllItems();
        cbMarca.removeAllItems();
        listaInfoMoto();                        
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_rbMotoActionPerformed

    private void carregarVeiculo() {

        listaModelVeiculo = controllerVeiculo.getListaVeiculoDisponivelController();
        DefaultTableModel modelo = (DefaultTableModel) tbVeiculo.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaModelVeiculo.size();
        System.out.println(cont);
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelVeiculo.get(i).getCodigo(),
                listaModelVeiculo.get(i).getTipo(),
                listaModelVeiculo.get(i).getModelo(),
                listaModelVeiculo.get(i).getAnoFabricacao(),
                listaModelVeiculo.get(i).getAnoModelo(),
                listaModelVeiculo.get(i).getValorVenda(),
                listaModelVeiculo.get(i).getSituacao()
            });
        }

    }

    private void novoVeiculo() {

        habilitaCampos();
        tipoCadastro = "NOVO";
        tfCodigo.setText("NOVO");
        tfPlaca.setText("");
        tfRenavam.setText("");
        tfChassi.setText("");
        tfModelo.setText("");
        tfCor.setText("");
        tfFabricacao.setText("");
        tfAnoModelo.setText("");
        tfKm.setText("");
        tfObservacao.setText("");
        tfCusto.setText("");
        tfValorVenda.setText("");
        tfDebitos.setText("");
        tfOutros.setText("");
        tfFunilaria.setText("");
        tfMecanica.setText("");
        tfLimpeza.setText("");
        tfRevisao.setText("");

        tfDebitos.setText("0.0");
        tfOutros.setText("0.0");
        tfFunilaria.setText("0.0");
        tfMecanica.setText("0.0");
        tfLimpeza.setText("0.0");
        tfRevisao.setText("0.0");

    }

    private void habilitaCampos() {
        tfPlaca.setEnabled(true);
        tfRenavam.setEnabled(true);
        tfChassi.setEnabled(true);
        tfModelo.setEnabled(true);
        tfCor.setEnabled(true);
        tfFabricacao.setEnabled(true);
        tfAnoModelo.setEnabled(true);
        tfKm.setEnabled(true);
        tfObservacao.setEnabled(true);
        tfCusto.setEnabled(true);
        tfValorVenda.setEnabled(true);
        tfDebitos.setEnabled(true);
        tfOutros.setEnabled(true);
        tfFunilaria.setEnabled(true);
        tfMecanica.setEnabled(true);
        tfLimpeza.setEnabled(true);
        tfRevisao.setEnabled(true);
        jDate.setEnabled(true);
        jDate.setDate(new java.util.Date());
        cdTipo.setEnabled(true);
        cdSituacao.setEnabled(true);
        cbMarca.setEnabled(true);
        cblCombustivel.setEnabled(true);
        cdLMotor.setEnabled(true);

        habilitaOpcionais();
    }

    private void habilitaOpcionais() {

        cbABS.setEnabled(true);
        cbAlarme.setEnabled(true);
        cbAr.setEnabled(true);
        cbArbag.setEnabled(true);
        cbBC.setEnabled(true);
        cbDE.setEnabled(true);
        cbDH.setEnabled(true);
        cbKM.setEnabled(true);
        cbRE.setEnabled(true);
        cbSom.setEnabled(true);
        cbTE.setEnabled(true);
        cbVE.setEnabled(true);
        cbGPS.setEnabled(true);
        cbLimpadorTrazeiro.setEnabled(true);
        cbEncostoCabeca.setEnabled(true);
        cbCapotaMaritima.setEnabled(true);
        cbTetoSolar.setEnabled(true);
        cbComputadorBordo.setEnabled(true);
        cbArQuente.setEnabled(true);
        cbControleTracao.setEnabled(true);
        cbRetrovisor.setEnabled(true);
        cbSensorEsta.setEnabled(true);
        cbNeblina.setEnabled(true);
        cbVolante.setEnabled(true);

        //relação com moto
        cBPartidaEletrica.setEnabled(true);
        cBabs.setEnabled(true);
        cBcbs.setEnabled(true);
        cBdiscoDianteiro.setEnabled(true);
        cBfreioTraseiro.setEnabled(true);
        cBrodaLeve.setEnabled(true);
        //

        tfDebitos.setText("0.0");
        tfOutros.setText("0.0");
        tfFunilaria.setText("0.0");
        tfMecanica.setText("0.0");
        tfLimpeza.setText("0.0");
        tfRevisao.setText("0.0");

    }

    private void desabilitaOpcionais() {

        cbABS.setEnabled(false);
        cbAlarme.setEnabled(false);
        cbAr.setEnabled(false);
        cbArbag.setEnabled(false);
        cbBC.setEnabled(false);
        cbDE.setEnabled(false);
        cbDH.setEnabled(false);
        cbKM.setEnabled(false);
        cbRE.setEnabled(false);
        cbSom.setEnabled(false);
        cbTE.setEnabled(false);
        cbVE.setEnabled(false);
        cbGPS.setEnabled(false);
        cbLimpadorTrazeiro.setEnabled(false);
        cbEncostoCabeca.setEnabled(false);
        cbCapotaMaritima.setEnabled(false);
        cbTetoSolar.setEnabled(false);
        cbComputadorBordo.setEnabled(false);
        cbArQuente.setEnabled(false);
        cbRetrovisor.setEnabled(false);
        cbSensorEsta.setEnabled(false);
        cbControleTracao.setEnabled(false);

        cbABS.setSelected(false);
        cbAlarme.setSelected(false);
        cbAr.setSelected(false);
        cbArbag.setSelected(false);
        cbBC.setSelected(false);
        cbDE.setSelected(false);
        cbDH.setSelected(false);
        cbKM.setSelected(false);
        cbRE.setSelected(false);
        cbSom.setSelected(false);
        cbTE.setSelected(false);
        cbVE.setSelected(false);
        cbGPS.setSelected(false);
        cbLimpadorTrazeiro.setSelected(false);
        cbEncostoCabeca.setSelected(false);
        cbCapotaMaritima.setSelected(false);
        cbTetoSolar.setSelected(false);
        cbComputadorBordo.setSelected(false);
        cbControleTracao.setSelected(false);
        cbArQuente.setSelected(false);
        cbRetrovisor.setSelected(false);
        cbSensorEsta.setSelected(false);
        cbNeblina.setEnabled(false);
        cbVolante.setEnabled(false);

        // relação com a moto
        cBPartidaEletrica.setSelected(false);
        cBPartidaEletrica.setEnabled(false);
        cBabs.setSelected(false);
        cBabs.setEnabled(false);
        cBcbs.setSelected(false);
        cBcbs.setEnabled(false);
        cBdiscoDianteiro.setSelected(false);
        cBdiscoDianteiro.setEnabled(false);
        cBfreioTraseiro.setSelected(false);
        cBfreioTraseiro.setEnabled(false);
        cBrodaLeve.setSelected(false);
        cBrodaLeve.setEnabled(false);

    }

    private void desabilitarCampos() {
        tfCodigo.setText("");
        tfPlaca.setText("");
        tfRenavam.setText("");
        tfChassi.setText("");
        tfModelo.setText("");
        tfCor.setText("");
        tfFabricacao.setText("");
        tfAnoModelo.setText("");
        tfKm.setText("");
        tfObservacao.setText("");
        tfCusto.setText("");
        tfValorVenda.setText("");
        tfDebitos.setText("");
        tfOutros.setText("");
        tfFunilaria.setText("");
        tfMecanica.setText("");
        tfLimpeza.setText("");
        tfRevisao.setText("");
        tfTotalDespeza.setText("");
        jDate.setDate(null);

        DefaultTableModel modelo = (DefaultTableModel) tdDespesas.getModel();
        modelo.setNumRows(0);

        tfPlaca.setEnabled(false);
        tfRenavam.setEnabled(false);
        jDate.setEnabled(false);
        cdTipo.setEnabled(false);
        tfChassi.setEnabled(false);
        tfModelo.setEnabled(false);
        tfCor.setEnabled(false);
        tfFabricacao.setEnabled(false);
        tfAnoModelo.setEnabled(false);
        tfKm.setEnabled(false);
        tfObservacao.setEnabled(false);
        tfCusto.setEnabled(false);
        tfValorVenda.setEnabled(false);
        tfDebitos.setEnabled(false);
        tfOutros.setEnabled(false);
        tfFunilaria.setEnabled(false);
        tfMecanica.setEnabled(false);
        tfLimpeza.setEnabled(false);
        tfRevisao.setEnabled(false);
        jDate.setEnabled(false);
        cdSituacao.setEnabled(false);
        cbMarca.setEnabled(false);
        cblCombustivel.setEnabled(false);
        cdLMotor.setEnabled(false);

        desabilitaOpcionais();
    }

    private boolean salvarVeiculo() {

        BLDatas bl = new BLDatas();
        modelVeiculo = new ModelVeiculo();

        if (jDate.getDate() == null || tfPlaca.getText().equals("") || tfChassi.getText().equals("") || tfRenavam.getText().equals("") || tfModelo.getText().equals("") || tfFabricacao.getText().equals("") || tfAnoModelo.getText().equals("") || tfCusto.getText().equals("") || tfValorVenda.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Alguns itens não foram preenchidos!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            tfPlaca.requestFocus();
            return false;

        } else {

            try {
                modelVeiculo.setDataCompra(bl.converterDataParaDateUS(jDate.getDate()));
            } catch (Exception ex) {
                Logger.getLogger(ViewVeiculos.class.getName()).log(Level.SEVERE, null, ex);
            }

            modelVeiculo.setTipo(cdTipo.getSelectedItem().toString());
            modelVeiculo.setSituacao(cdSituacao.getSelectedItem().toString());
            modelVeiculo.setPlaca(tfPlaca.getText());
            modelVeiculo.setRenavam(tfRenavam.getText());
            modelVeiculo.setChassi(tfChassi.getText());
            modelVeiculo.setMarca(cbMarca.getSelectedItem().toString());
            modelVeiculo.setModelo(tfModelo.getText());
            modelVeiculo.setCor(tfCor.getText());
            modelVeiculo.setAnoFabricacao(tfFabricacao.getText());
            modelVeiculo.setAnoModelo(tfAnoModelo.getText());
            modelVeiculo.setCombustivel(cblCombustivel.getSelectedItem().toString());
            modelVeiculo.setMotor(cdLMotor.getSelectedItem().toString());
            modelVeiculo.setKmRodados(tfKm.getText());
            modelVeiculo.setObservacao(tfObservacao.getText());
            modelVeiculo.setCustoAquisicao(Double.parseDouble(tfCusto.getText()));
            modelVeiculo.setValorVenda(Double.parseDouble(tfValorVenda.getText()));

            modelVeiculo.setLimpeza(Double.parseDouble(tfLimpeza.getText()));
            modelVeiculo.setMecanica(Double.parseDouble(tfFunilaria.getText()));
            modelVeiculo.setFunilaria(Double.parseDouble(tfMecanica.getText()));
            modelVeiculo.setRevisao(Double.parseDouble(tfRevisao.getText()));
            modelVeiculo.setDebitos(Double.parseDouble(tfDebitos.getText()));
            modelVeiculo.setOutros(Double.parseDouble(tfOutros.getText()));

            int codigoVeiculo = controllerVeiculo.salvarVeiculoController(modelVeiculo);
            if (codigoVeiculo > 0) {
                modelVeiculo.setCodigo(codigoVeiculo);
                controllerVeiculo.salvarDespesasVeiculosController(modelVeiculo);
                controllerOpcionais.salvarOpcionaisVeiculosController(setarDadosOpcionaisVeiculos(codigoVeiculo));
                JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
                desabilitarCampos();
                carregarVeiculo();
                jTabbedPane1.setSelectedIndex(0);
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }

    private boolean alterarVeiculo() {

        try {
            modelVeiculo.setDataCompra(bl.converterDataParaDateUS(jDate.getDate()));
        } catch (Exception ex) {
            Logger.getLogger(ViewVeiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelVeiculo.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelVeiculo.setCodigoVeiculo(Integer.parseInt(this.tfCodigo.getText()));
        modelVeiculo.setTipo(cdTipo.getSelectedItem().toString());
        modelVeiculo.setSituacao(cdSituacao.getSelectedItem().toString());
        modelVeiculo.setPlaca(tfPlaca.getText());
        modelVeiculo.setRenavam(tfRenavam.getText());
        modelVeiculo.setChassi(tfChassi.getText());
        modelVeiculo.setMarca(cbMarca.getSelectedItem().toString());
        modelVeiculo.setModelo(tfModelo.getText());
        modelVeiculo.setCor(tfCor.getText());
        modelVeiculo.setAnoFabricacao(tfFabricacao.getText());
        modelVeiculo.setAnoModelo(tfAnoModelo.getText());
        modelVeiculo.setCombustivel(cblCombustivel.getSelectedItem().toString());
        modelVeiculo.setMotor(cdLMotor.getSelectedItem().toString());
        modelVeiculo.setKmRodados(tfKm.getText());
        modelVeiculo.setObservacao(tfObservacao.getText());
        modelVeiculo.setCustoAquisicao(Double.parseDouble(tfCusto.getText()));
        modelVeiculo.setValorVenda(Double.parseDouble(tfValorVenda.getText()));

        modelVeiculo.setLimpeza(Double.parseDouble(tfLimpeza.getText()));
        modelVeiculo.setMecanica(Double.parseDouble(tfFunilaria.getText()));
        modelVeiculo.setFunilaria(Double.parseDouble(tfMecanica.getText()));
        modelVeiculo.setRevisao(Double.parseDouble(tfRevisao.getText()));
        modelVeiculo.setDebitos(Double.parseDouble(tfDebitos.getText()));
        modelVeiculo.setOutros(Double.parseDouble(tfOutros.getText()));

        if (controllerVeiculo.atualizarVeiculoController(modelVeiculo)) {
            controllerVeiculo.salvarDespesasVeiculosController(modelVeiculo);
            controllerOpcionais.excluirOpcionaisController(modelVeiculo.getCodigoVeiculo());
            controllerOpcionais.salvarOpcionaisVeiculosController(setarDadosOpcionaisVeiculos(modelVeiculo.getCodigoVeiculo()));
            JOptionPane.showMessageDialog(this, "Registro Alterado com sucesso!");
            desabilitarCampos();
            carregarVeiculo();
            jTabbedPane1.setSelectedIndex(0);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public ModelOpcionais setarDadosOpcionaisVeiculos(int pCodigoVeiculo) {

        ArrayList<ModelOpcionais> listaModelOpcionais = new ArrayList();
        ModelOpcionais modelOpcionais = new ModelOpcionais();

        if (cbABS.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("ABS");
            listaModelOpcionais.add(modelOpcionais);
        }

        if (cbAlarme.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Alarme");
            listaModelOpcionais.add(modelOpcionais);
        }

        if (cbAr.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Ar-Condicionado");
            listaModelOpcionais.add(modelOpcionais);
        }

        if (cbArbag.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("ARBAG");
            listaModelOpcionais.add(modelOpcionais);
        }

        if (cbBC.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Banco em Couro");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbDE.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Direção Eletrica");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbDH.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Direção Hidraulica");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbKM.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Kit Multimidea");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbRE.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Rodas Esportivas");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbSom.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Som");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbTE.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Trava Eletrica");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbVE.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Vidro Eletrico");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbGPS.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("GPS");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbBC.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Banco em Couro");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbLimpadorTrazeiro.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Limpador Trazeiro");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbEncostoCabeca.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Encosto de Cabeça Trazeiro");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbCapotaMaritima.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Capota Maritima");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbTetoSolar.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Teto Solar");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbComputadorBordo.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Computador de Bordo");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbArQuente.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Ar-Quente");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbRetrovisor.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Retrovisor Eletrico");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbSensorEsta.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Sensor de Estacionamento");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbControleTracao.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Controle de Tração");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbNeblina.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Farol Neblina");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cbVolante.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Comando Volante");
            listaModelOpcionais.add(modelOpcionais);
        }

        //opcionais moto
        if (cBPartidaEletrica.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Partida Elétrica");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cBabs.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Freios ABS");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cBcbs.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Freios CBS");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cBdiscoDianteiro.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Freio a Disco Dianteiro");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cBfreioTraseiro.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Freio a Disco Traseiro");
            listaModelOpcionais.add(modelOpcionais);
        }
        if (cBrodaLeve.isSelected()) {
            modelOpcionais = new ModelOpcionais();
            modelOpcionais.setCodigoVeiculo(pCodigoVeiculo);
            modelOpcionais.setOpcionais("Roda de Liga Leve");
            listaModelOpcionais.add(modelOpcionais);
        }

        modelOpcionais.setListaModelOpcionaisVeiculo(listaModelOpcionais);
        return modelOpcionais;

    }

    private void atualizaDespeza(int pCodigo) {
        float totalDespeza = 0;
        try {

            String query = "select sum(limpeza + mecanica + funilaria + revisao + debitos + outros) as valor "
                    + "from tbdespesa_veiculo where codigo_veiculo = '" + pCodigo + "';";

            ConexaoMySql mysql = new ConexaoMySql();
            PreparedStatement pstm = (PreparedStatement) mysql.conectar().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                totalDespeza = Float.parseFloat(rs.getString("valor"));

            }
            tfTotalDespeza.setText(String.valueOf(totalDespeza));
        } catch (Exception e) {
            System.out.println("algun erro");
        }
    }

    private boolean recuperarVeiculo() {
        String marca,motor;
        
        //recebe a linha selecionada
        int linha = this.tbVeiculo.getSelectedRow();
        //pega o codigo do veiculo na linha selecionada
        int codigo = (Integer) tbVeiculo.getValueAt(linha, 0);
        try {
            modelVeiculo = controllerVeiculo.getVeiculoCodController(codigo);
            this.tfCodigo.setText(String.valueOf(modelVeiculo.getCodigo()));
            this.jDate.setDate(modelVeiculo.getDataCompra());
            this.cdTipo.setSelectedItem(modelVeiculo.getTipo());
            this.cdSituacao.setSelectedItem(modelVeiculo.getSituacao());
            this.tfPlaca.setText(modelVeiculo.getPlaca());
            this.tfRenavam.setText(modelVeiculo.getRenavam());
            this.tfChassi.setText(modelVeiculo.getChassi());
            marca = modelVeiculo.getMarca();
            System.out.println(marca);
            this.cbMarca.getModel().setSelectedItem(marca);
            this.tfModelo.setText(modelVeiculo.getModelo());
            this.tfCor.setText(modelVeiculo.getCor());
            this.tfFabricacao.setText(modelVeiculo.getAnoFabricacao());
            this.tfAnoModelo.setText(modelVeiculo.getAnoModelo());
            this.cblCombustivel.setSelectedItem(modelVeiculo.getCombustivel());
            motor = modelVeiculo.getMotor();
            this.cdLMotor.getModel().setSelectedItem(motor);
            this.tfKm.setText(modelVeiculo.getKmRodados());
            this.tfObservacao.setText(modelVeiculo.getObservacao());
            this.tfCusto.setText(String.valueOf(modelVeiculo.getCustoAquisicao()));
            this.tfValorVenda.setText(String.valueOf(modelVeiculo.getValorVenda()));

            listDespesaVeiculo = controllerVeiculo.getListaVeiculoDespesaController(codigo);
            DefaultTableModel modelo = (DefaultTableModel) tdDespesas.getModel();
            modelo.setNumRows(0);
            int cont = listDespesaVeiculo.size();
            for (int i = 0; i < cont; i++) {
                modelo.addRow(new Object[]{
                    listDespesaVeiculo.get(i).getLimpeza(),
                    listDespesaVeiculo.get(i).getMecanica(),
                    listDespesaVeiculo.get(i).getFunilaria(),
                    listDespesaVeiculo.get(i).getRevisao(),
                    listDespesaVeiculo.get(i).getDebitos(),
                    listDespesaVeiculo.get(i).getOutros()

                });

            }
            listaModelOpcionais = controllerOpcionais.getListaOpcionaisCodVController(codigo);

            for (int i = 0; i < listaModelOpcionais.size(); i++) {

                if (listaModelOpcionais.get(i).getOpcionais().equals("Ar-Condicionado")) {
                    cbAr.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Direção Hidraulica")) {
                    cbDH.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Direção Eletrica")) {
                    cbDE.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("ARBAG")) {
                    cbArbag.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("ABS")) {
                    cbABS.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Som")) {
                    cbSom.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Kit Multimidea")) {
                    cbKM.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Vidro Eletrico")) {
                    cbVE.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("GPS")) {
                    cbGPS.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Limpador Trazeiro")) {
                    cbLimpadorTrazeiro.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Encosto de Cabeça Trazeiro")) {
                    cbEncostoCabeca.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Alarme")) {
                    cbAlarme.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Trava Eletrica")) {
                    cbTE.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Rodas Esportivas")) {
                    cbRE.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Banco em Couro")) {
                    cbBC.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Banco em Couro")) {
                    cbBC.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Controle de Tração")) {
                    cbControleTracao.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Capota Maritima")) {
                    cbCapotaMaritima.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Teto Solar")) {
                    cbTetoSolar.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Computador de Bordo")) {
                    cbComputadorBordo.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Ar-Quente")) {
                    cbArQuente.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Retrovisor Eletrico")) {
                    cbRetrovisor.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Sensor de Estacionamento")) {
                    cbSensorEsta.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Farol Neblina")) {
                    cbNeblina.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Comando Volante")) {
                    cbVolante.setSelected(true);
                }
                // relação com moto

                if (listaModelOpcionais.get(i).getOpcionais().equals("Partida Elétrica")) {
                    cBPartidaEletrica.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Freios ABS")) {
                    cBabs.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Freios CBS")) {
                    cBcbs.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Freio a Disco Dianteiro")) {
                    cBdiscoDianteiro.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Freio a Disco Traseiro")) {
                    cBfreioTraseiro.setSelected(true);
                }
                if (listaModelOpcionais.get(i).getOpcionais().equals("Roda de Liga Leve")) {
                    cBrodaLeve.setSelected(true);
                }
            }
            atualizaDespeza(codigo);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }

    private void exportarVeiculos() {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("CLIENTES");

        try {
            listaModelVeiculo = controllerVeiculo.getListaVeiculoController();
            for (int i = 0; i < listaModelVeiculo.size(); i++) {
                HSSFRow rowhead = sheet.createRow((short) 0);
                rowhead.createCell(0).setCellValue("Modelo");
                rowhead.createCell(1).setCellValue("Cor");
                rowhead.createCell(2).setCellValue("Ano da Fabricação");
                rowhead.createCell(3).setCellValue("Ano do Modelo");
                rowhead.createCell(4).setCellValue("Motor");
                rowhead.createCell(5).setCellValue("Tipo");

                // definindo seus valores
                HSSFRow row = sheet.createRow(i);
                row.createCell(0).setCellValue(listaModelVeiculo.get(i).getModelo());
                row.createCell(1).setCellValue(listaModelVeiculo.get(i).getCor());
                row.createCell(2).setCellValue(listaModelVeiculo.get(i).getAnoFabricacao());
                row.createCell(3).setCellValue(listaModelVeiculo.get(i).getAnoModelo());
                row.createCell(4).setCellValue(listaModelVeiculo.get(i).getMotor());
                row.createCell(5).setCellValue(listaModelVeiculo.get(i).getTipo());

                //i++;
            }

            FileOutputStream fileOut;
            fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            JOptionPane.showMessageDialog(this, "Exportação concluída, o caminho do arquivo é " + filename + " ", "Alerta", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Houve algum erro na exportação!", "ERRO", JOptionPane.ERROR_MESSAGE);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjuda;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExportar;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cBPartidaEletrica;
    private javax.swing.JCheckBox cBabs;
    private javax.swing.JCheckBox cBcbs;
    private javax.swing.JCheckBox cBdiscoDianteiro;
    private javax.swing.JCheckBox cBfreioTraseiro;
    private javax.swing.JCheckBox cBrodaLeve;
    private javax.swing.JCheckBox cbABS;
    private javax.swing.JCheckBox cbAlarme;
    private javax.swing.JCheckBox cbAr;
    private javax.swing.JCheckBox cbArQuente;
    private javax.swing.JCheckBox cbArbag;
    private javax.swing.JCheckBox cbBC;
    private javax.swing.JCheckBox cbCapotaMaritima;
    private javax.swing.JCheckBox cbComputadorBordo;
    private javax.swing.JCheckBox cbControleTracao;
    private javax.swing.JCheckBox cbDE;
    private javax.swing.JCheckBox cbDH;
    private javax.swing.JCheckBox cbEncostoCabeca;
    private javax.swing.JCheckBox cbGPS;
    private javax.swing.JCheckBox cbKM;
    private javax.swing.JCheckBox cbLimpadorTrazeiro;
    private javax.swing.JComboBox cbMarca;
    private javax.swing.JCheckBox cbNeblina;
    private javax.swing.JCheckBox cbRE;
    private javax.swing.JCheckBox cbRetrovisor;
    private javax.swing.JCheckBox cbSensorEsta;
    private javax.swing.JCheckBox cbSom;
    private javax.swing.JCheckBox cbTE;
    private javax.swing.JCheckBox cbTetoSolar;
    private javax.swing.JCheckBox cbVE;
    private javax.swing.JCheckBox cbVolante;
    private javax.swing.JComboBox cblCombustivel;
    private javax.swing.JComboBox cdLMotor;
    private javax.swing.JComboBox cdSituacao;
    private javax.swing.JComboBox cdTipo;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JDialog jDdespesa;
    private javax.swing.JDialog jDopcionais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListaOpcionais;
    private javax.swing.JMenuItem jMdespesas;
    private javax.swing.JMenuItem jMopcionais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton rbCarro;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JTable tbDialogDespesa;
    private javax.swing.JTable tbVeiculo;
    private javax.swing.JTable tdDespesas;
    private javax.swing.JTextField tfAnoModelo;
    private javax.swing.JTextField tfChassi;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfCusto;
    private javax.swing.JTextField tfDebitos;
    private javax.swing.JTextField tfFabricacao;
    private javax.swing.JTextField tfFunilaria;
    private javax.swing.JTextField tfKm;
    private javax.swing.JTextField tfLimpeza;
    private javax.swing.JTextField tfMecanica;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextArea tfObservacao;
    private javax.swing.JTextField tfOutros;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JFormattedTextField tfPlaca;
    private javax.swing.JTextField tfRenavam;
    private javax.swing.JTextField tfRevisao;
    private javax.swing.JTextField tfTotalDespeza;
    private javax.swing.JTextField tfValorVenda;
    // End of variables declaration//GEN-END:variables

}
