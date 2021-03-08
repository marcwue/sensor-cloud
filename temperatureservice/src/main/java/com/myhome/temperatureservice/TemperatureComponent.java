package com.myhome.temperatureservice;

import com.myhome.temperatureservice.proxy.DbServiceProxy;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class TemperatureComponent {

    @Value("${temperature.rabbitmq.topicExchange}")
    private String topicExchange;
    @Value("${temperature.rabbitmq.routingKey}")
    private String routingKey; // todo

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private DbServiceProxy dbServiceProxy;

    @Autowired
    public TemperatureComponent() {
        //dbServiceProxy = Feign.builder()
        //      .client(RibbonClient.create())
        //.encoder(new FormEncoder(new JacksonEncoder()))
        //    .target(DbServiceProxy.class, "http://db-service");
    }

    public TemperatureViewModels postTemperature(final TemperatureModel temperatureModel) {
        final Date currentDate = new Date();
        final TemperatureQueueModel json = new TemperatureQueueModel(temperatureModel.getCelsius(), currentDate);
        final String routingKey = "foo.bar." + currentDate;
        rabbitTemplate.convertAndSend(topicExchange, routingKey, json);

        TemperatureViewModel temperatureViewModel = new TemperatureViewModel(temperatureModel.getCelsius(), currentDate);
        List<TemperatureViewModel> temperatureViewModels = new ArrayList<>();
        temperatureViewModels.add(temperatureViewModel);
        TemperatureViewModels response = new TemperatureViewModels();
        response.setTemperatureViewModels(temperatureViewModels);
        return response;
    }

    public TemperatureViewModels getTemperature(LocalDate day) {
        System.out.println("temperatureService " + day);
        return dbServiceProxy.getTemperature(day);
    }
}
