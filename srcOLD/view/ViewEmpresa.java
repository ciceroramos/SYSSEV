/*
 * ViewClientes.java
 *
 */
package view;

import controller.ControllerEmpresa;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelEmpresa;
import util.BLTiraAcentos;
import util.ModeloTabelaGeral;
import util.WebServiceCep;

/**
 * @author cicero
 */
public class ViewEmpresa extends javax.swing.JFrame {

    ModelEmpresa modelEmpresa = new ModelEmpresa();
    ControllerEmpresa controllerEmpresa = new ControllerEmpresa();
    ArrayList<ModelEmpresa> listaModelEmpresas = new ArrayList<>();

    String contrato;

    /**
     * Creates new form Empresas
     */
    public ViewEmpresa() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        tblEmpresa.setDefaultRenderer(Object.class, new ModeloTabelaGeral());
        this.carregarEmpresa();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfNomeFantasia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfRazaoSocial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfCNPJ = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        cbContrato = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        tfCep = new javax.swing.JFormattedTextField();
        tfTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();
        btCancelar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empresa <<SysHair>>");
        setBackground(new java.awt.Color(245, 245, 245));
        setResizable(false);

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(245, 245, 245));
        tfCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfCodigo.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Código:");

        tfNomeFantasia.setEditable(false);
        tfNomeFantasia.setBackground(new java.awt.Color(245, 245, 245));
        tfNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNomeFantasia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomeFantasia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfNomeFantasia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeFantasiaFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("<html><b>Nome Fantasia:<font color=\"red\">*</font></b>");

        tfRazaoSocial.setEditable(false);
        tfRazaoSocial.setBackground(new java.awt.Color(245, 245, 245));
        tfRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfRazaoSocial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRazaoSocial.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("<html><b>Razão Social:<font color=\"red\">*</font></b>");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("<html><b>CNPJ:<font color=\"red\">*</font></b>");

        tfCNPJ.setEditable(false);
        tfCNPJ.setBackground(new java.awt.Color(255, 255, 204));
        tfCNPJ.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCNPJ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCNPJ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel12.setText("<html><b>CPF:<font color=\"red\">*</font></b>");

        tfCpf.setEditable(false);
        tfCpf.setBackground(new java.awt.Color(255, 255, 204));
        tfCpf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel13.setText("Contrato:");

        cbContrato.setBackground(new java.awt.Color(245, 245, 245));
        cbContrato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ANUAL", "MENSAL" }));
        cbContrato.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Bairro:");

        tfBairro.setEditable(false);
        tfBairro.setBackground(new java.awt.Color(245, 245, 245));
        tfBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfBairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tfEndereco.setEditable(false);
        tfEndereco.setBackground(new java.awt.Color(245, 245, 245));
        tfEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEndereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cidade:");

        cbEstado.setBackground(new java.awt.Color(245, 245, 245));
        cbEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbEstado.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("UF:");

        tfCep.setEditable(false);
        tfCep.setBackground(new java.awt.Color(245, 245, 245));
        tfCep.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCepKeyReleased(evt);
            }
        });

        tfTelefone.setEditable(false);
        tfTelefone.setBackground(new java.awt.Color(245, 245, 245));
        tfTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Telefone:");

        tblEmpresa.setAutoCreateRowSorter(true);
        tblEmpresa.setBackground(new java.awt.Color(245, 245, 245));
        tblEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CNPJ", "CPF", "Tipo Contrato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpresa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblEmpresa.setRowHeight(20);
        tblEmpresa.setShowVerticalLines(false);
        tblEmpresa.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblEmpresa);
        if (tblEmpresa.getColumnModel().getColumnCount() > 0) {
            tblEmpresa.getColumnModel().getColumn(0).setResizable(false);
            tblEmpresa.getColumnModel().getColumn(1).setResizable(false);
            tblEmpresa.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblEmpresa.getColumnModel().getColumn(2).setResizable(false);
            tblEmpresa.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblEmpresa.getColumnModel().getColumn(3).setResizable(false);
            tblEmpresa.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblEmpresa.getColumnModel().getColumn(4).setResizable(false);
            tblEmpresa.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btSalvar.setText("Salvar Alteração");
        btSalvar.setBorder(null);
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CEP:");

        tfCidade.setEditable(false);
        tfCidade.setBackground(new java.awt.Color(245, 245, 245));
        tfCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tfCidade.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("E-mail");

        tfEmail.setEditable(false);
        tfEmail.setBackground(new java.awt.Color(245, 245, 245));
        tfEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8)
                                .addGap(219, 219, 219)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(tfNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel2)
                                .addGap(275, 275, 275)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))
                                .addGap(6, 6, 6)
                                .addComponent(cbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5)
                                        .addGap(147, 147, 147)
                                        .addComponent(jLabel4)
                                        .addGap(155, 155, 155)
                                        .addComponent(jLabel6)
                                        .addGap(117, 117, 117)
                                        .addComponent(jLabel7))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btCancelar)
                        .addGap(51, 51, 51)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar)
                        .addGap(49, 49, 49)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbEstado)
                    .addComponent(tfCep)
                    .addComponent(tfTelefone)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeFantasiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFantasiaFocusLost

        // converte em maiusculo o que o usuario digitar
        this.tfNomeFantasia.setText(tfNomeFantasia.getText().toUpperCase());
        //tira acentos
        BLTiraAcentos blTiraAcentos = new BLTiraAcentos();
        this.tfNomeFantasia.setText(blTiraAcentos.TiraAcentos(tfNomeFantasia.getText()));
    }//GEN-LAST:event_tfNomeFantasiaFocusLost
