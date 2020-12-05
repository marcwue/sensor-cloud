package com.myhome.temperatureservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController{

    @GetMapping(path = "/temperature/{date}")
    public int getTemperature(@PathVariable("date") String date){
        return 42;
    }

}
