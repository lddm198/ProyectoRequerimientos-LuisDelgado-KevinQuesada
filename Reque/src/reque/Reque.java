/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reque;
import ConexionDB.*;
import Pantallas.Inicio;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
/**
 *
 * @author kevin
 */
public class Reque {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
//        Mailer mail = new Mailer();
//        try {
//            mail.send("kevin2002.qj@gmail.com","1234");
        Connection con = Conexion.connect();
        Controller control = new Controller(con);
        try{
            Inicio pantalla = new Inicio(control);
            pantalla.setVisible(true); 
        }
        catch(Exception e){
            
        }
//        } catch (MessagingException ex) {
//            Logger.getLogger(Reque.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
