/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tes_ujikom_new;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author najwan R
 */
public class koneksi {
    Connection conn;
    Statement st;
    ResultSet rs;
    
    public Connection SetKoneksi()
    {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
       
        conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/toko_db","root","");
        
        st = conn.createStatement();
        return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal: " +e );
        }
        return null;
    }
}
