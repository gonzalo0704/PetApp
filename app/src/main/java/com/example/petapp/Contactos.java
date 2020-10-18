package com.example.petapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Contactos extends AppCompatActivity {
    Button button;
    Session session;
    String correo;
    String clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);

        button = findViewById(R.id.envioCorreo);
        correo="appmail0099@gmail.com";
        clave="test0099";
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
                Properties properties= new Properties();
                properties.put("mail.smtp.host","smtp.googlemail.com");
                properties.put("mail.smtp.socketFactory.port","465");
                properties.put("mail.smtp.socketFactory.class","java.net.ssl.SSLSocketFactory");
                properties.put("mail.smtp.auth","true");
                properties.put("mail.smtp.port","465");

                try {
                    session= Session.getDefaultInstance(properties, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(correo,clave);
                        }
                    });
                    if (session != null){
                        Message message=new MimeMessage(session);
                        message.setFrom(new InternetAddress(correo));
                        message.setSubject("Hola app PETAGRAM");
                        message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("appmail0099@gmail.com"));
                        message.setContent("jajajajajajajjajjajajja hola jaaajajajaja 1234567890","text/html; charset=utf-8");
                        Transport.send(message);
                    }

                }catch (Exception e){
                    System.out.println(e);
                }

            }
        });

    }
}