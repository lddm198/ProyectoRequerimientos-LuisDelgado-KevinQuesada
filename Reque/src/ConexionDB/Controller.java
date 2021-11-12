/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import reque.User;
import reque.Comentario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import reque.Publicacion;

/**
 *
 * @author kevin
 */
public class Controller {
    Connection con;

    public Controller(Connection con) {
        this.con = con;
    }
    
    public boolean InsertUser(String Name, int Tipo,String Contra,String Email) throws SQLException{
        String querystr = "insert into Usuario (IdTipoUsuario, Usuario, Contra, Email) values("+Tipo+",'"+Name+"',CONVERT(varbinary(255), '"+Contra+"'),'"+Email+"')";
        Statement query = con.createStatement();
        query.execute(querystr);
        
        return true;
    }
    
    public boolean InsertPubli(int Prof, String Titulo,String Dificultad,String Texto) throws SQLException{
        String querystr = "insert into Publicacion (IdProf, Titulo, Dificultad, Texto, Date) values("+Prof+",'"+Titulo+"','"+Dificultad+"','"+Texto+"',GETDATE())";
        Statement query = con.createStatement();
        query.execute(querystr);
        
        return true;
    }
    
    public boolean DeletePubli(int ID) throws SQLException{
        String querystr = "UPDATE Publicacion SET Enabled = 0 WHERE Id ="+ID;
        Statement query = con.createStatement();
        query.execute(querystr);
        
        return true;
    }
    
    public boolean EditPubli(int ID, String Titulo, String Texto) throws SQLException{
        String querystr = "UPDATE Publicacion SET Titulo = '"+Titulo+"', Texto = '"+Texto+"' WHERE Id ="+ID;
        Statement query = con.createStatement();
        query.execute(querystr);
        
        return true;
    }
    
    
    public User SelectUser (String Name, String Contra) throws SQLException{
        PreparedStatement s = con.prepareStatement("select Id, IdTipoUsuario, Usuario, Email from Usuario where Usuario='"+Name+"' and Contra= CONVERT(varbinary(255), '"+Contra+"')");
        ResultSet rs = s.executeQuery();
        User user = null;
        while (rs.next()) {
            int ID = rs.getInt (1);
            int IDT = rs.getInt(2);
            String Nombre = rs.getString (3);
            String Email = rs.getString (4);
            user = new User(IDT,Nombre,Email,ID); 
        }
        if(user == null){
            return null;
        }
        else{
            return user;
        }
    } 
    
    public ArrayList<Publicacion> SelectPubli (String Name, int limit) throws SQLException{
        PreparedStatement s = con.prepareStatement("SELECT TOP "+limit+" id,Titulo,Dificultad,Texto,Usuario,Date,Enabled from Publicaciones where Usuario = '"+Name+"' and Enabled = 1 order by Date desc");
        ResultSet rs = s.executeQuery();
        ArrayList<Publicacion> list = new ArrayList<Publicacion>();
        Publicacion publi = null;
        while (rs.next()) {
            int ID = rs.getInt (1);
            String Titulo = rs.getString(2);
            String Dificultad = rs.getString(3);
            String Texto = rs.getString(4);
            String Usuario = rs.getString(5);
            publi = new Publicacion(Titulo,Usuario,Texto,ID,Dificultad); 
            list.add(publi);
        }
        return list;
    }
    
}
