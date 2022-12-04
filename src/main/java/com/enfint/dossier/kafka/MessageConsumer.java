package com.enfint.dossier.kafka;


import com.enfint.dossier.dto.EmailMessage;
import com.enfint.dossier.email.CustomEmailMessages;
import com.enfint.dossier.email.EmailSender;
import com.enfint.dossier.service.DossierService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageConsumer {
    private final DossierService dossierService;
    @KafkaListener(topics = "finish-registration", groupId = "email")
    public void consumeFinishRegistration(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        EmailMessage emailMessage = mapper.readValue(message, EmailMessage.class);
        log.info("Message received in dossier {}", message);
        log.info("Mapped message object {} ", emailMessage);
        dossierService.sendEmailMessage(emailMessage);
    }

    @KafkaListener(topics = "create-documents", groupId = "email")
    public void consumeCreateDocuments(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        EmailMessage emailMessage = mapper.readValue(message, EmailMessage.class);
        log.info("Message received in dossier {}", message);
        log.info("Mapped message object {} ", emailMessage);
        dossierService.sendEmailMessage(emailMessage);
    }
    @KafkaListener(topics = "application-denied", groupId = "email")
    public void consumeApplicationDenied(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        EmailMessage emailMessage = mapper.readValue(message, EmailMessage.class);
        log.info("Message received in dossier {}", message);
        log.info("Mapped message object {} ", emailMessage);
        dossierService.sendEmailMessage(emailMessage);
    }
    @KafkaListener(topics = "send-documents", groupId = "email")
    public void consumeSendDocuments(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        EmailMessage emailMessage = mapper.readValue(message, EmailMessage.class);
        log.info("Message received in dossier {}", message);
        log.info("Mapped message object {} ", emailMessage);
        dossierService.sendEmailMessage(emailMessage);
    }
    @KafkaListener(topics = "sign-documents", groupId = "email")
    public void consumeSignDocuments(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        EmailMessage emailMessage = mapper.readValue(message, EmailMessage.class);
        log.info("Message received in dossier {}", message);
        log.info("Mapped message object {} ", emailMessage);
        dossierService.sendEmailMessage(emailMessage);
    }
    @KafkaListener(topics = "credit-issued", groupId = "email")
    public void consumeCreditIssued(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        EmailMessage emailMessage = mapper.readValue(message, EmailMessage.class);
        log.info("Message received in dossier {}", message);
        log.info("Mapped message object {} ", emailMessage);
        dossierService.sendEmailMessage(emailMessage);
    }

}
