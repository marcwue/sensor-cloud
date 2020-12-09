package com.myhome.dbservice;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class TemperatureModel implements Serializable {

    @JsonProperty("@id")
    public int id;
    @JsonProperty("celsius")
    public String celsius;

    public TemperatureModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "id=" + id +
                ", celsius='" + celsius + '\'' +
                '}';
    }
}
