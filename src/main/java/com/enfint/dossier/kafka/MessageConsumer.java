package com.enfint.dossier.kafka;


import com.enfint.dossier.dto.EmailMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageConsumer {

    @KafkaListener(topics = "finish-registration", groupId = "email")
    public void consume(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        EmailMessage emailMessage = mapper.readValue(message, EmailMessage.class);
        log.info("Message received in dossier {}", message);

    }
}
