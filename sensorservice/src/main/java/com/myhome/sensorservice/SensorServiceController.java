package com.myhome.sensorservice;

import com.myhome.sensorservice.proxy.TempServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class SensorServiceController {

    @Autowired
    private TempServiceProxy tempServiceProxy;

    @GetMapping(path = "/getTemperatureForToday")
    public int getTemperature() {
        return tempServiceProxy.getTemperature(System.currentTimeMillis());
    }

}
