package view;

import controller.ControllerCliente;
import controller.ControllerPermissaousuario;
import controller.ControllerVeiculo;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.InetAddress;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.ModelPermissaousuario;
import model.ModelSessaoUsuario;
import util.AguardeGerandoRelatorio;
import util.BLDatas;

/**
 *
 * @author cicero
 *
 */
public class ViewPrincipal extends javax.swing.JFrame {

    String pNomeUsuario, nomecomputador, ip;

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);        
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        initComponents();
        configurar();       
        infoPC();
        liberarModulos();
//        //metodo para ajuste de tela
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        Dimension d = tk.getScreenSize();
//        System.out.println("Screen width = " + d.width);
//        System.out.println("Screen height = " + d.height);
//        setBounds(WIDTH, WIDTH, d.width, d.height);
        
        //pegarResolucao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlData = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlNomeMaquina = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlIP = new javax.swing.JLabel();
        lbconexao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btClientes = new javax.swing.JButton();
        btVeiculos = new javax.swing.JButton();
        btRegistrarVenda = new javax.swing.JButton();
        panelImage = new componentes.UJPanelImagem();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();
        jmCadastrar = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jmiVeiculo = new javax.swing.JMenuItem();
        jmiUsuario = new javax.swing.JMenuItem();
        miEmpresa = new javax.swing.JMenuItem();
        jmVendas = new javax.swing.JMenu();
        jmiRegistrarVenda = new javax.swing.JMenuItem();
        jmiConsultarVenda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiRelClientes = new javax.swing.JMenuItem();
        jmiRelVeiculo = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmiSobre = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SysSev 1.0 - Sistema Para Gerenciamento de Estoque de Veículo");
        setExtendedState(6);
        setFocusTraversalPolicyProvider(true);
        setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        setLocationByPlatform(true);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Logado como:");

        jlUsuario.setForeground(new java.awt.Color(255, 0, 51));
        jlUsuario.setText("usuaario");

        jlData.setForeground(new java.awt.Color(255, 0, 51));
        jlData.setText("data");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Data de login:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Nome Máquina:");

        jlNomeMaquina.setForeground(new java.awt.Color(255, 0, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("IP:");

        jlIP.setForeground(new java.awt.Color(255, 0, 51));

        lbconexao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsuario)
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNomeMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(lbconexao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlData)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jlData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlIP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNomeMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbconexao))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, null));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        btClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/User group.png"))); // NOI18N
        btClientes.setText("Clientes");
        btClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btClientes.setEnabled(false);
        btClientes.setMaximumSize(new java.awt.Dimension(150, 40));
        btClientes.setMinimumSize(new java.awt.Dimension(150, 40));
        btClientes.setPreferredSize(new java.awt.Dimension(150, 40));
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btVeiculos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Delivery.png"))); // NOI18N
        btVeiculos.setText("Veículos");
        btVeiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVeiculos.setEnabled(false);
        btVeiculos.setMaximumSize(new java.awt.Dimension(150, 40));
        btVeiculos.setMinimumSize(new java.awt.Dimension(150, 40));
        btVeiculos.setPreferredSize(new java.awt.Dimension(150, 40));
        btVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeiculosActionPerformed(evt);
            }
        });

        btRegistrarVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btRegistrarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Shopping cart.png"))); // NOI18N
        btRegistrarVenda.setText("Venda");
        btRegistrarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRegistrarVenda.setEnabled(false);
        btRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(138, 138, 138)
                .addComponent(btVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(128, 128, 128)
                .addComponent(btRegistrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRegistrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelImage.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelImage.setImagem(new java.io.File("C:\\SYSSEV\\logo.jpeg"));

        javax.swing.GroupLayout panelImageLayout = new javax.swing.GroupLayout(panelImage);
        panelImage.setLayout(panelImageLayout);
        panelImageLayout.setHorizontalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImageLayout.setVerticalGroup(
            panelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fenix trans.png"))); // NOI18N
        jLabel2.setToolTipText("https://sites.google.com/view/fenixsoftcg");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jmArquivo.setText("Arquivo |");
        jmArquivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmArquivo.add(jSeparator1);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem4.setText("Backup");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jmArquivo.add(jMenuItem4);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jmArquivo.add(mnuSair);

        jMenuBar1.add(jmArquivo);

        jmCadastrar.setText("Cadastros |");
        jmCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jmiClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmiClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmiClientes.setText("Clientes");
        jmiClientes.setEnabled(false);
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiClientes);

        jmiVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jmiVeiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmiVeiculo.setText("Veículos");
        jmiVeiculo.setEnabled(false);
        jmiVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVeiculoActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiVeiculo);

        jmiUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jmiUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmiUsuario.setText("Usuário");
        jmiUsuario.setEnabled(false);
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiUsuario);

        miEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        miEmpresa.setText("Empresa");
        miEmpresa.setEnabled(false);
        miEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmpresaActionPerformed(evt);
            }
        });
        jmCadastrar.add(miEmpresa);

        jMenuBar1.add(jmCadastrar);

        jmVendas.setText("Vendas |");
        jmVendas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jmiRegistrarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jmiRegistrarVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmiRegistrarVenda.setText("Vendas");
        jmiRegistrarVenda.setEnabled(false);
        jmiRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegistrarVendaActionPerformed(evt);
            }
        });
        jmVendas.add(jmiRegistrarVenda);

        jmiConsultarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jmiConsultarVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmiConsultarVenda.setText("Consultar Vendas");
        jmiConsultarVenda.setEnabled(false);
        jmiConsultarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarVendaActionPerformed(evt);
            }
        });
        jmVendas.add(jmiConsultarVenda);

        jMenuBar1.add(jmVendas);

        jMenu1.setText("Relatórios |");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jmiRelClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmiRelClientes.setText("Clientes");
        jmiRelClientes.setEnabled(false);
        jmiRelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRelClientes);

        jmiRelVeiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmiRelVeiculo.setText("Veículos");
        jmiRelVeiculo.setEnabled(false);
        jmiRelVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelVeiculoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRelVeiculo);

        jMenuBar1.add(jMenu1);

        jmAjuda.setText("Ajuda");
        jmAjuda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem3.setText("Contato");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmAjuda.add(jMenuItem3);

        jmiSobre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmiSobre.setText("Sobre o Sistema...");
        jmiSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSobreActionPerformed(evt);
            }
        });
        jmAjuda.add(jmiSobre);

        jMenuBar1.add(jmAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(16, 16, 16)
                .addComponent(panelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1288, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSobreActionPerformed
        JOptionPane.showMessageDialog(null, "SysSev 1.5/ Atualização de 08/2018");

    }//GEN-LAST:event_jmiSobreActionPerformed
    
    private void pegarResolucao() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width + 5), (dimensao.height - 38));

 }
    
    
    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed

        int opcao = JOptionPane.showConfirmDialog(this, "Desseja relizar o Backup agora?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.OK_OPTION) {

            new ViewBackup().setVisible(true);

        } else {
            System.exit(0);
        }

    }//GEN-LAST:event_mnuSairActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
        new ViewClientes().setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVeiculoActionPerformed
        new ViewVeiculos().setVisible(true);
    }//GEN-LAST:event_jmiVeiculoActionPerformed

    private void jmiRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegistrarVendaActionPerformed
        new ViewVenda().setVisible(true);

    }//GEN-LAST:event_jmiRegistrarVendaActionPerformed

    private void jmiConsultarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarVendaActionPerformed
        ViewVenda venda = new ViewVenda();
        venda.setVisible(true);

    }//GEN-LAST:event_jmiConsultarVendaActionPerformed

    private void jmiRelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelClientesActionPerformed
        final AguardeGerandoRelatorio carregando = new AguardeGerandoRelatorio();
        final ControllerCliente controllerCliente = new ControllerCliente();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                // imprimir clientes
                controllerCliente.gerarRelatorioCliente();
                carregando.dispose();
            }
        };
        t.start();
    }//GEN-LAST:event_jmiRelClientesActionPerformed

    private void jmiRelVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelVeiculoActionPerformed
        final AguardeGerandoRelatorio carregando = new AguardeGerandoRelatorio();
        final ControllerVeiculo controllerVeiculo = new ControllerVeiculo();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                // imprimir produtos
                controllerVeiculo.gerarRelatorioTotalVeiculos();
                carregando.dispose();
            }
        };
        t.start();
    }//GEN-LAST:event_jmiRelVeiculoActionPerformed

    private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed

        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_jmiUsuarioActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        new ViewSobre(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void miEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmpresaActionPerformed

        new ViewEmpresa().setVisible(true);
        
    }//GEN-LAST:event_miEmpresaActionPerformed

    private void btVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeiculosActionPerformed
        new ViewVeiculos().setVisible(true);
    }//GEN-LAST:event_btVeiculosActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        new ViewClientes().setVisible(true);
    }//GEN-LAST:event_btClientesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new ViewBackup().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarVendaActionPerformed

        new ViewVenda().setVisible(true);

    }//GEN-LAST:event_btRegistrarVendaActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       Desktop desk = java.awt.Desktop.getDesktop();
        try {
            desk.browse(new java.net.URI("https://sites.google.com/view/fenixsoftcg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    public String retornarUsuarioLogado() {
        return new ModelSessaoUsuario().nome;
    }

    public void infoPC() {

        try {
            nomecomputador = InetAddress.getLocalHost().getHostName().toUpperCase();
            ip = InetAddress.getLocalHost().getHostAddress();
            jlNomeMaquina.setText(nomecomputador);
            jlIP.setText(ip);

        } catch (Exception e) {
            System.out.println("Exception caught =" + e.getMessage());
        }
    }

    private void configurar() {
        
        pNomeUsuario = retornarUsuarioLogado();
        jlUsuario.setText(pNomeUsuario);
        BLDatas bLDatas = new BLDatas();
        jlData.setText(bLDatas.retornaData());
        

    }
    
    

    private void liberarModulos() {
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        ArrayList<ModelPermissaousuario> listaModelPermissaousuarios = new ArrayList<>();
        listaModelPermissaousuarios = controllerPermissaousuario.getListaPermissaousuarioController(new ModelSessaoUsuario().codigo);//cria();
        for (int i = 0; i < listaModelPermissaousuarios.size(); i++) {
            if (listaModelPermissaousuarios.get(i).getPermissao().equals("cliente")) {
                btClientes.setEnabled(true);
                jmiRelClientes.setEnabled(true);
                jmiClientes.setEnabled(true);
            }

            if (listaModelPermissaousuarios.get(i).getPermissao().equals("veiculo")) {
                btVeiculos.setEnabled(true);
                jmiRelVeiculo.setEnabled(true);
                jmiVeiculo.setEnabled(true);
            }

            if (listaModelPermissaousuarios.get(i).getPermissao().equals("usuario")) {
                jmiUsuario.setEnabled(true);
            }
            if (listaModelPermissaousuarios.get(i).getPermissao().equals("venda")) {
                btRegistrarVenda.setEnabled(true);
                jmiRegistrarVenda.setEnabled(true);
                jmiConsultarVenda.setEnabled(true);
             //   jmiRelatorioVendasPeriodo.setEnabled(true);
            }

            if (listaModelPermissaousuarios.get(i).getPermissao().equals("empresa")) {
                miEmpresa.setEnabled(true);
            }

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btRegistrarVenda;
    private javax.swing.JButton btVeiculos;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlIP;
    private javax.swing.JLabel jlNomeMaquina;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenu jmVendas;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiConsultarVenda;
    private javax.swing.JMenuItem jmiRegistrarVenda;
    private javax.swing.JMenuItem jmiRelClientes;
    private javax.swing.JMenuItem jmiRelVeiculo;
    private javax.swing.JMenuItem jmiSobre;
    private javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JMenuItem jmiVeiculo;
    private javax.swing.JLabel lbconexao;
    private javax.swing.JMenuItem miEmpresa;
    private javax.swing.JMenuItem mnuSair;
    public componentes.UJPanelImagem panelImage;
    // End of variables declaration//GEN-END:variables

    private void JButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
