package com.myhome.temperatureservice;

import java.io.Serializable;
import java.util.Date;

public class TemperatureModel implements Serializable {

    private double celsius;
//    private final Date date;


    public TemperatureModel() {
    }

    public TemperatureModel(double celsius) {
        this.celsius = celsius;
    }

//    public TemperatureModel(double celsius, Date date) {
//        this.celsius = celsius;
//        this.date = date;
//    }

    public double getCelsius() {
        return celsius;
    }

//    public Date getDate() {
//        return date;
//    }

}
