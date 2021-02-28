package com.myhome.dbservice;

import com.myhome.dbservice.queue.TemperatureQueueModel;
import com.myhome.dbservice.repository.CustomMongoRepository;
import com.myhome.dbservice.repository.Temperature;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @Autowired
    private CustomMongoRepository customMongoRepository;

    @RabbitListener(queues = "${temperature.rabbitmq.queue}")
    public void receiveMessage(final TemperatureQueueModel message){
        Temperature temperature = new Temperature(message.getCelsius(), message.getDate());
        customMongoRepository.save(temperature);
    }

}
