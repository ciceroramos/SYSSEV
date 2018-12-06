package view;

import conexoes.ConexaoMySql;
import controller.ControllerCliente;
import controller.ControllerVeiculo;
import controller.ControllerVenda;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;
import model.ModelVeiculo;
import model.ModelVendas;
import org.apache.commons.mail.EmailException;
import util.AguardeGerandoRelatorio;
import util.BLDatas;
import util.EnviaEmailDoc;
import util.MaiusculoSev;
import util.ModeloTabelaVenda;

/**
 *
 * @author cicero.ramos
 */
public class ViewVenda extends javax.swing.JFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();

    ControllerVeiculo controllerVeiculo = new ControllerVeiculo();
    ModelVeiculo modelVeiculo = new ModelVeiculo();
    ArrayList<ModelVeiculo> listaModelVeiculos = new ArrayList<>();

    ControllerVenda controllerVenda = new ControllerVenda();
    ModelVendas modelVendas = new ModelVendas();
    ArrayList<ModelVendas> listamodelVendas = new ArrayList();

    BLDatas bl = new BLDatas();
    EnviaEmailDoc enviarEmailDoc = new EnviaEmailDoc();

//------Variaveis-------
    String tipoCadastro;

// variaveis nomeCliente e emailCliente para o envio do e-amil
    public String nomeCliente, emailCliente;

    /**
     * Creates new form ViewVenda
     */
    public ViewVenda() {
        initComponents();
        this.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        tbVendidos.setDefaultRenderer(Object.class, new ModeloTabelaVenda());
        tfPesquisa.setDocument(new MaiusculoSev());
        carregarVendaVeiculo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVendidos = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        cbPesquisa = new javax.swing.JComboBox();
        btAjuda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbClientes = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        tfCodCliente = new javax.swing.JComboBox();
        tfRG = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfAnoF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfAnoM = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfTipo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfCor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfMotor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tfChassi = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfCusto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tfDespesa = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tfCustoTotal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        cbVeiculo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tfCodVeiculo = new javax.swing.JComboBox();
        tfRenavam = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tfDesconto = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tfValorVenda = new javax.swing.JTextField();
        cbNegociacao = new javax.swing.JComboBox();
        jData = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfObservacao = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfCodVenda = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda / Histórico <<SysSev>>");
        setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1096, 800));
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        tbVendidos.setBackground(new java.awt.Color(245, 245, 245));
        tbVendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Venda", "Data Compra", "Placa", "Modelo", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbVendidos);

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Modify.png"))); // NOI18N
        btAlterar.setText("ALTERAR");
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
        btExcluir.setText("EXCLUIR");
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
        btImprimir.setText("IMPRIMIR");
        btImprimir.setBorder(null);
        btImprimir.setContentAreaFilled(false);
        btImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        btNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Add.png"))); // NOI18N
        btNovo.setText("NOVA");
        btNovo.setBorder(null);
        btNovo.setContentAreaFilled(false);
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Pesquise:");

        tfPesquisa.setBackground(new java.awt.Color(245, 245, 245));
        tfPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyReleased(evt);
            }
        });

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Find.png"))); // NOI18N
        btPesquisar.setText("Pesquise!");
        btPesquisar.setBorder(null);
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        cbPesquisa.setBackground(new java.awt.Color(245, 245, 245));
        cbPesquisa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nº Venda", "Data Compra", "Placa", "Modelo", "Cliente" }));

        btAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Help.png"))); // NOI18N
        btAjuda.setBorder(null);
        btAjuda.setContentAreaFilled(false);
        btAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btImprimir))
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 106, Short.MAX_VALUE)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("LISTA VENDIDOS", jPanel4);

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 204, 255), null), "Informações do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Código:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 19, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 20, -1, -1));

        cbClientes.setBackground(new java.awt.Color(245, 245, 245));
        cbClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbClientes.setEnabled(false);
        cbClientes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbClientesPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(cbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 40, 396, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CPF:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 20, -1, -1));

        tfCPF.setEditable(false);
        tfCPF.setBackground(new java.awt.Color(102, 102, 102));
        tfCPF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCPF.setForeground(new java.awt.Color(102, 255, 153));
        tfCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 40, 143, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Endereço:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        tfEndereco.setEditable(false);
        tfEndereco.setBackground(new java.awt.Color(245, 245, 245));
        tfEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEndereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 317, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Bairro:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        tfBairro.setEditable(false);
        tfBairro.setBackground(new java.awt.Color(245, 245, 245));
        tfBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 240, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cidade:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        tfCidade.setEditable(false);
        tfCidade.setBackground(new java.awt.Color(245, 245, 245));
        tfCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 240, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Celular:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        tfCelular.setEditable(false);
        tfCelular.setBackground(new java.awt.Color(102, 102, 102));
        tfCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCelular.setForeground(new java.awt.Color(102, 255, 153));
        tfCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCelular.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 131, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Telefone:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        tfTelefone.setEditable(false);
        tfTelefone.setBackground(new java.awt.Color(102, 102, 102));
        tfTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfTelefone.setForeground(new java.awt.Color(102, 255, 153));
        tfTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 159, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("E-mail:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        tfEmail.setEditable(false);
        tfEmail.setBackground(new java.awt.Color(245, 245, 245));
        tfEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 372, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Estado:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 134, -1, -1));

        tfEstado.setEditable(false);
        tfEstado.setBackground(new java.awt.Color(245, 245, 245));
        tfEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 70, 30));

        tfCodCliente.setBackground(new java.awt.Color(245, 245, 245));
        tfCodCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCodCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tfCodClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(tfCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 39, 85, 30));

        tfRG.setEditable(false);
        tfRG.setBackground(new java.awt.Color(102, 102, 102));
        tfRG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfRG.setForeground(new java.awt.Color(102, 255, 153));
        tfRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(tfRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 40, 117, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("RG:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 204, 255), null), "Informações do Veículo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 51))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PLACA:");

        tfPlaca.setEditable(false);
        tfPlaca.setBackground(new java.awt.Color(102, 102, 102));
        tfPlaca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfPlaca.setForeground(new java.awt.Color(255, 204, 102));
        tfPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPlaca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ANO FABRICAÇÃO:");

        tfAnoF.setEditable(false);
        tfAnoF.setBackground(new java.awt.Color(102, 102, 102));
        tfAnoF.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfAnoF.setForeground(new java.awt.Color(255, 204, 102));
        tfAnoF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAnoF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ANO MODELO:");

        tfAnoM.setEditable(false);
        tfAnoM.setBackground(new java.awt.Color(102, 102, 102));
        tfAnoM.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfAnoM.setForeground(new java.awt.Color(255, 204, 102));
        tfAnoM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAnoM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TIPO:");

        tfTipo.setEditable(false);
        tfTipo.setBackground(new java.awt.Color(245, 245, 245));
        tfTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("MODELO:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("COR:");

        tfCor.setEditable(false);
        tfCor.setBackground(new java.awt.Color(245, 245, 245));
        tfCor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MOTOR:");

        tfMotor.setEditable(false);
        tfMotor.setBackground(new java.awt.Color(245, 245, 245));
        tfMotor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfMotor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMotor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MARCA:");

        tfMarca.setEditable(false);
        tfMarca.setBackground(new java.awt.Color(245, 245, 245));
        tfMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMarca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CHASSI:");

        tfChassi.setEditable(false);
        tfChassi.setBackground(new java.awt.Color(245, 245, 245));
        tfChassi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfChassi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfChassi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("<html><b>CUSTO: <font color=\"red\">R$</font></b>");

        tfCusto.setEditable(false);
        tfCusto.setBackground(new java.awt.Color(245, 245, 245));
        tfCusto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCusto.setForeground(new java.awt.Color(255, 51, 51));
        tfCusto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCusto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("<html><b>DESPESAS: <font color=\"red\">R$</font></b>");

        tfDespesa.setEditable(false);
        tfDespesa.setBackground(new java.awt.Color(245, 245, 245));
        tfDespesa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfDespesa.setForeground(new java.awt.Color(255, 51, 51));
        tfDespesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDespesa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("<html><b>CUSTO TOTAL: <font color=\"red\">R$</font></b>");

        tfCustoTotal.setEditable(false);
        tfCustoTotal.setBackground(new java.awt.Color(245, 245, 245));
        tfCustoTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCustoTotal.setForeground(new java.awt.Color(255, 51, 51));
        tfCustoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCustoTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("<html><b>VALOR: <font color=\"red\"> R$ </font></b>");

        tfValor.setEditable(false);
        tfValor.setBackground(new java.awt.Color(245, 245, 245));
        tfValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfValor.setForeground(new java.awt.Color(0, 102, 204));
        tfValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        cbVeiculo.setBackground(new java.awt.Color(245, 245, 245));
        cbVeiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbVeiculo.setEnabled(false);
        cbVeiculo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbVeiculoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cbVeiculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbVeiculoFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Código:");

        tfCodVeiculo.setBackground(new java.awt.Color(245, 245, 245));
        tfCodVeiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCodVeiculo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                tfCodVeiculoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        tfCodVeiculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodVeiculoFocusLost(evt);
            }
        });

        tfRenavam.setEditable(false);
        tfRenavam.setBackground(new java.awt.Color(245, 245, 245));
        tfRenavam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfRenavam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRenavam.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("RENAVAM:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAnoF, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(tfAnoM, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel15))))
                            .addComponent(cbVeiculo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(89, 89, 89)
                                            .addComponent(jLabel17)
                                            .addGap(161, 161, 161)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(tfMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)
                                            .addComponent(tfRenavam))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(168, 168, 168)
                                            .addComponent(jLabel20))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(99, 99, 99)
                                                    .addComponent(tfDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(26, 26, 26)
                                                    .addComponent(jLabel18)))
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jLabel30))
                                                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(tfChassi)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)
                                            .addComponent(tfCustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCodVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAnoF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAnoM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel18))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(5, 5, 5)
                .addComponent(tfChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 204, 255), null), "Informações da Venda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 51))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("TIPO DA NEGOCIAÇÃO:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("<html><b>DESCONTO: <font color=\"red\">R$</font></b>");

        tfDesconto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfDesconto.setForeground(new java.awt.Color(255, 51, 51));
        tfDesconto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDesconto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfDesconto.setEnabled(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("<html><b>VALOR VENDA: <font color=\"red\">R$</font></b>");

        tfValorVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfValorVenda.setForeground(new java.awt.Color(0, 0, 204));
        tfValorVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfValorVenda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfValorVenda.setEnabled(false);

        cbNegociacao.setBackground(new java.awt.Color(245, 245, 245));
        cbNegociacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbNegociacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VENDA AVISTA", "VENDA FINANCIADA", "TROCA", "TROCA COM FINANCIAMENTO", "TROCA COM RETORNO AVISTA", " " }));
        cbNegociacao.setEnabled(false);

        jData.setBackground(new java.awt.Color(204, 255, 204));
        jData.setEnabled(false);
        jData.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("DATA VENDA:");

        tfObservacao.setColumns(20);
        tfObservacao.setRows(5);
        tfObservacao.setEnabled(false);
        jScrollPane2.setViewportView(tfObservacao);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("OBSERVAÇÃO:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Código:");

        tfCodVenda.setEditable(false);
        tfCodVenda.setBackground(new java.awt.Color(245, 245, 245));
        tfCodVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCodVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCodVenda.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel26)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel39))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(tfCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel29))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(cbNegociacao, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel25)))
                .addGap(40, 47, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel39))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel29)
                .addGap(5, 5, 5)
                .addComponent(cbNegociacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setBorder(null);
        btCancelar.setContentAreaFilled(false);
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btFinalizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Apply.png"))); // NOI18N
        btFinalizar.setText("FINALIZAR");
        btFinalizar.setBorder(null);
        btFinalizar.setContentAreaFilled(false);
        btFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(btFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VENDA", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setSize(new java.awt.Dimension(1046, 748));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbClientesPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbClientesPopupMenuWillBecomeInvisible

        if (this.cbClientes.isPopupVisible()) {
            modelCliente = controllerCliente.getClienteController(cbClientes.getSelectedItem().toString());
            //recupera o código
            this.tfCodCliente.setSelectedItem(modelCliente.getCodigo());
            this.tfEmail.setText(modelCliente.getEmail());
            this.tfTelefone.setText(modelCliente.getTelefone());
            this.tfCPF.setText(modelCliente.getCpf());
            this.tfRG.setText(modelCliente.getRg());
            this.tfEndereco.setText(modelCliente.getEndereco());
            this.tfBairro.setText(modelCliente.getBairro());
            this.tfCidade.setText(modelCliente.getCidade());
            this.tfCelular.setText(modelCliente.getCelular());
            this.tfEstado.setText(modelCliente.getEstado());

        }
    }//GEN-LAST:event_cbClientesPopupMenuWillBecomeInvisible

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        listaModelVeiculos = controllerVeiculo.getListaVeiculoController();

        if (listaModelVeiculos.size() <= 0) {
            JOptionPane.showMessageDialog(this, "Não há veículos cadastrado!", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {

            habilitarCampos();
            tipoCadastro = "NOVO";
            tfCodVenda.setText("NOVO");
            tfDesconto.setText("0.0");
            jTabbedPane1.setSelectedIndex(1);
            cbClientes.requestFocus();
            listarCodigosClientes();
            listarClientes();
            listarVeiculos();
            listarCodVeiculos();
        }
    }//GEN-LAST:event_btNovoActionPerformed

    private void carregarVendaVeiculo() {

        listamodelVendas = controllerVenda.getListaVendasController();
        DefaultTableModel modelo = (DefaultTableModel) tbVendidos.getModel();
        modelo.setNumRows(0);

        int count = listamodelVendas.size();
        for (int i = 0; i < count; i++) {
            modelCliente = controllerCliente.getClienteController(listamodelVendas.get(i).getClienteCodigo());
            modelo.addRow(new Object[]{
                listamodelVendas.get(i).getCodigo(),
                listamodelVendas.get(i).getDataVenda(),
                listamodelVendas.get(i).getPlaca(),
                listamodelVendas.get(i).getModelo(),
                modelCliente.getNome()
            });

        }

    }

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        DefaultTableModel tabela = (DefaultTableModel) this.tbVendidos.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbVendidos.setRowSorter(sorter);
        String text = tfPesquisa.getText();

        if (cbPesquisa.getSelectedIndex() == 0) {
            //definir pesquisa por n° compra
            sorter.setRowFilter(RowFilter.regexFilter(text, 0));
        } else if (cbPesquisa.getSelectedIndex() == 1) {
            //definir pesquisa por cliente
            sorter.setRowFilter(RowFilter.regexFilter(text, 1));
        } else if (cbPesquisa.getSelectedIndex() == 2) {
            //definir pesquisa por unidade
            sorter.setRowFilter(RowFilter.regexFilter(text, 2));
        } else if (cbPesquisa.getSelectedIndex() == 3) {
            //definir pesquisa por hora
            sorter.setRowFilter(RowFilter.regexFilter(text, 3));
        } else if (cbPesquisa.getSelectedIndex() == 4l) {
            //definir pesquisa por Profissional
            sorter.setRowFilter(RowFilter.regexFilter(text, 4));
        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        DesabilitarCampos();
        tbVendidos.clearSelection();
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbVeiculoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbVeiculoPopupMenuWillBecomeInvisible

        if (this.cbVeiculo.isPopupVisible()) {
            modelVeiculo = controllerVeiculo.getVeiculoModeloController(cbVeiculo.getSelectedItem().toString());
            //recupera o nome
            atualizaDespeza(Integer.parseInt(tfCodVeiculo.getSelectedItem().toString()));
            this.tfPlaca.setText(modelVeiculo.getPlaca());
            this.tfCodVeiculo.setSelectedItem(modelVeiculo.getCodigo());
            this.tfCusto.setText(String.valueOf(modelVeiculo.getCustoAquisicao()));
            this.tfValor.setText(String.valueOf(modelVeiculo.getValorVenda()));
            this.tfAnoF.setText(modelVeiculo.getAnoFabricacao());
            this.tfAnoM.setText(modelVeiculo.getAnoModelo());
            this.tfChassi.setText(modelVeiculo.getChassi());
            this.tfRenavam.setText(modelVeiculo.getRenavam());
            this.tfTipo.setText(modelVeiculo.getTipo());
            this.tfCor.setText(modelVeiculo.getCor());
            this.tfMotor.setText(modelVeiculo.getMotor());
            this.tfMarca.setText(modelVeiculo.getMarca());

        }

    }//GEN-LAST:event_cbVeiculoPopupMenuWillBecomeInvisible

    private void atualizaDespeza(int pCodigo) {
        float totalDespeza = 0;
        float custoTotal = 0;
        try {

            String query = "select sum(limpeza + mecanica + funilaria + revisao + debitos + outros) as valor "
                    + "from tbdespesa_veiculo where codigo_veiculo = '" + pCodigo + "';";

            ConexaoMySql mysql = new ConexaoMySql();
            PreparedStatement pstm = (PreparedStatement) mysql.conectar().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                totalDespeza = Float.parseFloat(rs.getString("valor"));
            }
            tfDespesa.setText(String.valueOf(totalDespeza));

        } catch (Exception e) {
            System.out.println("algun erro");
        }
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        int linha = tbVendidos.getSelectedRow();
        String nome = (String) tbVendidos.getValueAt(linha, 3);
        int codigo = (int) tbVendidos.getValueAt(linha, 0);
        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerVenda.excluirVendasController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarVendaVeiculo();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int linha = -1;
        linha = this.tbVendidos.getSelectedRow();
        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione uma Venda para Alterar");
        } else {
            System.out.println("linha" + linha);
            tipoCadastro = "ALTERAR";
            int pCodigo = (Integer) tbVendidos.getValueAt(linha, 0);
            System.out.println("codVenda" + pCodigo);
            habilitarCamposAlterar();
            listarCodigosClientes();
            //listarCodVeiculos();
            listarClientes();
            //listarVeiculos();
            recuperarVenda(pCodigo);
            retornaClientePeloCodigo();
            //retornaVeiculoPeloCodigo();
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed

        if (tipoCadastro.equals("NOVO")) {
            cadastrarVenda();
        }
        if (tipoCadastro.equals("ALTERAR")) {

            alterarVenda();
        }

    }//GEN-LAST:event_btFinalizarActionPerformed

    private boolean cadastrarVenda() {

        if (cbNegociacao.getSelectedIndex() == -1 || tfValorVenda.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "TIPO DA NEGOCIAÇÃO OU VALOR VENDA ESTA VAZIO!");
        } else {

            modelVendas.setClienteCodigo(controllerCliente.getClienteController(cbClientes.getSelectedItem().toString()).getCodigo());
            modelVendas.setTipoNegociacao(cbNegociacao.getSelectedItem().toString());
            modelVendas.setDesconto(Float.parseFloat(this.tfDesconto.getText()));
            modelVendas.setValorTotal(Float.parseFloat(this.tfValorVenda.getText()));
            modelVendas.setObservacao(this.tfObservacao.getText());
            try {
                modelVendas.setDataVenda(bl.converterDataParaDateUS(jData.getDate()));
            } catch (Exception ex) {
                Logger.getLogger(ViewClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            modelVendas.setPlaca(tfPlaca.getText());
            modelVendas.setAnoFabricacao(tfAnoF.getText());
            modelVendas.setAnoModelo(tfAnoM.getText());
            modelVendas.setChassi(tfChassi.getText());
            modelVendas.setMarca(tfMarca.getText());
            modelVendas.setModelo(cbVeiculo.getSelectedItem().toString());
            modelVendas.setMotor(tfMotor.getText());
            modelVendas.setCor(tfCor.getText());
            modelVendas.setTipo(tfTipo.getText());
            modelVendas.setRenavam(tfRenavam.getText());
            modelVendas.setCombustivel(controllerVeiculo.getVeiculoModeloController(cbVeiculo.getSelectedItem().toString()).getCombustivel());
            modelVendas.setKmRodados(controllerVeiculo.getVeiculoModeloController(cbVeiculo.getSelectedItem().toString()).getKmRodados());
            modelVendas.setObservacao_veiculo(controllerVeiculo.getVeiculoModeloController(cbVeiculo.getSelectedItem().toString()).getObservacao());
            modelVendas.setDataCompra(controllerVeiculo.getVeiculoModeloController(cbVeiculo.getSelectedItem().toString()).getDataCompra());
        }
        final int codigoVenda = controllerVenda.salvarVendasController(modelVendas);
        if (codigoVenda > 0) {
            modelVendas.setCodigo(codigoVenda);
            controllerVeiculo.excluirVeiculoController(Integer.parseInt(tfCodVeiculo.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(this, "Registro Gravado com Sucesso!");
            //conexaoNet();
            String modo = this.tfCodVenda.getText();
            if (modo.equals("NOVO")) {
                int opcao = JOptionPane.showConfirmDialog(this, "Desseja imprimir a venda do veículo?", "Atenção", JOptionPane.YES_NO_OPTION);
                if (opcao == JOptionPane.OK_OPTION) {

                    final AguardeGerandoRelatorio carregando = new AguardeGerandoRelatorio();
                    carregando.setVisible(true);
                    Thread t = new Thread() {
                        @Override
                        public void run() {
                            controllerVenda.gerarRelatorioVendaIndividual(codigoVenda);
                            carregando.dispose();
                        }
                    };
                    t.start();

                }

                if (consegueConectar("http://www.google.com.br")) {

                    int opcaoM = JOptionPane.showConfirmDialog(this, "Desseja enviar por E-mail o documento?", "Atenção", JOptionPane.YES_NO_OPTION);
                    if (opcaoM == JOptionPane.OK_OPTION) {

                        enviarEmailDoc.setNomeCliente(cbClientes.getSelectedItem().toString());
                        enviarEmailDoc.setEmailCliente(tfEmail.getText());

                        final AguardeGerandoRelatorio carregando = new AguardeGerandoRelatorio();
                        carregando.setVisible(true);
                        Thread t = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    controllerVenda.gerarRelatorioVendaIndividualEmail(codigoVenda);
                                    enviarEmailDoc.sendEmail();
                                    carregando.dispose();
                                    //depois que enviou o email ira apagar o arquivo
                                    File file = new File("C:/SYSSEV/relrelatorioVendas.pdf");
                                    file.delete();
                                } catch (EmailException ex) {
                                    Logger.getLogger(ViewVenda.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        };
                        t.start();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Impossível enviar e-mail, sem conexão com a Internet!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            DesabilitarCampos();
            carregarVendaVeiculo();
            jTabbedPane1.setSelectedIndex(0);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao Gravar os Dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private static boolean consegueConectar(String address) {
        try {
            URL url = new URL(address);
            URLConnection connection = url.openConnection();
            connection.connect();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean alterarVenda() {

        modelVendas.setCodigo(Integer.parseInt(this.tfCodVenda.getText()));
        modelVendas.setClienteCodigo(controllerCliente.getClienteController(cbClientes.getSelectedItem().toString()).getCodigo());

        modelVendas.setDesconto(Float.parseFloat(this.tfDesconto.getText()));
        modelVendas.setObservacao(this.tfObservacao.getText());
        modelVendas.setTipoNegociacao(cbNegociacao.getSelectedItem().toString());
        modelVendas.setValorTotal(Float.parseFloat(this.tfValorVenda.getText()));
        try {
            modelVendas.setDataVenda(bl.converterDataParaDateUS(jData.getDate()));
        } catch (Exception ex) {
            Logger.getLogger(ViewClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (controllerVenda.atualizarVendasController(modelVendas)) {
            //controllerVenda.veiculoIndisponivelController(modelVendas.getVeiculoCodigo());
            JOptionPane.showMessageDialog(this, "Registro Alterado e Gravado com Sucesso!");
            DesabilitarCampos();
            carregarVendaVeiculo();
            jTabbedPane1.setSelectedIndex(0);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao Alterar os Dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void tfCodClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tfCodClientePopupMenuWillBecomeInvisible
        if (this.tfCodCliente.isPopupVisible()) {
            modelCliente = controllerCliente.getClienteController(Integer.parseInt(tfCodCliente.getSelectedItem().toString()));
            this.cbClientes.setSelectedItem(String.valueOf(modelCliente.getNome()));
            this.tfEmail.setText(modelCliente.getEmail());
            this.tfTelefone.setText(modelCliente.getTelefone());
            this.tfCPF.setText(modelCliente.getCpf());
            this.tfRG.setText(modelCliente.getRg());
            this.tfEndereco.setText(modelCliente.getEndereco());
            this.tfBairro.setText(modelCliente.getBairro());
            this.tfCidade.setText(modelCliente.getCidade());
            this.tfCelular.setText(modelCliente.getCelular());
            this.tfEstado.setText(modelCliente.getEstado());

        }
    }//GEN-LAST:event_tfCodClientePopupMenuWillBecomeInvisible

    private void retornaClientePeloCodigo() {

        modelCliente = controllerCliente.getClienteController(Integer.parseInt(tfCodCliente.getSelectedItem().toString()));

        this.cbClientes.setSelectedItem(String.valueOf(modelCliente.getNome()));
        this.tfEmail.setText(modelCliente.getEmail());
        this.tfTelefone.setText(modelCliente.getTelefone());
        this.tfCPF.setText(modelCliente.getCpf());
        this.tfRG.setText(modelCliente.getRg());
        this.tfEndereco.setText(modelCliente.getEndereco());
        this.tfBairro.setText(modelCliente.getBairro());
        this.tfCidade.setText(modelCliente.getCidade());
        this.tfCelular.setText(modelCliente.getCelular());
        this.tfEstado.setText(modelCliente.getEstado());

    }

    private void retornaVeiculoPeloCodigo() {

        modelVeiculo = controllerVeiculo.getVeiculoCodController(Integer.parseInt(tfCodVeiculo.getSelectedItem().toString()));
        //recupera o nome
        atualizaDespeza(Integer.parseInt(tfCodVeiculo.getSelectedItem().toString()));
        this.tfPlaca.setText(modelVeiculo.getPlaca());
        this.cbVeiculo.setSelectedItem(String.valueOf(modelVeiculo.getModelo()));
        this.tfCusto.setText(String.valueOf(modelVeiculo.getCustoAquisicao()));
        this.tfValor.setText(String.valueOf(modelVeiculo.getValorVenda()));
        this.tfAnoF.setText(modelVeiculo.getAnoFabricacao());
        this.tfAnoM.setText(modelVeiculo.getAnoModelo());
        this.tfChassi.setText(modelVeiculo.getChassi());
        this.tfTipo.setText(modelVeiculo.getTipo());
        this.tfCor.setText(modelVeiculo.getCor());
        this.tfMotor.setText(modelVeiculo.getMotor());
        this.tfMarca.setText(modelVeiculo.getMarca());

    }

    private void tfCodVeiculoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_tfCodVeiculoPopupMenuWillBecomeInvisible

        if (this.tfCodVeiculo.isPopupVisible()) {
            modelVeiculo = controllerVeiculo.getVeiculoCodController(Integer.parseInt(tfCodVeiculo.getSelectedItem().toString()));
            //recupera o nome
            atualizaDespeza(Integer.parseInt(tfCodVeiculo.getSelectedItem().toString()));
            this.tfPlaca.setText(modelVeiculo.getPlaca());
            this.cbVeiculo.setSelectedItem(String.valueOf(modelVeiculo.getModelo()));
            this.tfCusto.setText(String.valueOf(modelVeiculo.getCustoAquisicao()));
            this.tfValor.setText(String.valueOf(modelVeiculo.getValorVenda()));
            this.tfAnoF.setText(modelVeiculo.getAnoFabricacao());
            this.tfAnoM.setText(modelVeiculo.getAnoModelo());
            this.tfChassi.setText(modelVeiculo.getChassi());
            this.tfRenavam.setText(modelVeiculo.getRenavam());
            this.tfTipo.setText(modelVeiculo.getTipo());
            this.tfCor.setText(modelVeiculo.getCor());
            this.tfMotor.setText(modelVeiculo.getMotor());
            this.tfMarca.setText(modelVeiculo.getMarca());
        }

    }//GEN-LAST:event_tfCodVeiculoPopupMenuWillBecomeInvisible

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed

        int linhaSelecionada = tbVendidos.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {

            System.out.println(linhaSelecionada);

            final AguardeGerandoRelatorio carregando = new AguardeGerandoRelatorio();
            final ControllerVenda controllerVenda = new ControllerVenda();
            carregando.setVisible(true);
            Thread t = new Thread() {
                @Override
                public void run() {
                    // imprimir clientes
                    controllerVenda.gerarRelatorioVendaImpressao((int) tbVendidos.getValueAt(tbVendidos.getSelectedRow(), 0));
                    carregando.dispose();
                }
            };
            t.start();
        }

    }//GEN-LAST:event_btImprimirActionPerformed

    private void cbVeiculoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbVeiculoFocusLost
        somaCustos();
    }//GEN-LAST:event_cbVeiculoFocusLost

    private void tfCodVeiculoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodVeiculoFocusLost
        somaCustos();
    }//GEN-LAST:event_tfCodVeiculoFocusLost

    private void tfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyReleased
        DefaultTableModel tabela = (DefaultTableModel) this.tbVendidos.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbVendidos.setRowSorter(sorter);
        String text = tfPesquisa.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text, 3));
        }


    }//GEN-LAST:event_tfPesquisaKeyReleased

    private void btAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjudaActionPerformed
        JOptionPane.showMessageDialog(this, "Utilizando as Funções de Venda/Saída do veículo.\n"
                + " \n"
                + "Todas as informações de  VENDA / SAÍDA já realizadas irão ficar exposta na tabela na tela principal do formulário correspondente.\n"
                + "\n"
                + "Para gerar uma VENDA / SAÍDA de veículo, pressione o botão NOVA, irá para a tela de  VENDA / SAÍDA, selecione o cliente ( PREVIAMENTE CADASTRADO ), \n"
                + " irá exibir alguns dados do cliente após a seleção. \n"
                + "\n"
                + "Depois da escolha do cliente, selecione o veículo na caixa como o nome MODELO, clicando no modelo escolhido pelo cliente, será preenchido algumas informações referente ao mesmo.\n"
                + "Após a escolha do veículo, informe o TIPO DA NEGOCIAÇÃO, O DESCONTO (SE HOUVER) E O VALOR DA VENDA DO VEÍCULO, caso seja necessário informe alguma observação sobre essa venda.\n"
                + "\n"
                + "Para ser finalizada a  VENDA / SAÍDA deve-se clicar no botão FINALIZAR, após clicar em FINALIZAR o sistema irá lhe perguntar se deseja imprimir o documento com as informações da \n"
                + "VENDA / SAÍDA e se irá mandar por e-mail o mesmo documento.\n"
                + "\n"
                + "Caso tenha a necessidade de impressão de  VENDA / SAÍDA antigas, basta clicar na linha correspondente e pressionar o botão IMPRIMIR.", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btAjudaActionPerformed

    private boolean recuperarVenda(int pCodigo) {

        // String modelo = null;
        try {

            modelVendas.setCodigo(pCodigo);
            modelVendas = controllerVenda.getVendasController(pCodigo);
            tfCodVenda.setText(String.valueOf(modelVendas.getCodigo()));
            tfCodCliente.setSelectedItem(modelVendas.getClienteCodigo());

            tfPlaca.setText(modelVendas.getPlaca());
            String modelo = modelVendas.getModelo().toString();
            System.out.println(modelo);
            cbVeiculo.setSelectedItem(modelo.trim());
            tfAnoF.setText(modelVendas.getAnoFabricacao());
            tfAnoM.setText(modelVendas.getAnoModelo());
            tfTipo.setText(modelVendas.getTipo());
            tfCor.setText(modelVendas.getCor());
            tfMarca.setText(modelVendas.getMarca());
            tfChassi.setText(modelVendas.getChassi());
            tfRenavam.setText(modelVendas.getRenavam());
            tfMotor.setText(modelVendas.getMotor());

            tfDesconto.setText(String.valueOf(modelVendas.getDesconto()));
            tfValorVenda.setText(String.valueOf(modelVendas.getValorTotal()));
            cbNegociacao.setSelectedItem(modelVendas.getTipoNegociacao());
            jData.setDate(modelVendas.getDataVenda());
            tfObservacao.setText(modelVendas.getObservacao());

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }

    private void somaCustos() {

        revalidate();
        float custo = 0;
        float despesa = 0;

        custo = Float.parseFloat(tfCusto.getText());
        despesa = Float.parseFloat(tfDespesa.getText());
        float total = custo + despesa;
        tfCustoTotal.setText(String.valueOf(total));

    }

    private void habilitarCampos() {

        tfCodCliente.setEnabled(true);
        tfCodVeiculo.setEnabled(true);
        cbClientes.setEnabled(true);
        cbVeiculo.setEnabled(true);
        jData.setEnabled(true);
        jData.setDate(new java.util.Date());
        cbNegociacao.setEnabled(true);
        tfDesconto.setEnabled(true);
        tfValorVenda.setEnabled(true);
        tfObservacao.setEnabled(true);

    }

    private void habilitarCamposAlterar() {

        cbVeiculo.setEditable(true);
        tfCodCliente.setEnabled(false);
        tfCodVeiculo.setEnabled(false);
        jData.setEnabled(true);
        jData.setDate(new java.util.Date());
        cbNegociacao.setEnabled(true);
        tfDesconto.setEnabled(true);
        tfValorVenda.setEnabled(true);
        tfObservacao.setEnabled(true);

    }

    private void listarCodigosClientes() {
        listaModelClientes = controllerCliente.getListaClienteController();
        tfCodCliente.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++) {
            tfCodCliente.addItem(listaModelClientes.get(i).getCodigo());
        }
    }

    private void listarClientes() {
        listaModelClientes = controllerCliente.getListaClienteController();
        cbClientes.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++) {
            cbClientes.addItem(listaModelClientes.get(i).getNome());
        }
    }

    private void listarVeiculos() {

        listaModelVeiculos = controllerVeiculo.getListaVeiculoController();
        cbVeiculo.removeAllItems();
        for (int i = 0; i < listaModelVeiculos.size(); i++) {
            cbVeiculo.addItem(listaModelVeiculos.get(i).getModelo());

        }

    }

    private void listarCodVeiculos() {

        listaModelVeiculos = controllerVeiculo.getListaVeiculoController();
        tfCodVeiculo.removeAllItems();
        for (int i = 0; i < listaModelVeiculos.size(); i++) {
            tfCodVeiculo.addItem(listaModelVeiculos.get(i).getCodigo());

        }

    }

    private void DesabilitarCampos() {

        tfCodCliente.setEnabled(false);
        cbClientes.setEnabled(false);
        cbVeiculo.setEnabled(false);
        jData.setEnabled(false);
        jData.setDate(null);
        cbNegociacao.setEnabled(false);
        tfDesconto.setEnabled(false);
        tfValorVenda.setEnabled(false);
        tfObservacao.setEnabled(false);
        cbClientes.removeAllItems();
        cbVeiculo.removeAllItems();
        //---area cliente
        tfCPF.setText("");
        tfRG.setText("");
        tfTelefone.setText("");
        tfCelular.setText("");
        tfEndereco.setText("");
        tfBairro.setText("");
        tfEmail.setText("");
        tfCidade.setText("");
        tfEstado.setText("");
        tfCodCliente.removeAllItems();
        cbClientes.removeAllItems();
        //----area veiculo
        tfPlaca.setText("");
        tfAnoF.setText("");
        tfAnoM.setText("");
        tfChassi.setText("");
        tfRenavam.setText("");
        tfCor.setText("");
        tfMotor.setText("");
        tfMarca.setText("");
        tfTipo.setText("");
        tfCusto.setText("");
        tfDespesa.setText("");
        tfCustoTotal.setText("");
        tfValor.setText("");
        tfCodVeiculo.removeAllItems();
        //---area venda
        tfCodVenda.setText("");
        jData.setDate(null);
        cbNegociacao.removeAllItems();
        tfObservacao.setText("");
        tfDesconto.setText("");
        tfValorVenda.setText("");

    }

    // get e set das variaveis nomeCliente e emailCliente para o envio do e-amil
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
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
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjuda;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox cbClientes;
    private javax.swing.JComboBox cbNegociacao;
    private javax.swing.JComboBox cbPesquisa;
    private javax.swing.JComboBox cbVeiculo;
    private com.toedter.calendar.JDateChooser jData;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbVendidos;
    private javax.swing.JTextField tfAnoF;
    private javax.swing.JTextField tfAnoM;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfChassi;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JComboBox tfCodCliente;
    private javax.swing.JComboBox tfCodVeiculo;
    private javax.swing.JTextField tfCodVenda;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfCusto;
    private javax.swing.JTextField tfCustoTotal;
    private javax.swing.JTextField tfDesconto;
    private javax.swing.JTextField tfDespesa;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfMotor;
    private javax.swing.JTextArea tfObservacao;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfRG;
    private javax.swing.JTextField tfRenavam;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfTipo;
    private javax.swing.JTextField tfValor;
    private javax.swing.JTextField tfValorVenda;
    // End of variables declaration//GEN-END:variables
}
