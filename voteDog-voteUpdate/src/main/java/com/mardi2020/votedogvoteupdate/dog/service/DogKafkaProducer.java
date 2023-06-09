package com.mardi2020.votedogvoteupdate.dog.service;

import com.mardi2020.votedogcommon.dog.message.DogParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DogKafkaProducer {

    private final KafkaTemplate<String, DogParam> kafkaTemplate;

    public void send(String topic, DogParam data) {
        kafkaTemplate.send(topic, data);
        log.info("Kafka produces message: " + data);
    }
}
