/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form_registrasi;
import java.sql.*;
import javax.swing.*;



/**
 *
 * @author najwan R
 */
public class form_lsp extends javax.swing.JFrame {
    
    //membuka koneksi ke database melalui metode bukakoneksi() dari kelas koneksi
     Connection conn = koneksi.Bukakoneksi();
     
     //mendeklarasikan variabel st sebagai objek statement yang akan digunakan untuk mengeksekusi pernyataan sql
     public Statement st;
     
     //mendeklarasikan variabel rs sebagai objek statement yang akan digunakan untuk mengeksekusi pernyataan sql
     public ResultSet rs;
     
    /**
     * Creates new form form_lsp
     */
    public form_lsp() {
        initComponents();
        
        //menentukan posisi form di tengah layar relatif terhadap form itu sendiri
        setLocationRelativeTo(this);
    }
    
    

         public static Connection bukakoneksi() {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_lsp","root","");
             
             Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_lsp","root","");
              
              return conn;
              
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
             return null;
         }
    }
     public void bersih(){
         tf_name.setText("");
         tf_password.setText("");
         tf_user.setText("");
         
     }
         
         public  void daftar() {
             try {
                 st = conn.createStatement();
                 
                 if(tf_name.getText().equals("")||
                         tf_user.getText().equals("")||
                         tf_password.getText().equals("")){
                     
                     //menampilkan pesan perimgatan jika data kosong
                     JOptionPane.showMessageDialog(null, "data tidak boleh kosong","validasi data",JOptionPane.INFORMATION_MESSAGE);
                     return;
                 }
                        else{
                             //cek apakah username sudah terdaftar di database
                             String cek = "SELECT * FROM tbl_user WHERE username = '" + tf_user.getText()+"'";
                             rs = st.executeQuery(cek);
                             
                             //jika username ada, tampilkan pesan peringatan
                             if(rs.next()){
                                 JOptionPane.showMessageDialog(null,"username sudah terdaftar","validasi data",JOptionPane.INFORMATION_MESSAGE);
                                 
                             }
                             else{
                                String sql = "INSERT INTO tbl_user (name,username,password) VALUES(?,?,?)";
                                PreparedStatement pstmt = conn.prepareStatement(sql);
                                
                                 
                                 
                                 //menggunakan preparesStatement untuk menghindari SQL injection
                                 pstmt.setString(1, tf_name.getText());
                                 pstmt.setString(2, tf_user.getText());
                                 pstmt.setString(3, tf_password.getText());
                                 
                                 
                                 pstmt.executeUpdate();
                                 
                                 //menampilkan pesan bahwa data berhasil disimpan
                                 JOptionPane.showMessageDialog(null, "data berhasil disimpan");
                                 
                                 //membersihkan field input setelah data disimpan
                                 bersih();
                                 
                                 //membuka form login
                                 new form_lsp().show();
                                 
                                 //menutup form ini
                                 this.dispose();
                             }
                             }
                 
                     
             } catch (Exception e) {
                 //tangkap exception dan tampilkan pesan error
                 JOptionPane.showMessageDialog(null,"Terjadi kesalahan" + e.getMessage());
             }finally{
                 try {
                     //tutup Resultset dan statement setelah selesai digunakan
                     if (rs != null)rs.close();
                     if (st != null)st.close();
                 } 
                 catch (SQLException e) {
                     JOptionPane.showMessageDialog(null,"error pada saat menutup resources" + e.getMessage());
                 }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_register = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        tf_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("REGISTRASI USER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel2.setText("Name : \n");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 40));

        jLabel3.setText("Username :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        getContentPane().add(tf_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 40));

        jLabel4.setText("Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btn_register.setBackground(java.awt.Color.cyan);
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_register.setForeground(new java.awt.Color(0, 0, 0));
        btn_register.setText("Registrasi");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 360, 40));

        btn_close.setBackground(new java.awt.Color(255, 0, 51));
        btn_close.setForeground(new java.awt.Color(0, 0, 0));
        btn_close.setText("Close\n");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 360, 40));

        tf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        daftar(); //memanggil variable public daftar
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void tf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwordActionPerformed
        // TODO add your handling code here:
        btn_register.doClick();
    }//GEN-LAST:event_tf_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(form_lsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_lsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_lsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_lsp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_lsp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tf_name;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables

}
