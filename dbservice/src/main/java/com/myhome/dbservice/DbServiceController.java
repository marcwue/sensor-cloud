package com.myhome.dbservice;

import com.myhome.dbservice.repository.CustomMongoRepository;
import com.myhome.dbservice.repository.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DbServiceController {

    @Autowired
    private CustomMongoRepository customMongoRepository;

    @GetMapping(path = "/temperature")
    public TemperatureViewModels getTemperature(@RequestParam LocalDate day) {
        Date startOfDay = Date.from(day.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Date endOfDay = Date.from(day.atTime(LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant());
        List<Temperature> byDateBetween = customMongoRepository.findByDateBetween(startOfDay, endOfDay);
        List<TemperatureViewModel> collect = byDateBetween.stream()
                .map((temperature) -> new TemperatureViewModel(temperature.getCelsius(), temperature.getDate()))
                .collect(Collectors.toList());
        TemperatureViewModels response = new TemperatureViewModels();
        response.setTemperatureViewModels(collect);
        return response;
    }

}
