package com.virtusa.kafkaservice.controller;

import com.virtusa.kafkaservice.model.request.MessageReq;
import com.virtusa.kafkaservice.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class ProducerController {

    ProducerService producerService;

    @Autowired
    public void setProducerService(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/producer/message")
    public void getMessage(@RequestBody MessageReq messageReq) {
        producerService.sendMessageToTopic(messageReq.getMessage());
    }
}
