package com.myhome.dbservice.queue;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class TemperatureQueueModel implements Serializable {

    @JsonProperty("@id")
    public String id;
    @JsonProperty("celsius")
    public Double celsius;
    @JsonProperty("date")
    public Date date;

    public TemperatureQueueModel() {
    }

    public String getId() {
        return id;
    }

    public Double getCelsius() {
        return celsius;
    }

    public Date getDate() {
        return date;
    }

}
