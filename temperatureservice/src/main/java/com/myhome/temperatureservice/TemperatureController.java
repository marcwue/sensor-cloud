package com.myhome.temperatureservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class TemperatureController {

    @Autowired
    private TemperatureComponent temperatureComponent;

    @PostMapping(path = "/temperature",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public TemperatureViewModels postTemperature(@RequestBody TemperatureModel temperatureModel) {
        return temperatureComponent.postTemperature(temperatureModel);
    }

    @GetMapping(path = "/temperature",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public TemperatureViewModels getTemperature(@RequestParam LocalDate day) {
        return temperatureComponent.getTemperature(day);
    }

}