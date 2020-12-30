package com.myhome.temperatureservice;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.io.Serializable;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,
        property = "@id",
        scope = Temperature.class)
public class Temperature implements Serializable {

    private String celsius;
    private long currentTimeMillis;

    public Temperature(String celsius, long currentTimeMillis) {
        this.celsius = celsius;
        this.currentTimeMillis = currentTimeMillis;
    }

    public String getCelsius() {
        return celsius;
    }

    public long getCurrentTimeMillis() {
        return currentTimeMillis;
    }
}
