package com.perpus.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection(){
        if (conn==null) {
            try {
//                String url = "jdbc:mysql://localhost:3307/db_perpustakaan_new";
//                String user = "root";
//                String pass = "";
                String url = "jdbc:mysql://58a.h.filess.io:3307/Perpustakaan_momentmost";
                String user = "Perpustakaan_momentmost";
                String pass = "848c76fed825baf815ffbaa0d501fda79b3be639";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection) DriverManager.getConnection(url,user,pass);
            } catch (SQLException e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null, e);
            }
        }
        return conn;
    }
}
