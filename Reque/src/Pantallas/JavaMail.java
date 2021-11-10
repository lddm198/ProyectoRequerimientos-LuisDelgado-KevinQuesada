/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Usuario
 */
public class JavaMail {
    
    public static void enviarMail(String destinatario) {
        
        System.out.println("Preparando Correo!");
        
        Properties properties = new Properties();
        
        properties.put("mail smtp auth", "true");
        properties.put("mail smtp starttls enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "luisdidelgado7@gmail.com";
        String password = "Guitarra198";
        
        Session session = Session.getDefaultInstance(properties);
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            message.setSubject("Bienvenido a EasyChess");
            message.setText("Hola " + destinatario + "! \n Bienvenido a EasyChess :)");  
            
            Transport transporte = session.getTransport("smtp");
            transporte.connect(myAccountEmail, password);
            transporte.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            transporte.close();
            System.out.println("Correo enviado!");
            
        } catch (AddressException ex) {
            Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
}
