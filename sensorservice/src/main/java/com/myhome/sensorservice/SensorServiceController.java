package com.myhome.sensorservice;

import com.myhome.sensorservice.proxy.TemperatureServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorServiceController {

    @Autowired
    private TemperatureServiceProxy temperatureServiceProxy;

    @GetMapping(path = "/temperatureForToday")
    public int getTemperature() {
        return temperatureServiceProxy.getTemperature(System.currentTimeMillis());
    }

    @PutMapping(path = "/temperatureForNow/{celsius}")
    public void putTemperature(@PathVariable("celsius") long celsius) {
        temperatureServiceProxy.putTemperature(celsius);
    }

}
