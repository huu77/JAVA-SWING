/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import AES.AES;
import DTO.LOGIN_DTO;
import MODEL.LOGIN_MODEL;
import javax.swing.JOptionPane;

/**
 *
 * @author HUU77
 */
public class LOGIN extends javax.swing.JFrame {

    protected final String secret = "Thanhuu204768@gmail.com";
    AES aes = new AES();
    LOGIN_DTO lgDTO = new LOGIN_DTO();

    public LOGIN() {
        initComponents();
        setLocationRelativeTo(null);

        jlbERRMK.setVisible(false);
        jlbCHECK.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxDN = new javax.swing.JTextField();
        jbtLOGIN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtxtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jlbERRMK = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlbCHECK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/tải xuống.png"))); // NOI18N
        jLabel1.setText(" ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tên đăng nhập");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mật khẩu");

        jtxDN.setPreferredSize(new java.awt.Dimension(187, 35));
        jtxDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxDNActionPerformed(evt);
            }
        });
        jtxDN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxDNKeyPressed(evt);
            }
        });

        jbtLOGIN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtLOGIN.setText("ĐĂNG NHẬP");
        jbtLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLOGINActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtxtPass.setMinimumSize(new java.awt.Dimension(64, 35));
        jtxtPass.setPreferredSize(new java.awt.Dimension(187, 22));
        jtxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPassActionPerformed(evt);
            }
        });
        jtxtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtPassKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUẢN LÝ BÃI GIỮ XE HỌC VIỆN CƠ SỞ");

        jlbERRMK.setBackground(new java.awt.Color(255, 0, 0));
        jlbERRMK.setForeground(new java.awt.Color(255, 0, 0));
        jlbERRMK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbERRMK.setText("* có lẽ bạn chưa điền tên đăng nhập hoặc mật khẩu");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlbCHECK.setBackground(new java.awt.Color(255, 0, 0));
        jlbCHECK.setForeground(new java.awt.Color(255, 0, 0));
        jlbCHECK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCHECK.setText("* có lẽ bạn chưa nhập sai tên đăng nhập hoặc mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbCHECK, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtLOGIN)
                                    .addGap(29, 29, 29)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxDN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jlbERRMK, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxDN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLOGIN)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jlbERRMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbCHECK)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLOGINActionPerformed
        String user = jtxDN.getText();
        String pass = new String(jtxtPass.getPassword());
        String PassMH = aes.encrypt(pass, this.secret);

        if (jtxDN.getText().equals("")  ) {
            if(jtxtPass.getPassword().equals("")){
                jlbERRMK.setVisible(true);
            }
            jlbERRMK.setVisible(true);
            
        }
        else if(jtxtPass.getPassword().equals("")){
            if(jtxDN.getText().equals("")){
                jlbERRMK.setVisible(true);
            }
             jlbERRMK.setVisible(true);
        }
        else if((jtxDN.getText().equals("")==false) || jtxtPass.getPassword().equals("")){
            jlbERRMK.setVisible(true);
        }
        else if (  jtxDN.getText().equals("")==false ) {
            if(jtxtPass.getPassword().equals("")){
                   jlbERRMK.setVisible(false);
                 JOptionPane.showMessageDialog(this, "đăng nhập that bai! ");
            }else{
                JOptionPane.showMessageDialog(this, "đăng nhập thành công! ");
            }
            for (int i = 0; i <= lgDTO.getLoginUp(user, PassMH).size(); i++) {
                LOGIN_MODEL lgM = lgDTO.getLoginUp(user, PassMH).get(i);
//                if(lgM.getTenDangNhap().equalsIgnoreCase(user)==false || lgM.getMatKhau().equalsIgnoreCase(PassMH)==false){
//                    jlbCHECK.setVisible(true);
//                       JOptionPane.showMessageDialog(this, "đăng nhập thất bại! ");
//                }
//                else if(lgM.getTenDangNhap().equalsIgnoreCase(user)==false || lgM.getMatKhau().equalsIgnoreCase(PassMH) ){
//                    jlbCHECK.setVisible(true);
//                       JOptionPane.showMessageDialog(this, "đăng nhập thất bại! ");
//                }
//                else if(lgM.getTenDangNhap().equalsIgnoreCase(user)  || lgM.getMatKhau().equalsIgnoreCase(PassMH)==false){
//                    jlbCHECK.setVisible(true);
//                       JOptionPane.showMessageDialog(this, "đăng nhập thất bại! ");
//                }
//                else{
//                       JOptionPane.showMessageDialog(this, "đăng nhập thành công! ");
//                       viewMain m = new viewMain();
//            this.setVisible(false);
//            m.setVisible(true);
//                }

//                if (!lgM.getTenDangNhap().equalsIgnoreCase(user) || !lgM.getMatKhau().equalsIgnoreCase(PassMH)) {
//                    jlbCHECK.setVisible(true);
//                    JOptionPane.showMessageDialog(this, "đăng nhập thất bại! ");
//                } else {
//                    JOptionPane.showMessageDialog(this, "đăng nhập thành công! ");
//                    viewMain m = new viewMain();
//                    this.setVisible(false);
//                    m.setVisible(true);
//                }
            }

        }
//
//        if (user.equals("abcc") && pass.equals("1234")) {
//            viewMain m = new viewMain();
//            this.setVisible(false);
//            m.setVisible(true);
//        }

    }//GEN-LAST:event_jbtLOGINActionPerformed

    private void jtxDNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxDNKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jtxtPass.requestFocus();
        }
    }//GEN-LAST:event_jtxDNKeyPressed

    private void jtxtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPassKeyPressed

    }//GEN-LAST:event_jtxtPassKeyPressed

    private void jtxDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxDNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxDNActionPerformed

    private void jtxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jlbERRMK.setVisible(false);
        jtxDN.setText("");
        jtxDN.requestFocus();
        jtxtPass.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtLOGIN;
    private javax.swing.JLabel jlbCHECK;
    private javax.swing.JLabel jlbERRMK;
    private javax.swing.JTextField jtxDN;
    private javax.swing.JPasswordField jtxtPass;
    // End of variables declaration//GEN-END:variables
}
