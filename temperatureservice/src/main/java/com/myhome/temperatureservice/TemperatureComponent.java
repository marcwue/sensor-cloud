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
        final long currentTimeMillis = System.currentTimeMillis();
        final Temperature json = new Temperature(temperature, currentTimeMillis);
        final String routingKey = "foo.bar." + currentTimeMillis;
        rabbitTemplate.convertAndSend(topicExchange, routingKey, json);
    }

}
