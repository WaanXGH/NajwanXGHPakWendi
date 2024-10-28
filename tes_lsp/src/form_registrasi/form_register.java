/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package form_registrasi;

import com.mysql.jdbc.Driver;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author najwan R
 */
public class form_register extends javax.swing.JPanel {
    
    
    public static Connection mysqlconfig;

    /**
     * Creates new form form_register
     */
    public form_register() {
        initComponents();
    }

     
     
     public static Connection bukakoneksi() {
         try {
             Class.forName("com.mysql.jdbc.Driver");
             //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_lsp","root","");
             
              Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_lsp","root","");
              
              return conn;
              
         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
             
             return null;
         }
    }
     
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
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_register().setVisible(true);
            }
        });
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_password = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("REGISTRASI USER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel2.setText("Name : \n");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        add(tf_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, 40));

        jLabel3.setText("Username :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        add(tf_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 40));

        jLabel4.setText("Password :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 40));

        btn_register.setBackground(java.awt.Color.cyan);
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_register.setForeground(new java.awt.Color(0, 0, 0));
        btn_register.setText("Registrasi");
        add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 360, 40));

        btn_close.setBackground(new java.awt.Color(255, 0, 51));
        btn_close.setForeground(new java.awt.Color(0, 0, 0));
        btn_close.setText("Close\n");
        add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 360, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
