/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reque;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author kevin
 */
public class Mailer {
    Properties propiedades;
    Session sesion;

    public Mailer() {
        this.propiedades = new Properties(); 
        this.propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
        this.propiedades.setProperty("mail.smtp.starttls.enable", "true");
        this.propiedades.setProperty("mail.smtp.port", "587");
        this.propiedades.setProperty("mail.smtp.auth", "true");
        
        this.sesion = Session.getDefaultInstance(this.propiedades);
    }
    
    public boolean send(String destino,String codigo) throws AddressException, MessagingException{
        String envia = "easychess.app@gmail.com";
        String contra = "Chess1907";
        String asunto = "Bienvenido a Easychess!";
        String mensaje = "Su contraseña provicional es la siguiente:"+codigo;
        
        MimeMessage mail = new MimeMessage(this.sesion);
        
        mail.setFrom(new InternetAddress(envia));
        mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
        mail.setSubject(asunto);
        mail.setText(mensaje);
        
        Transport transporte = sesion.getTransport ("smtp");
        transporte.connect(envia,contra);
        transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
        transporte.close();
                
        return true;
    }
}
