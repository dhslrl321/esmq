package com.wonit.queue;

import com.wonit.message.Message;
import com.wonit.queue.value.QueueName;
import java.time.LocalDateTime;

public interface ZolaQueue {
    Message peek();
    Message pop();
    void push(Message message);
    int size();

    QueueName getName();

    LocalDateTime getCreatedAt();
}
