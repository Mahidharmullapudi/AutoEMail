
package com.Email;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EmailInfo {
    
    public EmailInfo() {
    }
    
    public static void sendEmail(String to, String subject, String msg ){
        final String user="mahi.dhar@outlook.com";
        final String pass="Teja@1992";
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.live.com");
        //props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        
        Session session = Session.getInstance(props, new javax.mail.Authenticator (){
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(user, pass);
        }
    });
        try {  
               MimeMessage message = new MimeMessage(session);  
               message.setFrom(new InternetAddress(user));  
               message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
               message.setSubject(subject);  
               message.setText(msg);  
   
 //3rd step)send message  
               Transport.send(message);  
  
               System.out.println("Done");  
  
           
        } catch (MessagingException e) {     
    throw new RuntimeException(e);  
        }
 
    }

}  
    
