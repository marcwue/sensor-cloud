package com.myhome.sensorservice;

import com.myhome.sensorservice.proxy.GetTemperatureProxyModel;
import com.myhome.sensorservice.proxy.PostTemperatureProxyModel;
import com.myhome.sensorservice.proxy.TemperatureServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class SensorServiceController {

    @Autowired
    private TemperatureServiceProxy temperatureServiceProxy;

    @PostMapping(path = "/temperatureForNow")
    public TemperatureViewModels postTemperature(@ModelAttribute TemperatureModel temperatureModel) {
        PostTemperatureProxyModel postTemperatureProxyModel = new PostTemperatureProxyModel(temperatureModel.getCelsius());

        return temperatureServiceProxy.postTemperature(postTemperatureProxyModel);
    }

    @GetMapping(path = "/temperature")
    public TemperatureViewModels getTemperature(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate day) {
        // GetTemperatureProxyModel getTemperatureProxyModel = new GetTemperatureProxyModel(day);
        System.out.println(day);
        return temperatureServiceProxy.getTemperature(day);
    }

}
