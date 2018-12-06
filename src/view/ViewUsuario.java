package view;              

import controller.ControllerPermissaousuario;
import controller.ControllerUsuario;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelPermissaousuario;
import model.ModelUsuario;
import util.BLTiraAcentos;    
import util.ModeloTabelaGeral;

/**
 *
 * @author cicero
 */
public class ViewUsuario extends javax.swing.JFrame {

    public ViewUsuario() {
        initComponents();
        this.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        jTableUsuarios.setDefaultRenderer(Object.class, new ModeloTabelaGeral());
        this.carregarUsuarios();
        setLocationRelativeTo(null);
        this.cancelarOperacao();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPaneTipoProduto = new javax.swing.JTabbedPane();
        jpCadastro = new javax.swing.JPanel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbConfirmarAlteracao = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfConfirmarSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jcbUsuario = new javax.swing.JCheckBox();
        jcbVendas = new javax.swing.JCheckBox();
        jcbClientes = new javax.swing.JCheckBox();
        jcbVeiculo = new javax.swing.JCheckBox();
        jcbEmpresa = new javax.swing.JCheckBox();
        jpConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários <<SysSev>");
        setResizable(false);

        jTabbedPaneTipoProduto.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        jtfCodigo.setEditable(false);
        jtfCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfCodigo.setToolTipText("Código do tipo do produto");
        jtfCodigo.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código:");

        jtfNome.setBackground(new java.awt.Color(238, 238, 238));
        jtfNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfNome.setToolTipText("");
        jtfNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNomeFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("<html><b>Nome:<font color=\"red\">*</font></b>");

        jbConfirmarAlteracao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbConfirmarAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        jbConfirmarAlteracao.setText("Salvar Alteração");
        jbConfirmarAlteracao.setToolTipText("Confirmar alteração no cadastro do tipo do produto");
        jbConfirmarAlteracao.setBorder(null);
        jbConfirmarAlteracao.setContentAreaFilled(false);
        jbConfirmarAlteracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbConfirmarAlteracao.setEnabled(false);
        jbConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAlteracaoActionPerformed(evt);
            }
        });

        jbCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        jbCadastrar.setText("Salvar");
        jbCadastrar.setToolTipText("Salvar cadastro do tipo de produto");
        jbCadastrar.setBorder(null);
        jbCadastrar.setContentAreaFilled(false);
        jbCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastrar.setEnabled(false);
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setToolTipText("Cancelar operação");
        jbCancelar.setBorder(null);
        jbCancelar.setContentAreaFilled(false);
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setToolTipText("Limpar todos os campos");
        jbNovo.setBorder(null);
        jbNovo.setContentAreaFilled(false);
        jbNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("<html><b>Login:<font color=\"red\">*</font></b>");

        jtfConfirmarSenha.setBackground(new java.awt.Color(238, 238, 238));
        jtfConfirmarSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfConfirmarSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("<html><b>Senha:<font color=\"red\">*</font></b>");

        jtfSenha.setBackground(new java.awt.Color(238, 238, 238));
        jtfSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("<html><b>Confirmar Senha:<font color=\"red\">*</font></b>");

        jtfLogin.setBackground(new java.awt.Color(238, 238, 238));
        jtfLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtfLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfLoginFocusLost(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permissões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbUsuario.setText("Cadastro de Usuário");
        jPanel1.add(jcbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jcbVendas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbVendas.setText("Vendas");
        jcbVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVendasActionPerformed(evt);
            }
        });
        jPanel1.add(jcbVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jcbClientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbClientes.setText("Cadastro de Clientes");
        jPanel1.add(jcbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jcbVeiculo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbVeiculo.setText("Cadastro de Veículos");
        jPanel1.add(jcbVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jcbEmpresa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbEmpresa.setText("Cadastro de Empresa");
        jPanel1.add(jcbEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        javax.swing.GroupLayout jpCadastroLayout = new javax.swing.GroupLayout(jpCadastro);
        jpCadastro.setLayout(jpCadastroLayout);
        jpCadastroLayout.setHorizontalGroup(
            jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpCadastroLayout.createSequentialGroup()
                                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jbConfirmarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpCadastroLayout.createSequentialGroup()
                                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpCadastroLayout.createSequentialGroup()
                                        .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpCadastroLayout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastroLayout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCadastroLayout.setVerticalGroup(
            jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jpCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfirmarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jTabbedPaneTipoProduto.addTab("Cadastro", jpCadastro);

        jTableUsuarios.setAutoCreateRowSorter(true);
        jTableUsuarios.setBackground(new java.awt.Color(245, 245, 245));
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableUsuarios.setRowHeight(20);
        jTableUsuarios.setShowVerticalLines(false);
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        jbExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setToolTipText("Excluir tipo de produto selecionado");
        jbExcluir.setBorder(null);
        jbExcluir.setContentAreaFilled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setToolTipText("Alterar tipo de produto selecionado");
        jButtonAlterar.setBorder(null);
        jButtonAlterar.setContentAreaFilled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultaLayout = new javax.swing.GroupLayout(jpConsulta);
        jpConsulta.setLayout(jpConsultaLayout);
        jpConsultaLayout.setHorizontalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jpConsultaLayout.setVerticalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPaneTipoProduto.addTab("Consulta/Alteração/Exclusão", jpConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneTipoProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // TODO add your handling code here:
        if (jtfNome.getText().equals("") || jtfLogin.getText().equals("") || jtfSenha.getText().toString().equals("") || jtfConfirmarSenha.getText().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Você deve informar todos os dados!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String senha, confirmaSenha;
        senha = new String(this.jtfSenha.getPassword());
        confirmaSenha = new String(this.jtfConfirmarSenha.getPassword());

        //testa se as senhas são iguais
        if (senha.equals(confirmaSenha)) {
            
            this.salvarUsuario();
        } else {
            JOptionPane.showMessageDialog(rootPane, "As senhas digitadas não conferem!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        //salvar tipo produto
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jTableUsuarios.getSelectedRow();
        String nome = (String) jTableUsuarios.getValueAt(linha, 1);
        int codigo = (int) jTableUsuarios.getValueAt(linha, 0);

        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        //pegunta se realmente deseja excluir o tipo de produto
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o usuário:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerUsuario.excluirUsuarioController(codigo)) {
                controllerPermissaousuario.excluirPermissaousuarioController(codigo);
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                this.carregarUsuarios();
                this.novoUsuario();
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        desabilitarCampos();
        desativarPermissao();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        //habilita botão da interface
        jtfCodigo.setEditable(false);
        this.jbCadastrar.setEnabled(true);
        jbConfirmarAlteracao.setEnabled(false);
        novoUsuario();
        jtfNome.requestFocus();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoActionPerformed

        if (this.jtfNome.getText().equals("") || this.jtfLogin.getText().equals("") || this.jtfSenha.getText().toString().equals("") || this.jtfConfirmarSenha.getText().toString().equals("") ) {
            JOptionPane.showMessageDialog(rootPane, "Você deve informar todos os dados!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String senha, confirmaSenha;
        senha = new String(this.jtfSenha.getPassword());
        confirmaSenha = new String(this.jtfConfirmarSenha.getPassword());

        //testa se as senhas são iguais
        if (senha.equals(confirmaSenha)) {
            
            this.alterarUsuario();
        } else {
            JOptionPane.showMessageDialog(rootPane, "As senhas digitadas não conferem!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbConfirmarAlteracaoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        desativarPermissao();
        this.recuperarUsuario();
        this.habilitarCampos();

        //abilita botão da interface
        jtfCodigo.setEditable(false);
        this.jbCadastrar.setEnabled(false);
        jbConfirmarAlteracao.setEnabled(true);

        //volta a aba anterior
        this.jTabbedPaneTipoProduto.setSelectedIndex(this.jTabbedPaneTipoProduto.getSelectedIndex() - 1);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jcbVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVendasActionPerformed

    private void jtfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNomeFocusLost
        // converte em maiusculo o que o usuario digitar
        this.jtfNome.setText(jtfNome.getText().toUpperCase());


    }//GEN-LAST:event_jtfNomeFocusLost

    private void jtfLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfLoginFocusLost
               //tira acentos
        BLTiraAcentos blTiraAcentos = new BLTiraAcentos();
        this.jtfLogin.setText(blTiraAcentos.TiraAcentos(jtfLogin.getText()));
    }//GEN-LAST:event_jtfLoginFocusLost

    /**
     * Salvar
     *
     * @return
     */
    private boolean salvarUsuario() {
        ModelUsuario modelUsuario = new ModelUsuario();
        int codigousuario;
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        modelUsuario.setNome(this.jtfNome.getText());
        modelUsuario.setLogin(this.jtfLogin.getText());
        modelUsuario.setSenha(new String (this.jtfSenha.getPassword()));

        codigousuario = controllerUsuario.salvarUsuarioController(modelUsuario);
        //salvar
        if (codigousuario > 0) {
            controllerPermissaousuario.salvarPermissaousuarioController(setardadosPermissaoUsuario(codigousuario));
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.cancelarOperacao();
            this.carregarUsuarios();
            this.novoUsuario();
            jTabbedPaneTipoProduto.setSelectedIndex(jTabbedPaneTipoProduto.getSelectedIndex() + 1);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public ModelPermissaousuario setardadosPermissaoUsuario(int pCodigoUsuario) {
        ArrayList<ModelPermissaousuario> listaModelPermissaousuarios = new ArrayList<>();
        ModelPermissaousuario modelPermissaousuario = new ModelPermissaousuario();
        modelPermissaousuario = new ModelPermissaousuario();
        if (jcbClientes.isSelected()) {
            modelPermissaousuario = new ModelPermissaousuario();
            modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
            modelPermissaousuario.setPermissao("cliente");
            listaModelPermissaousuarios.add(modelPermissaousuario);
        }
       
        
        if (jcbVeiculo.isSelected()) {
            modelPermissaousuario = new ModelPermissaousuario();
            modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
            modelPermissaousuario.setPermissao("veiculo");
            listaModelPermissaousuarios.add(modelPermissaousuario);
        }

        if (jcbUsuario.isSelected()) {
            modelPermissaousuario = new ModelPermissaousuario();
            modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
            modelPermissaousuario.setPermissao("usuario");
            listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if (jcbVendas.isSelected()) {
            modelPermissaousuario = new ModelPermissaousuario();
            modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
            modelPermissaousuario.setPermissao("venda");
            listaModelPermissaousuarios.add(modelPermissaousuario);
        }
       
        if (jcbEmpresa.isSelected()) {
            modelPermissaousuario = new ModelPermissaousuario();
            modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
            modelPermissaousuario.setPermissao("empresa");
            listaModelPermissaousuarios.add(modelPermissaousuario);
        }

        modelPermissaousuario.setListaModelPermissaousuarios(listaModelPermissaousuarios);
        return modelPermissaousuario;
    }

    /**
     * alterar
     *
     * @return
     */
    private boolean alterarUsuario() {
        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setCodigo(Integer.parseInt(this.jtfCodigo.getText()));
        modelUsuario.setNome(this.jtfNome.getText());
        modelUsuario.setLogin(this.jtfLogin.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));

        //alterar
        if (controllerUsuario.atualizarUsuarioController(modelUsuario)) {
            //exclui as permissões antigas
            controllerPermissaousuario.excluirPermissaousuarioController(modelUsuario.getCodigo());
            //cadastra as novas
            controllerPermissaousuario.salvarPermissaousuarioController(setardadosPermissaoUsuario(modelUsuario.getCodigo()));
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.cancelarOperacao();
            this.carregarUsuarios();
            jTabbedPaneTipoProduto.setSelectedIndex(jTabbedPaneTipoProduto.getSelectedIndex() + 1);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private void cancelarOperacao() {
        desabilitarCampos();
        desativarPermissao();
    }

    /**
     * carrena na tebla
     */
    private void carregarUsuarios() {
        ArrayList<ModelUsuario> listaUsuarios = new ArrayList<>();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        listaUsuarios = controllerUsuario.getListaUsuarioController();

        DefaultTableModel modelo = (DefaultTableModel) jTableUsuarios.getModel();
        modelo.setNumRows(0);

        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaUsuarios.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaUsuarios.get(i).getCodigo(),
                listaUsuarios.get(i).getNome(),
                listaUsuarios.get(i).getLogin()
            });
        }
    }

    /**
     * Pega os dados
     *
     * @return boolean
     */
    private boolean recuperarUsuario() {
        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        ArrayList<ModelPermissaousuario> listaModelPermissaousuarios = new ArrayList<>();

        //recebe a linha selecionada
        int linha = this.jTableUsuarios.getSelectedRow();

        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) jTableUsuarios.getValueAt(linha, 0);

        try {
            //recupera os dados do banco
            modelUsuario = controllerUsuario.getUsuarioController(codigo);
            listaModelPermissaousuarios = controllerPermissaousuario.getListaPermissaousuarioController(codigo);
            //seta os dados na interface
            this.jtfCodigo.setText(String.valueOf(modelUsuario.getCodigo()));
            this.jtfNome.setText(modelUsuario.getNome());
            this.jtfLogin.setText(modelUsuario.getLogin());
            //preencher permissoes
            for (int i = 0; i < listaModelPermissaousuarios.size(); i++) {
                                              
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("cliente")) {
                    jcbClientes.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("veiculo")) {
                    jcbVeiculo.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("usuario")) {
                    jcbUsuario.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("venda")) {
                    jcbVendas.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("empresa")) {
                    jcbEmpresa.setSelected(true);
                }
                
            }

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }

    protected void desabilitarCampos() {
        jtfNome.setEditable(false);
        jtfCodigo.setEditable(false);
        jtfLogin.setEditable(false);
        jtfSenha.setEditable(false);
        jtfConfirmarSenha.setEditable(false);
        jtfNome.setText("");
        jtfLogin.setText("");
        jtfSenha.setText("");
        jtfConfirmarSenha.setText("");
        carregarUsuarios();
    }

    private void novoUsuario() {
        habilitarCampos();
        jtfCodigo.setText("Novo");
        jtfNome.setText("");
        jtfLogin.setText("");
        jtfSenha.setText("");
        jtfConfirmarSenha.setText("");
        desativarPermissao();
    }

    private void desativarPermissao() {
        jcbClientes.setSelected(false);
        jcbVeiculo.setSelected(false);
        jcbUsuario.setSelected(false);
        jcbVendas.setSelected(false);
        jcbEmpresa.setSelected(false);

    }

    private void habilitarCampos() {
        jtfNome.setEditable(true);
        jtfCodigo.setEditable(false);
        jtfLogin.setEditable(true);
        jtfSenha.setEditable(true);
        jtfConfirmarSenha.setEditable(true);
        carregarUsuarios();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneTipoProduto;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConfirmarAlteracao;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JCheckBox jcbClientes;
    private javax.swing.JCheckBox jcbEmpresa;
    private javax.swing.JCheckBox jcbUsuario;
    private javax.swing.JCheckBox jcbVeiculo;
    private javax.swing.JCheckBox jcbVendas;
    private javax.swing.JPanel jpCadastro;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JPasswordField jtfConfirmarSenha;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
