/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form_registrasi;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author najwan R
 */
public class koneksi {
    Connection conn;
    
    public static Connection Bukakoneksi() {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
//                DriverManager.registerDriver();
                
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db_lsp","root", "");
                
                return conn;
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
