/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.dao.nguoihocDAO;
import com.edusys.entity.NguoiHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XDate;
import com.edusys.utils.XImage;
import com.edusys.utils.utilityHelper;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO-PC
 */
public class bao_ve extends javax.swing.JDialog {

    /**
     * Creates new form quanly
     */
    public bao_ve(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        intit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg1 = new javax.swing.ButtonGroup();
        btg2 = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblnguoihoc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtmanhoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtngaysinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtghichu = new javax.swing.JTextArea();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnfrist = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtdienthoai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        rdo1 = new javax.swing.JRadioButton();
        rdo0 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rdocaodang = new javax.swing.JRadioButton();
        rdodaihoc = new javax.swing.JRadioButton();
        rdokhac = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÝ NGƯỜI HỌC");

        tabs.setForeground(new java.awt.Color(153, 0, 0));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        txttimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttimkiemMouseClicked(evt);
            }
        });
        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });
        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimkiemKeyPressed(evt);
            }
        });
        jPanel3.add(txttimkiem);

        tblnguoihoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblnguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NH", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL", "MA NV", "NGÀY ĐK", "Học vấn"
            }
        ));
        tblnguoihoc.setRowHeight(22);
        tblnguoihoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblnguoihoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnguoihocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblnguoihoc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", jPanel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ và tên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");

        txtngaysinh.setText("dd/mm/yyyy");
        txtngaysinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtngaysinhMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtngaysinhMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Điện thoại");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ghi chú");

        txtghichu.setColumns(20);
        txtghichu.setRows(5);
        jScrollPane2.setViewportView(txtghichu);

        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/Hinh/Add.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/Hinh/Delete.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/Hinh/Edit.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/Hinh/Text.png"))); // NOI18N
        btnmoi.setText("Mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });

        btnlast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/Hinh/Button-Last-icon.png"))); // NOI18N
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/Hinh/Button-Fast-Forward-icon.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnprev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/Hinh/Button-Rewind-icon.png"))); // NOI18N
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnfrist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/Hinh/Button-First-icon.png"))); // NOI18N
        btnfrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfristActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ngày sinh(dd/mm/yyyy)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã nhân viên");

        btg1.add(rdo1);
        rdo1.setText("Nam");

        btg1.add(rdo0);
        rdo0.setText("Nữ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Trình độ học vấn:");

        btg2.add(rdocaodang);
        rdocaodang.setText("Cao đẳng");

        btg2.add(rdodaihoc);
        rdodaihoc.setText("Đại học");

        btg2.add(rdokhac);
        rdokhac.setText("Khác");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Mã người học:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnfrist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlast)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtmanv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdienthoai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmanhoc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthoten, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                        .addComponent(txtngaysinh))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(243, 243, 243)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rdo1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdo0))
                                            .addComponent(jLabel9)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rdocaodang)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdodaihoc)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdokhac)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmanhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo1)
                    .addComponent(rdo0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdocaodang)
                    .addComponent(rdodaihoc)
                    .addComponent(rdokhac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnfrist, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnthem)
                        .addComponent(btnxoa)
                        .addComponent(btnsua)
                        .addComponent(btnmoi))
                    .addComponent(btnprev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnnext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnlast, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        tabs.addTab("CẬP NHẬT", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 642, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void tblnguoihocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnguoihocMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblnguoihoc.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblnguoihocMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        this.detele();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void txttimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttimkiemMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_txttimkiemMouseClicked

    private void txttimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyPressed
        // TODO add your handling code here:
        this.timkiem();
    }//GEN-LAST:event_txttimkiemKeyPressed

    private void btnfristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfristActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnfristActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnlastActionPerformed

    private void txtngaysinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtngaysinhMouseClicked
        // TODO add your handling code here:
        if (txtngaysinh.getText().equals("dd/mm/yyyy")) {
            txtngaysinh.setText("");
        }
    }//GEN-LAST:event_txtngaysinhMouseClicked

    private void txtngaysinhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtngaysinhMouseExited
        // TODO add your handling code here:
        if (txtngaysinh.getText().equals("")) {
            txtngaysinh.setText("dd/mm/yyyy");
        }
    }//GEN-LAST:event_txtngaysinhMouseExited

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
            java.util.logging.Logger.getLogger(bao_ve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bao_ve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bao_ve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bao_ve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                bao_ve dialog = new bao_ve(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btg1;
    private javax.swing.ButtonGroup btg2;
    private javax.swing.JButton btnfrist;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdo0;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdocaodang;
    private javax.swing.JRadioButton rdodaihoc;
    private javax.swing.JRadioButton rdokhac;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblnguoihoc;
    private javax.swing.JTextField txtdienthoai;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextArea txtghichu;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmanhoc;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
    int row = -1;
    nguoihocDAO dao = new nguoihocDAO();

    private void intit() {
        this.setLocationRelativeTo(null);
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblnguoihoc.getModel();
        model.setRowCount(0);
        try {
            String keyword = txttimkiem.getText();
            List<NguoiHoc> list = dao.selectByKeyword(keyword);
            for (NguoiHoc nh : list) {
                Object[] row = {nh.getMaNH(), nh.getHoTen(), nh.isGioiTinh() ? "Nam" : "Nữ", nh.getNgaySinh(), nh.getDienThoai(),
                    nh.getEmail(), nh.getMaNV(),
                    nh.getNgayDK(),nh.getHocVan()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }

    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblnguoihoc.getRowCount() - 1);
        txtmanhoc.setEditable(!edit);
        btnthem.setEnabled(!edit);
        btnsua.setEnabled(edit);
        btnxoa.setEnabled(edit);
        btnfrist.setEnabled(edit && !first);
        btnprev.setEnabled(edit && !first);
        btnnext.setEnabled(edit && !last);
        btnlast.setEnabled(edit && !last);
    }

    void setForm(NguoiHoc model) {
        txtmanhoc.setText(model.getMaNH());
        txthoten.setText(model.getHoTen());
        rdo1.setSelected(model.isGioiTinh());
        rdo0.setSelected(!model.isGioiTinh());
        if(model.getHocVan().equalsIgnoreCase("Cao đẳng")){
            rdocaodang.setSelected(true);
        }else if(model.getHocVan().equalsIgnoreCase("Đại học")){
            rdodaihoc.setSelected(true);
        }else
            rdokhac.setSelected(true);       
        txtngaysinh.setText(model.getNgaySinh());
        txtdienthoai.setText(model.getDienThoai());
        txtemail.setText(model.getEmail());
        txtghichu.setText(model.getGhiChu());
        txtmanv.setText(model.getMaNV());
    }

    NguoiHoc getForm() {
        NguoiHoc model = new NguoiHoc();
        Date date = new Date();
        model.setMaNH(txtmanhoc.getText());
        model.setHoTen(txthoten.getText());
        model.setGioiTinh(rdo1.isSelected());
        model.setNgaySinh(txtngaysinh.getText());
        model.setDienThoai(txtdienthoai.getText());
        model.setEmail(txtemail.getText());
        model.setGhiChu(txtghichu.getText());
        model.setNgayDK(date.toString());
        model.setMaNV(txtmanv.getText());
        if(rdocaodang.isSelected()){
            model.setHocVan("Cao đẳng");
        }else if(rdodaihoc.isSelected()){
            model.setHocVan("Đại học");
        }else{
            model.setHocVan("Khác");
        }
            
        return model;
    }

    void clearForm() {
        NguoiHoc nh = new NguoiHoc();
        this.setForm(nh);
        this.row = -1;
        this.updateStatus();
    }

    void insert() {
        if (utilityHelper.checkMaNH(txtmanhoc)) {
            if (utilityHelper.checkName(txthoten)) {
                if (utilityHelper.checkSDT(txtdienthoai)) {
                    if (utilityHelper.checkMaNV(txtmanv)) {
                        if (utilityHelper.checkDate(txtngaysinh)) {
                            if (utilityHelper.checkEmail(txtemail)) {
                                if (utilityHelper.checkMoTaCD(txtghichu)) {
                                    try {
                                        NguoiHoc model = getForm();
                                        dao.insert(model);
                                        this.fillTable();
                                        this.clearForm();
                                        MsgBox.alert(this, "Thêm mới thành công!");
                                    } catch (Exception e) {
                                        MsgBox.alert(this, "Thêm mới thất bại!");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void edit() {
        String manh = (String) tblnguoihoc.getValueAt(this.row, 0);
        NguoiHoc nh = dao.selectByID(manh);
        this.setForm(nh);
        tabs.setSelectedIndex(1);
        this.updateStatus();
    }

    void update() {
        if (utilityHelper.checkMaNH(txtmanhoc)) {
            if (utilityHelper.checkName(txthoten)) {
                if (utilityHelper.checkSDT(txtdienthoai)) {
                    if (utilityHelper.checkMaNV(txtmanv)) {
                        if (utilityHelper.checkDate(txtngaysinh)) {
                            if (utilityHelper.checkEmail(txtemail)) {
                                if (utilityHelper.checkMoTaCD(txtghichu)) {
                                    if (txtmanhoc != null && txthoten != null && txtdienthoai != null
                                            && txtemail != null && txtngaysinh != null && txtghichu != null) {
                                        try {
                                            NguoiHoc nh = getForm();
                                            dao.update(nh);
                                            this.fillTable();
                                            MsgBox.alert(this, "Cập nhật thành công!");
                                        } catch (Exception e) {
                                            MsgBox.alert(this, "Cập nhật thất bại!");
                                        }
                                    } else {
                                        MsgBox.alert(this, "Bạn cần điền đầy đủ thông tin");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void detele() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa chuyên đề!");
        } else if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
            String manh = txtmanhoc.getText();
            try {
                dao.delete(manh);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }

    void timkiem() {
        this.fillTable();
        this.clearForm();
        this.row = -1;
        this.updateStatus();
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblnguoihoc.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblnguoihoc.getRowCount() - 1;
        this.edit();
    }

}