/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form_registrasi;


import javax.swing.*;

import java.sql.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author najwan R
 */
public class form_barang extends javax.swing.JFrame {
    
    Connection conn = koneksi.Bukakoneksi();
    public Statement st;
    
    public ResultSet rs;

    /**
     * Creates new form form_barang
     */
    public form_barang() {
        initComponents();
        autonumber();
        tampil();
        setLocationRelativeTo(this);
    }
    
    public void autonumber(){
    
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            //SQL untuk mendapatkan nilai maksimum dari kolom id_barang di tabel tbl_barang
            String sql = "SELECT max(id_barang)FROM tbl_barang";
            pst = conn.prepareStatement(sql);
            
            // eksekusi querry dan simpan hasilnya dalam Resultset
            rs = pst.executeQuery();
            
            if(rs.next()){
                //jika hasil querry ditemukan
                int a = rs.getInt(1); // mendapatkan nilai maksimum id_barnag
                if(a == 0) {
                //jika tidak ada data dalam tabel
                TF_idbarang.setText("0001");
                
                }else{
                        TF_idbarang.setText(String.format("%04d",a+1));
            }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal menggenerate ID barang " + e.getMessage());
  
        } finally {
            //menutup resources untuk menghindari kebocoran memory
            try {
                if (rs != null)rs.close();
                if (pst != null) pst.close();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal Menutup Resource " + e.getMessage());
            }
        }
    
    }
    
    private void bersih(){
    TF_nama.setText(null);
    cmb_kategori.setSelectedIndex(0);
    TF_qty.setText(null);
    TF_nama.requestFocus();
    autonumber();
    }
    
    private void tampil(){
        //membuat model tabel dengan kolom yang sesuai
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Barang");
        tbl.addColumn("Nama Barang");
        tbl.addColumn("kategori Barang");
        tbl.addColumn("jumlah Barang");     
        
            //mengatitkan model dengan Jtable
    tbl_barang.setModel(tbl);
    
    ResultSet rs = null;
    Statement st = null;
    
    try{
    //membuat statement untuk mengeksekusi query
    st = conn.createStatement();
    
    // querry untuk mengambil semua data dari tabel tbl_barang dan mengurutkannya berdasarkan ID_barang
    String query = "SELECT * FROM tbl_barang ORDER BY id_barang";
    rs = st.executeQuery(query);
    
    // menambahkan setiap baris data yang diambil kedalam model tabel
    while (rs.next()){
        tbl.addRow(new Object[]{
        rs.getString("id_barang"), //mengambil id barang
        rs.getString("nama_barang"), //mengambil nama barang
        rs.getString("kategori"), //mengambil id barang
        rs.getString("qty"), //mengambil id barang
    });
    }
    
    tbl_barang.setModel(tbl);
    } catch (SQLException e) {
        //menangani kesalahan SQL dan Menampilakan pesan kesalahan
        JOptionPane.showMessageDialog(null, "Gagal Menampilakan data :" +e.getMessage());
    } finally {
        //menutup Resultset dan statement untuk mencegah kebocoran  resource data
        try {
            if(rs != null) rs.close();
            if(st != null) st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal menutup resource" + e.getMessage());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_kategori = new javax.swing.JComboBox<>();
        TF_idbarang = new java.awt.TextField();
        TF_nama = new java.awt.TextField();
        TF_qty = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Barang\n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setText("Kategori\n");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setText("QTY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 3, 18)); // NOI18N
        jLabel5.setText("FORM PEMBELIAN BARANG ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        cmb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori Barang", "Elektronik", "Meubeler", "ATK" }));
        getContentPane().add(cmb_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 370, -1));
        getContentPane().add(TF_idbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 370, -1));
        getContentPane().add(TF_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 370, -1));

        TF_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_qtyActionPerformed(evt);
            }
        });
        getContentPane().add(TF_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 200, -1));

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_barang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 550, 200));

        jButton1.setText("Save\n");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        jButton2.setText("Update\n");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        jButton3.setText("Delete");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        jButton4.setText("refresh");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jButton5.setText("close");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_qtyActionPerformed

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
            java.util.logging.Logger.getLogger(form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField TF_idbarang;
    private java.awt.TextField TF_nama;
    private java.awt.TextField TF_qty;
    private javax.swing.JComboBox<String> cmb_kategori;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_barang;
    // End of variables declaration//GEN-END:variables
}
