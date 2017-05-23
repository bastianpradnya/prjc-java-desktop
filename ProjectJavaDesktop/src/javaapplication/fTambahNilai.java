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
public final class fTambahNilai extends javax.swing.JFrame {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    /**
     * Creates new form Praktik1
     */
    public fTambahNilai() {
        initComponents();
        setKosongkan();
        tampilNim();
        tampilKelas();
        tampilAsisten();
        tampilNidn();
        
        koneksi("localhost","sin_praktikum","root","");
    }
    
    void koneksi(String server, String db, String user, String passwd){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            //System.out.print("Driver tidak bisa di load\n");
            jTPpesan.setText("Driver tidak bisa di load");
            e.printStackTrace();
            return;
        }
            //System.out.print("Driver berhasil di load\n");
            jTPpesan.setText("Driver berhasil di load");
            conn=null;
            try {
                conn=DriverManager.getConnection("jdbc:mysql://"+server+":3306/"+db,user,passwd);    
            } catch (SQLException s){
                //System.out.print("Tidak Berhasil koneksi\n");
                jTPpesan.setText("Tidak Berhasil koneksi");
                s.printStackTrace();
                return;
            }
            //System.out.print("Driver di Load dan Koneksi berhasil\n");
            jTPpesan.setText("Driver di Load dan Koneksi berhasil");
    }
    
    void setKosongkan(){
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
        jTxtNresponsi.setText(null);
    }
    
    void tampilNim() {
        try {
            koneksi("localhost","sin_praktikum","root","");
            String sql = "select nim from tbl_mahasiswa";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql); //menjalankan query
            while(rs.next()){
                jCbNim.addItem(rs.getString("nim"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            rs.close(); st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    void tampilKelas() {
        try {
            koneksi("localhost","sin_praktikum","root","");
            String sql = "select kode_kelas from tbl_kelas";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql); //menjalankan query
            while(rs.next()){
                jCbKdKelas.addItem(rs.getString("kode_kelas"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            rs.close(); st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void tampilAsisten() {
        try {
            koneksi("localhost","sin_praktikum","root","");
            String sql = "select kode_asisten from tbl_asisten";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql); //menjalankan query
            while(rs.next()){
                jCbKdAsisten.addItem(rs.getString("kode_asisten"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            rs.close(); st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    void tampilNidn() {
        try {
            koneksi("localhost","sin_praktikum","root","");
            String sql = "select nidn from tbl_dosen";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql); //menjalankan query
            while(rs.next()){
                jCbNidn.addItem(rs.getString("nidn"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            rs.close(); st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NIDN6 = new javax.swing.JLabel();
        jTxtNlap7 = new javax.swing.JTextField();
        NIDN7 = new javax.swing.JLabel();
        jTxtNlap8 = new javax.swing.JTextField();
        NIDN8 = new javax.swing.JLabel();
        jTxtNlap9 = new javax.swing.JTextField();
        NIDN9 = new javax.swing.JLabel();
        jTxtNlap10 = new javax.swing.JTextField();
        NIDN10 = new javax.swing.JLabel();
        jTxtNlap1 = new javax.swing.JTextField();
        NIDN1 = new javax.swing.JLabel();
        jTxtNlap2 = new javax.swing.JTextField();
        NIDN2 = new javax.swing.JLabel();
        jTxtNlap3 = new javax.swing.JTextField();
        NIDN3 = new javax.swing.JLabel();
        jTxtNlap4 = new javax.swing.JTextField();
        NIDN4 = new javax.swing.JLabel();
        jTxtNlap5 = new javax.swing.JTextField();
        NIDN5 = new javax.swing.JLabel();
        jTxtNlap6 = new javax.swing.JTextField();
        NIDN11 = new javax.swing.JLabel();
        jTxtNlap13 = new javax.swing.JTextField();
        jTxtNlap12 = new javax.swing.JTextField();
        NIDN12 = new javax.swing.JLabel();
        jTxtNlap14 = new javax.swing.JTextField();
        NIDN13 = new javax.swing.JLabel();
        jTxtNresponsi = new javax.swing.JTextField();
        NIDN15 = new javax.swing.JLabel();
        NIDN14 = new javax.swing.JLabel();
        jTxtNlap11 = new javax.swing.JTextField();
        NIDN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPpesan = new javax.swing.JTextPane();
        jBtnSimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCbKdKelas = new javax.swing.JComboBox<>();
        jCbKdAsisten = new javax.swing.JComboBox<>();
        jCbNidn = new javax.swing.JComboBox<>();
        jCbNim = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTxtIdNilai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        NIDN6.setText("Laporan 6");

        NIDN7.setText("Laporan 7");

        NIDN8.setText("Laporan 8");

        NIDN9.setText("Laporan 9");

        NIDN10.setText("Laporan 10");

        jTxtNlap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap1ActionPerformed(evt);
            }
        });

        NIDN1.setText("Laporan 1");

        NIDN2.setText("Laporan 2");

        NIDN3.setText("Laporan 3");

        NIDN4.setText("Laporan 4");

        NIDN5.setText("Laporan 5");

        jTxtNlap6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap6ActionPerformed(evt);
            }
        });

        NIDN11.setText("Laporan 12");

        jTxtNlap12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNlap12ActionPerformed(evt);
            }
        });

        NIDN12.setText("Laporan13");

        NIDN13.setText("Laporan14");

        NIDN15.setText("Laporan11");

        NIDN14.setText("Nilai Responsi");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NIDN5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NIDN4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NIDN3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NIDN1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NIDN2, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtNlap4)
                    .addComponent(jTxtNlap5)
                    .addComponent(jTxtNlap2)
                    .addComponent(jTxtNlap3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTxtNlap1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(NIDN6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTxtNlap6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NIDN10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtNlap10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(NIDN7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtNlap7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(NIDN9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtNlap9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NIDN8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtNlap8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NIDN15)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtNlap11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NIDN11)
                                .addGap(15, 15, 15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NIDN12)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtNlap13, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jTxtNlap12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NIDN14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNresponsi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NIDN13)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtNlap14)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNlap11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NIDN15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNlap12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NIDN11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtNlap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIDN1)
                                    .addComponent(NIDN6)
                                    .addComponent(jTxtNlap6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtNlap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIDN2)
                                    .addComponent(NIDN7)
                                    .addComponent(jTxtNlap7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtNlap8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIDN8)
                                    .addComponent(jTxtNlap3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIDN3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NIDN12)
                                .addComponent(jTxtNlap13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtNlap9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIDN9)
                                    .addComponent(NIDN13)
                                    .addComponent(jTxtNlap14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtNlap10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIDN10)
                                    .addComponent(NIDN14)
                                    .addComponent(jTxtNresponsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtNlap4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIDN4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtNlap5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NIDN5))))))
                .addGap(37, 37, 37))
        );

        NIDN.setText("NIDN");

        jLabel2.setText("NIM");

        jLabel4.setText("Kode Kelas");

        jLabel5.setText("Kode Asisten");

        jScrollPane1.setViewportView(jTPpesan);

        jBtnSimpan.setText("Simpan");
        jBtnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnSimpanMouseClicked(evt);
            }
        });
        jBtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSimpanActionPerformed(evt);
            }
        });

        jLabel1.setText("INPUT NILAI");

        jCbKdKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Kode Kelas-" }));

        jCbKdAsisten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Kode Asisten-" }));

        jCbNidn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih NIDN-" }));

        jCbNim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih NIM-" }));

        jLabel3.setText("ID Nilai");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jBtnSimpan))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NIDN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCbKdAsisten, 0, 166, Short.MAX_VALUE)
                            .addComponent(jCbNidn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCbNim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCbKdKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtIdNilai)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtIdNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbKdKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jCbKdAsisten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbNidn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NIDN))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnSimpan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSimpanActionPerformed

    private void jBtnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnSimpanMouseClicked
        // TODO add your handling code here:
        String sql="INSERT into tbl_nilai (id_nilai, nim, kode_kelas, kode_asisten, nidn," +
                   " nilai_laporan1,  nilai_laporan2,  nilai_laporan3,  nilai_laporan4," +
                   " nilai_laporan5,  nilai_laporan6,  nilai_laporan7,  nilai_laporan8," +
                   " nilai_laporan9,  nilai_laporan10,  nilai_laporan11,  nilai_laporan12," +
                   " nilai_laporan13,  nilai_laporan14,  nilai_responsi)VALUE('" +
                    jTxtIdNilai.getText()+"','"+
                    jCbNim.getSelectedItem().toString()+"','"+
                    jCbKdKelas.getSelectedItem().toString()+"','"+
                    jCbKdAsisten.getSelectedItem().toString()+"','"+
                    jCbNidn.getSelectedItem().toString()+"', "+
                    jTxtNlap1.getText()+","+
                    jTxtNlap2.getText()+","+
                    jTxtNlap3.getText()+","+
                    jTxtNlap4.getText()+","+
                    jTxtNlap5.getText()+","+
                    jTxtNlap6.getText()+","+
                    jTxtNlap7.getText()+","+
                    jTxtNlap8.getText()+","+
                    jTxtNlap9.getText()+","+
                    jTxtNlap10.getText()+","+
                    jTxtNlap11.getText()+","+
                    jTxtNlap12.getText()+","+
                    jTxtNlap13.getText()+","+
                    jTxtNlap14.getText()+","+
                    jTxtNresponsi.getText()+");";
                     
        try {
            st = conn.createStatement();
            st.execute(sql); //menjalankan query
        } catch (SQLException e){
            setKosongkan();
            jTxtIdNilai.requestFocus();
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Data berhasil disimpan");
        setKosongkan();
        jTxtIdNilai.requestFocus();
      
    }//GEN-LAST:event_jBtnSimpanMouseClicked

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
            java.util.logging.Logger.getLogger(fTambahNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fTambahNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fTambahNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fTambahNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fTambahNilai().setVisible(true);
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
    private javax.swing.JLabel NIDN14;
    private javax.swing.JLabel NIDN15;
    private javax.swing.JLabel NIDN2;
    private javax.swing.JLabel NIDN3;
    private javax.swing.JLabel NIDN4;
    private javax.swing.JLabel NIDN5;
    private javax.swing.JLabel NIDN6;
    private javax.swing.JLabel NIDN7;
    private javax.swing.JLabel NIDN8;
    private javax.swing.JLabel NIDN9;
    private javax.swing.JButton jBtnSimpan;
    private javax.swing.JComboBox<String> jCbKdAsisten;
    private javax.swing.JComboBox<String> jCbKdKelas;
    private javax.swing.JComboBox<String> jCbNidn;
    private javax.swing.JComboBox<String> jCbNim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTPpesan;
    private javax.swing.JTextField jTxtIdNilai;
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
    private javax.swing.JTextField jTxtNresponsi;
    // End of variables declaration//GEN-END:variables
}
