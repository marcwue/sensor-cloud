package com.myhome.sensorservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "temperature-service")
public interface TemperatureServiceProxy {

    @GetMapping(path = "/temperature/{date}")
    int getTemperature(@PathVariable("date") long date);

    @PutMapping(path = "/temperature/{celsius}")
    int putTemperature(@PathVariable("celsius") long date);

}
