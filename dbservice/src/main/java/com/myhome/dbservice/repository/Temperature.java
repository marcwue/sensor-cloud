package com.myhome.dbservice.repository;

import org.springframework.data.annotation.Id;

public class Temperature {

    @Id
    public String id;

    public String celsius;

    public Temperature() {
    }

    public Temperature(String celsius) {
        this.celsius = celsius;
    }

    public Temperature(String id, String celsius) {
        this.id = id;
        this.celsius = celsius;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "id='" + id + '\'' +
                ", celsius='" + celsius + '\'' +
                '}';
    }
}
