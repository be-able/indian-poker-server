package com.beable.poker.logging.producer;

import com.beable.poker.logging.config.RabbitMQConfiguration;
import com.beable.poker.logging.consumer.SimpleMessageListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProducer {
    private final RabbitTemplate rabbitTemplate;
    private final SimpleMessageListener receiver;

    public SimpleMessageProducer(SimpleMessageListener receiver, RabbitTemplate rabbitTemplate) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(cron = "0 0/1 * * * *")
    public void sendMessage() {
        for (int i = 0; i < 1000; i++) {
            rabbitTemplate.convertAndSend(RabbitMQConfiguration.EXCHANGE_NAME, "foo.bar.baz", "Hello Message!");
        }
    }
}
