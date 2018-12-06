package view;

import controller.ControllerEmpresa;
import controller.ControllerUsuario;
import controller.ControllerValidaSistema;
import java.awt.Color;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.ModelEmpresa;
import model.ModelSessaoUsuario;
import model.ModelUsuario;
import model.ModelValidaSistema;
import org.apache.commons.mail.EmailException;
import util.BLDatas;
import util.EnviaEmail;

public class ViewLogin extends javax.swing.JFrame {

    private ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();

    ModelValidaSistema model = new ModelValidaSistema();
    ControllerValidaSistema controller = new ControllerValidaSistema();
    ControllerEmpresa controllerEmpresa = new ControllerEmpresa();
    ModelEmpresa modelEmpresa = new ModelEmpresa();
    ArrayList<ModelEmpresa> listaModelEmpresas = new ArrayList<>();

    BLDatas bLDatas = new BLDatas();

    public ViewLogin() {
        initComponents();
        this.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();
        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Login <<SysSeV>>");
        setBackground(new java.awt.Color(255, 102, 0));
        setMaximumSize(new java.awt.Dimension(321, 167));
        setMinimumSize(new java.awt.Dimension(321, 167));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jtfUsuario.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        jtfUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 145, 30));

        jtfSenha.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        jtfSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtfSenha.setForeground(new java.awt.Color(255, 255, 255));
        jtfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jtfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 145, 30));

        bEntrar.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        bEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/OK.png"))); // NOI18N
        bEntrar.setToolTipText("OK");
        bEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(bEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        bSair.setBackground(new Color(1.0f,1.0f,1.0f,0f));
        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/No.png"))); // NOI18N
        bSair.setToolTipText("Sair");
        bSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });
        getContentPane().add(bSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Versão 1.5");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(245, 245, 245));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sys");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Estoque de Veículos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 275, -1));

        jLabel8.setBackground(new java.awt.Color(245, 245, 245));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SeV");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel7.setBackground(jLabel7.getBackground());
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoLogin.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        int codigo = 0;
        String contrato = controllerEmpresa.getListaEmpresaController().get(codigo).getContrato();
        System.out.println(contrato);

        if (contrato.equals("MENSAL")) {
            mensal();
        } else {
            anual();
        }

    }//GEN-LAST:event_bEntrarActionPerformed

    private void mensal() {

        Date d1 = null;
        Date d2 = null;
        int cod = 0;

        try {
            d1 = bLDatas.converterDataStringParaDate(bLDatas.retornaData()); //data atual
            d2 = controller.getValidaSistema().get(cod).getDataVencimento(); //data gravada no bd  

            if (d2 == null) {
                JOptionPane.showMessageDialog(null, "Deseja Licenciar");
                this.dispose();
                new ViewSobre(this, rootPaneCheckingEnabled).setVisible(true);
            } else if (d1.before(d2)) {
                autenticar();
            } else {
                JOptionPane.showMessageDialog(null, "Contate o Suporte");
                new ViewSobre(this, rootPaneCheckingEnabled).setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void anual() {

        Date d1 = null;
        Date d2 = null;
        int cod = 0;

        try {
            d1 = bLDatas.converterDataStringParaDate(bLDatas.retornaData()); //data atual
            d2 = controller.getValidaSistema().get(cod).getDataVencimento(); //data gravada no bd  

            if (d2 == null) {
                JOptionPane.showMessageDialog(null, "Deseja Licenciar");
                this.dispose();
                new ViewSobre(this, rootPaneCheckingEnabled).setVisible(true);
            } else if (d1.before(d2)) {
                autenticar();
            } else {
                JOptionPane.showMessageDialog(null, "Contate o Suporte");
                new ViewSobre(this, rootPaneCheckingEnabled).setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void autenticar() {

        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setLogin(this.jtfUsuario.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));

        if (controllerUsuario.getUsuarioController(modelUsuario)) {
            modelUsuario = controllerUsuario.getUsuarioController(modelUsuario.getLogin());
            modelSessaoUsuario.nome = modelUsuario.getNome();
            modelSessaoUsuario.codigo = modelUsuario.getCodigo();
            modelSessaoUsuario.login = modelUsuario.getLogin();
            ViewPrincipal viewPrincipal = new ViewPrincipal();
            viewPrincipal.setVisible(true);
            verificaHora();
            isInternetReachable();
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuário/Senha inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            jtfUsuario.setText("");
            jtfSenha.setText("");
            jtfUsuario.requestFocus();
        }

    }

    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        //autenticar();
    }//GEN-LAST:event_jtfSenhaActionPerformed

    public void verificaHora() {
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int mim = c.get(Calendar.MINUTE);

        System.out.println(hora + ":" + mim);
        if (hora > 6 && hora <= 12) {
            JOptionPane.showMessageDialog(null, "Bom Dia e Bom Trabalho!", "Bem Vindo(a)!", JOptionPane.INFORMATION_MESSAGE);
        } else if (hora >= 12 && hora <= 18) {
            JOptionPane.showMessageDialog(null, "Boa Tarde e Bom Trabalho!", "Bem Vindo(a)!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Boa Noite e Bom Trabalho!", "Bem Vindo(a)!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jtfUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jtfSenha.requestFocus();
        }
    }//GEN-LAST:event_jtfUsuarioKeyPressed

    public static boolean isInternetReachable() {

        //final Carregando carregando = new Carregando();
        final EnviaEmail email = new EnviaEmail();

        try {
            //make a URL to a known source
            URL url = new URL("http://www.google.com");
            HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
            Object objData = urlConnect.getContent();
            //carregando.setVisible(true);
            if (true) {
                Thread t = new Thread() {
                    @Override
                    public void run() {
                        try {

                            email.sendEmail();

                            //carregando.dispose();
                        } catch (EmailException ex) {
                            Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                };
                t.start();

            } else {

                System.out.println("Sem conexão");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //começa o look aqui
                LookAndFeel lf = UIManager.getLookAndFeel();

                try {

                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }

                } catch (UnsupportedLookAndFeelException exc) {
                } catch (ClassNotFoundException exc) {
                } catch (InstantiationException exc) {
                } catch (IllegalAccessException exc) {
                }

                UIManager.put("nimbusBase", new Color(80, 100, 242));

                UIManager.put("nimbusBlueGrey", new Color(190, 189, 170));

                UIManager.put("control", new Color(242, 242, 242));
                //temina o look aqui
                new ViewLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

}
