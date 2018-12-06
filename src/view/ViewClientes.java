package view;

import controller.ControllerCliente;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import util.AguardeGerandoRelatorio;
import util.BLDatas;
import util.BLTiraAcentos;
import util.MaiusculoSev;
import util.ModeloTabelaCliente;
import util.ValidaCPF;
import util.WebServiceCep;

public class ViewClientes extends javax.swing.JFrame {
    
    ModelCliente modelCliente = new ModelCliente();
    ControllerCliente controllerCliente = new ControllerCliente();
    ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();
    BLDatas bl = new BLDatas();
    ValidaCPF validaCPF = new ValidaCPF();
    String tipoCadastro, cpf, rg;
    String filename = null;
    Date d3;

    /**
     * Creates new form Clientes
     */
    public ViewClientes() {
        initComponents();
        lbBolo.setVisible(false);
        this.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        setLocationRelativeTo(null);
        tbClientes.setDefaultRenderer(Object.class, new ModeloTabelaCliente());
        this.carregarClientes();
        tfPesquisaCliente.setDocument(new MaiusculoSev());
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tfPesquisaCliente = new javax.swing.JTextField();
        btPesquisaCliente = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        lbBolo = new javax.swing.JLabel();
        btExportExcel = new javax.swing.JButton();
        btAjuda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCpfCnpj = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCep = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JFormattedTextField();
        tfTelefoneFixo = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfObservacao = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tfRG = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes <<SysSev>>");
        setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        setResizable(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Pesquisar:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/print.png"))); // NOI18N
        jButton1.setText("Imprimir Cliente");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfPesquisaCliente.setBackground(new java.awt.Color(245, 245, 245));
        tfPesquisaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPesquisaCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfPesquisaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPesquisaClienteFocusLost(evt);
            }
        });
        tfPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaClienteKeyReleased(evt);
            }
        });

        btPesquisaCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Find.png"))); // NOI18N
        btPesquisaCliente.setText("Pesquisar");
        btPesquisaCliente.setBorder(null);
        btPesquisaCliente.setContentAreaFilled(false);
        btPesquisaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaClienteActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setBorder(null);
        jbExcluir.setContentAreaFilled(false);
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        tbClientes.setAutoCreateRowSorter(true);
        tbClientes.setBackground(new java.awt.Color(245, 245, 245));
        tbClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Data Nascimento", "Celular", "Telefone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbClientes.setGridColor(new java.awt.Color(0, 153, 204));
        tbClientes.setRowHeight(20);
        tbClientes.setShowVerticalLines(false);
        tbClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setMinWidth(60);
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbClientes.getColumnModel().getColumn(1).setMinWidth(270);
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(270);
            tbClientes.getColumnModel().getColumn(1).setMaxWidth(270);
            tbClientes.getColumnModel().getColumn(2).setMinWidth(120);
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(120);
            tbClientes.getColumnModel().getColumn(2).setMaxWidth(120);
            tbClientes.getColumnModel().getColumn(3).setMinWidth(120);
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbClientes.getColumnModel().getColumn(3).setMaxWidth(120);
            tbClientes.getColumnModel().getColumn(4).setMinWidth(120);
            tbClientes.getColumnModel().getColumn(4).setPreferredWidth(120);
            tbClientes.getColumnModel().getColumn(4).setMaxWidth(120);
            tbClientes.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setBorder(null);
        btAlterar.setContentAreaFilled(false);
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.setBorder(null);
        btNovo.setContentAreaFilled(false);
        btNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btExportExcel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Table.png"))); // NOI18N
        btExportExcel.setText("Exportar Planilha");
        btExportExcel.setBorder(null);
        btExportExcel.setContentAreaFilled(false);
        btExportExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportExcelActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(btExportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lbBolo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAjuda, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAjuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Consulta / Lista", jPanel1);

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(245, 245, 245));
        tfCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfCodigo.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Código:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("<html><b>Nome:<font color=\"red\">*</font></b>");

        tfNome.setEditable(false);
        tfNome.setBackground(new java.awt.Color(245, 245, 245));
        tfNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeFocusLost(evt);
            }
        });

        tfCpfCnpj.setBackground(new java.awt.Color(255, 255, 204));
        tfCpfCnpj.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpfCnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCpfCnpj.setEnabled(false);
        tfCpfCnpj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCpfCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCpfCnpjFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("<html><b>CPF:<font color=\"red\">*</font></b>");

        tfComplemento.setEditable(false);
        tfComplemento.setBackground(new java.awt.Color(245, 245, 245));
        tfComplemento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfComplemento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfComplemento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfComplementoFocusLost(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Complemento:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Endereço:");

        tfEndereco.setEditable(false);
        tfEndereco.setBackground(new java.awt.Color(245, 245, 245));
        tfEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEndereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("<html><b>E-mail:<font color=\"red\"></font></b>");

        tfemail.setEditable(false);
        tfemail.setBackground(new java.awt.Color(245, 245, 245));
        tfemail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfemail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfBairro.setEditable(false);
        tfBairro.setBackground(new java.awt.Color(245, 245, 245));
        tfBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Bairro:");

        tfCep.setEditable(false);
        tfCep.setBackground(new java.awt.Color(245, 245, 245));
        tfCep.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCepKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CEP:");

        tfTelefone.setEditable(false);
        tfTelefone.setBackground(new java.awt.Color(255, 255, 204));
        tfTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tfTelefoneFixo.setEditable(false);
        tfTelefoneFixo.setBackground(new java.awt.Color(255, 255, 204));
        tfTelefoneFixo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfTelefoneFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefoneFixo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelefoneFixo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Telefone:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("<html><b>Celular:<font color=\"red\">*</font></b>");

        cbEstado.setBackground(new java.awt.Color(245, 245, 245));
        cbEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbEstado.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("UF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cidade:");

        tfObservacao.setEditable(false);
        tfObservacao.setColumns(20);
        tfObservacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfObservacao.setRows(5);
        tfObservacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(tfObservacao);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Observação:");

        jDate.setBackground(new java.awt.Color(245, 245, 245));
        jDate.setEnabled(false);
        jDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("<html><b>Data Nascimento:<font color=\"red\">*</font></b>");

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setBorder(null);
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setBorder(null);
        btCancelar.setContentAreaFilled(false);
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("RG:");

        tfRG.setBackground(new java.awt.Color(255, 255, 204));
        tfRG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRG.setToolTipText("");
        tfRG.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfRG.setEnabled(false);
        tfRG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfRGKeyReleased(evt);
            }
        });

        tfCidade.setEditable(false);
        tfCidade.setBackground(new java.awt.Color(245, 245, 245));
        tfCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(tfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel8)
                                .addGap(164, 164, 164)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(184, 184, 184)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(120, 120, 120)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(30, 30, 30)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(136, 136, 136)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(30, 30, 30)
                                                    .addComponent(jLabel14))
                                                .addComponent(tfTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(jLabel5))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(134, 134, 134)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel45)
                                            .addGap(110, 110, 110))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(58, 58, 58)
                                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(245, 245, 245)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel6)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(117, 117, 117)))
                .addGap(22, 61, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpfCnpj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addComponent(jLabel45))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        
        desabilitarCampos();
        tbClientes.clearSelection();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btCancelarActionPerformed
    
    public void correio() {
        String cep = tfCep.getText();
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
        if (webServiceCep.wasSuccessful()) {
            tfEndereco.setText(webServiceCep.getLogradouroFull());
            tfBairro.setText(webServiceCep.getBairro());
            tfCidade.setText(webServiceCep.getCidade());
        } else {
            JOptionPane.showMessageDialog(null, webServiceCep.getResultText());
        }
    }
    

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        if (tipoCadastro.equals("novo")) {
            salvarCliente();
        } else if (tipoCadastro.equals("alteracao")) {
            alteraCliente();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusLost

        // converte em maiusculo o que o usuario digitar
        this.tfNome.setText(tfNome.getText().toUpperCase());
        //tira acentos
        BLTiraAcentos blTiraAcentos = new BLTiraAcentos();
        this.tfNome.setText(blTiraAcentos.TiraAcentos(tfNome.getText()));

    }//GEN-LAST:event_tfNomeFocusLost

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        this.novoCliente();
        this.habilitarCampos();
        tfCpfCnpj.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        
        int selecao = tbClientes.getSelectedRow();
        
        if (selecao < 0) {
            
            JOptionPane.showMessageDialog(this, "Selecione um Cliente para Alterar");
        } else {
            
            tipoCadastro = "alteracao";
            habilitarCampos();
            recuperarCliente();
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        int linha = tbClientes.getSelectedRow();
        String nome = (String) tbClientes.getValueAt(linha, 1);
        int codigo = (int) tbClientes.getValueAt(linha, 0);

        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerCliente.excluirClienteController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarClientes();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void btPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaClienteActionPerformed

        //filtrar dados na tabela
        DefaultTableModel tabela = (DefaultTableModel) this.tbClientes.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbClientes.setRowSorter(sorter);
        String text = tfPesquisaCliente.getText();
        sorter.setRowFilter(RowFilter.regexFilter(text, 1));
    }//GEN-LAST:event_btPesquisaClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int linhaSelecionada = tbClientes.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            
            System.out.println(linhaSelecionada);
            
            final AguardeGerandoRelatorio carregando = new AguardeGerandoRelatorio();
            final ControllerCliente controllerCliente = new ControllerCliente();
            carregando.setVisible(true);
            Thread t = new Thread() {
                @Override
                public void run() {
                    // imprimir clientes
                    controllerCliente.gerarRelatorioClienteIndividual((int) tbClientes.getValueAt(tbClientes.getSelectedRow(), 0));
                    carregando.dispose();
                }
            };
            t.start();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfPesquisaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaClienteKeyReleased
        
        DefaultTableModel tabela = (DefaultTableModel) this.tbClientes.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbClientes.setRowSorter(sorter);
        String text = tfPesquisaCliente.getText();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(text, 1));
        }

    }//GEN-LAST:event_tfPesquisaClienteKeyReleased

    private void tfPesquisaClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPesquisaClienteFocusLost

        // converte em maiusculo o que o usuario digitar
        this.tfPesquisaCliente.setText(tfPesquisaCliente.getText().toUpperCase());
        //tira acentos
        BLTiraAcentos blTiraAcentos = new BLTiraAcentos();
        this.tfPesquisaCliente.setText(blTiraAcentos.TiraAcentos(tfPesquisaCliente.getText()));
    }//GEN-LAST:event_tfPesquisaClienteFocusLost

    private void tfCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCepKeyReleased
        String cp = tfCep.getText();
        cp = cp.replaceAll("\\D*", ""); //ignora qualquer coisa que não seja numero.  
        int cont = cp.length();
        if (cont == 8) {
            try {
                correio();
                tfEndereco.requestFocus();
            } catch (Error e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_tfCepKeyReleased

    private void btExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportExcelActionPerformed
        String nomeArquivo = JOptionPane.showInputDialog(this, "Informe o nome do arquivo para a exportação", "Solicitação", JOptionPane.QUESTION_MESSAGE);
        filename = "C:/" + nomeArquivo + ".xls";  // local do arquivo
        exportarCliente();
    }//GEN-LAST:event_btExportExcelActionPerformed

    private void tfComplementoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfComplementoFocusLost

        // converte em maiusculo o que o usuario digitar
        this.tfComplemento.setText(tfComplemento.getText().toUpperCase());
        //tira acentos
        BLTiraAcentos blTiraAcentos = new BLTiraAcentos();
        this.tfComplemento.setText(blTiraAcentos.TiraAcentos(tfComplemento.getText()));
    }//GEN-LAST:event_tfComplementoFocusLost

    private void btAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjudaActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Utilizando as Funções do Cadastro de Cliente\n"
                + "\n"
                + "Ao abrimos o formulário de cliente, deparamos com as maiorias dos comandos necessários para a utilização da ferramenta.\n"
                + "\n"
                + "No botão NOVO, exibirá a tela de inserção de dados, insira os dados solicitados de preferência todos, pois são muito importantes, no campo CEP, basta digitar e aguardar \n"
                + " o preenchimento dos demais campos, pois a aplicação faz uma busca nos servidores dos correios e tras as informações corretas mediante o CEP informado.\n"
                + "\n"
                + "Logo abaixo na mesma tela há o botão de CANCELAR, onde você pode parar qualquer atividade que esteja executando sem salvar as informações.\n"
                + "\n"
                + "Finalmente temos o botão SALVAR onde deve ser utilizado para salvar os dados do novo cliente como também as alterações realizadas nas informações do cliente.\n"
                + "\n"
                + "Caso precise alterar alguma informação do cliente, basta selecioná-lo e clicar no botão ALTERAR\n"
                + "todas as informações cadastradas serão exibidas em seus campos correspondentes, o usuário do sistema pode alterar as informações e clicar em SALVAR.\n"
                + "\n"
                + "Para excluir o Cliente, só precisa selecionar e clicar no botão EXCLUIR.\n"
                + "\n"
                + "Para imprimir o Cliente, basta selecionar e clicar em IMPRIMIR CLIENTE.", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btAjudaActionPerformed

    private void tfCpfCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCpfCnpjFocusLost
        
        checarCPF();

    }//GEN-LAST:event_tfCpfCnpjFocusLost

    private void tfRGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRGKeyReleased

        checarRG();

    }//GEN-LAST:event_tfRGKeyReleased
    
    private void checarRG(){
        
        rg = tfRG.getText();
        rg = rg.replaceAll("\\D*", "");
        
    }
    
    private void checarCPF() {
        
        cpf = tfCpfCnpj.getText();
        cpf = cpf.replaceAll("[^0-9]", "");
        
        if (tipoCadastro == "novo" && cpf.equals("")) {
            
            System.out.println("primeira opção");
        } else if (tipoCadastro == "novo" && validaCPF.isCPF(cpf) == true) {
            System.out.println(tipoCadastro);
            System.out.println(cpf);
            
            validaCPF.isCPF(cpf);
            
        } else if (tipoCadastro == "alteracao") {
            
            System.out.println(tipoCadastro);
        } else {
            JOptionPane.showMessageDialog(this, "CPF Inválido!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            tfCpfCnpj.requestFocus();
        }
        
    }
    
    private void exportarCliente() {
        
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("CLIENTES");
        
        try {
            listaModelCliente = controllerCliente.getListaClienteController();
            for (int i = 0; i < listaModelCliente.size(); i++) {
                HSSFRow rowhead = sheet.createRow((short) 0);
                rowhead.createCell(0).setCellValue("Nome");
                rowhead.createCell(1).setCellValue("Celular");
                rowhead.createCell(2).setCellValue("Telefone Residencial");
                rowhead.createCell(3).setCellValue("E-mail");
                rowhead.createCell(4).setCellValue("CPF");

                // definindo seus valores
                HSSFRow row = sheet.createRow(i);
                row.createCell(0).setCellValue(listaModelCliente.get(i).getNome());
                row.createCell(1).setCellValue(listaModelCliente.get(i).getCelular());
                row.createCell(2).setCellValue(listaModelCliente.get(i).getTelefone());
                row.createCell(3).setCellValue(listaModelCliente.get(i).getEmail());
                row.createCell(4).setCellValue(listaModelCliente.get(i).getCpf());
                
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
    
    protected void alterarCliente() {
        if (verificarCampos()) {
            
            desabilitarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Informe o nome do cliente!");
            tfNome.requestFocus();
        }
    }
    
    private boolean alteraCliente() {
        
        modelCliente.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelCliente.setNome(this.tfNome.getText());
        modelCliente.setCpf(this.tfCpfCnpj.getText());
        modelCliente.setRg(this.tfRG.getText());
        modelCliente.setEndereco(this.tfEndereco.getText());
        modelCliente.setBairro(this.tfBairro.getText());
        modelCliente.setCidade(this.tfCidade.getText());
        modelCliente.setEstado(this.cbEstado.getSelectedItem().toString());
        modelCliente.setCep(this.tfCep.getText());
        modelCliente.setTelefone(this.tfTelefoneFixo.getText());
        modelCliente.setObservacao(this.tfObservacao.getText());
        modelCliente.setEmail(this.tfemail.getText());
        modelCliente.setComplemento(this.tfComplemento.getText());
        modelCliente.setCelular(this.tfTelefone.getText());
        try {
            modelCliente.setDataNascimento(bl.converterDataParaDateUS(jDate.getDate()));
        } catch (Exception ex) {
            Logger.getLogger(ViewClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        //alterar 
        if (controllerCliente.atualizarClienteController(modelCliente)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.desabilitarCampos();
            this.carregarClientes();
            jTabbedPane1.setSelectedIndex(0);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean salvarCliente() {
        
        if (jDate.getDate() == null || tfNome.getText().equals("") || tfTelefone.getText().equals("") || tfCpfCnpj.getText().equals("")) {
            
            JOptionPane.showMessageDialog(this, "Você deve preencher NOME, Data Nascimento, CPF e Celular!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            tfNome.requestFocus();
            return true;
            
        } else {
            
            modelCliente.setNome(this.tfNome.getText());
            modelCliente.setCpf(this.tfCpfCnpj.getText());
            modelCliente.setRg(this.tfRG.getText());
            modelCliente.setEndereco(this.tfEndereco.getText());
            modelCliente.setBairro(this.tfBairro.getText());
            modelCliente.setCidade(this.tfCidade.getText());
            modelCliente.setEstado(this.cbEstado.getSelectedItem().toString());
            modelCliente.setCep(this.tfCep.getText());
            modelCliente.setTelefone(this.tfTelefoneFixo.getText());
            modelCliente.setObservacao(this.tfObservacao.getText());
            modelCliente.setEmail(this.tfemail.getText());
            modelCliente.setComplemento(this.tfComplemento.getText());
            modelCliente.setCelular(this.tfTelefone.getText());
            
            try {
                modelCliente.setDataNascimento(bl.converterDataParaDateUS(jDate.getDate()));
            } catch (Exception ex) {
                Logger.getLogger(ViewClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            //salvar 
            if (controllerCliente.salvarClienteController(modelCliente) > 0) {
                JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
                this.desabilitarCampos();
                this.carregarClientes();
                jTabbedPane1.setSelectedIndex(0);
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    private boolean recuperarCliente() {
        //recebe a linha selecionada
        int linha = this.tbClientes.getSelectedRow();

        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) tbClientes.getValueAt(linha, 0);
        
        try {
            //recupera os dados do banco
            modelCliente = controllerCliente.getClienteController(codigo);
            //seta os dados na interface
            this.tfCodigo.setText(String.valueOf(modelCliente.getCodigo()));
            this.tfNome.setText(modelCliente.getNome());
            this.tfRG.setText(modelCliente.getRg());
            this.tfEndereco.setText(modelCliente.getEndereco());
            this.tfBairro.setText(modelCliente.getBairro());
            this.jDate.setDate(modelCliente.getDataNascimento());
            this.cbEstado.setSelectedItem(modelCliente.getEstado());
            this.tfCidade.setText(modelCliente.getCidade());
            this.tfCep.setText(modelCliente.getCep());
            this.tfTelefone.setText(modelCliente.getCelular());
            this.tfCpfCnpj.setText(modelCliente.getCpf());
            this.tfObservacao.setText(modelCliente.getObservacao());
            this.tfemail.setText(modelCliente.getEmail());
            this.tfComplemento.setText(modelCliente.getComplemento());
            this.tfTelefoneFixo.setText(modelCliente.getTelefone());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    private void carregarClientes() {
        listaModelCliente = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) tbClientes.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCliente.get(i).getCodigo(),
                listaModelCliente.get(i).getNome(),
                listaModelCliente.get(i).getDataNascimento(),
                listaModelCliente.get(i).getCelular(),
                listaModelCliente.get(i).getTelefone(),
                listaModelCliente.get(i).getEmail()
            });
            d3 = listaModelCliente.get(i).getDataNascimento();
            
            Calendar dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(d3);
            int mesNascimento = dataNascimento.get(Calendar.MONTH) + 1;
            int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH);
            
            Calendar hoje = Calendar.getInstance();
            int mesAtual = hoje.get(Calendar.MONTH) + 1;
            int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
            
            if (mesAtual == mesNascimento && diaAtual == diaNascimento) {
                
                System.out.println("teste");
                Icon d = new ImageIcon(getClass().getResource("/imagens/32x32/bolo.png"));

                //enviar e-mail de aniversário
                lbBolo.setIcon(d);
                lbBolo.setVisible(true);
            }
        }
        
    }
    
    private void novoCliente() {
        habilitarCampos();
        tfCodigo.setText("Novo");
        tfNome.setText("");
        tfCidade.setText("");
        tfRG.setText("");
        tfEndereco.setText("");
        tfBairro.setText("");
        cbEstado.setSelectedIndex(0);
        tfCep.setText("");
        tfTelefone.setText("");
        tfTelefoneFixo.setText("");
        tfCpfCnpj.setText("");
        tfObservacao.setText("");
        tfemail.setText("");
        tfComplemento.setText("");
        tipoCadastro = "novo";
        jDate.setDate(null);
    }
    
    protected boolean verificarCampos() {
        if (!tfNome.getText().trim().equals("")) {
            return true;
        }
        return false;
    }
    
    private void habilitarCampos() {
        tfNome.setEditable(true);
        tfEndereco.setEditable(true);
        tfBairro.setEditable(true);
        tfCidade.setEnabled(true);
        tfRG.setEnabled(true);
        tfCep.setEditable(true);
        cbEstado.setEnabled(true);
        tfTelefone.setEditable(true);
        tfTelefoneFixo.setEditable(true);
        tfObservacao.setEditable(true);
        tfemail.setEditable(true);
        tfCpfCnpj.setEnabled(true);
        btSalvar.setEnabled(true);
        jDate.setEnabled(true);
        tfComplemento.setEditable(true);
    }
    
    protected void desabilitarCampos() {
        tfCpfCnpj.setText("");
        jDate.setDate(null);
        tfCodigo.setText("");
        tfRG.setText("");
        tfNome.setText("");
        tfEndereco.setText("");
        tfBairro.setText("");
        cbEstado.setSelectedIndex(-1);
        tfCep.setText("");
        tfTelefone.setText("");
        tfTelefoneFixo.setText("");
        tfObservacao.setText("");
        tfemail.setText("");
        tfComplemento.setText("");
        tfCidade.setText("");
        tfNome.setEditable(false);
        tfEndereco.setEditable(false);
        tfBairro.setEditable(false);
        tfCidade.setEnabled(false);
        tfCep.setEditable(false);
        cbEstado.setEnabled(false);
        tfTelefone.setEditable(false);
        tfTelefoneFixo.setEditable(false);
        tfCpfCnpj.setEnabled(false);
        tfObservacao.setEditable(false);
        tfemail.setEditable(false);
        btSalvar.setEnabled(false);
        jDate.setEnabled(false);
        tfRG.setEnabled(false);
        tfComplemento.setEditable(false);
        
    }
    
    private void aniversario() {
        
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(d3);
        int mesNascimento = dataNascimento.get(Calendar.MONTH) + 1;
        int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH);
        
        Calendar hoje = Calendar.getInstance();
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        
        if (mesAtual == mesNascimento && diaAtual == diaNascimento) {
            lbBolo.setVisible(true);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjuda;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExportExcel;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisaCliente;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JLabel lbBolo;
    private javax.swing.JTable tbClientes;
    protected javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JFormattedTextField tfCpfCnpj;
    protected javax.swing.JTextField tfEndereco;
    protected javax.swing.JTextField tfNome;
    private javax.swing.JTextArea tfObservacao;
    protected javax.swing.JTextField tfPesquisaCliente;
    private javax.swing.JTextField tfRG;
    private javax.swing.JFormattedTextField tfTelefone;
    private javax.swing.JFormattedTextField tfTelefoneFixo;
    protected javax.swing.JTextField tfemail;
    // End of variables declaration//GEN-END:variables

}
