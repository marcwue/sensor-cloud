package com.myhome.temperatureservice;

import java.io.Serializable;
import java.util.Date;

public class TemperatureQueueModel implements Serializable {

    private final double celsius;
    private final Date date;

    public TemperatureQueueModel(double celsius, Date date) {
        this.celsius = celsius;
        this.date = date;
    }

    public double getCelsius() {
        return celsius;
    }

    public Date getDate() {
        return date;
    }

}
