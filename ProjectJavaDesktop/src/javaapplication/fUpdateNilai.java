/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.sql.*;
import java.io.*;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane.*;
/**
 *
 * @author student
 */
public final class fUpdateNilai extends javax.swing.JFrame {
    Koneksi kon = new Koneksi();
    /**
     * Creates new form Praktik1
     */
    public fUpdateNilai() {
        initComponents();
        setKosongkan();

    }

    
    void setKosongkan(){
        jTxtIdNilai.setText(null);
        jTxtNim.setText(null);
        jTxtKdKelas.setText(null);
        jTxtKdAsisten.setText(null);
        jTxtNidn.setText(null); 
        jTxtNlap1.setText(null);
        jTxtNlap2.setText(null);
        jTxtNlap3.setText(null);
        jTxtNlap4.setText(null);
        jTxtNlap5.setText(null);
        jTxtNlap6.setText(null);
        jTxtNlap7.setText(null);
        jTxtNlap8.setText(null);
        jTxtNlap9.setText(null);
        jTxtNlap10.setText(null);
        jTxtNlap11.setText(null);
        jTxtNlap12.setText(null);
        jTxtNlap13.setText(null);
        jTxtNlap14.setText(null);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTxtIdNilai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NIDN = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTxtNlap8 = new javax.swing.JTextField();
        NIDN8 = new javax.swing.JLabel();
        jTxtNlap9 = new javax.swing.JTextField();
        NIDN9 = new javax.swing.JLabel();
        jTxtNlap10 = new javax.swing.JTextField();
        NIDN10 = new javax.swing.JLabel();
        NIDN11 = new javax.swing.JLabel();
        jTxtNlap13 = new javax.swing.JTextField();
        jTxtNlap12 = new javax.swing.JTextField();
        NIDN12 = new javax.swing.JLabel();
        jTxtNlap14 = new javax.swing.JTextField();
        NIDN13 = new javax.swing.JLabel();
        NIDN15 = new javax.swing.JLabel();
        jTxtNlap11 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        NIDN1 = new javax.swing.JLabel();
        jTxtNlap1 = new javax.swing.JTextField();
        NIDN2 = new javax.swing.JLabel();
        jTxtNlap2 = new javax.swing.JTextField();
        jTxtNlap3 = new javax.swing.JTextField();
        NIDN3 = new javax.swing.JLabel();
        NIDN4 = new javax.swing.JLabel();
        jTxtNlap4 = new javax.swing.JTextField();
        NIDN5 = new javax.swing.JLabel();
        jTxtNlap5 = new javax.swing.JTextField();
        NIDN6 = new javax.swing.JLabel();
        jTxtNlap6 = new javax.swing.JTextField();
        NIDN7 = new javax.swing.JLabel();
        jTxtNlap7 = new javax.swing.JTextField();
        jBtnUpdate = new javax.swing.JButton();
        jBtnBatal = new javax.swing.JButton();
        jTxtNim = new javax.swing.JTextField();
        jTxtKdKelas = new javax.swing.JTextField();
        jTxtKdAsisten = new javax.swing.JTextField();
        jTxtNidn = new javax.swing.JTextField();
        jBtnCari = new javax.swing.JButton();
        jBtnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT NILAI");

        jLabel3.setText("ID Nilai");

        jLabel2.setText("NIM");

        jLabel4.setText("Kode Kelas");

        jLabel5.setText("Kode Asisten");

        NIDN.setText("NIDN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        NIDN8.setText("Laporan 8");

        NIDN9.setText("Laporan 9");

        NIDN10.setText("Laporan10");

        NIDN11.setText("Laporan12");

        jTxtNlap12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap12ActionPerformed(evt);
            }
        });

        NIDN12.setText("Laporan13");

        NIDN13.setText("Laporan14");

        NIDN15.setText("Laporan11");

        jTxtNlap11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NIDN10)
                                .addComponent(NIDN15))
                            .addComponent(NIDN11))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNlap11, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jTxtNlap12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIDN8)
                            .addComponent(NIDN9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtNlap9, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jTxtNlap10)
                            .addComponent(jTxtNlap8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIDN13)
                            .addComponent(NIDN12))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtNlap14, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(jTxtNlap13))))
                .addGap(13, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN8)
                    .addComponent(jTxtNlap8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN9)
                    .addComponent(jTxtNlap9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN10)
                    .addComponent(jTxtNlap10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN15)
                    .addComponent(jTxtNlap11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN11)
                    .addComponent(jTxtNlap12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN12)
                    .addComponent(jTxtNlap13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN13)
                    .addComponent(jTxtNlap14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        NIDN1.setText("Laporan 1");

        jTxtNlap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap1ActionPerformed(evt);
            }
        });

        NIDN2.setText("Laporan 2");

        jTxtNlap3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap3ActionPerformed(evt);
            }
        });

        NIDN3.setText("Laporan 3");

        NIDN4.setText("Laporan 4");

        NIDN5.setText("Laporan 5");

        jTxtNlap5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap5ActionPerformed(evt);
            }
        });

        NIDN6.setText("Laporan 6");

        jTxtNlap6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap6ActionPerformed(evt);
            }
        });

        NIDN7.setText("Laporan 7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NIDN7)
                    .addComponent(NIDN6)
                    .addComponent(NIDN5)
                    .addComponent(NIDN4)
                    .addComponent(NIDN2)
                    .addComponent(NIDN1)
                    .addComponent(NIDN3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtNlap7, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jTxtNlap6)
                    .addComponent(jTxtNlap5)
                    .addComponent(jTxtNlap4)
                    .addComponent(jTxtNlap3)
                    .addComponent(jTxtNlap2)
                    .addComponent(jTxtNlap1))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN1)
                    .addComponent(jTxtNlap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN2)
                    .addComponent(jTxtNlap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNlap3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NIDN3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN4)
                    .addComponent(jTxtNlap4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN5)
                    .addComponent(jTxtNlap5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN6)
                    .addComponent(jTxtNlap6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN7)
                    .addComponent(jTxtNlap7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jBtnUpdate.setText("Update");
        jBtnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnUpdateMouseClicked(evt);
            }
        });
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jBtnBatal.setText("Batal");
        jBtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBatalActionPerformed(evt);
            }
        });

        jBtnCari.setText("Cari");
        jBtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCariActionPerformed(evt);
            }
        });

        jBtnHapus.setText("Hapus");
        jBtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jBtnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnHapus)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBatal))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NIDN)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtIdNilai, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jTxtNim)
                            .addComponent(jTxtKdKelas)
                            .addComponent(jTxtKdAsisten)
                            .addComponent(jTxtNidn))
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCari)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(78, 78, 78))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIdNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jBtnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtKdKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtKdAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDN)
                    .addComponent(jTxtNidn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnBatal)
                    .addComponent(jBtnUpdate)
                    .addComponent(jBtnHapus))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnUpdateMouseClicked
        // TODO add your handling code here:
         String sql="UPDATE tbl_nilai " +
                    "SET nilai_laporan1="+jTxtNlap1.getText()+", "+
                    "nilai_laporan2="+jTxtNlap2.getText()+", "+
                    "nilai_laporan3="+jTxtNlap3.getText()+", "+
                    "nilai_laporan4="+jTxtNlap4.getText()+", "+
                    "nilai_laporan5="+jTxtNlap5.getText()+", "+
                    "nilai_laporan6="+jTxtNlap6.getText()+", "+
                    "nilai_laporan7="+jTxtNlap7.getText()+", "+
                    "nilai_laporan8="+jTxtNlap8.getText()+", "+
                    "nilai_laporan9="+jTxtNlap9.getText()+", "+
                    "nilai_laporan10="+jTxtNlap10.getText()+", "+
                    "nilai_laporan11="+jTxtNlap11.getText()+", "+
                    "nilai_laporan12="+jTxtNlap12.getText()+", "+
                    "nilai_laporan13="+jTxtNlap13.getText()+", "+
                    "nilai_laporan14="+jTxtNlap14.getText()+" "+
                    "WHERE id_nilai="+jTxtIdNilai.getText()+";";
                     
        try {
            kon.konek();
            kon.st = kon.conn.createStatement();
            kon.st.execute(sql); //menjalankan query
        } catch (SQLException e){
            setKosongkan();
            e.printStackTrace();
            jTxtIdNilai.requestFocus();
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Data berhasil diupdate");
        setKosongkan();
        jTxtIdNilai.requestFocus();
      
    }//GEN-LAST:event_jBtnUpdateMouseClicked

    private void jTxtNlap6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNlap6ActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNlap6ActionPerformed

    private void jTxtNlap11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNlap11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNlap11ActionPerformed

    private void jTxtNlap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNlap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNlap1ActionPerformed

    private void jTxtNlap12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNlap12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNlap12ActionPerformed

    private void jBtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBatalActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnBatalActionPerformed

    private void jTxtNlap3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNlap3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNlap3ActionPerformed

    private void jTxtNlap5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNlap5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNlap5ActionPerformed

    private void jBtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCariActionPerformed
        // TODO add your handling code here:
        String sql="SELECT * FROM tbl_nilai WHERE id_nilai='"+jTxtIdNilai.getText()+"'";
        try {
            kon.konek();
            kon.st = kon.conn.createStatement();
            kon.rs = kon.st.executeQuery(sql);
            
        } catch (SQLException ex){
            System.out.printf("Kesalahan Query" + sql);
        }
        
        int size = 0;
        try{
            while (kon.rs.next()){
                size++;
                jTxtNim.setText(kon.rs.getString("nim").toString());
                jTxtNim.setEditable(false);
                jTxtKdKelas.setText(kon.rs.getString("kode_kelas").toString());
                jTxtKdKelas.setEditable(false);
                jTxtKdAsisten.setText(kon.rs.getString("kode_asisten").toString());
                jTxtKdAsisten.setEditable(false);
                jTxtNidn.setText(kon.rs.getString("nidn").toString());
                jTxtNidn.setEditable(false);
                jTxtNlap1.setText(kon.rs.getString("nilai_laporan1").toString());
                jTxtNlap2.setText(kon.rs.getString("nilai_laporan2").toString());
                jTxtNlap3.setText(kon.rs.getString("nilai_laporan3").toString());
                jTxtNlap4.setText(kon.rs.getString("nilai_laporan4").toString());
                jTxtNlap5.setText(kon.rs.getString("nilai_laporan5").toString());
                jTxtNlap6.setText(kon.rs.getString("nilai_laporan6").toString());
                jTxtNlap7.setText(kon.rs.getString("nilai_laporan7").toString());
                jTxtNlap8.setText(kon.rs.getString("nilai_laporan8").toString());
                jTxtNlap9.setText(kon.rs.getString("nilai_laporan9").toString());
                jTxtNlap10.setText(kon.rs.getString("nilai_laporan10").toString());
                jTxtNlap11.setText(kon.rs.getString("nilai_laporan11").toString());
                jTxtNlap12.setText(kon.rs.getString("nilai_laporan12").toString());
                jTxtNlap13.setText(kon.rs.getString("nilai_laporan13").toString());
                jTxtNlap14.setText(kon.rs.getString("nilai_laporan14").toString());
            }
            if(size==0){
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
                return;
            }
            kon.rs.close();
            kon.st.close();
        } catch(SQLException ex){
        
        }
        
    }//GEN-LAST:event_jBtnCariActionPerformed

    private void jBtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHapusActionPerformed
        // TODO add your handling code here:
        String sql="DELETE FROM tbl_nilai WHERE id_nilai='"+jTxtIdNilai.getText()+"'";
        try {
            kon.st = kon.conn.createStatement();
            kon.st.execute(sql); //menjalankan query
            
        } catch (SQLException e){ //jika gagal menghapus
            JOptionPane.showMessageDialog(this, "Penghapusan Gagal");
            setKosongkan();
            jTxtIdNilai.requestFocus();
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Data berhasil dihapus");
        setKosongkan();
        jTxtIdNilai.requestFocus();
    }//GEN-LAST:event_jBtnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(fUpdateNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fUpdateNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fUpdateNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fUpdateNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fUpdateNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIDN;
    private javax.swing.JLabel NIDN1;
    private javax.swing.JLabel NIDN10;
    private javax.swing.JLabel NIDN11;
    private javax.swing.JLabel NIDN12;
    private javax.swing.JLabel NIDN13;
    private javax.swing.JLabel NIDN15;
    private javax.swing.JLabel NIDN2;
    private javax.swing.JLabel NIDN3;
    private javax.swing.JLabel NIDN4;
    private javax.swing.JLabel NIDN5;
    private javax.swing.JLabel NIDN6;
    private javax.swing.JLabel NIDN7;
    private javax.swing.JLabel NIDN8;
    private javax.swing.JLabel NIDN9;
    private javax.swing.JButton jBtnBatal;
    private javax.swing.JButton jBtnCari;
    private javax.swing.JButton jBtnHapus;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtIdNilai;
    private javax.swing.JTextField jTxtKdAsisten;
    private javax.swing.JTextField jTxtKdKelas;
    private javax.swing.JTextField jTxtNidn;
    private javax.swing.JTextField jTxtNim;
    private javax.swing.JTextField jTxtNlap1;
    private javax.swing.JTextField jTxtNlap10;
    private javax.swing.JTextField jTxtNlap11;
    private javax.swing.JTextField jTxtNlap12;
    private javax.swing.JTextField jTxtNlap13;
    private javax.swing.JTextField jTxtNlap14;
    private javax.swing.JTextField jTxtNlap2;
    private javax.swing.JTextField jTxtNlap3;
    private javax.swing.JTextField jTxtNlap4;
    private javax.swing.JTextField jTxtNlap5;
    private javax.swing.JTextField jTxtNlap6;
    private javax.swing.JTextField jTxtNlap7;
    private javax.swing.JTextField jTxtNlap8;
    private javax.swing.JTextField jTxtNlap9;
    // End of variables declaration//GEN-END:variables
}
