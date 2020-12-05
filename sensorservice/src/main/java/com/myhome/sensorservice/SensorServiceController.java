package com.myhome.sensorservice;

import com.myhome.sensorservice.proxy.TemperatureServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorServiceController {

    @Autowired
    private TemperatureServiceProxy temperatureServiceProxy;

    @GetMapping(path = "/getTemperatureForToday")
    public int getTemperature() {
        return temperatureServiceProxy.getTemperature(System.currentTimeMillis());
    }

}
