package com.enfint.dossier.email;

public interface EmailSender {
    void send(String to, String email,String subject);

}
