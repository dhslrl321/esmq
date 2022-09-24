package com.wonit.deliveryservice.messaging;

import com.github.dhslrl321.zsmq.annotation.ZolaConsumer;
import com.github.dhslrl321.zsmq.annotation.ZolaMessageListener;
import com.github.dhslrl321.zsmq.listener.DeletionPolicy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@ZolaConsumer
public class ConfirmedOrderCancelProcessor {
    @ZolaMessageListener(queueName = "CONFIRMED-CANCELED-QUEUE", deletionPolicy = DeletionPolicy.ALWAYS)
    public void listen(String message) {
        log.info("confirmed order => {}", message);
    }
}
