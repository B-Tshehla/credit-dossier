package com.enfint.dossier.service;

import com.enfint.dossier.dataEnum.Theme;
import com.enfint.dossier.dto.EmailMessage;
import com.enfint.dossier.email.CustomEmailMessages;
import com.enfint.dossier.email.EmailSender;
import com.enfint.dossier.fiegnClient.DealClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DossierService {

    private final EmailSender emailSender;
    private final CustomEmailMessages customEmailMessages;


    public void sendEmailMessage(EmailMessage emailMessage){

        String subject = getSubjectByTheme(emailMessage.getTheme());
        emailSender.send(emailMessage.getAddress(), customEmailMessages.sendCustomMessage(emailMessage,subject),subject);
    }

    private String getSubjectByTheme(Theme theme){
        String subject = "";
        if(theme == Theme.FINISH_REGISTRATION) {
            subject = "Finish Registration";
        }
        if (theme == Theme.CREATE_DOCUMENTS){
            subject = "Create Documents";
        }
        if(theme == Theme.APPLICATION_DENIED){
            subject = "Application Denied";
        }
        if(theme == Theme.SEND_DOCUMENTS){
            subject = "Send Documents";
        }
        if (theme == Theme.SEND_SES){
            subject = "Send SES-Code";
        }
        if (theme == Theme.CREDIT_ISSUED){
            subject = "Credit Issued";
        }
        return subject;
    }
}
