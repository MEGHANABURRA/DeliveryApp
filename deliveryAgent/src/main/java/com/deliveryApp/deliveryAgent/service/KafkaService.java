package com.deliveryApp.deliveryAgent.service;

import com.deliveryApp.deliveryAgent.config.DeliveryAppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Logger log = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
        this.kafkaTemplate.send(DeliveryAppConstants.TOPIC_NAME, location);
        this.log.info("message produced");
        return true;
    }
}
