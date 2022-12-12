/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface.Feedback;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

/**
 * @author soumya
 */
public class SendMail {
    private static final String SMTP_HOST = "smtp.gmail.com";
    private static final int SMTP_TLS_PORT = 587;

    private static final String ADMIN_EMAIL = "abhilumos@gmail.com";
    private static final String ADMIN_PASSWORD = "ijeqyldpannssfbh";

    public void send(String messageContent, String senderEmail) {
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", String.valueOf(SMTP_TLS_PORT));
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(ADMIN_EMAIL, ADMIN_PASSWORD);
            }
        });

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");

            msg.setFrom(new InternetAddress(senderEmail,senderEmail));
            msg.setReplyTo(InternetAddress.parse(senderEmail, false));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(ADMIN_EMAIL));
            msg.setSubject("Application Feedback", "UTF-8");
            msg.setSentDate(new Date());
            msg.setText(messageContent, "UTF-8");

            Transport.send(msg, msg.getAllRecipients());
            System.out.println("EMail Sent Successfully!!");
        } catch (MessagingException | UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}
