package com.myhome.temperatureservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TemperatureController {

    @Autowired
    private TemperatureComponent temperatureComponent;

    @GetMapping(path = "/temperature/{date}")
    public int getTemperature(@PathVariable("date") String date) {
        return 42;
    }

    @PutMapping(path = "/temperature/{temperature}")
    public void putTemperature(@PathVariable("temperature") String temperature) {
        temperatureComponent.putTemperature(temperature);
    }

}
