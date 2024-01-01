package com.deliveryApp.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaProducerConfig {

    @KafkaListener(topics = DeliveryAppUserConstants.TOPIC_NAME, groupId = DeliveryAppUserConstants.GROUP_ID)
    public void updatedLocation(String value){
        System.out.println("consumed: "+value);
    }
}
