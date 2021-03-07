package com.myhome.temperatureservice;

import java.io.Serializable;

public class TemperatureModel implements Serializable {

    private double celsius;

    public TemperatureModel() {
    }

    public TemperatureModel(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

}