//        try {
//            JFileChooser chooser = new JFileChooser();
//            chooser.showOpenDialog(btLocalizarImagem);
//            File file = chooser.getSelectedFile().getCanonicalFile();
//            String l = file.getAbsolutePath();
//            String caminhoImagem = (l);
//            tfLogomarca.setText(caminhoImagem);
//
//        } catch (Exception e) {
//
//            JOptionPane.showMessageDialog(null, e);
//
//        }

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        alterarEmpresa();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        novo();
        habilitarCampos();
        recuperarEmpresa();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

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

    private boolean alterarEmpresa() {

        contrato = cbContrato.getSelectedItem().toString();

        modelEmpresa.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelEmpresa.setNomeFantasia(this.tfNomeFantasia.getText());
        modelEmpresa.setRazaoSocial(this.tfRazaoSocial.getText());
        modelEmpresa.setCnpj(this.tfCNPJ.getText());
        modelEmpresa.setCpf(this.tfCpf.getText());
        modelEmpresa.setEndereco(this.tfEndereco.getText());
        modelEmpresa.setBairro(this.tfBairro.getText());
        modelEmpresa.setCidade(this.tfCidade.getText());
        modelEmpresa.setEstado(this.cbEstado.getSelectedItem().toString());
        modelEmpresa.setCep(this.tfCep.getText());
        modelEmpresa.setTelefone(this.tfTelefone.getText());
        modelEmpresa.setContrato(contrato);
        modelEmpresa.setEmail(this.tfEmail.getText());
        //modelEmpresa.setCaminhoLogo(this.tfLogomarca.getText());

        //alterar 
        if (controllerEmpresa.atualizarEmpresaController(modelEmpresa)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.desabilitarCampos();
            this.carregarEmpresa();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean recuperarEmpresa() {
        //pega o codigo da linha selecionada
        int codigo = (Integer) tblEmpresa.getValueAt(0, 0);

        try {
            //recupera os dados do banco
            modelEmpresa = controllerEmpresa.getEmpresaController(codigo);
            //seta os dados na interface
            this.tfCodigo.setText(String.valueOf(modelEmpresa.getCodigo()));
            this.tfNomeFantasia.setText(modelEmpresa.getNomeFantasia());
            this.tfRazaoSocial.setText(modelEmpresa.getRazaoSocial());
            this.tfEndereco.setText(modelEmpresa.getEndereco());
            this.tfBairro.setText(modelEmpresa.getBairro());
            this.cbEstado.setSelectedItem(modelEmpresa.getEstado());
            this.tfCidade.setText(modelEmpresa.getCidade());
            this.tfCep.setText(modelEmpresa.getCep());
            this.tfTelefone.setText(modelEmpresa.getTelefone());
            this.tfCNPJ.setText(modelEmpresa.getCnpj());
            this.tfCpf.setText(modelEmpresa.getCpf());
            this.cbContrato.setSelectedItem(modelEmpresa.getContrato());
            this.tfEmail.setText(modelEmpresa.getEmail());
           // this.tfLogomarca.setText(modelEmpresa.getCaminhoLogo());

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private void carregarEmpresa() {
        modelEmpresa = controllerEmpresa.getEmpresaController(1);
        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        modelo.addRow(new Object[]{
            modelEmpresa.getCodigo(),
            modelEmpresa.getNomeFantasia(),
            modelEmpresa.getCnpj(),
            modelEmpresa.getCpf(),
            modelEmpresa.getContrato()

        });
    }

    private void novo() {
        habilitarCampos();
        tfCodigo.setText("Novo");
        tfNomeFantasia.setText("");
        tfRazaoSocial.setText("");
        tfEndereco.setText("");
        tfBairro.setText("");
        tfCep.setText("");
        tfTelefone.setText("");
        tfCNPJ.setText("");
        tfCpf.setText("");
        tfEmail.setText("");
    }

    protected boolean verificarCampos() {
        if (!tfNomeFantasia.getText().trim().equals("")) {
            return true;
        }
        return false;
    }

    private void habilitarCampos() {
        tfNomeFantasia.setEditable(true);
        tfRazaoSocial.setEditable(true);
        cbContrato.setEnabled(true);
        tfEndereco.setEditable(true);
        tfBairro.setEditable(true);
        tfCidade.setEnabled(true);
        tfCep.setEnabled(true);
        tfCep.setEditable(true);
        cbEstado.setEnabled(true);
        tfTelefone.setEditable(true);
        tfCNPJ.setEditable(true);
        tfCpf.setEditable(true);
        btSalvar.setEnabled(true);
        tfEmail.setEnabled(true);
        tfEmail.setEditable(true);
    }

    protected void desabilitarCampos() {
        tfNomeFantasia.setEditable(false);
        tfRazaoSocial.setEditable(true);
        cbContrato.setEnabled(false);
        tfEndereco.setEditable(false);
        tfBairro.setEditable(false);
        tfCidade.setEnabled(false);
        tfCep.setEditable(false);
        cbEstado.setEnabled(false);
        tfTelefone.setEditable(false);
        tfCNPJ.setEditable(false);
        tfCpf.setEditable(false);
        btSalvar.setEnabled(false);
        tfEmail.setEnabled(false);
        tfCodigo.setText("");
        tfNomeFantasia.setText("");
        tfRazaoSocial.setText("");
        tfEndereco.setText("");
        tfBairro.setText("");
        tfCep.setText("");
        tfCidade.setText("");
        tfTelefone.setText("");
        tfCNPJ.setText("");
        tfCpf.setText("");
        tfEmail.setText("");
        cbContrato.setSelectedIndex(-1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbContrato;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEmpresa;
    protected javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCNPJ;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    protected javax.swing.JTextField tfEndereco;
    protected javax.swing.JTextField tfNomeFantasia;
    private javax.swing.JTextField tfRazaoSocial;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables

}
