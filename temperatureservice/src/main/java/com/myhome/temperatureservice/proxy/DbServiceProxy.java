package com.myhome.temperatureservice.proxy;

import com.myhome.temperatureservice.TemperatureViewModels;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient(name = "db-service")
public interface DbServiceProxy {

    @GetMapping(path = "/temperature")
    TemperatureViewModels getTemperature(@RequestParam LocalDate day);

}
