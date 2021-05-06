package com.myhome.sensorservice.proxy;

import com.myhome.sensorservice.TemperatureViewModels;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient(name = "temperature-service",
        configuration = FeignConfiguration.class)
public interface TemperatureServiceProxy {

    @PostMapping(path = "/temperature",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    TemperatureViewModels postTemperature(@RequestBody PostTemperatureProxyModel postTemperatureProxyModel);

    @GetMapping(path = "/temperature",
            produces = MediaType.APPLICATION_JSON_VALUE)
    TemperatureViewModels getTemperature(@RequestParam
                                         @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate day);

}
