package com.myhome.dbservice.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Temperature {

    @Id
    public String id;

    public Double celsius;
    @Indexed
    public Date date;

    public Temperature() {
    }

    public Temperature(Double celsius, Date date) {
        this.celsius = celsius;
        this.date = date;
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

    @Override
    public String toString() {
        return "Temperature{" +
                "id='" + id + '\'' +
                ", celsius='" + celsius + '\'' +
                '}';
    }
}
