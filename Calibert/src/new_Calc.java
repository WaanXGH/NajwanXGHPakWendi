
import java.awt.DisplayMode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author najwan R
 */
public class new_Calc extends javax.swing.JFrame {

    String angka = "";
double jumlah,bil1,bil2;
int pilih;

    public new_Calc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        buttonbagi = new javax.swing.JButton();
        buttonkurang = new javax.swing.JButton();
        buttontambah = new javax.swing.JButton();
        buttonreset = new javax.swing.JButton();
        buttonkali = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        buttonhasil = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 80, 80));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 80, 81));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 80, 82));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.setActionCommand("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 80, 78));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 80, 78));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 80, 80));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, 78));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 80, 80));

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 80, 80));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 170, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setText("KALKULATOR SEDERHANA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        getContentPane().add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 350, 120));

        buttonbagi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonbagi.setText("/");
        buttonbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbagiActionPerformed(evt);
            }
        });
        getContentPane().add(buttonbagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 80, 80));

        buttonkurang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonkurang.setText("-");
        buttonkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkurangActionPerformed(evt);
            }
        });
        getContentPane().add(buttonkurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 80, 80));

        buttontambah.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttontambah.setText("+");
        buttontambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttontambahActionPerformed(evt);
            }
        });
        getContentPane().add(buttontambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 80, 80));

        buttonreset.setBackground(new java.awt.Color(0, 255, 204));
        buttonreset.setForeground(new java.awt.Color(0, 0, 0));
        buttonreset.setText("C");
        buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonresetActionPerformed(evt);
            }
        });
        getContentPane().add(buttonreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 80));

        buttonkali.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonkali.setText("x\n");
        buttonkali.setToolTipText("");
        buttonkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkaliActionPerformed(evt);
            }
        });
        getContentPane().add(buttonkali, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 80, 80));

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton17.setText(",");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 80, 80));

        buttonhasil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonhasil.setText("=");
        buttonhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhasilActionPerformed(evt);
            }
        });
        getContentPane().add(buttonhasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 80, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        angka += "1";
        textField1.setText(angka);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                angka += "5";
        textField1.setText(angka);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                angka += "3";
        textField1.setText(angka);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                angka += "7";
        textField1.setText(angka);// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void buttonkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkaliActionPerformed
 // TODO add your handling code here:
    bil1=Double.parseDouble(angka);
    textField1.setText("*");
    angka="";
    pilih=3;
    }//GEN-LAST:event_buttonkaliActionPerformed

    private void buttontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttontambahActionPerformed
 // TODO add your handling code here:
     bil1=Double.parseDouble(angka);
    textField1.setText("+");
    angka="";
    pilih=1;
    }//GEN-LAST:event_buttontambahActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void buttonbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbagiActionPerformed
        // TODO add your handling code here:
             bil1=Double.parseDouble(angka);
    textField1.setText("/");
    angka="";
    pilih=4;
    }//GEN-LAST:event_buttonbagiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        angka += "2";
        textField1.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonresetActionPerformed
        // TODO add your handling code here:
             textField1.setText(angka);
             bil1 = 0.0;
             bil2 = 0.0;
             jumlah = 0.0;
             angka="";
    }//GEN-LAST:event_buttonresetActionPerformed

    private void buttonkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkurangActionPerformed
        // TODO add your handling code here:
                     bil1=Double.parseDouble(angka);
    textField1.setText("-");
    angka="";
    pilih=2;
    }//GEN-LAST:event_buttonkurangActionPerformed

    private void buttonhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhasilActionPerformed
        // TODO add your handling code here:
 switch (pilih){
        case 1:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1 + bil2;
            angka = Double.toString(jumlah);
            textField1.setText(angka);
            break;
        case 2:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1 - bil2;
            angka = Double.toString(jumlah);
            textField1.setText(angka);
            break;
        case 3:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1 * bil2;
            angka = Double.toString(jumlah);
            textField1.setText(angka);
            break;
        case 4:
            bil2 = Double.parseDouble(angka);
            jumlah = bil1 / bil2;
            angka = Double.toString(jumlah);
            textField1.setText(angka);
            break;
    }
    }//GEN-LAST:event_buttonhasilActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                angka += "8";
        textField1.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                angka += "9";
        textField1.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                angka += "4";
        textField1.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                angka += "6";
        textField1.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
                angka += "0";
        textField1.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        angka += ".";
textField1.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

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
            java.util.logging.Logger.getLogger(new_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonbagi;
    private javax.swing.JButton buttonhasil;
    private javax.swing.JButton buttonkali;
    private javax.swing.JButton buttonkurang;
    private javax.swing.JButton buttonreset;
    private javax.swing.JButton buttontambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
