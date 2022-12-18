package com.virtusa.kafkaservice.service.impl;

import com.virtusa.kafkaservice.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "key_topic", groupId = "key_group")
    public void listenToTopic(String receiveMessage){
        logger.info(Constant.TWO_VALUES,"KEY_TOPIC_MESSAGE_FROM_CLIENT", receiveMessage);
    }
}
