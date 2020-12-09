package com.myhome.temperatureservice;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TemperatureComponent {

    @Value("${temperature.rabbitmq.topicExchange}")
    String topicExchange;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void putTemperature(final String temperature) {
        final Temperature json = new Temperature(temperature);
        final String routingKey = "foo.bar." + System.currentTimeMillis();
        rabbitTemplate.convertAndSend(topicExchange, routingKey, json);
    }

}
