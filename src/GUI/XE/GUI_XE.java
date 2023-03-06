/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.XE;

import DTO.GUIXE_DTO;
import MODEL.DANG_KI_HINH_THUC_XE;
import MODEL.THE1_MODEL;
import MODEL.XE_MODEL;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUU77
 */
public class GUI_XE extends javax.swing.JPanel {

    GUIXE_DTO gx = new GUIXE_DTO();

    public GUI_XE() {
        initComponents();
        showDSXe();
        showLoaiXeCBB();
        showHTGCBB();
        jlbERR1.setVisible(false);
        jtxtBSX.setEnabled(false);
        jtxtMATHE.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtBSX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtTENXE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtMAUXE = new javax.swing.JTextField();
        jCBBHTG = new javax.swing.JComboBox<>();
        jCBBLOAIXE = new javax.swing.JComboBox<>();
        jlbERR1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtxtMATHE = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jtxtCheckMatThe = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbXE = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(1279, 559));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("THÔNG TIN XE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("BIỂN SỐ XE");

        jtxtBSX.setText(" ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("HÌNH THƯC GỬI");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("LOẠI XE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("TÊN XE");

        jtxtTENXE.setText(" ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("MÀU XE");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("MÃ  THẺ");

        jtxtMAUXE.setText(" ");

        jlbERR1.setBackground(new java.awt.Color(255, 0, 51));
        jlbERR1.setForeground(new java.awt.Color(255, 0, 51));
        jlbERR1.setText(" * Mục không được để trống");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ĐẶT LẠI");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jtxtMATHE.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbERR1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jtxtBSX)
                            .addComponent(jCBBLOAIXE, 0, 183, Short.MAX_VALUE))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtTENXE, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBBHTG, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtMATHE, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(194, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtMAUXE, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(57, 57, 57))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(1128, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlbERR1)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtBSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtTENXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jtxtMAUXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jtxtMATHE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jCBBHTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCBBLOAIXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 59, Short.MAX_VALUE))))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("CHỨC NĂNG");

        jButton2.setText("ĐĂNG KÍ ");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("CẬP NHẬT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("GIA HẠN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("HỦY GIA HẠN");

        jButton6.setText("VÀO BẾN ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("XUẤT BẾN");

        jButton8.setText("DS MẤT THẺ");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jtxtCheckMatThe.setText(" MẤT THẺ");
        jtxtCheckMatThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCheckMatTheMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(68, 68, 68)
                .addComponent(jButton2)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addGap(41, 41, 41)
                .addComponent(jButton5)
                .addGap(38, 38, 38)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(79, 79, 79)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jtxtCheckMatThe)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jtxtCheckMatThe))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("DANH SÁCH XE");

        jtbXE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BIỂN SỐ", "TÊN XE", "MÀU XE", " LOẠI XE"
            }
        ));
        jtbXE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbXEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbXE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
