
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajar.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author najwan R
 */
public class belajarcrudrud extends javax.swing.JFrame {
    
private static Connection mysqlconfig;
    
public belajarcrudrud()
{
    initComponents();
    load_table();
    kosong();
}
    public static Connection configDB() throws SQLException
    {
        try {
            String url="jdbc:mysql://localhost:3306/Mahasiswa";
            String user="root"; //user database
            String pass="";
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlconfig=DriverManager.getConnection(url,user,pass);
            
            
        } catch (Exception e) {
            System.err.println("Koneksi gagal" + e.getMessage());
        }
        return mysqlconfig;
    }
    

    /*
     Creates new form belajarcrudrud
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbx1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        txttelp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 27, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel2.setText("DATA MAHASISWA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setText("Nama :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel4.setText("NIM      :\n");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 260, -1));
        getContentPane().add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 260, -1));

        jLabel5.setText("Jurusan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        cmbx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekayasa Perangkat Lunak", "Teknik Bisnis Sepeda Motor", "Teknik Elektronika industri", "Akuntansi", "Teknik Energi Terbarukan", "Teknik Komputer Dan Jaringan", " " }));
        getContentPane().add(cmbx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, -1));

        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel7.setText("No Telp");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 260, -1));
        getContentPane().add(txttelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 260, -1));

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jButton4.setText("Clear");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "title 4", "title 5", "title 6"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 490, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris =jTable1.rowAtPoint(evt.getPoint());
        String nama = jTable1.getValueAt(baris,1).toString();
        txtnama.setText(nama);
        String nim = jTable1.getValueAt(baris,2).toString();
        txtnim.setText(nim);
        String jr = jTable1.getValueAt(baris,3).toString();
        cmbx1.setSelectedItem(jr);
        String alamat = jTable1.getValueAt(baris,4).toString();
        txtnama.setText(alamat);
        String no_telepon = jTable1.getValueAt(baris,5).toString();
        txtnama.setText(no_telepon);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="delete from table_mhs where nim='"+txtnim.getText()+"'";
            java.sql.Connection conn=(Connection)belajarcrudrud.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"data berhasil di hapus");
        } 
        
        catch (Exception e) {
        }
        load_table();
        kosong();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE table_mhs SET nama = '" + txtnama.getText() + "', nim = '" +
            txtnim.getText() + "', jurusan = '" +
            cmbx1.getSelectedItem() + "', alamat = '" +
            txtalamat.getText() + "', no_telepon = '" +
            txttelp.getText() + "' WHERE nim = '" +
            txtnim.getText() + "'";

            java.sql.Connection conn=(Connection)belajarcrudrud.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"data berhasil di edit");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"perubahan data gagal"+e.getMessage());

        }
        load_table();
        kosong();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {

            String sql = "INSERT INTO table_mhs (nama, nim, jurusan, alamat, no_telepon) VALUES ('"+txtnama.getText()+"','"+
            txtnim.getText()+"','"+
            cmbx1.getSelectedItem()+"','"+
            txtalamat.getText()+"','"+
            txttelp.getText()+"')";
            //mahasiswa diganti Data_mahasiswa
            java.sql.Connection conn= (Connection)belajarcrudrud.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement (sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        }
        catch (Exception e)
        {

            JOptionPane.showMessageDialog(this, e.getMessage());

        }

        load_table();
        kosong();
    }//GEN-LAST:event_jButton1ActionPerformed

private void kosong()
{
 txtnama.setText(null);
 txtnim.setText(null);
 txtalamat.setText(null);
 txttelp.setText(null);
 cmbx1.setSelectedItem(this);
}

    
private void load_table()
{
//    DefaultTableModel model = new DefaultTableColumnModel();
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("No");
    model.addColumn("Nama");
    model.addColumn("Nim");
    model.addColumn("Jurusan");
    model.addColumn("Alamat");
    model.addColumn("Phone");
    
    try //menampilkan data database kedalam tabel
    {
        
        int no=1;
        String sql = "select * from table_mhs";
        java.sql.Connection conn=(Connection)belajarcrudrud.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next())
        {
            model.addRow(new Object[]{no++,res.getString(1),res.getString(2),
                                        res.getString(3),res.getString(4),
                                        res.getString(5)});
                                       
        }
        jTable1.setModel(model);   
       
    } 
    
    catch (Exception e) {
         
    }

    
}
    


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
            java.util.logging.Logger.getLogger(belajarcrudrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(belajarcrudrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(belajarcrudrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(belajarcrudrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new belajarcrudrud().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbx1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txttelp;
    // End of variables declaration//GEN-END:variables
}
