/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi_toko;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.HashSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author najwan R
 */
public class Aplikasi_master_barang extends javax.swing.JFrame {
    koneksi kon = new koneksi();
    private Object [][] databarang=null;
    private String[] label={"Kode Barang","Nama Barang","Harga Jual","Stok"};
    /**
     * Creates new form Aplikasi_master_barang
     */
    public Aplikasi_master_barang() {
        initComponents();
        kon.SetKoneksi();
        BacaTabelBarang();
    }
    
    private void BacaTabelBarang(){
        tampil();
    
    }
    
    // membuat btn listener
    
    
    
    private void tampil(){
        //membuat model tabel dengan kolom yang sesuai
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Barang");
        tbl.addColumn("Nama Barang");
        tbl.addColumn("harga Barang");
        tbl.addColumn("Stok");     
        
            //mengatitkan model dengan Jtable
    tbl_brg.setModel(tbl);
    
    ResultSet rs = null;
    Statement st = null;
    
    try{
    //membuat statement untuk mengeksekusi query
    st = kon.conn.createStatement();
    
    // querry untuk mengambil semua data dari tabel tbl_brg dan mengurutkannya berdasarkan ID_barang
    String query = "SELECT * FROM barang ORDER BY Kd_brg";
    rs = st.executeQuery(query);
    
    // menambahkan setiap baris data yang diambil kedalam model tabel
    while (rs.next()){
        tbl.addRow(new Object[]{
        rs.getString("Kd_brg"), //mengambil id barang
        rs.getString("Nm_brg"), //mengambil nama barang
        rs.getString("Hrg_jual"), //mengambil id barang
        rs.getString("Stok"), //mengambil id barang
    });
    }
    
    tbl_brg.setModel(tbl);
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
    

    
    
private void BacaTabelProdukCari() {
    DefaultTableModel tbl = new DefaultTableModel();
    tbl.addColumn("Kode Barang");
    tbl.addColumn("Nama Barang");
    tbl.addColumn("Harga Barang");
    tbl.addColumn("Stok");

    tbl_brg.setModel(tbl);
    
    ResultSet rs = null;
    Statement st = null;

    try {
        // Mengambil text dari input pencarian dan membentuk query
        String sql = "SELECT * FROM barang WHERE Nm_brg LIKE '%" + txt_cari.getText() + "%'";
        st = kon.conn.createStatement();
        rs = st.executeQuery(sql);

        // Memasukkan data hasil pencarian ke dalam tabel
        while (rs.next()) {
            tbl.addRow(new Object[]{
                rs.getString("Kd_brg"),
                rs.getString("Nm_brg"),
                rs.getString("Hrg_jual"),
                rs.getString("Stok")
            });
        }
        
        tbl_brg.setModel(tbl);
    } catch (SQLException e) {
        // Menangani kesalahan SQL dan menampilkan pesan kesalahan
        JOptionPane.showMessageDialog(null, "Gagal menampilkan data hasil pencarian: " + e.getMessage());
    } finally {
        // Menutup ResultSet dan Statement
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menutup resource: " + e.getMessage());
        }
    }
}

private void setTabel(){

    int row = tbl_brg.getSelectedRow();
    txt_brg.setText((String)tbl_brg.getValueAt(row, 0));
    txt_nama.setText((String)tbl_brg.getValueAt(row, 1));
    txt_jual.setText((String)tbl_brg.getValueAt(row, 2));
    txt_stok.setText((String)tbl_brg.getValueAt(row, 3));
    
}

private void Bersih(){

    txt_brg.setText("");
    txt_nama.setText("");
    txt_jual.setText("");
    txt_stok.setText("");
    
}

private void aktif(){

txt_brg.setEnabled(true);
txt_nama.setEnabled(true);
txt_jual.setEnabled(true);
txt_stok.setEnabled(true);

}

private void nonaktif(){
    
txt_brg.setEnabled(false);
txt_nama.setEnabled(false);
txt_jual.setEnabled(false);
txt_stok.setEnabled(false);
}


private void simpanData()

{
    
    try {
        String sql = "insert into barang (Kd_brg,Nm_brg,Hrg_jual,Stok) values ('"+txt_brg.getText()+"',"
                +"'"+txt_nama.getText()+"','"+txt_jual.getText()+"',"
                +"'"+txt_stok.getText()+"')";
                  kon.st.executeUpdate(sql);
                  JOptionPane.showMessageDialog(null, "data berhasil Disimpan");
                  Bersih();
                  BacaTabelBarang();
                
    } 
    catch (Exception e) {
        JOptionPane.showMessageDialog(null,e);
    }
}

private void Updatedata(){
    try {
tbl_brg.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tbl_brgMouseClicked(evt);
    }
});
        
