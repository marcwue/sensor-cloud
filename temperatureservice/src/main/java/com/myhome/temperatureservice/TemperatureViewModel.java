package com.myhome.temperatureservice;

import java.io.Serializable;
import java.util.Date;

public class TemperatureViewModel implements Serializable {

    private final double celsius;
    private final Date date; // todo localdatetime

    public TemperatureViewModel(double celsius, Date date) {
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
