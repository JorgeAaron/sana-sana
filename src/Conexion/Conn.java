/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge
 */
public class Conn {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    
    public  Connection conexion() {
        conn = null;
        try {
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url,user, password);
            if(conn != null ) {
                System.out.println("Conexion establecida..");
            }
        } catch (ClassNotFoundException  | SQLException e) {
            System.out.println("error al conectar" + e);
            
        }
        return conn;
    } 
    
    
    Statement CreateStatement() {
        throw new UnsupportedOperationException("No soportado.");
        
    }
    //Este metodo nos retorna la conexion.
    public Connection getConnection() {
        return conn;
    }
    
    //Con este metodo nos desconectamos de la bd 
    public void desconectar() {
        conn = null;
        if(conn== null) {
            System.out.println("Conexion terminada..");
        }
    }
    
}