// table click lấy item 
    private void jtbXEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbXEMouseClicked
        int vitri = jtbXE.getSelectedRow();
        hideVitri(vitri);
    }//GEN-LAST:event_jtbXEMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jtxtBSX.setText("");
        jtxtTENXE.setText("");
        jtxtMAUXE.setText("");
        jCBBLOAIXE.setSelectedIndex(0);
        jCBBHTG.setSelectedIndex(0);
        showDSXe();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        DANGKIXE dkx = new DANGKIXE();
        dkx.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked

        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);

        /* Tạo mới Vector chứa Column Header */
        Vector column = new Vector();
        column.add("BIỂN SỐ XE");
        column.add("TÊN XE");
        column.add("MÀU XE");
        column.add("LOẠI XE");
        /* Set Column Header lên DefaultTableModel */
        model.setColumnIdentifiers(column);

        List<XE_MODEL> listDSXE = gx.getALLXE();
        List<THE1_MODEL> listthe = gx.getTHENULL();
        for (int i = 0; i < listDSXE.size(); i++) {
            XE_MODEL xe = (XE_MODEL) listDSXE.get(i);
            for (int j = 0; j < listthe.size(); j++) {
                THE1_MODEL the1 = (THE1_MODEL) listthe.get(j);
                if (xe.getBienSoXe().equals(the1.getBienSoXe())) {
                    Vector row = new Vector();
                    row.add(xe.getBienSoXe());
                    row.add(xe.getTenXe());
                    row.add(xe.getMauXe());
                    row.add(xe.getLoaiXe());

                    model.addRow(row);
                }

            }

        }
        jtbXE.setModel(model);

        // 

    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String a = jtxtTENXE.getText();
        String b = jtxtMAUXE.getText();
        String c = jtxtBSX.getText();
        GUIXE_DTO.update(a, b, c);
        JOptionPane.showMessageDialog(this, "Cập nhật thành công! ");
        showDSXe();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String bienSO = jtxtBSX.getText();
        String idHinhthuc = (String) jCBBHTG.getSelectedItem() == "THÁNG" ? "2" : "1";
        System.out.println(jCBBHTG.getSelectedItem());
        System.out.println(bienSO);
        System.out.println(idHinhthuc);
        String list = GUIXE_DTO.checkGiahan(bienSO, Integer.parseInt(idHinhthuc));
        System.out.println(list);
        if (list == "CGH"  ) {

            JOptionPane.showMessageDialog(this, "BẠN CÓ THỂ GIA HẠN! ");
        } else {
            JOptionPane.showMessageDialog(this, "BẠN KO ĐỦ ĐIỀU KIỆN ĐỂ GIA HẠN! ");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtxtCheckMatTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCheckMatTheMouseClicked
        String a = jtxtMATHE.getText();

        if (GUIXE_DTO.checkMatThe(a).size() == 0) {
            JOptionPane.showMessageDialog(this, "thẻ đã bi mất! ");
        } else {
            JOptionPane.showMessageDialog(this, "thẻ của bạn vẫn đang hoạt động! ");
        }
    }//GEN-LAST:event_jtxtCheckMatTheMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String bienSo = jtxtBSX.getText();
        List<XE_MODEL> listDSXE = gx.getALLXE();
        for (int i = 0; i < listDSXE.size(); i++) {
            XE_MODEL xe = (XE_MODEL) listDSXE.get(i);
            if (xe.getBienSoXe().equalsIgnoreCase(bienSo)) {

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    private void hideVitri(int i) {

        List<DANG_KI_HINH_THUC_XE> list1 = GUIXE_DTO.getDKXE();

        List<XE_MODEL> list = GUIXE_DTO.getALLXE();
        XE_MODEL xe = list.get(i);
        jtxtBSX.setText(xe.getBienSoXe());
        jtxtTENXE.setText(xe.getTenXe());
        jtxtMAUXE.setText(xe.getMauXe());
        jCBBLOAIXE.setSelectedItem(xe.getLoaiXe());
        for (DANG_KI_HINH_THUC_XE x : list1) {
            if (xe.getBienSoXe().equals(x.getBienSoXe())) {
                jCBBHTG.setSelectedItem(x.getTenHinhThucGui());
                jtxtMATHE.setText(x.getIdthe());
            }
        }
    }

    //show ds xe
    public void showDSXe() {
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);

        /* Tạo mới Vector chứa Column Header */
        Vector column = new Vector();
        column.add("BIỂN SỐ XE");
        column.add("TÊN XE");
        column.add("MÀU XE");
        column.add("LOẠI XE");
        /* Set Column Header lên DefaultTableModel */
        model.setColumnIdentifiers(column);

        List<XE_MODEL> listDSXE = gx.getALLXE();
        for (int i = 0; i < listDSXE.size(); i++) {
            XE_MODEL xe = (XE_MODEL) listDSXE.get(i);
            Vector row = new Vector();
            row.add(xe.getBienSoXe());
            row.add(xe.getTenXe());
            row.add(xe.getMauXe());
            row.add(xe.getLoaiXe());

            model.addRow(row);

        }
        jtbXE.setModel(model);
    }

    //
    public void showLoaiXeCBB() {
        List<String> list = gx.getLoaiXeCBB();
        for (String d : list) {
            jCBBLOAIXE.addItem(d);
        }
    }

    //
    public void showHTGCBB() {
        List<String> list = gx.getHinhThucGUiCBB();
        for (String d : list) {
            jCBBHTG.addItem(d);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jCBBHTG;
    private javax.swing.JComboBox<String> jCBBLOAIXE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbERR1;
    private javax.swing.JTable jtbXE;
    private javax.swing.JTextField jtxtBSX;
    private javax.swing.JButton jtxtCheckMatThe;
    private javax.swing.JTextField jtxtMATHE;
    private javax.swing.JTextField jtxtMAUXE;
    private javax.swing.JTextField jtxtTENXE;
    // End of variables declaration//GEN-END:variables
}
