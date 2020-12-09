package com.myhome.dbservice;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @RabbitListener(queues = "${temperature.rabbitmq.queue}")
    public void receiveMessage(final Temperature message){
        System.out.println("Received (" + message.toString() + ")");
    }

}
