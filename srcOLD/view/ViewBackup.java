package view;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author cicero.ramos
 */
public class ViewBackup extends javax.swing.JFrame {

    private String servidor = "";
    private String nomeDoBanco = "";
    private String usuario = "";
    private String senha = "";
    
    Properties config = new Properties();
    String arquivo = "C:/SYSSEV/idealcarconf.ini";
    
    
    public ViewBackup() {
        initComponents();
        this.setIconImage(new ImageIcon("C:/SYSSEV/fenix trans.png").getImage());
        setLocationRelativeTo(null);
    }

    String path = null;  //caminho
    String FileName;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCaminho = new javax.swing.JTextField();
        btCaminho = new javax.swing.JButton();
        btBackup = new javax.swing.JButton();
        jlMensagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" SysSeV <<Backup>>");
        setBackground(new java.awt.Color(245, 245, 245));

        tfCaminho.setBackground(new java.awt.Color(245, 245, 245));
        tfCaminho.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCaminho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCaminho.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));

        btCaminho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Folder.png"))); // NOI18N
        btCaminho.setText("Caminho");
        btCaminho.setContentAreaFilled(false);
        btCaminho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCaminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaminhoActionPerformed(evt);
            }
        });

        btBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Database.png"))); // NOI18N
        btBackup.setText("Iniciar Backup ");
        btBackup.setContentAreaFilled(false);
        btBackup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackupActionPerformed(evt);
            }
        });

        jlMensagem.setBackground(new java.awt.Color(245, 245, 245));
        jlMensagem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlMensagem.setForeground(new java.awt.Color(51, 102, 255));
        jlMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Backup da Base de Dados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(btCaminho))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btBackup)
                        .addGap(46, 46, 46)
                        .addComponent(jlMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCaminho))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaminhoActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);

        String data = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        try {

            File f = fc.getCurrentDirectory();
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            path = path + "_" + data + ".slq";
            tfCaminho.setText(path);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btCaminhoActionPerformed

    public void lerArquivo() {

        try {

            config.load(new FileInputStream(arquivo));

            servidor = config.getProperty("servidor");
            nomeDoBanco = config.getProperty("nomeDoBanco");
            usuario = config.getProperty("usuario");
            senha = config.getProperty("senha");

        } catch (Exception e) {
        }

    }
    
    
    private void btBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackupActionPerformed
       
        lerArquivo();
        Process p = null;
        try {

            Runtime runtime = Runtime.getRuntime();
            System.out.println(usuario + senha);
            p = runtime.exec("C:/Program Files/MySQL/MySQL Server 5.7/bin/mysqldump.exe -u" + usuario + " -p" + senha + " --add-drop-database -B " + nomeDoBanco + " -r" + path);
            int progressComplete = p.waitFor();
            if (progressComplete == 0) {
                JOptionPane.showMessageDialog(null, "Backup realizado com sucesso!");
                jlMensagem.setText("Backup realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao gerar Backup, contate o suporte!");
                jlMensagem.setText("Erro ao gerar Backup, contate o suporte !");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btBackupActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBackup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBackup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackup;
    private javax.swing.JButton btCaminho;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlMensagem;
    private javax.swing.JTextField tfCaminho;
    // End of variables declaration//GEN-END:variables
}