    String sql = "UPDATE barang SET Nm_brg='" + txt_nama.getText() + "',"
               + "Hrg_jual=" + txt_jual.getText() + ","
               + "Stok=" + txt_stok.getText() + " "
               + "WHERE Kd_brg='" + txt_brg.getText() + "'";
    kon.st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
    Bersih();
    BacaTabelBarang();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

private void hapusData(){

    try {
        String sql ="delete from barang where kd_barang='"+txt_brg.getText()+"'";
        kon.st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        Bersih();
        BacaTabelBarang();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
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
        txt_brg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_brg = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_jual = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        txt_cari = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("TABEL DATA BARANG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setText("Cari nama barang");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 64, -1, -1));

        txt_brg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_brgActionPerformed(evt);
            }
        });
        txt_brg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_brgKeyPressed(evt);
            }
        });
        getContentPane().add(txt_brg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 223, -1));

        tbl_brg.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_brg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_brgMouseClicked(evt);
            }
        });
        tbl_brg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_brgKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_brg);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 103, 430, 157));

        jLabel3.setText("INPUT DATA BARANG ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel4.setText("Kode barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel5.setText("Nama Barang");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel6.setText("Harga Jual");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel7.setText("Stok");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        txt_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_namaKeyPressed(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 224, -1));

        txt_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jualActionPerformed(evt);
            }
        });
        txt_jual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_jualKeyPressed(evt);
            }
        });
        getContentPane().add(txt_jual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 224, -1));
        getContentPane().add(txt_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 224, -1));

        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cariKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 59, 275, -1));

        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_brgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_brgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_brgActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        nonaktif();
        BacaTabelBarang();
    }//GEN-LAST:event_formWindowActivated

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
    if (btn_tambah.getText().equals("TAMBAH")){
        btn_tambah.setText("SIMPAN");
        btn_keluar.setText("BATAL");
        Bersih();
        aktif();
        txt_brg.requestFocus();
    }
    else if (btn_tambah.getText().equals("SIMPAN")) {
        simpanData();
        BacaTabelBarang();
        btn_tambah.setText("TAMBAH");
        btn_keluar.setText("KELUAR");
        Bersih();
        nonaktif();
    }
    else if (btn_tambah.getText().equals("UPDATE")) {
        // Update the selected data
        Updatedata();
        BacaTabelBarang();
        btn_tambah.setText("TAMBAH");
        btn_keluar.setText("KELUAR");
        Bersih();
        nonaktif();
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
                if(btn_keluar.getText().equals("KELUAR")){
            dispose();

            //form menu Utama tampilin
        }
        else if (btn_keluar.getText().equals("BATAL"))
        {
            Bersih();
            nonaktif();
            btn_keluar.setText("KELUAR");
            btn_tambah.setText("TAMBAH");
            
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void txt_namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        txt_jual.requestFocus();
        }
    }//GEN-LAST:event_txt_namaKeyPressed

    private void txt_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jualActionPerformed

    private void txt_jualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jualKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
        txt_stok.requestFocus();
        }
    }//GEN-LAST:event_txt_jualKeyPressed

    private void tbl_brgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_brgMouseClicked
        // TODO add your handling code here:
            setTabel();
    
    // Change button text to "UPDATE"
    btn_tambah.setText("UPDATE");
    
    // Enable the form fields for editing
    aktif();
    }//GEN-LAST:event_tbl_brgMouseClicked

    private void tbl_brgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_brgKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            hapusData();
            
        }
    }//GEN-LAST:event_tbl_brgKeyPressed

    private void txt_cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyTyped
        // TODO add your handling code here:
        kon.SetKoneksi();
        BacaTabelProdukCari();
    }//GEN-LAST:event_txt_cariKeyTyped

    private void txt_brgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_brgKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            try {
                String sql = "Select * From barang where Kd_brg"+ txt_brg.getText() +"'";
                kon.rs = kon.st.executeQuery(sql);
                if (kon.rs.next()) {
                txt_brg.setEnabled(false);
                txt_brg.setText(kon.rs.getString("Kd_brg"));
                txt_nama.setText(kon.rs.getString("Nm_brg"));
                txt_jual.setText(kon.rs.getString("Hrg_jual"));
                txt_stok.setText(kon.rs.getString("Stok"));
                btn_tambah.setText("UPDATE");
                } else{
                    txt_nama.requestFocus();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e );
            }   
        }
    }//GEN-LAST:event_txt_brgKeyPressed

    
    
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
            java.util.logging.Logger.getLogger(Aplikasi_master_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_master_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_master_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_master_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasi_master_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_brg;
    private javax.swing.JTextField txt_brg;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_jual;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
