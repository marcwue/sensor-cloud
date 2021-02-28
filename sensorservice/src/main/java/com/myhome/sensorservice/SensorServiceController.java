package com.myhome.sensorservice;

import com.myhome.sensorservice.proxy.PostTemperatureProxyModel;
import com.myhome.sensorservice.proxy.TemperatureServiceProxy;
import feign.Feign;
import feign.form.FormEncoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SensorServiceController {

    @Autowired
    private TemperatureServiceProxy temperatureServiceProxy;

//    @Autowired
//    public SensorServiceController() {
//        temperatureServiceProxy = Feign.builder()
//                .encoder(new FormEncoder(new JacksonEncoder()))
//                .target(TemperatureServiceProxy.class, "http://temperature-service:8300"); // 8300
//    }

//    @GetMapping(path = "/temperatureForToday")
//    public int getTemperature() {
//        return temperatureServiceProxy.getTemperature(System.currentTimeMillis());
//    }

    @GetMapping(path = "/temperature/date")

    @PostMapping(path = "/temperatureForNow")
    public TemperatureViewModel postTemperature(@ModelAttribute TemperatureModel temperatureModel) {
        PostTemperatureProxyModel postTemperatureProxyModel = new PostTemperatureProxyModel(temperatureModel.getCelsius());

        TemperatureViewModel temperatureViewModel = temperatureServiceProxy.postTemperature(postTemperatureProxyModel);
        return temperatureViewModel;
    }

}
