package com.myhome.sensorservice;

import java.io.Serializable;

public class TemperatureModel implements Serializable {

    private final double celsius;

    public TemperatureModel(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

}
