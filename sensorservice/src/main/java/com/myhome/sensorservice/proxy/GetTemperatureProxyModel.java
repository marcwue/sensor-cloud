package com.myhome.sensorservice.proxy;

import java.io.Serializable;
import java.time.LocalDate;

public class GetTemperatureProxyModel implements Serializable {

    private final LocalDate day;

    public GetTemperatureProxyModel(LocalDate day) {
        this.day = day;
    }

    public LocalDate getDay() {
        return day;
    }
}
