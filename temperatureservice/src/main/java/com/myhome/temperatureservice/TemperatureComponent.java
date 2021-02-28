package com.myhome.temperatureservice;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TemperatureComponent {

    @Value("${temperature.rabbitmq.topicExchange}")
    private String topicExchange;
    @Value("${temperature.rabbitmq.routingKey}")
    private String routingKey; // todo

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public TemperatureViewModel postTemperature(final TemperatureModel temperatureModel) {
        final Date currentDate = new Date();
        final TemperatureQueueModel json = new TemperatureQueueModel(temperatureModel.getCelsius(), currentDate);
        final String routingKey = "foo.bar." + currentDate;
        rabbitTemplate.convertAndSend(topicExchange, routingKey, json);
        return new TemperatureViewModel(temperatureModel.getCelsius(), currentDate);
    }

}
