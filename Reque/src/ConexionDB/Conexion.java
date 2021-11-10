/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

/**
 *
 * @author kevin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class Conexion {
    
    public static Connection connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://LAPTOP-O7NC02DG\\SQLP2:1433;databaseName=RequeProto;user=usuarioApp;password=12345678;";
        Connection con = DriverManager.getConnection(connectionURL);
        return con;
    }
    
}
