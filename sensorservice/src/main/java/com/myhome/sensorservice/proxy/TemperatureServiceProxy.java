package com.myhome.sensorservice.proxy;

import com.myhome.sensorservice.TemperatureViewModel;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "temperature-service",
        configuration = FeignConfiguration.class)
public interface TemperatureServiceProxy {

//    @RequestLine("GET /temperature/{date}")
//    @Headers("Content-Type: application/json")
//    int getTemperature(@PathVariable("date") long date);

//    @RequestLine("POST /temperature")
//    @Headers("Content-Type: multipart/form-data")
    @PostMapping(path = "/temperature",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    TemperatureViewModel postTemperature(@RequestBody PostTemperatureProxyModel postTemperatureProxyModel);

}
