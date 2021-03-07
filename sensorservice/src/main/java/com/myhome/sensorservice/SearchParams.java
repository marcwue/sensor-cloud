package com.myhome.sensorservice;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class SearchParams implements Serializable {

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate day;

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }
}
