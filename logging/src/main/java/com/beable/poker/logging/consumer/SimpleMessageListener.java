package com.beable.poker.logging.consumer;

import com.beable.poker.logging.config.RabbitMQConfiguration;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SimpleMessageListener {
    @RabbitListener(queues = RabbitMQConfiguration.QUEUE_NAME)
    public void receiveMessage(final Message message) {
        System.out.println(message);
    }
}
