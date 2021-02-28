package com.myhome.sensorservice.proxy;

import java.io.Serializable;

public class PostTemperatureProxyModel implements Serializable {

    private double celsius;

    public PostTemperatureProxyModel() {
    }

    public PostTemperatureProxyModel(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
