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
public final class fUpdateMhs extends javax.swing.JFrame {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    /**
     * Creates new form Praktik1
     */
    public fUpdateMhs() {
        initComponents();
        setKosongkan();
        
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
        jTxtKdAsisten.setText(null);
        jTxtNim.setText(null);
        jTxtNama.setText(null);
        jTxtAlamat.setText(null);
        jTxtEmail.setText(null);
        jTxtTelp.setText(null);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnUpdateMakul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPpesan = new javax.swing.JTextPane();
        jbtnCariMakul = new javax.swing.JButton();
        jBtnHapusMakul = new javax.swing.JButton();
        jBtnBatal = new javax.swing.JButton();
        jTxtTelp = new javax.swing.JTextField();
        jTxtNim = new javax.swing.JTextField();
        jTxtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtAlamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jTxtKdAsisten = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnUpdateMakul.setText("Update");
        jBtnUpdateMakul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnUpdateMakulMouseClicked(evt);
            }
        });
        jBtnUpdateMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateMakulActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTPpesan);

        jbtnCariMakul.setText("Cari");
        jbtnCariMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCariMakulActionPerformed(evt);
            }
        });

        jBtnHapusMakul.setText("Hapus");
        jBtnHapusMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnHapusMakulActionPerformed(evt);
            }
        });

        jBtnBatal.setText("Batal");
        jBtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBatalActionPerformed(evt);
            }
        });

        jLabel4.setText("Alamat");

        jLabel5.setText("Email");

        jLabel1.setText("Kode Asisten");

        jLabel6.setText("Telephone");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnUpdateMakul)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnHapusMakul)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnBatal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtTelp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNim, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtKdAsisten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jTxtNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCariMakul)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnCariMakul)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTxtKdAsisten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUpdateMakul)
                    .addComponent(jBtnHapusMakul)
                    .addComponent(jBtnBatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnUpdateMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateMakulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnUpdateMakulActionPerformed

    private void jBtnUpdateMakulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnUpdateMakulMouseClicked
        // TODO add your handling code here:
        String sql="UPDATE tbl_asisten "+
                   "SET kode_asisten='"+jTxtKdAsisten.getText()+ "', " +
                   "nim='"+jTxtNim.getText()+ "', " +
                   "nama='"+jTxtNama.getText()+ "', " +
                   "alamat='"+jTxtAlamat.getText()+ "', " +
                   "email='"+jTxtEmail.getText()+ "', " +
                   "telp='"+jTxtTelp.getText()+ "' " +
                   " WHERE kode_asisten='"+jTxtKdAsisten.getText()+"';";
                     
        try {
            st = conn.createStatement();
            st.execute(sql); //menjalankan query
        }catch (SQLException e){
            System.err.println("SQLException");
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(this,"Data  gagal diupdate");
            setKosongkan();
            jTxtKdAsisten.requestFocus();
            return;
        } 
            
            
        JOptionPane.showMessageDialog(this,"Data berhasil diupdate");
        setKosongkan();
        jTxtKdAsisten.requestFocus();
                    
    }//GEN-LAST:event_jBtnUpdateMakulMouseClicked

    private void jbtnCariMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCariMakulActionPerformed
        // TODO add your handling code here:
        String sql="SELECT * FROM tbl_Asisten WHERE kode_asisten='"+jTxtKdAsisten.getText()+"'";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex){
            System.out.printf("Kesalahan Query" + sql);
        }
        
        int size = 0;
        try{
            while (rs.next()){
                size++;
                jTxtNim.setText(rs.getString("nim").toString());
                jTxtNama.setText(rs.getString("nama").toString());
                jTxtAlamat.setText(rs.getString("alamat").toString());
                jTxtEmail.setText(rs.getString("email").toString());
                jTxtTelp.setText(rs.getString("telp").toString());
            }
            if(size==0){
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
                return;
            }
            rs.close();
            st.close();
        } catch(SQLException ex){
        
        }
    }//GEN-LAST:event_jbtnCariMakulActionPerformed

    private void jBtnHapusMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnHapusMakulActionPerformed
        // TODO add your handling code here:
        String sql="DELETE FROM tbl_asisten WHERE kode_asisten='"+jTxtKdAsisten.getText()+"'";
        try {
            st = conn.createStatement();
            st.execute(sql); //menjalankan query
            
        } catch (SQLException e){ //jika gagal menghapus
            JOptionPane.showMessageDialog(this, "Penghapusan Gagal");
            setKosongkan();
            jTxtKdAsisten.requestFocus();
            return;
        }
        
        JOptionPane.showMessageDialog(this,"Data berhasil dihapus");
        setKosongkan();
        jTxtKdAsisten.requestFocus();
    }//GEN-LAST:event_jBtnHapusMakulActionPerformed

    private void jBtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBatalActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(fUpdateMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fUpdateMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fUpdateMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fUpdateMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new fUpdateMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBatal;
    private javax.swing.JButton jBtnHapusMakul;
    private javax.swing.JButton jBtnUpdateMakul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTPpesan;
    private javax.swing.JTextField jTxtAlamat;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtKdAsisten;
    private javax.swing.JTextField jTxtNama;
    private javax.swing.JTextField jTxtNim;
    private javax.swing.JTextField jTxtTelp;
    private javax.swing.JButton jbtnCariMakul;
    // End of variables declaration//GEN-END:variables
}
