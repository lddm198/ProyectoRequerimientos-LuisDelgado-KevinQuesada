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
import reque.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    public boolean ValidatePassword(String pass){
        String validations = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        Pattern pattern = Pattern.compile(validations);
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }
    
    public boolean ValidateEmail(String mail){
        String validations = "^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@" 
        + "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(validations);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
    
    public User SelectUser (String Name, String Contra) throws SQLException{
        PreparedStatement s = con.prepareStatement("select IdTipoUsuario, Usuario, Email from Usuario where Usuario='"+Name+"' and Contra= CONVERT(varbinary(255), '"+Contra+"')");
        ResultSet rs = s.executeQuery();
        User user = null;
        while (rs.next()) {
            int ID = rs.getInt (1);
            String Nombre = rs.getString (2);
            String Email = rs.getString (3);
            user = new User(ID,Nombre,Email); 
        }
        if(user == null){
            return null;
        }
        else{
            return user;
        }
    } 
}
