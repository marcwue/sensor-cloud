package com.myhome.sensorservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "temperature-service")
public interface TemperatureServiceProxy {

    @GetMapping(path = "/temperature/{date}")
    int getTemperature(@PathVariable("date") long date);

}
