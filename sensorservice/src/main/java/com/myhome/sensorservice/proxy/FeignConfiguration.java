package com.myhome.sensorservice.proxy;

import feign.codec.Encoder;
import feign.jackson.JacksonEncoder;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {

    @Bean
    public Encoder feignFormEncoder() {
        return new JacksonEncoder();
    }

}
