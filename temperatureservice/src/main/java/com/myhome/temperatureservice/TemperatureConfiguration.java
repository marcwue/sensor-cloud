package com.myhome.temperatureservice;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TemperatureConfiguration {

    public static final String SAMPLE_TEMPERATURE = "sample.temperature";

    @Bean
    public Queue temperature() {
        return new Queue(SAMPLE_TEMPERATURE);
    }

    @Bean
    public TemperatureSender sender() {
        return new TemperatureSender();
    }

}
