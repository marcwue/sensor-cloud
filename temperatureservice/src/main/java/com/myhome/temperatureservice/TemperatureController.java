package com.myhome.temperatureservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class TemperatureController {

    @Autowired
    private TemperatureComponent temperatureComponent;

    @GetMapping(path = "/temperature/{date}")
    public int getTemperature(@PathVariable("date") String date) {
        return 42;
    }

    @PostMapping(path = "/temperature",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public TemperatureViewModel postTemperature(@RequestBody TemperatureModel temperatureModel) {
        return temperatureComponent.postTemperature(temperatureModel);
    }

}