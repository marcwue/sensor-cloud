package com.myhome.temperatureservice;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TemperatureComponent {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void putTemperature(final String temperature){
        final String json = "{\"temp\" : \"" + temperature + "\" }";
        final Message jsonMessage = MessageBuilder.withBody(temperature.getBytes())
                .andProperties(MessagePropertiesBuilder.newInstance()
                        .setContentType("application/json")
                        .build()
                ).build();

        rabbitTemplate.send(TemperatureConfiguration.SAMPLE_TEMPERATURE, jsonMessage);
    }

}
